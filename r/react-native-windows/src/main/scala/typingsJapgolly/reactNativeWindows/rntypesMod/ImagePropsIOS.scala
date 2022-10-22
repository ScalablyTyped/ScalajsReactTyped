package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePropsIOS extends StObject {
  
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.undefined
  
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
}
object ImagePropsIOS {
  
  inline def apply(): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropsIOS]
  }
  
  extension [Self <: ImagePropsIOS](x: Self) {
    
    inline def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    inline def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    inline def setCapInsets(value: Insets): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    inline def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    inline def setOnPartialLoad(value: Callback): Self = StObject.set(x, "onPartialLoad", value.toJsFn)
    
    inline def setOnPartialLoadUndefined: Self = StObject.set(x, "onPartialLoad", js.undefined)
    
    inline def setOnProgress(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}
