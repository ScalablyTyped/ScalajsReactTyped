package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "CSG")
@js.native
open class CSG ()
  extends typingsJapgolly.babylonjs.meshesIndexMod.CSG
/* static members */
object CSG {
  
  @JSImport("babylonjs/index", "CSG")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @param absolute If true, the final (local) matrix transformation is set to the identity and not to that of `mesh`. It can help when dealing with right-handed meshes (default: false)
    * @returns A new CSG from the Mesh
    */
  inline def FromMesh(mesh: Mesh): typingsJapgolly.babylonjs.meshesCsgMod.CSG = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesCsgMod.CSG]
  inline def FromMesh(mesh: Mesh, absolute: Boolean): typingsJapgolly.babylonjs.meshesCsgMod.CSG = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], absolute.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesCsgMod.CSG]
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  @JSImport("babylonjs/index", "CSG._FromPolygons")
  @js.native
  def _FromPolygons: Any = js.native
  inline def _FromPolygons_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromPolygons")(x.asInstanceOf[js.Any])
}
