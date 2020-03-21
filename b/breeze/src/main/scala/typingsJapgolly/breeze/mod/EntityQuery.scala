package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.breeze.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityQuery")
@js.native
class EntityQuery ()
  extends typingsJapgolly.breeze.breeze.EntityQuery {
  def this(resourceName: String) = this()
  /** Create query from an expression tree */
  def this(tree: js.Object) = this()
}

/* static members */
@JSImport("breeze", "EntityQuery")
@js.native
object EntityQuery extends js.Object {
  def from(resourceName: String): typingsJapgolly.breeze.breeze.EntityQuery = js.native
  def fromEntities(entities: js.Array[Entity]): typingsJapgolly.breeze.breeze.EntityQuery = js.native
  def fromEntities(entity: Entity): typingsJapgolly.breeze.breeze.EntityQuery = js.native
  def fromEntityKey(entityKey: typingsJapgolly.breeze.breeze.EntityKey): typingsJapgolly.breeze.breeze.EntityQuery = js.native
  def fromEntityNavigation(entity: Entity, navigationProperty: typingsJapgolly.breeze.breeze.NavigationProperty): typingsJapgolly.breeze.breeze.EntityQuery = js.native
}

