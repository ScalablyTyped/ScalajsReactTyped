package typingsJapgolly.mediapipeFaceMesh.mod

import typingsJapgolly.mediapipeFaceMesh.mediapipeFaceMeshInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexType extends StObject {
  
  var VERTEX_PT: `0`
}
object VertexType {
  
  inline def apply(): VertexType = {
    val __obj = js.Dynamic.literal(VERTEX_PT = 0)
    __obj.asInstanceOf[VertexType]
  }
  
  extension [Self <: VertexType](x: Self) {
    
    inline def setVERTEX_PT(value: `0`): Self = StObject.set(x, "VERTEX_PT", value.asInstanceOf[js.Any])
  }
}
