package typingsJapgolly.salesforceCanvasJsSdk

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.Client_
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.Context
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.SignedRequest
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.AjaxSettings
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.Event
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.Size
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.Subscription
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.SubscriptionRef
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.client.Version
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.oauth.LoginContext
import typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.xd.OriginCheckFn
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: String
    
    var width: String
  }
  object Height {
    
    inline def apply(height: String, width: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var response: String
  }
  object Response {
    
    inline def apply(response: String): Response = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofcanvas extends StObject {
    
    def apply(callback: js.Function0[Unit]): Unit = js.native
    
    def appearsJson(value: String): Boolean = js.native
    
    def attr(el: HTMLElement, name: String): String = js.native
    
    def byClass(clazz: String): HTMLElement = js.native
    
    def byId(id: String): HTMLElement = js.native
    
    def capitalize(str: String): String = js.native
    
    val client: Typeofclient = js.native
    
    val console: Typeofconsole = js.native
    
    val cookies: Typeofcookies = js.native
    
    def decode(str: String): String = js.native
    
    def document(): Document = js.native
    
    def each[T, S](
      obj: js.Array[T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], Unit]
    ): Unit = js.native
    def each[T, S](
      obj: js.Array[T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], Unit],
      ctx: S
    ): Unit = js.native
    def each[T, S](
      obj: Record[String, T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], Unit]
    ): Unit = js.native
    def each[T, S](
      obj: Record[String, T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], Unit],
      ctx: S
    ): Unit = js.native
    
    def endsWith(str: String, suffix: String): Boolean = js.native
    
    def escapeToUTF8(str: String): String = js.native
    
    def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */](a: A, b: B): A & B = js.native
    def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */](a: A, b: B, c: C): A & B & C = js.native
    def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */, D /* <: Record[String, Any] */](a: A, b: B, c: C, d: D): A & B & C & D = js.native
    def extend[A /* <: Record[String, Any] */, B /* <: Record[String, Any] */, C /* <: Record[String, Any] */, D /* <: Record[String, Any] */, E /* <: Record[String, Any] */](a: A, b: B, c: C, d: D, e: E): A & B & C & D & E = js.native
    
    def hasOwn(obj: js.Object, prop: String): Boolean = js.native
    
    def identity[T](obj: T): T = js.native
    
    def indexOf[T](arr: ArrayLike[T], item: T): Double = js.native
    
    def invoker(fn: js.Function0[Unit]): Unit = js.native
    
    def isArguments(value: Any): Boolean = js.native
    
    def isArray(value: Any): /* is std.ArrayLike<unknown> */ Boolean = js.native
    
    def isEmpty(obj: Any): Boolean = js.native
    
    def isFunction(value: Any): Boolean = js.native
    
    def isNil(value: Any): Boolean = js.native
    
    def isNumber(value: Any): /* is number */ Boolean = js.native
    
    def isObject(value: Any): Boolean = js.native
    
    def isString(value: Any): /* is string */ Boolean = js.native
    
    def isUndefined(value: Any): /* is undefined */ Boolean = js.native
    
    def map[T, R, S](
      obj: js.Array[T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], R]
    ): js.Array[R] = js.native
    def map[T, R, S](
      obj: js.Array[T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* index */ Double, /* obj */ js.Array[T], R],
      ctx: S
    ): js.Array[R] = js.native
    def map[T, R, S](
      obj: Record[String, T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], R]
    ): js.Array[R] = js.native
    def map[T, R, S](
      obj: Record[String, T],
      it: js.ThisFunction3[/* this */ S, /* item */ T, /* key */ String, /* obj */ Record[String, T], R],
      ctx: S
    ): js.Array[R] = js.native
    
    def module(ns: String, decl: Record[String, Any]): /* import warning: importer.ImportType#apply Failed type conversion: typeof canvas */ js.Any = js.native
    
    def nop(): Unit = js.native
    
    val oauth: Typeofoauth = js.native
    
    def objectify(q: String): Record[String, String] = js.native
    
    def onReady(callback: js.Function0[Unit]): Unit = js.native
    
    def param(obj: ArrayLike[Any]): String = js.native
    def param(obj: ArrayLike[Any], encode: Boolean): String = js.native
    def param(obj: Record[String, Any]): String = js.native
    def param(obj: Record[String, Any], encode: Boolean): String = js.native
    
    def prototypeOf(obj: Any): js.Object | Null = js.native
    
    def query(url: String, q: String): String = js.native
    
    def remove[T](arr: ArrayLike[T], item: T): js.Array[T] = js.native
    
    def size(): Double = js.native
    def size(obj: ArrayLike[Any]): Double = js.native
    def size(obj: Record[String, Any]): Double = js.native
    
    def slice[T](arr: js.Array[T]): js.Array[T] = js.native
    def slice[T](arr: js.Array[T], begin: Double): js.Array[T] = js.native
    def slice[T](arr: js.Array[T], begin: Double, end: Double): js.Array[T] = js.native
    def slice[T](arr: js.Array[T], begin: Unit, end: Double): js.Array[T] = js.native
    
    def startsWithHttp(orig: String, newUrl: String): String = js.native
    
    def stripUrl(url: String): String = js.native
    
    def toArray(): js.Array[Any] = js.native
    def toArray[T](iterable: ArrayLike[T]): js.Array[T] = js.native
    def toArray[T](iterable: Record[String, T]): js.Array[T] = js.native
    
    def uncapitalize(str: String): String = js.native
    
    def validEventName(name: String, res: String): Double = js.native
    def validEventName(name: String, res: js.Array[String]): Double = js.native
    
    def values[T](obj: ArrayLike[T]): js.Array[T] = js.native
    def values[T](obj: Record[String, T]): js.Array[T] = js.native
    
    val xd: Typeofxd = js.native
  }
  
  @js.native
  trait Typeofclient extends StObject {
    
    def ajax(url: String, settings: AjaxSettings): Unit = js.native
    
    def autogrow(client: Client_): Unit = js.native
    def autogrow(client: Client_, enabled: Boolean): Unit = js.native
    def autogrow(client: Client_, enabled: Boolean, interval: Double): Unit = js.native
    def autogrow(client: Client_, enabled: Unit, interval: Double): Unit = js.native
    
    def ctx(
      callback: js.Function1[
          /* msg */ typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.Response[Context | String], 
          Unit
        ],
      client: Client_
    ): Unit = js.native
    
    def publish(client: Client_, event: Event): Unit = js.native
    
    def refreshSignedRequest(
      cb: js.Function1[
          /* data */ typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.Response[Response], 
          Unit
        ]
    ): Unit = js.native
    
    def repost(): Unit = js.native
    def repost(refresh: Boolean): Unit = js.native
    
    def resize(client: Client_): Unit = js.native
    def resize(client: Client_, size: Height): Unit = js.native
    
    def signedrequest(): SignedRequest = js.native
    def signedrequest(req: SignedRequest): SignedRequest = js.native
    
    def size(): Size = js.native
    
    def subscribe(client: Client_, subscriptions: js.Array[Subscription]): Unit = js.native
    def subscribe(client: Client_, subscriptions: Subscription): Unit = js.native
    
    def token(): String | Null = js.native
    def token(t: String): String | Null = js.native
    
    def unsubscribe(client: Client_, subscriptions: js.Array[SubscriptionRef]): Unit = js.native
    def unsubscribe(client: Client_, subscriptions: SubscriptionRef): Unit = js.native
    
    def version(): Version = js.native
  }
  
  trait Typeofconsole extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    def error(args: Any*): Unit
    
    def log(args: Any*): Unit
  }
  object Typeofconsole {
    
    inline def apply(
      disable: Callback,
      enable: Callback,
      error: /* repeated */ Any => Callback,
      log: /* repeated */ Any => Callback
    ): Typeofconsole = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()), log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()))
      __obj.asInstanceOf[Typeofconsole]
    }
    
    extension [Self <: Typeofconsole](x: Self) {
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait Typeofcookies extends StObject {
    
    def get(name: String): String = js.native
    
    def remove(name: String): Unit = js.native
    
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, days: Double): Unit = js.native
  }
  
  @js.native
  trait Typeofoauth extends StObject {
    
    /** @deprecated */
    def checkChildWindowStatus(): Unit = js.native
    
    def childWindowUnloadNotification(hash: String): Unit = js.native
    
    def client(): Client_ = js.native
    
    def init(): Unit = js.native
    
    def instance(): String | Null = js.native
    def instance(t: String): String | Null = js.native
    
    def loggedin(): Boolean = js.native
    
    def login(ctx: LoginContext): Unit = js.native
    
    def loginUrl(): String = js.native
    
    def logout(): Unit = js.native
    
    def token(): String | Null = js.native
    def token(t: String): String | Null = js.native
  }
  
  @js.native
  trait Typeofxd extends StObject {
    
    def post(message: String, targetUrl: String): Unit = js.native
    def post(message: String, targetUrl: String, target: Window): Unit = js.native
    
    def receive(callback: typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.xd.Callback): Unit = js.native
    def receive(callback: typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.xd.Callback, sourceOrigin: String): Unit = js.native
    def receive(
      callback: typingsJapgolly.salesforceCanvasJsSdk.Sfdc.canvas.xd.Callback,
      sourceOrigin: OriginCheckFn
    ): Unit = js.native
    
    def remove(): Unit = js.native
  }
}
