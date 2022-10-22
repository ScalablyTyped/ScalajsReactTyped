package typingsJapgolly.hasher

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hasher.mod.HasherJs.HasherStatic
import typingsJapgolly.signals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hasher", JSImport.Namespace)
  @js.native
  val ^ : HasherStatic = js.native
  
  // default value: '';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {signals.Signal} hasher.changed
  // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "changed")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  open class changed ()
    extends StObject
       with Signal[Any]
  
  // <static> {signals.Signal} hasher.initialized
  // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "initialized")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  open class initialized ()
    extends StObject
       with Signal[Any]
  
  // default value: '/';
  // <static> {signals.Signal} hasher.stopped
  // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "stopped")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  open class stopped ()
    extends StObject
       with Signal[Any]
  
  object HasherJs {
    
    trait HasherStatic extends StObject {
      
      // <static> <constant> {string} hasher.VERSION
      // hasher Version Number
      var VERSION: String
      
      // {string} hasher.appendHash
      // String that should always be added to the end of Hash value.
      var appendHash: String
      
      // default value: '';
      // will be automatically removed from `hasher.getHash()`
      // avoid conflicts with elements that contain ID equal to hash value;
      // <static> {signals.Signal} hasher.changed
      // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
      var changed: Signal[Any]
      
      // Method Detail
      // <static> hasher.dispose()
      // Removes all event listeners, stops hasher and destroy hasher object. - IMPORTANT: hasher won't work after calling this method, hasher Object will be deleted.
      def dispose(): Unit
      
      // <static> {string} hasher.getBaseURL()
      // Returns:
      // {string} Retrieve URL without query string and hash.
      def getBaseURL(): String
      
      // <static> {string} hasher.getHash()
      // Returns:
      // {string} Hash value without '#', `hasher.appendHash` and `hasher.prependHash`.
      def getHash(): String
      
      // <static> {Array.} hasher.getHashAsArray()
      // Returns:
      // {Array.} Hash value split into an Array.
      def getHashAsArray(): js.Array[String]
      
      // <static> {string} hasher.getURL()
      // Returns:
      // {string} Full URL.
      def getURL(): String
      
      // <static> hasher.init()
      // Start listening/dispatching changes in the hash/history.
      def init(): Unit
      
      // <static> {signals.Signal} hasher.initialized
      // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
      var initialized: Signal[Any]
      
      // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons before calling this method.
      // <static> {boolean} hasher.isActive()
      // Returns:
      // {boolean} If hasher is listening to changes on the browser history and/or hash value.
      def isActive(): Boolean
      
      // <static> {string} hasher.prependHash
      // String that should always be added to the beginning of Hash value.
      var prependHash: String
      
      // <static> hasher.replaceHash(path)
      // Set Hash value without keeping previous hash on the history record. Similar to calling window.location.replace("#/hash") but will also work on IE6-7.
      // hasher.replaceHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
      // Parameters:
      // {...string} path
      // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
      def replaceHash(path: String*): Unit
      
      // default value: '/';
      // will be automatically removed from `hasher.getHash()`
      // avoid conflicts with elements that contain ID equal to hash value;
      // <static> {string} hasher.separator
      // String used to split hash paths; used by hasher.getHashAsArray() to split paths.
      var separator: String
      
      // <static> hasher.setHash(path)
      // Set Hash value, generating a new history record.
      // hasher.setHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
      // Parameters:
      // {...string} path
      // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
      def setHash(path: String*): Unit
      
      // <static> hasher.stop()
      // Stop listening/dispatching changes in the hash/history.
      // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons after calling this method, unless you call hasher.init() again.
      // hasher will still dispatch changes made programatically by calling hasher.setHash();
      def stop(): Unit
      
      // default value: '/';
      // <static> {signals.Signal} hasher.stopped
      // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
      var stopped: Signal[Any]
    }
    object HasherStatic {
      
      inline def apply(
        VERSION: String,
        appendHash: String,
        changed: Signal[Any],
        dispose: Callback,
        getBaseURL: CallbackTo[String],
        getHash: CallbackTo[String],
        getHashAsArray: CallbackTo[js.Array[String]],
        getURL: CallbackTo[String],
        init: Callback,
        initialized: Signal[Any],
        isActive: CallbackTo[Boolean],
        prependHash: String,
        replaceHash: /* repeated */ String => Callback,
        separator: String,
        setHash: /* repeated */ String => Callback,
        stop: Callback,
        stopped: Signal[Any]
      ): HasherStatic = {
        val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], appendHash = appendHash.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], dispose = dispose.toJsFn, getBaseURL = getBaseURL.toJsFn, getHash = getHash.toJsFn, getHashAsArray = getHashAsArray.toJsFn, getURL = getURL.toJsFn, init = init.toJsFn, initialized = initialized.asInstanceOf[js.Any], isActive = isActive.toJsFn, prependHash = prependHash.asInstanceOf[js.Any], replaceHash = js.Any.fromFunction1((t0: /* repeated */ String) => replaceHash(t0).runNow()), separator = separator.asInstanceOf[js.Any], setHash = js.Any.fromFunction1((t0: /* repeated */ String) => setHash(t0).runNow()), stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any])
        __obj.asInstanceOf[HasherStatic]
      }
      
      extension [Self <: HasherStatic](x: Self) {
        
        inline def setAppendHash(value: String): Self = StObject.set(x, "appendHash", value.asInstanceOf[js.Any])
        
        inline def setChanged(value: Signal[Any]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
        
        inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
        
        inline def setGetBaseURL(value: CallbackTo[String]): Self = StObject.set(x, "getBaseURL", value.toJsFn)
        
        inline def setGetHash(value: CallbackTo[String]): Self = StObject.set(x, "getHash", value.toJsFn)
        
        inline def setGetHashAsArray(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getHashAsArray", value.toJsFn)
        
        inline def setGetURL(value: CallbackTo[String]): Self = StObject.set(x, "getURL", value.toJsFn)
        
        inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
        
        inline def setInitialized(value: Signal[Any]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
        
        inline def setPrependHash(value: String): Self = StObject.set(x, "prependHash", value.asInstanceOf[js.Any])
        
        inline def setReplaceHash(value: /* repeated */ String => Callback): Self = StObject.set(x, "replaceHash", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSetHash(value: /* repeated */ String => Callback): Self = StObject.set(x, "setHash", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
        
        inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
        
        inline def setStopped(value: Signal[Any]): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
        
        inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = HasherStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HasherStatic = ^
}
