package typingsJapgolly.scriptableIos

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Image element shown in widget._
  * @see https://docs.scriptable.app/widgetimage
  */
trait WidgetImage extends StObject {
  
  /**
    * _Uses filling content mode._
    *
    * The image will fill the available space.
    * @see https://docs.scriptable.app/widgetimage/#-applyfillingcontentmode
    */
  def applyFillingContentMode(): Unit
  
  /**
    * _Uses fitting content mode._
    *
    * The image will fit the available space. This content mode is the default.
    * @see https://docs.scriptable.app/widgetimage/#-applyfittingcontentmode
    */
  def applyFittingContentMode(): Unit
  
  /**
    * _Border color._
    *
    * Color of the border around the image. Defaults to black.
    * @see https://docs.scriptable.app/widgetimage/#bordercolor
    */
  var borderColor: Color
  
  /**
    * _Border width._
    *
    * Width of the border around the image. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#borderwidth
    */
  var borderWidth: Double
  
  /**
    * _Center aligns the image._
    *
    * Specifies that image should be center aligned.
    * @see https://docs.scriptable.app/widgetimage/#-centeralignimage
    */
  def centerAlignImage(): Unit
  
  /**
    * _Shape the image relative to its container._
    *
    * When true the corners of the image will be rounded relative to the containing widget. The value of `cornerRadius` is ignored when this is true. Defaults to false.
    * @see https://docs.scriptable.app/widgetimage/#containerrelativeshape
    */
  var containerRelativeShape: Boolean
  
  /**
    * _Radius of the corners._
    *
    * Radius of the rounded corners. This property is ignored when `containerRelativeShape` is set to true. Defaults to 0.
    * @see https://docs.scriptable.app/widgetimage/#cornerradius
    */
  var cornerRadius: Double
  
  /**
    * _Image to show in widget._
    * @see https://docs.scriptable.app/widgetimage/#image
    */
  var image: Image
  
  /**
    * _Opacity when shown in widget._
    *
    * Opacity of the image. This must be a value between 0 and 1. Defaults to 1.
    * @see https://docs.scriptable.app/widgetimage/#imageopacity
    */
  var imageOpacity: Double
  
  /**
    * _Size of the image in the widget._
    *
    * Size of the image. When set to null, the image will be shwon at its full size. Defaults to null.
    * @see https://docs.scriptable.app/widgetimage/#imagesize
    */
  var imageSize: Size
  
  /**
    * _Left aligns the image._
    *
    * Specifies that image should be left aligned. This is the default.
    * @see https://docs.scriptable.app/widgetimage/#-leftalignimage
    */
  def leftAlignImage(): Unit
  
  /**
    * _Whether the image is resizable._
    *
    * When set to true, the image can be resized. Defaults to true.
    * @see https://docs.scriptable.app/widgetimage/#resizable
    */
  var resizable: Boolean
  
  /**
    * _Right aligns the image._
    *
    * Specifies that image should be right aligned.
    * @see https://docs.scriptable.app/widgetimage/#-rightalignimage
    */
  def rightAlignImage(): Unit
  
  /**
    * _Tint color of the image._
    *
    * Changes the color of the image. Set to `null` to show the original image. Defaults to `null`.
    * @see https://docs.scriptable.app/widgetimage/#tintcolor
    */
  var tintColor: Color
  
  /**
    * _URL to open._
    *
    * The URL will be opened when the image is tapped. This is only supported in medium and large widgets. Small widgets can only have a single tap target, which is specified by the `url`
    * on the widget.
    * @see https://docs.scriptable.app/widgetimage/#url
    */
  var url: String
}
object WidgetImage {
  
  inline def apply(
    applyFillingContentMode: Callback,
    applyFittingContentMode: Callback,
    borderColor: Color,
    borderWidth: Double,
    centerAlignImage: Callback,
    containerRelativeShape: Boolean,
    cornerRadius: Double,
    image: Image,
    imageOpacity: Double,
    imageSize: Size,
    leftAlignImage: Callback,
    resizable: Boolean,
    rightAlignImage: Callback,
    tintColor: Color,
    url: String
  ): WidgetImage = {
    val __obj = js.Dynamic.literal(applyFillingContentMode = applyFillingContentMode.toJsFn, applyFittingContentMode = applyFittingContentMode.toJsFn, borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], centerAlignImage = centerAlignImage.toJsFn, containerRelativeShape = containerRelativeShape.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageOpacity = imageOpacity.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], leftAlignImage = leftAlignImage.toJsFn, resizable = resizable.asInstanceOf[js.Any], rightAlignImage = rightAlignImage.toJsFn, tintColor = tintColor.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetImage]
  }
  
  extension [Self <: WidgetImage](x: Self) {
    
    inline def setApplyFillingContentMode(value: Callback): Self = StObject.set(x, "applyFillingContentMode", value.toJsFn)
    
    inline def setApplyFittingContentMode(value: Callback): Self = StObject.set(x, "applyFittingContentMode", value.toJsFn)
    
    inline def setBorderColor(value: Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setCenterAlignImage(value: Callback): Self = StObject.set(x, "centerAlignImage", value.toJsFn)
    
    inline def setContainerRelativeShape(value: Boolean): Self = StObject.set(x, "containerRelativeShape", value.asInstanceOf[js.Any])
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageOpacity(value: Double): Self = StObject.set(x, "imageOpacity", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setLeftAlignImage(value: Callback): Self = StObject.set(x, "leftAlignImage", value.toJsFn)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setRightAlignImage(value: Callback): Self = StObject.set(x, "rightAlignImage", value.toJsFn)
    
    inline def setTintColor(value: Color): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
