package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.close
import typingsJapgolly.baseui.baseuiStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  val close: typingsJapgolly.baseui.baseuiStrings.close
  
  val open: typingsJapgolly.baseui.baseuiStrings.open
}
object Open {
  
  inline def apply(): Open = {
    val __obj = js.Dynamic.literal(close = "close", open = "open")
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setClose(value: close): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: open): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
