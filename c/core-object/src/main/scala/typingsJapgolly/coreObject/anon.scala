package typingsJapgolly.coreObject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Super[Base] extends StObject {
    
    var _super: typingsJapgolly.coreObject.privateUtilsMod.Super[Base]
  }
  object Super {
    
    inline def apply[Base](_super: typingsJapgolly.coreObject.privateUtilsMod.Super[Base]): Super[Base] = {
      val __obj = js.Dynamic.literal(_super = _super.asInstanceOf[js.Any])
      __obj.asInstanceOf[Super[Base]]
    }
    
    extension [Self <: Super[?], Base](x: Self & Super[Base]) {
      
      inline def set_super(value: typingsJapgolly.coreObject.privateUtilsMod.Super[Base]): Self = StObject.set(x, "_super", value.asInstanceOf[js.Any])
    }
  }
}
