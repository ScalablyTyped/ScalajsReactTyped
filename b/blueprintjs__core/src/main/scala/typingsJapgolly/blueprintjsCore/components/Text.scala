package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.textMod.ITextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Text {
  def apply(
    className: String = null,
    ellipsize: js.UndefOr[Boolean] = js.undefined,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITextProps, typingsJapgolly.blueprintjsCore.mod.Text, Unit, ITextProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsize)) __obj.updateDynamic("ellipsize")(ellipsize.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.textMod.ITextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Text](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.textMod.ITextProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Text")
  @js.native
  object componentImport extends js.Object
  
}

