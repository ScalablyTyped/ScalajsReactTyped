package typingsJapgolly.videoJs.mod.videojs

import japgolly.scalajs.react.Callback
import typingsJapgolly.videoJs.mod.videojs.Tech.SourceObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  /**
    *
    * @param src
    * @param next
    */
  def setSource(src: SourceObject, next: js.Function2[/* err */ Any, /* src */ SourceObject, Unit]): Unit
}
object Middleware {
  
  inline def apply(setSource: (SourceObject, js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => Callback): Middleware = {
    val __obj = js.Dynamic.literal(setSource = js.Any.fromFunction2((t0: SourceObject, t1: js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => (setSource(t0, t1)).runNow()))
    __obj.asInstanceOf[Middleware]
  }
  
  extension [Self <: Middleware](x: Self) {
    
    inline def setSetSource(value: (SourceObject, js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction2((t0: SourceObject, t1: js.Function2[/* err */ Any, /* src */ SourceObject, Unit]) => (value(t0, t1)).runNow()))
  }
}
