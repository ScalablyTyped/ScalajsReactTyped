package typingsJapgolly.thrift.mod

import typingsJapgolly.thrift.mod.Thrift.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TList extends StObject {
  
  var etype: Type
  
  var size: Double
}
object TList {
  
  inline def apply(etype: Type, size: Double): TList = {
    val __obj = js.Dynamic.literal(etype = etype.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TList]
  }
  
  extension [Self <: TList](x: Self) {
    
    inline def setEtype(value: Type): Self = StObject.set(x, "etype", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
