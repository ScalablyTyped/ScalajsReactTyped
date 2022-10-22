package typingsJapgolly.activexExcel.Excel

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundNote extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  def Delete(): Any
  
  /* private */ @JSName("Excel.SoundNote_typekey")
  var ExcelDotSoundNote_typekey: SoundNote
  
  def Import(Filename: String): Any
  
  val Parent: Any
  
  def Play(): Any
  
  def Record(): Any
}
object SoundNote {
  
  inline def apply(
    Application: Application,
    Creator: XlCreator,
    Delete: CallbackTo[Any],
    ExcelDotSoundNote_typekey: SoundNote,
    Import: String => Any,
    Parent: Any,
    Play: CallbackTo[Any],
    Record: CallbackTo[Any]
  ): SoundNote = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Import = js.Any.fromFunction1(Import), Parent = Parent.asInstanceOf[js.Any], Play = Play.toJsFn, Record = Record.toJsFn)
    __obj.updateDynamic("Excel.SoundNote_typekey")(ExcelDotSoundNote_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundNote]
  }
  
  extension [Self <: SoundNote](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: CallbackTo[Any]): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setExcelDotSoundNote_typekey(value: SoundNote): Self = StObject.set(x, "Excel.SoundNote_typekey", value.asInstanceOf[js.Any])
    
    inline def setImport(value: String => Any): Self = StObject.set(x, "Import", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: CallbackTo[Any]): Self = StObject.set(x, "Play", value.toJsFn)
    
    inline def setRecord(value: CallbackTo[Any]): Self = StObject.set(x, "Record", value.toJsFn)
  }
}
