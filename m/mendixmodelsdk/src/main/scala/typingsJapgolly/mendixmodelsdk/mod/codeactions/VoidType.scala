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
  * In version 8.3.0: introduced
  */
@JSImport("mendixmodelsdk", "codeactions.VoidType")
@js.native
class VoidType protected ()
  extends typingsJapgolly.mendixmodelsdk.allModelClassesMod.codeactions.VoidType {
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
@JSImport("mendixmodelsdk", "codeactions.VoidType")
@js.native
object VoidType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInBasicParameterTypeUnderType(container: typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.BasicParameterType): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.VoidType = js.native
  /**
    * Creates and returns a new VoidType instance in the SDK and on the server.
    * The new VoidType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInCodeActionUnderActionReturnType(container: typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typingsJapgolly.mendixmodelsdk.codeactionsMod.codeactions.VoidType = js.native
}

