package typingsJapgolly.tcomb.mod

import typingsJapgolly.tcomb.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwapCommand
  extends StObject
     with Command {
  
  @JSName("$swap")
  var $swap: From
}
object SwapCommand {
  
  inline def apply($swap: From): SwapCommand = {
    val __obj = js.Dynamic.literal($swap = $swap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwapCommand]
  }
  
  extension [Self <: SwapCommand](x: Self) {
    
    inline def set$swap(value: From): Self = StObject.set(x, "$swap", value.asInstanceOf[js.Any])
  }
}
