package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFOCRLanguage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCROptions extends StObject {
  
  def Clone(): IOCROptions
  
  var PrimaryLanguage: MFOCRLanguage
  
  var SecondaryLanguage: MFOCRLanguage
}
object IOCROptions {
  
  inline def apply(Clone: CallbackTo[IOCROptions], PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOCROptions]
  }
  
  extension [Self <: IOCROptions](x: Self) {
    
    inline def setClone(value: CallbackTo[IOCROptions]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setPrimaryLanguage(value: MFOCRLanguage): Self = StObject.set(x, "PrimaryLanguage", value.asInstanceOf[js.Any])
    
    inline def setSecondaryLanguage(value: MFOCRLanguage): Self = StObject.set(x, "SecondaryLanguage", value.asInstanceOf[js.Any])
  }
}
