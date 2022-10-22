package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularCore.mod.^
import typingsJapgolly.std.FunctionConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type[T]
  extends js.Function
     with Instantiable1[/* args (repeated) */ Any, T]
     with _ProviderToken[T]
object Type {
  
  inline def apply: FunctionConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Type").asInstanceOf[FunctionConstructor]
}
