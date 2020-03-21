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

/**
  * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
  */
trait IFolder extends IFolderBase {
  var name: String
}

object IFolder {
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
    name: String,
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IFolder, Unit] => Callback,
    traverseFind: js.Function1[IFolder, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IFolder, Unit] => Callback,
    unit: IAbstractUnit
  ): IFolder = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolder, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolder, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IFolder, scala.Unit]) => traversePublicParts(t0).runNow()))
    __obj.asInstanceOf[IFolder]
  }
}

