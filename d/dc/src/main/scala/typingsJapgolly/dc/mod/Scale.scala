package typingsJapgolly.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scale[T] extends StObject {
  
  def apply(x: Any): T = js.native
  
  def domain(): js.Array[Any] = js.native
  def domain(values: js.Array[Any]): Scale[T] = js.native
  
  def range(): js.Array[T] = js.native
  def range(values: js.Array[T]): Scale[T] = js.native
}
