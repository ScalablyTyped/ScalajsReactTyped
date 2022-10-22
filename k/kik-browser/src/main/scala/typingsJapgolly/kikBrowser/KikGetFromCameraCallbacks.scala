package typingsJapgolly.kikBrowser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KikGetFromCameraCallbacks extends StObject {
  
  def onCancel(): Unit
  
  def onComplete(photos: js.Array[String]): Unit
  
  def onPhoto(photo: String, index: Double): Unit
  
  def onSelect(numPhotos: Double): Unit
}
object KikGetFromCameraCallbacks {
  
  inline def apply(
    onCancel: Callback,
    onComplete: js.Array[String] => Callback,
    onPhoto: (String, Double) => Callback,
    onSelect: Double => Callback
  ): KikGetFromCameraCallbacks = {
    val __obj = js.Dynamic.literal(onCancel = onCancel.toJsFn, onComplete = js.Any.fromFunction1((t0: js.Array[String]) => onComplete(t0).runNow()), onPhoto = js.Any.fromFunction2((t0: String, t1: Double) => (onPhoto(t0, t1)).runNow()), onSelect = js.Any.fromFunction1((t0: Double) => onSelect(t0).runNow()))
    __obj.asInstanceOf[KikGetFromCameraCallbacks]
  }
  
  extension [Self <: KikGetFromCameraCallbacks](x: Self) {
    
    inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setOnComplete(value: js.Array[String] => Callback): Self = StObject.set(x, "onComplete", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setOnPhoto(value: (String, Double) => Callback): Self = StObject.set(x, "onPhoto", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnSelect(value: Double => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
