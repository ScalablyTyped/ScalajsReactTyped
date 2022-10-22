package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProperties extends StObject {
  
  /**
    * Describes the properties of the bullets at the associated level. A list has at most nine levels of nesting with nesting level 0 corresponding to the top-most level and nesting level
    * 8 corresponding to the most nested level. The nesting levels are returned in ascending order with the least nested returned first.
    */
  var nestingLevels: js.UndefOr[js.Array[NestingLevel]] = js.undefined
}
object ListProperties {
  
  inline def apply(): ListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProperties]
  }
  
  extension [Self <: ListProperties](x: Self) {
    
    inline def setNestingLevels(value: js.Array[NestingLevel]): Self = StObject.set(x, "nestingLevels", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelsUndefined: Self = StObject.set(x, "nestingLevels", js.undefined)
    
    inline def setNestingLevelsVarargs(value: NestingLevel*): Self = StObject.set(x, "nestingLevels", js.Array(value*))
  }
}
