package typingsJapgolly.node.anon

import typingsJapgolly.node.utilMod.InspectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: InspectOptions
}
object Options {
  
  inline def apply(options: InspectOptions): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setOptions(value: InspectOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
