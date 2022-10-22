package typingsJapgolly.firebaseAppCheckCompat

import typingsJapgolly.firebaseAppCheckCompat.firebaseAppCheckCompatStrings.`use-before-activation`
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("@firebase/app-check-compat/dist/src/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[AppCheckError, ErrorParams] = js.native
  
  object AppCheckError {
    
    inline def USE_BEFORE_ACTIVATION: `use-before-activation` = "use-before-activation".asInstanceOf[`use-before-activation`]
  }
  type AppCheckError = `use-before-activation`
  
  @js.native
  trait ErrorParams extends StObject
}
