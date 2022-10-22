package typingsJapgolly.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon
  extends StObject
     with Overlay {
  
  var anchor: Size
  
  var imageOffset: Size
  
  var imageSize: Size
  
  var imageUrl: Size
  
  var infoWindowAnchor: Size
  
  var printImageUrl: String
  
  def setAnchor(anchor: Size): Unit
  
  def setImageOffset(offset: Size): Unit
  
  def setImageSize(offset: Size): Unit
  
  def setImageUrl(imageUrl: String): Unit
  
  def setInfoWindowAnchor(anchor: Size): Unit
  
  def setPrintImageUrl(url: String): Unit
  
  def setSize(size: Size): Unit
  
  var size: Size
}
object Icon {
  
  inline def apply(
    anchor: Size,
    imageOffset: Size,
    imageSize: Size,
    imageUrl: Size,
    infoWindowAnchor: Size,
    printImageUrl: String,
    setAnchor: Size => japgolly.scalajs.react.Callback,
    setImageOffset: Size => japgolly.scalajs.react.Callback,
    setImageSize: Size => japgolly.scalajs.react.Callback,
    setImageUrl: String => japgolly.scalajs.react.Callback,
    setInfoWindowAnchor: Size => japgolly.scalajs.react.Callback,
    setPrintImageUrl: String => japgolly.scalajs.react.Callback,
    setSize: Size => japgolly.scalajs.react.Callback,
    size: Size
  ): Icon = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], imageOffset = imageOffset.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], infoWindowAnchor = infoWindowAnchor.asInstanceOf[js.Any], printImageUrl = printImageUrl.asInstanceOf[js.Any], setAnchor = js.Any.fromFunction1((t0: Size) => setAnchor(t0).runNow()), setImageOffset = js.Any.fromFunction1((t0: Size) => setImageOffset(t0).runNow()), setImageSize = js.Any.fromFunction1((t0: Size) => setImageSize(t0).runNow()), setImageUrl = js.Any.fromFunction1((t0: String) => setImageUrl(t0).runNow()), setInfoWindowAnchor = js.Any.fromFunction1((t0: Size) => setInfoWindowAnchor(t0).runNow()), setPrintImageUrl = js.Any.fromFunction1((t0: String) => setPrintImageUrl(t0).runNow()), setSize = js.Any.fromFunction1((t0: Size) => setSize(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setAnchor(value: Size): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setImageOffset(value: Size): Self = StObject.set(x, "imageOffset", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: Size): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: Size): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setInfoWindowAnchor(value: Size): Self = StObject.set(x, "infoWindowAnchor", value.asInstanceOf[js.Any])
    
    inline def setPrintImageUrl(value: String): Self = StObject.set(x, "printImageUrl", value.asInstanceOf[js.Any])
    
    inline def setSetAnchor(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSetImageOffset(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setImageOffset", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSetImageSize(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setImageSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSetImageUrl(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetInfoWindowAnchor(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setInfoWindowAnchor", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSetPrintImageUrl(value: String => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setPrintImageUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetSize(value: Size => japgolly.scalajs.react.Callback): Self = StObject.set(x, "setSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
