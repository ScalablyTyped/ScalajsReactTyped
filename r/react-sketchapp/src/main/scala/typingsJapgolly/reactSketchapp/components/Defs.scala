package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.defsMod.DefsProps
import typingsJapgolly.reactSketchapp.defsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Defs {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[DefsProps, default, Unit, DefsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.defsMod.DefsProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.defsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.defsMod.DefsProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/Defs", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

