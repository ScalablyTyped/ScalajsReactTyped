package typingsJapgolly.`type`

import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureDefault
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureIsOptional
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesMapEnsureMod {
  
  @JSImport("type/ts-types/map/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[K, V](value: Any): Map[K, V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Map[K, V]]
  inline def default[K, V](
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & (EnsureDefault[Map[K, V]])) | EnsureBaseOptions
  ): Map[K, V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Map[K, V]]
  
  inline def default_KV_Union[K, V](value: Any): (Map[K, V]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[(Map[K, V]) | Null]
  inline def default_KV_Union[K, V](value: Any, options: EnsureBaseOptions & EnsureIsOptional): (Map[K, V]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Map[K, V]) | Null]
}
