package typingsJapgolly.chrome.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReceiverAction extends StObject
@JSGlobal("chrome.cast.ReceiverAction")
@js.native
object ReceiverAction extends StObject {
  
  @js.native
  sealed trait CAST
    extends StObject
       with ReceiverAction
  
  @js.native
  sealed trait STOP
    extends StObject
       with ReceiverAction
}
