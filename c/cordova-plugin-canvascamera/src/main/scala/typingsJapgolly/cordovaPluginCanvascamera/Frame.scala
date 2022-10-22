package typingsJapgolly.cordovaPluginCanvascamera

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var dHeight: Double
  
  var dWidth: Double
  
  var dx: Double
  
  var dy: Double
  
  var element: HTMLCanvasElement
  
  var image: HTMLImageElement
  
  def initialize(): Frame
  
  def recycle(): Unit
  
  var sHeight: Double
  
  var sWidth: Double
  
  var sx: Double
  
  var sy: Double
}
object Frame {
  
  inline def apply(
    dHeight: Double,
    dWidth: Double,
    dx: Double,
    dy: Double,
    element: HTMLCanvasElement,
    image: HTMLImageElement,
    initialize: CallbackTo[Frame],
    recycle: Callback,
    sHeight: Double,
    sWidth: Double,
    sx: Double,
    sy: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(dHeight = dHeight.asInstanceOf[js.Any], dWidth = dWidth.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], initialize = initialize.toJsFn, recycle = recycle.toJsFn, sHeight = sHeight.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setDHeight(value: Double): Self = StObject.set(x, "dHeight", value.asInstanceOf[js.Any])
    
    inline def setDWidth(value: Double): Self = StObject.set(x, "dWidth", value.asInstanceOf[js.Any])
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setElement(value: HTMLCanvasElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: CallbackTo[Frame]): Self = StObject.set(x, "initialize", value.toJsFn)
    
    inline def setRecycle(value: Callback): Self = StObject.set(x, "recycle", value.toJsFn)
    
    inline def setSHeight(value: Double): Self = StObject.set(x, "sHeight", value.asInstanceOf[js.Any])
    
    inline def setSWidth(value: Double): Self = StObject.set(x, "sWidth", value.asInstanceOf[js.Any])
    
    inline def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
  }
}
