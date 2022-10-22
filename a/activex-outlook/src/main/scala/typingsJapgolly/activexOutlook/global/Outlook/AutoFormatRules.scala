package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.AutoFormatRules")
@js.native
/* private */ open class AutoFormatRules ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.AutoFormatRules {
  
  /* CompleteClass */
  override def Add(Name: String): typingsJapgolly.activexOutlook.Outlook.AutoFormatRule = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Insert(Name: String, Index: Any): typingsJapgolly.activexOutlook.Outlook.AutoFormatRule = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.AutoFormatRule = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.AutoFormatRules_typekey")
  var OutlookDotAutoFormatRules_typekey: typingsJapgolly.activexOutlook.Outlook.AutoFormatRules = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Any): Unit = js.native
  
  /* CompleteClass */
  override def RemoveAll(): Unit = js.native
  
  /* CompleteClass */
  override def Save(): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
