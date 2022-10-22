package typingsJapgolly.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMsoInterior extends StObject {
  
  val Application: Any
  
  var Color: Any
  
  var ColorIndex: Any
  
  val Creator: Double
  
  var InvertIfNegative: Any
  
  /* private */ @JSName("Office.IMsoInterior_typekey")
  var OfficeDotIMsoInterior_typekey: IMsoInterior
  
  val Parent: Any
  
  var Pattern: Any
  
  var PatternColor: Any
  
  var PatternColorIndex: Any
}
object IMsoInterior {
  
  inline def apply(
    Application: Any,
    Color: Any,
    ColorIndex: Any,
    Creator: Double,
    InvertIfNegative: Any,
    OfficeDotIMsoInterior_typekey: IMsoInterior,
    Parent: Any,
    Pattern: Any,
    PatternColor: Any,
    PatternColorIndex: Any
  ): IMsoInterior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoInterior_typekey")(OfficeDotIMsoInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoInterior]
  }
  
  extension [Self <: IMsoInterior](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorIndex(value: Any): Self = StObject.set(x, "ColorIndex", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setInvertIfNegative(value: Any): Self = StObject.set(x, "InvertIfNegative", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotIMsoInterior_typekey(value: IMsoInterior): Self = StObject.set(x, "Office.IMsoInterior_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Any): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternColor(value: Any): Self = StObject.set(x, "PatternColor", value.asInstanceOf[js.Any])
    
    inline def setPatternColorIndex(value: Any): Self = StObject.set(x, "PatternColorIndex", value.asInstanceOf[js.Any])
  }
}
