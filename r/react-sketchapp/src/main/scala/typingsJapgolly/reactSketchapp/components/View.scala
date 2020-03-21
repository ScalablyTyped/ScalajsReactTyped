package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.mod.Style
import typingsJapgolly.reactSketchapp.mod.StyleReference
import typingsJapgolly.reactSketchapp.mod.ViewProps
import typingsJapgolly.reactSketchapp.typesMod.ResizeConstraints
import typingsJapgolly.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object View {
  def apply(
    name: String = null,
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[ViewProps, typingsJapgolly.reactSketchapp.mod.View, Unit, ViewProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.mod.ViewProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.mod.View](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.mod.ViewProps])
  }
  @JSImport("react-sketchapp", "View")
  @js.native
  object componentImport extends js.Object
  
}

