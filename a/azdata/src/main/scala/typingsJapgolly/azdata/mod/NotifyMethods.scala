package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotifyMethods extends StObject
@JSImport("azdata", "NotifyMethods")
@js.native
object NotifyMethods extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotifyMethods & Double] = js.native
  
  @js.native
  sealed trait netSend
    extends StObject
       with NotifyMethods
  /* 4 */ val netSend: typingsJapgolly.azdata.mod.NotifyMethods.netSend & Double = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with NotifyMethods
  /* 0 */ val none: typingsJapgolly.azdata.mod.NotifyMethods.none & Double = js.native
  
  @js.native
  sealed trait notifyAll
    extends StObject
       with NotifyMethods
  /* 7 */ @JSName("notifyAll")
  val notifyAll_ : notifyAll & Double = js.native
  
  @js.native
  sealed trait notifyEmail
    extends StObject
       with NotifyMethods
  /* 1 */ val notifyEmail: typingsJapgolly.azdata.mod.NotifyMethods.notifyEmail & Double = js.native
  
  @js.native
  sealed trait pager
    extends StObject
       with NotifyMethods
  /* 2 */ val pager: typingsJapgolly.azdata.mod.NotifyMethods.pager & Double = js.native
}
