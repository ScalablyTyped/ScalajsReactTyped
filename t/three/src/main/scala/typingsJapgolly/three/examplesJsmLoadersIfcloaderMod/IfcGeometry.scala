package typingsJapgolly.three.examplesJsmLoadersIfcloaderMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfcGeometry extends StObject {
  
  def GetIndexData(): Double
  
  def GetIndexDataSize(): Double
  
  def GetVertexData(): Double
  
  def GetVertexDataSize(): Double
}
object IfcGeometry {
  
  inline def apply(
    GetIndexData: CallbackTo[Double],
    GetIndexDataSize: CallbackTo[Double],
    GetVertexData: CallbackTo[Double],
    GetVertexDataSize: CallbackTo[Double]
  ): IfcGeometry = {
    val __obj = js.Dynamic.literal(GetIndexData = GetIndexData.toJsFn, GetIndexDataSize = GetIndexDataSize.toJsFn, GetVertexData = GetVertexData.toJsFn, GetVertexDataSize = GetVertexDataSize.toJsFn)
    __obj.asInstanceOf[IfcGeometry]
  }
  
  extension [Self <: IfcGeometry](x: Self) {
    
    inline def setGetIndexData(value: CallbackTo[Double]): Self = StObject.set(x, "GetIndexData", value.toJsFn)
    
    inline def setGetIndexDataSize(value: CallbackTo[Double]): Self = StObject.set(x, "GetIndexDataSize", value.toJsFn)
    
    inline def setGetVertexData(value: CallbackTo[Double]): Self = StObject.set(x, "GetVertexData", value.toJsFn)
    
    inline def setGetVertexDataSize(value: CallbackTo[Double]): Self = StObject.set(x, "GetVertexDataSize", value.toJsFn)
  }
}
