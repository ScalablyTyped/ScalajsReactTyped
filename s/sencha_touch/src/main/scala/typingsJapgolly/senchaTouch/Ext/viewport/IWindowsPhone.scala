package typingsJapgolly.senchaTouch.Ext.viewport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowsPhone extends IDefault {
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IWindowsPhone {
  @scala.inline
  def apply(
    IDefault: IDefault = null,
    getTranslatable: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    setTranslatable: /* translatable */ js.UndefOr[js.Any] => Callback = null
  ): IWindowsPhone = {
    val __obj = js.Dynamic.literal()
    if (IDefault != null) js.Dynamic.global.Object.assign(__obj, IDefault)
    getTranslatable.foreach(p => __obj.updateDynamic("getTranslatable")(p.toJsFn))
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[js.Any]) => setTranslatable(t0).runNow()))
    __obj.asInstanceOf[IWindowsPhone]
  }
}

