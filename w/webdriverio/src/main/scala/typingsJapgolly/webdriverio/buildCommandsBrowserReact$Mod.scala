package typingsJapgolly.webdriverio

import org.scalajs.dom.Element
import typingsJapgolly.webdriverio.buildTypesMod.ReactSelectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowserReact$Mod {
  
  @JSImport("webdriverio/build/commands/browser/react$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: String): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
  inline def default(selector: String, hasPropsState: ReactSelectorOptions): js.Promise[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], hasPropsState.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Element]]
}
