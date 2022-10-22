package typingsJapgolly.koaSession

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.koa.mod.Application
import typingsJapgolly.koa.mod.Context
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import typingsJapgolly.koaSession.anon.Changed
import typingsJapgolly.koaSession.anon.Instantiable
import typingsJapgolly.koaSession.anon.PartialSession
import typingsJapgolly.koaSession.anon.PartialSessionexpirenumbe
import typingsJapgolly.koaSession.anon.Partialopts
import typingsJapgolly.koaSession.anon.Rolling
import typingsJapgolly.koaSession.koaSessionBooleans.`false`
import typingsJapgolly.koaSession.koaSessionStrings.lax
import typingsJapgolly.koaSession.koaSessionStrings.none
import typingsJapgolly.koaSession.koaSessionStrings.session
import typingsJapgolly.koaSession.koaSessionStrings.strict
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(CONFIG: Partialopts, app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].apply(CONFIG.asInstanceOf[js.Any], app.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(app: typingsJapgolly.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ContextSession extends StObject {
    
    var app: Application[DefaultState, DefaultContext]
    
    /**
      * Commit the session changes or removal.
      */
    def commit(): js.Promise[Unit]
    
    var ctx: Context
    
    /**
      * internal logic of `ctx.session`
      */
    def get(): Session
    
    /**
      * init session from external store
      * will be called in the front of session middleware
      */
    def initFromExternal(): js.Promise[Unit]
    
    var opts: typingsJapgolly.koaSession.mod.opts
    
    var prevHash: String
    
    var session: Session | `false`
    
    /**
      * internal logic of `ctx.session=`
      */
    def set(`val`: Any): Unit
    
    var store: stores
  }
  object ContextSession {
    
    inline def apply(
      app: Application[DefaultState, DefaultContext],
      commit: CallbackTo[js.Promise[Unit]],
      ctx: Context,
      get: CallbackTo[Session],
      initFromExternal: CallbackTo[js.Promise[Unit]],
      opts: opts,
      prevHash: String,
      session: Session | `false`,
      set: Any => Callback,
      store: stores
    ): ContextSession = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], commit = commit.toJsFn, ctx = ctx.asInstanceOf[js.Any], get = get.toJsFn, initFromExternal = initFromExternal.toJsFn, opts = opts.asInstanceOf[js.Any], prevHash = prevHash.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1((t0: Any) => set(t0).runNow()), store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSession]
    }
    
    extension [Self <: ContextSession](x: Self) {
      
      inline def setApp(value: Application[DefaultState, DefaultContext]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setCommit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "commit", value.toJsFn)
      
      inline def setCtx(value: Context): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setGet(value: CallbackTo[Session]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setInitFromExternal(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "initFromExternal", value.toJsFn)
      
      inline def setOpts(value: opts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setPrevHash(value: String): Self = StObject.set(x, "prevHash", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Session | `false`): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Any => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setStore(value: stores): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalKeys extends StObject {
    
    /**
      * get session object by key
      */
    def get(ctx: Context): js.UndefOr[String]
    
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(ctx: Context, value: Any): Unit
  }
  object ExternalKeys {
    
    inline def apply(get: Context => js.UndefOr[String], set: (Context, Any) => Callback): ExternalKeys = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2((t0: Context, t1: Any) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[ExternalKeys]
    }
    
    extension [Self <: ExternalKeys](x: Self) {
      
      inline def setGet(value: Context => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Context, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Context, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /**
    * Session model.
    */
  trait Session
    extends StObject
       with /**
    * allow to put any value on session object
    */
  /* _ */ StringDictionary[Any] {
    
    /**
      * alias to `toJSON`
      */
    def inspect(): js.Object
    
    /**
      * Return how many values there are in the session object.
      * Used to see if it"s "populated".
      */
    val length: Double
    
    /**
      * commit this session's headers if autoCommit is set to false.
      */
    def manuallyCommit(): js.Promise[Unit]
    
    /**
      * get/set session maxAge
      */
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    /**
      * populated flag, which is just a boolean alias of .length.
      */
    val populated: Boolean
    
    /**
      * save this session no matter whether it is populated
      */
    def save(): Unit
    
    /**
      * JSON representation of the session.
      */
    def toJSON(): js.Object
  }
  object Session {
    
    inline def apply(
      inspect: CallbackTo[js.Object],
      length: Double,
      manuallyCommit: CallbackTo[js.Promise[Unit]],
      populated: Boolean,
      save: Callback,
      toJSON: CallbackTo[js.Object]
    ): Session = {
      val __obj = js.Dynamic.literal(inspect = inspect.toJsFn, length = length.asInstanceOf[js.Any], manuallyCommit = manuallyCommit.toJsFn, populated = populated.asInstanceOf[js.Any], save = save.toJsFn, toJSON = toJSON.toJsFn)
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setInspect(value: CallbackTo[js.Object]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setManuallyCommit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "manuallyCommit", value.toJsFn)
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPopulated(value: Boolean): Self = StObject.set(x, "populated", value.asInstanceOf[js.Any])
      
      inline def setSave(value: Callback): Self = StObject.set(x, "save", value.toJsFn)
      
      inline def setToJSON(value: CallbackTo[js.Object]): Self = StObject.set(x, "toJSON", value.toJsFn)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    trait BaseContext extends StObject {
      
      var session: Session | Null
      
      val sessionOptions: js.UndefOr[opts] = js.undefined
    }
    object BaseContext {
      
      inline def apply(): BaseContext = {
        val __obj = js.Dynamic.literal(session = null)
        __obj.asInstanceOf[BaseContext]
      }
      
      extension [Self <: BaseContext](x: Self) {
        
        inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionNull: Self = StObject.set(x, "session", null)
        
        inline def setSessionOptions(value: opts): Self = StObject.set(x, "sessionOptions", value.asInstanceOf[js.Any])
        
        inline def setSessionOptionsUndefined: Self = StObject.set(x, "sessionOptions", js.undefined)
      }
    }
  }
  
  /* Inlined parent koa-session.koa-session.Omit<cookies.cookies.SetOption, 'maxAge'> */
  trait opts extends StObject {
    
    /**
      * If your session store requires data or utilities from context, opts.ContextStore is alse supported.
      * ContextStore must be a class which claims three instance methods demonstrated above.
      * new ContextStore(ctx) will be executed on every request.
      */
    var ContextStore: js.UndefOr[Instantiable] = js.undefined
    
    /**
      * (boolean) automatically commit headers (default true).
      */
    var autoCommit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hook: before save session
      */
    var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
    
    /**
      * custom decode method
      */
    def decode(str: String): js.Object
    /**
      * custom decode method
      */
    @JSName("decode")
    var decode_Original: js.Function1[/* str */ String, js.Object]
    
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * custom encode method
      */
    def encode(obj: js.Object): String
    /**
      * custom encode method
      */
    @JSName("encode")
    var encode_Original: js.Function1[/* obj */ js.Object, String]
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    /**
      * External key is used the cookie by default,
      * but you can use options.externalKey to customize your own external key methods.
      */
    var externalKey: js.UndefOr[ExternalKeys] = js.undefined
    
    /**
      * The way of generating external session id is controlled by the options.genid, which defaults to Date.now() + "-" + uid.sync(24).
      */
    def genid(): String
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * cookie key (default is koa:sess)
      */
    var key: String
    
    /**
      * maxAge in ms (default is 1 days)
      * "session" will result in a cookie that expires when session/browser is closed
      * Warning: If a session cookie is stolen, this cookie will never expire
      */
    var maxAge: js.UndefOr[Double | session] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * If you want to add prefix for all external session id, you can use options.prefix, it will not work if options.genid present.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Renew session when session is nearly expired, so we can always keep user logged in. (default is false)
      */
    var renew: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Force a session identifier cookie to be set on every response. The expiration is reset to the original maxAge, resetting the expiration countdown. default is false
      */
    var rolling: js.UndefOr[Boolean] = js.undefined
    
    var sameSite: js.UndefOr[strict | lax | none | Boolean] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var secureProxy: js.UndefOr[Boolean] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * You can store the session content in external stores(redis, mongodb or other DBs)
      */
    var store: js.UndefOr[stores] = js.undefined
    
    /**
      * Hook: valid session value before use it
      */
    var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ PartialSession, Unit]] = js.undefined
  }
  object opts {
    
    inline def apply(
      decode: /* str */ String => js.Object,
      encode: /* obj */ js.Object => String,
      genid: CallbackTo[String],
      key: String
    ): opts = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), genid = genid.toJsFn, key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[opts]
    }
    
    extension [Self <: opts](x: Self) {
      
      inline def setAutoCommit(value: Boolean): Self = StObject.set(x, "autoCommit", value.asInstanceOf[js.Any])
      
      inline def setAutoCommitUndefined: Self = StObject.set(x, "autoCommit", js.undefined)
      
      inline def setBeforeSave(value: (/* ctx */ Context, /* session */ Session) => Callback): Self = StObject.set(x, "beforeSave", js.Any.fromFunction2((t0: /* ctx */ Context, t1: /* session */ Session) => (value(t0, t1)).runNow()))
      
      inline def setBeforeSaveUndefined: Self = StObject.set(x, "beforeSave", js.undefined)
      
      inline def setContextStore(value: Instantiable): Self = StObject.set(x, "ContextStore", value.asInstanceOf[js.Any])
      
      inline def setContextStoreUndefined: Self = StObject.set(x, "ContextStore", js.undefined)
      
      inline def setDecode(value: /* str */ String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* obj */ js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setExternalKey(value: ExternalKeys): Self = StObject.set(x, "externalKey", value.asInstanceOf[js.Any])
      
      inline def setExternalKeyUndefined: Self = StObject.set(x, "externalKey", js.undefined)
      
      inline def setGenid(value: CallbackTo[String]): Self = StObject.set(x, "genid", value.toJsFn)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double | session): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRenew(value: Boolean): Self = StObject.set(x, "renew", value.asInstanceOf[js.Any])
      
      inline def setRenewUndefined: Self = StObject.set(x, "renew", js.undefined)
      
      inline def setRolling(value: Boolean): Self = StObject.set(x, "rolling", value.asInstanceOf[js.Any])
      
      inline def setRollingUndefined: Self = StObject.set(x, "rolling", js.undefined)
      
      inline def setSameSite(value: strict | lax | none | Boolean): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureProxy(value: Boolean): Self = StObject.set(x, "secureProxy", value.asInstanceOf[js.Any])
      
      inline def setSecureProxyUndefined: Self = StObject.set(x, "secureProxy", js.undefined)
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      inline def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
      
      inline def setStore(value: stores): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setValid(value: (/* ctx */ Context, /* session */ PartialSession) => Callback): Self = StObject.set(x, "valid", js.Any.fromFunction2((t0: /* ctx */ Context, t1: /* session */ PartialSession) => (value(t0, t1)).runNow()))
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  @js.native
  trait stores extends StObject {
    
    /**
      * destroy session for key
      */
    def destroy(key: String): Any = js.native
    
    /**
      * get session object by key
      */
    def get(key: String, maxAge: Double, data: Rolling): Any = js.native
    def get(key: String, maxAge: Unit, data: Rolling): Any = js.native
    @JSName("get")
    def get_session(key: String, maxAge: session, data: Rolling): Any = js.native
    
    /**
      * set session object for key, with a maxAge (in ms)
      */
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Double, data: Changed): Any = js.native
    def set(key: String, sess: PartialSessionexpirenumbe, maxAge: Unit, data: Changed): Any = js.native
    @JSName("set")
    def set_session(key: String, sess: PartialSessionexpirenumbe, maxAge: session, data: Changed): Any = js.native
  }
  
  trait util extends StObject {
    
    /**
      * Decode the base64 cookie value to an object.
      */
    def decode(str: String): js.Object
    
    /**
      * Encode an object into a base64-encoded JSON string.
      */
    def encode(obj: js.Object): String
    
    def hash(sess: Any): String
  }
  object util {
    
    inline def apply(decode: String => js.Object, encode: js.Object => String, hash: Any => String): util = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), hash = js.Any.fromFunction1(hash))
      __obj.asInstanceOf[util]
    }
    
    extension [Self <: util](x: Self) {
      
      inline def setDecode(value: String => js.Object): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: js.Object => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setHash(value: Any => String): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
    }
  }
}
