package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleImageOptions
  extends StObject
     with ImageOptions {
  
  var url: String
}
object SimpleImageOptions {
  
  inline def apply(url: String): SimpleImageOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleImageOptions]
  }
  
  extension [Self <: SimpleImageOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
