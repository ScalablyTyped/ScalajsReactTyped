package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Texture extends StObject {
  
  /* protected */ var _image: HTMLImageElement
  
  def dispose(): Unit
  
  def getImage(): HTMLImageElement
  
  def setFilters(minFilter: TextureFilter, magFilter: TextureFilter): Unit
  
  def setWraps(uWrap: TextureWrap, vWrap: TextureWrap): Unit
}
object Texture {
  
  inline def apply(
    _image: HTMLImageElement,
    dispose: Callback,
    getImage: CallbackTo[HTMLImageElement],
    setFilters: (TextureFilter, TextureFilter) => Callback,
    setWraps: (TextureWrap, TextureWrap) => Callback
  ): Texture = {
    val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = dispose.toJsFn, getImage = getImage.toJsFn, setFilters = js.Any.fromFunction2((t0: TextureFilter, t1: TextureFilter) => (setFilters(t0, t1)).runNow()), setWraps = js.Any.fromFunction2((t0: TextureWrap, t1: TextureWrap) => (setWraps(t0, t1)).runNow()))
    __obj.asInstanceOf[Texture]
  }
  
  extension [Self <: Texture](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetImage(value: CallbackTo[HTMLImageElement]): Self = StObject.set(x, "getImage", value.toJsFn)
    
    inline def setSetFilters(value: (TextureFilter, TextureFilter) => Callback): Self = StObject.set(x, "setFilters", js.Any.fromFunction2((t0: TextureFilter, t1: TextureFilter) => (value(t0, t1)).runNow()))
    
    inline def setSetWraps(value: (TextureWrap, TextureWrap) => Callback): Self = StObject.set(x, "setWraps", js.Any.fromFunction2((t0: TextureWrap, t1: TextureWrap) => (value(t0, t1)).runNow()))
    
    inline def set_image(value: HTMLImageElement): Self = StObject.set(x, "_image", value.asInstanceOf[js.Any])
  }
}
