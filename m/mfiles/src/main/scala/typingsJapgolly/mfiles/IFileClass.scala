package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileClass extends StObject {
  
  def Clone(): IFileClass
  
  var DisplayName: String
  
  val DotAndExtension: String
  
  val Extension: String
  
  val FileClass: String
  
  def LoadByExtension(Extension: String): Unit
  
  def LoadByFileClass(Extension: String, FileClass: String): Unit
  
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit
}
object IFileClass {
  
  inline def apply(
    Clone: CallbackTo[IFileClass],
    DisplayName: String,
    DotAndExtension: String,
    Extension: String,
    FileClass: String,
    LoadByExtension: String => Callback,
    LoadByFileClass: (String, String) => Callback,
    SetFileClassInfo: (String, String, String) => Callback
  ): IFileClass = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, DisplayName = DisplayName.asInstanceOf[js.Any], DotAndExtension = DotAndExtension.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileClass = FileClass.asInstanceOf[js.Any], LoadByExtension = js.Any.fromFunction1((t0: String) => LoadByExtension(t0).runNow()), LoadByFileClass = js.Any.fromFunction2((t0: String, t1: String) => (LoadByFileClass(t0, t1)).runNow()), SetFileClassInfo = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (SetFileClassInfo(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IFileClass]
  }
  
  extension [Self <: IFileClass](x: Self) {
    
    inline def setClone(value: CallbackTo[IFileClass]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDotAndExtension(value: String): Self = StObject.set(x, "DotAndExtension", value.asInstanceOf[js.Any])
    
    inline def setExtension(value: String): Self = StObject.set(x, "Extension", value.asInstanceOf[js.Any])
    
    inline def setFileClass(value: String): Self = StObject.set(x, "FileClass", value.asInstanceOf[js.Any])
    
    inline def setLoadByExtension(value: String => Callback): Self = StObject.set(x, "LoadByExtension", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLoadByFileClass(value: (String, String) => Callback): Self = StObject.set(x, "LoadByFileClass", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetFileClassInfo(value: (String, String, String) => Callback): Self = StObject.set(x, "SetFileClassInfo", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
