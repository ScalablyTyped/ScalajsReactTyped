package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.loadingSpinner
import typingsJapgolly.ionicAngular.ionicAngularStrings.loadingText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingSpinner extends StObject {
  
  var loadingSpinner: typingsJapgolly.ionicAngular.ionicAngularStrings.loadingSpinner
  
  var loadingText: typingsJapgolly.ionicAngular.ionicAngularStrings.loadingText
}
object LoadingSpinner {
  
  inline def apply(): LoadingSpinner = {
    val __obj = js.Dynamic.literal(loadingSpinner = "loadingSpinner", loadingText = "loadingText")
    __obj.asInstanceOf[LoadingSpinner]
  }
  
  extension [Self <: LoadingSpinner](x: Self) {
    
    inline def setLoadingSpinner(value: loadingSpinner): Self = StObject.set(x, "loadingSpinner", value.asInstanceOf[js.Any])
    
    inline def setLoadingText(value: loadingText): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
  }
}
