package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OMathScrSubSup extends StObject {
  
  var AlignScripts: Boolean
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val E: OMath
  
  val Parent: Any
  
  def RemoveSub(): OMathFunction
  
  def RemoveSup(): OMathFunction
  
  val Sub: OMath
  
  val Sup: OMath
  
  def ToScrPre(): OMathFunction
  
  /* private */ @JSName("Word.OMathScrSubSup_typekey")
  var WordDotOMathScrSubSup_typekey: OMathScrSubSup
}
object OMathScrSubSup {
  
  inline def apply(
    AlignScripts: Boolean,
    Application: Application,
    Creator: Double,
    E: OMath,
    Parent: Any,
    RemoveSub: CallbackTo[OMathFunction],
    RemoveSup: CallbackTo[OMathFunction],
    Sub: OMath,
    Sup: OMath,
    ToScrPre: CallbackTo[OMathFunction],
    WordDotOMathScrSubSup_typekey: OMathScrSubSup
  ): OMathScrSubSup = {
    val __obj = js.Dynamic.literal(AlignScripts = AlignScripts.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], E = E.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RemoveSub = RemoveSub.toJsFn, RemoveSup = RemoveSup.toJsFn, Sub = Sub.asInstanceOf[js.Any], Sup = Sup.asInstanceOf[js.Any], ToScrPre = ToScrPre.toJsFn)
    __obj.updateDynamic("Word.OMathScrSubSup_typekey")(WordDotOMathScrSubSup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathScrSubSup]
  }
  
  extension [Self <: OMathScrSubSup](x: Self) {
    
    inline def setAlignScripts(value: Boolean): Self = StObject.set(x, "AlignScripts", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setE(value: OMath): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveSub(value: CallbackTo[OMathFunction]): Self = StObject.set(x, "RemoveSub", value.toJsFn)
    
    inline def setRemoveSup(value: CallbackTo[OMathFunction]): Self = StObject.set(x, "RemoveSup", value.toJsFn)
    
    inline def setSub(value: OMath): Self = StObject.set(x, "Sub", value.asInstanceOf[js.Any])
    
    inline def setSup(value: OMath): Self = StObject.set(x, "Sup", value.asInstanceOf[js.Any])
    
    inline def setToScrPre(value: CallbackTo[OMathFunction]): Self = StObject.set(x, "ToScrPre", value.toJsFn)
    
    inline def setWordDotOMathScrSubSup_typekey(value: OMathScrSubSup): Self = StObject.set(x, "Word.OMathScrSubSup_typekey", value.asInstanceOf[js.Any])
  }
}
