package typingsJapgolly.senchaTouch.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFieldSet extends IContainer {
  /** [Method] A convenient method to disable all fields in this FieldSet
  		* @param newDisabled Object
  		* @returns Ext.form.FieldSet This FieldSet
  		*/
  var doSetDisabled: js.UndefOr[js.Function1[/* newDisabled */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Config Option] (String) */
  var instructions: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of instructions
  		* @param instructions String The new value.
  		*/
  var setInstructions: js.UndefOr[js.Function1[/* instructions */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of title
  		* @param title String The new value.
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
}

object IFieldSet {
  @scala.inline
  def apply(
    IContainer: IContainer = null,
    doSetDisabled: /* newDisabled */ js.UndefOr[js.Any] => CallbackTo[IFieldSet] = null,
    instructions: String = null,
    setInstructions: /* instructions */ js.UndefOr[String] => Callback = null,
    setTitle: /* title */ js.UndefOr[String] => Callback = null,
    title: String = null
  ): IFieldSet = {
    val __obj = js.Dynamic.literal()
    if (IContainer != null) js.Dynamic.global.Object.assign(__obj, IContainer)
    if (doSetDisabled != null) __obj.updateDynamic("doSetDisabled")(js.Any.fromFunction1((t0: /* newDisabled */ js.UndefOr[js.Any]) => doSetDisabled(t0).runNow()))
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (setInstructions != null) __obj.updateDynamic("setInstructions")(js.Any.fromFunction1((t0: /* instructions */ js.UndefOr[java.lang.String]) => setInstructions(t0).runNow()))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => setTitle(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldSet]
  }
}

