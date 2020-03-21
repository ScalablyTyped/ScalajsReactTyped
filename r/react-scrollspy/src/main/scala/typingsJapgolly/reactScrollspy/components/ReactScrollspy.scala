package typingsJapgolly.reactScrollspy.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactScrollspy.mod.ScrollspyProps
import typingsJapgolly.reactScrollspy.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollspy {
  def apply(
    currentClassName: String,
    items: js.Array[String],
    className: String = null,
    componentTag: String | ComponentType[js.Object] = null,
    offset: Int | Double = null,
    onUpdate: /* item */ String => Callback = null,
    rootEl: String = null,
    scrolledPastClassName: String = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollspyProps, default, Unit, ScrollspyProps] = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentTag != null) __obj.updateDynamic("componentTag")(componentTag.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* item */ java.lang.String) => onUpdate(t0).runNow()))
    if (rootEl != null) __obj.updateDynamic("rootEl")(rootEl.asInstanceOf[js.Any])
    if (scrolledPastClassName != null) __obj.updateDynamic("scrolledPastClassName")(scrolledPastClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollspy.mod.ScrollspyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScrollspy.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollspy.mod.ScrollspyProps])(children: _*)
  }
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

