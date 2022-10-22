package typingsJapgolly.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libraryFnReflectEs7GetMetadataMod {
  
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
  /* was `typeof core.Reflect.getMetadata` */
  inline def apply(metadataKey: Any, target: Object): Any = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(metadataKey: Any, target: Object, targetKey: java.lang.String): Any = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def apply(metadataKey: Any, target: Object, targetKey: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].apply(metadataKey.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("core-js/library/fn/reflect/es7/get-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
