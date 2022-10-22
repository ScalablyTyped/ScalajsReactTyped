package typingsJapgolly.webpack.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eager extends StObject {
  
  var eager: Boolean
  
  var from: String
  
  def get(): js.Promise[Any]
  
  var loaded: js.UndefOr[typingsJapgolly.webpack.webpackInts.`1`] = js.undefined
}
object Eager {
  
  inline def apply(eager: Boolean, from: String, get: CallbackTo[js.Promise[Any]]): Eager = {
    val __obj = js.Dynamic.literal(eager = eager.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], get = get.toJsFn)
    __obj.asInstanceOf[Eager]
  }
  
  extension [Self <: Eager](x: Self) {
    
    inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGet(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setLoaded(value: typingsJapgolly.webpack.webpackInts.`1`): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
  }
}
