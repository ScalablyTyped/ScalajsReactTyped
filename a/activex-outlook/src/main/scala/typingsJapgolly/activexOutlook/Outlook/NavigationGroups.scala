package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationGroups extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val Count: Double
  
  def Create(GroupDisplayName: String): NavigationGroup
  
  def Delete(Group: NavigationGroup): Unit
  
  def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): NavigationGroup
  
  def Item(Index: Any): NavigationGroup
  
  /* private */ @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: NavigationGroups
  
  val Parent: Any
  
  val Session: NameSpace
}
object NavigationGroups {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Count: Double,
    Create: String => NavigationGroup,
    Delete: NavigationGroup => Callback,
    GetDefaultNavigationGroup: OlGroupType => NavigationGroup,
    Item: Any => NavigationGroup,
    OutlookDotNavigationGroups_typekey: NavigationGroups,
    Parent: Any,
    Session: NameSpace
  ): NavigationGroups = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Create = js.Any.fromFunction1(Create), Delete = js.Any.fromFunction1((t0: NavigationGroup) => Delete(t0).runNow()), GetDefaultNavigationGroup = js.Any.fromFunction1(GetDefaultNavigationGroup), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NavigationGroups_typekey")(OutlookDotNavigationGroups_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationGroups]
  }
  
  extension [Self <: NavigationGroups](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: String => NavigationGroup): Self = StObject.set(x, "Create", js.Any.fromFunction1(value))
    
    inline def setDelete(value: NavigationGroup => Callback): Self = StObject.set(x, "Delete", js.Any.fromFunction1((t0: NavigationGroup) => value(t0).runNow()))
    
    inline def setGetDefaultNavigationGroup(value: OlGroupType => NavigationGroup): Self = StObject.set(x, "GetDefaultNavigationGroup", js.Any.fromFunction1(value))
    
    inline def setItem(value: Any => NavigationGroup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setOutlookDotNavigationGroups_typekey(value: NavigationGroups): Self = StObject.set(x, "Outlook.NavigationGroups_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
