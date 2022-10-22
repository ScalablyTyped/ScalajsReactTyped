package typingsJapgolly.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsCommon {
  
  trait IStringResourceProvider extends StObject {
    
    def get(id: String): String
    
    def getOptional(id: String): String
  }
  object IStringResourceProvider {
    
    inline def apply(get: String => String, getOptional: String => String): IStringResourceProvider = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getOptional = js.Any.fromFunction1(getOptional))
      __obj.asInstanceOf[IStringResourceProvider]
    }
    
    extension [Self <: IStringResourceProvider](x: Self) {
      
      inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetOptional(value: String => String): Self = StObject.set(x, "getOptional", js.Any.fromFunction1(value))
    }
  }
}
