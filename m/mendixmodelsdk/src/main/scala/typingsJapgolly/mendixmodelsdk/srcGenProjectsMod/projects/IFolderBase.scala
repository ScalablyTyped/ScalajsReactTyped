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

trait IFolderBase
  extends StObject
     with IStructuralUnit {
  
  val containerAsFolderBase: IFolderBase
  
  val containerAsProject: IProject
  
  var documents: IList[IDocument]
  
  var folders: IList[IFolder]
  
  @JSName("model")
  val model_IFolderBase: IModel
}
object IFolderBase {
  
  inline def apply(
    allProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    container: IStructuralUnit,
    containerAsFolderBase: IFolderBase,
    containerAsProject: IProject,
    delete: Callback,
    documents: IList[IDocument],
    folders: IList[IFolder],
    id: String,
    isLoadable: Boolean,
    isLoaded: Boolean,
    isReadOnly: Boolean,
    loadedProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    model: IModel,
    publicProperties: CallbackTo[js.Array[AbstractProperty[Any, Any]]],
    structureTypeName: String,
    toJSON: CallbackTo[js.Object],
    traverse: js.Function1[IFolderBase, Unit] => Callback,
    traverseFind: js.Function1[IFolderBase, Any] => Any | Null,
    traversePublicParts: js.Function1[IFolderBase, Unit] => Callback,
    unit: IAbstractUnit
  ): IFolderBase = {
    val __obj = js.Dynamic.literal(allProperties = allProperties.toJsFn, container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = delete.toJsFn, documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = loadedProperties.toJsFn, model = model.asInstanceOf[js.Any], publicProperties = publicProperties.toJsFn, structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, traverse = js.Any.fromFunction1((t0: js.Function1[IFolderBase, Unit]) => traverse(t0).runNow()), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1((t0: js.Function1[IFolderBase, Unit]) => traversePublicParts(t0).runNow()), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderBase]
  }
  
  extension [Self <: IFolderBase](x: Self) {
    
    inline def setContainerAsFolderBase(value: IFolderBase): Self = StObject.set(x, "containerAsFolderBase", value.asInstanceOf[js.Any])
    
    inline def setContainerAsProject(value: IProject): Self = StObject.set(x, "containerAsProject", value.asInstanceOf[js.Any])
    
    inline def setDocuments(value: IList[IDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setFolders(value: IList[IFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
