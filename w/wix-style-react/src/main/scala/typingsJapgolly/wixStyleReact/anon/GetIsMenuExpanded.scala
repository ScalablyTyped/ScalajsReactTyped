package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesSidebarMod.SidebarSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIsMenuExpanded extends StObject {
  
  def backClicked(): Unit
  
  def getIsMenuExpanded(): Boolean
  
  def getSelectedKey(): String
  
  def getSkin(): SidebarSkin
  
  def itemClicked(itemKey: String): Unit
}
object GetIsMenuExpanded {
  
  inline def apply(
    backClicked: Callback,
    getIsMenuExpanded: CallbackTo[Boolean],
    getSelectedKey: CallbackTo[String],
    getSkin: CallbackTo[SidebarSkin],
    itemClicked: String => Callback
  ): GetIsMenuExpanded = {
    val __obj = js.Dynamic.literal(backClicked = backClicked.toJsFn, getIsMenuExpanded = getIsMenuExpanded.toJsFn, getSelectedKey = getSelectedKey.toJsFn, getSkin = getSkin.toJsFn, itemClicked = js.Any.fromFunction1((t0: String) => itemClicked(t0).runNow()))
    __obj.asInstanceOf[GetIsMenuExpanded]
  }
  
  extension [Self <: GetIsMenuExpanded](x: Self) {
    
    inline def setBackClicked(value: Callback): Self = StObject.set(x, "backClicked", value.toJsFn)
    
    inline def setGetIsMenuExpanded(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsMenuExpanded", value.toJsFn)
    
    inline def setGetSelectedKey(value: CallbackTo[String]): Self = StObject.set(x, "getSelectedKey", value.toJsFn)
    
    inline def setGetSkin(value: CallbackTo[SidebarSkin]): Self = StObject.set(x, "getSkin", value.toJsFn)
    
    inline def setItemClicked(value: String => Callback): Self = StObject.set(x, "itemClicked", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
