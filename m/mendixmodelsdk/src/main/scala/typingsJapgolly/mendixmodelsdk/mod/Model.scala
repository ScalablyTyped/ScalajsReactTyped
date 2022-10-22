package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcCommonMod.common.IErrorCallback
import typingsJapgolly.mendixmodelsdk.srcModelMod.IModel
import typingsJapgolly.mendixmodelsdk.srcModelSdkClientImplMod.ModelSdkClientImpl
import typingsJapgolly.mendixmodelsdk.srcSdkConfigurationMod.configuration.ISdkConfig
import typingsJapgolly.mendixmodelsdk.srcSdkInternalImodelserverclientMod.IModelServerClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "Model")
@js.native
open class Model protected ()
  extends typingsJapgolly.mendixmodelsdk.srcModelMod.Model {
  def this(_client: IModelServerClient, _errorHandler: IErrorCallback) = this()
}
/* static members */
object Model {
  
  @JSImport("mendixmodelsdk", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSdkClient(connectionConfig: ISdkConfig): ModelSdkClientImpl[IModel, typingsJapgolly.mendixmodelsdk.srcModelMod.Model] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSdkClient")(connectionConfig.asInstanceOf[js.Any]).asInstanceOf[ModelSdkClientImpl[IModel, typingsJapgolly.mendixmodelsdk.srcModelMod.Model]]
}
