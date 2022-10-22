package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlGroupType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationGroups")
@js.native
/* private */ open class NavigationGroups ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.NavigationGroups {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Create(GroupDisplayName: String): typingsJapgolly.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* CompleteClass */
  override def Delete(Group: typingsJapgolly.activexOutlook.Outlook.NavigationGroup): Unit = js.native
  
  /* CompleteClass */
  override def GetDefaultNavigationGroup(DefaultFolderGroup: OlGroupType): typingsJapgolly.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.NavigationGroup = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationGroups_typekey")
  var OutlookDotNavigationGroups_typekey: typingsJapgolly.activexOutlook.Outlook.NavigationGroups = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
