package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Breaks: typingsJapgolly.activexWord.Word.Breaks
  
  val Creator: Double
  
  val EnhMetaFileBits: Any
  
  val Height: Double
  
  val Left: Double
  
  val Parent: Any
  
  val Rectangles: typingsJapgolly.activexWord.Word.Rectangles
  
  val Top: Double
  
  val Width: Double
  
  /* private */ @JSName("Word.Page_typekey")
  var WordDotPage_typekey: Page
}
object Page {
  
  inline def apply(
    Application: Application,
    Breaks: Breaks,
    Creator: Double,
    EnhMetaFileBits: Any,
    Height: Double,
    Left: Double,
    Parent: Any,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotPage_typekey: Page
  ): Page = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EnhMetaFileBits = EnhMetaFileBits.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Page_typekey")(WordDotPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
  
  extension [Self <: Page](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBreaks(value: Breaks): Self = StObject.set(x, "Breaks", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setEnhMetaFileBits(value: Any): Self = StObject.set(x, "EnhMetaFileBits", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRectangles(value: Rectangles): Self = StObject.set(x, "Rectangles", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "Top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWordDotPage_typekey(value: Page): Self = StObject.set(x, "Word.Page_typekey", value.asInstanceOf[js.Any])
  }
}
