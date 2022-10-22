package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClippingAttachment
  extends StObject
     with VertexAttachment {
  
  var color: Color
  
  var endSlot: SlotData
}
object ClippingAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Callback,
    copy: CallbackTo[Attachment],
    copyTo: VertexAttachment => Callback,
    deformAttachment: VertexAttachment,
    endSlot: SlotData,
    id: Double,
    name: String,
    vertices: ArrayLike[Double],
    worldVerticesLength: Double
  ): ClippingAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6((t0: Slot, t1: Double, t2: Double, t3: ArrayLike[Double], t4: Double, t5: Double) => (computeWorldVertices(t0, t1, t2, t3, t4, t5)).runNow()), copy = copy.toJsFn, copyTo = js.Any.fromFunction1((t0: VertexAttachment) => copyTo(t0).runNow()), deformAttachment = deformAttachment.asInstanceOf[js.Any], endSlot = endSlot.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClippingAttachment]
  }
  
  extension [Self <: ClippingAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEndSlot(value: SlotData): Self = StObject.set(x, "endSlot", value.asInstanceOf[js.Any])
  }
}
