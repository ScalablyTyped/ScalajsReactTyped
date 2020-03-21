package typingsJapgolly.reactSketchapp.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.imageMod.ImageProps
import typingsJapgolly.reactSketchapp.imageMod.default
import typingsJapgolly.reactSketchapp.propsMod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Image {
  def apply(
    height: NumberProp,
    href: String,
    width: NumberProp,
    preserveAspectRatio: String = null,
    x: NumberProp = null,
    y: NumberProp = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node] | Node = null
  ): UnmountedWithRoot[ImageProps, default, Unit, ImageProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSketchapp.imageMod.ImageProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSketchapp.imageMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSketchapp.imageMod.ImageProps])
  }
  @JSImport("react-sketchapp/lib/components/Svg/Image", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

