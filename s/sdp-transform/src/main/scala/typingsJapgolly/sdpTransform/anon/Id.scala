package typingsJapgolly.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var config: String
  
  var id: Double
  
  var sessionConfig: js.UndefOr[String] = js.undefined
  
  var suite: String
}
object Id {
  
  inline def apply(config: String, id: Double, suite: String): Id = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSessionConfig(value: String): Self = StObject.set(x, "sessionConfig", value.asInstanceOf[js.Any])
    
    inline def setSessionConfigUndefined: Self = StObject.set(x, "sessionConfig", js.undefined)
    
    inline def setSuite(value: String): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
  }
}
