package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.breeze.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityQuery")
@js.native
open class EntityQuery ()
  extends StObject
     with typingsJapgolly.breeze.breeze.EntityQuery {
  def this(resourceName: String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}
/* static members */
object EntityQuery {
  
  @JSGlobal("breeze.EntityQuery")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(resourceName: String): typingsJapgolly.breeze.breeze.EntityQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(resourceName.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityQuery]
  
  inline def fromEntities(entities: js.Array[Entity]): typingsJapgolly.breeze.breeze.EntityQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntities")(entities.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityQuery]
  inline def fromEntities(entity: Entity): typingsJapgolly.breeze.breeze.EntityQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntities")(entity.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityQuery]
  
  inline def fromEntityKey(entityKey: typingsJapgolly.breeze.breeze.EntityKey): typingsJapgolly.breeze.breeze.EntityQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEntityKey")(entityKey.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityQuery]
  
  inline def fromEntityNavigation(entity: Entity, navigationProperty: typingsJapgolly.breeze.breeze.NavigationProperty): typingsJapgolly.breeze.breeze.EntityQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEntityNavigation")(entity.asInstanceOf[js.Any], navigationProperty.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.EntityQuery]
}
