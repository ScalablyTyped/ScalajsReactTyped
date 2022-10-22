package typingsJapgolly.winrtUwp.global.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the possible values returned from RenewSystemComponentsAsync . */
@JSGlobal("Windows.Media.Protection.RenewalStatus")
@js.native
object RenewalStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus & Double] = js.native
  
  /* 3 */ val appComponentsMayNeedUpdating: typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus.appComponentsMayNeedUpdating & Double = js.native
  
  /* 4 */ val noComponentsFound: typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus.noComponentsFound & Double = js.native
  
  /* 0 */ val notStarted: typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus.notStarted & Double = js.native
  
  /* 1 */ val updatesInProgress: typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus.updatesInProgress & Double = js.native
  
  /* 2 */ val userCancelled: typingsJapgolly.winrtUwp.Windows.Media.Protection.RenewalStatus.userCancelled & Double = js.native
}
