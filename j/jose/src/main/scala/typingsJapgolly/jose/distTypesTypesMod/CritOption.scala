package typingsJapgolly.jose.distTypesTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CritOption extends StObject {
  
  /**
    * An object with keys representing recognized "crit" (Critical) Header Parameter names. The value
    * for those is either `true` or `false`. `true` when the Header Parameter MUST be integrity
    * protected, `false` when it's irrelevant.
    *
    * This makes the "Extension Header Parameter "${parameter}" is not recognized" error go away.
    *
    * Use this when a given JWS/JWT/JWE profile requires the use of proprietary non-registered "crit"
    * (Critical) Header Parameters. This will only make sure the Header Parameter is syntactically
    * correct when provided and that it is optionally integrity protected. It will not process the
    * Header Parameter in any way or reject the operation if it is missing. You MUST still verify the
    * Header Parameter was present and process it according to the profile's validation steps after
    * the operation succeeds.
    *
    * The JWS extension Header Parameter `b64` is always recognized and processed properly. No other
    * registered Header Parameters that need this kind of default built-in treatment are currently available.
    */
  var crit: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}
object CritOption {
  
  inline def apply(): CritOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CritOption]
  }
  
  extension [Self <: CritOption](x: Self) {
    
    inline def setCrit(value: StringDictionary[Boolean]): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
    
    inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
  }
}
