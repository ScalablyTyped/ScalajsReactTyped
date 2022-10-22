package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRangeElement
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.PinFormatter
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeKnobMoveEndEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeKnobMoveStartEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeValue
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRangeRangeMod {
  
  @JSImport("@ionic/core/dist/types/components/range/range", "Range")
  @js.native
  open class Range ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The start position of the range active bar. This feature is only available with a single knob (dualKnobs="false").
      * Valid values are greater than or equal to the min value and less than or equal to the max value.
      */
    var activeBarStart: js.UndefOr[Double] = js.native
    
    /* protected */ def activeBarStartChanged(): Unit = js.native
    
    /* private */ var clampBounds: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MRange(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MRange(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRange(): Unit = js.native
    
    /* private */ var contentEl: Any = js.native
    
    /**
      * How long, in milliseconds, to wait to trigger the
      * `ionChange` event after each change in the range value.
      * This also impacts form bindings such as `ngModel` or `v-model`.
      */
    var debounce: Double = js.native
    
    /* protected */ def debounceChanged(): Unit = js.native
    
    /* private */ var didLoad: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the range.
      */
    var disabled: Boolean = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRange(): Unit = js.native
    
    /**
      * Show two knobs.
      */
    var dualKnobs: Boolean = js.native
    
    var el: HTMLIonRangeElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var ensureValueInBounds: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var getValue: Any = js.native
    
    /* private */ var handleKeyboard: Any = js.native
    
    /* private */ var hasFocus: Any = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /* private */ var initialContentScrollY: Any = js.native
    
    /**
      * Emitted when the range loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[RangeChangeEventDetail] = js.native
    
    /**
      * Emitted when the range has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user finishes moving the range knob, whether through
      * mouse drag, touch gesture, or keyboard interaction.
      */
    var ionKnobMoveEnd: EventEmitter[RangeKnobMoveEndEventDetail] = js.native
    
    /**
      * Emitted when the user starts moving the range knob, whether through
      * mouse drag, touch gesture, or keyboard interaction.
      */
    var ionKnobMoveStart: EventEmitter[RangeKnobMoveStartEventDetail] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * Maximum integer value of the range.
      */
    var max: Double = js.native
    
    /* protected */ def maxChanged(): Unit = js.native
    
    /**
      * Minimum integer value of the range.
      */
    var min: Double = js.native
    
    /* protected */ def minChanged(): Unit = js.native
    
    /**
      * The name of the control, which is submitted with the form data.
      */
    var name: String = js.native
    
    /* private */ var noUpdate: Any = js.native
    
    /* private */ var onBlur: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onFocus: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /**
      * If `true`, a pin with integer value is shown when the knob
      * is pressed.
      */
    var pin: Boolean = js.native
    
    /**
      * A callback used to format the pin text.
      * By default the pin text is set to `Math.round(value)`.
      */
    def pinFormatter(value: Double): Double | String = js.native
    /**
      * A callback used to format the pin text.
      * By default the pin text is set to `Math.round(value)`.
      */
    @JSName("pinFormatter")
    var pinFormatter_Original: PinFormatter = js.native
    
    /* private */ var pressedKnob: Any = js.native
    
    /* private */ var rangeId: Any = js.native
    
    /* private */ var rangeSlider: Any = js.native
    
    /* private */ var ratioA: Any = js.native
    
    /* private */ var ratioB: Any = js.native
    
    /* private */ def ratioLower: Any = js.native
    
    /* private */ def ratioUpper: Any = js.native
    
    /* private */ var rect: Any = js.native
    
    @JSName("render")
    def render_MRange(): Any = js.native
    
    /* private */ var setFocus: Any = js.native
    
    /* private */ var setupGesture: Any = js.native
    
    /**
      * If `true`, the knob snaps to tick marks evenly spaced based
      * on the step property value.
      */
    var snaps: Boolean = js.native
    
    /**
      * Specifies the value granularity.
      */
    var step: Double = js.native
    
    /**
      * If `true`, tick marks are displayed based on the step value.
      * Only applies when `snaps` is `true`.
      */
    var ticks: Boolean = js.native
    
    /* private */ var update: Any = js.native
    
    /* private */ var updateRatio: Any = js.native
    
    /* private */ var updateValue: Any = js.native
    
    /* private */ def valA: Any = js.native
    
    /* private */ def valB: Any = js.native
    
    /**
      * the value of the range.
      */
    var value: RangeValue = js.native
    
    /* protected */ def valueChanged(value: RangeValue): Unit = js.native
  }
}
