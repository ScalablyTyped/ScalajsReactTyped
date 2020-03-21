package typingsJapgolly.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Controls {
  /**
    * Control type for formContext.ui.quickForms.getControlType().
    */
  type ControlQuickFormType = typingsJapgolly.xrm.xrmStrings.quickform
  /**
    * Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
    * @see {@link XrmEnum.StandardControlType}
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xrm.xrmStrings.standard
    - typingsJapgolly.xrm.xrmStrings.iframe
    - typingsJapgolly.xrm.xrmStrings.lookup
    - typingsJapgolly.xrm.xrmStrings.optionset
    - typingsJapgolly.xrm.xrmStrings.subgrid
    - typingsJapgolly.xrm.xrmStrings.webresource
    - typingsJapgolly.xrm.xrmStrings.notes
    - typingsJapgolly.xrm.xrmStrings.timercontrol
    - typingsJapgolly.xrm.xrmStrings.kbsearch
    - typingsJapgolly.xrm.xrmStrings.timelinewall
    - typingsJapgolly.xrm.Xrm.Controls.ControlQuickFormType
  */
  type ControlType = typingsJapgolly.xrm.Xrm.Controls._ControlType | typingsJapgolly.xrm.Xrm.Controls.ControlQuickFormType
  type Grid = typingsJapgolly.xrm.Xrm.Controls.Grid_
}
