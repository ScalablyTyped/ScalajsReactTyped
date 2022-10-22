package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AcceptInvitation
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddAssignees
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddCollaborator
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForEnterprise
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddCustomLabelsToSelfHostedRunnerForOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddEmailForAuthenticated
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddOrUpdateMembershipForUserInOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddRepoToInstallation
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddRepositoryForSecretForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddSecurityManagerTeam
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.AddSelectedRepoToOrgSecret
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CancelImport
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CheckIfMerged
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CheckIsStarred
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CheckRepoIsStarredByAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Code
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Create
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateBlob
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateForCommitComment
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.CreateRepositorySnapshot
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DeleteAnalysis
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.DeletePackageForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Get
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Get508
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetAlert
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetAllCodesOfConduct
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetAllCommonlyUsed
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetAllTemplates
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetGithubActionsBillingOrg
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetOctocat
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.GetRestrictionsForAuthenticatedUser
import typingsJapgolly.octokitPluginRestEndpointMethods.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneratedMethodTypesMod {
  
  trait RestEndpointMethods extends StObject {
    
    var actions: AddCustomLabelsToSelfHostedRunnerForOrg
    
    var activity: CheckRepoIsStarredByAuthenticatedUser
    
    var apps: AddRepoToInstallation
    
    var billing: GetGithubActionsBillingOrg
    
    var checks: Create
    
    var codeScanning: DeleteAnalysis
    
    var codesOfConduct: GetAllCodesOfConduct
    
    var codespaces: AddRepositoryForSecretForAuthenticatedUser
    
    var dependabot: AddSelectedRepoToOrgSecret
    
    var dependencyGraph: CreateRepositorySnapshot
    
    var emojis: Get
    
    var enterpriseAdmin: AddCustomLabelsToSelfHostedRunnerForEnterprise
    
    var gists: CheckIsStarred
    
    var git: CreateBlob
    
    var gitignore: GetAllTemplates
    
    var interactions: GetRestrictionsForAuthenticatedUser
    
    var issues: AddAssignees
    
    var licenses: GetAllCommonlyUsed
    
    var markdown: Render
    
    var meta: GetOctocat
    
    var migrations: CancelImport
    
    var orgs: AddSecurityManagerTeam
    
    var packages: DeletePackageForAuthenticatedUser
    
    var projects: AddCollaborator
    
    var pulls: CheckIfMerged
    
    var rateLimit: Get508
    
    var reactions: CreateForCommitComment
    
    var repos: AcceptInvitation
    
    var search: Code
    
    var secretScanning: GetAlert
    
    var teams: AddOrUpdateMembershipForUserInOrg
    
    var users: AddEmailForAuthenticated
  }
  object RestEndpointMethods {
    
    inline def apply(
      actions: AddCustomLabelsToSelfHostedRunnerForOrg,
      activity: CheckRepoIsStarredByAuthenticatedUser,
      apps: AddRepoToInstallation,
      billing: GetGithubActionsBillingOrg,
      checks: Create,
      codeScanning: DeleteAnalysis,
      codesOfConduct: GetAllCodesOfConduct,
      codespaces: AddRepositoryForSecretForAuthenticatedUser,
      dependabot: AddSelectedRepoToOrgSecret,
      dependencyGraph: CreateRepositorySnapshot,
      emojis: Get,
      enterpriseAdmin: AddCustomLabelsToSelfHostedRunnerForEnterprise,
      gists: CheckIsStarred,
      git: CreateBlob,
      gitignore: GetAllTemplates,
      interactions: GetRestrictionsForAuthenticatedUser,
      issues: AddAssignees,
      licenses: GetAllCommonlyUsed,
      markdown: Render,
      meta: GetOctocat,
      migrations: CancelImport,
      orgs: AddSecurityManagerTeam,
      packages: DeletePackageForAuthenticatedUser,
      projects: AddCollaborator,
      pulls: CheckIfMerged,
      rateLimit: Get508,
      reactions: CreateForCommitComment,
      repos: AcceptInvitation,
      search: Code,
      secretScanning: GetAlert,
      teams: AddOrUpdateMembershipForUserInOrg,
      users: AddEmailForAuthenticated
    ): RestEndpointMethods = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], activity = activity.asInstanceOf[js.Any], apps = apps.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], codeScanning = codeScanning.asInstanceOf[js.Any], codesOfConduct = codesOfConduct.asInstanceOf[js.Any], codespaces = codespaces.asInstanceOf[js.Any], dependabot = dependabot.asInstanceOf[js.Any], dependencyGraph = dependencyGraph.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any], enterpriseAdmin = enterpriseAdmin.asInstanceOf[js.Any], gists = gists.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], gitignore = gitignore.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], licenses = licenses.asInstanceOf[js.Any], markdown = markdown.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], migrations = migrations.asInstanceOf[js.Any], orgs = orgs.asInstanceOf[js.Any], packages = packages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], pulls = pulls.asInstanceOf[js.Any], rateLimit = rateLimit.asInstanceOf[js.Any], reactions = reactions.asInstanceOf[js.Any], repos = repos.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], secretScanning = secretScanning.asInstanceOf[js.Any], teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestEndpointMethods]
    }
    
    extension [Self <: RestEndpointMethods](x: Self) {
      
      inline def setActions(value: AddCustomLabelsToSelfHostedRunnerForOrg): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActivity(value: CheckRepoIsStarredByAuthenticatedUser): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      inline def setApps(value: AddRepoToInstallation): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
      
      inline def setBilling(value: GetGithubActionsBillingOrg): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
      
      inline def setChecks(value: Create): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setCodeScanning(value: DeleteAnalysis): Self = StObject.set(x, "codeScanning", value.asInstanceOf[js.Any])
      
      inline def setCodesOfConduct(value: GetAllCodesOfConduct): Self = StObject.set(x, "codesOfConduct", value.asInstanceOf[js.Any])
      
      inline def setCodespaces(value: AddRepositoryForSecretForAuthenticatedUser): Self = StObject.set(x, "codespaces", value.asInstanceOf[js.Any])
      
      inline def setDependabot(value: AddSelectedRepoToOrgSecret): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
      
      inline def setDependencyGraph(value: CreateRepositorySnapshot): Self = StObject.set(x, "dependencyGraph", value.asInstanceOf[js.Any])
      
      inline def setEmojis(value: Get): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEnterpriseAdmin(value: AddCustomLabelsToSelfHostedRunnerForEnterprise): Self = StObject.set(x, "enterpriseAdmin", value.asInstanceOf[js.Any])
      
      inline def setGists(value: CheckIsStarred): Self = StObject.set(x, "gists", value.asInstanceOf[js.Any])
      
      inline def setGit(value: CreateBlob): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitignore(value: GetAllTemplates): Self = StObject.set(x, "gitignore", value.asInstanceOf[js.Any])
      
      inline def setInteractions(value: GetRestrictionsForAuthenticatedUser): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
      
      inline def setIssues(value: AddAssignees): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
      
      inline def setLicenses(value: GetAllCommonlyUsed): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      inline def setMarkdown(value: Render): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: GetOctocat): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMigrations(value: CancelImport): Self = StObject.set(x, "migrations", value.asInstanceOf[js.Any])
      
      inline def setOrgs(value: AddSecurityManagerTeam): Self = StObject.set(x, "orgs", value.asInstanceOf[js.Any])
      
      inline def setPackages(value: DeletePackageForAuthenticatedUser): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setProjects(value: AddCollaborator): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setPulls(value: CheckIfMerged): Self = StObject.set(x, "pulls", value.asInstanceOf[js.Any])
      
      inline def setRateLimit(value: Get508): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
      
      inline def setReactions(value: CreateForCommitComment): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
      
      inline def setRepos(value: AcceptInvitation): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Code): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSecretScanning(value: GetAlert): Self = StObject.set(x, "secretScanning", value.asInstanceOf[js.Any])
      
      inline def setTeams(value: AddOrUpdateMembershipForUserInOrg): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: AddEmailForAuthenticated): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
