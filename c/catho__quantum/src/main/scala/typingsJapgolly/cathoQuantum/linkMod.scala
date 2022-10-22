package typingsJapgolly.cathoQuantum

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.cathoQuantum.anon.`12`
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.dark
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.default
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  trait Link
    extends StObject
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    @JSName("children")
    var children_Link: js.UndefOr[js.Array[Node] | Node] = js.undefined
    
    var skin: js.UndefOr[default | dark] = js.undefined
    
    var theme: js.UndefOr[`12`] = js.undefined
  }
  object Link {
    
    inline def apply(): Link = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setChildren(value: js.Array[Node] | Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSkin(value: default | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: `12`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
