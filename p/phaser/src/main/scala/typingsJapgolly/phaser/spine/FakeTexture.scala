package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FakeTexture
  extends StObject
     with Texture
object FakeTexture {
  
  inline def apply(
    _image: HTMLImageElement,
    dispose: Callback,
    getImage: CallbackTo[HTMLImageElement],
    setFilters: (TextureFilter, TextureFilter) => Callback,
    setWraps: (TextureWrap, TextureWrap) => Callback
  ): FakeTexture = {
    val __obj = js.Dynamic.literal(_image = _image.asInstanceOf[js.Any], dispose = dispose.toJsFn, getImage = getImage.toJsFn, setFilters = js.Any.fromFunction2((t0: TextureFilter, t1: TextureFilter) => (setFilters(t0, t1)).runNow()), setWraps = js.Any.fromFunction2((t0: TextureWrap, t1: TextureWrap) => (setWraps(t0, t1)).runNow()))
    __obj.asInstanceOf[FakeTexture]
  }
}
