package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.iframe
import typingsJapgolly.xrm.xrmStrings.kbsearch
import typingsJapgolly.xrm.xrmStrings.lookup
import typingsJapgolly.xrm.xrmStrings.multiselectoptionset
import typingsJapgolly.xrm.xrmStrings.notes
import typingsJapgolly.xrm.xrmStrings.optionset
import typingsJapgolly.xrm.xrmStrings.quickform
import typingsJapgolly.xrm.xrmStrings.standard
import typingsJapgolly.xrm.xrmStrings.subgrid
import typingsJapgolly.xrm.xrmStrings.timelinewall
import typingsJapgolly.xrm.xrmStrings.timercontrol
import typingsJapgolly.xrm.xrmStrings.webresource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
  * @see {@link Xrm.Controls.ControlType}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.standard
  - typingsJapgolly.xrm.xrmStrings.iframe
  - typingsJapgolly.xrm.xrmStrings.lookup
  - typingsJapgolly.xrm.xrmStrings.optionset
  - typingsJapgolly.xrm.xrmStrings.multiselectoptionset
  - typingsJapgolly.xrm.xrmStrings.subgrid
  - typingsJapgolly.xrm.xrmStrings.webresource
  - typingsJapgolly.xrm.xrmStrings.notes
  - typingsJapgolly.xrm.xrmStrings.timercontrol
  - typingsJapgolly.xrm.xrmStrings.kbsearch
  - typingsJapgolly.xrm.xrmStrings.timelinewall
  - typingsJapgolly.xrm.xrmStrings.quickform
*/
trait StandardControlType extends js.Object

object StandardControlType {
  @scala.inline
  def IFrame: iframe = this.cast("iframe")
  @scala.inline
  def KBSearch: kbsearch = this.cast("kbsearch")
  @scala.inline
  def Lookup: lookup = this.cast("lookup")
  @scala.inline
  def MultiSelectOptionSet: multiselectoptionset = this.cast("multiselectoptionset")
  @scala.inline
  def Notes: notes = this.cast("notes")
  @scala.inline
  def OptionSet: optionset = this.cast("optionset")
  @scala.inline
  def QuickForm: quickform = this.cast("quickform")
  @scala.inline
  def Standard: standard = this.cast("standard")
  @scala.inline
  def SubGrid: subgrid = this.cast("subgrid")
  @scala.inline
  def TimeLineWall: timelinewall = this.cast("timelinewall")
  @scala.inline
  def TimerControl: timercontrol = this.cast("timercontrol")
  @scala.inline
  def WebResource: webresource = this.cast("webresource")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

