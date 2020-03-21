package typingsJapgolly.durandal.dialogMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.durandal.compositionMod.CompositionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContext extends js.Object {
  /**
    * Opacity of the blockout. The default is 0.6.
    */
  var blockoutOpacity: js.UndefOr[Double] = js.undefined
  /**
    * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
    * @param {Dialog} theDialog The dialog model.
    */
  def addHost(theDialog: Dialog): Unit
  /**
    * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
    * @param {DOMElement} child The dialog view.
    * @param {DOMElement} parent The parent view.
    * @param {object} context The composition context.
    */
  def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit
  /**
    * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
    * @param {Dialog} theDialog The dialog model.
    */
  def removeHost(theDialog: Dialog): Unit
}

object DialogContext {
  @scala.inline
  def apply(
    addHost: Dialog => Callback,
    compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Callback,
    removeHost: Dialog => Callback,
    blockoutOpacity: Int | Double = null
  ): DialogContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addHost")(js.Any.fromFunction1((t0: typingsJapgolly.durandal.dialogMod.Dialog) => addHost(t0).runNow()))
    __obj.updateDynamic("compositionComplete")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.HTMLElement, t1: org.scalajs.dom.raw.HTMLElement, t2: typingsJapgolly.durandal.compositionMod.CompositionContext) => compositionComplete(t0, t1, t2).runNow()))
    __obj.updateDynamic("removeHost")(js.Any.fromFunction1((t0: typingsJapgolly.durandal.dialogMod.Dialog) => removeHost(t0).runNow()))
    if (blockoutOpacity != null) __obj.updateDynamic("blockoutOpacity")(blockoutOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogContext]
  }
}

