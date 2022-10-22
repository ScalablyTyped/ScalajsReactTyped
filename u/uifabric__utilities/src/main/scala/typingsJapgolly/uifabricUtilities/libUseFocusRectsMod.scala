package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricUtilities.anon.RootRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFocusRectsMod {
  
  @JSImport("@uifabric/utilities/lib/useFocusRects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/useFocusRects", "FocusRects")
  @js.native
  val FocusRects: FunctionComponent[RootRef] = js.native
  
  inline def useFocusRects(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")().asInstanceOf[Unit]
  inline def useFocusRects(rootRef: RefHandle[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusRects")(rootRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
