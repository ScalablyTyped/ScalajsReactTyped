package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.forgeViewer.anon.Dictattachment
import typingsJapgolly.forgeViewer.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectGeometry extends StObject {
  
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  
  var boundingBox: Box3
  
  var boundingSphere: Sphere
  
  var colors: js.Array[Color]
  
  var colorsNeedUpdate: Boolean
  
  def computeBoundingBox(): Unit
  
  def computeBoundingSphere(): Unit
  
  def computeGroups(geometry: Geometry): Unit
  
  def dispatchEvent(event: Dictattachment): Unit
  
  def dispose(): Unit
  
  def fromGeometry(geometry: Geometry): DirectGeometry
  
  var groups: js.Array[Start]
  
  var groupsNeedUpdate: Boolean
  
  def hasEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  
  var id: Double
  
  var indices: js.Array[Double]
  
  var morphTargets: js.Array[MorphTarget]
  
  var name: String
  
  var normals: js.Array[Vector3]
  
  var normalsNeedUpdate: Boolean
  
  def removeEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit
  
  var skinIndices: js.Array[Double]
  
  var skinWeights: js.Array[Double]
  
  var `type`: String
  
  var uuid: String
  
  var uvs: js.Array[Vector2]
  
  var uvs2: js.Array[Vector2]
  
  var uvsNeedUpdate: Boolean
  
  var vertices: js.Array[Vector3]
  
  var verticesNeedUpdate: Boolean
}
object DirectGeometry {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback,
    boundingBox: Box3,
    boundingSphere: Sphere,
    colors: js.Array[Color],
    colorsNeedUpdate: Boolean,
    computeBoundingBox: Callback,
    computeBoundingSphere: Callback,
    computeGroups: Geometry => Callback,
    dispatchEvent: Dictattachment => Callback,
    dispose: Callback,
    fromGeometry: Geometry => DirectGeometry,
    groups: js.Array[Start],
    groupsNeedUpdate: Boolean,
    hasEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback,
    id: Double,
    indices: js.Array[Double],
    morphTargets: js.Array[MorphTarget],
    name: String,
    normals: js.Array[Vector3],
    normalsNeedUpdate: Boolean,
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Callback,
    skinIndices: js.Array[Double],
    skinWeights: js.Array[Double],
    `type`: String,
    uuid: String,
    uvs: js.Array[Vector2],
    uvs2: js.Array[Vector2],
    uvsNeedUpdate: Boolean,
    vertices: js.Array[Vector3],
    verticesNeedUpdate: Boolean
  ): DirectGeometry = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (addEventListener(t0, t1)).runNow()), boundingBox = boundingBox.asInstanceOf[js.Any], boundingSphere = boundingSphere.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], colorsNeedUpdate = colorsNeedUpdate.asInstanceOf[js.Any], computeBoundingBox = computeBoundingBox.toJsFn, computeBoundingSphere = computeBoundingSphere.toJsFn, computeGroups = js.Any.fromFunction1((t0: Geometry) => computeGroups(t0).runNow()), dispatchEvent = js.Any.fromFunction1((t0: Dictattachment) => dispatchEvent(t0).runNow()), dispose = dispose.toJsFn, fromGeometry = js.Any.fromFunction1(fromGeometry), groups = groups.asInstanceOf[js.Any], groupsNeedUpdate = groupsNeedUpdate.asInstanceOf[js.Any], hasEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (hasEventListener(t0, t1)).runNow()), id = id.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], morphTargets = morphTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], normalsNeedUpdate = normalsNeedUpdate.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (removeEventListener(t0, t1)).runNow()), skinIndices = skinIndices.asInstanceOf[js.Any], skinWeights = skinWeights.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], uvs = uvs.asInstanceOf[js.Any], uvs2 = uvs2.asInstanceOf[js.Any], uvsNeedUpdate = uvsNeedUpdate.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], verticesNeedUpdate = verticesNeedUpdate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectGeometry]
  }
  
  extension [Self <: DirectGeometry](x: Self) {
    
    inline def setAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setBoundingBox(value: Box3): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingSphere(value: Sphere): Self = StObject.set(x, "boundingSphere", value.asInstanceOf[js.Any])
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNeedUpdate(value: Boolean): Self = StObject.set(x, "colorsNeedUpdate", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setComputeBoundingBox(value: Callback): Self = StObject.set(x, "computeBoundingBox", value.toJsFn)
    
    inline def setComputeBoundingSphere(value: Callback): Self = StObject.set(x, "computeBoundingSphere", value.toJsFn)
    
    inline def setComputeGroups(value: Geometry => Callback): Self = StObject.set(x, "computeGroups", js.Any.fromFunction1((t0: Geometry) => value(t0).runNow()))
    
    inline def setDispatchEvent(value: Dictattachment => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1((t0: Dictattachment) => value(t0).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setFromGeometry(value: Geometry => DirectGeometry): Self = StObject.set(x, "fromGeometry", js.Any.fromFunction1(value))
    
    inline def setGroups(value: js.Array[Start]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsNeedUpdate(value: Boolean): Self = StObject.set(x, "groupsNeedUpdate", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: Start*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setHasEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Callback): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMorphTargets(value: js.Array[MorphTarget]): Self = StObject.set(x, "morphTargets", value.asInstanceOf[js.Any])
    
    inline def setMorphTargetsVarargs(value: MorphTarget*): Self = StObject.set(x, "morphTargets", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNormals(value: js.Array[Vector3]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setNormalsNeedUpdate(value: Boolean): Self = StObject.set(x, "normalsNeedUpdate", value.asInstanceOf[js.Any])
    
    inline def setNormalsVarargs(value: Vector3*): Self = StObject.set(x, "normals", js.Array(value*))
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: String, t1: js.Function1[/* event */ Event, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSkinIndices(value: js.Array[Double]): Self = StObject.set(x, "skinIndices", value.asInstanceOf[js.Any])
    
    inline def setSkinIndicesVarargs(value: Double*): Self = StObject.set(x, "skinIndices", js.Array(value*))
    
    inline def setSkinWeights(value: js.Array[Double]): Self = StObject.set(x, "skinWeights", value.asInstanceOf[js.Any])
    
    inline def setSkinWeightsVarargs(value: Double*): Self = StObject.set(x, "skinWeights", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUvs(value: js.Array[Vector2]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setUvs2(value: js.Array[Vector2]): Self = StObject.set(x, "uvs2", value.asInstanceOf[js.Any])
    
    inline def setUvs2Varargs(value: Vector2*): Self = StObject.set(x, "uvs2", js.Array(value*))
    
    inline def setUvsNeedUpdate(value: Boolean): Self = StObject.set(x, "uvsNeedUpdate", value.asInstanceOf[js.Any])
    
    inline def setUvsVarargs(value: Vector2*): Self = StObject.set(x, "uvs", js.Array(value*))
    
    inline def setVertices(value: js.Array[Vector3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesNeedUpdate(value: Boolean): Self = StObject.set(x, "verticesNeedUpdate", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: Vector3*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
