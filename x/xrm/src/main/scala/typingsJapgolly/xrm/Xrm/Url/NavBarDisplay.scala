package typingsJapgolly.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Navigation Bar Display options for Xrm.Url.FormOpenParameters.navbar, Xrm.Url.ViewOpenParameters.navbar, and Xrm.Utility.FormOpenParameters.navbar.
  * @see {@link XrmEnum.NavBarDisplay}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.entity
  - typingsJapgolly.xrm.xrmStrings.off
  - typingsJapgolly.xrm.xrmStrings.on
*/
trait NavBarDisplay extends js.Object

object NavBarDisplay {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entity: typingsJapgolly.xrm.xrmStrings.entity = this.cast("entity")
  @scala.inline
  def off: typingsJapgolly.xrm.xrmStrings.off = this.cast("off")
  @scala.inline
  def on: typingsJapgolly.xrm.xrmStrings.on = this.cast("on")
}

