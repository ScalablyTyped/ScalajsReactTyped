package typingsJapgolly.snyk

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacMetaMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/meta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildMeta(repositoryFinder: GitRepositoryFinder, orgSettings: IacOrgSettings, projectRoot: String): js.Promise[IacOutputMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMeta")(repositoryFinder.asInstanceOf[js.Any], orgSettings.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IacOutputMeta]]
  inline def buildMeta(
    repositoryFinder: GitRepositoryFinder,
    orgSettings: IacOrgSettings,
    projectRoot: String,
    remoteRepoUrl: String
  ): js.Promise[IacOutputMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMeta")(repositoryFinder.asInstanceOf[js.Any], orgSettings.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], remoteRepoUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IacOutputMeta]]
  inline def buildMeta(
    repositoryFinder: GitRepositoryFinder,
    orgSettings: IacOrgSettings,
    projectRoot: String,
    remoteRepoUrl: String,
    targetName: String
  ): js.Promise[IacOutputMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMeta")(repositoryFinder.asInstanceOf[js.Any], orgSettings.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], remoteRepoUrl.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IacOutputMeta]]
  inline def buildMeta(
    repositoryFinder: GitRepositoryFinder,
    orgSettings: IacOrgSettings,
    projectRoot: String,
    remoteRepoUrl: Unit,
    targetName: String
  ): js.Promise[IacOutputMeta] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMeta")(repositoryFinder.asInstanceOf[js.Any], orgSettings.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], remoteRepoUrl.asInstanceOf[js.Any], targetName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IacOutputMeta]]
  
  inline def getProjectNameFromGitUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectNameFromGitUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GitRepository extends StObject {
    
    val path: String
    
    def readRemoteUrl(): js.Promise[js.UndefOr[String]]
  }
  object GitRepository {
    
    inline def apply(path: String, readRemoteUrl: CallbackTo[js.Promise[js.UndefOr[String]]]): GitRepository = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], readRemoteUrl = readRemoteUrl.toJsFn)
      __obj.asInstanceOf[GitRepository]
    }
    
    extension [Self <: GitRepository](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setReadRemoteUrl(value: CallbackTo[js.Promise[js.UndefOr[String]]]): Self = StObject.set(x, "readRemoteUrl", value.toJsFn)
    }
  }
  
  trait GitRepositoryFinder extends StObject {
    
    def findRepositoryForPath(path: String): js.Promise[js.UndefOr[GitRepository]]
  }
  object GitRepositoryFinder {
    
    inline def apply(findRepositoryForPath: String => js.Promise[js.UndefOr[GitRepository]]): GitRepositoryFinder = {
      val __obj = js.Dynamic.literal(findRepositoryForPath = js.Any.fromFunction1(findRepositoryForPath))
      __obj.asInstanceOf[GitRepositoryFinder]
    }
    
    extension [Self <: GitRepositoryFinder](x: Self) {
      
      inline def setFindRepositoryForPath(value: String => js.Promise[js.UndefOr[GitRepository]]): Self = StObject.set(x, "findRepositoryForPath", js.Any.fromFunction1(value))
    }
  }
}
