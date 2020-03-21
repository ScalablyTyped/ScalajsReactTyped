package typingsJapgolly.mendixmodelsdk.internalMod

import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.instancesMod.InstanceConstructor
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "instancehelpers")
@js.native
object instancehelpers extends js.Object {
  /**
    * Given some a (normalized) JSON representation of a unit,
    * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
    * and populates that from the JSON.
    * Should only be called if this unit was not already in memory.
    */
  def abstractUnitJsonToInstance(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    isPartial: Boolean
  ): typingsJapgolly.mendixmodelsdk.unitsMod.AbstractUnit | Null = js.native
  /**
    * Creates a new element for a SDK user.
    */
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](
    owner: IAbstractModel,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](
    owner: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    constructor: IStructureConstructor[T]
  ): T = js.native
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](
    owner: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String
  ): T = js.native
  def createElement[T /* <: typingsJapgolly.mendixmodelsdk.elementsMod.Element */](
    owner: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    constructor: IStructureConstructor[T],
    parentPropName: String,
    parentPropIsList: Boolean
  ): T = js.native
  def createNewElementInstanceFromJSON(model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractElementJson): typingsJapgolly.mendixmodelsdk.elementsMod.Element = js.native
  /**
    * Creates a new unit for a SDK user.
    */
  def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
  def createUnitFromJSON(model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
  def createUnitFromJSON(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    json: IAbstractUnitJson,
    resolveByIdReferences: Boolean
  ): IAbstractUnit = js.native
  /**
    * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
    */
  def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
  def modelElementJsonToInstance(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    json: Null,
    isPartial: Boolean
  ): typingsJapgolly.mendixmodelsdk.elementsMod.Element | Null = js.native
  /**
    * Given some a (normalized) JSON representation of a model element,
    * creates an instance of the corresponding `elements.Element`
    * and populates that from the JSON.
    * Will update existing elements if this element was created before.
    */
  def modelElementJsonToInstance(
    model: typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel,
    unit: typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit,
    container: typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement,
    json: IAbstractElementJson,
    isPartial: Boolean
  ): typingsJapgolly.mendixmodelsdk.elementsMod.Element | Null = js.native
  def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
  def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
}

