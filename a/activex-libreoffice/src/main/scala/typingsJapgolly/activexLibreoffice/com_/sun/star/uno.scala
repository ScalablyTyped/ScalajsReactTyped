package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`16`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`17`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`18`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`19`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`20`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`21`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`22`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`23`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`24`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`25`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`26`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`27`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`28`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`29`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`30`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`31`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uno {
  
  /**
    * {@link Exception} signalling a deployment error.
    * @since OOo 1.1.2
    */
  type DeploymentException = RuntimeException
  
  /**
    * the base of all UNO exceptions
    *
    * All exceptions defined in UNO idl should derive from this exception.
    */
  trait Exception extends StObject {
    
    /**
      * should contain a reference to the original, which raised the exception.
      *
      * May be NULL.
      */
    var Context: XInterface
    
    /**
      * gives a detailed description of the reason, why the exception was thrown.
      *
      * The description should be as detailed as possible.
      */
    var Message: String
  }
  object Exception {
    
    inline def apply(Context: XInterface, Message: String): Exception = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exception]
    }
    
    extension [Self <: Exception](x: Self) {
      
      inline def setContext(value: XInterface): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    }
  }
  
  /** a simple named object container. */
  type NamingService = XNamingService
  
  /**
    * This exception or a subclass can occur at every interface method.
    *
    * It shall signal an error, which was not covered by the interface method specification. This exception (or a derived one) is thrown, when for instance
    * an interprocess bridge to the object broke down, some explicitly forbidden invalid parameters were passed ( e.g. null references ) or the called
    * object has been disposed before.
    */
  type RuntimeException = Exception
  
  /** Base exception for all security related exceptions. */
  type SecurityException = RuntimeException
  
  /**
    * This enum describes all type classes of UNO. Every specific type has a type class specifying the general context of the reflected type.
    *
    * Example: A type reflecting the interface {@link XInterface} is of type class INTERFACE and its name is "com.sun.star.uno.XInterface".
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`21`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`29`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`30`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`19`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`22`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`26`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`25`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`24`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`28`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`20`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`23`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`31`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`17`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`16`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`18`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`27`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  */
  trait TypeClass extends StObject
  object TypeClass {
    
    /** reflecting the any type; anys can carry any UNO value except of any values */
    inline def ANY: `14` = 14.asInstanceOf[`14`]
    
    /**
      * Deprecated, UNOIDL does not have an array concept.
      * @deprecated Deprecated
      */
    inline def ARRAY: `21` = 21.asInstanceOf[`21`]
    
    /** reflecting the boolean type; true and false */
    inline def BOOLEAN: `2` = 2.asInstanceOf[`2`]
    
    /** reflecting the 8-bit ordinal type */
    inline def BYTE: `3` = 3.asInstanceOf[`3`]
    
    /** reflecting the 16-bit unicode character type */
    inline def CHAR: `1` = 1.asInstanceOf[`1`]
    
    /** reflecting constants */
    inline def CONSTANT: `29` = 29.asInstanceOf[`29`]
    
    /** reflecting constants groups */
    inline def CONSTANTS: `30` = 30.asInstanceOf[`30`]
    
    /** reflecting the 64-bit floating point type */
    inline def DOUBLE: `11` = 11.asInstanceOf[`11`]
    
    /** reflecting enum types */
    inline def ENUM: `15` = 15.asInstanceOf[`15`]
    
    /** reflecting exception types */
    inline def EXCEPTION: `19` = 19.asInstanceOf[`19`]
    
    /** reflecting the 32-bit floating point type */
    inline def FLOAT: `10` = 10.asInstanceOf[`10`]
    
    /** reflecting the signed 64-bit ordinal type */
    inline def HYPER: `8` = 8.asInstanceOf[`8`]
    
    /** reflecting interface types */
    inline def INTERFACE: `22` = 22.asInstanceOf[`22`]
    
    /** reflecting interface attributes */
    inline def INTERFACE_ATTRIBUTE: `26` = 26.asInstanceOf[`26`]
    
    /** reflecting interface methods */
    inline def INTERFACE_METHOD: `25` = 25.asInstanceOf[`25`]
    
    /** reflecting the signed 32-bit ordinal type */
    inline def LONG: `6` = 6.asInstanceOf[`6`]
    
    /** reflecting modules */
    inline def MODULE: `24` = 24.asInstanceOf[`24`]
    
    /** reflecting properties */
    inline def PROPERTY: `28` = 28.asInstanceOf[`28`]
    
    /** reflecting sequence types */
    inline def SEQUENCE: `20` = 20.asInstanceOf[`20`]
    
    /** reflecting services */
    inline def SERVICE: `23` = 23.asInstanceOf[`23`]
    
    /** reflecting the signed 16-bit ordinal type */
    inline def SHORT: `4` = 4.asInstanceOf[`4`]
    
    /** reflecting singletons */
    inline def SINGLETON: `31` = 31.asInstanceOf[`31`]
    
    /** reflecting the string type; strings of unicode characters */
    inline def STRING: `12` = 12.asInstanceOf[`12`]
    
    /** reflecting compound types */
    inline def STRUCT: `17` = 17.asInstanceOf[`17`]
    
    /** reflecting the meta type */
    inline def TYPE: `13` = 13.asInstanceOf[`13`]
    
    /** reflecting typedefed types referencing other types */
    inline def TYPEDEF: `16` = 16.asInstanceOf[`16`]
    
    /**
      * Deprecated, UNOIDL does not have a union concept.
      * @deprecated Deprecated
      */
    inline def UNION: `18` = 18.asInstanceOf[`18`]
    
    /** reflecting the unreflectable type */
    inline def UNKNOWN: `27` = 27.asInstanceOf[`27`]
    
    /** reflecting the unsigned 64-bit ordinal type */
    inline def UNSIGNED_HYPER: `9` = 9.asInstanceOf[`9`]
    
    /** reflecting the unsigned 32-bit type */
    inline def UNSIGNED_LONG: `7` = 7.asInstanceOf[`7`]
    
    /** reflecting the unsigned 16-bit ordinal type */
    inline def UNSIGNED_SHORT: `5` = 5.asInstanceOf[`5`]
    
    /** reflecting the void type; denotes no type */
    inline def VOID: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * Specifies an universal interface key (globally unique).
    *
    * This struct is deprecated. Uiks are not used anymore.
    * @deprecated Deprecated
    */
  trait Uik extends StObject {
    
    /** specifies a 4 byte data block. */
    var Data1: Double
    
    /** specifies a 2 byte data block. */
    var Data2: Double
    
    /** specifies a 2 byte data block. */
    var Data3: Double
    
    /** specifies a 4 byte data block. */
    var Data4: Double
    
    /** specifies a 4 byte data block. */
    var Data5: Double
  }
  object Uik {
    
    inline def apply(Data1: Double, Data2: Double, Data3: Double, Data4: Double, Data5: Double): Uik = {
      val __obj = js.Dynamic.literal(Data1 = Data1.asInstanceOf[js.Any], Data2 = Data2.asInstanceOf[js.Any], Data3 = Data3.asInstanceOf[js.Any], Data4 = Data4.asInstanceOf[js.Any], Data5 = Data5.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uik]
    }
    
    extension [Self <: Uik](x: Self) {
      
      inline def setData1(value: Double): Self = StObject.set(x, "Data1", value.asInstanceOf[js.Any])
      
      inline def setData2(value: Double): Self = StObject.set(x, "Data2", value.asInstanceOf[js.Any])
      
      inline def setData3(value: Double): Self = StObject.set(x, "Data3", value.asInstanceOf[js.Any])
      
      inline def setData4(value: Double): Self = StObject.set(x, "Data4", value.asInstanceOf[js.Any])
      
      inline def setData5(value: Double): Self = StObject.set(x, "Data5", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is the server-side interface to a weak adapter.
    *
    * The implementation of {@link XAdapter} must know but not hold the adapted object, because it must not affect the lifetime of the adapted object.
    * @see XWeak for description of concepts.
    */
  trait XAdapter
    extends StObject
       with XInterface {
    
    /**
      * adds a reference to the adapter.
      *
      * All added references are called when the adapted object dies.
      */
    def addReference(xRef: XReference): Unit
    
    /** queries the adapted object if it is alive. */
    def queryAdapted(): XInterface
    
    /** removes a reference from the adapter. */
    def removeReference(xRef: XReference): Unit
  }
  object XAdapter {
    
    inline def apply(
      acquire: Callback,
      addReference: XReference => Callback,
      queryAdapted: CallbackTo[XInterface],
      queryInterface: `type` => Any,
      release: Callback,
      removeReference: XReference => Callback
    ): XAdapter = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addReference = js.Any.fromFunction1((t0: XReference) => addReference(t0).runNow()), queryAdapted = queryAdapted.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeReference = js.Any.fromFunction1((t0: XReference) => removeReference(t0).runNow()))
      __obj.asInstanceOf[XAdapter]
    }
    
    extension [Self <: XAdapter](x: Self) {
      
      inline def setAddReference(value: XReference => Callback): Self = StObject.set(x, "addReference", js.Any.fromFunction1((t0: XReference) => value(t0).runNow()))
      
      inline def setQueryAdapted(value: CallbackTo[XInterface]): Self = StObject.set(x, "queryAdapted", value.toJsFn)
      
      inline def setRemoveReference(value: XReference => Callback): Self = StObject.set(x, "removeReference", js.Any.fromFunction1((t0: XReference) => value(t0).runNow()))
    }
  }
  
  /**
    * Objects which implement this interface can become aggregates of a delegator.
    *
    * That means if an object "A" aggregates "B", "A" can provide all or some of the interfaces of "B". Whenever the method {@link
    * XInterface.queryInterface()} is called on either of the objects, the call will be forwarded to object "A". Object "A" now can determine whether to use
    * the interfaces of "A" or "B" or neither. Actually, any number of aggregates can be used, even nested ones (aggregated objects which are delegators by
    * themselves).
    *
    * The following rules are to be observed:  1. All calls to {@link XInterface.acquire()} which are made before the delegator was set (using the method
    * {@link XAggregation.setDelegator()} ) must not be taken back (using the method {@link XInterface.release()} ) before the delegation is removed by
    * calling `xAggregation->setDelegator(NULL)` .
    *
    *  2. The constructor of a delegator has to increment its own reference count by calling its method {@link XInterface.acquire()} before it sets itself
    * to any aggregate using the method {@link XAggregation.setDelegator()} . After that call it has to reset its own reference count without the destructor
    * getting called.
    *
    *  3. The destructor of a delegator has to reset the delegator in its aggregated objects by calling their method {@link XAggregation.setDelegator()}
    * with NULL before it releases its reference to its aggregated objects.
    * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
    */
  trait XAggregation
    extends StObject
       with XInterface {
    
    /**
      * is similar to {@link XInterface.queryInterface()} , but it is to be processed directly without being forwarded to the delegator.
      *
      * This method is only called from within an implementation of {@link XInterface.queryInterface()} or {@link XAggregation.queryAggregation()} . This
      * method is to be called by the delegator if it does not implement the interface itself. An object which got aggregated cannot depend on getting its own
      * interface when it calls the method {@link XInterface.queryInterface()} .
      * @see XAggregation.setDelegator
      */
    def queryAggregation(aType: `type`): Any
    
    /**
      * sets the object to which all calls to the method {@link XInterface.queryInterface()} have to be forwarded.
      * @param pDelegator specifies the object which handles the calls to {@link XInterface.queryInterface()} . If **pDelegator** is NULL, the delegator is remo
      * @see XAggregation.queryAggregation
      */
    def setDelegator(pDelegator: XInterface): Unit
  }
  object XAggregation {
    
    inline def apply(
      acquire: Callback,
      queryAggregation: `type` => Any,
      queryInterface: `type` => Any,
      release: Callback,
      setDelegator: XInterface => Callback
    ): XAggregation = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryAggregation = js.Any.fromFunction1(queryAggregation), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDelegator = js.Any.fromFunction1((t0: XInterface) => setDelegator(t0).runNow()))
      __obj.asInstanceOf[XAggregation]
    }
    
    extension [Self <: XAggregation](x: Self) {
      
      inline def setQueryAggregation(value: `type` => Any): Self = StObject.set(x, "queryAggregation", js.Any.fromFunction1(value))
      
      inline def setSetDelegator(value: XInterface => Callback): Self = StObject.set(x, "setDelegator", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
    }
  }
  
  /**
    * Component context to be passed to a component via {@link com.sun.star.lang.XSingleComponentFactory} . Arbitrary values (e.g. deployment values) can be
    * retrieved from the context.
    */
  trait XComponentContext
    extends StObject
       with XInterface {
    
    /**
      * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
      * because the service manager is used very often.
      * @returns service manager; throws {@link DeploymentException} in case service manager is null
      */
    val ServiceManager: XMultiComponentFactory
    
    /**
      * Gets the service manager instance to be used from key `/singletons/com.sun.star.lang.theServiceManager` . This method has been added for convenience,
      * because the service manager is used very often.
      * @returns service manager; throws {@link DeploymentException} in case service manager is null
      */
    def getServiceManager(): XMultiComponentFactory
    
    /**
      * Gets a value from the context.
      * @param Name name of value
      * @returns value
      */
    def getValueByName(Name: String): Any
  }
  object XComponentContext {
    
    inline def apply(
      ServiceManager: XMultiComponentFactory,
      acquire: Callback,
      getServiceManager: CallbackTo[XMultiComponentFactory],
      getValueByName: String => Any,
      queryInterface: `type` => Any,
      release: Callback
    ): XComponentContext = {
      val __obj = js.Dynamic.literal(ServiceManager = ServiceManager.asInstanceOf[js.Any], acquire = acquire.toJsFn, getServiceManager = getServiceManager.toJsFn, getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XComponentContext]
    }
    
    extension [Self <: XComponentContext](x: Self) {
      
      inline def setGetServiceManager(value: CallbackTo[XMultiComponentFactory]): Self = StObject.set(x, "getServiceManager", value.toJsFn)
      
      inline def setGetValueByName(value: String => Any): Self = StObject.set(x, "getValueByName", js.Any.fromFunction1(value))
      
      inline def setServiceManager(value: XMultiComponentFactory): Self = StObject.set(x, "ServiceManager", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Task (thread) local execution context for UNO. Arbitrary values can be retrieved from the context.
    *
    * You have to use UNO runtime functions to obtain the current context in your target language.
    */
  trait XCurrentContext
    extends StObject
       with XInterface {
    
    /**
      * Gets a value from the context.
      * @param Name name of value
      * @returns value
      */
    def getValueByName(Name: String): Any
  }
  object XCurrentContext {
    
    inline def apply(acquire: Callback, getValueByName: String => Any, queryInterface: `type` => Any, release: Callback): XCurrentContext = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getValueByName = js.Any.fromFunction1(getValueByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XCurrentContext]
    }
    
    extension [Self <: XCurrentContext](x: Self) {
      
      inline def setGetValueByName(value: String => Any): Self = StObject.set(x, "getValueByName", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * base interface of all UNO interfaces
    *
    * It provides lifetime control by reference counting and the possibility of querying for other interfaces of the same logical object.
    *
    * "Logical Object" in this case means that the interfaces actually can be supported by internal (e.g. aggregated) physical objects.
    *
    * Deriving from this interface is mandatory for all UNO interfaces.
    *
    * Each language binding (Java, C++, StarBasic, Python, ... ) may provide a different mapping of this interface, please look into the language dependent
    * documentation.
    *
    * The UNO object does not export the state of the reference count ( {@link acquire()} and {@link release()} do not have return values). In general, also
    * the UNO object itself should not make any assumption on the concrete value of the reference count (except on the transition from one to zero ).
    */
  trait XInterface extends StObject {
    
    /**
      * increases the reference counter by one.
      *
      * When you have called {@link acquire()} on the UNO object, it is often said, that you have a reference or a hard reference to the object.
      *
      * It is only allowed to invoke a method on an UNO object, when you keep a hard reference to it.
      *
      * Every call to acquire must be followed by a corresponding call to release some time later, which may eventually lead to the destruction of the object.
      */
    def acquire(): Unit
    
    /**
      * queries for a new interface to an existing UNO object.
      *
      * The {@link queryInterface()} method is the entry point to obtain other interfaces which are exported by the object. The caller asks the implementation
      * of the object, if it supports the interface specified by the type argument. The call may either return with a interface reference of the requested
      * type or with a void any.
      *
      * There are certain specifications, a {@link queryInterface()} implementation must not violate.
      *
      * 1) If queryInterface on a specific object has once returned a valid interface reference for a given type, it must return a valid reference for any
      * successive queryInterface calls on this object for the same type.
      *
      * 2) If queryInterface on a specific object has once returned a null reference for a given type, it must always return a null reference for the same
      * type.
      *
      * 3) If queryInterface on a reference A returns reference B, queryInterface on B for Type A must return interface reference A or calls made on the
      * returned reference must be equivalent to calls made on reference A.
      *
      * 4) If queryInterface on a reference A returns reference B, queryInterface on A and B for {@link XInterface} must return the same interface reference
      * (object identity).
      *
      * The reason for the strong specification is, that a Uno Runtime Environment (URE) may choose to cache {@link queryInterface()} calls.
      *
      * As mentioned above, certain language bindings may map this function differently also with different specifications, please visit the language
      * dependent specification for it. The current C++ binding sticks to the specification state
      *
      * The rules mentioned above are basically identical to the rules of QueryInterface in MS COM.
      * @param aType a UNO interface type, for which an object reference shall be obtained.
      * @returns an interface reference in case the requested interface is supported by the object, a void any otherwise.
      */
    def queryInterface(aType: `type`): Any
    
    /**
      * decreases the reference counter by one.
      *
      * When the reference counter reaches 0, the object gets deleted.
      *
      * Calling {@link release()} on the object is often called releasing or clearing the reference to an object.
      */
    def release(): Unit
  }
  object XInterface {
    
    inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback): XInterface = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XInterface]
    }
    
    extension [Self <: XInterface](x: Self) {
      
      inline def setAcquire(value: Callback): Self = StObject.set(x, "acquire", value.toJsFn)
      
      inline def setQueryInterface(value: `type` => Any): Self = StObject.set(x, "queryInterface", js.Any.fromFunction1(value))
      
      inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
    }
  }
  
  /** allows to insert, remove and access named objects. */
  trait XNamingService
    extends StObject
       with XInterface {
    
    /** provides a previous registered object. */
    def getRegisteredObject(Name: String): XInterface
    
    /**
      * registers one object under the specified name.
      *
      * If any object is registered before, then this object is revoked automatically.
      */
    def registerObject(Name: String, Object: XInterface): Unit
    
    /**
      * revokes the registration of an object.
      *
      * If the object was not previously registered, then this call does nothing.
      */
    def revokeObject(Name: String): Unit
  }
  object XNamingService {
    
    inline def apply(
      acquire: Callback,
      getRegisteredObject: String => XInterface,
      queryInterface: `type` => Any,
      registerObject: (String, XInterface) => Callback,
      release: Callback,
      revokeObject: String => Callback
    ): XNamingService = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getRegisteredObject = js.Any.fromFunction1(getRegisteredObject), queryInterface = js.Any.fromFunction1(queryInterface), registerObject = js.Any.fromFunction2((t0: String, t1: XInterface) => (registerObject(t0, t1)).runNow()), release = release.toJsFn, revokeObject = js.Any.fromFunction1((t0: String) => revokeObject(t0).runNow()))
      __obj.asInstanceOf[XNamingService]
    }
    
    extension [Self <: XNamingService](x: Self) {
      
      inline def setGetRegisteredObject(value: String => XInterface): Self = StObject.set(x, "getRegisteredObject", js.Any.fromFunction1(value))
      
      inline def setRegisterObject(value: (String, XInterface) => Callback): Self = StObject.set(x, "registerObject", js.Any.fromFunction2((t0: String, t1: XInterface) => (value(t0, t1)).runNow()))
      
      inline def setRevokeObject(value: String => Callback): Self = StObject.set(x, "revokeObject", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /**
    * must be implemented by anyone who holds the adapter on the client side.
    * @see XWeak for description af concepts.
    */
  trait XReference
    extends StObject
       with XInterface {
    
    /**
      * removes all references to the adapter.
      *
      * This method is called when the adapted object dies. The implementation of the client-side's weak reference must include removal of all references to
      * the adapter. Otherwise, the adapted object will be destroyed, but the adapter will be alive.
      */
    def dispose(): Unit
  }
  object XReference {
    
    inline def apply(acquire: Callback, dispose: Callback, queryInterface: `type` => Any, release: Callback): XReference = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dispose = dispose.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XReference]
    }
    
    extension [Self <: XReference](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  /**
    * Backwards-compatibility remainder of a removed library unloading feature.
    * @deprecated DeprecatedDo not use.
    */
  trait XUnloadingPreference
    extends StObject
       with XInterface {
    
    def releaseOnNotification(): Boolean
  }
  object XUnloadingPreference {
    
    inline def apply(
      acquire: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      releaseOnNotification: CallbackTo[Boolean]
    ): XUnloadingPreference = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, releaseOnNotification = releaseOnNotification.toJsFn)
      __obj.asInstanceOf[XUnloadingPreference]
    }
    
    extension [Self <: XUnloadingPreference](x: Self) {
      
      inline def setReleaseOnNotification(value: CallbackTo[Boolean]): Self = StObject.set(x, "releaseOnNotification", value.toJsFn)
    }
  }
  
  /**
    * the server-side interface to a weak object.
    *
    * This interface is proxy to the adapted object. In order to make it possible to have weak references to objects, the {@link XAdapter} interface must be
    * implemented to provide a weak adapter for the clients.
    *
    * **Concept of weak referencing:**
    *
    * This module specifies the interfaces for implementing and using weak references.
    *
    * The sense of weak references is to hold a reference to an object without affecting the lifetime of the object. That means that a weak reference may
    * become invalid, at any time, if the referenced object dies.
    *
    * The following interfaces describe one way to handle weak references by providing a weak adapter. The weak object has to provide this adapter if anyone
    * wants to hold a weak reference. To separate their lifetimes, the adapter and the original object must not share the same reference counter. The weak
    * reference is in fact only a hard reference to the adapter, which knows - but does not hold - the original object. That means that the implementation
    * and synchronization of weak referencing is the responsibility of the object. The following interfaces are involved in the concept of weak referencing:
    *
    * **XWeak**: is the server-side interface of the referred object. This referred object must support the {@link XAdapter} interface.;
    *
    * **XReference**: is a client-side interface which must be implemented by the holder of any weak reference. It is used for notification when the adapted
    * object dies.;
    */
  trait XWeak
    extends StObject
       with XInterface {
    
    /**
      * queries the weak adapter.
      *
      * It is important that the adapter must know, but not hold the adapted object. If the adapted object dies, all references to the adapter have to be
      * notified to release the adapter.
      */
    def queryAdapter(): XAdapter
  }
  object XWeak {
    
    inline def apply(
      acquire: Callback,
      queryAdapter: CallbackTo[XAdapter],
      queryInterface: `type` => Any,
      release: Callback
    ): XWeak = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryAdapter = queryAdapter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XWeak]
    }
    
    extension [Self <: XWeak](x: Self) {
      
      inline def setQueryAdapter(value: CallbackTo[XAdapter]): Self = StObject.set(x, "queryAdapter", value.toJsFn)
    }
  }
}
