package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panose extends StObject {
  
  var ArmStyle: Double
  
  var Contrast: Double
  
  var FamilyType: Double
  
  var Letterform: Double
  
  var Midline: Double
  
  var Proportion: Double
  
  var SerifStyle: Double
  
  var StrokeVariation: Double
  
  var Weight: Double
  
  var XHeight: Double
}
object Panose {
  
  inline def apply(
    ArmStyle: Double,
    Contrast: Double,
    FamilyType: Double,
    Letterform: Double,
    Midline: Double,
    Proportion: Double,
    SerifStyle: Double,
    StrokeVariation: Double,
    Weight: Double,
    XHeight: Double
  ): Panose = {
    val __obj = js.Dynamic.literal(ArmStyle = ArmStyle.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], FamilyType = FamilyType.asInstanceOf[js.Any], Letterform = Letterform.asInstanceOf[js.Any], Midline = Midline.asInstanceOf[js.Any], Proportion = Proportion.asInstanceOf[js.Any], SerifStyle = SerifStyle.asInstanceOf[js.Any], StrokeVariation = StrokeVariation.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], XHeight = XHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panose]
  }
  
  extension [Self <: Panose](x: Self) {
    
    inline def setArmStyle(value: Double): Self = StObject.set(x, "ArmStyle", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    inline def setFamilyType(value: Double): Self = StObject.set(x, "FamilyType", value.asInstanceOf[js.Any])
    
    inline def setLetterform(value: Double): Self = StObject.set(x, "Letterform", value.asInstanceOf[js.Any])
    
    inline def setMidline(value: Double): Self = StObject.set(x, "Midline", value.asInstanceOf[js.Any])
    
    inline def setProportion(value: Double): Self = StObject.set(x, "Proportion", value.asInstanceOf[js.Any])
    
    inline def setSerifStyle(value: Double): Self = StObject.set(x, "SerifStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeVariation(value: Double): Self = StObject.set(x, "StrokeVariation", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setXHeight(value: Double): Self = StObject.set(x, "XHeight", value.asInstanceOf[js.Any])
  }
}
