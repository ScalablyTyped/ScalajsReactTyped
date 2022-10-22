package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletFormat2 extends StObject {
  
  val Application: Any
  
  var Character: Double
  
  val Creator: Double
  
  val Font: Font2
  
  val Number: Double
  
  /* private */ @JSName("Office.BulletFormat2_typekey")
  var OfficeDotBulletFormat2_typekey: BulletFormat2
  
  val Parent: Any
  
  def Picture(FileName: String): Unit
  
  var RelativeSize: Double
  
  var StartValue: Double
  
  var Style: MsoNumberedBulletStyle
  
  var Type: MsoBulletType
  
  var UseTextColor: MsoTriState
  
  var UseTextFont: MsoTriState
  
  var Visible: MsoTriState
}
object BulletFormat2 {
  
  inline def apply(
    Application: Any,
    Character: Double,
    Creator: Double,
    Font: Font2,
    Number: Double,
    OfficeDotBulletFormat2_typekey: BulletFormat2,
    Parent: Any,
    Picture: String => Callback,
    RelativeSize: Double,
    StartValue: Double,
    Style: MsoNumberedBulletStyle,
    Type: MsoBulletType,
    UseTextColor: MsoTriState,
    UseTextFont: MsoTriState,
    Visible: MsoTriState
  ): BulletFormat2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Character = Character.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Picture = js.Any.fromFunction1((t0: String) => Picture(t0).runNow()), RelativeSize = RelativeSize.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseTextColor = UseTextColor.asInstanceOf[js.Any], UseTextFont = UseTextFont.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BulletFormat2_typekey")(OfficeDotBulletFormat2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletFormat2]
  }
  
  extension [Self <: BulletFormat2](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCharacter(value: Double): Self = StObject.set(x, "Character", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font2): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotBulletFormat2_typekey(value: BulletFormat2): Self = StObject.set(x, "Office.BulletFormat2_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPicture(value: String => Callback): Self = StObject.set(x, "Picture", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRelativeSize(value: Double): Self = StObject.set(x, "RelativeSize", value.asInstanceOf[js.Any])
    
    inline def setStartValue(value: Double): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: MsoNumberedBulletStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoBulletType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setUseTextColor(value: MsoTriState): Self = StObject.set(x, "UseTextColor", value.asInstanceOf[js.Any])
    
    inline def setUseTextFont(value: MsoTriState): Self = StObject.set(x, "UseTextFont", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
