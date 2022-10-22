package typingsJapgolly.jpm

import typingsJapgolly.jpm.anon.BadgeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a toggle button to the Firefox user interface
  * With this module you can create buttons that function like a check box, representing an on/off choice
  */
object sdkUiButtonToggleMod {
  
  @JSImport("sdk/ui/button/toggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ToggleButton(options: BadgeColor): typingsJapgolly.jpm.FFAddonSDK.ToggleButton = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleButton")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jpm.FFAddonSDK.ToggleButton]
}
