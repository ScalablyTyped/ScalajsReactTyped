package typingsJapgolly.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.simperium.anon.Id[T]
  - typingsJapgolly.simperium.anon.Object[T]
  - typingsJapgolly.simperium.anon.Type
*/
trait LocalQueuedChange[T] extends StObject
object LocalQueuedChange {
  
  inline def Id[T](id: EntityId, `object`: T): typingsJapgolly.simperium.anon.Id[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("modify")
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.Id[T]]
  }
  
  inline def Object[T](`object`: T, originalChange: Change[T]): typingsJapgolly.simperium.anon.Object[T] = {
    val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("full")
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.Object[T]]
  }
  
  inline def Type(id: EntityId): typingsJapgolly.simperium.anon.Type = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.Type]
  }
}
