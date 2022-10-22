package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlCategoryColor
import typingsJapgolly.activexOutlook.Outlook.OlCategoryShortcutKey
import typingsJapgolly.activexOutlook.Outlook.OlObjectClass
import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.Category")
@js.native
/* private */ open class Category ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.Category {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val CategoryBorderColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryGradientBottomColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryGradientTopColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  override val CategoryID: String = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var Color: OlCategoryColor = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.Category_typekey")
  var OutlookDotCategory_typekey: typingsJapgolly.activexOutlook.Outlook.Category = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typingsJapgolly.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var ShortcutKey: OlCategoryShortcutKey = js.native
}
