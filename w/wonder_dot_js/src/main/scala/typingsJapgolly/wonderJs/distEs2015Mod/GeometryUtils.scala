package typingsJapgolly.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "GeometryUtils")
@js.native
open class GeometryUtils ()
  extends typingsJapgolly.wonderJs.distEs2015ComponentGeometryGeometryUtilsMod.GeometryUtils
/* static members */
object GeometryUtils {
  
  @JSImport("wonder.js/dist/es2015", "GeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToFaces(indices: js.Array[Double]): js.Array[typingsJapgolly.wonderJs.distEs2015StructureFace3Mod.Face3] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.wonderJs.distEs2015StructureFace3Mod.Face3]]
  inline def convertToFaces(indices: js.Array[Double], normals: js.Array[Double]): js.Array[typingsJapgolly.wonderJs.distEs2015StructureFace3Mod.Face3] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToFaces")(indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.wonderJs.distEs2015StructureFace3Mod.Face3]]
  
  inline def getThreeComponent(sourceData: js.Array[Double], index: Double): typingsJapgolly.wonderJs.distEs2015MathVector3Mod.Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getThreeComponent")(sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.wonderJs.distEs2015MathVector3Mod.Vector3]
  
  inline def hasData(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasData")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def iterateThreeComponent(
    dataArr: js.Array[Double],
    iterator: js.Function1[/* v */ typingsJapgolly.wonderJs.distEs2015MathVector3Mod.Vector3, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("iterateThreeComponent")(dataArr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setThreeComponent(targetData: js.Array[Double], sourceData: js.Array[Double], index: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def setThreeComponent(
    targetData: js.Array[Double],
    sourceData: typingsJapgolly.wonderJs.distEs2015MathVector3Mod.Vector3,
    index: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setThreeComponent")(targetData.asInstanceOf[js.Any], sourceData.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
}
