package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.mod.ArtboardProps
import typingsJapgolly.reactSketchapp.mod.Style
import typingsJapgolly.reactSketchapp.mod.StyleReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Artboard {
  def apply(
    name: String = null,
    style: Style | StyleReference = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[ArtboardProps, typingsJapgolly.reactSketchapp.mod.Artboard, Unit, ArtboardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.mod.ArtboardProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.mod.Artboard](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.mod.ArtboardProps])
  }
  @JSImport("react-sketchapp", "Artboard")
  @js.native
  object componentImport extends js.Object
  
}

