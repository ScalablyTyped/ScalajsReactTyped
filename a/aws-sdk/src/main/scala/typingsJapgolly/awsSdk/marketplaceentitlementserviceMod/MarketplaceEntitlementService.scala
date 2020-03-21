package typingsJapgolly.awsSdk.marketplaceentitlementserviceMod

import typingsJapgolly.awsSdk.configMod.ConfigBase
import typingsJapgolly.awsSdk.errorMod.AWSError
import typingsJapgolly.awsSdk.requestMod.Request
import typingsJapgolly.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceEntitlementService extends Service {
  @JSName("config")
  var config_MarketplaceEntitlementService: ConfigBase with ClientConfiguration = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(): Request[GetEntitlementsResult, AWSError] = js.native
  def getEntitlements(callback: js.Function2[/* err */ AWSError, /* data */ GetEntitlementsResult, Unit]): Request[GetEntitlementsResult, AWSError] = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(params: GetEntitlementsRequest): Request[GetEntitlementsResult, AWSError] = js.native
  def getEntitlements(
    params: GetEntitlementsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEntitlementsResult, Unit]
  ): Request[GetEntitlementsResult, AWSError] = js.native
}

