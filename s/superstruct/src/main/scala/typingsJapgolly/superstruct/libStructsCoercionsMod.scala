package typingsJapgolly.superstruct

import typingsJapgolly.superstruct.anon.Strict
import typingsJapgolly.superstruct.libStructMod.Coercer
import typingsJapgolly.superstruct.libStructMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStructsCoercionsMod {
  
  @JSImport("superstruct/lib/structs/coercions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coerce[T, S, C](struct: Struct[T, S], condition: Struct[C, Any], coercer: Coercer[C]): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(struct.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def defaulted[T, S](struct: Struct[T, S], fallback: Any): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(struct.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  inline def defaulted[T, S](struct: Struct[T, S], fallback: Any, options: Strict): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(struct.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def trimmed[T, S](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimmed")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
}
