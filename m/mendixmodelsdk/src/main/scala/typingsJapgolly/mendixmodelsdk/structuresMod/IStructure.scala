package typingsJapgolly.mendixmodelsdk.structuresMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructure extends js.Object {
  val container: IContainer | Null
  var id: String
  var isLoaded: Boolean
  var model: IAbstractModel
  var structureTypeName: String
  /**
    * Unit that owns/contains this thing.
    */
  var unit: IAbstractUnit
  def allProperties(): js.Array[AbstractProperty[_, _]]
  /**
    * Returns all properties when this structure is loaded, otherwise just the public properties.
    */
  def loadedProperties(): js.Array[AbstractProperty[_, _]]
  def publicProperties(): js.Array[AbstractProperty[_, _]]
  /**
    * Renders the structure as plain JSON (without observables magic).
    * This is intended for debugging and development convenience.
    * Note that the resulting object is not of the interface type corresponding to this structure.
    */
  def toJSON(): js.Object
  /**
    * Traverses this structure by calling the provided visitor function
    * on itself and all the structures contained (as part) by it,
    * in depth-first order, and it returns synchronously after that.
    */
  def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit
  /**
    * Traverses this structure, returning immediately when `visit` returns something other than `null`.
    */
  def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null
  /**
    * Traverses this structure, only visiting children contained in public properties.
    */
  def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit
}

object IStructure {
  @scala.inline
  def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    id: String,
    isLoaded: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    model: IAbstractModel,
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IStructure, Unit] => Callback,
    traverseFind: js.Function1[IStructure, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IStructure, Unit] => Callback,
    unit: IAbstractUnit,
    container: IContainer = null
  ): IStructure = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.structuresMod.IStructure, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.structuresMod.IStructure, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.structuresMod.IStructure, scala.Unit]) => traversePublicParts(t0).runNow()))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructure]
  }
}

