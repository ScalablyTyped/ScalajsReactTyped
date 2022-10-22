package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextualGroup extends StObject {
  
  def dispose(): scala.Unit
  
  def get_color(): Double
  
  def get_command(): String
  
  def get_count(): Double
  
  def get_id(): String
  
  def get_title(): String
}
object ContextualGroup {
  
  inline def apply(
    dispose: Callback,
    get_color: CallbackTo[Double],
    get_command: CallbackTo[String],
    get_count: CallbackTo[Double],
    get_id: CallbackTo[String],
    get_title: CallbackTo[String]
  ): ContextualGroup = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, get_color = get_color.toJsFn, get_command = get_command.toJsFn, get_count = get_count.toJsFn, get_id = get_id.toJsFn, get_title = get_title.toJsFn)
    __obj.asInstanceOf[ContextualGroup]
  }
  
  extension [Self <: ContextualGroup](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGet_color(value: CallbackTo[Double]): Self = StObject.set(x, "get_color", value.toJsFn)
    
    inline def setGet_command(value: CallbackTo[String]): Self = StObject.set(x, "get_command", value.toJsFn)
    
    inline def setGet_count(value: CallbackTo[Double]): Self = StObject.set(x, "get_count", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
  }
}
