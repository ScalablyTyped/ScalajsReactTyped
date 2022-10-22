package typingsJapgolly.coreJs

import typingsJapgolly.coreJs.anon.FnCall
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnReflectMod {
  
  @JSImport("core-js/fn/reflect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(target: Function, thisArgument: Any, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def construct(target: Function, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Define a unique metadata entry on the target.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param metadataValue A value that contains attached metadata.
    * @param target The target object on which to define metadata.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  Reflect.defineMetadata("custom:annotation", options, Example);
    *
    *  // decorator factory as metadata-producing annotation.
    *  function MyAnnotation(options): ClassDecorator {
    *      return target => Reflect.defineMetadata("custom:annotation", options, target);
    *  }
    * ```
    */
  inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object, targetKey: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: Object, targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineProperty(target: Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Deletes the metadata entry from the target object with the provided key.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata entry was found and deleted; otherwise, false.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.deleteMetadata("custom:annotation", Example);
    * ```
    */
  inline def deleteMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def deleteMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def deleteMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteProperty(target: Any, propertyKey: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def get(target: Any, propertyKey: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(target: Any, propertyKey: PropertyKey, receiver: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getMetadata("custom:annotation", Example);
    * ```
    */
  inline def getMetadata(metadataKey: Any, target: Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Gets the metadata keys defined on the target object or its prototype chain.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getMetadataKeys(Example);
    * ```
    */
  inline def getMetadataKeys(target: Object): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
  inline def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  inline def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  
  /**
    * Gets the metadata value for the provided metadata key on the target object.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getOwnMetadata("custom:annotation", Example);
    * ```
    */
  inline def getOwnMetadata(metadataKey: Any, target: Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getOwnMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getOwnMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Gets the unique metadata keys defined on the target object.
    * @param target The target object on which the metadata is defined.
    * @returns An array of unique metadata keys.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.getOwnMetadataKeys(Example);
    * ```
    */
  inline def getOwnMetadataKeys(target: Object): Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[Any]]
  inline def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  inline def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Array[Any]]
  
  inline def getOwnPropertyDescriptor(target: Any, propertyKey: PropertyKey): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
  
  inline def getPrototypeOf(target: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def has(target: Any, propertyKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def has(target: Any, propertyKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.hasMetadata("custom:annotation", Example);
    * ```
    */
  inline def hasMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets a value indicating whether the target object has the provided metadata key defined.
    * @param metadataKey A key used to store and retrieve metadata.
    * @param target The target object on which the metadata is defined.
    * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *
    *  class Example {
    *  }
    *
    *  // constructor
    *  result = Reflect.hasOwnMetadata("custom:annotation", Example);
    * ```
    */
  inline def hasOwnMetadata(metadataKey: Any, target: Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnMetadata(metadataKey: Any, target: Object, targetKey: java.lang.String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnMetadata(metadataKey: Any, target: Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isExtensible(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * A default metadata decorator factory that can be used on a class, class member, or parameter.
    * @param metadataKey The key for the metadata entry.
    * @param metadataValue The value for the metadata entry.
    * @returns A decorator function.
    * @remarks
    * If `metadataKey` is already defined for the target and target key, the
    * metadataValue for that key will be overwritten.
    * @example
    *
    * ### Example
    *
    * ```typescript
    *  // constructor
    *  @Reflect.metadata(key, value)
    *  class Example {
    *  }
    *
    *  // property (on constructor, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticProperty;
    *  }
    *
    *  // property (on prototype, TypeScript only)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      property;
    *  }
    *
    *  // method (on constructor)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      static staticMethod() { }
    *  }
    *
    *  // method (on prototype)
    *  class Example {
    *      @Reflect.metadata(key, value)
    *      method() { }
    *  }
    * ```
    */
  inline def metadata(metadataKey: Any, metadataValue: Any): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[FnCall]
  
  inline def ownKeys(target: Any): Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[Array[PropertyKey]]
  
  inline def preventExtensions(target: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def set(target: Any, propertyKey: PropertyKey, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def set(target: Any, propertyKey: PropertyKey, value: Any, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setPrototypeOf(target: Any, proto: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
