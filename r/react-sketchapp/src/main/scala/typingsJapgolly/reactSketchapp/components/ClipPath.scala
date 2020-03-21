package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.clipPathMod.ClipPathProps
import typingsJapgolly.reactSketchapp.clipPathMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClipPath {
  def apply(
    id: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[ClipPathProps, default, Unit, ClipPathProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.clipPathMod.ClipPathProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.clipPathMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.clipPathMod.ClipPathProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/ClipPath", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

