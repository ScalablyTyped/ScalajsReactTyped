package typingsJapgolly.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sequelize.sequelizeStrings.UNIQUE
  - typingsJapgolly.sequelize.sequelizeStrings.FULLTEXT
  - typingsJapgolly.sequelize.sequelizeStrings.SPATIAL
*/
trait IndexType extends js.Object

object IndexType {
  @scala.inline
  def FULLTEXT: typingsJapgolly.sequelize.sequelizeStrings.FULLTEXT = this.cast("FULLTEXT")
  @scala.inline
  def SPATIAL: typingsJapgolly.sequelize.sequelizeStrings.SPATIAL = this.cast("SPATIAL")
  @scala.inline
  def UNIQUE: typingsJapgolly.sequelize.sequelizeStrings.UNIQUE = this.cast("UNIQUE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

