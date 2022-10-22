package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlFormRegionIcon
import typingsJapgolly.activexOutlook.Outlook.OlFormRegionMode
import typingsJapgolly.activexOutlook.Outlook.OlFormRegionSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.FormRegionStartup")
@js.native
/* private */ open class FormRegionStartup ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.FormRegionStartup {
  
  /* CompleteClass */
  override def BeforeFormRegionShow(FormRegion: typingsJapgolly.activexOutlook.Outlook.FormRegion): Unit = js.native
  
  /* CompleteClass */
  override def GetFormRegionIcon(FormRegionName: String, LCID: Double, Icon: OlFormRegionIcon): Any = js.native
  
  /* CompleteClass */
  override def GetFormRegionManifest(FormRegionName: String, LCID: Double): Any = js.native
  
  /* CompleteClass */
  override def GetFormRegionStorage(
    FormRegionName: String,
    Item: Any,
    LCID: Double,
    FormRegionMode: OlFormRegionMode,
    FormRegionSize: OlFormRegionSize
  ): Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.FormRegionStartup_typekey")
  var OutlookDotFormRegionStartup_typekey: typingsJapgolly.activexOutlook.Outlook.FormRegionStartup = js.native
}
