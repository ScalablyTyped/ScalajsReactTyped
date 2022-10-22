package typingsJapgolly.miniprogramWxs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatArray[T]
  extends StObject
     with /* n */ NumberDictionary[T] {
  
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  
  val length: Double = js.native
  
  def slice(): Array[T] = js.native
  def slice(start: Double): Array[T] = js.native
  def slice(start: Double, end: Double): Array[T] = js.native
  def slice(start: Unit, end: Double): Array[T] = js.native
}
