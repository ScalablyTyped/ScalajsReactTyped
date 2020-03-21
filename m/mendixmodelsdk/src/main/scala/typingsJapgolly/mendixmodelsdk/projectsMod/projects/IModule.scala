package typingsJapgolly.mendixmodelsdk.projectsMod.projects

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typingsJapgolly.mendixmodelsdk.instancesMod.IList
import typingsJapgolly.mendixmodelsdk.securityMod.security.IModuleSecurity
import typingsJapgolly.mendixmodelsdk.unitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
  */
trait IModule extends IFolderBase {
  var appStoreGuid: String
  var appStoreVersion: String
  var appStoreVersionGuid: String
  /**
    * This property is required and cannot be set to null.
    */
  var domainModel: IDomainModel
  var fromAppStore: Boolean
  /**
    * In version 8.5.0: introduced
    */
  var isReusableComponent: Boolean
  /**
    * This property is required and cannot be set to null.
    */
  var moduleSecurity: IModuleSecurity
  var name: String
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  var sortIndex: Double
}

object IModule {
  @scala.inline
  def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    appStoreGuid: String,
    appStoreVersion: String,
    appStoreVersionGuid: String,
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    documents: IList[IDocument],
    domainModel: IDomainModel,
    folders: IList[IFolder],
    fromAppStore: Boolean,
    id: String,
    isLoaded: Boolean,
    isReusableComponent: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    model: IModel,
    moduleSecurity: IModuleSecurity,
    name: String,
    publicProperties: CallbackTo[js.Array[AbstractProperty[js.Any, js.Any]]],
    sortIndex: Double,
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IModule, Unit] => Callback,
    traverseFind: js.Function1[IModule, js.Any] => CallbackTo[js.Any | Null],
    traversePublicParts: js.Function1[IModule, Unit] => Callback,
    unit: IAbstractUnit
  ): IModule = {
    val __obj = js.Dynamic.literal(appStoreGuid = appStoreGuid.asInstanceOf[js.Any], appStoreVersion = appStoreVersion.asInstanceOf[js.Any], appStoreVersionGuid = appStoreVersionGuid.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], documents = documents.asInstanceOf[js.Any], domainModel = domainModel.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], fromAppStore = fromAppStore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReusableComponent = isReusableComponent.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], moduleSecurity = moduleSecurity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sortIndex = sortIndex.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.updateDynamic("allProperties")(allProperties.toJsFn)
    __obj.updateDynamic("loadedProperties")(loadedProperties.toJsFn)
    __obj.updateDynamic("publicProperties")(publicProperties.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("traverse")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule, scala.Unit]) => traverse(t0).runNow()))
    __obj.updateDynamic("traverseFind")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule, js.Any]) => traverseFind(t0).runNow()))
    __obj.updateDynamic("traversePublicParts")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule, scala.Unit]) => traversePublicParts(t0).runNow()))
    __obj.asInstanceOf[IModule]
  }
}

