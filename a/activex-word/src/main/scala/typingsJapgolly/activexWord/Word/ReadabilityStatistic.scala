package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadabilityStatistic extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val Name: String
  
  val Parent: Any
  
  val Value: Double
  
  /* private */ @JSName("Word.ReadabilityStatistic_typekey")
  var WordDotReadabilityStatistic_typekey: ReadabilityStatistic
}
object ReadabilityStatistic {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: Any,
    Value: Double,
    WordDotReadabilityStatistic_typekey: ReadabilityStatistic
  ): ReadabilityStatistic = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReadabilityStatistic_typekey")(WordDotReadabilityStatistic_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadabilityStatistic]
  }
  
  extension [Self <: ReadabilityStatistic](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordDotReadabilityStatistic_typekey(value: ReadabilityStatistic): Self = StObject.set(x, "Word.ReadabilityStatistic_typekey", value.asInstanceOf[js.Any])
  }
}
