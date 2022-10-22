package typingsJapgolly.firebaseFirestore.anon

import org.scalajs.dom.RequestInit
import org.scalajs.dom.Response
import org.scalajs.dom.URL
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(input: URL): js.Promise[Response] = js.native
  def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  def apply(input: RequestInfo): js.Promise[Response] = js.native
  def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
}
