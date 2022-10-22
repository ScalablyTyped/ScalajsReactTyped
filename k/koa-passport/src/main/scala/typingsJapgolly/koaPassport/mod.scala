package typingsJapgolly.koaPassport

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaPassport.anon.FnCall
import typingsJapgolly.koaPassport.anon.FnCallFn
import typingsJapgolly.koaPassport.anon.PauseStream
import typingsJapgolly.koaPassport.anon.UserProperty
import typingsJapgolly.koaPassport.koaPassportBooleans.`false`
import typingsJapgolly.koaPassport.mod.KoaPassport.Static
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.passport.mod.AuthenticateOptions
import typingsJapgolly.passport.mod.Framework
import typingsJapgolly.passport.mod.Strategy
import typingsJapgolly.passport.mod.global.Express.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("koa-passport", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("koa-passport", "KoaPassport")
  @js.native
  open class KoaPassport ()
    extends StObject
       with typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport
  object KoaPassport {
    
    @js.native
    trait KoaPassport extends StObject {
      
      def authenticate(strategy: String): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: String, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: String, options: js.Object): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: String, options: js.Object, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: String, options: AuthenticateOptions): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: js.Array[String]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: js.Array[String], callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: js.Array[String], options: js.Object): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: js.Array[String], options: js.Object, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(strategy: js.Array[String], options: AuthenticateOptions): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authenticate(
        strategy: js.Array[String],
        options: AuthenticateOptions,
        callback: js.Function1[/* repeated */ Any, Any]
      ): Middleware[DefaultState, DefaultContext, Any] = js.native
      
      def authorize(strategy: String): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: String, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: String, options: Any): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: String, options: Any, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: js.Array[String]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: js.Array[String], options: Any): Middleware[DefaultState, DefaultContext, Any] = js.native
      def authorize(strategy: js.Array[String], options: Any, callback: js.Function1[/* repeated */ Any, Any]): Middleware[DefaultState, DefaultContext, Any] = js.native
      
      @JSName("deserializeUser")
      var deserializeUser_Original: FnCallFn = js.native
      @JSName("deserializeUser")
      def deserializeUser_false[TID](
        fn: js.Function2[
              /* id */ TID, 
              /* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[User | `false` | Null], Unit], 
              Unit
            ]
      ): Unit = js.native
      @JSName("deserializeUser")
      def deserializeUser_false[TID, TR /* <: IncomingMessage */](
        fn: js.Function3[
              /* req */ TR, 
              /* id */ TID, 
              /* done */ js.Function2[/* err */ Any, /* user */ js.UndefOr[User | `false` | Null], Unit], 
              Unit
            ]
      ): Unit = js.native
      
      def framework(fw: Framework[Any, Any, Any]): this.type = js.native
      
      def initialize(): Middleware[DefaultState, DefaultContext, Any] = js.native
      def initialize(options: UserProperty): Middleware[DefaultState, DefaultContext, Any] = js.native
      
      def serializeUser[TID](
        fn: js.Function2[
              /* user */ User, 
              /* done */ js.Function2[/* err */ Any, /* id */ js.UndefOr[TID], Unit], 
              Unit
            ]
      ): Unit = js.native
      def serializeUser[TID, TR /* <: IncomingMessage */](
        fn: js.Function3[
              /* req */ TR, 
              /* user */ User, 
              /* done */ js.Function2[/* err */ Any, /* id */ js.UndefOr[TID], Unit], 
              Unit
            ]
      ): Unit = js.native
      @JSName("serializeUser")
      var serializeUser_Original: FnCall = js.native
      
      def session(): Middleware[DefaultState, DefaultContext, Any] = js.native
      def session(options: PauseStream): Middleware[DefaultState, DefaultContext, Any] = js.native
      
      def transformAuthInfo(
        fn: js.Function2[/* info */ Any, /* done */ js.Function2[/* err */ Any, /* info */ Any, Unit], Unit]
      ): Unit = js.native
      @JSName("transformAuthInfo")
      var transformAuthInfo_Original: js.Function1[
            /* fn */ js.Function2[/* info */ Any, /* done */ js.Function2[/* err */ Any, /* info */ Any, Unit], Unit], 
            Unit
          ] = js.native
      
      def unuse(name: String): this.type = js.native
      
      def use(name: String, strategy: Strategy): this.type = js.native
      def use(strategy: Strategy): this.type = js.native
    }
    
    @js.native
    trait Static
      extends StObject
         with typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport {
      
      var Authenticator: /* import warning: importer.ImportType#apply Failed type conversion: koa-passport.koa-passport.KoaPassport.Static['Passport'] */ js.Any = js.native
      
      var KoaPassport: Instantiable0[typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport] = js.native
      
      var Passport: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof passport.Passport */ Any = js.native
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait ExtendableContext extends StObject {
      
      def isAuthenticated(): Boolean = js.native
      
      def isUnauthenticated(): Boolean = js.native
      
      def logIn(user: Any): js.Promise[Unit] = js.native
      def logIn(user: Any, options: Any): js.Promise[Unit] = js.native
      @JSName("logIn")
      var logIn_Original: js.Function2[/* user */ Any, /* options */ js.UndefOr[Any], js.Promise[Unit]] = js.native
      
      def logOut(): Unit = js.native
      @JSName("logOut")
      var logOut_Original: js.Function0[Unit] = js.native
      
      def login(user: Any): js.Promise[Unit] = js.native
      def login(user: Any, options: Any): js.Promise[Unit] = js.native
      
      def logout(): Unit = js.native
    }
  }
}
