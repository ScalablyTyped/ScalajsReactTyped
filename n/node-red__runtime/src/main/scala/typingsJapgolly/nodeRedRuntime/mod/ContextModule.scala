package typingsJapgolly.nodeRedRuntime.mod

import typingsJapgolly.nodeRedRuntime.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModule extends StObject {
  
  /**
    * Gets the info of an individual node set
    * @param opts
    * @param opts.scope - the scope of the context
    * @param opts.id - the id of the context
    * @param opts.store - the context store
    * @param opts.key - the context key
    * @param opts.req - the request to log (optional)
    */
  def delete(opts: Id): js.Promise[Unit]
  
  /**
    * Gets the info of an individual node set
    * @param opts
    * @param opts.scope - the scope of the context
    * @param opts.id - the id of the context
    * @param opts.store - the context store
    * @param opts.key - the context key
    * @param opts.req - the request to log (optional)
    */
  def getValue(opts: Id): js.Promise[js.Object]
}
object ContextModule {
  
  inline def apply(delete: Id => js.Promise[Unit], getValue: Id => js.Promise[js.Object]): ContextModule = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), getValue = js.Any.fromFunction1(getValue))
    __obj.asInstanceOf[ContextModule]
  }
  
  extension [Self <: ContextModule](x: Self) {
    
    inline def setDelete(value: Id => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setGetValue(value: Id => js.Promise[js.Object]): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
  }
}
