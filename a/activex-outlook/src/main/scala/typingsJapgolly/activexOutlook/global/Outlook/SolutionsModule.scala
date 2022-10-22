package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlNavigationModuleType
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlSolutionScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.SolutionsModule")
@js.native
/* private */ open class SolutionsModule ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.SolutionsModule {
  
  /* CompleteClass */
  override def AddSolution(Solution: typingsJapgolly.activexOutlook.Outlook.Folder, Scope: OlSolutionScope): Unit = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val NavigationModuleType: OlNavigationModuleType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.SolutionsModule_typekey")
  var OutlookDotSolutionsModule_typekey: typingsJapgolly.activexOutlook.Outlook.SolutionsModule = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
}
