package typingsJapgolly.awsParamStore

import typingsJapgolly.awsSdk.ssmMod.ClientConfiguration
import typingsJapgolly.awsSdk.ssmMod.GetParametersResult
import typingsJapgolly.awsSdk.ssmMod.PSParameterName
import typingsJapgolly.awsSdk.ssmMod.Parameter
import typingsJapgolly.awsSdk.ssmMod.ParameterList
import typingsJapgolly.awsSdk.ssmMod.ParameterNameList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ParameterQuery_ extends js.Object {
    def decryption(enabled: Boolean): ParameterQuery_ = js.native
    def execute(): js.Promise[ParameterList | Parameter | GetParametersResult] = js.native
    def executeSync(): ParameterList | Parameter | GetParametersResult = js.native
    def named(nameOrNames: PSParameterName): ParameterQuery_ = js.native
    def named(nameOrNames: ParameterNameList): ParameterQuery_ = js.native
    def path(path: PSParameterName): ParameterQuery_ = js.native
    def recursive(enabled: Boolean): ParameterQuery_ = js.native
  }
  
  def getParameter(name: PSParameterName): js.Promise[Parameter] = js.native
  def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = js.native
  def getParameterSync(name: PSParameterName): Parameter = js.native
  def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = js.native
  def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = js.native
  def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = js.native
  def getParametersByPath(path: PSParameterName): js.Promise[ParameterList] = js.native
  def getParametersByPath(path: PSParameterName, options: ClientConfiguration): js.Promise[ParameterList] = js.native
  def getParametersByPathSync(path: PSParameterName): ParameterList = js.native
  def getParametersByPathSync(path: PSParameterName, options: ClientConfiguration): ParameterList = js.native
  def getParametersSync(names: ParameterNameList): GetParametersResult = js.native
  def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = js.native
  def parameterQuery(): ParameterQuery_ = js.native
  def parameterQuery(options: ClientConfiguration): ParameterQuery_ = js.native
}

