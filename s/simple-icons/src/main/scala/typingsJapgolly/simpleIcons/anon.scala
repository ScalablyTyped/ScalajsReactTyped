package typingsJapgolly.simpleIcons

import typingsJapgolly.simpleIcons.mod.SimpleIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    def Get(name: String): SimpleIcon
  }
  object Get {
    
    inline def apply(Get: String => SimpleIcon): Get = {
      val __obj = js.Dynamic.literal(Get = js.Any.fromFunction1(Get))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: String => SimpleIcon): Self = StObject.set(x, "Get", js.Any.fromFunction1(value))
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object Type {
    
    inline def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
