package typingsJapgolly.arangodb.Foxx

import typingsJapgolly.arangodb.ArangoDB.Collection
import typingsJapgolly.arangodb.anon.PartialDocumentationRoute
import typingsJapgolly.arangodb.arangodbBooleans.`false`
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends StObject {
  
  var argv: js.Array[Any] = js.native
  
  var basePath: String = js.native
  
  var baseUrl: String = js.native
  
  def collection(name: String): Collection[Any] | Null = js.native
  
  def collectionName(name: String): String = js.native
  
  var collectionPrefix: String = js.native
  
  var configuration: Configuration = js.native
  
  def createDocumentationRouter(): Router = js.native
  def createDocumentationRouter(opts: String): Router = js.native
  def createDocumentationRouter(opts: PartialDocumentationRoute): Router = js.native
  @JSName("createDocumentationRouter")
  def createDocumentationRouter_false(opts: js.Function2[/* req */ Request, /* res */ Response, Unit | `false`]): Router = js.native
  
  var dependencies: Dependencies = js.native
  
  def file(name: String): Buffer = js.native
  def file(name: String, encoding: String): String = js.native
  
  def fileName(name: String): String = js.native
  
  var isDevelopment: Boolean = js.native
  
  var isProduction: Boolean = js.native
  
  var manifest: Manifest = js.native
  
  var mount: String = js.native
  
  def registerType(`type`: String, `def`: TypeDefinition): Unit = js.native
  
  def use(path: String, routerOrMiddleware: Middleware): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Middleware, name: String): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Router): Endpoint = js.native
  def use(path: String, routerOrMiddleware: Router, name: String): Endpoint = js.native
  def use(routerOrMiddleware: Middleware): Endpoint = js.native
  def use(routerOrMiddleware: Middleware, name: String): Endpoint = js.native
  def use(routerOrMiddleware: Router): Endpoint = js.native
  def use(routerOrMiddleware: Router, name: String): Endpoint = js.native
}
