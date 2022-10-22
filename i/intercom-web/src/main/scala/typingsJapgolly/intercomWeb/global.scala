package typingsJapgolly.intercomWeb

import typingsJapgolly.intercomWeb.Intercom.IntercomSettings
import typingsJapgolly.intercomWeb.Intercom.IntercomStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Intercom")
  @js.native
  def Intercom: IntercomStatic = js.native
  inline def Intercom_=(x: IntercomStatic): Unit = js.Dynamic.global.updateDynamic("Intercom")(x.asInstanceOf[js.Any])
  
  @JSGlobal("intercomSettings")
  @js.native
  def intercomSettings: js.UndefOr[IntercomSettings] = js.native
  inline def intercomSettings_=(x: js.UndefOr[IntercomSettings]): Unit = js.Dynamic.global.updateDynamic("intercomSettings")(x.asInstanceOf[js.Any])
}
