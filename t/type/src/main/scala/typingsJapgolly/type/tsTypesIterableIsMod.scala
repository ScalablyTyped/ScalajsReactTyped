package typingsJapgolly.`type`

import typingsJapgolly.`type`.anon.DenyEmpty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesIterableIsMod {
  
  @JSImport("type/ts-types/iterable/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(value: Any, options: DenyEmpty): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
