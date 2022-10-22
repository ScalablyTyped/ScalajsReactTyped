package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlNavigationModuleType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.NavigationModules")
@js.native
/* private */ open class NavigationModules ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.NavigationModules {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def GetNavigationModule(ModuleType: OlNavigationModuleType): typingsJapgolly.activexOutlook.Outlook.NavigationModule = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.NavigationModule = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.NavigationModules_typekey")
  var OutlookDotNavigationModules_typekey: typingsJapgolly.activexOutlook.Outlook.NavigationModules = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
