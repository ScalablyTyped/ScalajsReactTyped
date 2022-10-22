package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlFolderDisplayMode
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Explorers")
@js.native
/* private */ open class Explorers ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Explorers {
  
  /* CompleteClass */
  override def Add(Folder: Any, DisplayMode: OlFolderDisplayMode): typingsJapgolly.activexOutlook.Outlook.Explorer = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.Explorer = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Explorers_typekey")
  var OutlookDotExplorers_typekey: typingsJapgolly.activexOutlook.Outlook.Explorers = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
