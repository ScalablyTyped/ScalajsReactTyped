package typingsJapgolly.gitlab

import typingsJapgolly.gitlab.anon.PaginatedRequestOptions
import typingsJapgolly.gitlab.anon.groupIdstringnumberPagina
import typingsJapgolly.gitlab.anon.mergerequestIIdnumberunde
import typingsJapgolly.gitlab.anon.projectIdstringnumberPagi
import typingsJapgolly.gitlab.anon.shastringundefinedBaseReq
import typingsJapgolly.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureMod.BaseService
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typingsJapgolly.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typingsJapgolly.gitlab.gitlabBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesMergeRequestsMod {
  
  @JSImport("gitlab/dist/types/core/services/MergeRequests", "MergeRequests")
  @js.native
  open class MergeRequests () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def accept(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def accept(
      projectId: String,
      mergerequestIId: Double,
      options: AcceptMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def accept(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def accept(
      projectId: Double,
      mergerequestIId: Double,
      options: AcceptMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def addSpentTime(projectId: String, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: String, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: Double, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def addTimeEstimate(projectId: String, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: String, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: Double, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(hasProjectIdGroupIdOptions: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: groupIdstringnumberPagina): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: projectIdstringnumberPagi): js.Promise[GetResponse] = js.native
    
    def approvalState(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def approvalState(projectId: String, mergerequestIId: Double, options: shastringundefinedBaseReq): js.Promise[GetResponse] = js.native
    def approvalState(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def approvalState(projectId: Double, mergerequestIId: Double, options: shastringundefinedBaseReq): js.Promise[GetResponse] = js.native
    
    def approvals(projectId: String): js.Promise[GetResponse] = js.native
    def approvals(projectId: String, hasMergerequestIIdOptions: mergerequestIIdnumberunde): js.Promise[GetResponse] = js.native
    def approvals(projectId: Double): js.Promise[GetResponse] = js.native
    def approvals(projectId: Double, hasMergerequestIIdOptions: mergerequestIIdnumberunde): js.Promise[GetResponse] = js.native
    
    def approve(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def approve(projectId: String, mergerequestIId: Double, options: shastringundefinedBaseReq): js.Promise[js.Object] = js.native
    def approve(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def approve(projectId: Double, mergerequestIId: Double, options: shastringundefinedBaseReq): js.Promise[js.Object] = js.native
    
    def approvers(projectId: String, approverIds: js.Array[Double], approverGroupIds: js.Array[String | Double]): js.Promise[js.Object] = js.native
    def approvers(
      projectId: String,
      approverIds: js.Array[Double],
      approverGroupIds: js.Array[String | Double],
      hasMergerequestIIdOptions: mergerequestIIdnumberunde
    ): js.Promise[js.Object] = js.native
    def approvers(projectId: Double, approverIds: js.Array[Double], approverGroupIds: js.Array[String | Double]): js.Promise[js.Object] = js.native
    def approvers(
      projectId: Double,
      approverIds: js.Array[Double],
      approverGroupIds: js.Array[String | Double],
      hasMergerequestIIdOptions: mergerequestIIdnumberunde
    ): js.Promise[js.Object] = js.native
    
    def cancelOnPipelineSucess(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def cancelOnPipelineSucess(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def cancelOnPipelineSucess(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def cancelOnPipelineSucess(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def changes(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def changes(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def changes(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def changes(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def closesIssues(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def closesIssues(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def closesIssues(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def closesIssues(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def commits(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def commits(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def commits(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def commits(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, sourceBranch: String, targetBranch: String, title: String): js.Promise[js.Object] = js.native
    def create(
      projectId: String,
      sourceBranch: String,
      targetBranch: String,
      title: String,
      options: CreateMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: Double, sourceBranch: String, targetBranch: String, title: String): js.Promise[js.Object] = js.native
    def create(
      projectId: Double,
      sourceBranch: String,
      targetBranch: String,
      title: String,
      options: CreateMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def edit(
      projectId: String,
      mergerequestIId: Double,
      options: UpdateMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def edit(
      projectId: Double,
      mergerequestIId: Double,
      options: UpdateMergeRequestOptions & BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def editApprovals(projectId: String): js.Promise[js.Object] = js.native
    def editApprovals(projectId: String, hasMergerequestIIdOptions: mergerequestIIdnumberunde): js.Promise[js.Object] = js.native
    def editApprovals(projectId: Double): js.Promise[js.Object] = js.native
    def editApprovals(projectId: Double, hasMergerequestIIdOptions: mergerequestIIdnumberunde): js.Promise[js.Object] = js.native
    
    def participants(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def participants(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def pipelines(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def pipelines(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def pipelines(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def pipelines(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def remove(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def resetSpentTime(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def resetTimeEstimate(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, mergerequestIId: Double, options: ShowMergeRequestOptions & BaseRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, mergerequestIId: Double, options: ShowMergeRequestOptions & BaseRequestOptions): js.Promise[GetResponse] = js.native
    
    def timeStats(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def timeStats(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def unapprove(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def unapprove(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unapprove(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def unapprove(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def unsubscribe(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def version(projectId: String, mergerequestIId: Double, versionId: Double): js.Promise[GetResponse] = js.native
    def version(projectId: String, mergerequestIId: Double, versionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def version(projectId: Double, mergerequestIId: Double, versionId: Double): js.Promise[GetResponse] = js.native
    def version(projectId: Double, mergerequestIId: Double, versionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def versions(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def versions(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def versions(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
    def versions(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  trait AcceptMergeRequestOptions extends StObject {
    
    var merge_commit_message: js.UndefOr[String] = js.undefined
    
    var merge_when_pipeline_succeeds: js.UndefOr[Boolean] = js.undefined
    
    var sha: js.UndefOr[String] = js.undefined
    
    var should_remove_source_branch: js.UndefOr[Boolean] = js.undefined
    
    var squash: js.UndefOr[Boolean] = js.undefined
    
    var squash_commit_message: js.UndefOr[String] = js.undefined
  }
  object AcceptMergeRequestOptions {
    
    inline def apply(): AcceptMergeRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptMergeRequestOptions]
    }
    
    extension [Self <: AcceptMergeRequestOptions](x: Self) {
      
      inline def setMerge_commit_message(value: String): Self = StObject.set(x, "merge_commit_message", value.asInstanceOf[js.Any])
      
      inline def setMerge_commit_messageUndefined: Self = StObject.set(x, "merge_commit_message", js.undefined)
      
      inline def setMerge_when_pipeline_succeeds(value: Boolean): Self = StObject.set(x, "merge_when_pipeline_succeeds", value.asInstanceOf[js.Any])
      
      inline def setMerge_when_pipeline_succeedsUndefined: Self = StObject.set(x, "merge_when_pipeline_succeeds", js.undefined)
      
      inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
      
      inline def setShould_remove_source_branch(value: Boolean): Self = StObject.set(x, "should_remove_source_branch", value.asInstanceOf[js.Any])
      
      inline def setShould_remove_source_branchUndefined: Self = StObject.set(x, "should_remove_source_branch", js.undefined)
      
      inline def setSquash(value: Boolean): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      inline def setSquash_commit_message(value: String): Self = StObject.set(x, "squash_commit_message", value.asInstanceOf[js.Any])
      
      inline def setSquash_commit_messageUndefined: Self = StObject.set(x, "squash_commit_message", js.undefined)
    }
  }
  
  trait CreateMergeRequestOptions extends StObject {
    
    var allow_collaboration: js.UndefOr[Boolean] = js.undefined
    
    var allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined
    
    var assignee_id: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var labels: js.UndefOr[String] = js.undefined
    
    var milestone_id: js.UndefOr[Double] = js.undefined
    
    var remove_source_branch: js.UndefOr[Boolean] = js.undefined
    
    var squash: js.UndefOr[Boolean] = js.undefined
    
    var target_project_id: js.UndefOr[Double] = js.undefined
  }
  object CreateMergeRequestOptions {
    
    inline def apply(): CreateMergeRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMergeRequestOptions]
    }
    
    extension [Self <: CreateMergeRequestOptions](x: Self) {
      
      inline def setAllow_collaboration(value: Boolean): Self = StObject.set(x, "allow_collaboration", value.asInstanceOf[js.Any])
      
      inline def setAllow_collaborationUndefined: Self = StObject.set(x, "allow_collaboration", js.undefined)
      
      inline def setAllow_maintainer_to_push(value: Boolean): Self = StObject.set(x, "allow_maintainer_to_push", value.asInstanceOf[js.Any])
      
      inline def setAllow_maintainer_to_pushUndefined: Self = StObject.set(x, "allow_maintainer_to_push", js.undefined)
      
      inline def setAssignee_id(value: Double): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
      
      inline def setAssignee_idUndefined: Self = StObject.set(x, "assignee_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMilestone_id(value: Double): Self = StObject.set(x, "milestone_id", value.asInstanceOf[js.Any])
      
      inline def setMilestone_idUndefined: Self = StObject.set(x, "milestone_id", js.undefined)
      
      inline def setRemove_source_branch(value: Boolean): Self = StObject.set(x, "remove_source_branch", value.asInstanceOf[js.Any])
      
      inline def setRemove_source_branchUndefined: Self = StObject.set(x, "remove_source_branch", js.undefined)
      
      inline def setSquash(value: Boolean): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      inline def setTarget_project_id(value: Double): Self = StObject.set(x, "target_project_id", value.asInstanceOf[js.Any])
      
      inline def setTarget_project_idUndefined: Self = StObject.set(x, "target_project_id", js.undefined)
    }
  }
  
  trait ShowMergeRequestOptions extends StObject {
    
    var include_diverged_commits_count: js.UndefOr[`true`] = js.undefined
    
    var include_rebase_in_progress: js.UndefOr[Boolean] = js.undefined
    
    var render_html: js.UndefOr[Boolean] = js.undefined
  }
  object ShowMergeRequestOptions {
    
    inline def apply(): ShowMergeRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowMergeRequestOptions]
    }
    
    extension [Self <: ShowMergeRequestOptions](x: Self) {
      
      inline def setInclude_diverged_commits_count(value: `true`): Self = StObject.set(x, "include_diverged_commits_count", value.asInstanceOf[js.Any])
      
      inline def setInclude_diverged_commits_countUndefined: Self = StObject.set(x, "include_diverged_commits_count", js.undefined)
      
      inline def setInclude_rebase_in_progress(value: Boolean): Self = StObject.set(x, "include_rebase_in_progress", value.asInstanceOf[js.Any])
      
      inline def setInclude_rebase_in_progressUndefined: Self = StObject.set(x, "include_rebase_in_progress", js.undefined)
      
      inline def setRender_html(value: Boolean): Self = StObject.set(x, "render_html", value.asInstanceOf[js.Any])
      
      inline def setRender_htmlUndefined: Self = StObject.set(x, "render_html", js.undefined)
    }
  }
  
  trait UpdateMergeRequestOptions extends StObject {
    
    var allow_collaboration: js.UndefOr[Boolean] = js.undefined
    
    var allow_maintainer_to_push: js.UndefOr[Boolean] = js.undefined
    
    var assignee_id: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var discussion_locked: js.UndefOr[Boolean] = js.undefined
    
    var labels: js.UndefOr[String] = js.undefined
    
    var milestone_id: js.UndefOr[Double] = js.undefined
    
    var remove_source_branch: js.UndefOr[Boolean] = js.undefined
    
    var squash: js.UndefOr[Boolean] = js.undefined
    
    var state_event: js.UndefOr[String] = js.undefined
    
    var target_branch: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object UpdateMergeRequestOptions {
    
    inline def apply(): UpdateMergeRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMergeRequestOptions]
    }
    
    extension [Self <: UpdateMergeRequestOptions](x: Self) {
      
      inline def setAllow_collaboration(value: Boolean): Self = StObject.set(x, "allow_collaboration", value.asInstanceOf[js.Any])
      
      inline def setAllow_collaborationUndefined: Self = StObject.set(x, "allow_collaboration", js.undefined)
      
      inline def setAllow_maintainer_to_push(value: Boolean): Self = StObject.set(x, "allow_maintainer_to_push", value.asInstanceOf[js.Any])
      
      inline def setAllow_maintainer_to_pushUndefined: Self = StObject.set(x, "allow_maintainer_to_push", js.undefined)
      
      inline def setAssignee_id(value: Double): Self = StObject.set(x, "assignee_id", value.asInstanceOf[js.Any])
      
      inline def setAssignee_idUndefined: Self = StObject.set(x, "assignee_id", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDiscussion_locked(value: Boolean): Self = StObject.set(x, "discussion_locked", value.asInstanceOf[js.Any])
      
      inline def setDiscussion_lockedUndefined: Self = StObject.set(x, "discussion_locked", js.undefined)
      
      inline def setLabels(value: String): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMilestone_id(value: Double): Self = StObject.set(x, "milestone_id", value.asInstanceOf[js.Any])
      
      inline def setMilestone_idUndefined: Self = StObject.set(x, "milestone_id", js.undefined)
      
      inline def setRemove_source_branch(value: Boolean): Self = StObject.set(x, "remove_source_branch", value.asInstanceOf[js.Any])
      
      inline def setRemove_source_branchUndefined: Self = StObject.set(x, "remove_source_branch", js.undefined)
      
      inline def setSquash(value: Boolean): Self = StObject.set(x, "squash", value.asInstanceOf[js.Any])
      
      inline def setSquashUndefined: Self = StObject.set(x, "squash", js.undefined)
      
      inline def setState_event(value: String): Self = StObject.set(x, "state_event", value.asInstanceOf[js.Any])
      
      inline def setState_eventUndefined: Self = StObject.set(x, "state_event", js.undefined)
      
      inline def setTarget_branch(value: Double): Self = StObject.set(x, "target_branch", value.asInstanceOf[js.Any])
      
      inline def setTarget_branchUndefined: Self = StObject.set(x, "target_branch", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
