package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ENotificationSetting extends StObject
@JSImport("steam-user", "ENotificationSetting")
@js.native
object ENotificationSetting extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ENotificationSetting & Double] = js.native
  
  @js.native
  sealed trait Always
    extends StObject
       with ENotificationSetting
  /* 1 */ val Always: typingsJapgolly.steamUser.mod.ENotificationSetting.Always & Double = js.native
  
  @js.native
  sealed trait Never
    extends StObject
       with ENotificationSetting
  /* 2 */ val Never: typingsJapgolly.steamUser.mod.ENotificationSetting.Never & Double = js.native
  
  @js.native
  sealed trait NotifyUseDefault
    extends StObject
       with ENotificationSetting
  /* 0 */ val NotifyUseDefault: typingsJapgolly.steamUser.mod.ENotificationSetting.NotifyUseDefault & Double = js.native
}
