package typingsJapgolly.recharts.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.recharts.mod.SurfaceProps
import typingsJapgolly.recharts.mod.ViewBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Surface {
  def apply(
    className: String = null,
    height: Int | Double = null,
    style: js.Object = null,
    viewBox: ViewBox = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[SurfaceProps, typingsJapgolly.recharts.mod.Surface, Unit, SurfaceProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.recharts.mod.SurfaceProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.recharts.mod.Surface](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.recharts.mod.SurfaceProps])
  }
  @JSImport("recharts", "Surface")
  @js.native
  object componentImport extends js.Object
  
}

