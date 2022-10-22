package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageNumber extends StObject {
  
  var Alignment: WdPageNumberAlignment
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  def Copy(): Unit
  
  val Creator: Double
  
  def Cut(): Unit
  
  def Delete(): Unit
  
  val Index: Double
  
  val Parent: Any
  
  def Select(): Unit
  
  /* private */ @JSName("Word.PageNumber_typekey")
  var WordDotPageNumber_typekey: PageNumber
}
object PageNumber {
  
  inline def apply(
    Alignment: WdPageNumberAlignment,
    Application: Application,
    Copy: Callback,
    Creator: Double,
    Cut: Callback,
    Delete: Callback,
    Index: Double,
    Parent: Any,
    Select: Callback,
    WordDotPageNumber_typekey: PageNumber
  ): PageNumber = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Copy = Copy.toJsFn, Creator = Creator.asInstanceOf[js.Any], Cut = Cut.toJsFn, Delete = Delete.toJsFn, Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = Select.toJsFn)
    __obj.updateDynamic("Word.PageNumber_typekey")(WordDotPageNumber_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageNumber]
  }
  
  extension [Self <: PageNumber](x: Self) {
    
    inline def setAlignment(value: WdPageNumberAlignment): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: Callback): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setCut(value: Callback): Self = StObject.set(x, "Cut", value.toJsFn)
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setWordDotPageNumber_typekey(value: PageNumber): Self = StObject.set(x, "Word.PageNumber_typekey", value.asInstanceOf[js.Any])
  }
}
