package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppservice.libAppServiceRegistrationMod.AppServiceOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppServiceRegistration")
@js.native
open class AppServiceRegistration ()
  extends typingsJapgolly.matrixAppservice.mod.AppServiceRegistration {
  def this(url: String) = this()
}
/* static members */
object AppServiceRegistration {
  
  @JSImport("matrix-appservice-bridge", "AppServiceRegistration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convert a JSON object to an AppServiceRegistration object.
    * @static
    * @param obj The registration object
    * @return The registration.
    */
  inline def fromObject(obj: AppServiceOutput): typingsJapgolly.matrixAppservice.libAppServiceRegistrationMod.AppServiceRegistration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(obj.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matrixAppservice.libAppServiceRegistrationMod.AppServiceRegistration]
  
  /**
    * Generate a random token.
    * @return {string} A randomly generated token.
    */
  inline def generateToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateToken")().asInstanceOf[String]
}
