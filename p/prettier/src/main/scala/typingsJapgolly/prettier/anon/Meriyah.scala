package typingsJapgolly.prettier.anon

import typingsJapgolly.prettier.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meriyah extends StObject {
  
  var meriyah: Parser[Any]
}
object Meriyah {
  
  inline def apply(meriyah: Parser[Any]): Meriyah = {
    val __obj = js.Dynamic.literal(meriyah = meriyah.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meriyah]
  }
  
  extension [Self <: Meriyah](x: Self) {
    
    inline def setMeriyah(value: Parser[Any]): Self = StObject.set(x, "meriyah", value.asInstanceOf[js.Any])
  }
}
