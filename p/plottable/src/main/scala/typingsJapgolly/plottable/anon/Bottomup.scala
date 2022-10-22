package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.bottomup
import typingsJapgolly.plottable.plottableStrings.topdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottomup extends StObject {
  
  var bottomup: typingsJapgolly.plottable.plottableStrings.bottomup
  
  var topdown: typingsJapgolly.plottable.plottableStrings.topdown
}
object Bottomup {
  
  inline def apply(): Bottomup = {
    val __obj = js.Dynamic.literal(bottomup = "bottomup", topdown = "topdown")
    __obj.asInstanceOf[Bottomup]
  }
  
  extension [Self <: Bottomup](x: Self) {
    
    inline def setBottomup(value: bottomup): Self = StObject.set(x, "bottomup", value.asInstanceOf[js.Any])
    
    inline def setTopdown(value: topdown): Self = StObject.set(x, "topdown", value.asInstanceOf[js.Any])
  }
}
