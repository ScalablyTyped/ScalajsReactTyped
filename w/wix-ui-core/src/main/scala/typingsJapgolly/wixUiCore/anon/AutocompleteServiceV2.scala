package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutocompleteServiceV2 extends StObject {
  
  var AutocompleteServiceV2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any
  
  var PlacesServiceV2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any
}
object AutocompleteServiceV2 {
  
  inline def apply(
    AutocompleteServiceV2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any,
    PlacesServiceV2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any
  ): AutocompleteServiceV2 = {
    val __obj = js.Dynamic.literal(AutocompleteServiceV2 = AutocompleteServiceV2.asInstanceOf[js.Any], PlacesServiceV2 = PlacesServiceV2.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteServiceV2]
  }
  
  extension [Self <: AutocompleteServiceV2](x: Self) {
    
    inline def setAutocompleteServiceV2(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any
    ): Self = StObject.set(x, "AutocompleteServiceV2", value.asInstanceOf[js.Any])
    
    inline def setPlacesServiceV2(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<unknown> */ Any
    ): Self = StObject.set(x, "PlacesServiceV2", value.asInstanceOf[js.Any])
  }
}
