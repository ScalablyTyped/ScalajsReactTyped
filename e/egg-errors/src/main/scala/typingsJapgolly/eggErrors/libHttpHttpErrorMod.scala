package typingsJapgolly.eggErrors

import typingsJapgolly.eggErrors.libHttpHttpHeaderMod.HttpHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHttpHttpErrorMod {
  
  @JSImport("egg-errors/lib/http/http_error", JSImport.Default)
  @js.native
  open class default () extends HttpError {
    def this(options: typingsJapgolly.eggErrors.libHttpHttpErrorOptionsMod.default) = this()
  }
  
  @js.native
  trait HttpError
    extends typingsJapgolly.eggErrors.libBaseErrorMod.default[typingsJapgolly.eggErrors.libHttpHttpErrorOptionsMod.default] {
    
    var headers: HttpHeader = js.native
    
    /* protected */ @JSName("options")
    var options_HttpError: typingsJapgolly.eggErrors.libHttpHttpErrorOptionsMod.default = js.native
    
    var status: Double = js.native
  }
}
