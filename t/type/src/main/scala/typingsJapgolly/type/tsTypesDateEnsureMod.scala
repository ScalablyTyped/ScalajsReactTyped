package typingsJapgolly.`type`

import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureDefault
import typingsJapgolly.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesDateEnsureMod {
  
  @JSImport("type/ts-types/date/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
  inline def default(value: Any, options: EnsureBaseOptions & EnsureIsOptional): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
  
  inline def default_Date(value: Any): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def default_Date(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Date]) | EnsureBaseOptions
  ): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
