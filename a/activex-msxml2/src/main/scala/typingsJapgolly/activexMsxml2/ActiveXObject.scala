package typingsJapgolly.activexMsxml2

import typingsJapgolly.activexMsxml2.MSXML2.DOMDocument60
import typingsJapgolly.activexMsxml2.MSXML2.FreeThreadedDOMDocument60
import typingsJapgolly.activexMsxml2.activexMsxml2Strings.ondataavailable
import typingsJapgolly.activexMsxml2.activexMsxml2Strings.onreadystatechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: DOMDocument60,
    event: ondataavailable | onreadystatechange,
    handler: js.ThisFunction1[/* this */ DOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: FreeThreadedDOMDocument60,
    event: ondataavailable | onreadystatechange,
    handler: js.ThisFunction1[/* this */ FreeThreadedDOMDocument60, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}
