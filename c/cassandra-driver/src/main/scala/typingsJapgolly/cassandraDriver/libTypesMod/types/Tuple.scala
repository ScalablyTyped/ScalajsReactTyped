package typingsJapgolly.cassandraDriver.libTypesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.Tuple")
@js.native
open class Tuple protected () extends StObject {
  def this(args: Any*) = this()
  
  var elements: js.Array[Any] = js.native
  
  def get(index: Double): Any = js.native
  
  var length: Double = js.native
  
  def toJSON(): String = js.native
  
  def values(): js.Array[Any] = js.native
}
object Tuple {
  
  @JSImport("cassandra-driver/lib/types", "types.Tuple")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromArray(elements: js.Array[Any]): Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(elements.asInstanceOf[js.Any]).asInstanceOf[Tuple]
}
