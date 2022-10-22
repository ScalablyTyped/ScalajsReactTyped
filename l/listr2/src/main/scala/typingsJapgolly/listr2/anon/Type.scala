package typingsJapgolly.listr2.anon

import typingsJapgolly.listr2.mod.ListrEvent
import typingsJapgolly.listr2.mod.ListrEventType.DATA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with ListrEvent {
  
  var data: String
  
  var `type`: DATA
}
object Type {
  
  inline def apply(data: String, `type`: DATA): Type = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: DATA): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
