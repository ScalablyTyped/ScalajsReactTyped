package typingsJapgolly.reduxFirstRouterLink

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reduxFirstRouter.mod.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-first-router-link", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LinkProps, js.Object, Any]
  
  @JSImport("redux-first-router-link", "NavLink")
  @js.native
  open class NavLink protected ()
    extends Component[NavLinkProps, js.Object, Any] {
    def this(props: NavLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavLinkProps, context: Any) = this()
  }
  
  type Link = japgolly.scalajs.react.facade.React.Component[LinkProps & js.Object, js.Object]
  
  trait LinkProps
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var down: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
    
    var replace: js.UndefOr[Boolean] = js.undefined
    
    var shouldDispatch: js.UndefOr[Boolean] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var to: To
  }
  object LinkProps {
    
    inline def apply(to: To): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setShouldDispatch(value: Boolean): Self = StObject.set(x, "shouldDispatch", value.asInstanceOf[js.Any])
      
      inline def setShouldDispatchUndefined: Self = StObject.set(x, "shouldDispatch", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: To): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
    }
  }
  
  trait Match[P] extends StObject {
    
    var isExact: Boolean
    
    var params: P
    
    var path: String
    
    var url: String
  }
  object Match {
    
    inline def apply[P](isExact: Boolean, params: P, path: String, url: String): Match[P] = {
      val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match[P]]
    }
    
    extension [Self <: Match[?], P](x: Self & Match[P]) {
      
      inline def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavLinkProps
    extends StObject
       with LinkProps {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var ariaCurrent: js.UndefOr[String] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var isActive: js.UndefOr[js.Function2[/* match */ Match[js.Object], /* location */ Location, Boolean]] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object NavLinkProps {
    
    inline def apply(to: To): NavLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavLinkProps]
    }
    
    extension [Self <: NavLinkProps](x: Self) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setAriaCurrent(value: String): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setIsActive(value: (/* match */ Match[js.Object], /* location */ Location) => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type To = String | js.Array[String] | js.Object
}
