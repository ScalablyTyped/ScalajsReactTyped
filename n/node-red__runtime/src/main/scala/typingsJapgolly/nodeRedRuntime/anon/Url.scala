package typingsJapgolly.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  /** Help Link Text */
  var label: String
  
  /** Help Link URL */
  var url: String
}
object Url {
  
  inline def apply(label: String, url: String): Url = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
