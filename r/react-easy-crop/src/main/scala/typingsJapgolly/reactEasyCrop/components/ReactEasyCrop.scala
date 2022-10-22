package typingsJapgolly.reactEasyCrop.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.VideoHTMLAttributes
import typingsJapgolly.reactEasyCrop.anon.ContainerClassName
import typingsJapgolly.reactEasyCrop.anon.ContainerStyle
import typingsJapgolly.reactEasyCrop.cropperMod.CropperProps
import typingsJapgolly.reactEasyCrop.mod.default
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.rect
import typingsJapgolly.reactEasyCrop.reactEasyCropStrings.round
import typingsJapgolly.reactEasyCrop.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEasyCrop {
  
  inline def apply(
    aspect: Double,
    classes: ContainerClassName,
    crop: Point,
    cropShape: rect | round,
    maxZoom: Double,
    mediaProps: ImgHTMLAttributes[HTMLElement] | VideoHTMLAttributes[HTMLElement],
    minZoom: Double,
    onCropChange: Point => Callback,
    restrictPosition: Boolean,
    rotation: Double,
    style: ContainerStyle,
    zoom: Double,
    zoomSpeed: Double
  ): SharedBuilder_CropperProps1525444750[default] = {
    val __props = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], cropShape = cropShape.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], mediaProps = mediaProps.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], onCropChange = js.Any.fromFunction1((t0: Point) => onCropChange(t0).runNow()), restrictPosition = restrictPosition.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomSpeed = zoomSpeed.asInstanceOf[js.Any])
    new SharedBuilder_CropperProps1525444750[default](js.Array(this.component, __props.asInstanceOf[CropperProps]))
  }
  
  @JSImport("react-easy-crop", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CropperProps): SharedBuilder_CropperProps1525444750[default] = new SharedBuilder_CropperProps1525444750[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
