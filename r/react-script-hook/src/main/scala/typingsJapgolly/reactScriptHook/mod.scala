package typingsJapgolly.reactScriptHook

import typingsJapgolly.reactScriptHook.libUseScriptMod.ErrorState
import typingsJapgolly.reactScriptHook.libUseScriptMod.ScriptProps
import typingsJapgolly.reactScriptHook.libUseScriptMod.ScriptStatusMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-script-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasSrcCheckForExistingAttributes: ScriptProps): js.Tuple2[Boolean, ErrorState] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasSrcCheckForExistingAttributes.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, ErrorState]]
  
  @JSImport("react-script-hook", "scripts")
  @js.native
  val scripts: ScriptStatusMap = js.native
}
