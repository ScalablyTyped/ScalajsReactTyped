package typingsJapgolly.swaggerParser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.swaggerParser.mod.FileInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<swagger-parser.swagger-parser.ResolverOptions> */
trait PartialResolverOptions extends js.Object {
  var canRead: js.UndefOr[
    Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
  ] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var read: js.UndefOr[
    js.Function2[
      /* file */ FileInfo, 
      /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, _]], 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
}

object PartialResolverOptions {
  @scala.inline
  def apply(
    canRead: Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = null,
    order: Int | Double = null,
    read: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, js.Any]]) => CallbackTo[String | Buffer | (js.Promise[String | Buffer])] = null
  ): PartialResolverOptions = {
    val __obj = js.Dynamic.literal()
    if (canRead != null) __obj.updateDynamic("canRead")(canRead.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2((t0: /* file */ typingsJapgolly.swaggerParser.mod.FileInfo, t1: /* callback */ js.UndefOr[
  js.Function2[/* error */ js.Error | scala.Null, /* data */ java.lang.String | scala.Null, js.Any]]) => read(t0, t1).runNow()))
    __obj.asInstanceOf[PartialResolverOptions]
  }
}

