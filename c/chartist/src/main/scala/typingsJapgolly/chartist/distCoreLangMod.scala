package typingsJapgolly.chartist

import typingsJapgolly.chartist.anon.Unit
import typingsJapgolly.chartist.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreLangMod {
  
  @JSImport("chartist/dist/core/lang", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alphaNumerate(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaNumerate")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ensureUnit[T](value: T, unit: String): String | T = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureUnit")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String | T]
  
  inline def quantity[T](input: T): Unit | Value = ^.asInstanceOf[js.Dynamic].applyDynamic("quantity")(input.asInstanceOf[js.Any]).asInstanceOf[Unit | Value]
}
