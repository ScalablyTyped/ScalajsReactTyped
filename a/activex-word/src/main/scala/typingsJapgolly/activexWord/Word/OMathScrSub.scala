package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathScrSub extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: Any
  
  val Sub: OMath
  
  /* private */ @JSName("Word.OMathScrSub_typekey")
  var WordDotOMathScrSub_typekey: OMathScrSub
}
object OMathScrSub {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: Any,
    Sub: OMath,
    WordDotOMathScrSub_typekey: OMathScrSub
  ): OMathScrSub = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Sub = Sub.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathScrSub_typekey")(WordDotOMathScrSub_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSub]
  }
  
  extension [Self <: OMathScrSub](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    inline def setWordDotOMathScrSub_typekey(value: OMathScrSub): Self = StObject.set(x, "Word.OMathScrSub_typekey", value.asInstanceOf[js.Any])
  }
}
