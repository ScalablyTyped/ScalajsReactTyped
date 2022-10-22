package typingsJapgolly.`type`

import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureDefault
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureFunction
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesPlainFunctionEnsureMod {
  
  @JSImport("type/ts-types/plain-function/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): EnsureFunction | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EnsureFunction | Null]
  inline def default(value: Any, options: EnsureBaseOptions & EnsureIsOptional): EnsureFunction | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsureFunction | Null]
  
  inline def default_EnsureFunction(value: Any): EnsureFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EnsureFunction]
  inline def default_EnsureFunction(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[EnsureFunction]) | EnsureBaseOptions
  ): EnsureFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsureFunction]
}
