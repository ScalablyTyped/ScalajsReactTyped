package typingsJapgolly.supertest

import typingsJapgolly.superagent.mod.SuperAgent
import typingsJapgolly.superagent.mod.SuperAgentRequest
import typingsJapgolly.supertest.anon.PickRequestuseonsetqueryt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Any): SuperTest[Test] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SuperTest[Test]]
  
  @JSImport("supertest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def agent(): SuperAgentTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")().asInstanceOf[SuperAgentTest]
  inline def agent(app: Any): SuperAgentTest = ^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any]).asInstanceOf[SuperAgentTest]
  inline def agent(app: Any, options: AgentOptions): SuperAgentTest = (^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SuperAgentTest]
  inline def agent(app: Unit, options: AgentOptions): SuperAgentTest = (^.asInstanceOf[js.Dynamic].applyDynamic("agent")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SuperAgentTest]
  
  trait AgentOptions extends StObject {
    
    var ca: js.UndefOr[Any] = js.undefined
  }
  object AgentOptions {
    
    inline def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    extension [Self <: AgentOptions](x: Self) {
      
      inline def setCa(value: Any): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    }
  }
  
  type CallbackHandler = js.Function2[/* err */ Any, /* res */ Response, Unit]
  
  type Request = SuperAgentRequest
  
  type Response = typingsJapgolly.superagent.mod.Response
  
  type SuperAgentTest = SuperTestWithHost[Test] & PickRequestuseonsetqueryt
  
  type SuperTest[T /* <: SuperAgentRequest */] = SuperAgent[T]
  
  @js.native
  trait SuperTestWithHost[T /* <: SuperAgentRequest */]
    extends StObject
       with SuperAgent[T] {
    
    def host(host: String): this.type = js.native
  }
  
  @js.native
  trait Test
    extends StObject
       with SuperAgentRequest {
    
    var app: js.UndefOr[Any] = js.native
    
    def expect(body: String): this.type = js.native
    def expect(body: String, callback: CallbackHandler): this.type = js.native
    def expect(body: js.Object): this.type = js.native
    def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
    def expect(body: js.RegExp): this.type = js.native
    def expect(body: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, Any]): this.type = js.native
    def expect(checker: js.Function1[/* res */ Response, Any], callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: String): this.type = js.native
    def expect(field: String, `val`: String, callback: CallbackHandler): this.type = js.native
    def expect(field: String, `val`: js.RegExp): this.type = js.native
    def expect(field: String, `val`: js.RegExp, callback: CallbackHandler): this.type = js.native
    def expect(status: Double): this.type = js.native
    def expect(status: Double, body: Any): this.type = js.native
    def expect(status: Double, body: Any, callback: CallbackHandler): this.type = js.native
    def expect(status: Double, callback: CallbackHandler): this.type = js.native
    
    def serverAddress(app: Any, path: String): String = js.native
  }
}
