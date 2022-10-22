package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.ViewFields")
@js.native
/* private */ open class ViewFields ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.ViewFields {
  
  /* CompleteClass */
  override def Add(PropertyName: String): typingsJapgolly.activexOutlook.Outlook.ViewField = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Insert(PropertyName: String, Index: Any): typingsJapgolly.activexOutlook.Outlook.ViewField = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): typingsJapgolly.activexOutlook.Outlook.ViewField = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.ViewFields_typekey")
  var OutlookDotViewFields_typekey: typingsJapgolly.activexOutlook.Outlook.ViewFields = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Any): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
