package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourceObjectFiles extends StObject {
  
  def Add(Index: Double, SourceObjectFile: ISourceObjectFile): Unit
  
  def AddEmptyFile(Title: String, Extension: String): ISourceObjectFile
  
  def AddFile(Title: String, Extension: String, SourcePath: String): ISourceObjectFile
  
  val Count: Double
  
  def Item(Index: Double): ISourceObjectFile
  
  def Remove(Index: Double): Unit
}
object ISourceObjectFiles {
  
  inline def apply(
    Add: (Double, ISourceObjectFile) => Callback,
    AddEmptyFile: (String, String) => ISourceObjectFile,
    AddFile: (String, String, String) => ISourceObjectFile,
    Count: Double,
    Item: Double => ISourceObjectFile,
    Remove: Double => Callback
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: ISourceObjectFile) => (Add(t0, t1)).runNow()), AddEmptyFile = js.Any.fromFunction2(AddEmptyFile), AddFile = js.Any.fromFunction3(AddFile), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ISourceObjectFiles]
  }
  
  extension [Self <: ISourceObjectFiles](x: Self) {
    
    inline def setAdd(value: (Double, ISourceObjectFile) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: ISourceObjectFile) => (value(t0, t1)).runNow()))
    
    inline def setAddEmptyFile(value: (String, String) => ISourceObjectFile): Self = StObject.set(x, "AddEmptyFile", js.Any.fromFunction2(value))
    
    inline def setAddFile(value: (String, String, String) => ISourceObjectFile): Self = StObject.set(x, "AddFile", js.Any.fromFunction3(value))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ISourceObjectFile): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
