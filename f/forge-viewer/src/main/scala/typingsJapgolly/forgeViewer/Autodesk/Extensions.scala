package typingsJapgolly.forgeViewer.Autodesk

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.forgeViewer.Autodesk.DataVisualization.Core.SpriteViewable
import typingsJapgolly.forgeViewer.Autodesk.DataVisualization.Core.StreamLineBuilder
import typingsJapgolly.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingData
import typingsJapgolly.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint
import typingsJapgolly.forgeViewer.Autodesk.DataVisualization.Core.ViewableData
import typingsJapgolly.forgeViewer.Autodesk.Edit2D.Edit2DContext
import typingsJapgolly.forgeViewer.Autodesk.Viewing.BubbleNode
import typingsJapgolly.forgeViewer.Autodesk.Viewing.Extension
import typingsJapgolly.forgeViewer.Autodesk.Viewing.Extensions.Snapping.Snapper
import typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.MeasurementTypes
import typingsJapgolly.forgeViewer.Autodesk.Viewing.Model
import typingsJapgolly.forgeViewer.Autodesk.Viewing.PixelCompare.DIFF_MODES
import typingsJapgolly.forgeViewer.Autodesk.Viewing.ToolInterface
import typingsJapgolly.forgeViewer.THREE.Box2
import typingsJapgolly.forgeViewer.THREE.Vector2
import typingsJapgolly.forgeViewer.anon.AlphaModel
import typingsJapgolly.forgeViewer.anon.B
import typingsJapgolly.forgeViewer.anon.CalibrationFactor
import typingsJapgolly.forgeViewer.anon.Color
import typingsJapgolly.forgeViewer.anon.HeatmapConfig
import typingsJapgolly.forgeViewer.anon.PlacePosition
import typingsJapgolly.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object CompGeom {
    
    trait ComplexPolygon extends StObject {
      
      def addContour(indices: js.Array[Double]): Unit
      
      def pointInContour(x: Double, y: Double, cntr: js.Array[Double]): Boolean
      
      def pointInPolygon(x: Double, y: Double): Boolean
      
      def triangulate(): Unit
    }
    object ComplexPolygon {
      
      inline def apply(
        addContour: js.Array[Double] => Callback,
        pointInContour: (Double, Double, js.Array[Double]) => Boolean,
        pointInPolygon: (Double, Double) => Boolean,
        triangulate: Callback
      ): ComplexPolygon = {
        val __obj = js.Dynamic.literal(addContour = js.Any.fromFunction1((t0: js.Array[Double]) => addContour(t0).runNow()), pointInContour = js.Any.fromFunction3(pointInContour), pointInPolygon = js.Any.fromFunction2(pointInPolygon), triangulate = triangulate.toJsFn)
        __obj.asInstanceOf[ComplexPolygon]
      }
      
      extension [Self <: ComplexPolygon](x: Self) {
        
        inline def setAddContour(value: js.Array[Double] => Callback): Self = StObject.set(x, "addContour", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
        
        inline def setPointInContour(value: (Double, Double, js.Array[Double]) => Boolean): Self = StObject.set(x, "pointInContour", js.Any.fromFunction3(value))
        
        inline def setPointInPolygon(value: (Double, Double) => Boolean): Self = StObject.set(x, "pointInPolygon", js.Any.fromFunction2(value))
        
        inline def setTriangulate(value: Callback): Self = StObject.set(x, "triangulate", value.toJsFn)
      }
    }
    
    @js.native
    trait ContourSet extends StObject {
      
      def addContour(verts: js.Array[Any], skipZeroAreas: Boolean): Unit = js.native
      
      def addContourSet(cset: ContourSet): Unit = js.native
      
      def area(): Double = js.native
      
      def areaNet(): Double = js.native
      
      def containsPointFrom(cs2: ContourSet): Boolean = js.native
      
      def getThemeColor(): B = js.native
      
      def hash(): String = js.native
      
      def perimeter(): Double = js.native
      
      def stitchContours(): Unit = js.native
      
      def toExtrudedMesh(thickness: Double): Any = js.native
      
      def toPolygonMesh(packNormals: Boolean): Any = js.native
      
      def triangulate(): Unit = js.native
      def triangulate(customInsideChecker: Any): Unit = js.native
    }
    
    trait EdgeSet extends StObject {
      
      def sanitizeEdges(): Unit
      
      def snapEdges(): Unit
      
      def stitchContours(): Unit
      
      def triangulate(): Unit
    }
    object EdgeSet {
      
      inline def apply(sanitizeEdges: Callback, snapEdges: Callback, stitchContours: Callback, triangulate: Callback): EdgeSet = {
        val __obj = js.Dynamic.literal(sanitizeEdges = sanitizeEdges.toJsFn, snapEdges = snapEdges.toJsFn, stitchContours = stitchContours.toJsFn, triangulate = triangulate.toJsFn)
        __obj.asInstanceOf[EdgeSet]
      }
      
      extension [Self <: EdgeSet](x: Self) {
        
        inline def setSanitizeEdges(value: Callback): Self = StObject.set(x, "sanitizeEdges", value.toJsFn)
        
        inline def setSnapEdges(value: Callback): Self = StObject.set(x, "snapEdges", value.toJsFn)
        
        inline def setStitchContours(value: Callback): Self = StObject.set(x, "stitchContours", value.toJsFn)
        
        inline def setTriangulate(value: Callback): Self = StObject.set(x, "triangulate", value.toJsFn)
      }
    }
    
    @js.native
    trait EllipseArc extends StObject {
      
      var ccw: Boolean = js.native
      
      def computeBBox(targetBox: Box2): Box2 = js.native
      
      var cx: Double = js.native
      
      var cy: Double = js.native
      
      var endAngle: Double = js.native
      
      def getAngleDelta(): Double = js.native
      
      def getPoint(t: Double, target: Vector2): Vector2 = js.native
      
      def isValid(): Boolean = js.native
      
      var rotation: Double = js.native
      
      var rx: Double = js.native
      
      var ry: Double = js.native
      
      def set(
        cx: Double,
        cy: Double,
        rx: Double,
        ry: Double,
        rotation: Double,
        startAngle: Double,
        endAngle: Double,
        ccw: Boolean
      ): EllipseArc = js.native
      
      def setFromSvgArc(
        rx: Double,
        ry: Double,
        xAxisRotation: Double,
        largeArcFlag: Boolean,
        sweepFlag: Boolean,
        start: X,
        end: X
      ): EllipseArc = js.native
      
      var startAngle: Double = js.native
      
      def tesselate(ctx: LmvCanvasContext, maxSegments: Double, minSegmentLength: Double): Unit = js.native
      def tesselate(ctx: Path2D, maxSegments: Double, minSegmentLength: Double): Unit = js.native
    }
    
    trait IntervalTree extends StObject
    
    trait LmvCanvasContext extends StObject
    
    trait Path2D extends StObject
    
    trait Point extends StObject
    
    trait PointError extends StObject
    
    trait QuadTree extends StObject
    
    trait Triangle extends StObject
    
    trait UniquePointList extends StObject
  }
  
  @js.native
  trait DataVisualization
    extends StObject
       with Extension {
    
    def addViewables(data: ViewableData): Unit = js.native
    
    def changeOcclusion(enable: Boolean): Unit = js.native
    
    def clearHighlightedViewables(): Unit = js.native
    
    var datavizDotOverlay: Any = js.native
    
    var deviceDepthOcclusion: Boolean = js.native
    
    var hasViewables: Boolean = js.native
    
    def hideTextures(): Unit = js.native
    
    def highlightViewables(dbIds: js.Array[Double]): Unit = js.native
    def highlightViewables(dbIds: Double): Unit = js.native
    
    def invalidateViewables(dbIds: js.Array[Double], callback: js.Function1[/* viewable */ SpriteViewable, Color]): Unit = js.native
    def invalidateViewables(dbIds: Double, callback: js.Function1[/* viewable */ SpriteViewable, Color]): Unit = js.native
    
    var model: Model = js.native
    
    def registerSurfaceShadingColors(sensorType: String, colors: js.Array[Double]): Unit = js.native
    def registerSurfaceShadingColors(sensorType: String, colors: js.Array[Double], options: AlphaModel): Unit = js.native
    
    def removeAllViewables(): Unit = js.native
    
    def removeSurfaceShading(): Unit = js.native
    def removeSurfaceShading(model: Model): Unit = js.native
    
    def renderSurfaceShading(
      nodeIds: String,
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: String,
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: js.Array[String],
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]
    ): Unit = js.native
    def renderSurfaceShading(
      nodeIds: js.Array[String],
      sensorType: String,
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
    
    def setupSurfaceShading(model: Model, shadingData: SurfaceShadingData): js.Promise[Unit] = js.native
    def setupSurfaceShading(model: Model, shadingData: SurfaceShadingData, options: PlacePosition): js.Promise[Unit] = js.native
    
    def showHideViewables(visible: Boolean, occlusion: Boolean): Unit = js.native
    
    def showTextures(): Unit = js.native
    
    var streamLineBuilder: StreamLineBuilder = js.native
    
    var surfaceShading: NumberDictionary[Any] = js.native
    
    def updateSurfaceShading(valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double]): Unit = js.native
    def updateSurfaceShading(
      valueCallback: js.Function2[/* device */ SurfaceShadingPoint, /* sensorType */ String, Double],
      options: HeatmapConfig
    ): Unit = js.native
  }
  
  object DocumentBrowser {
    
    @js.native
    trait DocumentBrowser
      extends StObject
         with Extension {
      
      var currNode: BubbleNode = js.native
      
      var geometries: js.Array[BubbleNode] = js.native
      
      def loadNextModel(): Unit = js.native
      def loadNextModel(viewerConfig: Any): Unit = js.native
      def loadNextModel(viewerConfig: Any, loadOptions: Any): Unit = js.native
      def loadNextModel(viewerConfig: Unit, loadOptions: Any): Unit = js.native
      
      def loadPrevModel(): Unit = js.native
      def loadPrevModel(viewerConfig: Any): Unit = js.native
      def loadPrevModel(viewerConfig: Any, loadOptions: Any): Unit = js.native
      def loadPrevModel(viewerConfig: Unit, loadOptions: Any): Unit = js.native
      
      var rootNode: BubbleNode = js.native
    }
  }
  
  @js.native
  trait Edit2D
    extends StObject
       with Extension {
    
    def defaultContext: Edit2DContext = js.native
    
    def defaultTools: Any = js.native
    
    def registerDefaultTools(): Unit = js.native
    
    def unregisterDefaultTools(): Unit = js.native
  }
  
  object Measure {
    
    @js.native
    trait MeasureExtension
      extends StObject
         with Extension {
      
      var activeStatus: Boolean = js.native
      
      def calibrate(requestedUnits: String, requestedSize: Double): Unit = js.native
      
      def calibrateByScale(requestedUnits: String, requestedSize: Double): Unit = js.native
      
      var calibration: Any = js.native
      
      var calibrationTool: ToolInterface = js.native
      
      def changeMeasurementType(measurementType: MeasurementTypes): Unit = js.native
      
      def deleteCurrentMeasurement(): Unit = js.native
      
      def deleteMeasurements(): Unit = js.native
      
      def enableCalibrationTool(enable: Boolean): Boolean = js.native
      
      def enableMeasureTool(enable: Boolean, measurementType: MeasurementTypes): Boolean = js.native
      
      def enterMeasurementMode(): Unit = js.native
      
      def exitMeasurementMode(): Unit = js.native
      
      def getCalibration(): Any = js.native
      
      def getCalibrationFactor(): Double = js.native
      
      def getDefaultUnit(): String = js.native
      
      def getMeasurement(): js.Object = js.native
      def getMeasurement(unitType: String): js.Object = js.native
      def getMeasurement(unitType: String, precision: Double): js.Object = js.native
      def getMeasurement(unitType: Unit, precision: Double): js.Object = js.native
      
      def getMeasurementList(): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: String): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: String, precision: Double): js.Array[js.Object] = js.native
      def getMeasurementList(unitType: Unit, precision: Double): js.Array[js.Object] = js.native
      
      def getPrecision(): Double = js.native
      
      def getPrecisionOptions(isFractional: Boolean): js.Array[String] = js.native
      
      def getUnitOptions(): js.Array[js.Object] = js.native
      
      def getUnits(): String = js.native
      
      def isCalibrationValid(requestedUnits: String, requestedSize: Double): Boolean = js.native
      
      def isFreeMeasureMode(): Boolean = js.native
      
      var measureTool: ToolInterface = js.native
      
      var mode: String = js.native
      
      var modes: js.Array[String] = js.native
      
      var name: String = js.native
      
      def selectMeasurementById(id: Double): Unit = js.native
      
      def setActive(active: Boolean): Boolean = js.native
      
      def setForceLeafletCalibrate(enable: Boolean): Unit = js.native
      
      def setForcePDFCalibrate(enable: Boolean): Unit = js.native
      
      def setFreeMeasureModel(allow: Boolean, useLastViewport: Boolean): Unit = js.native
      
      def setIsolateMeasure(enable: Boolean): Unit = js.native
      
      def setMeasurements(measurements: js.Array[js.Object]): Unit = js.native
      def setMeasurements(measurements: js.Object): Unit = js.native
      
      def setPrecision(precision: Double): Unit = js.native
      
      def setRestoreSessionMeasurements(enable: Boolean): Unit = js.native
      
      def setUnits(units: String): Unit = js.native
      
      var sharedMeasureConfig: CalibrationFactor = js.native
      
      def showAddCalibrationLabel(): Unit = js.native
      
      var snapper: Snapper = js.native
      
      def toggle(): Boolean = js.native
    }
  }
  
  object PixelCompare {
    
    @js.native
    trait PixelCompare
      extends StObject
         with Extension {
      
      def changeColorIntensity(value: Double): Unit = js.native
      
      def changeMainModelVisibility(visible: Boolean): Unit = js.native
      
      def changeSecondaryModelVisibility(visible: Boolean): Unit = js.native
      
      def compareTwoModels(mainModel: Double, secondaryModel: Double): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Double, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Double, secondaryModel: Model, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Double, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Any, secondaryModelInfo: Any): Unit = js.native
      def compareTwoModels(mainModel: Model, secondaryModel: Model, mainModelInfo: Unit, secondaryModelInfo: Any): Unit = js.native
      
      def getDiffMode(): DIFF_MODES = js.native
      
      def getMainModelVisibility(): Boolean = js.native
      
      def getSecondaryModelVisibility(): Boolean = js.native
      
      def getSplitPosition(): Double = js.native
      
      def resetOffset(): Unit = js.native
      
      def setChangeOffsetMode(enable: Boolean): Unit = js.native
      
      def setDiffMode(value: DIFF_MODES): Unit = js.native
      
      def setSplitLineColor(value: Double): Unit = js.native
      
      def setSplitLineWidth(value: Double): Unit = js.native
      
      def setSplitPosition(value: Double): Unit = js.native
    }
  }
  
  @js.native
  trait StringExtractor
    extends StObject
       with Extension {
    
    def extractStringsFromModel(model: Model): js.Promise[Unit] = js.native
    
    def extractStringsFromModels(): js.Promise[Any] = js.native
    
    def getDocumentStrings(): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait VisualClusters
    extends StObject
       with Extension {
    
    var layoutActive: Boolean = js.native
    
    def reset(): Unit = js.native
    
    def setLayoutActive(active: Boolean): js.Promise[Unit] = js.native
  }
}
