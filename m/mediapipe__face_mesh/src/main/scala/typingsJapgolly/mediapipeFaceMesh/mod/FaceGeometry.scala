package typingsJapgolly.mediapipeFaceMesh.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceGeometry extends StObject {
  
  def getMesh(): Mesh
  
  def getPoseTransformMatrix(): MatrixData
}
object FaceGeometry {
  
  inline def apply(getMesh: CallbackTo[Mesh], getPoseTransformMatrix: CallbackTo[MatrixData]): FaceGeometry = {
    val __obj = js.Dynamic.literal(getMesh = getMesh.toJsFn, getPoseTransformMatrix = getPoseTransformMatrix.toJsFn)
    __obj.asInstanceOf[FaceGeometry]
  }
  
  extension [Self <: FaceGeometry](x: Self) {
    
    inline def setGetMesh(value: CallbackTo[Mesh]): Self = StObject.set(x, "getMesh", value.toJsFn)
    
    inline def setGetPoseTransformMatrix(value: CallbackTo[MatrixData]): Self = StObject.set(x, "getPoseTransformMatrix", value.toJsFn)
  }
}
