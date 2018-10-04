import org.jetbrains.exposed.sql.Table

object Library: Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val song = varchar("song", length = 50)
    val artistName = varchar("artistName", length = 50)
}