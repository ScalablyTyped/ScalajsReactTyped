package typingsJapgolly.reactSwipe.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSwipe.mod.Props
import typingsJapgolly.reactSwipe.mod.Style
import typingsJapgolly.reactSwipe.mod.^
import typingsJapgolly.swipe.SwipeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSwipe {
  def apply(
    childCount: Int | Double = null,
    className: String = null,
    id: String = null,
    style: Style = null,
    swipeOptions: SwipeOptions = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (childCount != null) __obj.updateDynamic("childCount")(childCount.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (swipeOptions != null) __obj.updateDynamic("swipeOptions")(swipeOptions.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSwipe.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSwipe.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSwipe.mod.Props])(children: _*)
  }
  @JSImport("react-swipe", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

