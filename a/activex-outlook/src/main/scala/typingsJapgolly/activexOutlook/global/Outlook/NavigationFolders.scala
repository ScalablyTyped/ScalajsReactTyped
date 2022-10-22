package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationFolders")
@js.native
/* private */ open class NavigationFolders ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.NavigationFolders {
  
  /* CompleteClass */
  override def Add(Folder: typingsJapgolly.activexOutlook.Outlook.Folder): typingsJapgolly.activexOutlook.Outlook.NavigationFolder = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.NavigationFolder = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationFolders_typekey")
  var OutlookDotNavigationFolders_typekey: typingsJapgolly.activexOutlook.Outlook.NavigationFolders = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(RemovableFolder: typingsJapgolly.activexOutlook.Outlook.NavigationFolder): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
