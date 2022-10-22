package typingsJapgolly.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResource extends StObject {
  
  def action(action: String): GetResource = js.native
  
  def id(value: String): GetResource = js.native
  def id(value: Double): GetResource = js.native
  
  def request(): js.Promise[GetResponse] = js.native
  def request(params: js.Object): js.Promise[GetResponse] = js.native
  def request(params: js.Object, callback: js.Function2[/* error */ js.Error, /* res */ GetResponse, Unit]): js.Promise[GetResponse] = js.native
  def request(params: Unit, callback: js.Function2[/* error */ js.Error, /* res */ GetResponse, Unit]): js.Promise[GetResponse] = js.native
}
