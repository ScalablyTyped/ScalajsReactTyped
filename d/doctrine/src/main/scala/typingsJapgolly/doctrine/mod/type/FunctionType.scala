package typingsJapgolly.doctrine.mod.`type`

import typingsJapgolly.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionType
  extends StObject
     with Type_ {
  
  var `new`: Type_
  
  var params: js.Array[Type_]
  
  var result: Type_
  
  var `this`: Type_
  
  var `type`: typingsJapgolly.doctrine.doctrineStrings.FunctionType
}
object FunctionType {
  
  inline def apply(`new`: Type_, params: js.Array[Type_], result: Type_, `this`: Type_): FunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionType")
    __obj.asInstanceOf[FunctionType]
  }
  
  extension [Self <: FunctionType](x: Self) {
    
    inline def setNew(value: Type_): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Type_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Type_ *): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setResult(value: Type_): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setThis(value: Type_): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.doctrine.doctrineStrings.FunctionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
