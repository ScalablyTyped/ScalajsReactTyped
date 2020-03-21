package typingsJapgolly.anyproxy.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleModule extends js.Object {
  /**
    * When receiving https request, AnyProxy will call beforeDealHttpsRequest with param requestDetail.
    * If configed with forceProxyHttps in launching, AnyProxy will skip calling this method.
    * Only by returning true, AnyProxy will try to replace the certificate and intercept the https request.
    */
  var beforeDealHttpsRequest: js.UndefOr[
    js.Function1[/* requestDetail */ BeforeDealHttpsRequestDetail, MaybePromise[Boolean]]
  ] = js.undefined
  /** Before sending request to server, AnyProxy will call beforeSendRequest with param requestDetail. */
  var beforeSendRequest: js.UndefOr[
    js.Function1[
      /* requestDetail */ RequestDetail, 
      MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
    ]
  ] = js.undefined
  /** Before sending response to client, AnyProxy will call beforeSendResponse with param requestDetail responseDetail. */
  var beforeSendResponse: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* responseDetail */ ResponseDetail, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.undefined
  /** AnyProxy will call this method when failed to connect target server in https request. */
  var onConnectError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ js.Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.undefined
  /**
    * AnyProxy will call this method when an error happened in request handling.
    * Errors usually are issued during requesting, e.g. DNS failure, request timeout.
    */
  var onError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ js.Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.undefined
  /** Introduction of this rule file. AnyProxy will read this field and give some tip to user. */
  var summary: js.UndefOr[String] = js.undefined
}

object RuleModule {
  @scala.inline
  def apply(
    beforeDealHttpsRequest: /* requestDetail */ BeforeDealHttpsRequestDetail => CallbackTo[MaybePromise[Boolean]] = null,
    beforeSendRequest: /* requestDetail */ RequestDetail => CallbackTo[MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]] = null,
    beforeSendResponse: (/* requestDetail */ RequestDetail, /* responseDetail */ ResponseDetail) => CallbackTo[MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]] = null,
    onConnectError: (/* requestDetail */ RequestDetail, /* err */ js.Error) => CallbackTo[MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]] = null,
    onError: (/* requestDetail */ RequestDetail, /* err */ js.Error) => CallbackTo[MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]] = null,
    summary: String = null
  ): RuleModule = {
    val __obj = js.Dynamic.literal()
    if (beforeDealHttpsRequest != null) __obj.updateDynamic("beforeDealHttpsRequest")(js.Any.fromFunction1((t0: /* requestDetail */ typingsJapgolly.anyproxy.mod.BeforeDealHttpsRequestDetail) => beforeDealHttpsRequest(t0).runNow()))
    if (beforeSendRequest != null) __obj.updateDynamic("beforeSendRequest")(js.Any.fromFunction1((t0: /* requestDetail */ typingsJapgolly.anyproxy.mod.RequestDetail) => beforeSendRequest(t0).runNow()))
    if (beforeSendResponse != null) __obj.updateDynamic("beforeSendResponse")(js.Any.fromFunction2((t0: /* requestDetail */ typingsJapgolly.anyproxy.mod.RequestDetail, t1: /* responseDetail */ typingsJapgolly.anyproxy.mod.ResponseDetail) => beforeSendResponse(t0, t1).runNow()))
    if (onConnectError != null) __obj.updateDynamic("onConnectError")(js.Any.fromFunction2((t0: /* requestDetail */ typingsJapgolly.anyproxy.mod.RequestDetail, t1: /* err */ js.Error) => onConnectError(t0, t1).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2((t0: /* requestDetail */ typingsJapgolly.anyproxy.mod.RequestDetail, t1: /* err */ js.Error) => onError(t0, t1).runNow()))
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleModule]
  }
}

