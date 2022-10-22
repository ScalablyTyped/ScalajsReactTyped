package typingsJapgolly.activexOffice.Office

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureEffect extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  def EffectParameters(Index: String): EffectParameter
  def EffectParameters(Index: Double): EffectParameter
  @JSName("EffectParameters")
  val EffectParameters_Original: EffectParameters
  
  /* private */ @JSName("Office.PictureEffect_typekey")
  var OfficeDotPictureEffect_typekey: PictureEffect
  
  var Position: Double
  
  val Type: MsoPictureEffectType
  
  var Visible: MsoTriState
}
object PictureEffect {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Delete: Callback,
    EffectParameters: EffectParameters,
    OfficeDotPictureEffect_typekey: PictureEffect,
    Position: Double,
    Type: MsoPictureEffectType,
    Visible: MsoTriState
  ): PictureEffect = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, EffectParameters = EffectParameters.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.PictureEffect_typekey")(OfficeDotPictureEffect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureEffect]
  }
  
  extension [Self <: PictureEffect](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEffectParameters(value: EffectParameters): Self = StObject.set(x, "EffectParameters", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotPictureEffect_typekey(value: PictureEffect): Self = StObject.set(x, "Office.PictureEffect_typekey", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoPictureEffectType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: MsoTriState): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
