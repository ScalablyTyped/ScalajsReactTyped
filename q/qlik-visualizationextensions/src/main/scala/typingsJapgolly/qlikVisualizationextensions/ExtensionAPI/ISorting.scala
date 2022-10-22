package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import typingsJapgolly.qlikVisualizationextensions.qlikVisualizationextensionsStrings.sorting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISorting extends StObject {
  
  var uses: sorting
}
object ISorting {
  
  inline def apply(): ISorting = {
    val __obj = js.Dynamic.literal(uses = "sorting")
    __obj.asInstanceOf[ISorting]
  }
  
  extension [Self <: ISorting](x: Self) {
    
    inline def setUses(value: sorting): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
  }
}
