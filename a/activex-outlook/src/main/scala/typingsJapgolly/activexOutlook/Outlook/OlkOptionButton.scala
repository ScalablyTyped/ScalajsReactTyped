package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexStdole.stdole.OLE_COLOR
import typingsJapgolly.activexStdole.stdole.StdFont
import typingsJapgolly.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OlkOptionButton extends StObject {
  
  var Accelerator: String
  
  var Alignment: OlAlignment
  
  var BackColor: OLE_COLOR
  
  var BackStyle: OlBackStyle
  
  var Caption: String
  
  var Enabled: Boolean
  
  val Font: StdFont
  
  var ForeColor: OLE_COLOR
  
  var GroupName: String
  
  var MouseIcon: StdPicture
  
  var MousePointer: OlMousePointer
  
  /* private */ @JSName("Outlook.OlkOptionButton_typekey")
  var OutlookDotOlkOptionButton_typekey: OlkOptionButton
  
  var Value: Any
  
  var WordWrap: Boolean
}
object OlkOptionButton {
  
  inline def apply(
    Accelerator: String,
    Alignment: OlAlignment,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    GroupName: String,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkOptionButton_typekey: OlkOptionButton,
    Value: Any,
    WordWrap: Boolean
  ): OlkOptionButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkOptionButton_typekey")(OutlookDotOlkOptionButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkOptionButton]
  }
  
  extension [Self <: OlkOptionButton](x: Self) {
    
    inline def setAccelerator(value: String): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAlignment(value: OlAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackStyle(value: OlBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotOlkOptionButton_typekey(value: OlkOptionButton): Self = StObject.set(x, "Outlook.OlkOptionButton_typekey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
