package typingsJapgolly.minappEnv.global

import typingsJapgolly.minappEnv.ArrayBufferLike
import typingsJapgolly.minappEnv.ArrayLike
import typingsJapgolly.minappEnv.Iterable
import typingsJapgolly.minappEnv.Uint32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint32Array")
@js.native
open class Uint32Array protected ()
  extends StObject
     with typingsJapgolly.minappEnv.Uint32Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[Double]) = this()
  def this(elements: Iterable[Double]) = this()
  def this(length: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
}
object Uint32Array {
  
  inline def apply: Uint32ArrayConstructor = js.Dynamic.global.selectDynamic("Uint32Array").asInstanceOf[Uint32ArrayConstructor]
}
