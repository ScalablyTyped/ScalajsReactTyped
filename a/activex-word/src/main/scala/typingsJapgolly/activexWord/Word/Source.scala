package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Cited: Boolean
  
  val Creator: Double
  
  def Delete(): Unit
  
  def Field(Name: String): String
  
  val Parent: Any
  
  val Tag: String
  
  /* private */ @JSName("Word.Source_typekey")
  var WordDotSource_typekey: Source
  
  val XML: String
}
object Source {
  
  inline def apply(
    Application: Application,
    Cited: Boolean,
    Creator: Double,
    Delete: Callback,
    Field: String => String,
    Parent: Any,
    Tag: String,
    WordDotSource_typekey: Source,
    XML: String
  ): Source = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Cited = Cited.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = Delete.toJsFn, Field = js.Any.fromFunction1(Field), Parent = Parent.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Source_typekey")(WordDotSource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCited(value: Boolean): Self = StObject.set(x, "Cited", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setField(value: String => String): Self = StObject.set(x, "Field", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setWordDotSource_typekey(value: Source): Self = StObject.set(x, "Word.Source_typekey", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
