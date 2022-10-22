package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.microsoftAjax.Sys.EventArgs
import typingsJapgolly.microsoftAjax.Sys.Net.WebRequestExecutor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.PageRequestSucceededEventArgs")
@js.native
open class PageRequestSucceededEventArgs ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.PageRequestSucceededEventArgs {
  
  /**
    * An object of type EventArgs that is used as a convenient way to specify an empty EventArgs instance.
    */
  /* CompleteClass */
  var Empty: EventArgs = js.native
  
  /* CompleteClass */
  override def get_executor(): WebRequestExecutor = js.native
}
