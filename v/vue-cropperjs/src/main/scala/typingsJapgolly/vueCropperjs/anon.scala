package typingsJapgolly.vueCropperjs

import typingsJapgolly.vueCropperjs.vueCropperjsBooleans.`true`
import typingsJapgolly.vueCropperjs.vueCropperjsStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var default: _empty
    
    var `type`: String
  }
  object Default {
    
    inline def apply(`type`: String): Default = {
      val __obj = js.Dynamic.literal(default = "")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: _empty): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var default: `true`
    
    var `type`: Boolean
  }
  object Type {
    
    inline def apply(`type`: Boolean): Type = {
      val __obj = js.Dynamic.literal(default = true)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setDefault(value: `true`): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
