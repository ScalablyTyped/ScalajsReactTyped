package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAttachment
  extends StObject
     with Attachment {
  
  var bones: js.Array[Double]
  
  def computeWorldVertices(
    slot: Slot,
    start: Double,
    count: Double,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit
  
  def copyTo(attachment: VertexAttachment): Unit
  
  var deformAttachment: VertexAttachment
  
  var id: Double
  
  var vertices: ArrayLike[Double]
  
  var worldVerticesLength: Double
}
object VertexAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Callback,
    copy: CallbackTo[Attachment],
    copyTo: VertexAttachment => Callback,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): VertexAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6((t0: Slot, t1: Double, t2: Double, t3: ArrayLike[Double], t4: Double, t5: Double) => (computeWorldVertices(t0, t1, t2, t3, t4, t5)).runNow()), copy = copy.toJsFn, copyTo = js.Any.fromFunction1((t0: VertexAttachment) => copyTo(t0).runNow()), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttachment]
  }
  
  extension [Self <: VertexAttachment](x: Self) {
    
    inline def setBones(value: js.Array[Double]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Double*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setComputeWorldVertices(value: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Callback): Self = StObject.set(x, "computeWorldVertices", js.Any.fromFunction6((t0: Slot, t1: Double, t2: Double, t3: ArrayLike[Double], t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setCopyTo(value: VertexAttachment => Callback): Self = StObject.set(x, "copyTo", js.Any.fromFunction1((t0: VertexAttachment) => value(t0).runNow()))
    
    inline def setDeformAttachment(value: VertexAttachment): Self = StObject.set(x, "deformAttachment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: ArrayLike[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setWorldVerticesLength(value: Double): Self = StObject.set(x, "worldVerticesLength", value.asInstanceOf[js.Any])
  }
}
