package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Side extends StObject {
  
  var side: left | right | bottom
}
object Side {
  
  inline def apply(side: left | right | bottom): Side = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Side]
  }
  
  extension [Self <: Side](x: Self) {
    
    inline def setSide(value: left | right | bottom): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
