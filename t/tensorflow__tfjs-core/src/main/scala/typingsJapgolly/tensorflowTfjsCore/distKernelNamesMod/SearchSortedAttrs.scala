package typingsJapgolly.tensorflowTfjsCore.distKernelNamesMod

import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.left
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSortedAttrs extends StObject {
  
  var side: left | right
}
object SearchSortedAttrs {
  
  inline def apply(side: left | right): SearchSortedAttrs = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSortedAttrs]
  }
  
  extension [Self <: SearchSortedAttrs](x: Self) {
    
    inline def setSide(value: left | right): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
