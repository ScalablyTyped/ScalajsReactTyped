package typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
  */
trait IProject
  extends StObject
     with IStructuralUnit {
  
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
  
  inline def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    container: IStructuralUnit,
    delete: Callback,
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    isSystemProject: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    model: IModel,
    modules: IList[IModule],
    projectConversion: IProjectConversion,
    projectDocuments: IList[IProjectDocument],
    publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IProject, Unit] => Callback,
    traverseFind: js.Function1[IProject, Any] => Any | Null,
    traversePublicParts: js.Function1[IProject, Unit] => Callback,
    unit: IAbstractUnit
  ): IProject = {
    val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, container = container.asInstanceOf[js.Any], delete = delete.toJsFn, id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IProject, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IProject, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProject]
  }
  
  extension [Self <: IProject](x: Self) {
    
    inline def setIsSystemProject(value: Boolean): Self = StObject.set(x, "isSystemProject", value.asInstanceOf[js.Any])
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModules(value: IList[IModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setProjectConversion(value: IProjectConversion): Self = StObject.set(x, "projectConversion", value.asInstanceOf[js.Any])
    
    inline def setProjectDocuments(value: IList[IProjectDocument]): Self = StObject.set(x, "projectDocuments", value.asInstanceOf[js.Any])
  }
}
