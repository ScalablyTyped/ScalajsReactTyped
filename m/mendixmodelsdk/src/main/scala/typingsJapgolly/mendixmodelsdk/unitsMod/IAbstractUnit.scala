package typingsJapgolly.mendixmodelsdk.unitsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractUnit extends IStructure {
  /**
    * The parent unit of this unit.
    */
  @JSName("container")
  val container_IAbstractUnit: IStructuralUnit
}

object IAbstractUnit {
  @scala.inline
  def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    model: IAbstractModel,
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IAbstractUnit, Unit] => Callback,
    traverseFind: js.Function1[IAbstractUnit, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IAbstractUnit, Unit] => Callback,
    unit: IAbstractUnit
  ): IAbstractUnit = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit, scala.Unit]) => traversePublicParts(t0).runNow()))
    __obj.asInstanceOf[IAbstractUnit]
  }
}

