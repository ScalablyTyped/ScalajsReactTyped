package typingsJapgolly.evaporate.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddConfig extends js.Object {
  var beforeSigner: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* url */ String, Unit]] = js.undefined
  var cancelled: js.UndefOr[js.Function0[Unit]] = js.undefined
  var complete: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats, Unit]
  ] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var file: File
  var info: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var name: String
  var nameChanged: js.UndefOr[js.Function1[/* awsObjectKey */ String, Unit]] = js.undefined
  var notSignedHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
  var paused: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var pausing: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var progress: js.UndefOr[js.Function2[/* p */ Double, /* stats */ TransferStats, Unit]] = js.undefined
  var resumed: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var started: js.UndefOr[js.Function1[/* file_key */ String, Unit]] = js.undefined
  var uploadInitiated: js.UndefOr[js.Function1[/* s3UploadId */ js.UndefOr[String], Unit]] = js.undefined
  var warn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var xAmzHeadersAtComplete: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersAtInitiate: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersAtUpload: js.UndefOr[StringDictionary[String]] = js.undefined
  var xAmzHeadersCommon: js.UndefOr[StringDictionary[String]] = js.undefined
}

object AddConfig {
  @scala.inline
  def apply(
    file: File,
    name: String,
    beforeSigner: (/* xhr */ XMLHttpRequest, /* url */ String) => Callback = null,
    cancelled: js.UndefOr[Callback] = js.undefined,
    complete: (/* xhr */ XMLHttpRequest, /* awsObjectKey */ String, /* stats */ TransferStats) => Callback = null,
    contentType: String = null,
    error: /* msg */ String => Callback = null,
    info: /* msg */ String => Callback = null,
    nameChanged: /* awsObjectKey */ String => Callback = null,
    notSignedHeadersAtInitiate: StringDictionary[String] = null,
    paused: /* file_key */ String => Callback = null,
    pausing: /* file_key */ String => Callback = null,
    progress: (/* p */ Double, /* stats */ TransferStats) => Callback = null,
    resumed: /* file_key */ String => Callback = null,
    started: /* file_key */ String => Callback = null,
    uploadInitiated: /* s3UploadId */ js.UndefOr[String] => Callback = null,
    warn: /* msg */ String => Callback = null,
    xAmzHeadersAtComplete: StringDictionary[String] = null,
    xAmzHeadersAtInitiate: StringDictionary[String] = null,
    xAmzHeadersAtUpload: StringDictionary[String] = null,
    xAmzHeadersCommon: StringDictionary[String] = null
  ): AddConfig = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (beforeSigner != null) __obj.updateDynamic("beforeSigner")(js.Any.fromFunction2((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t1: /* url */ java.lang.String) => beforeSigner(t0, t1).runNow()))
    cancelled.foreach(p => __obj.updateDynamic("cancelled")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction3((t0: /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, t1: /* awsObjectKey */ java.lang.String, t2: /* stats */ typingsJapgolly.evaporate.mod.TransferStats) => complete(t0, t1, t2).runNow()))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => error(t0).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => info(t0).runNow()))
    if (nameChanged != null) __obj.updateDynamic("nameChanged")(js.Any.fromFunction1((t0: /* awsObjectKey */ java.lang.String) => nameChanged(t0).runNow()))
    if (notSignedHeadersAtInitiate != null) __obj.updateDynamic("notSignedHeadersAtInitiate")(notSignedHeadersAtInitiate.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(js.Any.fromFunction1((t0: /* file_key */ java.lang.String) => paused(t0).runNow()))
    if (pausing != null) __obj.updateDynamic("pausing")(js.Any.fromFunction1((t0: /* file_key */ java.lang.String) => pausing(t0).runNow()))
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2((t0: /* p */ scala.Double, t1: /* stats */ typingsJapgolly.evaporate.mod.TransferStats) => progress(t0, t1).runNow()))
    if (resumed != null) __obj.updateDynamic("resumed")(js.Any.fromFunction1((t0: /* file_key */ java.lang.String) => resumed(t0).runNow()))
    if (started != null) __obj.updateDynamic("started")(js.Any.fromFunction1((t0: /* file_key */ java.lang.String) => started(t0).runNow()))
    if (uploadInitiated != null) __obj.updateDynamic("uploadInitiated")(js.Any.fromFunction1((t0: /* s3UploadId */ js.UndefOr[java.lang.String]) => uploadInitiated(t0).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => warn(t0).runNow()))
    if (xAmzHeadersAtComplete != null) __obj.updateDynamic("xAmzHeadersAtComplete")(xAmzHeadersAtComplete.asInstanceOf[js.Any])
    if (xAmzHeadersAtInitiate != null) __obj.updateDynamic("xAmzHeadersAtInitiate")(xAmzHeadersAtInitiate.asInstanceOf[js.Any])
    if (xAmzHeadersAtUpload != null) __obj.updateDynamic("xAmzHeadersAtUpload")(xAmzHeadersAtUpload.asInstanceOf[js.Any])
    if (xAmzHeadersCommon != null) __obj.updateDynamic("xAmzHeadersCommon")(xAmzHeadersCommon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddConfig]
  }
}

