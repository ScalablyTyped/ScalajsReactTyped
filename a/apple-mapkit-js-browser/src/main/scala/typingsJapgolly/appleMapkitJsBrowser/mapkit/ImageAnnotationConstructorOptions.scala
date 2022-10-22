package typingsJapgolly.appleMapkitJsBrowser.mapkit

import typingsJapgolly.appleMapkitJsBrowser.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing options for initializing an image annotation.
  */
trait ImageAnnotationConstructorOptions
  extends StObject
     with AnnotationConstructorOptions {
  
  /**
    * An object containing URLs for the image assets in multiple resolutions.
    */
  var url: `1`
}
object ImageAnnotationConstructorOptions {
  
  inline def apply(url: `1`): ImageAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAnnotationConstructorOptions]
  }
  
  extension [Self <: ImageAnnotationConstructorOptions](x: Self) {
    
    inline def setUrl(value: `1`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
