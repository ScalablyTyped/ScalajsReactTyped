package typingsJapgolly.minappEnv.global

import typingsJapgolly.minappEnv.ArrayBufferLike
import typingsJapgolly.minappEnv.ArrayLike
import typingsJapgolly.minappEnv.Int32ArrayConstructor
import typingsJapgolly.minappEnv.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Int32Array")
@js.native
open class Int32Array protected ()
  extends StObject
     with typingsJapgolly.minappEnv.Int32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
object Int32Array {
  
  inline def apply: Int32ArrayConstructor = js.Dynamic.global.selectDynamic("Int32Array").asInstanceOf[Int32ArrayConstructor]
}
