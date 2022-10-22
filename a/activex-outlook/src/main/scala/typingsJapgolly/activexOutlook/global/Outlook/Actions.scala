package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Actions")
@js.native
/* private */ open class Actions ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Actions {
  
  /* CompleteClass */
  override def Add(): typingsJapgolly.activexOutlook.Outlook.Action = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.Action = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Actions_typekey")
  var OutlookDotActions_typekey: typingsJapgolly.activexOutlook.Outlook.Actions = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
