package typingsJapgolly.useGestureCore

import org.scalajs.dom.EventTarget
import org.scalajs.dom.Window
import typingsJapgolly.useGestureCore.anon.CapturePassive
import typingsJapgolly.useGestureCore.anon.Passive
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesUtilsMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigSharedConfigResolverMod {
  
  object sharedConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/sharedConfigResolver", "sharedConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(): CapturePassive = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")().asInstanceOf[CapturePassive]
    inline def eventOptions(hasPassiveCapture: Passive): CapturePassive = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(hasPassiveCapture.asInstanceOf[js.Any]).asInstanceOf[CapturePassive]
    
    inline def target(value: Target): js.UndefOr[js.Function0[EventTarget | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[EventTarget | Null]]]
    
    inline def transform(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def window(): js.UndefOr[Window & (/* globalThis */ Any)] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")().asInstanceOf[js.UndefOr[Window & (/* globalThis */ Any)]]
    inline def window(value: Window & (/* globalThis */ Any)): js.UndefOr[Window & (/* globalThis */ Any)] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Window & (/* globalThis */ Any)]]
  }
}
