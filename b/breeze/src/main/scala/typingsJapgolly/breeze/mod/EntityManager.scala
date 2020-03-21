package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.AnonMergeStrategy
import typingsJapgolly.breeze.breeze.EntityManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("breeze", "EntityManager")
@js.native
class EntityManager ()
  extends typingsJapgolly.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}

/* static members */
@JSImport("breeze", "EntityManager")
@js.native
object EntityManager extends js.Object {
  def importEntities(exportedData: js.Object): typingsJapgolly.breeze.breeze.EntityManager = js.native
  def importEntities(exportedData: js.Object, config: AnonMergeStrategy): typingsJapgolly.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String): typingsJapgolly.breeze.breeze.EntityManager = js.native
  def importEntities(exportedString: String, config: AnonMergeStrategy): typingsJapgolly.breeze.breeze.EntityManager = js.native
}

