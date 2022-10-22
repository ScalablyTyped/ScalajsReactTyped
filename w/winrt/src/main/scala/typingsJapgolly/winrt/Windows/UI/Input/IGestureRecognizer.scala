package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGestureRecognizer extends StObject {
  
  var autoProcessInertia: Boolean
  
  def canBeDoubleTap(value: PointerPoint): Boolean
  
  def completeGesture(): Unit
  
  var crossSlideExact: Boolean
  
  var crossSlideHorizontally: Boolean
  
  var crossSlideThresholds: CrossSlideThresholds
  
  var gestureSettings: GestureSettings
  
  var inertiaExpansion: Double
  
  var inertiaExpansionDeceleration: Double
  
  var inertiaRotationAngle: Double
  
  var inertiaRotationDeceleration: Double
  
  var inertiaTranslationDeceleration: Double
  
  var inertiaTranslationDisplacement: Double
  
  var isActive: Boolean
  
  var isInertial: Boolean
  
  var manipulationExact: Boolean
  
  var mouseWheelParameters: MouseWheelParameters
  
  var oncrosssliding: Any
  
  var ondragging: Any
  
  var onholding: Any
  
  var onmanipulationcompleted: Any
  
  var onmanipulationinertiastarting: Any
  
  var onmanipulationstarted: Any
  
  var onmanipulationupdated: Any
  
  var onrighttapped: Any
  
  var ontapped: Any
  
  var pivotCenter: Point
  
  var pivotRadius: Double
  
  def processDownEvent(value: PointerPoint): Unit
  
  def processInertia(): Unit
  
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit
  
  def processMoveEvents(value: IVector[PointerPoint]): Unit
  
  def processUpEvent(value: PointerPoint): Unit
  
  var showGestureFeedback: Boolean
}
object IGestureRecognizer {
  
  inline def apply(
    autoProcessInertia: Boolean,
    canBeDoubleTap: PointerPoint => Boolean,
    completeGesture: Callback,
    crossSlideExact: Boolean,
    crossSlideHorizontally: Boolean,
    crossSlideThresholds: CrossSlideThresholds,
    gestureSettings: GestureSettings,
    inertiaExpansion: Double,
    inertiaExpansionDeceleration: Double,
    inertiaRotationAngle: Double,
    inertiaRotationDeceleration: Double,
    inertiaTranslationDeceleration: Double,
    inertiaTranslationDisplacement: Double,
    isActive: Boolean,
    isInertial: Boolean,
    manipulationExact: Boolean,
    mouseWheelParameters: MouseWheelParameters,
    oncrosssliding: Any,
    ondragging: Any,
    onholding: Any,
    onmanipulationcompleted: Any,
    onmanipulationinertiastarting: Any,
    onmanipulationstarted: Any,
    onmanipulationupdated: Any,
    onrighttapped: Any,
    ontapped: Any,
    pivotCenter: Point,
    pivotRadius: Double,
    processDownEvent: PointerPoint => Callback,
    processInertia: Callback,
    processMouseWheelEvent: (PointerPoint, Boolean, Boolean) => Callback,
    processMoveEvents: IVector[PointerPoint] => Callback,
    processUpEvent: PointerPoint => Callback,
    showGestureFeedback: Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia.asInstanceOf[js.Any], canBeDoubleTap = js.Any.fromFunction1(canBeDoubleTap), completeGesture = completeGesture.toJsFn, crossSlideExact = crossSlideExact.asInstanceOf[js.Any], crossSlideHorizontally = crossSlideHorizontally.asInstanceOf[js.Any], crossSlideThresholds = crossSlideThresholds.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], inertiaExpansion = inertiaExpansion.asInstanceOf[js.Any], inertiaExpansionDeceleration = inertiaExpansionDeceleration.asInstanceOf[js.Any], inertiaRotationAngle = inertiaRotationAngle.asInstanceOf[js.Any], inertiaRotationDeceleration = inertiaRotationDeceleration.asInstanceOf[js.Any], inertiaTranslationDeceleration = inertiaTranslationDeceleration.asInstanceOf[js.Any], inertiaTranslationDisplacement = inertiaTranslationDisplacement.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isInertial = isInertial.asInstanceOf[js.Any], manipulationExact = manipulationExact.asInstanceOf[js.Any], mouseWheelParameters = mouseWheelParameters.asInstanceOf[js.Any], oncrosssliding = oncrosssliding.asInstanceOf[js.Any], ondragging = ondragging.asInstanceOf[js.Any], onholding = onholding.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationinertiastarting = onmanipulationinertiastarting.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onrighttapped = onrighttapped.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], pivotCenter = pivotCenter.asInstanceOf[js.Any], pivotRadius = pivotRadius.asInstanceOf[js.Any], processDownEvent = js.Any.fromFunction1((t0: PointerPoint) => processDownEvent(t0).runNow()), processInertia = processInertia.toJsFn, processMouseWheelEvent = js.Any.fromFunction3((t0: PointerPoint, t1: Boolean, t2: Boolean) => (processMouseWheelEvent(t0, t1, t2)).runNow()), processMoveEvents = js.Any.fromFunction1((t0: IVector[PointerPoint]) => processMoveEvents(t0).runNow()), processUpEvent = js.Any.fromFunction1((t0: PointerPoint) => processUpEvent(t0).runNow()), showGestureFeedback = showGestureFeedback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGestureRecognizer]
  }
  
  extension [Self <: IGestureRecognizer](x: Self) {
    
    inline def setAutoProcessInertia(value: Boolean): Self = StObject.set(x, "autoProcessInertia", value.asInstanceOf[js.Any])
    
    inline def setCanBeDoubleTap(value: PointerPoint => Boolean): Self = StObject.set(x, "canBeDoubleTap", js.Any.fromFunction1(value))
    
    inline def setCompleteGesture(value: Callback): Self = StObject.set(x, "completeGesture", value.toJsFn)
    
    inline def setCrossSlideExact(value: Boolean): Self = StObject.set(x, "crossSlideExact", value.asInstanceOf[js.Any])
    
    inline def setCrossSlideHorizontally(value: Boolean): Self = StObject.set(x, "crossSlideHorizontally", value.asInstanceOf[js.Any])
    
    inline def setCrossSlideThresholds(value: CrossSlideThresholds): Self = StObject.set(x, "crossSlideThresholds", value.asInstanceOf[js.Any])
    
    inline def setGestureSettings(value: GestureSettings): Self = StObject.set(x, "gestureSettings", value.asInstanceOf[js.Any])
    
    inline def setInertiaExpansion(value: Double): Self = StObject.set(x, "inertiaExpansion", value.asInstanceOf[js.Any])
    
    inline def setInertiaExpansionDeceleration(value: Double): Self = StObject.set(x, "inertiaExpansionDeceleration", value.asInstanceOf[js.Any])
    
    inline def setInertiaRotationAngle(value: Double): Self = StObject.set(x, "inertiaRotationAngle", value.asInstanceOf[js.Any])
    
    inline def setInertiaRotationDeceleration(value: Double): Self = StObject.set(x, "inertiaRotationDeceleration", value.asInstanceOf[js.Any])
    
    inline def setInertiaTranslationDeceleration(value: Double): Self = StObject.set(x, "inertiaTranslationDeceleration", value.asInstanceOf[js.Any])
    
    inline def setInertiaTranslationDisplacement(value: Double): Self = StObject.set(x, "inertiaTranslationDisplacement", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsInertial(value: Boolean): Self = StObject.set(x, "isInertial", value.asInstanceOf[js.Any])
    
    inline def setManipulationExact(value: Boolean): Self = StObject.set(x, "manipulationExact", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelParameters(value: MouseWheelParameters): Self = StObject.set(x, "mouseWheelParameters", value.asInstanceOf[js.Any])
    
    inline def setOncrosssliding(value: Any): Self = StObject.set(x, "oncrosssliding", value.asInstanceOf[js.Any])
    
    inline def setOndragging(value: Any): Self = StObject.set(x, "ondragging", value.asInstanceOf[js.Any])
    
    inline def setOnholding(value: Any): Self = StObject.set(x, "onholding", value.asInstanceOf[js.Any])
    
    inline def setOnmanipulationcompleted(value: Any): Self = StObject.set(x, "onmanipulationcompleted", value.asInstanceOf[js.Any])
    
    inline def setOnmanipulationinertiastarting(value: Any): Self = StObject.set(x, "onmanipulationinertiastarting", value.asInstanceOf[js.Any])
    
    inline def setOnmanipulationstarted(value: Any): Self = StObject.set(x, "onmanipulationstarted", value.asInstanceOf[js.Any])
    
    inline def setOnmanipulationupdated(value: Any): Self = StObject.set(x, "onmanipulationupdated", value.asInstanceOf[js.Any])
    
    inline def setOnrighttapped(value: Any): Self = StObject.set(x, "onrighttapped", value.asInstanceOf[js.Any])
    
    inline def setOntapped(value: Any): Self = StObject.set(x, "ontapped", value.asInstanceOf[js.Any])
    
    inline def setPivotCenter(value: Point): Self = StObject.set(x, "pivotCenter", value.asInstanceOf[js.Any])
    
    inline def setPivotRadius(value: Double): Self = StObject.set(x, "pivotRadius", value.asInstanceOf[js.Any])
    
    inline def setProcessDownEvent(value: PointerPoint => Callback): Self = StObject.set(x, "processDownEvent", js.Any.fromFunction1((t0: PointerPoint) => value(t0).runNow()))
    
    inline def setProcessInertia(value: Callback): Self = StObject.set(x, "processInertia", value.toJsFn)
    
    inline def setProcessMouseWheelEvent(value: (PointerPoint, Boolean, Boolean) => Callback): Self = StObject.set(x, "processMouseWheelEvent", js.Any.fromFunction3((t0: PointerPoint, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setProcessMoveEvents(value: IVector[PointerPoint] => Callback): Self = StObject.set(x, "processMoveEvents", js.Any.fromFunction1((t0: IVector[PointerPoint]) => value(t0).runNow()))
    
    inline def setProcessUpEvent(value: PointerPoint => Callback): Self = StObject.set(x, "processUpEvent", js.Any.fromFunction1((t0: PointerPoint) => value(t0).runNow()))
    
    inline def setShowGestureFeedback(value: Boolean): Self = StObject.set(x, "showGestureFeedback", value.asInstanceOf[js.Any])
  }
}
