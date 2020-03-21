package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreNumbers.`1023`
import typingsJapgolly.angularCore.angularCoreNumbers.`1024`
import typingsJapgolly.angularCore.angularCoreNumbers.`10`
import typingsJapgolly.angularCore.angularCoreNumbers.`128`
import typingsJapgolly.angularCore.angularCoreNumbers.`16`
import typingsJapgolly.angularCore.angularCoreNumbers.`1`
import typingsJapgolly.angularCore.angularCoreNumbers.`256`
import typingsJapgolly.angularCore.angularCoreNumbers.`32`
import typingsJapgolly.angularCore.angularCoreNumbers.`3`
import typingsJapgolly.angularCore.angularCoreNumbers.`4`
import typingsJapgolly.angularCore.angularCoreNumbers.`512`
import typingsJapgolly.angularCore.angularCoreNumbers.`64`
import typingsJapgolly.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags associated with an LView (saved in LView[FLAGS]) */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreNumbers.`1`
  - typingsJapgolly.angularCore.angularCoreNumbers.`3`
  - typingsJapgolly.angularCore.angularCoreNumbers.`4`
  - typingsJapgolly.angularCore.angularCoreNumbers.`8`
  - typingsJapgolly.angularCore.angularCoreNumbers.`16`
  - typingsJapgolly.angularCore.angularCoreNumbers.`32`
  - typingsJapgolly.angularCore.angularCoreNumbers.`64`
  - typingsJapgolly.angularCore.angularCoreNumbers.`128`
  - typingsJapgolly.angularCore.angularCoreNumbers.`256`
  - typingsJapgolly.angularCore.angularCoreNumbers.`512`
  - typingsJapgolly.angularCore.angularCoreNumbers.`1024`
  - typingsJapgolly.angularCore.angularCoreNumbers.`10`
  - typingsJapgolly.angularCore.angularCoreNumbers.`1023`
*/
trait LViewFlags extends js.Object

object LViewFlags {
  /** Whether or not this view is currently attached to change detection tree. */
  @scala.inline
  def Attached: `128` = this.cast(128)
  /** Whether this view has default change detection strategy (checks always) or onPush */
  @scala.inline
  def CheckAlways: `16` = this.cast(16)
  /**
    * Whether or not the view is in creationMode.
    *
    * This must be stored in the view rather than using `data` as a marker so that
    * we can properly support embedded views. Otherwise, when exiting a child view
    * back into the parent view, `data` will be defined and `creationMode` will be
    * improperly reported as false.
    */
  @scala.inline
  def CreationMode: `4` = this.cast(4)
  /** Whether or not this view is destroyed. */
  @scala.inline
  def Destroyed: `256` = this.cast(256)
  /** Whether or not this view is currently dirty (needing check) */
  @scala.inline
  def Dirty: `64` = this.cast(64)
  /**
    * Whether or not this LView instance is on its first processing pass.
    *
    * An LView instance is considered to be on its "first pass" until it
    * has completed one creation mode run and one update mode run. At this
    * time, the flag is turned off.
    */
  @scala.inline
  def FirstLViewPass: `8` = this.cast(8)
  /**
    * Index of the current init phase on last 22 bits
    */
  @scala.inline
  def IndexWithinInitPhaseIncrementer: `1024` = this.cast(1024)
  @scala.inline
  def IndexWithinInitPhaseReset: `1023` = this.cast(1023)
  @scala.inline
  def IndexWithinInitPhaseShift: `10` = this.cast(10)
  /** The state of the init phase on the first 2 bits */
  @scala.inline
  def InitPhaseStateIncrementer: `1` = this.cast(1)
  @scala.inline
  def InitPhaseStateMask: `3` = this.cast(3)
  /** Whether or not this view is the root view */
  @scala.inline
  def IsRoot: `512` = this.cast(512)
  /**
    * Whether or not manual change detection is turned on for onPush components.
    *
    * This is a special mode that only marks components dirty in two cases:
    * 1) There has been a change to an @Input property
    * 2) `markDirty()` has been called manually by the user
    *
    * Note that in this mode, the firing of events does NOT mark components
    * dirty automatically.
    *
    * Manual mode is turned off by default for backwards compatibility, as events
    * automatically mark OnPush components dirty in View Engine.
    *
    * TODO: Add a public API to ChangeDetectionStrategy to turn this mode on
    */
  @scala.inline
  def ManualOnPush: `32` = this.cast(32)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

