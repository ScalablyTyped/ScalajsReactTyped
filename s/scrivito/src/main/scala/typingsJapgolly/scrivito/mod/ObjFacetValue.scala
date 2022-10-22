package typingsJapgolly.scrivito.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjFacetValue extends StObject {
  
  def count(): Double
  
  def includedObjs(): js.Array[Obj]
  
  def name(): String
}
object ObjFacetValue {
  
  inline def apply(count: CallbackTo[Double], includedObjs: CallbackTo[js.Array[Obj]], name: CallbackTo[String]): ObjFacetValue = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, includedObjs = includedObjs.toJsFn, name = name.toJsFn)
    __obj.asInstanceOf[ObjFacetValue]
  }
  
  extension [Self <: ObjFacetValue](x: Self) {
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setIncludedObjs(value: CallbackTo[js.Array[Obj]]): Self = StObject.set(x, "includedObjs", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
  }
}
