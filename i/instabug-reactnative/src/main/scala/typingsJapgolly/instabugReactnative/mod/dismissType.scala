package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dismissType extends StObject
@JSImport("instabug-reactnative", "dismissType")
@js.native
object dismissType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dismissType & Double] = js.native
  
  @js.native
  sealed trait addAttachment
    extends StObject
       with dismissType
  /* 2 */ val addAttachment: typingsJapgolly.instabugReactnative.mod.dismissType.addAttachment & Double = js.native
  
  @js.native
  sealed trait cancel
    extends StObject
       with dismissType
  /* 1 */ val cancel: typingsJapgolly.instabugReactnative.mod.dismissType.cancel & Double = js.native
  
  @js.native
  sealed trait submit
    extends StObject
       with dismissType
  /* 0 */ val submit: typingsJapgolly.instabugReactnative.mod.dismissType.submit & Double = js.native
}
