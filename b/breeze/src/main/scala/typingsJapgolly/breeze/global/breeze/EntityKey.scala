package typingsJapgolly.breeze.global.breeze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityKey")
@js.native
open class EntityKey protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.EntityKey {
  def this(entityType: typingsJapgolly.breeze.breeze.EntityType, keyValue: Any) = this()
  def this(entityType: typingsJapgolly.breeze.breeze.EntityType, keyValues: js.Array[Any]) = this()
  
  /* CompleteClass */
  var entityType: typingsJapgolly.breeze.breeze.EntityType = js.native
  
  /* CompleteClass */
  override def equals(entityKey: typingsJapgolly.breeze.breeze.EntityKey): Boolean = js.native
  
  /* CompleteClass */
  var values: js.Array[Any] = js.native
}
/* static members */
object EntityKey {
  
  @JSGlobal("breeze.EntityKey")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(k1: typingsJapgolly.breeze.breeze.EntityKey, k2: typingsJapgolly.breeze.breeze.EntityKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(k1.asInstanceOf[js.Any], k2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
