package typingsJapgolly.wordpressAdmin.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.backbone.mod.ModelSetOptions
import typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Get extends StObject {
  
  def get(props: Any, options: Any): Query
  
  def hasMore(): Boolean
  
  def initialize(models: js.Array[typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment], options: Any): Unit
  
  def more(options: Any): js.Promise[Any]
  
  def sync(method: String, model: Model[Any, ModelSetOptions, Any], options: Any): Any
}
object Get {
  
  inline def apply(
    get: (Any, Any) => Query,
    hasMore: CallbackTo[Boolean],
    initialize: (js.Array[typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment], Any) => Callback,
    more: Any => js.Promise[Any],
    sync: (String, Model[Any, ModelSetOptions, Any], Any) => Any
  ): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), hasMore = hasMore.toJsFn, initialize = js.Any.fromFunction2((t0: js.Array[typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment], t1: Any) => (initialize(t0, t1)).runNow()), more = js.Any.fromFunction1(more), sync = js.Any.fromFunction3(sync))
    __obj.asInstanceOf[Get]
  }
  
  extension [Self <: Get](x: Self) {
    
    inline def setGet(value: (Any, Any) => Query): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setHasMore(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasMore", value.toJsFn)
    
    inline def setInitialize(
      value: (js.Array[typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment], Any) => Callback
    ): Self = StObject.set(x, "initialize", js.Any.fromFunction2((t0: js.Array[typingsJapgolly.wordpressAdmin.componentsMediaModelsMod.Attachment], t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setMore(value: Any => js.Promise[Any]): Self = StObject.set(x, "more", js.Any.fromFunction1(value))
    
    inline def setSync(value: (String, Model[Any, ModelSetOptions, Any], Any) => Any): Self = StObject.set(x, "sync", js.Any.fromFunction3(value))
  }
}
