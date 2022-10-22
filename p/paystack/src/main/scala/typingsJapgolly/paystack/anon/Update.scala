package typingsJapgolly.paystack.anon

import typingsJapgolly.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Update extends StObject {
  
  def create(params: Accountnumber): js.Promise[Response] = js.native
  
  def get(id_or_slug: String): js.Promise[Response] = js.native
  def get(id_or_slug: Double): js.Promise[Response] = js.native
  
  def list(): js.Promise[Response] = js.native
  def list(param: Any): js.Promise[Response] = js.native
  
  def update(id_or_slug: String, params: Any): js.Promise[Response] = js.native
  def update(id_or_slug: Double, params: Any): js.Promise[Response] = js.native
}
