package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.mod.Style
import typingsJapgolly.reactSketchapp.mod.StyleReference
import typingsJapgolly.reactSketchapp.svgMod.default
import typingsJapgolly.reactSketchapp.svgSvgMod.SvgProps
import typingsJapgolly.reactSketchapp.typesMod.ResizeConstraints
import typingsJapgolly.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Svg {
  def apply(
    height: String | Double = null,
    name: String = null,
    opacity: String | Double = null,
    preserveAspectRatio: String = null,
    resizingConstraint: ResizeConstraints = null,
    shadows: js.Array[SketchShadow] = null,
    style: Style | StyleReference = null,
    viewBox: String = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[SvgProps, default, Unit, SvgProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (resizingConstraint != null) __obj.updateDynamic("resizingConstraint")(resizingConstraint.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.svgSvgMod.SvgProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.svgMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.svgSvgMod.SvgProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

