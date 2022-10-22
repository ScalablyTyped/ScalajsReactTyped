package typingsJapgolly.jsforce

import typingsJapgolly.jsforce.connectionMod.Callback
import typingsJapgolly.jsforce.connectionMod.Connection
import typingsJapgolly.jsforce.connectionMod.RestApiOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiApexMod {
  
  @JSImport("jsforce/api/apex", "Apex")
  @js.native
  open class Apex protected () extends StObject {
    def this(conn: Connection) = this()
    
    def del[T](path: String): js.Promise[T] = js.native
    def del[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def del[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def del[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    
    def delete[T](path: String): js.Promise[T] = js.native
    def delete[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def delete[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def delete[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    
    def get[T](path: String): js.Promise[T] = js.native
    def get[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def get[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def get[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    
    def patch[T](path: String): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def patch[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    
    def post[T](path: String): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def post[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    
    def put[T](path: String): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def put[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
  }
}
