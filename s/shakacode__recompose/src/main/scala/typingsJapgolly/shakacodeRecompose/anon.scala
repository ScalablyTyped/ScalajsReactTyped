package typingsJapgolly.shakacodeRecompose

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children[TInner] extends StObject {
    
    def children(props: TInner): Element
  }
  object Children {
    
    inline def apply[TInner](children: TInner => Element): Children[TInner] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[Children[TInner]]
    }
    
    extension [Self <: Children[?], TInner](x: Self & Children[TInner]) {
      
      inline def setChildren(value: TInner => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
}
