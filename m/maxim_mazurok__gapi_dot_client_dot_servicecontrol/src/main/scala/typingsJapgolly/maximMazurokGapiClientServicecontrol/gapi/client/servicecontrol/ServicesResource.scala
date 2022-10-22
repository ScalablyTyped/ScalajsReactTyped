package typingsJapgolly.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import typingsJapgolly.maximMazurokGapiClientServicecontrol.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientServicecontrol.anon.Alt
import typingsJapgolly.maximMazurokGapiClientServicecontrol.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /**
    * Private Preview. This feature is only available for approved services. This method provides admission control for services that are integrated with [Service
    * Infrastructure](https://cloud.google.com/service-infrastructure). It checks whether an operation should be allowed based on the service configuration and relevant policies. It must
    * be called before the operation is executed. For more information, see [Admission Control](https://cloud.google.com/service-infrastructure/docs/admission-control). NOTE: The
    * admission control has an expected policy propagation delay of 60s. The caller **must** not depend on the most recent policy changes. NOTE: The admission control has a hard limit of
    * 1 referenced resources per call. If an operation refers to more than 1 resources, the caller must call the Check method multiple times. This method requires the
    * `servicemanagement.services.check` permission on the specified service. For more information, see [Service Control API Access
    * Control](https://cloud.google.com/service-infrastructure/docs/service-control/access-control).
    */
  def check(request: Accesstoken): typingsJapgolly.gapiClient.gapi.client.Request[CheckResponse] = js.native
  def check(request: Alt, body: CheckRequest): typingsJapgolly.gapiClient.gapi.client.Request[CheckResponse] = js.native
  
  def report(request: Alt, body: ReportRequest): typingsJapgolly.gapiClient.gapi.client.Request[js.Object] = js.native
  /**
    * Private Preview. This feature is only available for approved services. This method provides telemetry reporting for services that are integrated with [Service
    * Infrastructure](https://cloud.google.com/service-infrastructure). It reports a list of operations that have occurred on a service. It must be called after the operations have been
    * executed. For more information, see [Telemetry Reporting](https://cloud.google.com/service-infrastructure/docs/telemetry-reporting). NOTE: The telemetry reporting has a hard limit
    * of 1000 operations and 1MB per Report call. It is recommended to have no more than 100 operations per call. This method requires the `servicemanagement.services.report` permission
    * on the specified service. For more information, see [Service Control API Access Control](https://cloud.google.com/service-infrastructure/docs/service-control/access-control).
    */
  def report(request: Callback): typingsJapgolly.gapiClient.gapi.client.Request[js.Object] = js.native
}
