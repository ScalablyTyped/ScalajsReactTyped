package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AcceptInvitationForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForRepo
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddLabels
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddOrUpdateProjectPermissionsInOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddRepoToInstallationForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.BlockUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CodespaceMachinesForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Commits
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateCard
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateComment
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateCommit
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateForIssue
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateOrUpdateOrgSecret
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateReplyForReviewComment
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateSuite
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DeleteArchiveForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DeletePackageForOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DeleteRepoSubscription
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DiffRange
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DisableSelectedOrganizationGithubActionsEnterprise
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Get1039
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Get1295
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetAnalysis
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetConductCode
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetForRepo
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetRestrictionsForOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetTemplate
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetZen
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.ListAlertsForEnterprise
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.RenderRaw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneratedParametersAndResponseTypesMod {
  
  trait RestEndpointMethodTypes extends StObject {
    
    var actions: AddCustomLabelsToSelfHostedRunnerForRepo
    
    var activity: DeleteRepoSubscription
    
    var apps: AddRepoToInstallationForAuthenticatedUser
    
    var billing: GetGithubActionsBillingUser
    
    var checks: CreateSuite
    
    var codeScanning: GetAnalysis
    
    var codesOfConduct: GetConductCode
    
    var codespaces: CodespaceMachinesForAuthenticatedUser
    
    var dependabot: CreateOrUpdateOrgSecret
    
    var dependencyGraph: DiffRange
    
    var emojis: Get1039
    
    var enterpriseAdmin: DisableSelectedOrganizationGithubActionsEnterprise
    
    var gists: CreateComment
    
    var git: CreateCommit
    
    var gitignore: GetTemplate
    
    var interactions: GetRestrictionsForOrg
    
    var issues: AddLabels
    
    var licenses: GetForRepo
    
    var markdown: RenderRaw
    
    var meta: GetZen
    
    var migrations: DeleteArchiveForAuthenticatedUser
    
    var orgs: BlockUser
    
    var packages: DeletePackageForOrg
    
    var projects: CreateCard
    
    var pulls: CreateReplyForReviewComment
    
    var rateLimit: Get1295
    
    var reactions: CreateForIssue
    
    var repos: AcceptInvitationForAuthenticatedUser
    
    var search: Commits
    
    var secretScanning: ListAlertsForEnterprise
    
    var teams: AddOrUpdateProjectPermissionsInOrg
    
    var users: AddEmailForAuthenticatedUser
  }
  object RestEndpointMethodTypes {
    
    inline def apply(
      actions: AddCustomLabelsToSelfHostedRunnerForRepo,
      activity: DeleteRepoSubscription,
      apps: AddRepoToInstallationForAuthenticatedUser,
      billing: GetGithubActionsBillingUser,
      checks: CreateSuite,
      codeScanning: GetAnalysis,
      codesOfConduct: GetConductCode,
      codespaces: CodespaceMachinesForAuthenticatedUser,
      dependabot: CreateOrUpdateOrgSecret,
      dependencyGraph: DiffRange,
      emojis: Get1039,
      enterpriseAdmin: DisableSelectedOrganizationGithubActionsEnterprise,
      gists: CreateComment,
      git: CreateCommit,
      gitignore: GetTemplate,
      interactions: GetRestrictionsForOrg,
      issues: AddLabels,
      licenses: GetForRepo,
      markdown: RenderRaw,
      meta: GetZen,
      migrations: DeleteArchiveForAuthenticatedUser,
      orgs: BlockUser,
      packages: DeletePackageForOrg,
      projects: CreateCard,
      pulls: CreateReplyForReviewComment,
      rateLimit: Get1295,
      reactions: CreateForIssue,
      repos: AcceptInvitationForAuthenticatedUser,
      search: Commits,
      secretScanning: ListAlertsForEnterprise,
      teams: AddOrUpdateProjectPermissionsInOrg,
      users: AddEmailForAuthenticatedUser
    ): RestEndpointMethodTypes = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], codespaces = codespaces.asInstanceOf[js.Any], dependabot = dependabot.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], enterpriseAdmin = enterpriseAdmin.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], secretScanning = secretScanning.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethodTypes]
    }
    
    extension [Self <: RestEndpointMethodTypes](x: Self) {
      
      inline def setActions(value: AddCustomLabelsToSelfHostedRunnerForRepo): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: DeleteRepoSubscription): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallationForAuthenticatedUser): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingUser): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: CreateSuite): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: GetAnalysis): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetConductCode): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setCodespaces(value: CodespaceMachinesForAuthenticatedUser): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
      
      inline def setDependabot(value: CreateOrUpdateOrgSecret): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: DiffRange): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get1039): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEnterpriseAdmin(value: DisableSelectedOrganizationGithubActionsEnterprise): Self = StObject.set(x, "enterpriseAdmin", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CreateComment): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateCommit): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetTemplate): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForOrg): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddLabels): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetForRepo): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: RenderRaw): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: GetZen): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: DeleteArchiveForAuthenticatedUser): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: BlockUser): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForOrg): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: CreateCard): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CreateReplyForReviewComment): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get1295): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForIssue): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitationForAuthenticatedUser): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Commits): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSecretScanning(value: ListAlertsForEnterprise): Self = StObject.set(x, "secretScanning", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateProjectPermissionsInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticatedUser): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
