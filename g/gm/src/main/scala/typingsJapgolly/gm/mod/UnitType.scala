package typingsJapgolly.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.gm.gmStrings.Undefined
  - typingsJapgolly.gm.gmStrings.PixelsPerInch
  - typingsJapgolly.gm.gmStrings.PixelsPerCentimeter
*/
trait UnitType extends js.Object

object UnitType {
  @scala.inline
  def PixelsPerCentimeter: typingsJapgolly.gm.gmStrings.PixelsPerCentimeter = this.cast("PixelsPerCentimeter")
  @scala.inline
  def PixelsPerInch: typingsJapgolly.gm.gmStrings.PixelsPerInch = this.cast("PixelsPerInch")
  @scala.inline
  def Undefined: typingsJapgolly.gm.gmStrings.Undefined = this.cast("Undefined")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

