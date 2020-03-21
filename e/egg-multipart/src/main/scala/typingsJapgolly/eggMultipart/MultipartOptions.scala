package typingsJapgolly.eggMultipart

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartOptions extends js.Object {
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ String, 
      /* file */ js.Any, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit | js.Error
    ]
  ] = js.undefined
   // required file submit, default is true
  var defCharset: js.UndefOr[String] = js.undefined
  var limits: js.UndefOr[AnonFieldNameSize] = js.undefined
  var requireFile: js.UndefOr[Boolean] = js.undefined
}

object MultipartOptions {
  @scala.inline
  def apply(
    checkFile: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => CallbackTo[Unit | js.Error] = null,
    defCharset: String = null,
    limits: AnonFieldNameSize = null,
    requireFile: js.UndefOr[Boolean] = js.undefined
  ): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    if (checkFile != null) __obj.updateDynamic("checkFile")(js.Any.fromFunction5((t0: /* fieldname */ java.lang.String, t1: /* file */ js.Any, t2: /* filename */ java.lang.String, t3: /* encoding */ java.lang.String, t4: /* mimetype */ java.lang.String) => checkFile(t0, t1, t2, t3, t4).runNow()))
    if (defCharset != null) __obj.updateDynamic("defCharset")(defCharset.asInstanceOf[js.Any])
    if (limits != null) __obj.updateDynamic("limits")(limits.asInstanceOf[js.Any])
    if (!js.isUndefined(requireFile)) __obj.updateDynamic("requireFile")(requireFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartOptions]
  }
}

