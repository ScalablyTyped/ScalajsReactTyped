package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsMenuExpandedSelected extends StObject {
  
  def getIsMenuExpanded(): Boolean
  
  def selected(): Boolean
}
object GetIsMenuExpandedSelected {
  
  inline def apply(getIsMenuExpanded: CallbackTo[Boolean], selected: CallbackTo[Boolean]): GetIsMenuExpandedSelected = {
    val __obj = js.Dynamic.literal(getIsMenuExpanded = getIsMenuExpanded.toJsFn, selected = selected.toJsFn)
    __obj.asInstanceOf[GetIsMenuExpandedSelected]
  }
  
  extension [Self <: GetIsMenuExpandedSelected](x: Self) {
    
    inline def setGetIsMenuExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsMenuExpanded", value.toJsFn)
    
    inline def setSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "selected", value.toJsFn)
  }
}
