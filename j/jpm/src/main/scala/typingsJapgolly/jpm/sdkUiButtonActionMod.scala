package typingsJapgolly.jpm

import typingsJapgolly.jpm.anon.Badge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Add a button to the Firefox user interface
  * With this module you can create buttons that display icons and can respond to click events
  */
object sdkUiButtonActionMod {
  
  @JSImport("sdk/ui/button/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ActionButton(options: Badge): typingsJapgolly.jpm.FFAddonSDK.ActionButton = ^.asInstanceOf[js.Dynamic].applyDynamic("ActionButton")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jpm.FFAddonSDK.ActionButton]
}
