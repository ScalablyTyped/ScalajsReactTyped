package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdditionalFolder extends StObject {
  
  def Clone(): IAdditionalFolder
  
  var Folder: String
  
  var Impersonation: IImpersonation
  
  var LimitInMB: Double
}
object IAdditionalFolder {
  
  inline def apply(
    Clone: CallbackTo[IAdditionalFolder],
    Folder: String,
    Impersonation: IImpersonation,
    LimitInMB: Double
  ): IAdditionalFolder = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Folder = Folder.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], LimitInMB = LimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalFolder]
  }
  
  extension [Self <: IAdditionalFolder](x: Self) {
    
    inline def setClone(value: CallbackTo[IAdditionalFolder]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFolder(value: String): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    inline def setLimitInMB(value: Double): Self = StObject.set(x, "LimitInMB", value.asInstanceOf[js.Any])
  }
}
