package typingsJapgolly.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheets extends StObject {
  
  def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): StyleSheet
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Any): StyleSheet
  
  val Parent: Any
  
  /* private */ @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: StyleSheets
}
object StyleSheets {
  
  inline def apply(
    Add: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Any => StyleSheet,
    Parent: Any,
    WordDotStyleSheets_typekey: StyleSheets
  ): StyleSheets = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction4(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.StyleSheets_typekey")(WordDotStyleSheets_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSheets]
  }
  
  extension [Self <: StyleSheets](x: Self) {
    
    inline def setAdd(value: (String, WdStyleSheetLinkType, String, WdStyleSheetPrecedence) => StyleSheet): Self = StObject.set(x, "Add", js.Any.fromFunction4(value))
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any => StyleSheet): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setWordDotStyleSheets_typekey(value: StyleSheets): Self = StObject.set(x, "Word.StyleSheets_typekey", value.asInstanceOf[js.Any])
  }
}
