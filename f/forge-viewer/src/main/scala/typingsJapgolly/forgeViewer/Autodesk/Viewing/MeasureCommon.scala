package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeViewer.THREE.Geometry
import typingsJapgolly.forgeViewer.THREE.Matrix4
import typingsJapgolly.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeasureCommon {
  
  @js.native
  sealed trait MeasurementTypes extends StObject
  @JSGlobal("Autodesk.Viewing.MeasureCommon.MeasurementTypes")
  @js.native
  object MeasurementTypes extends StObject {
    
    @js.native
    sealed trait CALIBRATION
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_ANGLE
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_ARC
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_AREA
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_CALLOUT
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_DISTANCE
      extends StObject
         with MeasurementTypes
    
    @js.native
    sealed trait MEASUREMENT_LOCATION
      extends StObject
         with MeasurementTypes
  }
  
  trait SnapResult extends StObject {
    
    def applyMatrix4(matrix: Matrix4): Unit
    
    var circularArcCenter: Vector3
    
    var circularArcRadius: Double
    
    def clear(): Unit
    
    def copyTo(destiny: SnapResult): Unit
    
    var faceNormal: Vector3
    
    var fromTopology: Boolean
    
    var geomEdge: Geometry
    
    var geomFace: Geometry
    
    var geomType: Double
    
    var geomVertex: Vector3
    
    def getEdge(): Geometry
    
    def getFace(): Geometry
    
    def getGeometry(): Geometry
    
    def getVertex(): Vector3
    
    var hasTopology: Boolean
    
    var intersectPoint: Vector3
    
    def isEmpty(): Boolean
    
    var isMidpoint: Boolean
    
    var isPerpendicular: Boolean
    
    var modelId: Double
    
    var radius: Double
    
    var snapNode: Double
    
    var snapPoint: Vector3
    
    var viewportIndex2d: Double
  }
  object SnapResult {
    
    inline def apply(
      applyMatrix4: Matrix4 => Callback,
      circularArcCenter: Vector3,
      circularArcRadius: Double,
      clear: Callback,
      copyTo: SnapResult => Callback,
      faceNormal: Vector3,
      fromTopology: Boolean,
      geomEdge: Geometry,
      geomFace: Geometry,
      geomType: Double,
      geomVertex: Vector3,
      getEdge: CallbackTo[Geometry],
      getFace: CallbackTo[Geometry],
      getGeometry: CallbackTo[Geometry],
      getVertex: CallbackTo[Vector3],
      hasTopology: Boolean,
      intersectPoint: Vector3,
      isEmpty: CallbackTo[Boolean],
      isMidpoint: Boolean,
      isPerpendicular: Boolean,
      modelId: Double,
      radius: Double,
      snapNode: Double,
      snapPoint: Vector3,
      viewportIndex2d: Double
    ): SnapResult = {
      val __obj = js.Dynamic.literal(applyMatrix4 = js.Any.fromFunction1((t0: Matrix4) => applyMatrix4(t0).runNow()), circularArcCenter = circularArcCenter.asInstanceOf[js.Any], circularArcRadius = circularArcRadius.asInstanceOf[js.Any], clear = clear.toJsFn, copyTo = js.Any.fromFunction1((t0: SnapResult) => copyTo(t0).runNow()), faceNormal = faceNormal.asInstanceOf[js.Any], fromTopology = fromTopology.asInstanceOf[js.Any], geomEdge = geomEdge.asInstanceOf[js.Any], geomFace = geomFace.asInstanceOf[js.Any], geomType = geomType.asInstanceOf[js.Any], geomVertex = geomVertex.asInstanceOf[js.Any], getEdge = getEdge.toJsFn, getFace = getFace.toJsFn, getGeometry = getGeometry.toJsFn, getVertex = getVertex.toJsFn, hasTopology = hasTopology.asInstanceOf[js.Any], intersectPoint = intersectPoint.asInstanceOf[js.Any], isEmpty = isEmpty.toJsFn, isMidpoint = isMidpoint.asInstanceOf[js.Any], isPerpendicular = isPerpendicular.asInstanceOf[js.Any], modelId = modelId.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], snapNode = snapNode.asInstanceOf[js.Any], snapPoint = snapPoint.asInstanceOf[js.Any], viewportIndex2d = viewportIndex2d.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapResult]
    }
    
    extension [Self <: SnapResult](x: Self) {
      
      inline def setApplyMatrix4(value: Matrix4 => Callback): Self = StObject.set(x, "applyMatrix4", js.Any.fromFunction1((t0: Matrix4) => value(t0).runNow()))
      
      inline def setCircularArcCenter(value: Vector3): Self = StObject.set(x, "circularArcCenter", value.asInstanceOf[js.Any])
      
      inline def setCircularArcRadius(value: Double): Self = StObject.set(x, "circularArcRadius", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setCopyTo(value: SnapResult => Callback): Self = StObject.set(x, "copyTo", js.Any.fromFunction1((t0: SnapResult) => value(t0).runNow()))
      
      inline def setFaceNormal(value: Vector3): Self = StObject.set(x, "faceNormal", value.asInstanceOf[js.Any])
      
      inline def setFromTopology(value: Boolean): Self = StObject.set(x, "fromTopology", value.asInstanceOf[js.Any])
      
      inline def setGeomEdge(value: Geometry): Self = StObject.set(x, "geomEdge", value.asInstanceOf[js.Any])
      
      inline def setGeomFace(value: Geometry): Self = StObject.set(x, "geomFace", value.asInstanceOf[js.Any])
      
      inline def setGeomType(value: Double): Self = StObject.set(x, "geomType", value.asInstanceOf[js.Any])
      
      inline def setGeomVertex(value: Vector3): Self = StObject.set(x, "geomVertex", value.asInstanceOf[js.Any])
      
      inline def setGetEdge(value: CallbackTo[Geometry]): Self = StObject.set(x, "getEdge", value.toJsFn)
      
      inline def setGetFace(value: CallbackTo[Geometry]): Self = StObject.set(x, "getFace", value.toJsFn)
      
      inline def setGetGeometry(value: CallbackTo[Geometry]): Self = StObject.set(x, "getGeometry", value.toJsFn)
      
      inline def setGetVertex(value: CallbackTo[Vector3]): Self = StObject.set(x, "getVertex", value.toJsFn)
      
      inline def setHasTopology(value: Boolean): Self = StObject.set(x, "hasTopology", value.asInstanceOf[js.Any])
      
      inline def setIntersectPoint(value: Vector3): Self = StObject.set(x, "intersectPoint", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setIsMidpoint(value: Boolean): Self = StObject.set(x, "isMidpoint", value.asInstanceOf[js.Any])
      
      inline def setIsPerpendicular(value: Boolean): Self = StObject.set(x, "isPerpendicular", value.asInstanceOf[js.Any])
      
      inline def setModelId(value: Double): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSnapNode(value: Double): Self = StObject.set(x, "snapNode", value.asInstanceOf[js.Any])
      
      inline def setSnapPoint(value: Vector3): Self = StObject.set(x, "snapPoint", value.asInstanceOf[js.Any])
      
      inline def setViewportIndex2d(value: Double): Self = StObject.set(x, "viewportIndex2d", value.asInstanceOf[js.Any])
    }
  }
}
