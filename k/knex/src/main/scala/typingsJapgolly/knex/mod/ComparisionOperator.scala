package typingsJapgolly.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.knex.knexStrings.Equalssign
  - typingsJapgolly.knex.knexStrings.Greaterthansign
  - typingsJapgolly.knex.knexStrings.GreaterthansignEqualssign
  - typingsJapgolly.knex.knexStrings.Lessthansign
  - typingsJapgolly.knex.knexStrings.LessthansignEqualssign
  - typingsJapgolly.knex.knexStrings.LessthansignGreaterthansign
*/
trait ComparisionOperator extends js.Object

object ComparisionOperator {
  @scala.inline
  def Equalssign: typingsJapgolly.knex.knexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.knex.knexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.knex.knexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.knex.knexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.knex.knexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typingsJapgolly.knex.knexStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

