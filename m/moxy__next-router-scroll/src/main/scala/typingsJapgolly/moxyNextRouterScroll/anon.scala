package typingsJapgolly.moxyNextRouterScroll

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.moxyNextRouterScroll.scrollBehaviorMod.NextScrollBehaviorContext
import typingsJapgolly.scrollBehavior.mod.ScrollTarget
import typingsJapgolly.scrollBehavior.mod.ShouldUpdateScroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsPath extends StObject {
    
    var asPath: String
    
    var pathname: String
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  }
  object AsPath {
    
    inline def apply(
      asPath: String,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): AsPath = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsPath]
    }
    
    extension [Self <: AsPath](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disableNextLinkScroll: js.UndefOr[Boolean] = js.undefined
    
    var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[NextScrollBehaviorContext]] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableNextLinkScroll(value: Boolean): Self = StObject.set(x, "disableNextLinkScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableNextLinkScrollUndefined: Self = StObject.set(x, "disableNextLinkScroll", js.undefined)
      
      inline def setShouldUpdateScroll(
        value: (/* prevContext */ NextScrollBehaviorContext | Null, NextScrollBehaviorContext) => ScrollTarget
      ): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      inline def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
    }
  }
}
