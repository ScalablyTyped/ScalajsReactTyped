package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.collapsed
import typingsJapgolly.xrm.xrmStrings.expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Display States for setDisplayState() on {@link Controls.ProcessControl.setDisplayState Processes} and {@link Controls.Tab.setDisplayState Tabs}.
  * @see {@link Xrm.DisplayState}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.expanded
  - typingsJapgolly.xrm.xrmStrings.collapsed
*/
trait DisplayState extends js.Object

object DisplayState {
  @scala.inline
  def Collapsed: collapsed = this.cast("collapsed")
  @scala.inline
  def Expanded: expanded = this.cast("expanded")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

