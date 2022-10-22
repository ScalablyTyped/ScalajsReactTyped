package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapFormat extends StObject {
  
  var AllowOverlap: Double
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  var DistanceBottom: Double
  
  var DistanceLeft: Double
  
  var DistanceRight: Double
  
  var DistanceTop: Double
  
  val Parent: Any
  
  var Side: WdWrapSideType
  
  var Type: WdWrapType
  
  /* private */ @JSName("Word.WrapFormat_typekey")
  var WordDotWrapFormat_typekey: WrapFormat
}
object WrapFormat {
  
  inline def apply(
    AllowOverlap: Double,
    Application: Application,
    Creator: Double,
    DistanceBottom: Double,
    DistanceLeft: Double,
    DistanceRight: Double,
    DistanceTop: Double,
    Parent: Any,
    Side: WdWrapSideType,
    Type: WdWrapType,
    WordDotWrapFormat_typekey: WrapFormat
  ): WrapFormat = {
    val __obj = js.Dynamic.literal(AllowOverlap = AllowOverlap.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceBottom = DistanceBottom.asInstanceOf[js.Any], DistanceLeft = DistanceLeft.asInstanceOf[js.Any], DistanceRight = DistanceRight.asInstanceOf[js.Any], DistanceTop = DistanceTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Side = Side.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WrapFormat_typekey")(WordDotWrapFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFormat]
  }
  
  extension [Self <: WrapFormat](x: Self) {
    
    inline def setAllowOverlap(value: Double): Self = StObject.set(x, "AllowOverlap", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDistanceBottom(value: Double): Self = StObject.set(x, "DistanceBottom", value.asInstanceOf[js.Any])
    
    inline def setDistanceLeft(value: Double): Self = StObject.set(x, "DistanceLeft", value.asInstanceOf[js.Any])
    
    inline def setDistanceRight(value: Double): Self = StObject.set(x, "DistanceRight", value.asInstanceOf[js.Any])
    
    inline def setDistanceTop(value: Double): Self = StObject.set(x, "DistanceTop", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSide(value: WdWrapSideType): Self = StObject.set(x, "Side", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdWrapType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotWrapFormat_typekey(value: WrapFormat): Self = StObject.set(x, "Word.WrapFormat_typekey", value.asInstanceOf[js.Any])
  }
}
