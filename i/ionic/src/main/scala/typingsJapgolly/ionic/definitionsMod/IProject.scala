package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.anon.RequiredProjectIntegratio
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libGenerateMod.GenerateRunner
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionicCliFramework.definitionsMod.PackageJson
import typingsJapgolly.ionicCliFramework.mod.BaseConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProject extends StObject {
  
  val config: BaseConfig[IProjectConfig] = js.native
  
  def createIntegration(name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  
  val details: ProjectDetailsResult = js.native
  
  def detected(): js.Promise[Boolean] = js.native
  
  val directory: String = js.native
  
  val filePath: String = js.native
  
  def getBuildRunner(): js.Promise[js.UndefOr[BuildRunner[Any]]] = js.native
  
  def getDistDir(): js.Promise[String] = js.native
  
  def getDocsUrl(): js.Promise[String] = js.native
  
  def getGenerateRunner(): js.Promise[js.UndefOr[GenerateRunner[Any]]] = js.native
  
  def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  
  def getIntegration(name: IntegrationName): js.UndefOr[RequiredProjectIntegratio] = js.native
  
  def getPackageJson(): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  def getPackageJson(pkgName: String): js.Promise[js.Tuple2[js.UndefOr[PackageJson], js.UndefOr[String]]] = js.native
  
  def getServeRunner(): js.Promise[js.UndefOr[ServeRunner[Any]]] = js.native
  
  def getSourceDir(): js.Promise[String] = js.native
  def getSourceDir(sourceRoot: String): js.Promise[String] = js.native
  
  val pathPrefix: js.Array[String] = js.native
  
  def personalize(details: ProjectPersonalizationDetails): js.Promise[Unit] = js.native
  
  def registerAilments(registry: IAilmentRegistry): js.Promise[Unit] = js.native
  
  def requireAppflowId(): js.Promise[String] = js.native
  
  def requireBuildRunner(): js.Promise[BuildRunner[Any]] = js.native
  
  def requireGenerateRunner(): js.Promise[GenerateRunner[Any]] = js.native
  
  def requireIntegration(name: IntegrationName): RequiredProjectIntegratio = js.native
  
  def requirePackageJson(): js.Promise[PackageJson] = js.native
  def requirePackageJson(pkgName: String): js.Promise[PackageJson] = js.native
  
  def requireServeRunner(): js.Promise[ServeRunner[Any]] = js.native
  
  val rootDirectory: String = js.native
  
  val `type`: ProjectType = js.native
}
