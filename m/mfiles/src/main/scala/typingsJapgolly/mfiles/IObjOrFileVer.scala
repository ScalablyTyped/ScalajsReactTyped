package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjOrFileVer extends StObject {
  
  def Clone(): IObjOrFileVer
  
  var FileVer: IFileVer
  
  def IsFile(): Boolean
  
  var ObjVer: IObjVer
}
object IObjOrFileVer {
  
  inline def apply(Clone: CallbackTo[IObjOrFileVer], FileVer: IFileVer, IsFile: CallbackTo[Boolean], ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, FileVer = FileVer.asInstanceOf[js.Any], IsFile = IsFile.toJsFn, ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjOrFileVer]
  }
  
  extension [Self <: IObjOrFileVer](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjOrFileVer]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFileVer(value: IFileVer): Self = StObject.set(x, "FileVer", value.asInstanceOf[js.Any])
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsFile", value.toJsFn)
    
    inline def setObjVer(value: IObjVer): Self = StObject.set(x, "ObjVer", value.asInstanceOf[js.Any])
  }
}
