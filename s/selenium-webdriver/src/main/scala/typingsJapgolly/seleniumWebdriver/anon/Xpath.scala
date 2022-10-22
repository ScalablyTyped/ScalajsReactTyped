package typingsJapgolly.seleniumWebdriver.anon

import typingsJapgolly.seleniumWebdriver.libByMod.ByHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xpath
  extends StObject
     with ByHash {
  
  var xpath: String
}
object Xpath {
  
  inline def apply(xpath: String): Xpath = {
    val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xpath]
  }
  
  extension [Self <: Xpath](x: Self) {
    
    inline def setXpath(value: String): Self = StObject.set(x, "xpath", value.asInstanceOf[js.Any])
  }
}
