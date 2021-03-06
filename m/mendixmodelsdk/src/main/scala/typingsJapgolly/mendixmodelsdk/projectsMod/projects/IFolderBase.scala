package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderBase extends IAbstractUnit {
  val containerAsFolderBase: IFolderBase
  val containerAsProject: IProject
  var documents: IList[IDocument]
  var folders: IList[IFolder]
  @JSName("model")
  val model_IFolderBase: IModel
}

object IFolderBase {
  @scala.inline
  def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    documents: IList[IDocument],
    folders: IList[IFolder],
    id: String,
    isLoaded: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    model: IModel,
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IFolderBase, Unit] => Callback,
    traverseFind: js.Function1[IFolderBase, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IFolderBase, Unit] => Callback,
    unit: IAbstractUnit
  ): IFolderBase = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolderBase, scala.Unit]) => traversePublicParts(t0).runNow()))
    __obj.asInstanceOf[IFolderBase]
  }
}

