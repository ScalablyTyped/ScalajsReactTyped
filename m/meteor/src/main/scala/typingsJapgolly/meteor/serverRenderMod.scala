package typingsJapgolly.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverRenderMod {
  
  @JSImport("meteor/server-render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onPageLoad[T /* <: typingsJapgolly.meteor.serverRenderMod.Callback */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageLoad")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  type Callback = js.Function1[/* sink */ typingsJapgolly.meteor.serverRenderMod.Sink, js.Promise[Any] | Any]
  
  @js.native
  trait ClientSink
    extends StObject
       with typingsJapgolly.meteor.serverRenderMod.Sink {
    
    def appendToBody(html: typingsJapgolly.meteor.serverRenderMod.Content): Unit = js.native
    
    def appendToElementById(id: String, html: typingsJapgolly.meteor.serverRenderMod.Content): Unit = js.native
    
    // Client and server. Only client
    def appendToHead(html: typingsJapgolly.meteor.serverRenderMod.Content): Unit = js.native
    
    def getCookies(): StringDictionary[String] = js.native
    
    def getHeaders(): IncomingHttpHeaders = js.native
    
    def redirect(location: String): Unit = js.native
    def redirect(location: String, code: Double): Unit = js.native
    
    def renderIntoElementById(id: String, html: typingsJapgolly.meteor.serverRenderMod.Content): Unit = js.native
    
    def setHeader(key: String, value: String): Unit = js.native
    def setHeader(key: String, value: js.Array[String]): Unit = js.native
    def setHeader(key: String, value: Double): Unit = js.native
    
    // Server-only, but error-raising stubs provided to client:
    def setStatusCode(code: Double): Unit = js.native
  }
  
  // NodeJS.ReadableStream only works on server.
  // HTMLElement only works on client.
  type Content = String | js.Array[Any] | ReadableStream | HTMLElement
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.meteor.serverRenderMod.Sink because Already inherited */ @js.native
  trait ServerSink
    extends StObject
       with typingsJapgolly.meteor.serverRenderMod.ClientSink {
    
    var arch: String = js.native
    
    var body: String = js.native
    
    var head: String = js.native
    
    var htmlById: StringDictionary[String] = js.native
    
    var maybeMadeChanges: Boolean = js.native
    
    // Server-only:
    var request: IncomingMessage = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.meteor.serverRenderMod.ClientSink
    - typingsJapgolly.meteor.serverRenderMod.ServerSink
  */
  trait Sink extends StObject
}
