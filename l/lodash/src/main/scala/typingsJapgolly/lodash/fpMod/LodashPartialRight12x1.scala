package typingsJapgolly.lodash.fpMod

import typingsJapgolly.lodash.mod.Function1
import typingsJapgolly.lodash.mod.Function2
import typingsJapgolly.lodash.mod.Function3
import typingsJapgolly.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPartialRight12x1[T1, T2, T3, T4, R] extends StObject {
  
  def apply(arg1: js.Tuple4[T1, T2 | __, T3 | __, T4 | __]): Function1[T4, R] = js.native
  def apply(arg2: js.Tuple3[T2, T3, T4]): Function1[T1, R] = js.native
  def apply(arg3: js.Tuple2[T3, T4]): Function2[T1, T2, R] = js.native
  def apply(arg4: js.Array[T4]): Function3[T1, T2, T3, R] = js.native
}
