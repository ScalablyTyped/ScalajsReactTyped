package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Geometry")
@js.native
open class Geometry protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Geometry {
  /**
    * Creates a new geometry
    * @param id defines the unique ID
    * @param scene defines the hosting scene
    * @param vertexData defines the VertexData used to get geometry data
    * @param updatable defines if geometry must be updatable (false by default)
    * @param mesh defines the mesh that will be associated with the geometry
    */
  def this(id: String) = this()
  def this(id: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(id: String, scene: Unit, vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData
  ) = this()
  def this(id: String, scene: Unit, vertexData: Unit, updatable: Boolean) = this()
  def this(
    id: String,
    scene: Unit,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Boolean
  ) = this()
  def this(id: String, scene: typingsJapgolly.babylonjs.BABYLON.Scene, vertexData: Unit, updatable: Boolean) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Boolean
  ) = this()
  def this(
    id: String,
    scene: Unit,
    vertexData: Unit,
    updatable: Boolean,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: Unit,
    vertexData: Unit,
    updatable: Unit,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: Unit,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Boolean,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: Unit,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Unit,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: Unit,
    updatable: Boolean,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: Unit,
    updatable: Unit,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Boolean,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  def this(
    id: String,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    vertexData: typingsJapgolly.babylonjs.BABYLON.VertexData,
    updatable: Unit,
    mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
}
/* static members */
object Geometry {
  
  @JSGlobal("BABYLON.Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Static function used to attach a new empty geometry to a mesh
    * @param mesh defines the mesh to attach the geometry to
    * @returns the new Geometry
    */
  inline def CreateGeometryForMesh(mesh: typingsJapgolly.babylonjs.BABYLON.Mesh): typingsJapgolly.babylonjs.BABYLON.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeometryForMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Geometry]
  
  /**
    * Extracts a clone of a mesh geometry
    * @param mesh defines the source mesh
    * @param id defines the unique ID of the new geometry object
    * @returns the new geometry object
    */
  inline def ExtractFromMesh(mesh: typingsJapgolly.babylonjs.BABYLON.Mesh, id: String): Nullable[typingsJapgolly.babylonjs.BABYLON.Geometry] = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Geometry]]
  
  /**
    * Create a new geometry from persisted data (Using .babylon file format)
    * @param parsedVertexData defines the persisted data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url to use to load assets (like delayed data)
    * @returns the new geometry object
    */
  inline def Parse(parsedVertexData: Any, scene: typingsJapgolly.babylonjs.BABYLON.Scene, rootUrl: String): Nullable[typingsJapgolly.babylonjs.BABYLON.Geometry] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedVertexData.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Geometry]]
  
  /**
    * You should now use Tools.RandomId(), this method is still here for legacy reasons.
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a string containing a new GUID
    */
  inline def RandomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomId")().asInstanceOf[String]
  
  @JSGlobal("BABYLON.Geometry._CleanMatricesWeights")
  @js.native
  def _CleanMatricesWeights: Any = js.native
  inline def _CleanMatricesWeights_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CleanMatricesWeights")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Geometry._GetGeometryByLoadedUniqueId")
  @js.native
  def _GetGeometryByLoadedUniqueId: Any = js.native
  inline def _GetGeometryByLoadedUniqueId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetGeometryByLoadedUniqueId")(x.asInstanceOf[js.Any])
  
  /**
    * @internal
    */
  inline def _ImportGeometry(parsedGeometry: Any, mesh: typingsJapgolly.babylonjs.BABYLON.Mesh): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ImportGeometry")(parsedGeometry.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
