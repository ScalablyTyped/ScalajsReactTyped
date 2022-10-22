package typingsJapgolly.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientControl extends StObject {
  
  var BackColor: Double
  
  var Enabled: Double
  
  var Font: Any
  
  var ForeColor: Double
  
  /* private */ @JSName("Outlook._RecipientControl_typekey")
  var OutlookDot_RecipientControl_typekey: RecipientControl
  
  var ReadOnly: Double
  
  var SpecialEffect: Double
}
object RecipientControl {
  
  inline def apply(
    BackColor: Double,
    Enabled: Double,
    Font: Any,
    ForeColor: Double,
    OutlookDot_RecipientControl_typekey: RecipientControl,
    ReadOnly: Double,
    SpecialEffect: Double
  ): RecipientControl = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook._RecipientControl_typekey")(OutlookDot_RecipientControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientControl]
  }
  
  extension [Self <: RecipientControl](x: Self) {
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Double): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Any): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setOutlookDot_RecipientControl_typekey(value: RecipientControl): Self = StObject.set(x, "Outlook._RecipientControl_typekey", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Double): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSpecialEffect(value: Double): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
  }
}
