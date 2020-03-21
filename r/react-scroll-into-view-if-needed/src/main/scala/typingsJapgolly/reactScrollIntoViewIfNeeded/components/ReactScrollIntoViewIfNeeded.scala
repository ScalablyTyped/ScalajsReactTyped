package typingsJapgolly.reactScrollIntoViewIfNeeded.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactScrollIntoViewIfNeeded.mod.ReactScrollIntoViewIfNeededProps
import typingsJapgolly.reactScrollIntoViewIfNeeded.mod.default
import typingsJapgolly.scrollIntoViewIfNeeded.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollIntoViewIfNeeded {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ClassAttributes: ClassAttributes[HTMLElement] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    elementType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    options: Options[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactScrollIntoViewIfNeededProps, default, Unit, ReactScrollIntoViewIfNeededProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollIntoViewIfNeeded.mod.ReactScrollIntoViewIfNeededProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScrollIntoViewIfNeeded.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollIntoViewIfNeeded.mod.ReactScrollIntoViewIfNeededProps])(children: _*)
  }
  @JSImport("react-scroll-into-view-if-needed", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

