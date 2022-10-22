package typingsJapgolly.jqueryDropotron

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Interface for "JQuery".
  * @author  Cyril Schumacher
  * @version 1.0
  */
trait JQuery extends StObject {
  
  def dropotron(): Unit
  def dropotron(config: DropotronConfiguration): Unit
  @JSName("dropotron")
  var dropotron_Original: Dropotron
}
object JQuery {
  
  inline def apply(dropotron: /* config */ js.UndefOr[DropotronConfiguration] => Callback): JQuery = {
    val __obj = js.Dynamic.literal(dropotron = js.Any.fromFunction1((t0: /* config */ js.UndefOr[DropotronConfiguration]) => dropotron(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setDropotron(value: /* config */ js.UndefOr[DropotronConfiguration] => Callback): Self = StObject.set(x, "dropotron", js.Any.fromFunction1((t0: /* config */ js.UndefOr[DropotronConfiguration]) => value(t0).runNow()))
  }
}
