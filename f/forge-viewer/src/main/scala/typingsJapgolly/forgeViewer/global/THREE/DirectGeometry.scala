package typingsJapgolly.forgeViewer.global.THREE

import org.scalajs.dom.Event
import typingsJapgolly.forgeViewer.THREE.MorphTarget
import typingsJapgolly.forgeViewer.anon.Dictattachment
import typingsJapgolly.forgeViewer.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.DirectGeometry")
@js.native
open class DirectGeometry ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.DirectGeometry {
  
  // EventDispatcher mixins
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  /* CompleteClass */
  var boundingBox: typingsJapgolly.forgeViewer.THREE.Box3 = js.native
  
  /* CompleteClass */
  var boundingSphere: typingsJapgolly.forgeViewer.THREE.Sphere = js.native
  
  /* CompleteClass */
  var colors: js.Array[typingsJapgolly.forgeViewer.THREE.Color] = js.native
  
  /* CompleteClass */
  var colorsNeedUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def computeBoundingBox(): Unit = js.native
  
  /* CompleteClass */
  override def computeBoundingSphere(): Unit = js.native
  
  /* CompleteClass */
  override def computeGroups(geometry: typingsJapgolly.forgeViewer.THREE.Geometry): Unit = js.native
  
  /* CompleteClass */
  override def dispatchEvent(event: Dictattachment): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def fromGeometry(geometry: typingsJapgolly.forgeViewer.THREE.Geometry): typingsJapgolly.forgeViewer.THREE.DirectGeometry = js.native
  
  /* CompleteClass */
  var groups: js.Array[Start] = js.native
  
  /* CompleteClass */
  var groupsNeedUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var indices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var morphTargets: js.Array[MorphTarget] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  var normals: js.Array[typingsJapgolly.forgeViewer.THREE.Vector3] = js.native
  
  /* CompleteClass */
  var normalsNeedUpdate: Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  
  /* CompleteClass */
  var skinIndices: js.Array[Double] = js.native
  
  /* CompleteClass */
  var skinWeights: js.Array[Double] = js.native
  
  /* CompleteClass */
  var `type`: String = js.native
  
  /* CompleteClass */
  var uuid: String = js.native
  
  /* CompleteClass */
  var uvs: js.Array[typingsJapgolly.forgeViewer.THREE.Vector2] = js.native
  
  /* CompleteClass */
  var uvs2: js.Array[typingsJapgolly.forgeViewer.THREE.Vector2] = js.native
  
  /* CompleteClass */
  var uvsNeedUpdate: Boolean = js.native
  
  /* CompleteClass */
  var vertices: js.Array[typingsJapgolly.forgeViewer.THREE.Vector3] = js.native
  
  /* CompleteClass */
  var verticesNeedUpdate: Boolean = js.native
}
