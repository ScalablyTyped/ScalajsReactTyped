package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerHeight extends StObject {
  
  var innerHeight: Double
  
  var innerWidth: Double
  
  var matchMedia: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any
  
  var navigator: UserAgent
}
object InnerHeight {
  
  inline def apply(
    innerHeight: Double,
    innerWidth: Double,
    matchMedia: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any,
    navigator: UserAgent
  ): InnerHeight = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], matchMedia = matchMedia.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHeight]
  }
  
  extension [Self <: InnerHeight](x: Self) {
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setMatchMedia(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.Mock<any, any> */ Any
    ): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
    
    inline def setNavigator(value: UserAgent): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
  }
}
