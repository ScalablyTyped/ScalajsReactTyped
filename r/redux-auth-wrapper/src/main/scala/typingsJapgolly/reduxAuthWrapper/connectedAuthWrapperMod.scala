package typingsJapgolly.reduxAuthWrapper

import typingsJapgolly.reduxAuthWrapper.authWrapperMod.AuthWrapperConfig
import typingsJapgolly.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsJapgolly.reduxAuthWrapper.mod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectedAuthWrapperMod {
  
  @JSImport("redux-auth-wrapper/connectedAuthWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OwnProps, State](config: ConnectedAuthWrapperConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps & InjectedAuthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthProps]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.reduxAuthWrapper.mod.AuthConfig because Already inherited
  - typingsJapgolly.reduxAuthWrapper.mod.AuthBaseConfig because var conflicts: AuthenticatingComponent, wrapperDisplayName. Inlined authenticatedSelector, authenticatingSelector */ trait ConnectedAuthWrapperConfig[OwnProps, State]
    extends StObject
       with AuthWrapperConfig {
    
    var authenticatedSelector: StateSelector[State, OwnProps, Boolean]
    
    var authenticatingSelector: js.UndefOr[StateSelector[State, OwnProps, Boolean]] = js.undefined
  }
  object ConnectedAuthWrapperConfig {
    
    inline def apply[OwnProps, State](authenticatedSelector: (State, OwnProps) => Boolean): ConnectedAuthWrapperConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector))
      __obj.asInstanceOf[ConnectedAuthWrapperConfig[OwnProps, State]]
    }
    
    extension [Self <: ConnectedAuthWrapperConfig[?, ?], OwnProps, State](x: Self & (ConnectedAuthWrapperConfig[OwnProps, State])) {
      
      inline def setAuthenticatedSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelector(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
    }
  }
}
