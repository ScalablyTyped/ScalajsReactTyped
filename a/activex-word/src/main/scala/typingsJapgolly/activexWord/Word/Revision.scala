package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revision extends StObject {
  
  def Accept(): Unit
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Author: String
  
  val Cells: typingsJapgolly.activexWord.Word.Cells
  
  val Creator: Double
  
  val Date: VarDate
  
  val FormatDescription: String
  
  val Index: Double
  
  val MovedRange: typingsJapgolly.activexWord.Word.Range
  
  val Parent: Any
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  def Reject(): Unit
  
  val Style: typingsJapgolly.activexWord.Word.Style
  
  val Type: WdRevisionType
  
  /* private */ @JSName("Word.Revision_typekey")
  var WordDotRevision_typekey: Revision
}
object Revision {
  
  inline def apply(
    Accept: Callback,
    Application: Application,
    Author: String,
    Cells: Cells,
    Creator: Double,
    Date: VarDate,
    FormatDescription: String,
    Index: Double,
    MovedRange: Range,
    Parent: Any,
    Range: Range,
    Reject: Callback,
    Style: Style,
    Type: WdRevisionType,
    WordDotRevision_typekey: Revision
  ): Revision = {
    val __obj = js.Dynamic.literal(Accept = Accept.toJsFn, Application = Application.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Cells = Cells.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], FormatDescription = FormatDescription.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MovedRange = MovedRange.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = Reject.toJsFn, Style = Style.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Revision_typekey")(WordDotRevision_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
  
  extension [Self <: Revision](x: Self) {
    
    inline def setAccept(value: Callback): Self = StObject.set(x, "Accept", value.toJsFn)
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setCells(value: Cells): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDate(value: VarDate): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setFormatDescription(value: String): Self = StObject.set(x, "FormatDescription", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setMovedRange(value: Range): Self = StObject.set(x, "MovedRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setReject(value: Callback): Self = StObject.set(x, "Reject", value.toJsFn)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdRevisionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotRevision_typekey(value: Revision): Self = StObject.set(x, "Word.Revision_typekey", value.asInstanceOf[js.Any])
  }
}
