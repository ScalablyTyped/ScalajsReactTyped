package typingsJapgolly.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsJsonMod {
  
  @JSImport("@devexpress/utils/lib/utils/json", "JsonUtils")
  @js.native
  open class JsonUtils () extends StObject
  /* static members */
  object JsonUtils {
    
    @JSImport("@devexpress/utils/lib/utils/json", "JsonUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isValid(json: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
