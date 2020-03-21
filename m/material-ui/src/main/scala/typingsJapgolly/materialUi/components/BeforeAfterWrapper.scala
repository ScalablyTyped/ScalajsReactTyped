package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.beforeAfterWrapperMod.BeforeAfterWrapperProps
import typingsJapgolly.materialUi.beforeAfterWrapperMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BeforeAfterWrapper {
  def apply(
    afterElementType: String = null,
    afterStyle: CSSProperties = null,
    beforeElementType: String = null,
    beforeStyle: CSSProperties = null,
    elementType: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BeforeAfterWrapperProps, default, Unit, BeforeAfterWrapperProps] = {
    val __obj = js.Dynamic.literal()
  
      if (afterElementType != null) __obj.updateDynamic("afterElementType")(afterElementType.asInstanceOf[js.Any])
    if (afterStyle != null) __obj.updateDynamic("afterStyle")(afterStyle.asInstanceOf[js.Any])
    if (beforeElementType != null) __obj.updateDynamic("beforeElementType")(beforeElementType.asInstanceOf[js.Any])
    if (beforeStyle != null) __obj.updateDynamic("beforeStyle")(beforeStyle.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.beforeAfterWrapperMod.BeforeAfterWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.beforeAfterWrapperMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.beforeAfterWrapperMod.BeforeAfterWrapperProps])(children: _*)
  }
  @JSImport("material-ui/internal/BeforeAfterWrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

