package typingsJapgolly.dojo.dijit.Dialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dijit.WidgetBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/Dialog._DialogLevelManager.html
  *
  * Controls the various active "levels" on the page, starting with the
  * stuff initially visible on the page (at z-index 0), and then having an entry for
  * each Dialog shown.
  * 
  */
trait DialogLevelManager extends js.Object {
  /**
    * Called when the specified dialog is hidden/destroyed, after the fade-out
    * animation ends, in order to reset page focus, fix the underlay, etc.
    * If the specified dialog isn't open then does nothing.
    * 
    * Caller is responsible for either setting display:none on the dialog domNode,
    * or calling dijit/popup.hide(), or removing it from the page DOM.
    * 
    * @param dialog             
    */
  def hide(dialog: WidgetBase): Unit
  /**
    * Returns true if specified Dialog is the top in the task
    * 
    * @param dialog             
    */
  def isTop(dialog: WidgetBase): Boolean
  /**
    * Call right before fade-in animation for new dialog.
    * Saves current focus, displays/adjusts underlay for new dialog,
    * and sets the z-index of the dialog itself.
    * 
    * New dialog will be displayed on top of all currently displayed dialogs.
    * 
    * Caller is responsible for setting focus in new dialog after the fade-in
    * animation completes.
    * 
    * @param dialog             
    * @param underlayAttrs             
    */
  def show(dialog: WidgetBase, underlayAttrs: js.Object): Unit
}

object DialogLevelManager {
  @scala.inline
  def apply(
    hide: WidgetBase => Callback,
    isTop: WidgetBase => CallbackTo[Boolean],
    show: (WidgetBase, js.Object) => Callback
  ): DialogLevelManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dijit.WidgetBase) => hide(t0).runNow()))
    __obj.updateDynamic("isTop")(js.Any.fromFunction1((t0: typingsJapgolly.dojo.dijit.WidgetBase) => isTop(t0).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: typingsJapgolly.dojo.dijit.WidgetBase, t1: js.Object) => show(t0, t1).runNow()))
    __obj.asInstanceOf[DialogLevelManager]
  }
}

