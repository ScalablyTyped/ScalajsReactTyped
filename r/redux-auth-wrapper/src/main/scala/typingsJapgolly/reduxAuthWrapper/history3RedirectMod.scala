package typingsJapgolly.reduxAuthWrapper

import typingsJapgolly.history.mod.Location
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxAuthWrapper.authWrapperMod.InjectedAuthProps
import typingsJapgolly.reduxAuthWrapper.mod.AuthBaseConfig
import typingsJapgolly.reduxAuthWrapper.mod.AuthConfig
import typingsJapgolly.reduxAuthWrapper.mod.AuthWrapperDecorator
import typingsJapgolly.reduxAuthWrapper.mod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history3RedirectMod {
  
  @JSImport("redux-auth-wrapper/history3/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connectedReduxRedirect[OwnProps, State](config: ConnectedReduxRedirectConfig[OwnProps, State]): AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedReduxRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[OwnProps & InjectedAuthReduxProps]]
  
  inline def connectedRouterRedirect[OwnProps, State](config: ConnectedRouterRedirectConfig[OwnProps, State]): AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connectedRouterRedirect")(config.asInstanceOf[js.Any]).asInstanceOf[AuthWrapperDecorator[
    OwnProps & (InjectedAuthRouterProps[js.Function1[/* repeated */ Any, Action[Any]]])
  ]]
  
  inline def createOnEnter[State](config: CreateOnEnterConfig[State]): js.Function3[
    /* store */ Store[Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ /* location */ Any, 
      Unit
    ], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOnEnter")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* store */ Store[Any, AnyAction], 
    /* nextState */ State, 
    /* redirect */ js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptorObject */ /* location */ Any, 
      Unit
    ], 
    Unit
  ]]
  
  type ConnectedReduxRedirectConfig[OwnProps, State] = ConnectedRouterRedirectConfig[OwnProps, State]
  
  trait ConnectedRouterRedirectConfig[OwnProps, State]
    extends StObject
       with AuthBaseConfig[OwnProps, State] {
    
    var allowRedirectBack: js.UndefOr[Boolean | (StateSelector[State, OwnProps, Boolean])] = js.undefined
    
    var redirectAction: js.UndefOr[js.Function1[/* location */ Location, Action[Any]]] = js.undefined
    
    var redirectPath: String | (StateSelector[State, OwnProps, String])
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object ConnectedRouterRedirectConfig {
    
    inline def apply[OwnProps, State](
      authenticatedSelector: (State, OwnProps) => Boolean,
      redirectPath: String | (StateSelector[State, OwnProps, String])
    ): ConnectedRouterRedirectConfig[OwnProps, State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectedRouterRedirectConfig[OwnProps, State]]
    }
    
    extension [Self <: ConnectedRouterRedirectConfig[?, ?], OwnProps, State](x: Self & (ConnectedRouterRedirectConfig[OwnProps, State])) {
      
      inline def setAllowRedirectBack(value: Boolean | (StateSelector[State, OwnProps, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectBackFunction2(value: (State, OwnProps) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      inline def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      inline def setRedirectAction(value: /* location */ Location => Action[Any]): Self = StObject.set(x, "redirectAction", js.Any.fromFunction1(value))
      
      inline def setRedirectActionUndefined: Self = StObject.set(x, "redirectAction", js.undefined)
      
      inline def setRedirectPath(value: String | (StateSelector[State, OwnProps, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      inline def setRedirectPathFunction2(value: (State, OwnProps) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      inline def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      inline def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
  
  trait CreateOnEnterConfig[State]
    extends StObject
       with AuthConfig {
    
    var allowRedirectBack: js.UndefOr[Boolean | (StateMutateSelector[State, Boolean])] = js.undefined
    
    var authenticatedSelector: StateMutateSelector[State, Boolean]
    
    var authenticatingSelector: js.UndefOr[StateMutateSelector[State, Boolean]] = js.undefined
    
    var redirectPath: String | (StateMutateSelector[State, String])
    
    var redirectQueryParamName: js.UndefOr[String] = js.undefined
  }
  object CreateOnEnterConfig {
    
    inline def apply[State](
      authenticatedSelector: (State, State) => Boolean,
      redirectPath: String | (StateMutateSelector[State, String])
    ): CreateOnEnterConfig[State] = {
      val __obj = js.Dynamic.literal(authenticatedSelector = js.Any.fromFunction2(authenticatedSelector), redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOnEnterConfig[State]]
    }
    
    extension [Self <: CreateOnEnterConfig[?], State](x: Self & CreateOnEnterConfig[State]) {
      
      inline def setAllowRedirectBack(value: Boolean | (StateMutateSelector[State, Boolean])): Self = StObject.set(x, "allowRedirectBack", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectBackFunction2(value: (State, State) => Boolean): Self = StObject.set(x, "allowRedirectBack", js.Any.fromFunction2(value))
      
      inline def setAllowRedirectBackUndefined: Self = StObject.set(x, "allowRedirectBack", js.undefined)
      
      inline def setAuthenticatedSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatedSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelector(value: (State, State) => Boolean): Self = StObject.set(x, "authenticatingSelector", js.Any.fromFunction2(value))
      
      inline def setAuthenticatingSelectorUndefined: Self = StObject.set(x, "authenticatingSelector", js.undefined)
      
      inline def setRedirectPath(value: String | (StateMutateSelector[State, String])): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
      
      inline def setRedirectPathFunction2(value: (State, State) => String): Self = StObject.set(x, "redirectPath", js.Any.fromFunction2(value))
      
      inline def setRedirectQueryParamName(value: String): Self = StObject.set(x, "redirectQueryParamName", value.asInstanceOf[js.Any])
      
      inline def setRedirectQueryParamNameUndefined: Self = StObject.set(x, "redirectQueryParamName", js.undefined)
    }
  }
  
  trait InjectedAuthReduxProps
    extends StObject
       with InjectedAuthProps {
    
    var redirectPath: String
  }
  object InjectedAuthReduxProps {
    
    inline def apply(isAuthenticated: Boolean, isAuthenticating: Boolean, redirectPath: String): InjectedAuthReduxProps = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthReduxProps]
    }
    
    extension [Self <: InjectedAuthReduxProps](x: Self) {
      
      inline def setRedirectPath(value: String): Self = StObject.set(x, "redirectPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait InjectedAuthRouterProps[Redirect]
    extends StObject
       with InjectedAuthReduxProps {
    
    var redirect: Redirect
  }
  object InjectedAuthRouterProps {
    
    inline def apply[Redirect](isAuthenticated: Boolean, isAuthenticating: Boolean, redirect: Redirect, redirectPath: String): InjectedAuthRouterProps[Redirect] = {
      val __obj = js.Dynamic.literal(isAuthenticated = isAuthenticated.asInstanceOf[js.Any], isAuthenticating = isAuthenticating.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], redirectPath = redirectPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectedAuthRouterProps[Redirect]]
    }
    
    extension [Self <: InjectedAuthRouterProps[?], Redirect](x: Self & InjectedAuthRouterProps[Redirect]) {
      
      inline def setRedirect(value: Redirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    }
  }
  
  type StateMutateSelector[State, R] = js.Function2[/* state */ State, /* nextState */ State, R]
}
