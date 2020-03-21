package typingsJapgolly.backboneRelational.mod

import typingsJapgolly.backbone.mod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "Relation")
@js.native
class Relation ()
  extends typingsJapgolly.backbone.mod.Model {
  var instance: js.Any = js.native
  var key: js.Any = js.native
  var keyContents: js.Any = js.native
  var options: js.Any = js.native
  var related: js.Any = js.native
  var relatedCollection: js.Any = js.native
  var relatedModel: js.Any = js.native
  var reverseRelation: js.Any = js.native
  def checkPreconditions(): Boolean = js.native
  def getReverseRelations(model: Model): Relation = js.native
  def setRelated(related: Collection[typingsJapgolly.backbone.mod.Model]): Unit = js.native
  def setRelated(related: typingsJapgolly.backbone.mod.Model): Unit = js.native
}

