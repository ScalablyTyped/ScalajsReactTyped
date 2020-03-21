package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGestureRecognizer extends js.Object {
  var autoProcessInertia: Boolean
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
  var oncrosssliding: js.Any
  var ondragging: js.Any
  var onholding: js.Any
  var onmanipulationcompleted: js.Any
  var onmanipulationinertiastarting: js.Any
  var onmanipulationstarted: js.Any
  var onmanipulationupdated: js.Any
  var onrighttapped: js.Any
  var ontapped: js.Any
  var pivotCenter: Point
  var pivotRadius: Double
  var showGestureFeedback: Boolean
  def canBeDoubleTap(value: PointerPoint): Boolean
  def completeGesture(): Unit
  def processDownEvent(value: PointerPoint): Unit
  def processInertia(): Unit
  def processMouseWheelEvent(value: PointerPoint, isShiftKeyDown: Boolean, isControlKeyDown: Boolean): Unit
  def processMoveEvents(value: IVector[PointerPoint]): Unit
  def processUpEvent(value: PointerPoint): Unit
}

object IGestureRecognizer {
  @scala.inline
  def apply(
    autoProcessInertia: Boolean,
    canBeDoubleTap: PointerPoint => CallbackTo[Boolean],
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
    oncrosssliding: js.Any,
    ondragging: js.Any,
    onholding: js.Any,
    onmanipulationcompleted: js.Any,
    onmanipulationinertiastarting: js.Any,
    onmanipulationstarted: js.Any,
    onmanipulationupdated: js.Any,
    onrighttapped: js.Any,
    ontapped: js.Any,
    pivotCenter: Point,
    pivotRadius: Double,
    processDownEvent: PointerPoint => Callback,
    processInertia: Callback,
    processMouseWheelEvent: (PointerPoint, Boolean, Boolean) => Callback,
    processMoveEvents: IVector[PointerPoint] => Callback,
    processUpEvent: PointerPoint => Callback,
    showGestureFeedback: Boolean
  ): IGestureRecognizer = {
    val __obj = js.Dynamic.literal(autoProcessInertia = autoProcessInertia.asInstanceOf[js.Any], crossSlideExact = crossSlideExact.asInstanceOf[js.Any], crossSlideHorizontally = crossSlideHorizontally.asInstanceOf[js.Any], crossSlideThresholds = crossSlideThresholds.asInstanceOf[js.Any], gestureSettings = gestureSettings.asInstanceOf[js.Any], inertiaExpansion = inertiaExpansion.asInstanceOf[js.Any], inertiaExpansionDeceleration = inertiaExpansionDeceleration.asInstanceOf[js.Any], inertiaRotationAngle = inertiaRotationAngle.asInstanceOf[js.Any], inertiaRotationDeceleration = inertiaRotationDeceleration.asInstanceOf[js.Any], inertiaTranslationDeceleration = inertiaTranslationDeceleration.asInstanceOf[js.Any], inertiaTranslationDisplacement = inertiaTranslationDisplacement.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isInertial = isInertial.asInstanceOf[js.Any], manipulationExact = manipulationExact.asInstanceOf[js.Any], mouseWheelParameters = mouseWheelParameters.asInstanceOf[js.Any], oncrosssliding = oncrosssliding.asInstanceOf[js.Any], ondragging = ondragging.asInstanceOf[js.Any], onholding = onholding.asInstanceOf[js.Any], onmanipulationcompleted = onmanipulationcompleted.asInstanceOf[js.Any], onmanipulationinertiastarting = onmanipulationinertiastarting.asInstanceOf[js.Any], onmanipulationstarted = onmanipulationstarted.asInstanceOf[js.Any], onmanipulationupdated = onmanipulationupdated.asInstanceOf[js.Any], onrighttapped = onrighttapped.asInstanceOf[js.Any], ontapped = ontapped.asInstanceOf[js.Any], pivotCenter = pivotCenter.asInstanceOf[js.Any], pivotRadius = pivotRadius.asInstanceOf[js.Any], showGestureFeedback = showGestureFeedback.asInstanceOf[js.Any])
    __obj.updateDynamic("canBeDoubleTap")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => canBeDoubleTap(t0).runNow()))
    __obj.updateDynamic("completeGesture")(completeGesture.toJsFn)
    __obj.updateDynamic("processDownEvent")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => processDownEvent(t0).runNow()))
    __obj.updateDynamic("processInertia")(processInertia.toJsFn)
    __obj.updateDynamic("processMouseWheelEvent")(js.Any.fromFunction3((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint, t1: scala.Boolean, t2: scala.Boolean) => processMouseWheelEvent(t0, t1, t2).runNow()))
    __obj.updateDynamic("processMoveEvents")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Foundation.Collections.IVector[typingsJapgolly.winrt.Windows.UI.Input.PointerPoint]) => processMoveEvents(t0).runNow()))
    __obj.updateDynamic("processUpEvent")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.UI.Input.PointerPoint) => processUpEvent(t0).runNow()))
    __obj.asInstanceOf[IGestureRecognizer]
  }
}

