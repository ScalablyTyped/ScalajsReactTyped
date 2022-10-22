package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TwoInitialCapsException extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  def Delete(): Unit
  
  val Index: Double
  
  val Name: String
  
  val Parent: Any
  
  /* private */ @JSName("Word.TwoInitialCapsException_typekey")
  var WordDotTwoInitialCapsException_typekey: TwoInitialCapsException
}
object TwoInitialCapsException {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Delete: Callback,
    Index: Double,
    Name: String,
    Parent: Any,
    WordDotTwoInitialCapsException_typekey: TwoInitialCapsException
  ): TwoInitialCapsException = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TwoInitialCapsException_typekey")(WordDotTwoInitialCapsException_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoInitialCapsException]
  }
  
  extension [Self <: TwoInitialCapsException](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotTwoInitialCapsException_typekey(value: TwoInitialCapsException): Self = StObject.set(x, "Word.TwoInitialCapsException_typekey", value.asInstanceOf[js.Any])
  }
}
