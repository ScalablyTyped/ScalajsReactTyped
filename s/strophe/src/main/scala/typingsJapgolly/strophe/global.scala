package typingsJapgolly.strophe

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Text
import typingsJapgolly.strophe.mod.ConnectionOptions
import typingsJapgolly.strophe.mod.LogLevel
import typingsJapgolly.strophe.mod.SASLMechanism
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Strophe {
    
    @JSGlobal("Strophe")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Class: Strophe.Builder
      * XML DOM builder.
      *
      * This object provides an interface similar to JQuery but for building
      * DOM element easily and rapidly. All the functions except for toString()
      * and tree() return the object, so calls can be chained. Here's an
      * example using the $iq() builder helper.
      * > $iq({to: 'you', from: 'me', type: 'get', id: '1'})
      * >   .c('query', {xmlns: 'strophe:example'})
      * >   .c('example')
      * >   .toString()
      * The above generates this XML fragment
      * > <iq to='you' from='me' type='get' id='1'>
      * >  <query xmlns='strophe:example'>
      * >   <example/>
      * >  </query>
      * > </iq>
      * The corresponding DOM manipulations to get a similar fragment would be
      * a lot more tedious and probably involve several helper variables.
      *
      * Since adding children makes new operations operate on the child, up()
      * is provided to traverse up the tree. To add two children, do
      * > builder.c('child1', ...).up().c('child2', ...)
      * The next operation on the Builder will be relative to the second child.
      */
    @JSGlobal("Strophe.Builder")
    @js.native
    open class Builder protected ()
      extends typingsJapgolly.strophe.mod.Builder {
      /**
        * Constructor: Strophe.Builder
        * Create a Strophe.Builder object.
        *
        * The attributes should be passed in object notation. For example
        * > const b = new Builder('message', {to: 'you', from: 'me'});
        * or
        * > const b = new Builder('messsage', {'xml:lang': 'en'});
        *
        * Parameters:
        *  (String) name - The name of the root element.
        *  (Object) attrs - The attributes for the root element in object notation.
        *
        * Returns:
        *  A new Strophe.Builder.
        */
      def this(name: String) = this()
      def this(name: String, attrs: Any) = this()
    }
    
    /**
      * Class: Strophe.Connection
      * XMPP Connection manager.
      *
      * This class is the main part of Strophe. It manages a BOSH connection
      * to an XMPP server and dispatches events to the user callbacks as
      * data arrives. It supports SASL PLAIN, SASL DIGEST-MD5, SASL SCRAM-SHA1
      * and legacy authentication.
      *
      * After creating a Strophe.Connection object, the user will typically
      * call connect() with a user supplied callback to handle connection level
      * events like authentication failure, disconnection, or connection
      * complete.
      *
      * The user will also have several event handlers defined by using
      * addHandler() and addTimedHandler(). These will allow the user code to
      * respond to interesting stanzas or do something periodically with the
      * connection. These handlers will be active once authentication is
      * finished.
      *
      * To send data to the connection, use send().
      */
    @JSGlobal("Strophe.Connection")
    @js.native
    open class Connection protected ()
      extends typingsJapgolly.strophe.mod.Connection {
      // todo: what other members are meant to be public?
      /**
        * Constructor: Strophe.Connection
        * Create and initialize a Strophe.Connection object.
        *
        * The transport-protocol for this connection will be chosen automatically
        * based on the given service parameter. URLs starting with "ws: //" or
        * "wss: //" will use WebSockets, URLs starting with "http: //", "https: //"
        * or without a protocol will use BOSH.
        *
        * To make Strophe connect to the current host you can leave out the protocol
        * and host part and just pass the path, e.g.
        *
        * > const conn = new Strophe.Connection("/http-bind/");
        *
        * WebSocket options:
        *
        * If you want to connect to the current host with a WebSocket connection you
        * can tell Strophe to use WebSockets through a "protocol" attribute in the
        * optional options parameter. Valid values are "ws" for WebSocket and "wss"
        * for Secure WebSocket.
        * So to connect to "wss: //CURRENT_HOSTNAME/xmpp-websocket" you would call
        *
        * > const conn = new Strophe.Connection("/xmpp-websocket/", {protocol: "wss"});
        *
        * Note that relative URLs _NOT_ starting with a "/" will also include the path
        * of the current site.
        *
        * Also because downgrading security is not permitted by browsers, when using
        * relative URLs both BOSH and WebSocket connections will use their secure
        * variants if the current connection to the site is also secure (https).
        *
        * BOSH options:
        *
        * by adding "sync" to the options, you can control if requests will
        * be made synchronously or not. The default behaviour is asynchronous.
        * If you want to make requests synchronous, make "sync" evaluate to true:
        * > const conn = new Strophe.Connection("/http-bind/", {sync: true});
        * You can also toggle this on an already established connection:
        * > conn.options.sync = true;
        *
        *
        * Parameters:
        *  (String) service - The BOSH or WebSocket service URL.
        *  (Object) options - A hash of configuration options
        *
        * Returns:
        *  A new Strophe.Connection object.
        */
      def this(service: String) = this()
      def this(service: String, options: ConnectionOptions) = this()
    }
    
    /**
      * Constants: Log Level Constants
      * Logging level indicators.
      *
      * LogLevel.DEBUG - Debug output
      * LogLevel.INFO - Informational output
      * LogLevel.WARN - Warnings
      * LogLevel.ERROR - Errors
      * LogLevel.FATAL - Fatal errors
      */
    @JSGlobal("Strophe.LogLevel")
    @js.native
    object LogLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.strophe.mod.LogLevel & Double] = js.native
      
      /* 0 */ val DEBUG: typingsJapgolly.strophe.mod.LogLevel.DEBUG & Double = js.native
      
      /* 3 */ val ERROR: typingsJapgolly.strophe.mod.LogLevel.ERROR & Double = js.native
      
      /* 4 */ val FATAL: typingsJapgolly.strophe.mod.LogLevel.FATAL & Double = js.native
      
      /* 1 */ val INFO: typingsJapgolly.strophe.mod.LogLevel.INFO & Double = js.native
      
      /* 2 */ val WARN: typingsJapgolly.strophe.mod.LogLevel.WARN & Double = js.native
    }
    
    /**
      * Constants: XMPP Namespace Constants
      * Common namespace constants from the XMPP RFCs and XEPs.
      *
      * NS.HTTPBIND - HTTP BIND namespace from XEP 124.
      * NS.BOSH - BOSH namespace from XEP 206.
      * NS.CLIENT - Main XMPP client namespace.
      * NS.AUTH - Legacy authentication namespace.
      * NS.ROSTER - Roster operations namespace.
      * NS.PROFILE - Profile namespace.
      * NS.DISCO_INFO - Service discovery info namespace from XEP 30.
      * NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
      * NS.MUC - Multi-User Chat namespace from XEP 45.
      * NS.SASL - XMPP SASL namespace from RFC 3920.
      * NS.STREAM - XMPP Streams namespace from RFC 3920.
      * NS.BIND - XMPP Binding namespace from RFC 3920.
      * NS.SESSION - XMPP Session namespace from RFC 3920.
      * NS.XHTML_IM - XHTML-IM namespace from XEP 71.
      * NS.XHTML - XHTML body namespace from XEP 71.
      */
    object NS {
      
      @JSGlobal("Strophe.NS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Strophe.NS.AUTH")
      @js.native
      def AUTH: String = js.native
      inline def AUTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.BIND")
      @js.native
      def BIND: String = js.native
      inline def BIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIND")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.BOSH")
      @js.native
      def BOSH: String = js.native
      inline def BOSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOSH")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.CLIENT")
      @js.native
      def CLIENT: String = js.native
      inline def CLIENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLIENT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.DISCO_INFO")
      @js.native
      def DISCO_INFO: String = js.native
      inline def DISCO_INFO_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_INFO")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.DISCO_ITEMS")
      @js.native
      def DISCO_ITEMS: String = js.native
      inline def DISCO_ITEMS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCO_ITEMS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.FRAMING")
      @js.native
      def FRAMING: String = js.native
      inline def FRAMING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAMING")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.HTTPBIND")
      @js.native
      def HTTPBIND: String = js.native
      inline def HTTPBIND_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPBIND")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.MUC")
      @js.native
      def MUC: String = js.native
      inline def MUC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUC")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.PROFILE")
      @js.native
      def PROFILE: String = js.native
      inline def PROFILE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROFILE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.ROSTER")
      @js.native
      def ROSTER: String = js.native
      inline def ROSTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSTER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.SASL")
      @js.native
      def SASL: String = js.native
      inline def SASL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.SESSION")
      @js.native
      def SESSION: String = js.native
      inline def SESSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.STANZAS")
      @js.native
      def STANZAS: String = js.native
      inline def STANZAS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANZAS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.STREAM")
      @js.native
      def STREAM: String = js.native
      inline def STREAM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STREAM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.VERSION")
      @js.native
      def VERSION: String = js.native
      inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.XHTML")
      @js.native
      def XHTML: String = js.native
      inline def XHTML_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Strophe.NS.XHTML_IM")
      @js.native
      def XHTML_IM: String = js.native
      inline def XHTML_IM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XHTML_IM")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Constants: SASL mechanisms
      * Available authentication mechanisms
      *
      * Strophe.SASLAnonymous - SASL Anonymous authentication.
      * Strophe.SASLPlain - SASL Plain authentication.
      * Strophe.SASLMD5 - SASL Digest-MD5 authentication
      * Strophe.SASLSHA1 - SASL SCRAM-SHA1 authentication
      */
    @JSGlobal("Strophe.SASLAnonymous")
    @js.native
    val SASLAnonymous: SASLMechanism = js.native
    
    @JSGlobal("Strophe.SASLMD5")
    @js.native
    val SASLMD5: SASLMechanism = js.native
    
    @JSGlobal("Strophe.SASLPlain")
    @js.native
    val SASLPlain: SASLMechanism = js.native
    
    @JSGlobal("Strophe.SASLSHA1")
    @js.native
    val SASLSHA1: SASLMechanism = js.native
    
    /**
      * Constants: Connection Status Constants
      * Connection status constants for use by the connection handler
      * callback.
      *
      * Status.ERROR - An error has occurred
      * Status.CONNECTING - The connection is currently being made
      * Status.CONNFAIL - The connection attempt failed
      * Status.AUTHENTICATING - The connection is authenticating
      * Status.AUTHFAIL - The authentication attempt failed
      * Status.CONNECTED - The connection has succeeded
      * Status.DISCONNECTED - The connection has been terminated
      * Status.DISCONNECTING - The connection is currently being terminated
      * Status.ATTACHED - The connection has been attached
      */
    @JSGlobal("Strophe.Status")
    @js.native
    object Status extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.strophe.mod.Status & Double] = js.native
      
      /* 8 */ val ATTACHED: typingsJapgolly.strophe.mod.Status.ATTACHED & Double = js.native
      
      /* 3 */ val AUTHENTICATING: typingsJapgolly.strophe.mod.Status.AUTHENTICATING & Double = js.native
      
      /* 4 */ val AUTHFAIL: typingsJapgolly.strophe.mod.Status.AUTHFAIL & Double = js.native
      
      /* 5 */ val CONNECTED: typingsJapgolly.strophe.mod.Status.CONNECTED & Double = js.native
      
      /* 1 */ val CONNECTING: typingsJapgolly.strophe.mod.Status.CONNECTING & Double = js.native
      
      /* 2 */ val CONNFAIL: typingsJapgolly.strophe.mod.Status.CONNFAIL & Double = js.native
      
      /* 10 */ val CONNTIMEOUT: typingsJapgolly.strophe.mod.Status.CONNTIMEOUT & Double = js.native
      
      /* 6 */ val DISCONNECTED: typingsJapgolly.strophe.mod.Status.DISCONNECTED & Double = js.native
      
      /* 7 */ val DISCONNECTING: typingsJapgolly.strophe.mod.Status.DISCONNECTING & Double = js.native
      
      /* 0 */ val ERROR: typingsJapgolly.strophe.mod.Status.ERROR & Double = js.native
      
      /* 9 */ val REDIRECT: typingsJapgolly.strophe.mod.Status.REDIRECT & Double = js.native
    }
    
    /**
      * Constant: VERSION
      * The version of the Strophe library. Unreleased builds will have
      * a version of head-HASH where HASH is a partial revision.
      */
    @JSGlobal("Strophe.VERSION")
    @js.native
    val VERSION: String = js.native
    
    /**
      * Function: addConnectionPlugin
      * Extends the Strophe.Connection object with the given plugin.
      *
      * Parameters:
      *  (String) name - The name of the extension.
      *  (Object) ptype - The plugin's prototype.
      */
    inline def addConnectionPlugin(name: String, ptype: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionPlugin")(name.asInstanceOf[js.Any], ptype.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Function: addNamespace
      * This function is used to extend the current namespaces in
      * Strophe.NS. It takes a key and a value with the key being the
      * name of the new namespace, with its actual value.
      * For example:
      * Strophe.addNamespace('PUBSUB', "http: //jabber.org/protocol/pubsub");
      *
      * Parameters:
      *  (String) name - The name under which the namespace will be
      *   referenced under Strophe.NS
      *  (String) value - The actual namespace.
      */
    inline def addNamespace(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNamespace")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Function: $build
      * Create a Strophe.Builder.
      * This is an alias for 'new Strophe.Builder(name, attrs)'.
      *
      * Parameters:
      *  (String) name - The root element name.
      *  (Object) attrs - The attributes for the root element in object notation.
      *
      * Returns:
      *  A new Strophe.Builder object.
      */
    inline def build(name: String): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$build")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    inline def build(name: String, attrs: Any): typingsJapgolly.strophe.mod.Builder = (^.asInstanceOf[js.Dynamic].applyDynamic("$build")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    
    /**
      * Function: copyElement
      * Copy an XML DOM element.
      *
      * This function copies a DOM element and all its descendants and returns
      * the new copy.
      *
      * Parameters:
      *  (XMLElement) elem - A DOM element.
      *
      * Returns:
      *  A new, copied DOM element tree.
      */
    inline def copyElement(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("copyElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Function: createHtml
      * Copy an HTML DOM element into an XML DOM.
      *
      * This function copies a DOM element and all its descendants and returns
      * the new copy.
      *
      * Parameters:
      *  (Element) elem - A DOM element.
      *
      * Returns:
      *  A new, copied DOM element tree.
      */
    inline def createHtml(elem: Element): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtml")(elem.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Functions: debug, info, warn, error
      * Log a message at the appropriate Strophe.LogLevel
      *
      * Parameters:
      *  (String) msg - The log message.
      */
    inline def debug(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Function: escapeNode
      * Escape the node part (also called local part) of a JID.
      *
      * Parameters:
      *  (String) node - A node (or local part).
      *
      * Returns:
      *  An escaped node (or local part).
      */
    inline def escapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fatal(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Function: forEachChild
      * Map a function over some or all child elements of a given element.
      *
      * This is a small convenience function for mapping a function over
      * some or all of the children of an element. If elemName is null, all
      * children will be passed to the function, otherwise only children
      * whose tag names match elemName will be passed.
      *
      * Parameters:
      *  (XMLElement) elem - The element to operate on.
      *  (String) elemName - The child element tag name filter.
      *  (Function) func - The function to apply to each child. This
      *   function should take a single argument, a DOM element.
      */
    inline def forEachChild(elem: Element, elemName: String, func: js.Function1[/* child */ Element, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(elem.asInstanceOf[js.Any], elemName.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Function: getBareJidFromJid
      * Get the bare JID from a JID String.
      *
      * Parameters:
      *  (String) jid - A JID.
      *
      * Returns:
      *  A String containing the bare JID.
      */
    inline def getBareJidFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBareJidFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Function: getDomainFromJid
      * Get the domain portion of a JID String.
      *
      * Parameters:
      *  (String) jid - A JID.
      *
      * Returns:
      *  A String containing the domain.
      */
    inline def getDomainFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Function: getNodeFromJid
      * Get the node portion of a JID String.
      *
      * Parameters:
      *  (String) jid - A JID.
      *
      * Returns:
      *  A String containing the node.
      */
    inline def getNodeFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Function: getResourceFromJid
      * Get the resource portion of a JID String.
      *
      * Parameters:
      *  (String) jid - A JID.
      *
      * Returns:
      *  A String containing the resource.
      */
    inline def getResourceFromJid(jid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourceFromJid")(jid.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Function: getText
      * Get the concatenation of all text children of an element.
      *
      * Parameters:
      *  (XMLElement) elem - A DOM element.
      *
      * Returns:
      *  A String with the concatenated text of all text element children.
      */
    inline def getText(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    
    object global {
      
      /* was `typeof Strophe.$build` */
      @JSGlobal("$build")
      @js.native
      def build: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$build */ Any = js.native
      
      inline def build_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$build */ Any): Unit = js.Dynamic.global.updateDynamic("$build")(x.asInstanceOf[js.Any])
      
      /* was `typeof Strophe.$iq` */
      @JSGlobal("$iq")
      @js.native
      def iq: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$iq */ Any = js.native
      
      inline def iq_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$iq */ Any): Unit = js.Dynamic.global.updateDynamic("$iq")(x.asInstanceOf[js.Any])
      
      /* was `typeof Strophe.$msg` */
      @JSGlobal("$msg")
      @js.native
      def msg: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$msg */ Any = js.native
      
      inline def msg_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$msg */ Any): Unit = js.Dynamic.global.updateDynamic("$msg")(x.asInstanceOf[js.Any])
      
      /* was `typeof Strophe.$pres` */
      @JSGlobal("$pres")
      @js.native
      def pres: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$pres */ Any = js.native
      
      inline def pres_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Strophe.$pres */ Any): Unit = js.Dynamic.global.updateDynamic("$pres")(x.asInstanceOf[js.Any])
    }
    
    inline def info(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Function: $iq
      * Create a Strophe.Builder with an <iq/> element as the root.
      *
      * Parameters:
      *  (Object) attrs - The <iq/> element attributes in object notation.
      *
      * Returns:
      *  A new Strophe.Builder object.
      */
    inline def iq(): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$iq")().asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    inline def iq(attrs: Any): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$iq")(attrs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    
    /**
      * Function: isTagEqual
      * Compare an element's tag name with a string.
      *
      * This function is case sensitive.
      *
      * Parameters:
      *  (XMLElement) el - A DOM element.
      *  (String) name - The element name.
      *
      * Returns:
      *  true if the element's tag name matches _el_, and false
      *  otherwise.
      */
    inline def isTagEqual(el: Element, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTagEqual")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Function: log
      * User overrideable logging function.
      *
      * This function is called whenever the Strophe library calls any
      * of the logging functions. The default implementation of this
      * function does nothing. If client code wishes to handle the logging
      * messages, it should override this with
      * > Strophe.log = function (level, msg) {
      * >  (user code here)
      * > };
      *
      * Please note that data sent and received over the wire is logged
      * via Strophe.Connection.rawInput() and Strophe.Connection.rawOutput().
      *
      * The different levels and their meanings are
      *
      *  DEBUG - Messages useful for debugging purposes.
      *  INFO - Informational messages. This is mostly information like
      *   'disconnect was called' or 'SASL auth succeeded'.
      *  WARN - Warnings about potential problems. This is mostly used
      *   to report transient connection errors like request timeouts.
      *  ERROR - Some error occurred.
      *  FATAL - A non-recoverable fatal error occurred.
      *
      * Parameters:
      *  (Integer) level - The log level of the log message. This will
      *   be one of the values in Strophe.LogLevel.
      *  (String) msg - The log message.
      */
    inline def log(level: LogLevel, msg: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(level.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Function: $msg
      * Create a Strophe.Builder with a <message/> element as the root.
      *
      * Parmaeters:
      *  (Object) attrs - The <message/> element attributes in object notation.
      *
      * Returns:
      *  A new Strophe.Builder object.
      */
    inline def msg(): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$msg")().asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    inline def msg(attrs: Any): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$msg")(attrs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    
    /**
      * Function: $pres
      * Create a Strophe.Builder with a <presence/> element as the root.
      *
      * Parameters:
      *  (Object) attrs - The <presence/> element attributes in object notation.
      *
      * Returns:
      *  A new Strophe.Builder object.
      */
    inline def pres(): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$pres")().asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    inline def pres(attrs: Any): typingsJapgolly.strophe.mod.Builder = ^.asInstanceOf[js.Dynamic].applyDynamic("$pres")(attrs.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.strophe.mod.Builder]
    
    /**
      * Function: serialize
      * Render a DOM element and all descendants to a String.
      *
      * Parameters:
      *  (XMLElement) elem - A DOM element.
      *
      * Returns:
      *  The serialized element tree as a String.
      */
    inline def serialize(elem: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def serialize(elem: typingsJapgolly.strophe.mod.Builder): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Function: unescapeNode
      * Unescape a node part (also called local part) of a JID.
      *
      * Parameters:
      *  (String) node - A node (or local part).
      *
      * Returns:
      *  An unescaped node (or local part).
      */
    inline def unescapeNode(node: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeNode")(node.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Function: xmlElement
      * Create an XML DOM element.
      *
      * This function creates an XML DOM element correctly across all
      * implementations. Note that these are not HTML DOM elements, which
      * aren't appropriate for XMPP stanzas.
      *
      * Parameters:
      *  (String) name - The name for the element.
      *  (Array|Object) attrs - An optional array or object containing
      *   key/value pairs to use as element attributes. The object should
      *   be in the format {'key': 'value'} or {key: 'value'}. The array
      *   should have the format [['key1', 'value1'], ['key2', 'value2']].
      *  (String) text - The text child data for the element.
      *
      * Returns:
      *  A new XML DOM element.
      */
    inline def xmlElement(name: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any]).asInstanceOf[Element]
    inline def xmlElement(name: String, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def xmlElement(name: String, attrs: Any, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def xmlElement(name: String, attrs: Unit, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def xmlElement(name: String, text: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def xmlElement(name: String, text: String, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def xmlElement(name: String, text: Unit, attrs: Any): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("xmlElement")(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    /**
      * Function: xmlGenerator
      * Get the DOM document to generate elements.
      *
      * Returns:
      *  The currently used DOM document.
      */
    inline def xmlGenerator(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlGenerator")().asInstanceOf[Document]
    
    /**
      * Function: xmlHtmlNode
      * Creates an XML DOM html node.
      *
      * Parameters:
      *  (String) html - The content of the html node.
      *
      * Returns:
      *  A new XML DOM text node.
      */
    inline def xmlHtmlNode(html: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlHtmlNode")(html.asInstanceOf[js.Any]).asInstanceOf[Document]
    
    /**
      * Function: xmlTextNode
      * Creates an XML DOM text node.
      *
      * Provides a cross implementation version of document.createTextNode.
      *
      * Parameters:
      *  (String) text - The content of the text node.
      *
      * Returns:
      *  A new XML DOM text node.
      */
    inline def xmlTextNode(text: String): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlTextNode")(text.asInstanceOf[js.Any]).asInstanceOf[Text]
    
    /* Function: xmlescape
      * Excapes invalid xml characters.
      *
      * Parameters:
      *  (String) text - text to escape.
      *
      * Returns:
      *   Escaped text.
      */
    inline def xmlescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* Function: xmlunescape
      * Unexcapes invalid xml characters.
      *
      * Parameters:
      *  (String) text - text to unescape.
      *
      * Returns:
      *   Unescaped text.
      */
    inline def xmlunescape(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xmlunescape")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
