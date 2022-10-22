package typingsJapgolly.winrt.global.Windows.UI

import typingsJapgolly.winrt.Windows.Devices.Input.PointerDevice
import typingsJapgolly.winrt.Windows.Devices.Input.PointerDeviceType
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.Point
import typingsJapgolly.winrt.Windows.Foundation.Rect
import typingsJapgolly.winrt.Windows.Foundation.Size
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.UI.Color
import typingsJapgolly.winrt.Windows.UI.Input.CrossSlideThresholds
import typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState
import typingsJapgolly.winrt.Windows.UI.Input.DraggingState
import typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureKind
import typingsJapgolly.winrt.Windows.UI.Input.GestureSettings
import typingsJapgolly.winrt.Windows.UI.Input.HoldingState
import typingsJapgolly.winrt.Windows.UI.Input.IPointerPointTransform
import typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget
import typingsJapgolly.winrt.Windows.UI.Input.Inking.PenTipShape
import typingsJapgolly.winrt.Windows.UI.Input.ManipulationDelta
import typingsJapgolly.winrt.Windows.UI.Input.ManipulationVelocities
import typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
  @js.native
  open class CrossSlidingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingEventArgs {
    
    /* CompleteClass */
    var crossSlidingState: CrossSlidingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.CrossSlidingState")
  @js.native
  object CrossSlidingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState & Double] = js.native
    
    /* 6 */ val completed: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.completed & Double = js.native
    
    /* 1 */ val dragging: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.dragging & Double = js.native
    
    /* 5 */ val rearranging: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.rearranging & Double = js.native
    
    /* 3 */ val selectSpeedBumping: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping & Double = js.native
    
    /* 2 */ val selecting: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.selecting & Double = js.native
    
    /* 4 */ val speedBumping: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.speedBumping & Double = js.native
    
    /* 0 */ val started: typingsJapgolly.winrt.Windows.UI.Input.CrossSlidingState.started & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingEventArgs")
  @js.native
  open class DraggingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.DraggingEventArgs {
    
    /* CompleteClass */
    var draggingState: DraggingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingState")
  @js.native
  object DraggingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.DraggingState & Double] = js.native
    
    /* 2 */ val completed: typingsJapgolly.winrt.Windows.UI.Input.DraggingState.completed & Double = js.native
    
    /* 1 */ val continuing: typingsJapgolly.winrt.Windows.UI.Input.DraggingState.continuing & Double = js.native
    
    /* 0 */ val started: typingsJapgolly.winrt.Windows.UI.Input.DraggingState.started & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGesture")
  @js.native
  open class EdgeGesture ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.EdgeGesture {
    
    /* CompleteClass */
    var oncanceled: Any = js.native
    
    /* CompleteClass */
    var oncompleted: Any = js.native
    
    /* CompleteClass */
    var onstarting: Any = js.native
  }
  /* static members */
  object EdgeGesture {
    
    @JSGlobal("Windows.UI.Input.EdgeGesture")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typingsJapgolly.winrt.Windows.UI.Input.EdgeGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.UI.Input.EdgeGesture]
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
  @js.native
  open class EdgeGestureEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureEventArgs {
    
    /* CompleteClass */
    var kind: EdgeGestureKind = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureKind")
  @js.native
  object EdgeGestureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureKind & Double] = js.native
    
    /* 1 */ val keyboard: typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureKind.keyboard & Double = js.native
    
    /* 2 */ val mouse: typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureKind.mouse & Double = js.native
    
    /* 0 */ val touch: typingsJapgolly.winrt.Windows.UI.Input.EdgeGestureKind.touch & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureRecognizer")
  @js.native
  open class GestureRecognizer ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.GestureRecognizer {
    
    /* CompleteClass */
    var autoProcessInertia: Boolean = js.native
    
    /* CompleteClass */
    override def canBeDoubleTap(value: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): Boolean = js.native
    
    /* CompleteClass */
    override def completeGesture(): Unit = js.native
    
    /* CompleteClass */
    var crossSlideExact: Boolean = js.native
    
    /* CompleteClass */
    var crossSlideHorizontally: Boolean = js.native
    
    /* CompleteClass */
    var crossSlideThresholds: CrossSlideThresholds = js.native
    
    /* CompleteClass */
    var gestureSettings: GestureSettings = js.native
    
    /* CompleteClass */
    var inertiaExpansion: Double = js.native
    
    /* CompleteClass */
    var inertiaExpansionDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaRotationAngle: Double = js.native
    
    /* CompleteClass */
    var inertiaRotationDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaTranslationDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaTranslationDisplacement: Double = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isInertial: Boolean = js.native
    
    /* CompleteClass */
    var manipulationExact: Boolean = js.native
    
    /* CompleteClass */
    var mouseWheelParameters: typingsJapgolly.winrt.Windows.UI.Input.MouseWheelParameters = js.native
    
    /* CompleteClass */
    var oncrosssliding: Any = js.native
    
    /* CompleteClass */
    var ondragging: Any = js.native
    
    /* CompleteClass */
    var onholding: Any = js.native
    
    /* CompleteClass */
    var onmanipulationcompleted: Any = js.native
    
    /* CompleteClass */
    var onmanipulationinertiastarting: Any = js.native
    
    /* CompleteClass */
    var onmanipulationstarted: Any = js.native
    
    /* CompleteClass */
    var onmanipulationupdated: Any = js.native
    
    /* CompleteClass */
    var onrighttapped: Any = js.native
    
    /* CompleteClass */
    var ontapped: Any = js.native
    
    /* CompleteClass */
    var pivotCenter: Point = js.native
    
    /* CompleteClass */
    var pivotRadius: Double = js.native
    
    /* CompleteClass */
    override def processDownEvent(value: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
    
    /* CompleteClass */
    override def processInertia(): Unit = js.native
    
    /* CompleteClass */
    override def processMouseWheelEvent(
      value: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint,
      isShiftKeyDown: Boolean,
      isControlKeyDown: Boolean
    ): Unit = js.native
    
    /* CompleteClass */
    override def processMoveEvents(value: IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]): Unit = js.native
    
    /* CompleteClass */
    override def processUpEvent(value: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
    
    /* CompleteClass */
    var showGestureFeedback: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureSettings")
  @js.native
  object GestureSettings extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.GestureSettings & Double] = js.native
    
    /* 16 */ val crossSlide: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.crossSlide & Double = js.native
    
    /* 2 */ val doubleTap: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.doubleTap & Double = js.native
    
    /* 6 */ val drag: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.drag & Double = js.native
    
    /* 3 */ val hold: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.hold & Double = js.native
    
    /* 4 */ val holdWithMouse: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.holdWithMouse & Double = js.native
    
    /* 11 */ val manipulationRotate: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationRotate & Double = js.native
    
    /* 14 */ val manipulationRotateInertia: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia & Double = js.native
    
    /* 12 */ val manipulationScale: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationScale & Double = js.native
    
    /* 15 */ val manipulationScaleInertia: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia & Double = js.native
    
    /* 13 */ val manipulationTranslateInertia: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia & Double = js.native
    
    /* 9 */ val manipulationTranslateRailsX: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX & Double = js.native
    
    /* 10 */ val manipulationTranslateRailsY: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY & Double = js.native
    
    /* 7 */ val manipulationTranslateX: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX & Double = js.native
    
    /* 8 */ val manipulationTranslateY: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.none & Double = js.native
    
    /* 5 */ val rightTap: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.rightTap & Double = js.native
    
    /* 1 */ val tap: typingsJapgolly.winrt.Windows.UI.Input.GestureSettings.tap & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingEventArgs")
  @js.native
  open class HoldingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.HoldingEventArgs {
    
    /* CompleteClass */
    var holdingState: HoldingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingState")
  @js.native
  object HoldingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.HoldingState & Double] = js.native
    
    /* 2 */ val canceled: typingsJapgolly.winrt.Windows.UI.Input.HoldingState.canceled & Double = js.native
    
    /* 1 */ val completed: typingsJapgolly.winrt.Windows.UI.Input.HoldingState.completed & Double = js.native
    
    /* 0 */ val started: typingsJapgolly.winrt.Windows.UI.Input.HoldingState.started & Double = js.native
  }
  
  object Inking {
    
    @JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
    @js.native
    open class InkDrawingAttributes ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkDrawingAttributes {
      
      /* CompleteClass */
      var color: Color = js.native
      
      /* CompleteClass */
      var fitToCurve: Boolean = js.native
      
      /* CompleteClass */
      var ignorePressure: Boolean = js.native
      
      /* CompleteClass */
      var penTip: PenTipShape = js.native
      
      /* CompleteClass */
      var size: Size = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkManager")
    @js.native
    open class InkManager ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkManager {
      
      /* CompleteClass */
      override def addStroke(stroke: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def canPasteFromClipboard(): Boolean = js.native
      
      /* CompleteClass */
      override def copySelectedToClipboard(): Unit = js.native
      
      /* CompleteClass */
      override def deleteSelected(): Rect = js.native
      
      /* CompleteClass */
      override def getRecognitionResults(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
      
      /* CompleteClass */
      override def getRecognizers(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
      
      /* CompleteClass */
      override def moveSelected(translation: Point): Rect = js.native
      
      /* CompleteClass */
      override def pasteFromClipboard(position: Point): Rect = js.native
      
      /* CompleteClass */
      override def recognizeAsync(
        strokeCollection: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
        recognitionTarget: InkRecognitionTarget
      ): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
      
      /* CompleteClass */
      override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
      
      /* CompleteClass */
      override def selectWithLine(from: Point, to: Point): Rect = js.native
      
      /* CompleteClass */
      override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
      
      /* CompleteClass */
      override def setDefaultRecognizer(recognizer: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
      
      /* CompleteClass */
      override def updateRecognitionResults(
        recognitionResults: IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult]
      ): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
    @js.native
    object InkManipulationMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkManipulationMode & Double] = js.native
      
      /* 1 */ val erasing: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing & Double = js.native
      
      /* 0 */ val inking: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking & Double = js.native
      
      /* 2 */ val selecting: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
    @js.native
    open class InkRecognitionResult ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult {
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def getTextCandidates(): IVectorView[String] = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
    @js.native
    object InkRecognitionTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget & Double] = js.native
      
      /* 0 */ val all: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all & Double = js.native
      
      /* 2 */ val recent: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent & Double = js.native
      
      /* 1 */ val selected: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizer")
    @js.native
    open class InkRecognizer ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer {
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
    @js.native
    open class InkRecognizerContainer ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizerContainer {
      
      /* CompleteClass */
      override def getRecognizers(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
      
      /* CompleteClass */
      override def recognizeAsync(
        strokeCollection: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
        recognitionTarget: InkRecognitionTarget
      ): IAsyncOperation[IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
      
      /* CompleteClass */
      override def setDefaultRecognizer(recognizer: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStroke")
    @js.native
    open class InkStroke ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke {
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      var drawingAttributes: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkDrawingAttributes = js.native
      
      /* CompleteClass */
      override def getRenderingSegments(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment] = js.native
      
      /* CompleteClass */
      var recognized: Boolean = js.native
      
      /* CompleteClass */
      var selected: Boolean = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
    @js.native
    open class InkStrokeBuilder ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeBuilder {
      
      /* CompleteClass */
      override def appendToStroke(pointerPoint: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): typingsJapgolly.winrt.Windows.UI.Input.PointerPoint = js.native
      
      /* CompleteClass */
      override def beginStroke(pointerPoint: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
      
      /* CompleteClass */
      override def createStroke(points: IIterable[Point]): typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke = js.native
      
      /* CompleteClass */
      override def endStroke(pointerPoint: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint): typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke = js.native
      
      /* CompleteClass */
      override def setDefaultDrawingAttributes(drawingAttributes: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkDrawingAttributes): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
    @js.native
    open class InkStrokeContainer ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeContainer {
      
      /* CompleteClass */
      override def addStroke(stroke: typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def canPasteFromClipboard(): Boolean = js.native
      
      /* CompleteClass */
      override def copySelectedToClipboard(): Unit = js.native
      
      /* CompleteClass */
      override def deleteSelected(): Rect = js.native
      
      /* CompleteClass */
      override def getRecognitionResults(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
      
      /* CompleteClass */
      override def moveSelected(translation: Point): Rect = js.native
      
      /* CompleteClass */
      override def pasteFromClipboard(position: Point): Rect = js.native
      
      /* CompleteClass */
      override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
      
      /* CompleteClass */
      override def selectWithLine(from: Point, to: Point): Rect = js.native
      
      /* CompleteClass */
      override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
      
      /* CompleteClass */
      override def updateRecognitionResults(
        recognitionResults: IVectorView[typingsJapgolly.winrt.Windows.UI.Input.Inking.InkRecognitionResult]
      ): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
    @js.native
    open class InkStrokeRenderingSegment ()
      extends StObject
         with typingsJapgolly.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment {
      
      /* CompleteClass */
      var bezierControlPoint1: Point = js.native
      
      /* CompleteClass */
      var bezierControlPoint2: Point = js.native
      
      /* CompleteClass */
      var position: Point = js.native
      
      /* CompleteClass */
      var pressure: Double = js.native
      
      /* CompleteClass */
      var tiltX: Double = js.native
      
      /* CompleteClass */
      var tiltY: Double = js.native
      
      /* CompleteClass */
      var twist: Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.PenTipShape")
    @js.native
    object PenTipShape extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.Inking.PenTipShape & Double] = js.native
      
      /* 0 */ val circle: typingsJapgolly.winrt.Windows.UI.Input.Inking.PenTipShape.circle & Double = js.native
      
      /* 1 */ val rectangle: typingsJapgolly.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle & Double = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
  @js.native
  open class ManipulationCompletedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.ManipulationCompletedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationInertiaStartingEventArgs")
  @js.native
  open class ManipulationInertiaStartingEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.ManipulationInertiaStartingEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var delta: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
  @js.native
  open class ManipulationStartedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.ManipulationStartedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
  @js.native
  open class ManipulationUpdatedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.ManipulationUpdatedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var delta: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.MouseWheelParameters")
  @js.native
  open class MouseWheelParameters ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.MouseWheelParameters {
    
    /* CompleteClass */
    var charTranslation: Point = js.native
    
    /* CompleteClass */
    var deltaRotationAngle: Double = js.native
    
    /* CompleteClass */
    var deltaScale: Double = js.native
    
    /* CompleteClass */
    var pageTranslation: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerPoint")
  @js.native
  open class PointerPoint ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.PointerPoint {
    
    /* CompleteClass */
    var frameId: Double = js.native
    
    /* CompleteClass */
    var isInContact: Boolean = js.native
    
    /* CompleteClass */
    var pointerDevice: PointerDevice = js.native
    
    /* CompleteClass */
    var pointerId: Double = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var properties: typingsJapgolly.winrt.Windows.UI.Input.PointerPointProperties = js.native
    
    /* CompleteClass */
    var rawPosition: Point = js.native
    
    /* CompleteClass */
    var timestamp: Double = js.native
  }
  /* static members */
  object PointerPoint {
    
    @JSGlobal("Windows.UI.Input.PointerPoint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCurrentPoint(pointerId: Double): typingsJapgolly.winrt.Windows.UI.Input.PointerPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]
    inline def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typingsJapgolly.winrt.Windows.UI.Input.PointerPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]
    
    inline def getIntermediatePoints(pointerId: Double): IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any]).asInstanceOf[IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]]
    inline def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]]
  }
  
  @JSGlobal("Windows.UI.Input.PointerPointProperties")
  @js.native
  open class PointerPointProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.PointerPointProperties {
    
    /* CompleteClass */
    var contactRect: Rect = js.native
    
    /* CompleteClass */
    var contactRectRaw: Rect = js.native
    
    /* CompleteClass */
    override def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
    
    /* CompleteClass */
    override def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
    
    /* CompleteClass */
    var isBarrelButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /* CompleteClass */
    var isEraser: Boolean = js.native
    
    /* CompleteClass */
    var isHorizontalMouseWheel: Boolean = js.native
    
    /* CompleteClass */
    var isInRange: Boolean = js.native
    
    /* CompleteClass */
    var isInverted: Boolean = js.native
    
    /* CompleteClass */
    var isLeftButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isMiddleButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isPrimary: Boolean = js.native
    
    /* CompleteClass */
    var isRightButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isXButton1Pressed: Boolean = js.native
    
    /* CompleteClass */
    var isXButton2Pressed: Boolean = js.native
    
    /* CompleteClass */
    var mouseWheelDelta: Double = js.native
    
    /* CompleteClass */
    var orientation: Double = js.native
    
    /* CompleteClass */
    var pointerUpdateKind: PointerUpdateKind = js.native
    
    /* CompleteClass */
    var pressure: Double = js.native
    
    /* CompleteClass */
    var touchConfidence: Boolean = js.native
    
    /* CompleteClass */
    var twist: Double = js.native
    
    /* CompleteClass */
    var xTilt: Double = js.native
    
    /* CompleteClass */
    var yTilt: Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerUpdateKind")
  @js.native
  object PointerUpdateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind & Double] = js.native
    
    /* 1 */ val leftButtonPressed: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonPressed & Double = js.native
    
    /* 2 */ val leftButtonReleased: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonReleased & Double = js.native
    
    /* 5 */ val middleButtonPressed: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonPressed & Double = js.native
    
    /* 6 */ val middleButtonReleased: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonReleased & Double = js.native
    
    /* 0 */ val other: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.other & Double = js.native
    
    /* 3 */ val rightButtonPressed: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonPressed & Double = js.native
    
    /* 4 */ val rightButtonReleased: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonReleased & Double = js.native
    
    /* 7 */ val xButton1Pressed: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Pressed & Double = js.native
    
    /* 8 */ val xButton1Released: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Released & Double = js.native
    
    /* 9 */ val xButton2Pressed: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Pressed & Double = js.native
    
    /* 10 */ val xButton2Released: typingsJapgolly.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Released & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
  @js.native
  open class PointerVisualizationSettings ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.PointerVisualizationSettings {
    
    /* CompleteClass */
    var isBarrelButtonFeedbackEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isContactFeedbackEnabled: Boolean = js.native
  }
  /* static members */
  object PointerVisualizationSettings {
    
    @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typingsJapgolly.winrt.Windows.UI.Input.PointerVisualizationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typingsJapgolly.winrt.Windows.UI.Input.PointerVisualizationSettings]
  }
  
  @JSGlobal("Windows.UI.Input.RightTappedEventArgs")
  @js.native
  open class RightTappedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.RightTappedEventArgs {
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.TappedEventArgs")
  @js.native
  open class TappedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.UI.Input.TappedEventArgs {
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var tapCount: Double = js.native
  }
}
