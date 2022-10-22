package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to request an approval for an action.
  *
  * An implementation of this interface is usually provided to another object to allow this object to request an approval for actions. The list of
  * possible actions must be documented in documentation of the object.
  */
trait XActionsApproval
  extends StObject
     with XInterface {
  
  /**
    * requests an approval for the specified action.
    * @param nAction a value specifying the action that should be approved. Could take values from {@link Actions} constants set. The explicit set of the acti
    * @returns returns `TRUE` in case the specified action is approved.
    */
  def approveAction(nAction: Double): Boolean
}
object XActionsApproval {
  
  inline def apply(
    acquire: Callback,
    approveAction: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XActionsApproval = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveAction = js.Any.fromFunction1(approveAction), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XActionsApproval]
  }
  
  extension [Self <: XActionsApproval](x: Self) {
    
    inline def setApproveAction(value: Double => Boolean): Self = StObject.set(x, "approveAction", js.Any.fromFunction1(value))
  }
}
