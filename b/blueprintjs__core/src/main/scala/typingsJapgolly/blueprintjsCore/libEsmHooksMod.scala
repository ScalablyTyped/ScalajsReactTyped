package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysUseHotkeysMod.UseHotkeysOptions
import typingsJapgolly.blueprintjsCore.libEsmHooksHotkeysUseHotkeysMod.UseHotkeysReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHooksMod {
  
  @JSImport("@blueprintjs/core/lib/esm/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHotkeys(keys: js.Array[HotkeyConfig]): UseHotkeysReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any]).asInstanceOf[UseHotkeysReturnValue]
  inline def useHotkeys(keys: js.Array[HotkeyConfig], options: UseHotkeysOptions): UseHotkeysReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useHotkeys")(keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseHotkeysReturnValue]
}
