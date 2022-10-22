package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionLabel extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val BuiltIn: Boolean
  
  var ChapterStyleLevel: Double
  
  val Creator: Double
  
  def Delete(): Unit
  
  val ID: WdCaptionLabelID
  
  var IncludeChapterNumber: Boolean
  
  val Name: String
  
  var NumberStyle: WdCaptionNumberStyle
  
  val Parent: Any
  
  var Position: WdCaptionPosition
  
  var Separator: WdSeparatorType
  
  /* private */ @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: CaptionLabel
}
object CaptionLabel {
  
  inline def apply(
    Application: Application,
    BuiltIn: Boolean,
    ChapterStyleLevel: Double,
    Creator: Double,
    Delete: Callback,
    ID: WdCaptionLabelID,
    IncludeChapterNumber: Boolean,
    Name: String,
    NumberStyle: WdCaptionNumberStyle,
    Parent: Any,
    Position: WdCaptionPosition,
    Separator: WdSeparatorType,
    WordDotCaptionLabel_typekey: CaptionLabel
  ): CaptionLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], ChapterStyleLevel = ChapterStyleLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, ID = ID.asInstanceOf[js.Any], IncludeChapterNumber = IncludeChapterNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabel_typekey")(WordDotCaptionLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabel]
  }
  
  extension [Self <: CaptionLabel](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setChapterStyleLevel(value: Double): Self = StObject.set(x, "ChapterStyleLevel", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setID(value: WdCaptionLabelID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIncludeChapterNumber(value: Boolean): Self = StObject.set(x, "IncludeChapterNumber", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNumberStyle(value: WdCaptionNumberStyle): Self = StObject.set(x, "NumberStyle", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: WdCaptionPosition): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: WdSeparatorType): Self = StObject.set(x, "Separator", value.asInstanceOf[js.Any])
    
    inline def setWordDotCaptionLabel_typekey(value: CaptionLabel): Self = StObject.set(x, "Word.CaptionLabel_typekey", value.asInstanceOf[js.Any])
  }
}
