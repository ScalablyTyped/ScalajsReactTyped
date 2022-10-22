package typingsJapgolly.reactJoyride.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var back: js.UndefOr[Node] = js.undefined
  
  var close: js.UndefOr[Node] = js.undefined
  
  var last: js.UndefOr[Node] = js.undefined
  
  var next: js.UndefOr[Node] = js.undefined
  
  var open: js.UndefOr[Node] = js.undefined
  
  var skip: js.UndefOr[Node] = js.undefined
}
object Locale {
  
  inline def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  extension [Self <: Locale](x: Self) {
    
    inline def setBack(value: VdomNode): Self = StObject.set(x, "back", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBackNull: Self = StObject.set(x, "back", null)
    
    inline def setBackUndefined: Self = StObject.set(x, "back", js.undefined)
    
    inline def setBackVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "back", js.Array(value*))
    
    inline def setBackVdomElement(value: VdomElement): Self = StObject.set(x, "back", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClose(value: VdomNode): Self = StObject.set(x, "close", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCloseNull: Self = StObject.set(x, "close", null)
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setCloseVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "close", js.Array(value*))
    
    inline def setCloseVdomElement(value: VdomElement): Self = StObject.set(x, "close", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLast(value: VdomNode): Self = StObject.set(x, "last", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLastNull: Self = StObject.set(x, "last", null)
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setLastVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "last", js.Array(value*))
    
    inline def setLastVdomElement(value: VdomElement): Self = StObject.set(x, "last", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNext(value: VdomNode): Self = StObject.set(x, "next", value.rawNode.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setNextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setNextVdomElement(value: VdomElement): Self = StObject.set(x, "next", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOpen(value: VdomNode): Self = StObject.set(x, "open", value.rawNode.asInstanceOf[js.Any])
    
    inline def setOpenNull: Self = StObject.set(x, "open", null)
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOpenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "open", js.Array(value*))
    
    inline def setOpenVdomElement(value: VdomElement): Self = StObject.set(x, "open", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSkip(value: VdomNode): Self = StObject.set(x, "skip", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSkipNull: Self = StObject.set(x, "skip", null)
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSkipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "skip", js.Array(value*))
    
    inline def setSkipVdomElement(value: VdomElement): Self = StObject.set(x, "skip", value.rawElement.asInstanceOf[js.Any])
  }
}
