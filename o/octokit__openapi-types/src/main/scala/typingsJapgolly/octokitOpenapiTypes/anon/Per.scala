package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.day
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Per extends StObject {
  
  /** The time frame to display results for. */
  var per: js.UndefOr[
    typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week
  ] = js.undefined
}
object Per {
  
  inline def apply(): Per = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Per]
  }
  
  extension [Self <: Per](x: Self) {
    
    inline def setPer(value: typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings._empty | day | week): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
