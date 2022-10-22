package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlList extends StObject {
  
  val AutomaticComponents: IAccessControlListComponentContainer
  
  val CheckedOutToUserID: Double
  
  def Clone(): IAccessControlList
  
  def CloneFrom(AccessControlList: IAccessControlList): Unit
  
  var CustomComponent: IAccessControlListComponent
  
  def EqualTo(AccessControlList: IAccessControlList): Boolean
  
  val HasCheckedOutToUserID: Boolean
  
  def HasIdenticalPermissions(AccessControlList: IAccessControlList): Boolean
  
  var IsFullyAuthoritative: Boolean
}
object IAccessControlList {
  
  inline def apply(
    AutomaticComponents: IAccessControlListComponentContainer,
    CheckedOutToUserID: Double,
    Clone: CallbackTo[IAccessControlList],
    CloneFrom: IAccessControlList => Callback,
    CustomComponent: IAccessControlListComponent,
    EqualTo: IAccessControlList => Boolean,
    HasCheckedOutToUserID: Boolean,
    HasIdenticalPermissions: IAccessControlList => Boolean,
    IsFullyAuthoritative: Boolean
  ): IAccessControlList = {
    val __obj = js.Dynamic.literal(AutomaticComponents = AutomaticComponents.asInstanceOf[js.Any], CheckedOutToUserID = CheckedOutToUserID.asInstanceOf[js.Any], Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IAccessControlList) => CloneFrom(t0).runNow()), CustomComponent = CustomComponent.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), HasCheckedOutToUserID = HasCheckedOutToUserID.asInstanceOf[js.Any], HasIdenticalPermissions = js.Any.fromFunction1(HasIdenticalPermissions), IsFullyAuthoritative = IsFullyAuthoritative.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlList]
  }
  
  extension [Self <: IAccessControlList](x: Self) {
    
    inline def setAutomaticComponents(value: IAccessControlListComponentContainer): Self = StObject.set(x, "AutomaticComponents", value.asInstanceOf[js.Any])
    
    inline def setCheckedOutToUserID(value: Double): Self = StObject.set(x, "CheckedOutToUserID", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IAccessControlList]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IAccessControlList => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IAccessControlList) => value(t0).runNow()))
    
    inline def setCustomComponent(value: IAccessControlListComponent): Self = StObject.set(x, "CustomComponent", value.asInstanceOf[js.Any])
    
    inline def setEqualTo(value: IAccessControlList => Boolean): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setHasCheckedOutToUserID(value: Boolean): Self = StObject.set(x, "HasCheckedOutToUserID", value.asInstanceOf[js.Any])
    
    inline def setHasIdenticalPermissions(value: IAccessControlList => Boolean): Self = StObject.set(x, "HasIdenticalPermissions", js.Any.fromFunction1(value))
    
    inline def setIsFullyAuthoritative(value: Boolean): Self = StObject.set(x, "IsFullyAuthoritative", value.asInstanceOf[js.Any])
  }
}
