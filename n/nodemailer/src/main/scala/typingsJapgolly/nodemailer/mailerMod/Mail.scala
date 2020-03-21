package typingsJapgolly.nodemailer.mailerMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.nodemailer.AnonConnection
import typingsJapgolly.nodemailer.mod.SentMessageInfo
import typingsJapgolly.nodemailer.mod.Transport
import typingsJapgolly.nodemailer.mod.TransportOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import typingsJapgolly.nodemailer.nodemailerStrings.end
import typingsJapgolly.nodemailer.nodemailerStrings.error
import typingsJapgolly.nodemailer.nodemailerStrings.idle
import typingsJapgolly.nodemailer.nodemailerStrings.oauth2_provision_cb
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_http
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_https
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_socks
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_socks4
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_socks4a
import typingsJapgolly.nodemailer.nodemailerStrings.proxy_handler_socks5
import typingsJapgolly.nodemailer.nodemailerStrings.token
import typingsJapgolly.nodemailer.sharedMod.Logger
import typingsJapgolly.nodemailer.xoauth2Mod.Token
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates an object for exposing the Mail API */
@js.native
trait Mail extends EventEmitter {
  /** Usage: typeof transporter.MailMessage */
  var MailMessage: typingsJapgolly.nodemailer.mailMessageMod.^ = js.native
  var dkim: typingsJapgolly.nodemailer.dkimMod.^ = js.native
  var logger: Logger = js.native
  var meta: Map[String, _] = js.native
  var options: Options = js.native
  var transporter: Transport = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  /** Closes all connections in the pool. If there is a message being sent, the connection is closed later */
  def close(): Unit = js.native
  @JSName("emit")
  def emit_error(event: error, error: js.Error): Boolean = js.native
  @JSName("emit")
  def emit_idle(event: idle): Boolean = js.native
  @JSName("emit")
  def emit_token(event: token, token: Token): Boolean = js.native
  def get(key: String): js.Any = js.native
  def getVersionString(): String = js.native
  @JSName("get")
  def get_oauth2provisioncb(key: oauth2_provision_cb): js.Function3[
    /* user */ String, 
    /* renew */ Boolean, 
    /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* expires */ Double, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlerhttp(key: proxy_handler_http): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlerhttps(key: proxy_handler_https): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks(key: proxy_handler_socks): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks4(key: proxy_handler_socks4): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks4a(key: proxy_handler_socks4a): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  @JSName("get")
  def get_proxyhandlersocks5(key: proxy_handler_socks5): js.Function3[
    /* proxy */ Url, 
    /* options */ TransportOptions, 
    /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ AnonConnection, Unit], 
    Unit
  ] = js.native
  /** Returns true if there are free slots in the queue */
  def isIdle(): Boolean = js.native
  @JSName("listeners")
  def listeners_end(event: end): js.Array[js.Function1[/* token */ Token, Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
  @JSName("listeners")
  def listeners_idle(event: idle): js.Array[js.Function0[Unit]] = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_idle(event: idle, listener: js.Function0[Unit]): this.type = js.native
  def sendMail(mailOptions: Options): js.Promise[SentMessageInfo] = js.native
  /** Sends an email using the preselected transport object */
  def sendMail(
    mailOptions: Options,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
  def set(key: String, value: js.Any): Map[String, _] = js.native
  @JSName("set")
  def set_oauth2provisioncb(
    key: oauth2_provision_cb,
    value: js.Function3[
      /* user */ String, 
      /* renew */ Boolean, 
      /* callback */ js.Function3[
        /* err */ js.Error | Null, 
        /* accessToken */ js.UndefOr[String], 
        /* expires */ js.UndefOr[Double], 
        Unit
      ], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlerhttp(
    key: proxy_handler_http,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlerhttps(
    key: proxy_handler_https,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks(
    key: proxy_handler_socks,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks4(
    key: proxy_handler_socks4,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks4a(
    key: proxy_handler_socks4a,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  @JSName("set")
  def set_proxyhandlersocks5(
    key: proxy_handler_socks5,
    value: js.Function3[
      /* proxy */ Url, 
      /* options */ TransportOptions, 
      /* callback */ js.Function2[/* err */ js.Error | Null, /* socketOptions */ js.UndefOr[AnonConnection], Unit], 
      Unit
    ]
  ): Map[String, _] = js.native
  /** Sets up proxy handler for a Nodemailer object */
  def setupProxy(proxyUrl: String): Unit = js.native
  def use(step: String, plugin: PluginFunction): this.type = js.native
  def verify(): js.Promise[`true`] = js.native
  /** Verifies SMTP configuration */
  @JSName("verify")
  def verify_true(callback: js.Function2[/* err */ js.Error | Null, `true`, Unit]): Unit = js.native
}

