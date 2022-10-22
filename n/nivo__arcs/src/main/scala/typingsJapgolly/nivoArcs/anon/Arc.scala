package typingsJapgolly.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arc extends StObject {
  
  var arc: typingsJapgolly.nivoArcs.distTypesTypesMod.Arc
}
object Arc {
  
  inline def apply(arc: typingsJapgolly.nivoArcs.distTypesTypesMod.Arc): Arc = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  extension [Self <: Arc](x: Self) {
    
    inline def setArc(value: typingsJapgolly.nivoArcs.distTypesTypesMod.Arc): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
  }
}
