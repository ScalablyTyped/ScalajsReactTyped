package typingsJapgolly.reactMdl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMdl.mod.ButtonProps
import typingsJapgolly.reactMdl.mod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IconButton {
  def apply(
    ButtonProps: ButtonProps = null,
    raised: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IconButtonProps, typingsJapgolly.reactMdl.mod.IconButton, Unit, IconButtonProps] = {
    val __obj = js.Dynamic.literal()
  
      if (ButtonProps != null) js.Dynamic.global.Object.assign(__obj, ButtonProps)
    if (!js.isUndefined(raised)) __obj.updateDynamic("raised")(raised.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMdl.mod.IconButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMdl.mod.IconButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMdl.mod.IconButtonProps])(children: _*)
  }
  @JSImport("react-mdl", "IconButton")
  @js.native
  object componentImport extends js.Object
  
}

