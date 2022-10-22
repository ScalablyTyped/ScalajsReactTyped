package typingsJapgolly.esToPrimitive

import typingsJapgolly.std.NumberConstructor
import typingsJapgolly.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es2015Mod {
  
  inline def apply(input: Any): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  inline def apply(input: Any, hint: NumberConstructor): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  inline def apply(input: Any, hint: StringConstructor): js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], hint.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Double | js.BigInt | Boolean | js.Symbol | Null]]
  
  @JSImport("es-to-primitive/es2015", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
