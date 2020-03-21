package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.elementsMod.Element
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureConstructor
import typingsJapgolly.mendixmodelsdk.structuresMod.Structure
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typingsJapgolly.mendixmodelsdk.transportInterfacesMod.IAbstractUnitJson
import typingsJapgolly.mendixmodelsdk.unitsMod.AbstractUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.utilsMod.utils.IMap
import typingsJapgolly.mendixmodelsdk.versionChecksMod.ILifeCycle
import typingsJapgolly.mendixmodelsdk.versionChecksMod.LifeCycle
import typingsJapgolly.mendixmodelsdk.versionChecksMod.Version
import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/instances", JSImport.Namespace)
@js.native
object instancesMod extends js.Object {
  @js.native
  abstract class AbstractEnum protected () extends js.Object {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    var qualifiedTsTypeName: String = js.native
    var versionInfo: LifeCycle = js.native
    def checkEnumVersion(metaModelVersion: Version, includeWarnings: Boolean): Unit = js.native
    def name(): String = js.native
    def qualifiedTsLiteralName(): String = js.native
  }
  
  @js.native
  trait IList[T] extends Array[T] {
    def clear(): js.Array[T] = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      thisArg: js.Any,
      fromIndex: Double
    ): js.UndefOr[T] = js.native
    def remove(value: T): Boolean = js.native
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.elementsMod.IElementConstructor
    - typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
  */
  trait InstanceConstructor extends js.Object
  
  def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson): Element = js.native
  def createElementFromJSON(model: IAbstractModel, json: IAbstractElementJson, idToStructureMap: IMap[Structure]): Element = js.native
  def createModelUnitFromJSON(containerUnit: IStructuralUnit, containmentName: String, contents: IAbstractElementJson): ModelUnit = js.native
  @js.native
  object instancehelpers extends js.Object {
    /**
      * Given some a (normalized) JSON representation of a unit,
      * creates an instance of the corresponding `unit.AbstractUnit` sub class (structural/model)
      * and populates that from the JSON.
      * Should only be called if this unit was not already in memory.
      */
    def abstractUnitJsonToInstance(model: AbstractModel, json: IAbstractUnitJson, isPartial: Boolean): AbstractUnit | Null = js.native
    /**
      * Creates a new element for a SDK user.
      */
    def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T]): T = js.native
    def createElement[T /* <: Element */](owner: IAbstractModel, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
    def createElement[T /* <: Element */](
      owner: IAbstractModel,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T]): T = js.native
    def createElement[T /* <: Element */](owner: AbstractElement, constructor: IStructureConstructor[T], parentPropName: String): T = js.native
    def createElement[T /* <: Element */](
      owner: AbstractElement,
      constructor: IStructureConstructor[T],
      parentPropName: String,
      parentPropIsList: Boolean
    ): T = js.native
    def createNewElementInstanceFromJSON(model: AbstractModel, json: IAbstractElementJson): Element = js.native
    /**
      * Creates a new unit for a SDK user.
      */
    def createUnit(container: IStructuralUnit, constructor: IAbstractUnitConstructor): js.Any = js.native
    def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson): IAbstractUnit = js.native
    def createUnitFromJSON(model: AbstractModel, json: IAbstractUnitJson, resolveByIdReferences: Boolean): IAbstractUnit = js.native
    /**
      * Type -> class (the constructor function, technically) lookup, e.g. "DomainModels$Entity" -> DomainModels.Entity
      */
    def lookupClass(qualifiedTypeName: String, classes: js.Any): InstanceConstructor = js.native
    def modelElementJsonToInstance(model: AbstractModel, unit: ModelUnit, container: AbstractElement, json: Null, isPartial: Boolean): Element | Null = js.native
    /**
      * Given some a (normalized) JSON representation of a model element,
      * creates an instance of the corresponding `elements.Element`
      * and populates that from the JSON.
      * Will update existing elements if this element was created before.
      */
    def modelElementJsonToInstance(
      model: AbstractModel,
      unit: ModelUnit,
      container: AbstractElement,
      json: IAbstractElementJson,
      isPartial: Boolean
    ): Element | Null = js.native
    def structureAffectsQualifiedNames(structure: IStructure): Boolean = js.native
    def structureIsByNameReferrable(structure: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/elements.AbstractElement */ Boolean = js.native
  }
  
}

