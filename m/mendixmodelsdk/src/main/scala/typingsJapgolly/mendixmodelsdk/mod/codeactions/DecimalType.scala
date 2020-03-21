package typingsJapgolly.mendixmodelsdk.mod.codeactions

import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractElement
import typingsJapgolly.mendixmodelsdk.internalMod.AbstractModel
import typingsJapgolly.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.DecimalType")
@js.native
class DecimalType protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.codeactions.DecimalType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "codeactions.DecimalType")
@js.native
object DecimalType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.DecimalType = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.BasicParameterType): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.DecimalType = js.native
  /**
    * Creates and returns a new DecimalType instance in the SDK and on the server.
    * The new DecimalType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.DecimalType = js.native
}

