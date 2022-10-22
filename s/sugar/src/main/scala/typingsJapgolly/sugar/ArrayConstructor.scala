package typingsJapgolly.sugar

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.sugar.sugarjs._NativeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayConstructor
  extends StObject
     with _NativeConstructor {
  
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): Array[T] = js.native
  
  def create[T](): Array[T] = js.native
  def create[T](obj: Double): Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): Array[T] = js.native
  def create[T](obj: Unit, clone: Boolean): Array[T] = js.native
  def create[T](obj: ArrayLike[T]): Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): Array[T] = js.native
}
