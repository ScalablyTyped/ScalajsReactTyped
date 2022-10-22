package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.PropertyPages")
@js.native
/* private */ open class PropertyPages ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.PropertyPages {
  
  /* CompleteClass */
  override def Add(Page: Any, Title: String): Unit = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Any): Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.PropertyPages_typekey")
  var OutlookDotPropertyPages_typekey: typingsJapgolly.activexOutlook.Outlook.PropertyPages = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Remove(Index: Any): Unit = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
}
