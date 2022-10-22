package typingsJapgolly.reachRouter.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProps[TState]
  extends StObject
     with AnchorProps {
  
  var getProps: js.UndefOr[js.Function1[/* props */ LinkGetProps, js.Object]] = js.undefined
  
  /** @deprecated If using React >= 16.4, use ref instead. */
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[TState] = js.undefined
  
  var to: String
}
object LinkProps {
  
  inline def apply[TState](to: String): LinkProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkProps[TState]]
  }
  
  extension [Self <: LinkProps[?], TState](x: Self & LinkProps[TState]) {
    
    inline def setGetProps(value: /* props */ LinkGetProps => js.Object): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
    
    inline def setGetPropsUndefined: Self = StObject.set(x, "getProps", js.undefined)
    
    inline def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: HTMLAnchorElement | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: HTMLAnchorElement | Null) => value(t0).runNow()))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
