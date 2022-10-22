package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportAssertions
import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksAPI2.NodeImportConditions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  var conditions: js.UndefOr[NodeImportConditions] = js.undefined
  
  var importAssertions: js.UndefOr[NodeImportAssertions] = js.undefined
  
  var parentURL: String
}
object Conditions {
  
  inline def apply(parentURL: String): Conditions = {
    val __obj = js.Dynamic.literal(parentURL = parentURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
  
  extension [Self <: Conditions](x: Self) {
    
    inline def setConditions(value: NodeImportConditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setImportAssertions(value: NodeImportAssertions): Self = StObject.set(x, "importAssertions", value.asInstanceOf[js.Any])
    
    inline def setImportAssertionsUndefined: Self = StObject.set(x, "importAssertions", js.undefined)
    
    inline def setParentURL(value: String): Self = StObject.set(x, "parentURL", value.asInstanceOf[js.Any])
  }
}
