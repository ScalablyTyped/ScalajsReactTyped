package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexOutlook.Outlook.OlUserPropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.ItemProperty")
@js.native
/* private */ open class ItemProperty ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.ItemProperty {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Formula: String = js.native
  
  /* CompleteClass */
  override val IsUserProperty: Boolean = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.ItemProperty_typekey")
  var OutlookDotItemProperty_typekey: typingsJapgolly.activexOutlook.Outlook.ItemProperty = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  override val Type: OlUserPropertyType = js.native
  
  /* CompleteClass */
  var ValidationFormula: String = js.native
  
  /* CompleteClass */
  var ValidationText: String = js.native
  
  /* CompleteClass */
  var Value: Any = js.native
}
