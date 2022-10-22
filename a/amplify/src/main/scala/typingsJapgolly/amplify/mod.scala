package typingsJapgolly.amplify

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("amplify", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  trait AjaxSettings
    extends StObject
       with typingsJapgolly.jquery.JQuery.AjaxSettings[Any] {
    
    var dataMap: js.UndefOr[js.Object | (js.Function1[/* data */ Any, js.Object])] = js.undefined
    
    var decoder: js.UndefOr[Any] = js.undefined
  }
  object AjaxSettings {
    
    inline def apply(): AjaxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxSettings]
    }
    
    extension [Self <: AjaxSettings](x: Self) {
      
      inline def setDataMap(value: js.Object | (js.Function1[/* data */ Any, js.Object])): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
      
      inline def setDataMapFunction1(value: /* data */ Any => js.Object): Self = StObject.set(x, "dataMap", js.Any.fromFunction1(value))
      
      inline def setDataMapUndefined: Self = StObject.set(x, "dataMap", js.undefined)
      
      inline def setDecoder(value: Any): Self = StObject.set(x, "decoder", value.asInstanceOf[js.Any])
      
      inline def setDecoderUndefined: Self = StObject.set(x, "decoder", js.undefined)
    }
  }
  
  type Decoder = js.Function5[
    /* data */ js.UndefOr[Any], 
    /* status */ js.UndefOr[String], 
    /* xhr */ js.UndefOr[JQueryXHR], 
    /* success */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
    /* error */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
    Unit
  ]
  
  trait Decoders
    extends StObject
       with /* decoderName */ StringDictionary[Decoder] {
    
    def jsSend(): Unit
    def jsSend(data: Any): Unit
    def jsSend(data: Any, status: String): Unit
    def jsSend(data: Any, status: String, xhr: Unit, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Any,
      status: String,
      xhr: Unit,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Any, status: String, xhr: Unit, success: Unit, error: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(data: Any, status: String, xhr: JQueryXHR): Unit
    def jsSend(data: Any, status: String, xhr: JQueryXHR, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Any,
      status: String,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(
      data: Any,
      status: String,
      xhr: JQueryXHR,
      success: Unit,
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Any, status: Unit, xhr: Unit, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Any,
      status: Unit,
      xhr: Unit,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Any, status: Unit, xhr: Unit, success: Unit, error: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(data: Any, status: Unit, xhr: JQueryXHR): Unit
    def jsSend(data: Any, status: Unit, xhr: JQueryXHR, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Any,
      status: Unit,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(
      data: Any,
      status: Unit,
      xhr: JQueryXHR,
      success: Unit,
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Unit, status: String): Unit
    def jsSend(data: Unit, status: String, xhr: Unit, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Unit,
      status: String,
      xhr: Unit,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(
      data: Unit,
      status: String,
      xhr: Unit,
      success: Unit,
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Unit, status: String, xhr: JQueryXHR): Unit
    def jsSend(data: Unit, status: String, xhr: JQueryXHR, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Unit,
      status: String,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(
      data: Unit,
      status: String,
      xhr: JQueryXHR,
      success: Unit,
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Unit, status: Unit, xhr: Unit, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Unit,
      status: Unit,
      xhr: Unit,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(data: Unit, status: Unit, xhr: Unit, success: Unit, error: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(data: Unit, status: Unit, xhr: JQueryXHR): Unit
    def jsSend(data: Unit, status: Unit, xhr: JQueryXHR, success: js.Function1[/* repeated */ Any, Unit]): Unit
    def jsSend(
      data: Unit,
      status: Unit,
      xhr: JQueryXHR,
      success: js.Function1[/* repeated */ Any, Unit],
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    def jsSend(
      data: Unit,
      status: Unit,
      xhr: JQueryXHR,
      success: Unit,
      error: js.Function1[/* repeated */ Any, Unit]
    ): Unit
    @JSName("jsSend")
    var jsSend_Original: Decoder
  }
  object Decoders {
    
    inline def apply(
      jsSend: (/* data */ js.UndefOr[Any], /* status */ js.UndefOr[String], /* xhr */ js.UndefOr[JQueryXHR], /* success */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], /* error */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]]) => Callback
    ): Decoders = {
      val __obj = js.Dynamic.literal(jsSend = js.Any.fromFunction5((t0: /* data */ js.UndefOr[Any], t1: /* status */ js.UndefOr[String], t2: /* xhr */ js.UndefOr[JQueryXHR], t3: /* success */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], t4: /* error */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]]) => (jsSend(t0, t1, t2, t3, t4)).runNow()))
      __obj.asInstanceOf[Decoders]
    }
    
    extension [Self <: Decoders](x: Self) {
      
      inline def setJsSend(
        value: (/* data */ js.UndefOr[Any], /* status */ js.UndefOr[String], /* xhr */ js.UndefOr[JQueryXHR], /* success */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], /* error */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]]) => Callback
      ): Self = StObject.set(x, "jsSend", js.Any.fromFunction5((t0: /* data */ js.UndefOr[Any], t1: /* status */ js.UndefOr[String], t2: /* xhr */ js.UndefOr[JQueryXHR], t3: /* success */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], t4: /* error */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]]) => (value(t0, t1, t2, t3, t4)).runNow()))
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    /***
      * Request a resource.
      * resourceId: Identifier string for the resource.
      * data: A set of key/value pairs of data to be sent to the resource.
      * callback: A function to invoke if the resource is retrieved successfully.
      */
    def apply(resourceId: String): Unit = js.native
    def apply(resourceId: String, hash: Any): Unit = js.native
    def apply(resourceId: String, hash: Any, callback: js.Function): Unit = js.native
    def apply(resourceId: String, hash: Unit, callback: js.Function): Unit = js.native
    /***
      * Request a resource.
      * settings: A set of key/value pairs of settings for the request.
      *   resourceId: Identifier string for the resource.
      *   data (optional): Data associated with the request.
      *   success (optional): Function to invoke on success.
      *   error (optional): Function to invoke on error.
      */
    def apply(settings: RequestSettings): Any = js.native
    
    var cache: Any = js.native
    
    var decoders: Decoders = js.native
    
    /***
      * Define a resource.
      * resourceId: Identifier string for the resource.
      * requestType: The type of data retrieval method from the server. See the request types sections for more information.
      * settings: A set of key/value pairs that relate to the server communication technology. The following settings are available:
      *   Any settings found in jQuery.ajax().
      *   cache: See the cache section for more details.
      *   decoder: See the decoder section for more details.
      */
    def define(resourceId: String, requestType: String): Unit = js.native
    def define(resourceId: String, requestType: String, settings: AjaxSettings): Unit = js.native
    /***
      * Define a custom request.
      * resourceId: Identifier string for the resource.
      * resource: Function to handle requests. Receives a hash with the following properties:
      *   resourceId: Identifier string for the resource.
      *   data: Data provided by the user.
      *   success: Callback to invoke on success.
      *   error: Callback to invoke on error.
      */
    def define(resourceId: String, resource: js.Function1[/* settings */ RequestSettings, Unit]): Unit = js.native
  }
  
  trait RequestSettings extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var resourceId: String
    
    var success: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  }
  object RequestSettings {
    
    inline def apply(resourceId: String): RequestSettings = {
      val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestSettings]
    }
    
    extension [Self <: RequestSettings](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: /* repeated */ Any => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait Static extends StObject {
    
    /***
      * Publish a message.
      * topic: The name of the message to publish.
      * Any additional parameters will be passed to the subscriptions.
      * amplify.publish returns a boolean indicating whether any subscriptions returned false.
      * The return value is true if none of the subscriptions returned false, and false otherwise.
      * Note that only one subscription can return false because doing so will prevent additional subscriptions from being invoked.
      */
    def publish(topic: String, args: Any*): Boolean
    
    /***
      * Request a resource.
      * resourceId: Identifier string for the resource.
      * data: A set of key/value pairs of data to be sent to the resource.
      * callback: A function to invoke if the resource is retrieved successfully.
      */
    def request(resourceId: String): Unit
    def request(resourceId: String, hash: Any): Unit
    def request(resourceId: String, hash: Any, callback: js.Function): Unit
    def request(resourceId: String, hash: Unit, callback: js.Function): Unit
    /***
      * Request a resource.
      * settings: A set of key/value pairs of settings for the request.
      *   resourceId: Identifier string for the resource.
      *   data (optional): Data associated with the request.
      *   success (optional): Function to invoke on success.
      *   error (optional): Function to invoke on error.
      */
    def request(settings: RequestSettings): Any
    @JSName("request")
    var request_Original: Request
    
    /***
      * Gets a hash of all stored values.
      */
    def store(): Any
    /***
      * Gets a stored value based on the key.
      */
    def store(key: String): Any
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    def store(key: String, value: Any): Unit
    def store(key: String, value: Any, options: Any): Unit
    @JSName("store")
    var store_Original: Store
    
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def subscribe(topic: String, callback: js.Function): Unit
    def subscribe(topic: String, callback: js.Function, priority: Double): Unit
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * context: What this will be when the callback is invoked.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def subscribe(topic: String, context: Any, callback: js.Function): Unit
    def subscribe(topic: String, context: Any, callback: js.Function, priority: Double): Unit
    @JSName("subscribe")
    var subscribe_Original: Subscribe
    
    /***
      * Remove a subscription.
      * topic: The topic being unsubscribed from.
      * callback: The callback that was originally subscribed.
      */
    def unsubscribe(topic: String, callback: js.Function): Unit
  }
  object Static {
    
    inline def apply(
      publish: (String, /* repeated */ Any) => Boolean,
      request: Request,
      store: Store,
      subscribe: Subscribe,
      unsubscribe: (String, js.Function) => Callback
    ): Static = {
      val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish), request = request.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subscribe = subscribe.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2((t0: String, t1: js.Function) => (unsubscribe(t0, t1)).runNow()))
      __obj.asInstanceOf[Static]
    }
    
    extension [Self <: Static](x: Self) {
      
      inline def setPublish(value: (String, /* repeated */ Any) => Boolean): Self = StObject.set(x, "publish", js.Any.fromFunction2(value))
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setSubscribe(value: Subscribe): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: (String, js.Function) => Callback): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait StorageTypeStore extends StObject {
    
    /***
      * Gets a hash of all stored values.
      */
    def apply(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    def apply(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    def apply(key: String, value: Any): Unit = js.native
    def apply(key: String, value: Any, options: Any): Unit = js.native
  }
  
  @js.native
  trait Store
    extends StObject
       with StorageTypeStore {
    
    /***
      * Gets a hash of all stored values.
      */
    /***
      * Firefox 2+
      */
    def globalStorage(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    /***
      * Firefox 2+
      */
    def globalStorage(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * Firefox 2+
      */
    def globalStorage(key: String, value: Any): Unit = js.native
    def globalStorage(key: String, value: Any, options: Any): Unit = js.native
    /***
      * Firefox 2+
      */
    @JSName("globalStorage")
    var globalStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a hash of all stored values.
      */
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def localStorage(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def localStorage(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def localStorage(key: String, value: Any): Unit = js.native
    def localStorage(key: String, value: Any, options: Any): Unit = js.native
    /***
      * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    @JSName("localStorage")
    var localStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a hash of all stored values.
      */
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    def memory(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    def memory(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    def memory(key: String, value: Any): Unit = js.native
    def memory(key: String, value: Any, options: Any): Unit = js.native
    /***
      * An in-memory store is provided as a fallback if none of the other storage types are available.
      */
    @JSName("memory")
    var memory_Original: StorageTypeStore = js.native
    
    /***
      * Gets a hash of all stored values.
      */
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def sessionStorage(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def sessionStorage(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    def sessionStorage(key: String, value: Any): Unit = js.native
    def sessionStorage(key: String, value: Any, options: Any): Unit = js.native
    /***
      * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
      */
    @JSName("sessionStorage")
    var sessionStorage_Original: StorageTypeStore = js.native
    
    /***
      * Gets a hash of all stored values.
      */
    /***
      * IE 5 - 7
      */
    def userData(): Any = js.native
    /***
      * Gets a stored value based on the key.
      */
    /***
      * IE 5 - 7
      */
    def userData(key: String): Any = js.native
    /***
      * Stores a value for a given key using the default storage type.
      *
      * key: Identifier for the value being stored.
      * value: The value to store. The value can be anything that can be serialized as JSON.
      * [options]: A set of key/value pairs that relate to settings for storing the value.
      */
    /***
      * IE 5 - 7
      */
    def userData(key: String, value: Any): Unit = js.native
    def userData(key: String, value: Any, options: Any): Unit = js.native
    /***
      * IE 5 - 7
      */
    @JSName("userData")
    var userData_Original: StorageTypeStore = js.native
  }
  
  @js.native
  trait Subscribe extends StObject {
    
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def apply(topic: String, callback: js.Function): Unit = js.native
    def apply(topic: String, callback: js.Function, priority: Double): Unit = js.native
    /***
      * Subscribe to a message.
      * topic: Name of the message to subscribe to.
      * context: What this will be when the callback is invoked.
      * callback: Function to invoke when the message is published.
      * [priority]: Priority relative to other subscriptions for the same message. Lower values have higher priority. Default is 10.
      */
    def apply(topic: String, context: Any, callback: js.Function): Unit = js.native
    def apply(topic: String, context: Any, callback: js.Function, priority: Double): Unit = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
