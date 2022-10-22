package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackClicked extends StObject {
  
  def backClicked(): Unit
  
  def getIsMenuExpanded(): Unit
  
  def getSelectedKey(): String
  
  def getSkin(): Any
  
  def itemClicked(itemKey: Any): Unit
}
object BackClicked {
  
  inline def apply(
    backClicked: Callback,
    getIsMenuExpanded: Callback,
    getSelectedKey: CallbackTo[String],
    getSkin: CallbackTo[Any],
    itemClicked: Any => Callback
  ): BackClicked = {
    val __obj = js.Dynamic.literal(backClicked = backClicked.toJsFn, getIsMenuExpanded = getIsMenuExpanded.toJsFn, getSelectedKey = getSelectedKey.toJsFn, getSkin = getSkin.toJsFn, itemClicked = js.Any.fromFunction1((t0: Any) => itemClicked(t0).runNow()))
    __obj.asInstanceOf[BackClicked]
  }
  
  extension [Self <: BackClicked](x: Self) {
    
    inline def setBackClicked(value: Callback): Self = StObject.set(x, "backClicked", value.toJsFn)
    
    inline def setGetIsMenuExpanded(value: Callback): Self = StObject.set(x, "getIsMenuExpanded", value.toJsFn)
    
    inline def setGetSelectedKey(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedKey", value.toJsFn)
    
    inline def setGetSkin(value: CallbackTo[Any]): Self = StObject.set(x, "getSkin", value.toJsFn)
    
    inline def setItemClicked(value: Any => Callback): Self = StObject.set(x, "itemClicked", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
