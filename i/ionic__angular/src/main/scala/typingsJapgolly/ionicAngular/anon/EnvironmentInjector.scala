package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.environmentInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentInjector extends StObject {
  
  var environmentInjector: typingsJapgolly.ionicAngular.ionicAngularStrings.environmentInjector
}
object EnvironmentInjector {
  
  inline def apply(): EnvironmentInjector = {
    val __obj = js.Dynamic.literal(environmentInjector = "environmentInjector")
    __obj.asInstanceOf[EnvironmentInjector]
  }
  
  extension [Self <: EnvironmentInjector](x: Self) {
    
    inline def setEnvironmentInjector(value: environmentInjector): Self = StObject.set(x, "environmentInjector", value.asInstanceOf[js.Any])
  }
}
