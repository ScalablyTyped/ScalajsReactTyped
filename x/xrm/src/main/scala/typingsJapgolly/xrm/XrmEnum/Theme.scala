package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Themes for {@link GlobalContext.getCurrentTheme globalContext.getCurrentTheme()}.
  * @remarks getCurrentTheme() does not work with Dynamics CRM for tablets or in the unified interface.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.default
  - typingsJapgolly.xrm.xrmStrings.Office12Blue
  - typingsJapgolly.xrm.xrmStrings.Office14Silver
*/
trait Theme extends js.Object

object Theme {
  @scala.inline
  def Default: default = this.cast("default")
  @scala.inline
  def Office12Blue: typingsJapgolly.xrm.xrmStrings.Office12Blue = this.cast("Office12Blue")
  @scala.inline
  def Office14Silver: typingsJapgolly.xrm.xrmStrings.Office14Silver = this.cast("Office14Silver")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

