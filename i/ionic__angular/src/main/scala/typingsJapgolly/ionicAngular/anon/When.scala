package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.contentId
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.when
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait When extends StObject {
  
  var contentId: typingsJapgolly.ionicAngular.ionicAngularStrings.contentId
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var when: typingsJapgolly.ionicAngular.ionicAngularStrings.when
}
object When {
  
  inline def apply(): When = {
    val __obj = js.Dynamic.literal(contentId = "contentId", disabled = "disabled", when = "when")
    __obj.asInstanceOf[When]
  }
  
  extension [Self <: When](x: Self) {
    
    inline def setContentId(value: contentId): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setWhen(value: when): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
  }
}
