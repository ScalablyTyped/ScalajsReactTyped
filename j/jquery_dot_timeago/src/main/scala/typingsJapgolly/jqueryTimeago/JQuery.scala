package typingsJapgolly.jqueryTimeago

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def timeago(): JQuery
  @JSName("timeago")
  var timeago_Original: Timeago
}
object JQuery {
  
  inline def apply(timeago: CallbackTo[JQuery]): JQuery = {
    val __obj = js.Dynamic.literal(timeago = timeago.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTimeago(value: CallbackTo[JQuery]): Self = StObject.set(x, "timeago", value.toJsFn)
  }
}
