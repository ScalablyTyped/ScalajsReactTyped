package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.anon.DebugThumbTouchArea
import typingsJapgolly.tuyaPanelKit.anon.Duration
import typingsJapgolly.tuyaPanelKit.anon.Height
import typingsJapgolly.tuyaPanelKit.anon.MaximumTrackTintColor
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.normal
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.parcel
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.spring
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SliderProps851987633[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
  
  inline def animateTransitions(value: Boolean): this.type = set("animateTransitions", value.asInstanceOf[js.Any])
  
  inline def animationConfig(value: Duration): this.type = set("animationConfig", value.asInstanceOf[js.Any])
  
  inline def animationType(value: spring | timing): this.type = set("animationType", value.asInstanceOf[js.Any])
  
  inline def canTouchTrack(value: Boolean): this.type = set("canTouchTrack", value.asInstanceOf[js.Any])
  
  inline def debugTouchArea(value: Boolean): this.type = set("debugTouchArea", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  
  inline def maxNounStyle(value: StyleProp[ViewStyle]): this.type = set("maxNounStyle", value.asInstanceOf[js.Any])
  
  inline def maxNounStyleNull: this.type = set("maxNounStyle", null)
  
  inline def maximumTrackTintColor(value: String): this.type = set("maximumTrackTintColor", value.asInstanceOf[js.Any])
  
  inline def maximumValue(value: Double): this.type = set("maximumValue", value.asInstanceOf[js.Any])
  
  inline def minNounStyle(value: StyleProp[ViewStyle]): this.type = set("minNounStyle", value.asInstanceOf[js.Any])
  
  inline def minNounStyleNull: this.type = set("minNounStyle", null)
  
  inline def minimumTrackTintColor(value: String): this.type = set("minimumTrackTintColor", value.asInstanceOf[js.Any])
  
  inline def minimumValue(value: Double): this.type = set("minimumValue", value.asInstanceOf[js.Any])
  
  inline def onLayout(value: /* x */ Double => Callback): this.type = set("onLayout", js.Any.fromFunction1((t0: /* x */ Double) => value(t0).runNow()))
  
  inline def onScrollEvent(value: /* value */ Double => Callback): this.type = set("onScrollEvent", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
  
  inline def onSlidingComplete(value: /* newValue */ Double => Callback): this.type = set("onSlidingComplete", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
  
  inline def onSlidingStart(value: /* newValue */ Double => Callback): this.type = set("onSlidingStart", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
  
  inline def onValueChange(value: /* newValue */ Double => Callback): this.type = set("onValueChange", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
  
  inline def onlyMaximumTrack(value: Boolean): this.type = set("onlyMaximumTrack", value.asInstanceOf[js.Any])
  
  inline def renderMaximumTrack(value: CallbackTo[Node]): this.type = set("renderMaximumTrack", value.toJsFn)
  
  inline def renderMinimumTrack(value: CallbackTo[Node]): this.type = set("renderMinimumTrack", value.toJsFn)
  
  inline def renderThumb(value: CallbackTo[Node]): this.type = set("renderThumb", value.toJsFn)
  
  inline def reverseValue(value: Boolean): this.type = set("reverseValue", value.asInstanceOf[js.Any])
  
  inline def stepValue(value: Double): this.type = set("stepValue", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: DebugThumbTouchArea): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def theme(value: MaximumTrackTintColor): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def thumbStyle(value: StyleProp[ViewStyle]): this.type = set("thumbStyle", value.asInstanceOf[js.Any])
  
  inline def thumbStyleNull: this.type = set("thumbStyle", null)
  
  inline def thumbTintColor(value: String): this.type = set("thumbTintColor", value.asInstanceOf[js.Any])
  
  inline def thumbTouchSize(value: Height): this.type = set("thumbTouchSize", value.asInstanceOf[js.Any])
  
  inline def trackStyle(value: StyleProp[ViewStyle]): this.type = set("trackStyle", value.asInstanceOf[js.Any])
  
  inline def trackStyleNull: this.type = set("trackStyle", null)
  
  inline def `type`(value: normal | parcel): this.type = set("type", value.asInstanceOf[js.Any])
  
  inline def useNoun(value: Boolean): this.type = set("useNoun", value.asInstanceOf[js.Any])
  
  inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
}
