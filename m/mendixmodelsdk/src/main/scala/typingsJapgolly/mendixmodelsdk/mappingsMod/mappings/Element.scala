package typingsJapgolly.mendixmodelsdk.mappingsMod.mappings

import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import typingsJapgolly.mendixmodelsdk.jsonstructuresMod.jsonstructures.JsonStructure
import typingsJapgolly.mendixmodelsdk.mappingsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.messagedefinitionsMod.messagedefinitions.EntityMessageDefinition
import typingsJapgolly.mendixmodelsdk.xmlschemasMod.xmlschemas.XmlPrimitiveType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Mappings`.
  */
/**
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
abstract class Element protected ()
  extends typingsJapgolly.mendixmodelsdk.internalMod.Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  def children(): IList[Element] = js.native
  def containerAsElement(): Element = js.native
  def containerAsEntityMessageDefinition(): EntityMessageDefinition = js.native
  def containerAsJsonStructure(): JsonStructure = js.native
  def elementType(): ElementType = js.native
  def elementType(newValue: ElementType): js.Any = js.native
  def errorMessage(): String = js.native
  def errorMessage(newValue: String): js.Any = js.native
  /**
    * In version 7.6.0: introduced
    */
  def exposedItemName(): String = js.native
  def exposedItemName(newValue: String): js.Any = js.native
  def exposedName(): String = js.native
  def exposedName(newValue: String): js.Any = js.native
  def fractionDigits(): Double = js.native
  def fractionDigits(newValue: Double): js.Any = js.native
  def isDefaultType(): Boolean = js.native
  def isDefaultType(newValue: Boolean): js.Any = js.native
  def maxLength(): Double = js.native
  def maxLength(newValue: Double): js.Any = js.native
  def maxOccurs(): Double = js.native
  def maxOccurs(newValue: Double): js.Any = js.native
  def minOccurs(): Double = js.native
  def minOccurs(newValue: Double): js.Any = js.native
  def nillable(): Boolean = js.native
  def nillable(newValue: Boolean): js.Any = js.native
  /**
    * The value of this property is conceptually of type mappings.ElementPath.
    */
  def path(): String = js.native
  def path(newValue: String): js.Any = js.native
  def primitiveType(): XmlPrimitiveType = js.native
  def primitiveType(newValue: XmlPrimitiveType): js.Any = js.native
  def totalDigits(): Double = js.native
  def totalDigits(newValue: Double): js.Any = js.native
  def warningMessage(): String = js.native
  def warningMessage(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.Element")
@js.native
object Element extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

