package typingsJapgolly.fluentuiReactWindowProvider

import org.scalajs.dom.Document
import org.scalajs.dom.Window
import typingsJapgolly.fluentuiReactWindowProvider.libWindowProviderMod.WindowProviderProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/react-window-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/react-window-provider", "WindowContext")
  @js.native
  val WindowContext: Context[WindowProviderProps] = js.native
  
  @JSImport("@fluentui/react-window-provider", "WindowProvider")
  @js.native
  val WindowProvider: FunctionComponent[WindowProviderProps] = js.native
  
  inline def useDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDocument")().asInstanceOf[js.UndefOr[Document]]
  
  inline def useWindow(): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindow")().asInstanceOf[js.UndefOr[Window]]
}
