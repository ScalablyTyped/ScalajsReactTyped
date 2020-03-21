package typingsJapgolly.koaPassport.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaPassport.AnonPauseStream
import typingsJapgolly.koaPassport.AnonUserProperty
import typingsJapgolly.koaPassport.FnCall
import typingsJapgolly.koaPassport.FnCallFn
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.passport.AnonInstantiable
import typingsJapgolly.passport.mod.AuthenticateOptions
import typingsJapgolly.passport.mod.Framework
import typingsJapgolly.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-passport", "KoaPassport")
@js.native
class KoaPassport ()
  extends typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport

@JSImport("koa-passport", "KoaPassport")
@js.native
object KoaPassport extends js.Object {
  @js.native
  trait KoaPassport extends js.Object {
    @JSName("deserializeUser")
    var deserializeUser_Original: FnCallFn = js.native
    @JSName("serializeUser")
    var serializeUser_Original: FnCall = js.native
    @JSName("transformAuthInfo")
    var transformAuthInfo_Original: js.Function1[
        /* fn */ js.Function2[
          /* info */ js.Any, 
          /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
          Unit
        ], 
        Unit
      ] = js.native
    def authenticate(strategy: String): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: String, options: js.Object): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: String, options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: String, options: AuthenticateOptions): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: String, options: AuthenticateOptions, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: js.Array[String]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: js.Array[String], options: js.Object): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: js.Array[String], options: js.Object, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(strategy: js.Array[String], options: AuthenticateOptions): Middleware[DefaultState, DefaultContext] = js.native
    def authenticate(
      strategy: js.Array[String],
      options: AuthenticateOptions,
      callback: js.Function1[/* repeated */ js.Any, _]
    ): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: String): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: String, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: String, options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: String, options: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: js.Array[String]): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: js.Array[String], callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: js.Array[String], options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
    def authorize(strategy: js.Array[String], options: js.Any, callback: js.Function1[/* repeated */ js.Any, _]): Middleware[DefaultState, DefaultContext] = js.native
    def deserializeUser[TUser, TID](
      fn: js.Function2[
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
    def deserializeUser[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* id */ TID, 
          /* done */ js.Function2[/* err */ js.Any, /* user */ js.UndefOr[TUser], Unit], 
          Unit
        ]
    ): Unit = js.native
    def framework(fw: Framework[_, _, _]): this.type = js.native
    def initialize(): Middleware[DefaultState, DefaultContext] = js.native
    def initialize(options: AnonUserProperty): Middleware[DefaultState, DefaultContext] = js.native
    def serializeUser[TUser, TID](
      fn: js.Function2[
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    def serializeUser[TUser, TID, TR /* <: IncomingMessage */](
      fn: js.Function3[
          /* req */ TR, 
          /* user */ TUser, 
          /* done */ js.Function2[/* err */ js.Any, /* id */ js.UndefOr[TID], Unit], 
          Unit
        ]
    ): Unit = js.native
    def session(): Middleware[DefaultState, DefaultContext] = js.native
    def session(options: AnonPauseStream): Middleware[DefaultState, DefaultContext] = js.native
    def transformAuthInfo(
      fn: js.Function2[
          /* info */ js.Any, 
          /* done */ js.Function2[/* err */ js.Any, /* info */ js.Any, Unit], 
          Unit
        ]
    ): Unit = js.native
    def unuse(name: String): this.type = js.native
    def use(name: String, strategy: Strategy): this.type = js.native
    def use(strategy: Strategy): this.type = js.native
  }
  
  @js.native
  trait Static
    extends typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport {
    var Authenticator: AnonInstantiable = js.native
    var KoaPassport: Instantiable0[typingsJapgolly.koaPassport.mod.KoaPassport.KoaPassport] = js.native
    var Passport: AnonInstantiable = js.native
  }
  
}

