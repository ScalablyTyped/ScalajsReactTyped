package typingsJapgolly.jasmineAjax

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JasmineAjaxRequest
  extends StObject
     with XMLHttpRequest {
  
  def data(): String | js.Object = js.native
  
  var method: String = js.native
  
  var overriddenMimeType: String = js.native
  
  var params: Any = js.native
  
  var password: String = js.native
  
  var requestHeaders: StringDictionary[String] = js.native
  
  def respondWith(response: JasmineAjaxResponse): Unit = js.native
  
  def responseError(): Unit = js.native
  def responseError(options: JasmineAjaxRequestStubErrorOptions): Unit = js.native
  
  def responseTimeout(): Unit = js.native
  
  var url: String = js.native
  
  var username: String = js.native
}
