package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkFrameHeader")
@js.native
class OlkFrameHeader protected () extends js.Object {
  var Alignment: OlAlignment = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: OlkFrameHeader = js.native
}

