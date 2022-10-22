package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsResourceCandidate extends StObject {
  
  /** The ResourceCandidate objects in the set that start at startIndex. */ var items: ResourceCandidate
  
  /** The number of ResourceCandidate objects returned. */ var returnValue: Double
}
object ItemsResourceCandidate {
  
  inline def apply(items: ResourceCandidate, returnValue: Double): ItemsResourceCandidate = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsResourceCandidate]
  }
  
  extension [Self <: ItemsResourceCandidate](x: Self) {
    
    inline def setItems(value: ResourceCandidate): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
