package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Data
import typingsJapgolly.nextAuth.anon.DataStatus
import typingsJapgolly.nextAuth.anon.Status
import typingsJapgolly.nextAuth.clientUtilsMod.CtxOrReq
import typingsJapgolly.nextAuth.coreTypesMod.Session
import typingsJapgolly.nextAuth.nextAuthStrings.hidden
import typingsJapgolly.nextAuth.nextAuthStrings.storage
import typingsJapgolly.nextAuth.nextAuthStrings.timer
import typingsJapgolly.nextAuth.providersMod.BuiltInProviderType
import typingsJapgolly.nextAuth.providersMod.RedirectableProviderType
import typingsJapgolly.nextAuth.reactTypesMod.ClientSafeProvider
import typingsJapgolly.nextAuth.reactTypesMod.LiteralUnion
import typingsJapgolly.nextAuth.reactTypesMod.SessionProviderProps
import typingsJapgolly.nextAuth.reactTypesMod.SignInAuthorizationParams
import typingsJapgolly.nextAuth.reactTypesMod.SignInOptions
import typingsJapgolly.nextAuth.reactTypesMod.SignOutParams
import typingsJapgolly.nextAuth.reactTypesMod.UseSessionOptions
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("next-auth/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next-auth/react", "SessionContext")
  @js.native
  val SessionContext: Context[js.UndefOr[Data | Status]] = js.native
  
  inline def SessionProvider(props: SessionProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SessionProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getCsrfToken(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCsrfToken")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def getCsrfToken(params: CtxOrReq): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCsrfToken")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getProviders(): js.Promise[(Record[LiteralUnion[BuiltInProviderType, String], ClientSafeProvider]) | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProviders")().asInstanceOf[js.Promise[(Record[LiteralUnion[BuiltInProviderType, String], ClientSafeProvider]) | Null]]
  
  inline def getSession(): js.Promise[Session | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")().asInstanceOf[js.Promise[Session | Null]]
  inline def getSession(params: GetSessionParams): js.Promise[Session | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSession")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Session | Null]]
  
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")().asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](provider: Unit, options: Unit, authorizationParams: SignInAuthorizationParams): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any], authorizationParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](provider: Unit, options: SignInOptions): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](provider: Unit, options: SignInOptions, authorizationParams: SignInAuthorizationParams): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any], authorizationParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](
    provider: LiteralUnion[
      /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? P | next-auth.next-auth/providers.BuiltInProviderType : next-auth.next-auth/providers.BuiltInProviderType */ js.Any, 
      String
    ]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](
    provider: LiteralUnion[
      /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? P | next-auth.next-auth/providers.BuiltInProviderType : next-auth.next-auth/providers.BuiltInProviderType */ js.Any, 
      String
    ],
    options: Unit,
    authorizationParams: SignInAuthorizationParams
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any], authorizationParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](
    provider: LiteralUnion[
      /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? P | next-auth.next-auth/providers.BuiltInProviderType : next-auth.next-auth/providers.BuiltInProviderType */ js.Any, 
      String
    ],
    options: SignInOptions
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  inline def signIn[P /* <: js.UndefOr[RedirectableProviderType] */](
    provider: LiteralUnion[
      /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? P | next-auth.next-auth/providers.BuiltInProviderType : next-auth.next-auth/providers.BuiltInProviderType */ js.Any, 
      String
    ],
    options: SignInOptions,
    authorizationParams: SignInAuthorizationParams
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("signIn")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any], authorizationParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: P extends next-auth.next-auth/providers.RedirectableProviderType ? next-auth.next-auth/react/types.SignInResponse | undefined : undefined */ js.Any
  ]]
  
  inline def signOut[R /* <: Boolean */](): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? undefined : next-auth.next-auth/react/types.SignOutResponse */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")().asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? undefined : next-auth.next-auth/react/types.SignOutResponse */ js.Any
  ]]
  inline def signOut[R /* <: Boolean */](options: SignOutParams[R]): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? undefined : next-auth.next-auth/react/types.SignOutResponse */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("signOut")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: R extends true ? undefined : next-auth.next-auth/react/types.SignOutResponse */ js.Any
  ]]
  
  inline def useSession[R /* <: Boolean */](): SessionContextValue[R] | DataStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("useSession")().asInstanceOf[SessionContextValue[R] | DataStatus]
  inline def useSession[R /* <: Boolean */](options: UseSessionOptions[R]): SessionContextValue[R] | DataStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("useSession")(options.asInstanceOf[js.Any]).asInstanceOf[SessionContextValue[R] | DataStatus]
  
  trait GetSessionParams
    extends StObject
       with CtxOrReq {
    
    var broadcast: js.UndefOr[Boolean] = js.undefined
    
    var event: js.UndefOr[storage | timer | hidden | String] = js.undefined
    
    var triggerEvent: js.UndefOr[Boolean] = js.undefined
  }
  object GetSessionParams {
    
    inline def apply(): GetSessionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSessionParams]
    }
    
    extension [Self <: GetSessionParams](x: Self) {
      
      inline def setBroadcast(value: Boolean): Self = StObject.set(x, "broadcast", value.asInstanceOf[js.Any])
      
      inline def setBroadcastUndefined: Self = StObject.set(x, "broadcast", js.undefined)
      
      inline def setEvent(value: storage | timer | hidden | String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setTriggerEvent(value: Boolean): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
      
      inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    R extends true ? {  data :next-auth.next-auth/core/types.Session,   status :'authenticated'} | {  data :null,   status :'loading'} : {  data :next-auth.next-auth/core/types.Session,   status :'authenticated'} | {  data :null,   status :'unauthenticated' | 'loading'}
    }}}
    */
  @js.native
  trait SessionContextValue[R /* <: Boolean */] extends StObject
}
