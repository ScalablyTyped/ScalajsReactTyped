package typingsJapgolly.`type`

import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureDefault
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesFiniteEnsureMod {
  
  @JSImport("type/ts-types/finite/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def default(value: Any, options: EnsureBaseOptions & EnsureIsOptional): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def default_Double(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default_Double(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[Double]) | EnsureBaseOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
}
