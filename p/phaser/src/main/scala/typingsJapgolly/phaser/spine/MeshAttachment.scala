package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshAttachment
  extends StObject
     with VertexAttachment {
  
  var color: Color
  
  var edges: js.Array[Double]
  
  def getParentMesh(): MeshAttachment
  
  var height: Double
  
  var hullLength: Double
  
  def newLinkedMesh(): MeshAttachment
  
  /* private */ var parentMesh: Any
  
  var path: String
  
  var region: TextureRegion
  
  var regionUVs: ArrayLike[Double]
  
  def setParentMesh(parentMesh: MeshAttachment): Unit
  
  var tempColor: Color
  
  var triangles: js.Array[Double]
  
  def updateUVs(): Unit
  
  var uvs: ArrayLike[Double]
  
  var width: Double
}
object MeshAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Callback,
    copy: CallbackTo[Attachment],
    copyTo: VertexAttachment => Callback,
    deformAttachment: VertexAttachment,
    edges: js.Array[Double],
    getParentMesh: CallbackTo[MeshAttachment],
    height: Double,
    hullLength: Double,
    id: Double,
    name: String,
    newLinkedMesh: CallbackTo[MeshAttachment],
    parentMesh: Any,
    path: String,
    region: TextureRegion,
    regionUVs: ArrayLike[Double],
    setParentMesh: MeshAttachment => Callback,
    tempColor: Color,
    triangles: js.Array[Double],
    updateUVs: Callback,
    uvs: ArrayLike[Double],
    vertices: ArrayLike[Double],
    width: Double,
    worldVerticesLength: Double
  ): MeshAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6((t0: Slot, t1: Double, t2: Double, t3: ArrayLike[Double], t4: Double, t5: Double) => (computeWorldVertices(t0, t1, t2, t3, t4, t5)).runNow()), copy = copy.toJsFn, copyTo = js.Any.fromFunction1((t0: VertexAttachment) => copyTo(t0).runNow()), deformAttachment = deformAttachment.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getParentMesh = getParentMesh.toJsFn, height = height.asInstanceOf[js.Any], hullLength = hullLength.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newLinkedMesh = newLinkedMesh.toJsFn, parentMesh = parentMesh.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionUVs = regionUVs.asInstanceOf[js.Any], setParentMesh = js.Any.fromFunction1((t0: MeshAttachment) => setParentMesh(t0).runNow()), tempColor = tempColor.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], updateUVs = updateUVs.toJsFn, uvs = uvs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshAttachment]
  }
  
  extension [Self <: MeshAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEdges(value: js.Array[Double]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: Double*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setGetParentMesh(value: CallbackTo[MeshAttachment]): Self = StObject.set(x, "getParentMesh", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHullLength(value: Double): Self = StObject.set(x, "hullLength", value.asInstanceOf[js.Any])
    
    inline def setNewLinkedMesh(value: CallbackTo[MeshAttachment]): Self = StObject.set(x, "newLinkedMesh", value.toJsFn)
    
    inline def setParentMesh(value: Any): Self = StObject.set(x, "parentMesh", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUVs(value: ArrayLike[Double]): Self = StObject.set(x, "regionUVs", value.asInstanceOf[js.Any])
    
    inline def setSetParentMesh(value: MeshAttachment => Callback): Self = StObject.set(x, "setParentMesh", js.Any.fromFunction1((t0: MeshAttachment) => value(t0).runNow()))
    
    inline def setTempColor(value: Color): Self = StObject.set(x, "tempColor", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: js.Array[Double]): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    inline def setTrianglesVarargs(value: Double*): Self = StObject.set(x, "triangles", js.Array(value*))
    
    inline def setUpdateUVs(value: Callback): Self = StObject.set(x, "updateUVs", value.toJsFn)
    
    inline def setUvs(value: ArrayLike[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
