package typingsJapgolly.knockoutPostbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPostBox extends StObject {
  
  def defaultComparer[T](newValue: T, oldValue: T): Boolean = js.native
  
  def publish[T](topic: String): Unit = js.native
  def publish[T](topic: String, value: T): Unit = js.native
  
  def reset(): Unit = js.native
  
  def serializer(`object`: Any): String = js.native
  
  def subscribe[T](topic: String, handler: js.Function1[/* value */ T, Unit]): Any = js.native
  def subscribe[T](topic: String, handler: js.Function1[/* value */ T, Unit], target: Any): Any = js.native
}
