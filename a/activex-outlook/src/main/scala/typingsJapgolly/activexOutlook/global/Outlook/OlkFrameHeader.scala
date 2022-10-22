package typingsJapgolly.activexOutlook.global.Outlook

import typingsJapgolly.activexOutlook.Outlook.OlAlignment
import typingsJapgolly.activexOutlook.Outlook.OlMousePointer
import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.OlkFrameHeader")
@js.native
/* private */ open class OlkFrameHeader ()
  extends StObject
     with typingsJapgolly.activexOutlook.Outlook.OlkFrameHeader {
  
  /* CompleteClass */
  var Alignment: OlAlignment = js.native
  
  /* CompleteClass */
  var Caption: String = js.native
  
  /* CompleteClass */
  var Enabled: Boolean = js.native
  
  /* CompleteClass */
  override val Font: StdFont = js.native
  
  /* CompleteClass */
  var ForeColor: OLE_COLOR = js.native
  
  /* CompleteClass */
  var MouseIcon: StdPicture = js.native
  
  /* CompleteClass */
  var MousePointer: OlMousePointer = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: typingsJapgolly.activexOutlook.Outlook.OlkFrameHeader = js.native
}
