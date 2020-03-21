package typingsJapgolly.cassandraDriver.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.AnonAddressResolution
import typingsJapgolly.cassandraDriver.AnonCoalescingThreshold
import typingsJapgolly.cassandraDriver.AnonCopyBuffer
import typingsJapgolly.cassandraDriver.AnonCoreConnectionsPerHost
import typingsJapgolly.cassandraDriver.AnonEnabled
import typingsJapgolly.cassandraDriver.AnonMaxSchemaAgreementWaitSeconds
import typingsJapgolly.cassandraDriver.AnonPassword
import typingsJapgolly.cassandraDriver.AnonSecureConnectBundle
import typingsJapgolly.cassandraDriver.authMod.auth.AuthProvider
import typingsJapgolly.cassandraDriver.metricsMod.metrics.ClientMetrics
import typingsJapgolly.cassandraDriver.trackerMod.tracker.RequestTracker
import typingsJapgolly.cassandraDriver.typesMod.types.Uuid
import typingsJapgolly.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DseClientOptions extends ClientOptions {
  var applicationName: js.UndefOr[String] = js.undefined
  var applicationVersion: js.UndefOr[String] = js.undefined
  var graphOptions: js.UndefOr[GraphOptions] = js.undefined
  var id: js.UndefOr[Uuid] = js.undefined
  var monitorReporting: js.UndefOr[AnonEnabled] = js.undefined
}

object DseClientOptions {
  @scala.inline
  def apply(
    applicationName: String = null,
    applicationVersion: String = null,
    authProvider: AuthProvider = null,
    cloud: AnonSecureConnectBundle = null,
    contactPoints: js.Array[String] = null,
    credentials: AnonPassword = null,
    encoding: AnonCopyBuffer = null,
    graphOptions: GraphOptions = null,
    id: Uuid = null,
    isMetadataSyncEnabled: js.UndefOr[Boolean] = js.undefined,
    keyspace: String = null,
    localDataCenter: String = null,
    maxPrepared: Int | Double = null,
    metrics: ClientMetrics = null,
    monitorReporting: AnonEnabled = null,
    policies: AnonAddressResolution = null,
    pooling: AnonCoreConnectionsPerHost = null,
    prepareOnAllHosts: js.UndefOr[Boolean] = js.undefined,
    profiles: js.Array[ExecutionProfile] = null,
    promiseFactory: /* handler */ js.Function1[
      /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[js.Any], Unit], 
      Unit
    ] => CallbackTo[js.Promise[js.Any]] = null,
    protocolOptions: AnonMaxSchemaAgreementWaitSeconds = null,
    queryOptions: QueryOptions = null,
    rePrepareOnUp: js.UndefOr[Boolean] = js.undefined,
    refreshSchemaDelay: Int | Double = null,
    requestTracker: RequestTracker = null,
    socketOptions: AnonCoalescingThreshold = null,
    sslOptions: ConnectionOptions = null
  ): DseClientOptions = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    if (authProvider != null) __obj.updateDynamic("authProvider")(authProvider.asInstanceOf[js.Any])
    if (cloud != null) __obj.updateDynamic("cloud")(cloud.asInstanceOf[js.Any])
    if (contactPoints != null) __obj.updateDynamic("contactPoints")(contactPoints.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (graphOptions != null) __obj.updateDynamic("graphOptions")(graphOptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isMetadataSyncEnabled)) __obj.updateDynamic("isMetadataSyncEnabled")(isMetadataSyncEnabled.asInstanceOf[js.Any])
    if (keyspace != null) __obj.updateDynamic("keyspace")(keyspace.asInstanceOf[js.Any])
    if (localDataCenter != null) __obj.updateDynamic("localDataCenter")(localDataCenter.asInstanceOf[js.Any])
    if (maxPrepared != null) __obj.updateDynamic("maxPrepared")(maxPrepared.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (monitorReporting != null) __obj.updateDynamic("monitorReporting")(monitorReporting.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (pooling != null) __obj.updateDynamic("pooling")(pooling.asInstanceOf[js.Any])
    if (!js.isUndefined(prepareOnAllHosts)) __obj.updateDynamic("prepareOnAllHosts")(prepareOnAllHosts.asInstanceOf[js.Any])
    if (profiles != null) __obj.updateDynamic("profiles")(profiles.asInstanceOf[js.Any])
    if (promiseFactory != null) __obj.updateDynamic("promiseFactory")(js.Any.fromFunction1((t0: /* handler */ js.Function1[
  /* callback */ js.Function2[/* err */ js.Error, /* result */ js.UndefOr[js.Any], scala.Unit], 
  scala.Unit]) => promiseFactory(t0).runNow()))
    if (protocolOptions != null) __obj.updateDynamic("protocolOptions")(protocolOptions.asInstanceOf[js.Any])
    if (queryOptions != null) __obj.updateDynamic("queryOptions")(queryOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rePrepareOnUp)) __obj.updateDynamic("rePrepareOnUp")(rePrepareOnUp.asInstanceOf[js.Any])
    if (refreshSchemaDelay != null) __obj.updateDynamic("refreshSchemaDelay")(refreshSchemaDelay.asInstanceOf[js.Any])
    if (requestTracker != null) __obj.updateDynamic("requestTracker")(requestTracker.asInstanceOf[js.Any])
    if (socketOptions != null) __obj.updateDynamic("socketOptions")(socketOptions.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DseClientOptions]
  }
}

