package typingsJapgolly.wxServerSdk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wxServerSdk.anon.Data
import typingsJapgolly.wxServerSdk.anon.Id
import typingsJapgolly.wxServerSdk.anon.Stats
import typingsJapgolly.wxServerSdk.anon.StatsRemoved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  def get(): js.Promise[Data]
  
  def remove(): js.Promise[StatsRemoved]
  
  def set(options: CommonOption[Any]): js.Promise[Id]
  
  def update(options: CommonOption[Any]): js.Promise[Stats]
}
object Document {
  
  inline def apply(
    get: CallbackTo[js.Promise[Data]],
    remove: CallbackTo[js.Promise[StatsRemoved]],
    set: CommonOption[Any] => js.Promise[Id],
    update: CommonOption[Any] => js.Promise[Stats]
  ): Document = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, remove = remove.toJsFn, set = js.Any.fromFunction1(set), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setGet(value: CallbackTo[js.Promise[Data]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setRemove(value: CallbackTo[js.Promise[StatsRemoved]]): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSet(value: CommonOption[Any] => js.Promise[Id]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: CommonOption[Any] => js.Promise[Stats]): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
