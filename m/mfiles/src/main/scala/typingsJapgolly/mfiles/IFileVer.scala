package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileVer extends StObject {
  
  def Clone(): IFileVer
  
  def CloneFrom(FileVer: IFileVer): Unit
  
  var ID: Double
  
  var Version: Double
}
object IFileVer {
  
  inline def apply(Clone: CallbackTo[IFileVer], CloneFrom: IFileVer => Callback, ID: Double, Version: Double): IFileVer = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IFileVer) => CloneFrom(t0).runNow()), ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileVer]
  }
  
  extension [Self <: IFileVer](x: Self) {
    
    inline def setClone(value: CallbackTo[IFileVer]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IFileVer => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IFileVer) => value(t0).runNow()))
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
