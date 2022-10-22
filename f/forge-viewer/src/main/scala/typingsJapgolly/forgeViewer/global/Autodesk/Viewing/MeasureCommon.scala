package typingsJapgolly.forgeViewer.global.Autodesk.Viewing

import typingsJapgolly.forgeViewer.THREE.Geometry
import typingsJapgolly.forgeViewer.THREE.Matrix4
import typingsJapgolly.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeasureCommon {
  
  @JSGlobal("Autodesk.Viewing.MeasureCommon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Autodesk.Viewing.MeasureCommon.MeasurementTypes")
  @js.native
  object MeasurementTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes & Double
      ] = js.native
    
    /* 4 */ val CALIBRATION: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.CALIBRATION & Double = js.native
    
    /* 2 */ val MEASUREMENT_ANGLE: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_ANGLE & Double = js.native
    
    /* 7 */ val MEASUREMENT_ARC: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_ARC & Double = js.native
    
    /* 3 */ val MEASUREMENT_AREA: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_AREA & Double = js.native
    
    /* 5 */ val MEASUREMENT_CALLOUT: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_CALLOUT & Double = js.native
    
    /* 1 */ val MEASUREMENT_DISTANCE: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_DISTANCE & Double = js.native
    
    /* 6 */ val MEASUREMENT_LOCATION: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes.MEASUREMENT_LOCATION & Double = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.MeasureCommon.SnapResult")
  @js.native
  open class SnapResult ()
    extends StObject
       with typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult {
    
    /* CompleteClass */
    override def applyMatrix4(matrix: Matrix4): Unit = js.native
    
    /* CompleteClass */
    var circularArcCenter: Vector3 = js.native
    
    /* CompleteClass */
    var circularArcRadius: Double = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def copyTo(destiny: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult): Unit = js.native
    
    /* CompleteClass */
    var faceNormal: Vector3 = js.native
    
    /* CompleteClass */
    var fromTopology: Boolean = js.native
    
    /* CompleteClass */
    var geomEdge: Geometry = js.native
    
    /* CompleteClass */
    var geomFace: Geometry = js.native
    
    /* CompleteClass */
    var geomType: Double = js.native
    
    /* CompleteClass */
    var geomVertex: Vector3 = js.native
    
    /* CompleteClass */
    override def getEdge(): Geometry = js.native
    
    /* CompleteClass */
    override def getFace(): Geometry = js.native
    
    /* CompleteClass */
    override def getGeometry(): Geometry = js.native
    
    /* CompleteClass */
    override def getVertex(): Vector3 = js.native
    
    /* CompleteClass */
    var hasTopology: Boolean = js.native
    
    /* CompleteClass */
    var intersectPoint: Vector3 = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var isMidpoint: Boolean = js.native
    
    /* CompleteClass */
    var isPerpendicular: Boolean = js.native
    
    /* CompleteClass */
    var modelId: Double = js.native
    
    /* CompleteClass */
    var radius: Double = js.native
    
    /* CompleteClass */
    var snapNode: Double = js.native
    
    /* CompleteClass */
    var snapPoint: Vector3 = js.native
    
    /* CompleteClass */
    var viewportIndex2d: Double = js.native
  }
  
  inline def getSnapResultPosition(
    pick: typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult,
    viewer: typingsJapgolly.forgeViewer.Autodesk.Viewing.Viewer3D
  ): Vector3 = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapResultPosition")(pick.asInstanceOf[js.Any], viewer.asInstanceOf[js.Any])).asInstanceOf[Vector3]
}
