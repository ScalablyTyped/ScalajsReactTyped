package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysContextInstance
import typingsJapgolly.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysProviderProps
import typingsJapgolly.blueprintjsCore.libEsmContextPortalPortalProviderMod.PortalContextOptions
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmContextMod {
  
  @JSImport("@blueprintjs/core/lib/esm/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/context", "HotkeysContext")
  @js.native
  val HotkeysContext: Context[HotkeysContextInstance] = js.native
  
  inline def HotkeysProvider(hasChildrenDialogPropsRenderDialogValue: HotkeysProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysProvider")(hasChildrenDialogPropsRenderDialogValue.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@blueprintjs/core/lib/esm/context", "PortalContext")
  @js.native
  val PortalContext: Context[PortalContextOptions] = js.native
  
  inline def PortalProvider(hasChildrenOptions: PropsWithChildren[PortalContextOptions]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PortalProvider")(hasChildrenOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
}
