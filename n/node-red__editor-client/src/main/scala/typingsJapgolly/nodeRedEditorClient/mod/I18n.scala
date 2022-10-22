package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
trait I18n extends StObject {
  
  def lang(): String
}
object I18n {
  
  inline def apply(lang: CallbackTo[String]): I18n = {
    val __obj = js.Dynamic.literal(lang = lang.toJsFn)
    __obj.asInstanceOf[I18n]
  }
  
  extension [Self <: I18n](x: Self) {
    
    inline def setLang(value: CallbackTo[String]): Self = StObject.set(x, "lang", value.toJsFn)
  }
}
