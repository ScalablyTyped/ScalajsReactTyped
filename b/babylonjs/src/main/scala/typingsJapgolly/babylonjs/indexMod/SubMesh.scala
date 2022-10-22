package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SubMesh")
@js.native
open class SubMesh protected ()
  extends typingsJapgolly.babylonjs.meshesIndexMod.SubMesh {
  /**
    * Creates a new submesh
    * @param materialIndex defines the material index to use
    * @param verticesStart defines vertex index start
    * @param verticesCount defines vertices count
    * @param indexStart defines index start
    * @param indexCount defines indices count
    * @param mesh defines the parent mesh
    * @param renderingMesh defines an optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    * @param addToMesh defines a boolean indicating that the submesh must be added to the mesh.subMeshes array (true by default)
    */
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh,
    createBoundingBox: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Unit,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh,
    createBoundingBox: Boolean,
    addToMesh: Boolean
  ) = this()
  def this(
    /** the material index to use */
  materialIndex: Double,
    /** vertex index start */
  verticesStart: Double,
    /** vertices count */
  verticesCount: Double,
    /** index start */
  indexStart: Double,
    /** indices count */
  indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh,
    createBoundingBox: Unit,
    addToMesh: Boolean
  ) = this()
}
/* static members */
object SubMesh {
  
  @JSImport("babylonjs/index", "SubMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Add a new submesh to a mesh
    * @param materialIndex defines the material index to use
    * @param verticesStart defines vertex index start
    * @param verticesCount defines vertices count
    * @param indexStart defines index start
    * @param indexCount defines indices count
    * @param mesh defines the parent mesh
    * @param renderingMesh defines an optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    * @returns the new submesh
    */
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def AddToMesh(
    materialIndex: Double,
    verticesStart: Double,
    verticesCount: Double,
    indexStart: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh,
    createBoundingBox: Boolean
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("AddToMesh")(materialIndex.asInstanceOf[js.Any], verticesStart.asInstanceOf[js.Any], verticesCount.asInstanceOf[js.Any], indexStart.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  
  /**
    * Creates a new submesh from indices data
    * @param materialIndex the index of the main mesh material
    * @param startIndex the index where to start the copy in the mesh indices array
    * @param indexCount the number of indices to copy then from the startIndex
    * @param mesh the main mesh to create the submesh from
    * @param renderingMesh the optional rendering mesh
    * @param createBoundingBox defines if bounding box should be created for this submesh
    * @returns a new submesh
    */
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Unit,
    createBoundingBox: Boolean
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
  inline def CreateFromIndices(
    materialIndex: Double,
    startIndex: Double,
    indexCount: Double,
    mesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    renderingMesh: Mesh,
    createBoundingBox: Boolean
  ): typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromIndices")(materialIndex.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], indexCount.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], renderingMesh.asInstanceOf[js.Any], createBoundingBox.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
}
