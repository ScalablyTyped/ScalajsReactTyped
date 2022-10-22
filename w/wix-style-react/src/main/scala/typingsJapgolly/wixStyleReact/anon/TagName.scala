package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.a
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagName extends StObject {
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  
  var tagName: a
}
object TagName {
  
  inline def apply(): TagName = {
    val __obj = js.Dynamic.literal(tagName = "a")
    __obj.asInstanceOf[TagName]
  }
  
  extension [Self <: TagName](x: Self) {
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLAnchorElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setTagName(value: a): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
