package typingsJapgolly.reflectMetadata

import typingsJapgolly.reflectMetadata.anon.FnCall
import typingsJapgolly.std.ClassDecorator
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Reflect {
    
    @JSGlobal("Reflect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Applies a set of decorators to a target object.
      * @param decorators An array of decorators.
      * @param target The target object.
      * @returns The result of applying the provided decorators.
      * @remarks Decorators are applied in reverse order of their positions in the array.
      * @example
      *
      *     class Example { }
      *
      *     // constructor
      *     Example = Reflect.decorate(decoratorsArray, Example);
      *
      */
    inline def decorate(decorators: js.Array[ClassDecorator], target: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    /**
      * Applies a set of decorators to a property of a target object.
      * @param decorators An array of decorators.
      * @param target The target object.
      * @param targetKey The property key to decorate.
      * @param descriptor A property descriptor
      * @remarks Decorators are applied in reverse order.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod() { }
      *         method() { }
      *     }
      *
      *     // property (on constructor)
      *     Reflect.decorate(decoratorsArray, Example, "staticProperty");
      *
      *     // property (on prototype)
      *     Reflect.decorate(decoratorsArray, Example.prototype, "property");
      *
      *     // method (on constructor)
      *     Object.defineProperty(Example, "staticMethod",
      *         Reflect.decorate(decoratorsArray, Example, "staticMethod",
      *             Object.getOwnPropertyDescriptor(Example, "staticMethod")));
      *
      *     // method (on prototype)
      *     Object.defineProperty(Example.prototype, "method",
      *         Reflect.decorate(decoratorsArray, Example.prototype, "method",
      *             Object.getOwnPropertyDescriptor(Example.prototype, "method")));
      *
      */
    inline def decorate(decorators: js.Array[PropertyDecorator | MethodDecorator], target: js.Object, targetKey: String): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    inline def decorate(
      decorators: js.Array[PropertyDecorator | MethodDecorator],
      target: js.Object,
      targetKey: String,
      descriptor: js.PropertyDescriptor
    ): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    inline def decorate(decorators: js.Array[PropertyDecorator | MethodDecorator], target: js.Object, targetKey: js.Symbol): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    inline def decorate(
      decorators: js.Array[PropertyDecorator | MethodDecorator],
      target: js.Object,
      targetKey: js.Symbol,
      descriptor: js.PropertyDescriptor
    ): js.PropertyDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.PropertyDescriptor]
    
    /**
      * Define a unique metadata entry on the target.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param metadataValue A value that contains attached metadata.
      * @param target The target object on which to define metadata.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     Reflect.defineMetadata("custom:annotation", options, Example);
      *
      *     // decorator factory as metadata-producing annotation.
      *     function MyAnnotation(options): ClassDecorator {
      *         return target => Reflect.defineMetadata("custom:annotation", options, target);
      *     }
      *
      */
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Define a unique metadata entry on the target.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param metadataValue A value that contains attached metadata.
      * @param target The target object on which to define metadata.
      * @param targetKey The property key for the target.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     Reflect.defineMetadata("custom:annotation", Number, Example, "staticProperty");
      *
      *     // property (on prototype)
      *     Reflect.defineMetadata("custom:annotation", Number, Example.prototype, "property");
      *
      *     // method (on constructor)
      *     Reflect.defineMetadata("custom:annotation", Number, Example, "staticMethod");
      *
      *     // method (on prototype)
      *     Reflect.defineMetadata("custom:annotation", Number, Example.prototype, "method");
      *
      *     // decorator factory as metadata-producing annotation.
      *     function MyAnnotation(options): PropertyDecorator {
      *         return (target, key) => Reflect.defineMetadata("custom:annotation", options, target, key);
      *     }
      *
      */
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: js.Object, targetKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineMetadata(metadataKey: Any, metadataValue: Any, target: js.Object, targetKey: js.Symbol): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMetadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Deletes the metadata entry from the target object with the provided key.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata entry was found and deleted; otherwise, false.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.deleteMetadata("custom:annotation", Example);
      *
      */
    inline def deleteMetadata(metadataKey: Any, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Deletes the metadata entry from the target object with the provided key.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns `true` if the metadata entry was found and deleted; otherwise, false.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.deleteMetadata("custom:annotation", Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.deleteMetadata("custom:annotation", Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.deleteMetadata("custom:annotation", Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.deleteMetadata("custom:annotation", Example.prototype, "method");
      *
      */
    inline def deleteMetadata(metadataKey: Any, target: js.Object, targetKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def deleteMetadata(metadataKey: Any, target: js.Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.getMetadata("custom:annotation", Example);
      *
      */
    inline def getMetadata(metadataKey: Any, target: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    /**
      * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.getMetadata("custom:annotation", Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.getMetadata("custom:annotation", Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.getMetadata("custom:annotation", Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.getMetadata("custom:annotation", Example.prototype, "method");
      *
      */
    inline def getMetadata(metadataKey: Any, target: js.Object, targetKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getMetadata(metadataKey: Any, target: js.Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Gets the metadata keys defined on the target object or its prototype chain.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.getMetadataKeys(Example);
      *
      */
    inline def getMetadataKeys(target: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    /**
      * Gets the metadata keys defined on the target object or its prototype chain.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns An array of unique metadata keys.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.getMetadataKeys(Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.getMetadataKeys(Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.getMetadataKeys(Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.getMetadataKeys(Example.prototype, "method");
      *
      */
    inline def getMetadataKeys(target: js.Object, targetKey: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getMetadataKeys(target: js.Object, targetKey: js.Symbol): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Gets the metadata value for the provided metadata key on the target object.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.getOwnMetadata("custom:annotation", Example);
      *
      */
    inline def getOwnMetadata(metadataKey: Any, target: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
    /**
      * Gets the metadata value for the provided metadata key on the target object.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.getOwnMetadata("custom:annotation", Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.getOwnMetadata("custom:annotation", Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.getOwnMetadata("custom:annotation", Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.getOwnMetadata("custom:annotation", Example.prototype, "method");
      *
      */
    inline def getOwnMetadata(metadataKey: Any, target: js.Object, targetKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def getOwnMetadata(metadataKey: Any, target: js.Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Gets the unique metadata keys defined on the target object.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.getOwnMetadataKeys(Example);
      *
      */
    inline def getOwnMetadataKeys(target: js.Object): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    /**
      * Gets the unique metadata keys defined on the target object.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns An array of unique metadata keys.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.getOwnMetadataKeys(Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.getOwnMetadataKeys(Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.getOwnMetadataKeys(Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.getOwnMetadataKeys(Example.prototype, "method");
      *
      */
    inline def getOwnMetadataKeys(target: js.Object, targetKey: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def getOwnMetadataKeys(target: js.Object, targetKey: js.Symbol): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnMetadataKeys")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    /**
      * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.hasMetadata("custom:annotation", Example);
      *
      */
    inline def hasMetadata(metadataKey: Any, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.hasMetadata("custom:annotation", Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.hasMetadata("custom:annotation", Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.hasMetadata("custom:annotation", Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.hasMetadata("custom:annotation", Example.prototype, "method");
      *
      */
    inline def hasMetadata(metadataKey: Any, target: js.Object, targetKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasMetadata(metadataKey: Any, target: js.Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Gets a value indicating whether the target object has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
      * @example
      *
      *     class Example {
      *     }
      *
      *     // constructor
      *     result = Reflect.hasOwnMetadata("custom:annotation", Example);
      *
      */
    inline def hasOwnMetadata(metadataKey: Any, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    /**
      * Gets a value indicating whether the target object has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @param targetKey The property key for the target.
      * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
      * @example
      *
      *     class Example {
      *         // property declarations are not part of ES6, though they are valid in TypeScript:
      *         // static staticProperty;
      *         // property;
      *
      *         static staticMethod(p) { }
      *         method(p) { }
      *     }
      *
      *     // property (on constructor)
      *     result = Reflect.hasOwnMetadata("custom:annotation", Example, "staticProperty");
      *
      *     // property (on prototype)
      *     result = Reflect.hasOwnMetadata("custom:annotation", Example.prototype, "property");
      *
      *     // method (on constructor)
      *     result = Reflect.hasOwnMetadata("custom:annotation", Example, "staticMethod");
      *
      *     // method (on prototype)
      *     result = Reflect.hasOwnMetadata("custom:annotation", Example.prototype, "method");
      *
      */
    inline def hasOwnMetadata(metadataKey: Any, target: js.Object, targetKey: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def hasOwnMetadata(metadataKey: Any, target: js.Object, targetKey: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnMetadata")(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
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
      *     // constructor
      *     @Reflect.metadata(key, value)
      *     class Example {
      *     }
      *
      *     // property (on constructor, TypeScript only)
      *     class Example {
      *         @Reflect.metadata(key, value)
      *         static staticProperty;
      *     }
      *
      *     // property (on prototype, TypeScript only)
      *     class Example {
      *         @Reflect.metadata(key, value)
      *         property;
      *     }
      *
      *     // method (on constructor)
      *     class Example {
      *         @Reflect.metadata(key, value)
      *         static staticMethod() { }
      *     }
      *
      *     // method (on prototype)
      *     class Example {
      *         @Reflect.metadata(key, value)
      *         method() { }
      *     }
      *
      */
    inline def metadata(metadataKey: Any, metadataValue: Any): FnCall = (^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[FnCall]
  }
}
