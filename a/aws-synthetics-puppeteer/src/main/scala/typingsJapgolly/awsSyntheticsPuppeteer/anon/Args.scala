package typingsJapgolly.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[String]
  
  var defaultViewport: Requiredwidthnumberundefi
  
  var headless: Boolean
}
object Args {
  
  inline def apply(args: js.Array[String], defaultViewport: Requiredwidthnumberundefi, headless: Boolean): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], defaultViewport = defaultViewport.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setDefaultViewport(value: Requiredwidthnumberundefi): Self = StObject.set(x, "defaultViewport", value.asInstanceOf[js.Any])
    
    inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
  }
}
