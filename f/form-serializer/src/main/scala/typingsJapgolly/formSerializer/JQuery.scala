package typingsJapgolly.formSerializer

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): String
  
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object
}
object JQuery {
  
  inline def apply(serializeJSON: CallbackTo[String], serializeObject: CallbackTo[js.Object]): JQuery = {
    val __obj = js.Dynamic.literal(serializeJSON = serializeJSON.toJsFn, serializeObject = serializeObject.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSerializeJSON(value: CallbackTo[String]): Self = StObject.set(x, "serializeJSON", value.toJsFn)
    
    inline def setSerializeObject(value: CallbackTo[js.Object]): Self = StObject.set(x, "serializeObject", value.toJsFn)
  }
}
