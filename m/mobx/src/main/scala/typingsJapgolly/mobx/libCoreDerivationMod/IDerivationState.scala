package typingsJapgolly.mobx.libCoreDerivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IDerivationState extends js.Object

@JSImport("mobx/lib/core/derivation", "IDerivationState")
@js.native
object IDerivationState extends js.Object {
  @js.native
  sealed trait NOT_TRACKING extends IDerivationState
  
  @js.native
  sealed trait POSSIBLY_STALE extends IDerivationState
  
  @js.native
  sealed trait STALE extends IDerivationState
  
  @js.native
  sealed trait UP_TO_DATE extends IDerivationState
  
  /* -1 */ val NOT_TRACKING: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.NOT_TRACKING with Double = js.native
  /* 1 */ val POSSIBLY_STALE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.POSSIBLY_STALE with Double = js.native
  /* 2 */ val STALE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.STALE with Double = js.native
  /* 0 */ val UP_TO_DATE: typingsJapgolly.mobx.libCoreDerivationMod.IDerivationState.UP_TO_DATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IDerivationState with Double] = js.native
}

