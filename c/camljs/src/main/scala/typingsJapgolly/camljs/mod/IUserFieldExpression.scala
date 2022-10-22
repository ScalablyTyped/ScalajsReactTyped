package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserFieldExpression extends StObject {
  
  /** Checks whether the value of the User field is equal to id of the current user */
  def EqualToCurrentUser(): IExpression
  
  /** Specifies that id of the user will be used for further comparisons. */
  def Id(): INumberFieldExpression
  
  /** Checks whether the group specified by the value of the field includes the current user. */
  def IsInCurrentUserGroups(): IExpression
  
  /** Checks whether the user specified by the value of the field is member of the specified SharePoint Group. */
  def IsInSPGroup(groupId: Double): IExpression
  
  /** Checks whether the user specified by the value of the field is in current SPWeb users. */
  def IsInSPWebAllUsers(): IExpression
  
  /** Checks whether the user specified by the value of the field is member of current SPWeb groups. */
  def IsInSPWebGroups(): IExpression
  
  /** Checks whether the user specified by the value of the field has received the rights to the site directly (not through a group). */
  def IsInSPWebUsers(): IExpression
  
  /** Specifies that lookup target field value will be used for further comparisons. */
  def ValueAsText(): ITextFieldExpression
}
object IUserFieldExpression {
  
  inline def apply(
    EqualToCurrentUser: CallbackTo[IExpression],
    Id: CallbackTo[INumberFieldExpression],
    IsInCurrentUserGroups: CallbackTo[IExpression],
    IsInSPGroup: Double => IExpression,
    IsInSPWebAllUsers: CallbackTo[IExpression],
    IsInSPWebGroups: CallbackTo[IExpression],
    IsInSPWebUsers: CallbackTo[IExpression],
    ValueAsText: CallbackTo[ITextFieldExpression]
  ): IUserFieldExpression = {
    val __obj = js.Dynamic.literal(EqualToCurrentUser = EqualToCurrentUser.toJsFn, Id = Id.toJsFn, IsInCurrentUserGroups = IsInCurrentUserGroups.toJsFn, IsInSPGroup = js.Any.fromFunction1(IsInSPGroup), IsInSPWebAllUsers = IsInSPWebAllUsers.toJsFn, IsInSPWebGroups = IsInSPWebGroups.toJsFn, IsInSPWebUsers = IsInSPWebUsers.toJsFn, ValueAsText = ValueAsText.toJsFn)
    __obj.asInstanceOf[IUserFieldExpression]
  }
  
  extension [Self <: IUserFieldExpression](x: Self) {
    
    inline def setEqualToCurrentUser(value: CallbackTo[IExpression]): Self = StObject.set(x, "EqualToCurrentUser", value.toJsFn)
    
    inline def setId(value: CallbackTo[INumberFieldExpression]): Self = StObject.set(x, "Id", value.toJsFn)
    
    inline def setIsInCurrentUserGroups(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsInCurrentUserGroups", value.toJsFn)
    
    inline def setIsInSPGroup(value: Double => IExpression): Self = StObject.set(x, "IsInSPGroup", js.Any.fromFunction1(value))
    
    inline def setIsInSPWebAllUsers(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsInSPWebAllUsers", value.toJsFn)
    
    inline def setIsInSPWebGroups(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsInSPWebGroups", value.toJsFn)
    
    inline def setIsInSPWebUsers(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsInSPWebUsers", value.toJsFn)
    
    inline def setValueAsText(value: CallbackTo[ITextFieldExpression]): Self = StObject.set(x, "ValueAsText", value.toJsFn)
  }
}
