package typingsJapgolly.koa2SessionRedis

import typingsJapgolly.koa2SessionRedis.anon.PartialSessionexpirenumbe
import typingsJapgolly.koa2SessionRedis.koa2SessionRedisStrings.session
import typingsJapgolly.koaSession.mod.stores
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa2-session-redis", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RedisStore {
    def this(config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Redis.ClientOpts */ Any) = this()
  }
  
  @js.native
  trait RedisStore
    extends StObject
       with stores {
    
    /**
      * get session object by key
      */
    def get(key: String): Any = js.native
    
    /**
      * sends the quit command to the redis server and ends cleanly right after all running commands were properly handled
      */
    def quit(): Unit = js.native
    
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(key: String, sess: PartialSessionexpirenumbe): Any = js.native
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double): Any = js.native
    @JSName("set")
    def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session): Any = js.native
  }
}
