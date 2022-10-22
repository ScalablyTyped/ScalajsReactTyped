package typingsJapgolly.webdriverio

import org.scalajs.dom.Element
import typingsJapgolly.webdriverio.buildTypesMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBrowser$Mod {
  
  @JSImport("webdriverio/build/commands/browser/$", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selector: Selector): js.Promise[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Element]]
}
