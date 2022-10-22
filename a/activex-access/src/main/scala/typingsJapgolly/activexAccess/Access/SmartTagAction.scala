package typingsJapgolly.activexAccess.Access

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagAction extends StObject {
  
  /* private */ @JSName("Access.SmartTagAction_typekey")
  var AccessDotSmartTagAction_typekey: SmartTagAction
  
  val Application: typingsJapgolly.activexAccess.Access.Application
  
  def Execute(): Unit
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Name: String
  
  val Parent: Any
}
object SmartTagAction {
  
  inline def apply(
    AccessDotSmartTagAction_typekey: SmartTagAction,
    Application: Application,
    Execute: Callback,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: Any
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Execute = Execute.toJsFn, IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagAction_typekey")(AccessDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  
  extension [Self <: SmartTagAction](x: Self) {
    
    inline def setAccessDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Access.SmartTagAction_typekey", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "Execute", value.toJsFn)
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
  }
}
