package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailMergeDataField extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Creator: Double
  
  val Index: Double
  
  val Name: String
  
  val Parent: Any
  
  val Value: String
  
  /* private */ @JSName("Word.MailMergeDataField_typekey")
  var WordDotMailMergeDataField_typekey: MailMergeDataField
}
object MailMergeDataField {
  
  inline def apply(
    Application: Application,
    Creator: Double,
    Index: Double,
    Name: String,
    Parent: Any,
    Value: String,
    WordDotMailMergeDataField_typekey: MailMergeDataField
  ): MailMergeDataField = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.MailMergeDataField_typekey")(WordDotMailMergeDataField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailMergeDataField]
  }
  
  extension [Self <: MailMergeDataField](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordDotMailMergeDataField_typekey(value: MailMergeDataField): Self = StObject.set(x, "Word.MailMergeDataField_typekey", value.asInstanceOf[js.Any])
  }
}
