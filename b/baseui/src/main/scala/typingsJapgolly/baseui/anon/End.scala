package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.end_
import typingsJapgolly.baseui.baseuiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  val end: end_
  
  val start: typingsJapgolly.baseui.baseuiStrings.start
}
object End {
  
  inline def apply(): End = {
    val __obj = js.Dynamic.literal(end = "end", start = "start")
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: end_): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
