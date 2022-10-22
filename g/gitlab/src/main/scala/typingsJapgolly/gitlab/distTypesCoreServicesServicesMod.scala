package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesServicesMod {
  
  @JSImport("gitlab/dist/types/core/services/Services", "Services")
  @js.native
  open class Services () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def edit(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: String, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def edit(projectId: Double, serviceName: SupportedService, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService): js.Promise[js.Object] = js.native
    def remove(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: String, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService): js.Promise[GetResponse] = js.native
    def show(projectId: Double, serviceName: SupportedService, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.gitlab.gitlabStrings.asana
    - typingsJapgolly.gitlab.gitlabStrings.assembla
    - typingsJapgolly.gitlab.gitlabStrings.bamboo
    - typingsJapgolly.gitlab.gitlabStrings.bugzilla
    - typingsJapgolly.gitlab.gitlabStrings.buildkite
    - typingsJapgolly.gitlab.gitlabStrings.campfire
    - typingsJapgolly.gitlab.gitlabStrings.`custom-issue-tracker`
    - typingsJapgolly.gitlab.gitlabStrings.`drone-ci`
    - typingsJapgolly.gitlab.gitlabStrings.`emails-on-push`
    - typingsJapgolly.gitlab.gitlabStrings.`external-wiki`
    - typingsJapgolly.gitlab.gitlabStrings.flowdock
    - typingsJapgolly.gitlab.gitlabStrings.hangouts_chat
    - typingsJapgolly.gitlab.gitlabStrings.hipchat
    - typingsJapgolly.gitlab.gitlabStrings.irker
    - typingsJapgolly.gitlab.gitlabStrings.jira
    - typingsJapgolly.gitlab.gitlabStrings.kubernetes
    - typingsJapgolly.gitlab.gitlabStrings.`slack-slash-commands`
    - typingsJapgolly.gitlab.gitlabStrings.slack
    - typingsJapgolly.gitlab.gitlabStrings.packagist
    - typingsJapgolly.gitlab.gitlabStrings.`pipelines-email`
    - typingsJapgolly.gitlab.gitlabStrings.pivotaltracker
    - typingsJapgolly.gitlab.gitlabStrings.prometheus
    - typingsJapgolly.gitlab.gitlabStrings.pushover
    - typingsJapgolly.gitlab.gitlabStrings.redmine
    - typingsJapgolly.gitlab.gitlabStrings.`microsoft-teams`
    - typingsJapgolly.gitlab.gitlabStrings.mattermost
    - typingsJapgolly.gitlab.gitlabStrings.`mattermost-slash-commands`
    - typingsJapgolly.gitlab.gitlabStrings.teamcity
    - typingsJapgolly.gitlab.gitlabStrings.jenkins
    - typingsJapgolly.gitlab.gitlabStrings.`jenkins-deprecated`
    - typingsJapgolly.gitlab.gitlabStrings.`mock-ci`
  */
  trait SupportedService extends StObject
  object SupportedService {
    
    inline def asana: typingsJapgolly.gitlab.gitlabStrings.asana = "asana".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.asana]
    
    inline def assembla: typingsJapgolly.gitlab.gitlabStrings.assembla = "assembla".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.assembla]
    
    inline def bamboo: typingsJapgolly.gitlab.gitlabStrings.bamboo = "bamboo".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.bamboo]
    
    inline def bugzilla: typingsJapgolly.gitlab.gitlabStrings.bugzilla = "bugzilla".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.bugzilla]
    
    inline def buildkite: typingsJapgolly.gitlab.gitlabStrings.buildkite = "buildkite".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.buildkite]
    
    inline def campfire: typingsJapgolly.gitlab.gitlabStrings.campfire = "campfire".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.campfire]
    
    inline def `custom-issue-tracker`: typingsJapgolly.gitlab.gitlabStrings.`custom-issue-tracker` = "custom-issue-tracker".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`custom-issue-tracker`]
    
    inline def `drone-ci`: typingsJapgolly.gitlab.gitlabStrings.`drone-ci` = "drone-ci".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`drone-ci`]
    
    inline def `emails-on-push`: typingsJapgolly.gitlab.gitlabStrings.`emails-on-push` = "emails-on-push".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`emails-on-push`]
    
    inline def `external-wiki`: typingsJapgolly.gitlab.gitlabStrings.`external-wiki` = "external-wiki".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`external-wiki`]
    
    inline def flowdock: typingsJapgolly.gitlab.gitlabStrings.flowdock = "flowdock".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.flowdock]
    
    inline def hangouts_chat: typingsJapgolly.gitlab.gitlabStrings.hangouts_chat = "hangouts_chat".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.hangouts_chat]
    
    inline def hipchat: typingsJapgolly.gitlab.gitlabStrings.hipchat = "hipchat".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.hipchat]
    
    inline def irker: typingsJapgolly.gitlab.gitlabStrings.irker = "irker".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.irker]
    
    inline def jenkins: typingsJapgolly.gitlab.gitlabStrings.jenkins = "jenkins".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.jenkins]
    
    inline def `jenkins-deprecated`: typingsJapgolly.gitlab.gitlabStrings.`jenkins-deprecated` = "jenkins-deprecated".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`jenkins-deprecated`]
    
    inline def jira: typingsJapgolly.gitlab.gitlabStrings.jira = "jira".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.jira]
    
    inline def kubernetes: typingsJapgolly.gitlab.gitlabStrings.kubernetes = "kubernetes".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.kubernetes]
    
    inline def mattermost: typingsJapgolly.gitlab.gitlabStrings.mattermost = "mattermost".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.mattermost]
    
    inline def `mattermost-slash-commands`: typingsJapgolly.gitlab.gitlabStrings.`mattermost-slash-commands` = "mattermost-slash-commands".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`mattermost-slash-commands`]
    
    inline def `microsoft-teams`: typingsJapgolly.gitlab.gitlabStrings.`microsoft-teams` = "microsoft-teams".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`microsoft-teams`]
    
    inline def `mock-ci`: typingsJapgolly.gitlab.gitlabStrings.`mock-ci` = "mock-ci".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`mock-ci`]
    
    inline def packagist: typingsJapgolly.gitlab.gitlabStrings.packagist = "packagist".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.packagist]
    
    inline def `pipelines-email`: typingsJapgolly.gitlab.gitlabStrings.`pipelines-email` = "pipelines-email".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`pipelines-email`]
    
    inline def pivotaltracker: typingsJapgolly.gitlab.gitlabStrings.pivotaltracker = "pivotaltracker".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.pivotaltracker]
    
    inline def prometheus: typingsJapgolly.gitlab.gitlabStrings.prometheus = "prometheus".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.prometheus]
    
    inline def pushover: typingsJapgolly.gitlab.gitlabStrings.pushover = "pushover".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.pushover]
    
    inline def redmine: typingsJapgolly.gitlab.gitlabStrings.redmine = "redmine".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.redmine]
    
    inline def slack: typingsJapgolly.gitlab.gitlabStrings.slack = "slack".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.slack]
    
    inline def `slack-slash-commands`: typingsJapgolly.gitlab.gitlabStrings.`slack-slash-commands` = "slack-slash-commands".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.`slack-slash-commands`]
    
    inline def teamcity: typingsJapgolly.gitlab.gitlabStrings.teamcity = "teamcity".asInstanceOf[typingsJapgolly.gitlab.gitlabStrings.teamcity]
  }
}
