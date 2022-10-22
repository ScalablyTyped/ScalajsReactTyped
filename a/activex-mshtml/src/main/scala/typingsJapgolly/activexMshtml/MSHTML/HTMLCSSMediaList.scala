package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCSSMediaList extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLCSSMediaList_typekey")
  var MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList
  
  def appendMedium(bstrMedium: String): Unit
  
  def deleteMedium(bstrMedium: String): Unit
  
  def item(index: Double): String
  
  val length: Double
  
  var mediaText: String
}
object HTMLCSSMediaList {
  
  inline def apply(
    MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList,
    appendMedium: String => Callback,
    deleteMedium: String => Callback,
    item: Double => String,
    length: Double,
    mediaText: String
  ): HTMLCSSMediaList = {
    val __obj = js.Dynamic.literal(appendMedium = js.Any.fromFunction1((t0: String) => appendMedium(t0).runNow()), deleteMedium = js.Any.fromFunction1((t0: String) => deleteMedium(t0).runNow()), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], mediaText = mediaText.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSMediaList_typekey")(MSHTMLDotHTMLCSSMediaList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSMediaList]
  }
  
  extension [Self <: HTMLCSSMediaList](x: Self) {
    
    inline def setAppendMedium(value: String => Callback): Self = StObject.set(x, "appendMedium", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDeleteMedium(value: String => Callback): Self = StObject.set(x, "deleteMedium", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLCSSMediaList_typekey(value: HTMLCSSMediaList): Self = StObject.set(x, "MSHTML.HTMLCSSMediaList_typekey", value.asInstanceOf[js.Any])
    
    inline def setMediaText(value: String): Self = StObject.set(x, "mediaText", value.asInstanceOf[js.Any])
  }
}
