package typingsJapgolly.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cassanknex.cassanknexStrings.Equalssign
  - typingsJapgolly.cassanknex.cassanknexStrings.Lessthansign
  - typingsJapgolly.cassanknex.cassanknexStrings.Greaterthansign
  - typingsJapgolly.cassanknex.cassanknexStrings.LessthansignEqualssign
  - typingsJapgolly.cassanknex.cassanknexStrings.GreaterthansignEqualssign
*/
trait ComparisonRestriction extends js.Object

object ComparisonRestriction {
  @scala.inline
  def Equalssign: typingsJapgolly.cassanknex.cassanknexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typingsJapgolly.cassanknex.cassanknexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typingsJapgolly.cassanknex.cassanknexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typingsJapgolly.cassanknex.cassanknexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typingsJapgolly.cassanknex.cassanknexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

