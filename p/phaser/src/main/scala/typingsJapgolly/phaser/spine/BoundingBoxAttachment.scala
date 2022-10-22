package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingBoxAttachment
  extends StObject
     with VertexAttachment {
  
  var color: Color
}
object BoundingBoxAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Callback,
    copy: CallbackTo[Attachment],
    copyTo: VertexAttachment => Callback,
    deformAttachment: VertexAttachment,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): BoundingBoxAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6((t0: Slot, t1: Double, t2: Double, t3: ArrayLike[Double], t4: Double, t5: Double) => (computeWorldVertices(t0, t1, t2, t3, t4, t5)).runNow()), copy = copy.toJsFn, copyTo = js.Any.fromFunction1((t0: VertexAttachment) => copyTo(t0).runNow()), deformAttachment = deformAttachment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBoxAttachment]
  }
  
  extension [Self <: BoundingBoxAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
