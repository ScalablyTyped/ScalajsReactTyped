package typingsJapgolly.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientXrayNode.typesHttpMod.UnmarshalledHttp
import typingsJapgolly.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import typingsJapgolly.awsSdkClientXrayNode.typesTraceUserMod.UnmarshalledTraceUser
import typingsJapgolly.awsSdkClientXrayNode.typesValueWithServiceIdsMod.UnmarshalledValueWithServiceIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTraceSummary extends TraceSummary {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  @JSName("Annotations")
  var Annotations_UnmarshalledTraceSummary: js.UndefOr[StringDictionary[js.Array[UnmarshalledValueWithServiceIds]]] = js.undefined
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  @JSName("Http")
  var Http_UnmarshalledTraceSummary: js.UndefOr[UnmarshalledHttp] = js.undefined
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  @JSName("Users")
  var Users_UnmarshalledTraceSummary: js.UndefOr[js.Array[UnmarshalledTraceUser]] = js.undefined
}

object UnmarshalledTraceSummary {
  @scala.inline
  def apply(
    Annotations: StringDictionary[js.Array[UnmarshalledValueWithServiceIds]] = null,
    Duration: Int | Double = null,
    HasError: js.UndefOr[Boolean] = js.undefined,
    HasFault: js.UndefOr[Boolean] = js.undefined,
    HasThrottle: js.UndefOr[Boolean] = js.undefined,
    Http: UnmarshalledHttp = null,
    Id: String = null,
    IsPartial: js.UndefOr[Boolean] = js.undefined,
    ResponseTime: Int | Double = null,
    ServiceIds: js.Array[UnmarshalledServiceId] = null,
    Users: js.Array[UnmarshalledTraceUser] = null
  ): UnmarshalledTraceSummary = {
    val __obj = js.Dynamic.literal()
    if (Annotations != null) __obj.updateDynamic("Annotations")(Annotations.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (!js.isUndefined(HasError)) __obj.updateDynamic("HasError")(HasError.asInstanceOf[js.Any])
    if (!js.isUndefined(HasFault)) __obj.updateDynamic("HasFault")(HasFault.asInstanceOf[js.Any])
    if (!js.isUndefined(HasThrottle)) __obj.updateDynamic("HasThrottle")(HasThrottle.asInstanceOf[js.Any])
    if (Http != null) __obj.updateDynamic("Http")(Http.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPartial)) __obj.updateDynamic("IsPartial")(IsPartial.asInstanceOf[js.Any])
    if (ResponseTime != null) __obj.updateDynamic("ResponseTime")(ResponseTime.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTraceSummary]
  }
}

