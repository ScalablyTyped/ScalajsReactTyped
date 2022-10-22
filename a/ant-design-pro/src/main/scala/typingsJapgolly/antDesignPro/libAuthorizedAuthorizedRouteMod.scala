package typingsJapgolly.antDesignPro

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthorizedAuthorizedRouteMod {
  
  @JSImport("ant-design-pro/lib/Authorized/AuthorizedRoute", JSImport.Default)
  @js.native
  open class default () extends Component[IAuthorizedRouteProps, Any, Any]
  
  type AuthorizedRoute = japgolly.scalajs.react.facade.React.Component[IAuthorizedRouteProps & js.Object, js.Object]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped react-router.react-router/dist/lib/components.PathRouteProps | react-router.react-router/dist/lib/components.LayoutRouteProps | react-router.react-router/dist/lib/components.IndexRouteProps */ trait IAuthorizedRouteProps extends StObject {
    
    var authority: typingsJapgolly.antDesignPro.libAuthorizedAuthorizedRouteMod.authority
  }
  object IAuthorizedRouteProps {
    
    inline def apply(authority: authority): IAuthorizedRouteProps = {
      val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAuthorizedRouteProps]
    }
    
    extension [Self <: IAuthorizedRouteProps](x: Self) {
      
      inline def setAuthority(value: authority): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = StObject.set(x, "authority", js.Any.fromFunction1(value))
      
      inline def setAuthorityVarargs(value: String*): Self = StObject.set(x, "authority", js.Array(value*))
    }
  }
  
  type authority = String | js.Array[String] | authorityFN | js.Promise[Any]
  
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[String], Boolean]
}
