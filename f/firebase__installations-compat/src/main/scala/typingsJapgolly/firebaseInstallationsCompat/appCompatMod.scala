package typingsJapgolly.firebaseInstallationsCompat

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Define extension behavior of `registerInstallations`
  */
object appCompatMod {
  
  trait FirebaseApp extends StObject {
    
    def installations(): FirebaseInstallations
  }
  object FirebaseApp {
    
    inline def apply(installations: CallbackTo[FirebaseInstallations]): FirebaseApp = {
      val __obj = js.Dynamic.literal(installations = installations.toJsFn)
      __obj.asInstanceOf[FirebaseApp]
    }
    
    extension [Self <: FirebaseApp](x: Self) {
      
      inline def setInstallations(value: CallbackTo[FirebaseInstallations]): Self = StObject.set(x, "installations", value.toJsFn)
    }
  }
  
  @js.native
  trait FirebaseNamespace extends StObject {
    
    def installations(): FirebaseInstallations = js.native
    def installations(app: FirebaseApp): FirebaseInstallations = js.native
  }
}
