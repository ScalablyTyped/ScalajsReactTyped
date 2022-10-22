package typingsJapgolly.testcafe.mod.global

import japgolly.scalajs.react.Callback
import typingsJapgolly.testcafe.testcafeStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BrowserOption extends StObject
object _BrowserOption {
  
  inline def BrowserConnection(once: (ready, js.Function) => Callback, url: String): typingsJapgolly.testcafe.mod.global.BrowserConnection = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2((t0: ready, t1: js.Function) => (once(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.testcafe.mod.global.BrowserConnection]
  }
  
  inline def BrowserDescriptor(path: String): typingsJapgolly.testcafe.mod.global.BrowserDescriptor = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.testcafe.mod.global.BrowserDescriptor]
  }
}
