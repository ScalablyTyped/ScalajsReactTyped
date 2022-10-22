package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchMedia extends StObject {
  
  var matchMedia: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any
  
  var navigator: Standalone
}
object MatchMedia {
  
  inline def apply(
    matchMedia: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any,
    navigator: Standalone
  ): MatchMedia = {
    val __obj = js.Dynamic.literal(matchMedia = matchMedia.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchMedia]
  }
  
  extension [Self <: MatchMedia](x: Self) {
    
    inline def setMatchMedia(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any
    ): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
    
    inline def setNavigator(value: Standalone): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
  }
}
