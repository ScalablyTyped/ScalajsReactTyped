package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsCancelWorkflowRunParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsCreateOrUpdateSecretForRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsCreateRegistrationTokenParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsCreateRemoveTokenParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsDeleteArtifactParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsDeleteSecretFromRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsDownloadArtifactParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetArtifactParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetPublicKeyParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetSecretParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetSelfHostedRunnerParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetWorkflowJobParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetWorkflowParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsGetWorkflowRunParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListDownloadsForSelfHostedRunnerApplicationParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListJobsForWorkflowRunParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListRepoWorkflowRunsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListRepoWorkflowsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListSecretsForRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListSelfHostedRunnersForRepoParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListWorkflowJobLogsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListWorkflowRunArtifactsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListWorkflowRunLogsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsListWorkflowRunsParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsReRunWorkflowParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.ActionsRemoveSelfHostedRunnerParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateOrUpdateSecretForRepo extends js.Object {
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: AnonCall = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  @JSName("createOrUpdateSecretForRepo")
  var createOrUpdateSecretForRepo_Original: AnonEndpoint = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  @JSName("createRegistrationToken")
  var createRegistrationToken_Original: AnonCallEndpoint = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  @JSName("createRemoveToken")
  var createRemoveToken_Original: AnonCallParams = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: AnonEndpointAny = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("deleteSecretFromRepo")
  var deleteSecretFromRepo_Original: AnonCallParamsEndpointAny = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: Anon0 = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: Anon1 = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: Anon2 = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getSecret")
  var getSecret_Original: Anon3 = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("getSelfHostedRunner")
  var getSelfHostedRunner_Original: Anon4 = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowJob")
  var getWorkflowJob_Original: Anon6 = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: Anon7 = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: Anon5 = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listDownloadsForSelfHostedRunnerApplication")
  var listDownloadsForSelfHostedRunnerApplication_Original: Anon8 = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: Anon9 = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflowRuns")
  var listRepoWorkflowRuns_Original: Anon10 = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: Anon11 = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("listSecretsForRepo")
  var listSecretsForRepo_Original: Anon12 = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: Anon13 = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowJobLogs")
  var listWorkflowJobLogs_Original: Anon14 = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: Anon15 = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowRunLogs")
  var listWorkflowRunLogs_Original: Anon16 = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: Anon17 = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: Anon18 = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("removeSelfHostedRunner")
  var removeSelfHostedRunner_Original: Anon19 = js.native
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[AnyResponse] = js.native
  def cancelWorkflowRun(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsCancelWorkflowRunParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  def createOrUpdateSecretForRepo(): js.Promise[AnyResponse] = js.native
  def createOrUpdateSecretForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsCreateOrUpdateSecretForRepoParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  def createRegistrationToken(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsCreateRegistrationTokenResponse> */ _
  ] = js.native
  def createRegistrationToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsCreateRegistrationTokenParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsCreateRegistrationTokenResponse> */ _
  ] = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  def createRemoveToken(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsCreateRemoveTokenResponse> */ _
  ] = js.native
  def createRemoveToken(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsCreateRemoveTokenParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsCreateRemoveTokenResponse> */ _
  ] = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[AnyResponse] = js.native
  def deleteArtifact(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsDeleteArtifactParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def deleteSecretFromRepo(): js.Promise[AnyResponse] = js.native
  def deleteSecretFromRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsDeleteSecretFromRepoParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadArtifact(): js.Promise[AnyResponse] = js.native
  def downloadArtifact(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsDownloadArtifactParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetArtifactResponse> */ _
  ] = js.native
  def getArtifact(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetArtifactParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetArtifactResponse> */ _
  ] = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getPublicKey(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetPublicKeyResponse> */ _
  ] = js.native
  def getPublicKey(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetPublicKeyParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetPublicKeyResponse> */ _
  ] = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getSecret(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetSecretResponse> */ _
  ] = js.native
  def getSecret(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetSecretParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetSecretResponse> */ _
  ] = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def getSelfHostedRunner(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetSelfHostedRunnerResponse> */ _
  ] = js.native
  def getSelfHostedRunner(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetSelfHostedRunnerParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetSelfHostedRunnerResponse> */ _
  ] = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowResponse> */ _
  ] = js.native
  def getWorkflow(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetWorkflowParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowResponse> */ _
  ] = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowJob(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowJobResponse> */ _
  ] = js.native
  def getWorkflowJob(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetWorkflowJobParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowJobResponse> */ _
  ] = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowRunResponse> */ _
  ] = js.native
  def getWorkflowRun(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsGetWorkflowRunParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsGetWorkflowRunResponse> */ _
  ] = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listDownloadsForSelfHostedRunnerApplication(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListDownloadsForSelfHostedRunnerApplicationResponse> */ _
  ] = js.native
  def listDownloadsForSelfHostedRunnerApplication(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListDownloadsForSelfHostedRunnerApplicationParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListDownloadsForSelfHostedRunnerApplicationResponse> */ _
  ] = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listJobsForWorkflowRun(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListJobsForWorkflowRunResponse> */ _
  ] = js.native
  def listJobsForWorkflowRun(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListJobsForWorkflowRunParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListJobsForWorkflowRunResponse> */ _
  ] = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflowRuns(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListRepoWorkflowRunsResponse> */ _
  ] = js.native
  def listRepoWorkflowRuns(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListRepoWorkflowRunsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListRepoWorkflowRunsResponse> */ _
  ] = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListRepoWorkflowsResponse> */ _
  ] = js.native
  def listRepoWorkflows(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListRepoWorkflowsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListRepoWorkflowsResponse> */ _
  ] = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def listSecretsForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListSecretsForRepoResponse> */ _
  ] = js.native
  def listSecretsForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListSecretsForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListSecretsForRepoResponse> */ _
  ] = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListSelfHostedRunnersForRepoResponse> */ _
  ] = js.native
  def listSelfHostedRunnersForRepo(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListSelfHostedRunnersForRepoParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListSelfHostedRunnersForRepoResponse> */ _
  ] = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowJobLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowJobLogs(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListWorkflowJobLogsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListWorkflowRunArtifactsResponse> */ _
  ] = js.native
  def listWorkflowRunArtifacts(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListWorkflowRunArtifactsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListWorkflowRunArtifactsResponse> */ _
  ] = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowRunLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowRunLogs(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListWorkflowRunLogsParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  def listWorkflowRuns(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListWorkflowRunsResponse> */ _
  ] = js.native
  def listWorkflowRuns(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsListWorkflowRunsParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<ActionsListWorkflowRunsResponse> */ _
  ] = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[AnyResponse] = js.native
  def reRunWorkflow(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsReRunWorkflowParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def removeSelfHostedRunner(): js.Promise[AnyResponse] = js.native
  def removeSelfHostedRunner(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with ActionsRemoveSelfHostedRunnerParams
  ): js.Promise[AnyResponse] = js.native
}

