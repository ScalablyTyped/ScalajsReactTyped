package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkTimeControl extends StObject {
  
  var AutoSize: Boolean
  
  var AutoWordSelect: Boolean
  
  var BackColor: OLE_COLOR
  
  var BackStyle: OlBackStyle
  
  def DropDown(): Unit
  
  var Enabled: Boolean
  
  var EnterFieldBehavior: OlEnterFieldBehavior
  
  val Font: StdFont
  
  var ForeColor: OLE_COLOR
  
  var HideSelection: Boolean
  
  var IntervalTime: VarDate
  
  var Locked: Boolean
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: OlkTimeControl
  
  var ReferenceTime: VarDate
  
  var Style: OlTimeStyle
  
  var Text: String
  
  var TextAlign: OlTextAlign
  
  var Time: VarDate
  
  var Value: Any
}
object OlkTimeControl {
  
  inline def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    DropDown: Callback,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntervalTime: VarDate,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeControl_typekey: OlkTimeControl,
    ReferenceTime: VarDate,
    Style: OlTimeStyle,
    Text: String,
    TextAlign: OlTextAlign,
    Time: VarDate,
    Value: Any
  ): OlkTimeControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], DropDown = DropDown.toJsFn, Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntervalTime = IntervalTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ReferenceTime = ReferenceTime.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeControl_typekey")(OutlookDotOlkTimeControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeControl]
  }
  
  extension [Self <: OlkTimeControl](x: Self) {
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoWordSelect(value: Boolean): Self = StObject.set(x, "AutoWordSelect", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    inline def setDropDown(value: Callback): Self = StObject.set(x, "DropDown", value.toJsFn)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = StObject.set(x, "EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    inline def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setHideSelection(value: Boolean): Self = StObject.set(x, "HideSelection", value.asInstanceOf[js.Any])
    
    inline def setIntervalTime(value: VarDate): Self = StObject.set(x, "IntervalTime", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkTimeControl_typekey(value: OlkTimeControl): Self = StObject.set(x, "Outlook.OlkTimeControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setReferenceTime(value: VarDate): Self = StObject.set(x, "ReferenceTime", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: OlTimeStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    inline def setTime(value: VarDate): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
