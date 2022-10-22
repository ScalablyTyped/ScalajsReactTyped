package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonRedirectMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRedirect", "IonRedirect")
  @js.native
  open class IonRedirect protected () extends PureComponent[IonRedirectProps, IonRedirectState, Any] {
    def this(props: IonRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRedirectProps, context: Any) = this()
    
    @JSName("context")
    var context_IonRedirect: ContextType[Context[NavContextState]] = js.native
  }
  
  trait IonRedirectProps extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var routerOptions: js.UndefOr[Any] = js.undefined
    
    var to: String
  }
  object IonRedirectProps {
    
    inline def apply(to: String): IonRedirectProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonRedirectProps]
    }
    
    extension [Self <: IonRedirectProps](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRouterOptions(value: Any): Self = StObject.set(x, "routerOptions", value.asInstanceOf[js.Any])
      
      inline def setRouterOptionsUndefined: Self = StObject.set(x, "routerOptions", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait IonRedirectState extends StObject
}
