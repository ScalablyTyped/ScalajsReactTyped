package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.ActiveBarStart
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-range`
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.PinFormatter
import typingsJapgolly.ionicCore.distTypesComponentsRangeRangeInterfaceMod.RangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonRange")
@js.native
open class IonRange protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonRange {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  var dualKnobs: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Emitted when the range loses focus.
    */
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the value property has changed.
    */
  var ionChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the range has focus.
    */
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user finishes moving the range knob, whether through
    mouse drag, touch gesture, or keyboard interaction.
    */
  var ionKnobMoveEnd: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user starts moving the range knob, whether through
    mouse drag, touch gesture, or keyboard interaction.
    */
  var ionKnobMoveStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  var max: Double = js.native
  
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  var min: Double = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  var pin: Boolean = js.native
  
  /**
    * A callback used to format the pin text. By default the pin text is set to `Math.round(value)`.
    */
  /* CompleteClass */
  override def pinFormatter(value: Double): Double | String = js.native
  /**
    * A callback used to format the pin text. By default the pin text is set to `Math.round(value)`.
    */
  /* CompleteClass */
  @JSName("pinFormatter")
  var pinFormatter_Original: PinFormatter = js.native
  
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  var snaps: Boolean = js.native
  
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  var step: Double = js.native
  
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  var ticks: Boolean = js.native
  
  /**
    * the value of the range.
    */
  /* CompleteClass */
  var value: RangeValue = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonRange {
  
  @JSImport("@ionic/angular/directives/proxies", "IonRange")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonRange.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonRange, 
    `ion-range`, 
    scala.Nothing, 
    ActiveBarStart, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonRange, 
      `ion-range`, 
      scala.Nothing, 
      ActiveBarStart, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonRange.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonRange, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonRange, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
