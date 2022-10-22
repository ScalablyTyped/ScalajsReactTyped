package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.high
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  val default: default_
  
  val high: typingsJapgolly.baseui.baseuiStrings.high
}
object Default {
  
  inline def apply(): Default = {
    val __obj = js.Dynamic.literal(default = "default", high = "high")
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setHigh(value: high): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
  }
}
