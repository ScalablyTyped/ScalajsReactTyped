package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectFiles extends StObject {
  
  val Count: Double
  
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile
  
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double
  
  def Item(Index: Double): IObjectFile
  
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit
  
  def ToJSON(): String
}
object IObjectFiles {
  
  inline def apply(
    Count: Double,
    GetObjectFileByNameForFileSystem: String => IObjectFile,
    GetObjectFileIndexByNameForFileSystem: String => Double,
    Item: Double => IObjectFile,
    Sort: IObjectFileComparer => Callback,
    ToJSON: CallbackTo[String]
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GetObjectFileByNameForFileSystem = js.Any.fromFunction1(GetObjectFileByNameForFileSystem), GetObjectFileIndexByNameForFileSystem = js.Any.fromFunction1(GetObjectFileIndexByNameForFileSystem), Item = js.Any.fromFunction1(Item), Sort = js.Any.fromFunction1((t0: IObjectFileComparer) => Sort(t0).runNow()), ToJSON = ToJSON.toJsFn)
    __obj.asInstanceOf[IObjectFiles]
  }
  
  extension [Self <: IObjectFiles](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetObjectFileByNameForFileSystem(value: String => IObjectFile): Self = StObject.set(x, "GetObjectFileByNameForFileSystem", js.Any.fromFunction1(value))
    
    inline def setGetObjectFileIndexByNameForFileSystem(value: String => Double): Self = StObject.set(x, "GetObjectFileIndexByNameForFileSystem", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IObjectFile): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setSort(value: IObjectFileComparer => Callback): Self = StObject.set(x, "Sort", js.Any.fromFunction1((t0: IObjectFileComparer) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
  }
}
