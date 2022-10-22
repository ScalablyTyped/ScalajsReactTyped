package typingsJapgolly.jpm

import typingsJapgolly.jpm.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create HTML iframes, using bundled HTML, CSS and JavaScript,
  * that can be added to a designated area of the Firefox user interface. At the moment you can only add frames to a toolbar
  */
object sdkUiFrameMod {
  
  @JSImport("sdk/ui/frame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Frame(options: Name): typingsJapgolly.jpm.FFAddonSDK.Frame = ^.asInstanceOf[js.Dynamic].applyDynamic("Frame")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jpm.FFAddonSDK.Frame]
}
