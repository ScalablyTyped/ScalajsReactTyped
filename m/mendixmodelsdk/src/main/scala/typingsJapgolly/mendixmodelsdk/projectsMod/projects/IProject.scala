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
  * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
  */
trait IProject extends IAbstractUnit {
  var isSystemProject: Boolean
  @JSName("model")
  val model_IProject: IModel
  var modules: IList[IModule]
  /**
    * This property is required and cannot be set to null.
    */
  var projectConversion: IProjectConversion
  var projectDocuments: IList[IProjectDocument]
}

object IProject {
  @scala.inline
  def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
    isSystemProject: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    model: IModel,
    modules: IList[IModule],
    projectConversion: IProjectConversion,
    projectDocuments: IList[IProjectDocument],
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IProject, Unit] => Callback,
    traverseFind: js.Function1[IProject, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IProject, Unit] => Callback,
    unit: IAbstractUnit
  ): IProject = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IProject, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IProject, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IProject, scala.Unit]) => traversePublicParts(t0).runNow()))
    __obj.asInstanceOf[IProject]
  }
}

