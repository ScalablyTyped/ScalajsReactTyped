package typingsJapgolly.yui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Y {
  
  trait IConfig extends StObject {
    
    var optional: js.Array[String]
    
    var requires: js.Array[String]
    
    var use: js.Array[String]
  }
  object IConfig {
    
    inline def apply(optional: js.Array[String], requires: js.Array[String], use: js.Array[String]): IConfig = {
      val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], requires = requires.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfig]
    }
    
    extension [Self <: IConfig](x: Self) {
      
      inline def setOptional(value: js.Array[String]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalVarargs(value: String*): Self = StObject.set(x, "optional", js.Array(value*))
      
      inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
      
      inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
      
      inline def setUse(value: js.Array[String]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
      
      inline def setUseVarargs(value: String*): Self = StObject.set(x, "use", js.Array(value*))
    }
  }
}
