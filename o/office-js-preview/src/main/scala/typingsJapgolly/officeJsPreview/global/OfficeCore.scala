package typingsJapgolly.officeJsPreview.global

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import typingsJapgolly.officeJsPreview.OfficeExtension.RequestUrlAndHeaderInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////
///////////////// End OfficeExtension runtime //////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////// Begin OfficeCore ////////////////////////
////////////////////////////////////////////////////////////////
object OfficeCore {
  
  @JSGlobal("OfficeCore.RequestContext")
  @js.native
  open class RequestContext ()
    extends StObject
       with ClientRequestContext {
    def this(url: String) = this()
    def this(url: Any) = this()
    def this(url: RequestUrlAndHeaderInfo) = this()
  }
}
