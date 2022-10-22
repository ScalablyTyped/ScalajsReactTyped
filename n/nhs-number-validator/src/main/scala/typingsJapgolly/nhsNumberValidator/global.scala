package typingsJapgolly.nhsNumberValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object nhsNumberValidator {
    
    @JSGlobal("nhsNumberValidator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def validate(nhsNumber: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(nhsNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def validate(nhsNumber: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(nhsNumber.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
