package typingsJapgolly.ionicCore.distTypesComponentsMod.LocalJSX

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.IonRangeCustomEvent
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.PinFormatter
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeKnobMoveEndEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeKnobMoveStartEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeValue
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRange extends StObject {
  
  /**
    * The start position of the range active bar. This feature is only available with a single knob (dualKnobs="false"). Valid values are greater than or equal to the min value and less than or equal to the max value.
    */
  var activeBarStart: js.UndefOr[Double] = js.undefined
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  var debounce: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Show two knobs.
    */
  var dualKnobs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Maximum integer value of the range.
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum integer value of the range.
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Emitted when the range loses focus.
    */
  var onIonBlur: js.UndefOr[js.Function1[/* event */ IonRangeCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the value property has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ IonRangeCustomEvent[RangeChangeEventDetail], Unit]] = js.undefined
  
  /**
    * Emitted when the range has focus.
    */
  var onIonFocus: js.UndefOr[js.Function1[/* event */ IonRangeCustomEvent[Unit], Unit]] = js.undefined
  
  /**
    * Emitted when the user finishes moving the range knob, whether through mouse drag, touch gesture, or keyboard interaction.
    */
  var onIonKnobMoveEnd: js.UndefOr[js.Function1[/* event */ IonRangeCustomEvent[RangeKnobMoveEndEventDetail], Unit]] = js.undefined
  
  /**
    * Emitted when the user starts moving the range knob, whether through mouse drag, touch gesture, or keyboard interaction.
    */
  var onIonKnobMoveStart: js.UndefOr[
    js.Function1[/* event */ IonRangeCustomEvent[RangeKnobMoveStartEventDetail], Unit]
  ] = js.undefined
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  var pin: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A callback used to format the pin text. By default the pin text is set to `Math.round(value)`.
    */
  var pinFormatter: js.UndefOr[PinFormatter] = js.undefined
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  var snaps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value granularity.
    */
  var step: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  var ticks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the value of the range.
    */
  var value: js.UndefOr[RangeValue] = js.undefined
}
object IonRange {
  
  inline def apply(): IonRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRange]
  }
  
  extension [Self <: IonRange](x: Self) {
    
    inline def setActiveBarStart(value: Double): Self = StObject.set(x, "activeBarStart", value.asInstanceOf[js.Any])
    
    inline def setActiveBarStartUndefined: Self = StObject.set(x, "activeBarStart", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
    
    inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDualKnobs(value: Boolean): Self = StObject.set(x, "dualKnobs", value.asInstanceOf[js.Any])
    
    inline def setDualKnobsUndefined: Self = StObject.set(x, "dualKnobs", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnIonBlur(value: /* event */ IonRangeCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonBlur", js.Any.fromFunction1((t0: /* event */ IonRangeCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonBlurUndefined: Self = StObject.set(x, "onIonBlur", js.undefined)
    
    inline def setOnIonChange(value: /* event */ IonRangeCustomEvent[RangeChangeEventDetail] => Callback): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1((t0: /* event */ IonRangeCustomEvent[RangeChangeEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    inline def setOnIonFocus(value: /* event */ IonRangeCustomEvent[Unit] => Callback): Self = StObject.set(x, "onIonFocus", js.Any.fromFunction1((t0: /* event */ IonRangeCustomEvent[Unit]) => value(t0).runNow()))
    
    inline def setOnIonFocusUndefined: Self = StObject.set(x, "onIonFocus", js.undefined)
    
    inline def setOnIonKnobMoveEnd(value: /* event */ IonRangeCustomEvent[RangeKnobMoveEndEventDetail] => Callback): Self = StObject.set(x, "onIonKnobMoveEnd", js.Any.fromFunction1((t0: /* event */ IonRangeCustomEvent[RangeKnobMoveEndEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonKnobMoveEndUndefined: Self = StObject.set(x, "onIonKnobMoveEnd", js.undefined)
    
    inline def setOnIonKnobMoveStart(value: /* event */ IonRangeCustomEvent[RangeKnobMoveStartEventDetail] => Callback): Self = StObject.set(x, "onIonKnobMoveStart", js.Any.fromFunction1((t0: /* event */ IonRangeCustomEvent[RangeKnobMoveStartEventDetail]) => value(t0).runNow()))
    
    inline def setOnIonKnobMoveStartUndefined: Self = StObject.set(x, "onIonKnobMoveStart", js.undefined)
    
    inline def setPin(value: Boolean): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setPinFormatter(value: /* value */ Double => Double | String): Self = StObject.set(x, "pinFormatter", js.Any.fromFunction1(value))
    
    inline def setPinFormatterUndefined: Self = StObject.set(x, "pinFormatter", js.undefined)
    
    inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
    
    inline def setSnaps(value: Boolean): Self = StObject.set(x, "snaps", value.asInstanceOf[js.Any])
    
    inline def setSnapsUndefined: Self = StObject.set(x, "snaps", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTicks(value: Boolean): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
