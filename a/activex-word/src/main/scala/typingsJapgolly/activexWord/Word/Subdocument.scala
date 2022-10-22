package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subdocument extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val HasFile: Boolean
  
  val Level: Double
  
  var Locked: Boolean
  
  val Name: String
  
  def Open(): Document
  
  val Parent: Any
  
  val Path: String
  
  val Range: typingsJapgolly.activexWord.Word.Range
  
  def Split(Range: typingsJapgolly.activexWord.Word.Range): Unit
  
  /* private */ @JSName("Word.Subdocument_typekey")
  var WordDotSubdocument_typekey: Subdocument
}
object Subdocument {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: Callback,
    HasFile: Boolean,
    Level: Double,
    Locked: Boolean,
    Name: String,
    Open: CallbackTo[Document],
    Parent: Any,
    Path: String,
    Range: Range,
    Split: Range => Callback,
    WordDotSubdocument_typekey: Subdocument
  ): Subdocument = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, HasFile = HasFile.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Open = Open.toJsFn, Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Split = js.Any.fromFunction1((t0: Range) => Split(t0).runNow()))
    __obj.updateDynamic("Word.Subdocument_typekey")(WordDotSubdocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subdocument]
  }
  
  extension [Self <: Subdocument](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setHasFile(value: Boolean): Self = StObject.set(x, "HasFile", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: CallbackTo[Document]): Self = StObject.set(x, "Open", value.toJsFn)
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: Range => Callback): Self = StObject.set(x, "Split", js.Any.fromFunction1((t0: Range) => value(t0).runNow()))
    
    inline def setWordDotSubdocument_typekey(value: Subdocument): Self = StObject.set(x, "Word.Subdocument_typekey", value.asInstanceOf[js.Any])
  }
}
