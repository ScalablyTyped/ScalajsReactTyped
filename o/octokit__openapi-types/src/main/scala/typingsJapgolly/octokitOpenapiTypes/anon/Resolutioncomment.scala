package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.false_positive
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.resolved
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoked
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.used_in_tests
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.wont_fix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolutioncomment extends StObject {
  
  var resolution: js.UndefOr[Null | false_positive | wont_fix | revoked | used_in_tests] = js.undefined
  
  var resolution_comment: js.UndefOr[String | Null] = js.undefined
  
  var state: open | resolved
}
object Resolutioncomment {
  
  inline def apply(state: open | resolved): Resolutioncomment = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutioncomment]
  }
  
  extension [Self <: Resolutioncomment](x: Self) {
    
    inline def setResolution(value: false_positive | wont_fix | revoked | used_in_tests): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionNull: Self = StObject.set(x, "resolution", null)
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResolution_comment(value: String): Self = StObject.set(x, "resolution_comment", value.asInstanceOf[js.Any])
    
    inline def setResolution_commentNull: Self = StObject.set(x, "resolution_comment", null)
    
    inline def setResolution_commentUndefined: Self = StObject.set(x, "resolution_comment", js.undefined)
    
    inline def setState(value: open | resolved): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
