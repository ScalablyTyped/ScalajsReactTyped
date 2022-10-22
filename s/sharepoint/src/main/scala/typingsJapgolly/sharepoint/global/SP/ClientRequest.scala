package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.microsoftAjax.Sys.Net.WebRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientRequest")
@js.native
open class ClientRequest ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ClientRequest {
  
  /* CompleteClass */
  override def add_requestFailed(
    value: js.Function2[
      /* sender */ Any, 
      /* args */ typingsJapgolly.sharepoint.SP.ClientRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def add_requestSucceeded(
    value: js.Function2[
      /* sender */ Any, 
      /* args */ typingsJapgolly.sharepoint.SP.ClientRequestSucceededEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def get_navigateWhenServerRedirect(): Boolean = js.native
  
  /* CompleteClass */
  override def get_webRequest(): WebRequest = js.native
  
  /* CompleteClass */
  override def remove_requestFailed(
    value: js.Function2[
      /* sender */ Any, 
      /* args */ typingsJapgolly.sharepoint.SP.ClientRequestFailedEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def remove_requestSucceeded(
    value: js.Function2[
      /* sender */ Any, 
      /* args */ typingsJapgolly.sharepoint.SP.ClientRequestSucceededEventArgs, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def set_navigateWhenServerRedirect(value: Boolean): Unit = js.native
}
object ClientRequest {
  
  @JSGlobal("SP.ClientRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getNextSequenceId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_nextSequenceId")().asInstanceOf[Double]
}
