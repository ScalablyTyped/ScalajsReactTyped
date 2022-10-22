package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "GeodesicData")
@js.native
open class GeodesicData protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.GeodesicData {
  def this(
    name: String,
    category: String,
    vertex: js.Array[js.Array[Double]],
    face: js.Array[js.Array[Double]]
  ) = this()
}
/* static members */
object GeodesicData {
  
  @JSImport("babylonjs", "GeodesicData")
  @js.native
  val ^ : js.Any = js.native
  
  /**Builds the data for a Geodesic Polyhedron from a primary triangle
    * @param primTri the primary triangle
    * @internal
    */
  inline def BuildGeodesicData(primTri: typingsJapgolly.babylonjs.meshesGeodesicMeshMod.PrimaryIsoTriangle): typingsJapgolly.babylonjs.meshesGeodesicMeshMod.GeodesicData = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildGeodesicData")(primTri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesGeodesicMeshMod.GeodesicData]
}
