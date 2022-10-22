package typingsJapgolly.awsParamStore

import typingsJapgolly.awsSdk.clientsSsmMod.ClientConfiguration
import typingsJapgolly.awsSdk.clientsSsmMod.GetParametersResult
import typingsJapgolly.awsSdk.clientsSsmMod.PSParameterName
import typingsJapgolly.awsSdk.clientsSsmMod.Parameter
import typingsJapgolly.awsSdk.clientsSsmMod.ParameterList
import typingsJapgolly.awsSdk.clientsSsmMod.ParameterNameList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-param-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getParameter(name: PSParameterName): js.Promise[Parameter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Parameter]]
  inline def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Parameter]]
  
  inline def getParameterSync(name: PSParameterName): Parameter = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameterSync")(name.asInstanceOf[js.Any]).asInstanceOf[Parameter]
  inline def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameterSync")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Parameter]
  
  inline def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameters")(names.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetParametersResult]]
  inline def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameters")(names.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetParametersResult]]
  
  inline def getParametersByPath(path: PSParameterName): js.Promise[ParameterList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParametersByPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParameterList]]
  inline def getParametersByPath(path: PSParameterName, options: ClientConfiguration): js.Promise[ParameterList] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersByPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParameterList]]
  
  inline def getParametersByPathSync(path: PSParameterName): ParameterList = ^.asInstanceOf[js.Dynamic].applyDynamic("getParametersByPathSync")(path.asInstanceOf[js.Any]).asInstanceOf[ParameterList]
  inline def getParametersByPathSync(path: PSParameterName, options: ClientConfiguration): ParameterList = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersByPathSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParameterList]
  
  inline def getParametersSync(names: ParameterNameList): GetParametersResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getParametersSync")(names.asInstanceOf[js.Any]).asInstanceOf[GetParametersResult]
  inline def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersSync")(names.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetParametersResult]
  
  inline def parameterQuery(): ParameterQuery_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parameterQuery")().asInstanceOf[ParameterQuery_]
  inline def parameterQuery(options: ClientConfiguration): ParameterQuery_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parameterQuery")(options.asInstanceOf[js.Any]).asInstanceOf[ParameterQuery_]
  
  @js.native
  trait ParameterQuery_ extends StObject {
    
    def decryption(enabled: Boolean): ParameterQuery_ = js.native
    
    def execute(): js.Promise[ParameterList | Parameter | GetParametersResult] = js.native
    
    def executeSync(): ParameterList | Parameter | GetParametersResult = js.native
    
    def named(nameOrNames: PSParameterName): ParameterQuery_ = js.native
    def named(nameOrNames: ParameterNameList): ParameterQuery_ = js.native
    
    def path(path: PSParameterName): ParameterQuery_ = js.native
    
    def recursive(enabled: Boolean): ParameterQuery_ = js.native
  }
}
