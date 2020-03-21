package typingsJapgolly.supertestAsPromised

import typingsJapgolly.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest-as-promised", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Test
    extends typingsJapgolly.supertest.mod.Test {
    def timeout(): js.Promise[Response] with this.type = js.native
    def toPromise(): ^[Response] = js.native
  }
  
  def apply(app: js.Any): SuperTest[Test] = js.native
  def agent(): SuperTest[Test] = js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = typingsJapgolly.supertest.mod.Request
  type Response = typingsJapgolly.supertest.mod.Response
  type SuperTest[T /* <: Request */] = typingsJapgolly.supertest.mod.SuperTest[T]
}

