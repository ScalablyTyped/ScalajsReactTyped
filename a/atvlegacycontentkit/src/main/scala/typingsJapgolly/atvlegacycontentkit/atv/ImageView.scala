package typingsJapgolly.atvlegacycontentkit.atv

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.ATVAnimation
import typingsJapgolly.atvlegacycontentkit.ATVColor
import typingsJapgolly.atvlegacycontentkit.ATVFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An image that can be displayed in either scriptViews or as an overlay.
  */
trait ImageView
  extends StObject
     with View {
  
  /**
    * Loads an image into the ImageView.
    * @param url The URL the image is hosted at.
    */
  def loadImageAtURL(url: String): Unit
}
object ImageView {
  
  inline def apply(
    addAnimation: (ATVAnimation, String) => Callback,
    backgroundColor: ATVColor,
    frame: ATVFrame,
    loadImageAtURL: String => Callback,
    removeAllAnimations: Callback,
    removeAnimation: String => Callback,
    subviews: js.Array[View]
  ): ImageView = {
    val __obj = js.Dynamic.literal(addAnimation = js.Any.fromFunction2((t0: ATVAnimation, t1: String) => (addAnimation(t0, t1)).runNow()), backgroundColor = backgroundColor.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], loadImageAtURL = js.Any.fromFunction1((t0: String) => loadImageAtURL(t0).runNow()), removeAllAnimations = removeAllAnimations.toJsFn, removeAnimation = js.Any.fromFunction1((t0: String) => removeAnimation(t0).runNow()), subviews = subviews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView]
  }
  
  extension [Self <: ImageView](x: Self) {
    
    inline def setLoadImageAtURL(value: String => Callback): Self = StObject.set(x, "loadImageAtURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
