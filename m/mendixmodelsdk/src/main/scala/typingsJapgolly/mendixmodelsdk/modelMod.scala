package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.baseModelMod.BaseModel
import typingsJapgolly.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.modelSdkClientImplMod.ModelSdkClientImpl
import typingsJapgolly.mendixmodelsdk.projectsMod.projects.IModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/Model", JSImport.Namespace)
@js.native
object modelMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel because Already inherited
  - typingsJapgolly.mendixmodelsdk.baseModelMod.IBaseModel because Already inherited
  - typingsJapgolly.mendixmodelsdk.baseModelMod.IModel because var conflicts: id, metaModelVersion, mxVersionForModel, root, workingCopy. Inlined findModuleByQualifiedName */ @js.native
  class Model () extends BaseModel {
    var allModelClasses: js.Any = js.native
    /**
      * Given a qualified name, returns a Module.
      */
    def findModuleByQualifiedName(qname: String): IModule | Null = js.native
  }
  
  /* static members */
  @js.native
  object Model extends js.Object {
    def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, Model] = js.native
  }
  
  type IModel = typingsJapgolly.mendixmodelsdk.baseModelMod.IModel
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}

