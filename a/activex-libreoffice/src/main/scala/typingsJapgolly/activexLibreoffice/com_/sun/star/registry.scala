package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registry {
  
  /**
    * is thrown when an application tries to register a new component (implementation) using the {@link
    * XImplementationRegistration.registerImplementation()} method, but the component cannot be registered. The reason for this exception could be: ; ; the
    * component cannot be found or cannot be loaded (missing path or classpath)the component doesn't provide the necessary specifactions (exported
    * registration functions for a C++ component (shared library) or a named registration class with the appropriate methods for a Java component (normally
    * a jar file)).;
    */
  type CannotRegisterImplementationException = Exception
  
  /**
    * implicitly supports a local registry and a read-only system registry for global information. In the context of this service, the functions `open` ,
    * `close` , and `destroy` from {@link XSimpleRegistry} are not supported and throw an exception if they are used.
    *
    * Functions of {@link XSimpleRegistry} : **getURL**: returns the name of the local registry.
    *
    * **isValid**: checks if the local registry is valid. If the interface is not `NULL` the local registry should always be valid.
    *
    * **isReadOnly**: checks if the local registry has write protection.
    *
    * **mergeKey**: merges all information from the specified registry in the local registry.
    *
    * **getRootKey**: returns a virtual rootkey of both registries.
    *
    *
    *
    * Functions of {@link XRegistryKey} : **openKey**: returns a virtual key which is specified in the local or the system registry.
    *
    * **deleteKey**: deletes the key only if it is present in the local registry.
    *
    * **setLongValue, setAsciiValue, setStringValue, setBinaryValue**: sets the value at the specified key in the local registry.
    *
    * **getLongValue, getAsciiValue, getStringValue, getBinaryValue**: returns the value at the specified key in the local registry, or if the value is not
    * present in the local registry, it will return the value of the system registry.
    *
    * **openKeys**: returns a sequence of all subkeys in both registries.
    *
    * **getKeyNames**: returns a sequence with the names of all subkeys in both registries.
    *
    * **Note: all write functions only work on the local registry.**:
    *
    *
    *
    * How to find the registries: **search for the system registry:  **: The system registry will always be searched in the same directory as the
    * executable. The name of the system registry is "applicat.rdb". If the system registry was not found, then the environment variable STAR_REGISTRY will
    * be checked. If this variable was set, it must contain a full path to a valid system registry.
    *
    * **Search for the user registry using the following rules:  **: {{ordered list here, see documentation}}
    *
    * **Guarantees:**
    *
    * -thread safe
    */
  type DefaultRegistry = XSimpleRegistry
  
  /**
    * is the implementation of the interface {@link XImplementationRegistration} . This service can be used to install or uninstall components
    * (implementations). Further, it is possible to check if all runtime dependencies (needed services) are available to use a specified component.
    *
    * Guarantees: -thread safe
    */
  type ImplementationRegistration = XImplementationRegistration
  
  /** signals that the registry is invalid or an operation on the registry failed. */
  type InvalidRegistryException = Exception
  
  /** signals that the value of the key is invalid or does not have the appropriate key type. */
  type InvalidValueException = Exception
  
  /** is thrown if entries of two registries are contradictory in the context of {@link XSimpleRegistry.mergeKey()} e() method. */
  type MergeConflictException = Exception
  
  /**
    * supports a shared view on two different registries. The registry files will be opened in two different modes, registry1 will be opened with read/write
    * rights and registry2 will be opened read-only. In the context of this service, the functions `open` , `close` , and `destroy` from {@link
    * XSimpleRegistry} are not supported and throw an exception if they are used.
    *
    * Functions of {@link XSimpleRegistry} : **getURL**: returns the name of registry1.;
    *
    * **isValid**: checks if registry1 is valid. If the interface is not `NULL` then registry1 should always be valid.;
    *
    * **isReadOnly**: checks if registry1 has write protection.
    *
    * **mergeKey**: merges all information from the specified registry in registry1.;
    *
    * **getRootKey**: returns a virtual rootkey of both registries.
    *
    *
    *
    * Functions of {@link XRegistryKey} : **openKey**: returns a virtual key which is specified in registy1 or registry2.;
    *
    * **deleteKey**: deletes the key only if it is present in registry1.;
    *
    * **setLongValue, setAsciiValue, setStringValue, setBinaryValue**: sets the value at the specified key in registry1.;
    *
    * **getLongValue, getAsciiValue, getStringValue, getBinaryValue**: returns the value at the specified key in registry1, or if the value is not present
    * in registry1, it will return the value of registry2.;
    *
    * **openKeys**: returns a sequence of all subkeys in both registries.;
    *
    * **getKeyNames**: returns a sequence with the names of all subkeys in both registries.;
    *
    * **Note: all write functions only work on registry1.**:
    *
    *
    *
    * How to initialize the registries: ;  Use a sequence of {@link XSimpleRegistry} with two elements. The first element must be the registry which is
    * opened with read/write rights and the second element must be the read-only one. ;  Two different ways are possible: ; use {@link
    * com.sun.star.lang.XMultiServiceFactory.createInstanceWithArguments()} to create an instance of this service where the value of the any parameter must
    * be the sequence with the two open registries.use the initialize function of the {@link com.sun.star.lang.XInitialization} interface where the value of
    * the any parameter must be the sequence with the two open registries.;
    *
    * Guarantees: -thread safe
    */
  trait NestedRegistry
    extends StObject
       with XSimpleRegistry
       with XInitialization
  object NestedRegistry {
    
    inline def apply(
      RootKey: XRegistryKey,
      URL: String,
      acquire: Callback,
      close: Callback,
      destroy: Callback,
      getRootKey: CallbackTo[XRegistryKey],
      getURL: CallbackTo[String],
      initialize: SeqEquiv[Any] => Callback,
      isReadOnly: CallbackTo[Boolean],
      isValid: CallbackTo[Boolean],
      mergeKey: (String, String) => Callback,
      open: (String, Boolean, Boolean) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): NestedRegistry = {
      val __obj = js.Dynamic.literal(RootKey = RootKey.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, close = close.toJsFn, destroy = destroy.toJsFn, getRootKey = getRootKey.toJsFn, getURL = getURL.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isReadOnly = isReadOnly.toJsFn, isValid = isValid.toJsFn, mergeKey = js.Any.fromFunction2((t0: String, t1: String) => (mergeKey(t0, t1)).runNow()), open = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (open(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[NestedRegistry]
    }
  }
  
  /**
    * represents all possible types of a key.
    *
    * A key can be a normal key with a value and subkeys, or it can be a link which references another key.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  */
  trait RegistryKeyType extends StObject
  object RegistryKeyType {
    
    inline def KEY: `0` = 0.asInstanceOf[`0`]
    
    inline def LINK: `1` = 1.asInstanceOf[`1`]
  }
  
  /**
    * represents all possible types of a key value.
    *
    * An ASCII value and a string value will both be handled with type string. But interns will be handled differently. Normally the idl string represents a
    * unicode string.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  */
  trait RegistryValueType extends StObject
  object RegistryValueType {
    
    /** the type of the key is ASCII. */
    inline def ASCII: `2` = 2.asInstanceOf[`2`]
    
    /** the type of the key is a ASCIILIST. */
    inline def ASCIILIST: `6` = 6.asInstanceOf[`6`]
    
    /** the type of the key is binary. */
    inline def BINARY: `4` = 4.asInstanceOf[`4`]
    
    /** the type of the key is long. */
    inline def LONG: `1` = 1.asInstanceOf[`1`]
    
    /** the type of the key is LONGLIST. */
    inline def LONGLIST: `5` = 5.asInstanceOf[`5`]
    
    /** the type of the key is not defined. */
    inline def NOT_DEFINED: `0` = 0.asInstanceOf[`0`]
    
    /** the type of the key is a string. */
    inline def STRING: `3` = 3.asInstanceOf[`3`]
    
    /** the type of the key is a STRINGLIST. */
    inline def STRINGLIST: `7` = 7.asInstanceOf[`7`]
  }
  
  /**
    * makes it possible to create, open, or close a registry. Further, it is possible to merge a registry under a specified key in the open registry.
    *
    * Guarantees: -thread safe
    */
  type SimpleRegistry = XSimpleRegistry
  
  /** offers a registry for implementation objects and provides information about the registered implementations. */
  trait XImplementationRegistration
    extends StObject
       with XInterface {
    
    /**
      * @param implementationName specifies the name of the checked implementation.
      * @returns a sequence with names of the missing services to create an instance of this implementation.
      */
    def checkInstantiation(implementationName: String): SafeArray[String]
    
    /**
      * @param aImplementationLoader specifies the name of the needed loader for this type of implementation. For example, the loader "com.sun.star.loader.Share
      * @param aLocation specifies the location of the component with the URL.
      * @returns the names of the implementations registered by the url location.
      */
    def getImplementations(aImplementationLoader: String, aLocation: String): SafeArray[String]
    
    /**
      * registers a component which provides one or more implementations.
      * @param aImplementationLoader the URL of the implementation loader.
      * @param aLocation specifies the location of the component with the URL.
      * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be installed in the syste
      */
    def registerImplementation(aImplementationLoader: String, aLocation: String, xReg: XSimpleRegistry): Unit
    
    /**
      * revokes a component and all their provided implementations from the registry.
      * @param aLocation specifies the location of the component with the URL.
      * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be revoked from the syste
      */
    def revokeImplementation(aLocation: String, xReg: XSimpleRegistry): Boolean
  }
  object XImplementationRegistration {
    
    inline def apply(
      acquire: Callback,
      checkInstantiation: String => SafeArray[String],
      getImplementations: (String, String) => SafeArray[String],
      queryInterface: `type` => Any,
      registerImplementation: (String, String, XSimpleRegistry) => Callback,
      release: Callback,
      revokeImplementation: (String, XSimpleRegistry) => Boolean
    ): XImplementationRegistration = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, checkInstantiation = js.Any.fromFunction1(checkInstantiation), getImplementations = js.Any.fromFunction2(getImplementations), queryInterface = js.Any.fromFunction1(queryInterface), registerImplementation = js.Any.fromFunction3((t0: String, t1: String, t2: XSimpleRegistry) => (registerImplementation(t0, t1, t2)).runNow()), release = release.toJsFn, revokeImplementation = js.Any.fromFunction2(revokeImplementation))
      __obj.asInstanceOf[XImplementationRegistration]
    }
    
    extension [Self <: XImplementationRegistration](x: Self) {
      
      inline def setCheckInstantiation(value: String => SafeArray[String]): Self = StObject.set(x, "checkInstantiation", js.Any.fromFunction1(value))
      
      inline def setGetImplementations(value: (String, String) => SafeArray[String]): Self = StObject.set(x, "getImplementations", js.Any.fromFunction2(value))
      
      inline def setRegisterImplementation(value: (String, String, XSimpleRegistry) => Callback): Self = StObject.set(x, "registerImplementation", js.Any.fromFunction3((t0: String, t1: String, t2: XSimpleRegistry) => (value(t0, t1, t2)).runNow()))
      
      inline def setRevokeImplementation(value: (String, XSimpleRegistry) => Boolean): Self = StObject.set(x, "revokeImplementation", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * extends the functionality of {@link com.sun.star.registry.XImplementationRegistration} . It can be useful to specify a complete Url to a component but
    * register the components name only (library or jar name).
    * @since OOo 2.4
    */
  trait XImplementationRegistration2
    extends StObject
       with XImplementationRegistration {
    
    /**
      * registers a component which provides one or more implementations.
      * @param aImplementationLoader the URL of the implementation loader.
      * @param aLocation specifies the location of the component with the URL.
      * @param aRegisteredLocation the URL with which the component is actually registered.
      * @param xReg specifies the registry where the component should be installed. If it is a NULL interface, then the component will be installed in the syste
      */
    def registerImplementationWithLocation(
      aImplementationLoader: String,
      aLocation: String,
      aRegisteredLocation: String,
      xReg: XSimpleRegistry
    ): Unit
  }
  object XImplementationRegistration2 {
    
    inline def apply(
      acquire: Callback,
      checkInstantiation: String => SafeArray[String],
      getImplementations: (String, String) => SafeArray[String],
      queryInterface: `type` => Any,
      registerImplementation: (String, String, XSimpleRegistry) => Callback,
      registerImplementationWithLocation: (String, String, String, XSimpleRegistry) => Callback,
      release: Callback,
      revokeImplementation: (String, XSimpleRegistry) => Boolean
    ): XImplementationRegistration2 = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, checkInstantiation = js.Any.fromFunction1(checkInstantiation), getImplementations = js.Any.fromFunction2(getImplementations), queryInterface = js.Any.fromFunction1(queryInterface), registerImplementation = js.Any.fromFunction3((t0: String, t1: String, t2: XSimpleRegistry) => (registerImplementation(t0, t1, t2)).runNow()), registerImplementationWithLocation = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XSimpleRegistry) => (registerImplementationWithLocation(t0, t1, t2, t3)).runNow()), release = release.toJsFn, revokeImplementation = js.Any.fromFunction2(revokeImplementation))
      __obj.asInstanceOf[XImplementationRegistration2]
    }
    
    extension [Self <: XImplementationRegistration2](x: Self) {
      
      inline def setRegisterImplementationWithLocation(value: (String, String, String, XSimpleRegistry) => Callback): Self = StObject.set(x, "registerImplementationWithLocation", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: XSimpleRegistry) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  /**
    * makes structural information (except regarding tree structures) of a single registry key accessible.
    *
    * This is the main interface for registry keys.
    * @see XSimpleRegistry
    */
  trait XRegistryKey
    extends StObject
       with XInterface {
    
    /**
      * @returns a sequence of ascii strings if the key contains an ascii list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type ascii list.
      */
    var AsciiListValue: SafeArray[String]
    
    /**
      * @returns an ascii string value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type ascii.
      */
    var AsciiValue: String
    
    /**
      * @returns a binary value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type binary.
      */
    var BinaryValue: SafeArray[Double]
    
    /**
      * This is the key of the entry relative to its parent.
      *
      * The access path starts with the root "/" and all parent entry names are delimited with slashes "/" too, like in a UNIX (R) file system. Slashes which
      * are part of single names are represented as hexadecimals preceded with a "%" like in URL syntax.
      */
    var KeyName: String
    
    /**
      * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
      * @throws InvalidRegistryException if the registry is not open.
      */
    val KeyNames: SafeArray[String]
    
    /**
      * @returns a sequence of longs if the key contains a long list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type long list.
      */
    var LongListValue: SafeArray[Double]
    
    /**
      * @returns a long value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the value is not of type long.
      */
    var LongValue: Double
    
    /**
      * @returns a sequence of unicode strings if the key contains an unicode string list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type string list.
      */
    var StringListValue: SafeArray[String]
    
    /**
      * @returns a unicode string value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type string.
      */
    var StringValue: String
    
    /**
      * @returns the type of the key value or NOT_DEFINED if the key has no value.
      * @throws InvalidRegistryException if the registry is not open.
      */
    val ValueType: RegistryValueType
    
    /**
      * closes a key in the registry.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def closeKey(): Unit
    
    /**
      * creates a new key in the registry.
      *
      * If the key already exists, the function will open the key.
      * @param aKeyName specifies the relative path from the current key to the key which will be created.
      * @returns a NULL interface if the key could not be created.
      * @throws InvalidRegistryException if the registry is not open, the registry is readonly or if the key exists and is of type LINK.
      */
    def createKey(aKeyName: String): XRegistryKey
    
    /**
      * creates a new link in the registry.
      * @param aLinkName specifies the relative path from the current key to the link which will be created.
      * @param aLinkTarget specifies the full path of the key which will be referenced by the link.
      * @returns `TRUE` if the link was created. If the link already exists or the link target does not exist, the function returns `FALSE` .
      * @throws InvalidRegistryException if the registry is not open or the registry is readonly.
      */
    def createLink(aLinkName: String, aLinkTarget: String): Boolean
    
    /**
      * deletes a key from the registry.
      * @param rKeyName specifies the relative path from the current key to the key which will be deleted.
      * @throws InvalidRegistryException if the registry is not open, the registry is readonly, the key does not exists or if the key is of type LINK.
      */
    def deleteKey(rKeyName: String): Unit
    
    /**
      * deletes a link from the registry.
      * @param rLinkName specifies the relative path from the current key to the link which will be deleted.
      * @throws InvalidRegistryException if the registry is not open, the registry is readonly, or if the link does not exist.
      */
    def deleteLink(rLinkName: String): Unit
    
    /**
      * @returns a sequence of ascii strings if the key contains an ascii list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type ascii list.
      */
    def getAsciiListValue(): SafeArray[String]
    
    /**
      * @returns an ascii string value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type ascii.
      */
    def getAsciiValue(): String
    
    /**
      * @returns a binary value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type binary.
      */
    def getBinaryValue(): SafeArray[Double]
    
    /**
      * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
      * @throws InvalidRegistryException if the registry is not open.
      */
    def getKeyNames(): SafeArray[String]
    
    /**
      * @param rKeyName specifies the relative path from the current key to the key of the type which will be returned.
      * @returns the type of the specified key.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def getKeyType(rKeyName: String): RegistryKeyType
    
    /**
      * @param rLinkName specifies the relative path from the current key to the link which target will be returned.
      * @returns the target (complete path of a key) of the link specified by rLinkName.
      * @throws InvalidRegistryException if the registry is not open or the link does not exists.
      */
    def getLinkTarget(rLinkName: String): String
    
    /**
      * @returns a sequence of longs if the key contains a long list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type long list.
      */
    def getLongListValue(): SafeArray[Double]
    
    /**
      * @returns a long value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the value is not of type long.
      */
    def getLongValue(): Double
    
    /**
      * @param aKeyName specifies a relative path from the current key which will be resolved from all links.
      * @returns the resolved name of a key. The function resolve the complete name of the key. If a link could not be resolved, the linktarget concatenated with
      * @throws InvalidRegistryException if the registry is not open or a recursion was detected.
      */
    def getResolvedName(aKeyName: String): String
    
    /**
      * @returns a sequence of unicode strings if the key contains an unicode string list value.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type string list.
      */
    def getStringListValue(): SafeArray[String]
    
    /**
      * @returns a unicode string value if the key contains one.
      * @throws InvalidRegistryException if the registry is not open.
      * @throws InvalidValueException if the actual value is not of type string.
      */
    def getStringValue(): String
    
    /**
      * @returns the type of the key value or NOT_DEFINED if the key has no value.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def getValueType(): RegistryValueType
    
    /**
      * checks if the key can be overwritten.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def isReadOnly(): Boolean
    
    /** checks if the key points to an open valid key in the data-source. */
    def isValid(): Boolean
    
    /**
      * opens a sub key of the key.
      *
      * If the sub key does not exist, the function returns a NULL-interface.
      * @param aKeyName the relative path from the current key to the key which will be created.
      * @returns a NULL interface if the key does not exist.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def openKey(aKeyName: String): XRegistryKey
    
    /**
      * opens all subkeys of the key. If a subkey is a link, the link will be resolved and the appropriate key will be opened.
      * @returns an empty sequence if the key has no subkeys.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def openKeys(): SafeArray[XRegistryKey]
    
    /**
      * sets an ASCII string list value to the key.
      *
      * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
      * value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setAsciiListValue(seqValue: SeqEquiv[String]): Unit
    
    /**
      * sets an ASCII string value to the key.
      *
      * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
      * value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setAsciiValue(value: String): Unit
    
    /**
      * sets a binary value to the key.
      *
      * If the key already has a value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setBinaryValue(value: SeqEquiv[Double]): Unit
    
    /**
      * sets a long list value to the key.
      *
      * If the key already has a value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setLongListValue(seqValue: SeqEquiv[Double]): Unit
    
    /**
      * sets a long value to the key.
      *
      * If the key already has a value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setLongValue(value: Double): Unit
    
    /**
      * sets a unicode string value to the key.
      *
      * If the key already has a value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setStringListValue(seqValue: SeqEquiv[String]): Unit
    
    /**
      * sets a unicode string value to the key.
      *
      * If the key already has a value, the value will be overridden.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def setStringValue(value: String): Unit
  }
  object XRegistryKey {
    
    inline def apply(
      AsciiListValue: SafeArray[String],
      AsciiValue: String,
      BinaryValue: SafeArray[Double],
      KeyName: String,
      KeyNames: SafeArray[String],
      LongListValue: SafeArray[Double],
      LongValue: Double,
      StringListValue: SafeArray[String],
      StringValue: String,
      ValueType: RegistryValueType,
      acquire: Callback,
      closeKey: Callback,
      createKey: String => XRegistryKey,
      createLink: (String, String) => Boolean,
      deleteKey: String => Callback,
      deleteLink: String => Callback,
      getAsciiListValue: CallbackTo[SafeArray[String]],
      getAsciiValue: CallbackTo[String],
      getBinaryValue: CallbackTo[SafeArray[Double]],
      getKeyNames: CallbackTo[SafeArray[String]],
      getKeyType: String => RegistryKeyType,
      getLinkTarget: String => String,
      getLongListValue: CallbackTo[SafeArray[Double]],
      getLongValue: CallbackTo[Double],
      getResolvedName: String => String,
      getStringListValue: CallbackTo[SafeArray[String]],
      getStringValue: CallbackTo[String],
      getValueType: CallbackTo[RegistryValueType],
      isReadOnly: CallbackTo[Boolean],
      isValid: CallbackTo[Boolean],
      openKey: String => XRegistryKey,
      openKeys: CallbackTo[SafeArray[XRegistryKey]],
      queryInterface: `type` => Any,
      release: Callback,
      setAsciiListValue: SeqEquiv[String] => Callback,
      setAsciiValue: String => Callback,
      setBinaryValue: SeqEquiv[Double] => Callback,
      setLongListValue: SeqEquiv[Double] => Callback,
      setLongValue: Double => Callback,
      setStringListValue: SeqEquiv[String] => Callback,
      setStringValue: String => Callback
    ): XRegistryKey = {
      val __obj = js.Dynamic.literal(AsciiListValue = AsciiListValue.asInstanceOf[js.Any], AsciiValue = AsciiValue.asInstanceOf[js.Any], BinaryValue = BinaryValue.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], KeyNames = KeyNames.asInstanceOf[js.Any], LongListValue = LongListValue.asInstanceOf[js.Any], LongValue = LongValue.asInstanceOf[js.Any], StringListValue = StringListValue.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], acquire = acquire.toJsFn, closeKey = closeKey.toJsFn, createKey = js.Any.fromFunction1(createKey), createLink = js.Any.fromFunction2(createLink), deleteKey = js.Any.fromFunction1((t0: String) => deleteKey(t0).runNow()), deleteLink = js.Any.fromFunction1((t0: String) => deleteLink(t0).runNow()), getAsciiListValue = getAsciiListValue.toJsFn, getAsciiValue = getAsciiValue.toJsFn, getBinaryValue = getBinaryValue.toJsFn, getKeyNames = getKeyNames.toJsFn, getKeyType = js.Any.fromFunction1(getKeyType), getLinkTarget = js.Any.fromFunction1(getLinkTarget), getLongListValue = getLongListValue.toJsFn, getLongValue = getLongValue.toJsFn, getResolvedName = js.Any.fromFunction1(getResolvedName), getStringListValue = getStringListValue.toJsFn, getStringValue = getStringValue.toJsFn, getValueType = getValueType.toJsFn, isReadOnly = isReadOnly.toJsFn, isValid = isValid.toJsFn, openKey = js.Any.fromFunction1(openKey), openKeys = openKeys.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setAsciiListValue = js.Any.fromFunction1((t0: SeqEquiv[String]) => setAsciiListValue(t0).runNow()), setAsciiValue = js.Any.fromFunction1((t0: String) => setAsciiValue(t0).runNow()), setBinaryValue = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setBinaryValue(t0).runNow()), setLongListValue = js.Any.fromFunction1((t0: SeqEquiv[Double]) => setLongListValue(t0).runNow()), setLongValue = js.Any.fromFunction1((t0: Double) => setLongValue(t0).runNow()), setStringListValue = js.Any.fromFunction1((t0: SeqEquiv[String]) => setStringListValue(t0).runNow()), setStringValue = js.Any.fromFunction1((t0: String) => setStringValue(t0).runNow()))
      __obj.asInstanceOf[XRegistryKey]
    }
    
    extension [Self <: XRegistryKey](x: Self) {
      
      inline def setAsciiListValue(value: SafeArray[String]): Self = StObject.set(x, "AsciiListValue", value.asInstanceOf[js.Any])
      
      inline def setAsciiValue(value: String): Self = StObject.set(x, "AsciiValue", value.asInstanceOf[js.Any])
      
      inline def setBinaryValue(value: SafeArray[Double]): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
      
      inline def setCloseKey(value: Callback): Self = StObject.set(x, "closeKey", value.toJsFn)
      
      inline def setCreateKey(value: String => XRegistryKey): Self = StObject.set(x, "createKey", js.Any.fromFunction1(value))
      
      inline def setCreateLink(value: (String, String) => Boolean): Self = StObject.set(x, "createLink", js.Any.fromFunction2(value))
      
      inline def setDeleteKey(value: String => Callback): Self = StObject.set(x, "deleteKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDeleteLink(value: String => Callback): Self = StObject.set(x, "deleteLink", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetAsciiListValue(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAsciiListValue", value.toJsFn)
      
      inline def setGetAsciiValue(value: CallbackTo[String]): Self = StObject.set(x, "getAsciiValue", value.toJsFn)
      
      inline def setGetBinaryValue(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getBinaryValue", value.toJsFn)
      
      inline def setGetKeyNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getKeyNames", value.toJsFn)
      
      inline def setGetKeyType(value: String => RegistryKeyType): Self = StObject.set(x, "getKeyType", js.Any.fromFunction1(value))
      
      inline def setGetLinkTarget(value: String => String): Self = StObject.set(x, "getLinkTarget", js.Any.fromFunction1(value))
      
      inline def setGetLongListValue(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getLongListValue", value.toJsFn)
      
      inline def setGetLongValue(value: CallbackTo[Double]): Self = StObject.set(x, "getLongValue", value.toJsFn)
      
      inline def setGetResolvedName(value: String => String): Self = StObject.set(x, "getResolvedName", js.Any.fromFunction1(value))
      
      inline def setGetStringListValue(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getStringListValue", value.toJsFn)
      
      inline def setGetStringValue(value: CallbackTo[String]): Self = StObject.set(x, "getStringValue", value.toJsFn)
      
      inline def setGetValueType(value: CallbackTo[RegistryValueType]): Self = StObject.set(x, "getValueType", value.toJsFn)
      
      inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
      
      inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
      
      inline def setKeyNames(value: SafeArray[String]): Self = StObject.set(x, "KeyNames", value.asInstanceOf[js.Any])
      
      inline def setLongListValue(value: SafeArray[Double]): Self = StObject.set(x, "LongListValue", value.asInstanceOf[js.Any])
      
      inline def setLongValue(value: Double): Self = StObject.set(x, "LongValue", value.asInstanceOf[js.Any])
      
      inline def setOpenKey(value: String => XRegistryKey): Self = StObject.set(x, "openKey", js.Any.fromFunction1(value))
      
      inline def setOpenKeys(value: CallbackTo[SafeArray[XRegistryKey]]): Self = StObject.set(x, "openKeys", value.toJsFn)
      
      inline def setSetAsciiListValue(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setAsciiListValue", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
      
      inline def setSetAsciiValue(value: String => Callback): Self = StObject.set(x, "setAsciiValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetBinaryValue(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setBinaryValue", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
      
      inline def setSetLongListValue(value: SeqEquiv[Double] => Callback): Self = StObject.set(x, "setLongListValue", js.Any.fromFunction1((t0: SeqEquiv[Double]) => value(t0).runNow()))
      
      inline def setSetLongValue(value: Double => Callback): Self = StObject.set(x, "setLongValue", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetStringListValue(value: SeqEquiv[String] => Callback): Self = StObject.set(x, "setStringListValue", js.Any.fromFunction1((t0: SeqEquiv[String]) => value(t0).runNow()))
      
      inline def setSetStringValue(value: String => Callback): Self = StObject.set(x, "setStringValue", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStringListValue(value: SafeArray[String]): Self = StObject.set(x, "StringListValue", value.asInstanceOf[js.Any])
      
      inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
      
      inline def setValueType(value: RegistryValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * allows access to a registry (a persistent data source). The data is stored in a hierarchical key structure beginning with a root key. Each key can
    * store a value and can have multiple subkeys.
    * @see XRegistryKey
    */
  trait XSimpleRegistry
    extends StObject
       with XInterface {
    
    /**
      * @returns the root key of the registry.
      * @throws InvalidRegistryException if no registry is open
      */
    val RootKey: XRegistryKey
    
    /** returns the URL of the current data source of the registry. */
    val URL: String
    
    /**
      * disconnects the registry from the data-source.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def close(): Unit
    
    /**
      * destroys the registry and the data source.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def destroy(): Unit
    
    /**
      * @returns the root key of the registry.
      * @throws InvalidRegistryException if no registry is open
      */
    def getRootKey(): XRegistryKey
    
    /** returns the URL of the current data source of the registry. */
    def getURL(): String
    
    /**
      * checks if the registry is readonly.
      * @throws InvalidRegistryException if the registry is not open.
      */
    def isReadOnly(): Boolean
    
    /** checks if the registry points to a valid data-source. */
    def isValid(): Boolean
    
    /**
      * DEPRECATED: this method lacks a registry key (better than a URL).
      *
      * merges a registry under the specified key.
      *
      * If the key does not exist it will be created. Existing keys will be overridden from keys of registry specified by **aUrl** .
      * @throws InvalidRegistryException if the registry is not open.
      * @throws MergeConflictException if any differences occur during merging
      */
    def mergeKey(aKeyName: String, aUrl: String): Unit
    
    /**
      * connects the registry to a persistent data source represented by an URL.
      *
      * If a local registry is already open, this function will close the currently open registry.
      * @param rURL specifies the complete URL to access the data source.
      * @param bReadOnly specifies if the data source should be opened for read only.
      * @param bCreate specifies if the data source should be created if it does not already exist.
      * @throws InvalidRegistryException if the registry does not exist.
      */
    def open(rURL: String, bReadOnly: Boolean, bCreate: Boolean): Unit
  }
  object XSimpleRegistry {
    
    inline def apply(
      RootKey: XRegistryKey,
      URL: String,
      acquire: Callback,
      close: Callback,
      destroy: Callback,
      getRootKey: CallbackTo[XRegistryKey],
      getURL: CallbackTo[String],
      isReadOnly: CallbackTo[Boolean],
      isValid: CallbackTo[Boolean],
      mergeKey: (String, String) => Callback,
      open: (String, Boolean, Boolean) => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XSimpleRegistry = {
      val __obj = js.Dynamic.literal(RootKey = RootKey.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, close = close.toJsFn, destroy = destroy.toJsFn, getRootKey = getRootKey.toJsFn, getURL = getURL.toJsFn, isReadOnly = isReadOnly.toJsFn, isValid = isValid.toJsFn, mergeKey = js.Any.fromFunction2((t0: String, t1: String) => (mergeKey(t0, t1)).runNow()), open = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (open(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XSimpleRegistry]
    }
    
    extension [Self <: XSimpleRegistry](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetRootKey(value: CallbackTo[XRegistryKey]): Self = StObject.set(x, "getRootKey", value.toJsFn)
      
      inline def setGetURL(value: CallbackTo[String]): Self = StObject.set(x, "getURL", value.toJsFn)
      
      inline def setIsReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReadOnly", value.toJsFn)
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
      
      inline def setMergeKey(value: (String, String) => Callback): Self = StObject.set(x, "mergeKey", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOpen(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setRootKey(value: XRegistryKey): Self = StObject.set(x, "RootKey", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
}
