package typingsJapgolly.backboneRelational.mod

import typingsJapgolly.backbone.mod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone-relational", "HasOne")
@js.native
class HasOne () extends Relation {
  var collectionType: js.Any = js.native
  def addRelated(model: typingsJapgolly.backbone.mod.Model, options: js.Any): Unit = js.native
  def findRelated(options: js.Any): typingsJapgolly.backbone.mod.Model = js.native
  def handleAddition(
    model: typingsJapgolly.backbone.mod.Model,
    coll: Collection[typingsJapgolly.backbone.mod.Model],
    options: js.Any
  ): Unit = js.native
  def handleRemoval(
    model: typingsJapgolly.backbone.mod.Model,
    coll: Collection[typingsJapgolly.backbone.mod.Model],
    options: js.Any
  ): Unit = js.native
  def handleReset(coll: Collection[typingsJapgolly.backbone.mod.Model], options: js.Any): Unit = js.native
  def onChange(model: typingsJapgolly.backbone.mod.Model, attr: js.Any, options: js.Any): Unit = js.native
  def removeRelated(model: typingsJapgolly.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
  def setKeyContents(keyContents: String): Unit = js.native
  def setKeyContents(keyContents: js.Array[Double | String]): Unit = js.native
  def setKeyContents(keyContents: Double): Unit = js.native
  def setKeyContents(keyContents: Collection[typingsJapgolly.backbone.mod.Model]): Unit = js.native
  def tryAddRelated(model: typingsJapgolly.backbone.mod.Model, coll: js.Any, options: js.Any): Unit = js.native
}

