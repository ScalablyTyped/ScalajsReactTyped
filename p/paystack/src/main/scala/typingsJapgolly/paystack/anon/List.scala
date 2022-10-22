package typingsJapgolly.paystack.anon

import typingsJapgolly.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List extends StObject {
  
  def create(params: Amount): js.Promise[Response] = js.native
  
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  
  def list(): js.Promise[Response] = js.native
  
  def update(id: String, params: Any): js.Promise[Response] = js.native
  def update(id: Double, params: Any): js.Promise[Response] = js.native
}
