package typingsJapgolly.fastJsonStringify.mod

import typingsJapgolly.fastJsonStringify.fastJsonStringifyStrings.debug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOption
  extends StObject
     with Options {
  
  @JSName("mode")
  var mode_DebugOption: debug
}
object DebugOption {
  
  inline def apply(): DebugOption = {
    val __obj = js.Dynamic.literal(mode = "debug")
    __obj.asInstanceOf[DebugOption]
  }
  
  extension [Self <: DebugOption](x: Self) {
    
    inline def setMode(value: debug): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
