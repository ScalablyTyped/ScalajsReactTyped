package typingsJapgolly.reactReduxToastr.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactReduxToastr.AnonCancelText
import typingsJapgolly.reactReduxToastr.mod.ReduxToastrProps
import typingsJapgolly.reactReduxToastr.mod.ToastrState
import typingsJapgolly.reactReduxToastr.mod.default
import typingsJapgolly.reactReduxToastr.mod.positionType
import typingsJapgolly.reactReduxToastr.mod.transitionInType
import typingsJapgolly.reactReduxToastr.mod.transitionOutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactReduxToastr {
  def apply(
    className: String = null,
    closeOnToastrClick: js.UndefOr[Boolean] = js.undefined,
    confirmOptions: AnonCancelText = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    position: positionType = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    timeOut: Int | Double = null,
    toastr: ToastrState = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReduxToastrProps, default, Unit, ReduxToastrProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnToastrClick)) __obj.updateDynamic("closeOnToastrClick")(closeOnToastrClick.asInstanceOf[js.Any])
    if (confirmOptions != null) __obj.updateDynamic("confirmOptions")(confirmOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (toastr != null) __obj.updateDynamic("toastr")(toastr.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactReduxToastr.mod.ReduxToastrProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactReduxToastr.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactReduxToastr.mod.ReduxToastrProps])(children: _*)
  }
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

