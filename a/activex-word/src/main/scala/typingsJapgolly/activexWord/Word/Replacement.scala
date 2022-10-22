package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Replacement extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def ClearFormatting(): Unit
  
  val Creator: Double
  
  var Font: typingsJapgolly.activexWord.Word.Font
  
  val Frame: typingsJapgolly.activexWord.Word.Frame
  
  var Highlight: Double
  
  var LanguageID: WdLanguageID
  
  var LanguageIDFarEast: WdLanguageID
  
  var NoProofing: Double
  
  var ParagraphFormat: typingsJapgolly.activexWord.Word.ParagraphFormat
  
  val Parent: Any
  
  var Style: Any
  
  var Text: String
  
  /* private */ @JSName("Word.Replacement_typekey")
  var WordDotReplacement_typekey: Replacement
}
object Replacement {
  
  inline def apply(
    Application: Application,
    ClearFormatting: Callback,
    Creator: Double,
    Font: Font,
    Frame: Frame,
    Highlight: Double,
    LanguageID: WdLanguageID,
    LanguageIDFarEast: WdLanguageID,
    NoProofing: Double,
    ParagraphFormat: ParagraphFormat,
    Parent: Any,
    Style: Any,
    Text: String,
    WordDotReplacement_typekey: Replacement
  ): Replacement = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ClearFormatting = ClearFormatting.toJsFn, Creator = Creator.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Highlight = Highlight.asInstanceOf[js.Any], LanguageID = LanguageID.asInstanceOf[js.Any], LanguageIDFarEast = LanguageIDFarEast.asInstanceOf[js.Any], NoProofing = NoProofing.asInstanceOf[js.Any], ParagraphFormat = ParagraphFormat.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Replacement_typekey")(WordDotReplacement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replacement]
  }
  
  extension [Self <: Replacement](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClearFormatting(value: Callback): Self = StObject.set(x, "ClearFormatting", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFont(value: Font): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Frame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    inline def setHighlight(value: Double): Self = StObject.set(x, "Highlight", value.asInstanceOf[js.Any])
    
    inline def setLanguageID(value: WdLanguageID): Self = StObject.set(x, "LanguageID", value.asInstanceOf[js.Any])
    
    inline def setLanguageIDFarEast(value: WdLanguageID): Self = StObject.set(x, "LanguageIDFarEast", value.asInstanceOf[js.Any])
    
    inline def setNoProofing(value: Double): Self = StObject.set(x, "NoProofing", value.asInstanceOf[js.Any])
    
    inline def setParagraphFormat(value: ParagraphFormat): Self = StObject.set(x, "ParagraphFormat", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setWordDotReplacement_typekey(value: Replacement): Self = StObject.set(x, "Word.Replacement_typekey", value.asInstanceOf[js.Any])
  }
}
