package typingsJapgolly.supertestAsPromised

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Any): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest[Test]]
  
  @JSImport("supertest-as-promised", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def agent(): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")().asInstanceOf[SuperTest[Test]]
  inline def agent(app: Any): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest[Test]]
  
  type CallbackHandler = js.Function2[/* err */ Any, /* res */ Response, Unit]
  
  type Request = typingsJapgolly.supertest.mod.Request
  
  type Response = typingsJapgolly.supertest.mod.Response
  
  type SuperTest[T /* <: Request */] = typingsJapgolly.supertest.mod.SuperTest[T]
  
  @js.native
  trait Test
    extends StObject
       with typingsJapgolly.supertest.mod.Test {
    
    def timeout(): js.Promise[Response] & this.type = js.native
    
    def toPromise(): typingsJapgolly.bluebird.mod.^[Response] = js.native
  }
}
