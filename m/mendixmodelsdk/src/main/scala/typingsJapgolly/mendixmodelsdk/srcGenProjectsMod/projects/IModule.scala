package typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IDomainModel
import typingsJapgolly.mendixmodelsdk.srcGenSecurityMod.security.IModuleSecurity
import typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
  */
trait IModule
  extends StObject
     with IFolderBase {
  
  var appStoreGuid: String
  
  /**
    * In version 8.13.0: introduced
    */
  var appStorePackageId: Double
  
  var appStoreVersion: String
  
  var appStoreVersionGuid: String
  
  /**
    * This property is required and cannot be set to null.
    */
  var domainModel: IDomainModel
  
  /**
    * In version 9.8.0: deleted
    * In version 9.3.0: introduced
    */
  var exportLevel: ModuleExportLevel
  
  var fromAppStore: Boolean
  
  /**
    * In version 9.1.0: deleted
    * In version 8.5.0: introduced
    */
  var isReusableComponent: Boolean
  
  /**
    * In version 9.3.0: introduced
    */
  var isThemeModule: Boolean
  
  /**
    * This property is required and cannot be set to null.
    */
  var moduleSecurity: IModuleSecurity
  
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.8.0: introduced
    */
  var moduleSettings: IModuleSettings
  
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
  
  inline def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    appStoreGuid: String,
    appStorePackageId: Double,
    appStoreVersion: String,
    appStoreVersionGuid: String,
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    delete: Callback,
    documents: IList[IDocument],
    domainModel: IDomainModel,
    exportLevel: ModuleExportLevel,
    folders: IList[IFolder],
    fromAppStore: Boolean,
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    isReusableComponent: Boolean,
    isThemeModule: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    model: IModel,
    moduleSecurity: IModuleSecurity,
    moduleSettings: IModuleSettings,
    name: String,
    publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    sortIndex: Double,
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IModule, Unit] => Callback,
    traverseFind: js.Function1[IModule, Any] => Any | Null,
    traversePublicParts: js.Function1[IModule, Unit] => Callback,
    unit: IAbstractUnit
  ): IModule = {
    val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, appStoreGuid = appStoreGuid.asInstanceOf[js.Any], appStorePackageId = appStorePackageId.asInstanceOf[js.Any], appStoreVersion = appStoreVersion.asInstanceOf[js.Any], appStoreVersionGuid = appStoreVersionGuid.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = delete.toJsFn, documents = documents.asInstanceOf[js.Any], domainModel = domainModel.asInstanceOf[js.Any], exportLevel = exportLevel.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], fromAppStore = fromAppStore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isReusableComponent = isReusableComponent.asInstanceOf[js.Any], isThemeModule = isThemeModule.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], moduleSecurity = moduleSecurity.asInstanceOf[js.Any], moduleSettings = moduleSettings.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, sortIndex = sortIndex.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IModule, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IModule, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModule]
  }
  
  extension [Self <: IModule](x: Self) {
    
    inline def setAppStoreGuid(value: String): Self = StObject.set(x, "appStoreGuid", value.asInstanceOf[js.Any])
    
    inline def setAppStorePackageId(value: Double): Self = StObject.set(x, "appStorePackageId", value.asInstanceOf[js.Any])
    
    inline def setAppStoreVersion(value: String): Self = StObject.set(x, "appStoreVersion", value.asInstanceOf[js.Any])
    
    inline def setAppStoreVersionGuid(value: String): Self = StObject.set(x, "appStoreVersionGuid", value.asInstanceOf[js.Any])
    
    inline def setDomainModel(value: IDomainModel): Self = StObject.set(x, "domainModel", value.asInstanceOf[js.Any])
    
    inline def setExportLevel(value: ModuleExportLevel): Self = StObject.set(x, "exportLevel", value.asInstanceOf[js.Any])
    
    inline def setFromAppStore(value: Boolean): Self = StObject.set(x, "fromAppStore", value.asInstanceOf[js.Any])
    
    inline def setIsReusableComponent(value: Boolean): Self = StObject.set(x, "isReusableComponent", value.asInstanceOf[js.Any])
    
    inline def setIsThemeModule(value: Boolean): Self = StObject.set(x, "isThemeModule", value.asInstanceOf[js.Any])
    
    inline def setModuleSecurity(value: IModuleSecurity): Self = StObject.set(x, "moduleSecurity", value.asInstanceOf[js.Any])
    
    inline def setModuleSettings(value: IModuleSettings): Self = StObject.set(x, "moduleSettings", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
  }
}
