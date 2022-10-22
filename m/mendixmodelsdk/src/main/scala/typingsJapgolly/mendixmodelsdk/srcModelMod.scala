package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.BaseModel
import typingsJapgolly.mendixmodelsdk.srcGenProjectsMod.projects.IModule
import typingsJapgolly.mendixmodelsdk.srcModelSdkClientImplMod.ModelSdkClientImpl
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IBaseModel because Already inherited
  - typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @JSImport("mendixmodelsdk/src/Model", "Model")
  @js.native
  open class Model protected () extends BaseModel {
    def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
    
    /* private */ var allModelClasses: Any = js.native
    
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("mendixmodelsdk/src/Model", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSdkClient")(connectionConfig.asInstanceOf[js.Any]).asInstanceOf[ModelSdkClientImpl[IModel, Model]]
  }
  
  type IModel = typingsJapgolly.mendixmodelsdk.srcGenBaseModelMod.IModel
  
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}
