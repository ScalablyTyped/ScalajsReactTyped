package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "createElementFromJSON")
@js.native
object createElementFromJSON extends js.Object {
  def apply(model: IAbstractModel, json: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.elementsMod.Element = js.native
  def apply(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[typingsJapgolly.mendixmodelsdk.structuresMod.Structure]
  ): typingsJapgolly.mendixmodelsdk.elementsMod.Element = js.native
}

