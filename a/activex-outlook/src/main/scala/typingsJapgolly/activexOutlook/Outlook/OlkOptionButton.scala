package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.OlkOptionButton")
@js.native
class OlkOptionButton protected () extends js.Object {
  var Accelerator: String = js.native
  var Alignment: OlAlignment = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var GroupName: String = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkOptionButton_typekey")
  var OutlookDotOlkOptionButton_typekey: OlkOptionButton = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
}

