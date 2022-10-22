package typingsJapgolly.mediapipeFaceMesh.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mesh extends StObject {
  
  def getIndexBufferList(): js.typedarray.Uint32Array
  
  def getPrimitiveType(): PrimitiveType
  
  def getVertexBufferList(): js.typedarray.Float32Array
  
  def getVertexType(): VertexType
}
object Mesh {
  
  inline def apply(
    getIndexBufferList: CallbackTo[js.typedarray.Uint32Array],
    getPrimitiveType: CallbackTo[PrimitiveType],
    getVertexBufferList: CallbackTo[js.typedarray.Float32Array],
    getVertexType: CallbackTo[VertexType]
  ): Mesh = {
    val __obj = js.Dynamic.literal(getIndexBufferList = getIndexBufferList.toJsFn, getPrimitiveType = getPrimitiveType.toJsFn, getVertexBufferList = getVertexBufferList.toJsFn, getVertexType = getVertexType.toJsFn)
    __obj.asInstanceOf[Mesh]
  }
  
  extension [Self <: Mesh](x: Self) {
    
    inline def setGetIndexBufferList(value: CallbackTo[js.typedarray.Uint32Array]): Self = StObject.set(x, "getIndexBufferList", value.toJsFn)
    
    inline def setGetPrimitiveType(value: CallbackTo[PrimitiveType]): Self = StObject.set(x, "getPrimitiveType", value.toJsFn)
    
    inline def setGetVertexBufferList(value: CallbackTo[js.typedarray.Float32Array]): Self = StObject.set(x, "getVertexBufferList", value.toJsFn)
    
    inline def setGetVertexType(value: CallbackTo[VertexType]): Self = StObject.set(x, "getVertexType", value.toJsFn)
  }
}
