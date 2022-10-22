package typingsJapgolly.wordpressBlockEditor.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  /**
    * A function opening the media modal when called.
    */
  def open(): Unit
}
object Open {
  
  inline def apply(open: Callback): Open = {
    val __obj = js.Dynamic.literal(open = open.toJsFn)
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
  }
}
