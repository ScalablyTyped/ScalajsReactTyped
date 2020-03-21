package typingsJapgolly.officeJsPreview

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import typingsJapgolly.officeJsPreview.OfficeExtension.RequestUrlAndHeaderInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////
///////////////// End OfficeExtension runtime //////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////// Begin OfficeCore ////////////////////////
////////////////////////////////////////////////////////////////
@JSGlobal("OfficeCore")
@js.native
object OfficeCore extends js.Object {
  @js.native
  class RequestContext () extends ClientRequestContext {
    def this(url: String) = this()
    def this(url: js.Any) = this()
    def this(url: RequestUrlAndHeaderInfo) = this()
  }
  
}

