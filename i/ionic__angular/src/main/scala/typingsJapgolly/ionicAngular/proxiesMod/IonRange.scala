package typingsJapgolly.ionicAngular.proxiesMod

import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.ionicCore.rangeInterfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonRange")
@js.native
class IonRange protected ()
  extends typingsJapgolly.ionicCore.componentsMod.Components.IonRange {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  /* CompleteClass */
  override var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  override var dualKnobs: Boolean = js.native
  var el: HTMLElement = js.native
  var ionBlur: EventEmitter[CustomEvent] = js.native
  var ionChange: EventEmitter[CustomEvent] = js.native
  var ionFocus: EventEmitter[CustomEvent] = js.native
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  override var max: Double = js.native
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  override var min: Double = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  override var pin: Boolean = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  override var snaps: Boolean = js.native
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  override var step: Double = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  override var ticks: Boolean = js.native
  /**
    * the value of the range.
    */
  /* CompleteClass */
  override var value: RangeValue = js.native
  var z: NgZone = js.native
}

