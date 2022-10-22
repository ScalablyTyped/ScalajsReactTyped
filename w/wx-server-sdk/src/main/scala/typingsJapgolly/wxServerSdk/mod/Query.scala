package typingsJapgolly.wxServerSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wxServerSdk.wxServerSdkStrings.asc
import typingsJapgolly.wxServerSdk.wxServerSdkStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  def count(): js.Promise[CountCollectionResult]
  
  def field(definition: js.Object): Collection | Query | Document
  
  def get(): js.Promise[GetCollectionResult]
  
  def limit(max: Double): Collection | Query
  
  def orderBy(fieldName: String, order: asc | desc): Collection | Query
  
  def remove(): js.Promise[RemoveCollectionResult]
  
  def skip(offset: Double): Collection | Query
  
  def update(options: CommonOption[Any]): js.Promise[UpateCollectionResult]
}
object Query {
  
  inline def apply(
    count: CallbackTo[js.Promise[CountCollectionResult]],
    field: js.Object => Collection | Query | Document,
    get: CallbackTo[js.Promise[GetCollectionResult]],
    limit: Double => Collection | Query,
    orderBy: (String, asc | desc) => Collection | Query,
    remove: CallbackTo[js.Promise[RemoveCollectionResult]],
    skip: Double => Collection | Query,
    update: CommonOption[Any] => js.Promise[UpateCollectionResult]
  ): Query = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, field = js.Any.fromFunction1(field), get = get.toJsFn, limit = js.Any.fromFunction1(limit), orderBy = js.Any.fromFunction2(orderBy), remove = remove.toJsFn, skip = js.Any.fromFunction1(skip), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setCount(value: CallbackTo[js.Promise[CountCollectionResult]]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setField(value: js.Object => Collection | Query | Document): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setGet(value: CallbackTo[js.Promise[GetCollectionResult]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setLimit(value: Double => Collection | Query): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
    
    inline def setOrderBy(value: (String, asc | desc) => Collection | Query): Self = StObject.set(x, "orderBy", js.Any.fromFunction2(value))
    
    inline def setRemove(value: CallbackTo[js.Promise[RemoveCollectionResult]]): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSkip(value: Double => Collection | Query): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: CommonOption[Any] => js.Promise[UpateCollectionResult]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
