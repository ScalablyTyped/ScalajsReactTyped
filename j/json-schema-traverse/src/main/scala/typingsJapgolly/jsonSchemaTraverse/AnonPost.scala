package typingsJapgolly.jsonSchemaTraverse

import japgolly.scalajs.react.Callback
import typingsJapgolly.jsonSchemaTraverse.mod.TraverseCallbackDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPost extends js.Object {
  var post: js.UndefOr[TraverseCallbackDef] = js.undefined
  var pre: js.UndefOr[TraverseCallbackDef] = js.undefined
}

object AnonPost {
  @scala.inline
  def apply(
    post: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Callback = null,
    pre: (/* schema */ js.Object, /* jsonPtr */ String, /* rootSchema */ js.Object, /* parentJsonPtr */ String, /* parentKeyword */ String, /* parentSchema */ js.Object, /* keyIndex */ String | Double) => Callback = null
  ): AnonPost = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(js.Any.fromFunction7((t0: /* schema */ js.Object, t1: /* jsonPtr */ java.lang.String, t2: /* rootSchema */ js.Object, t3: /* parentJsonPtr */ java.lang.String, t4: /* parentKeyword */ java.lang.String, t5: /* parentSchema */ js.Object, t6: /* keyIndex */ java.lang.String | scala.Double) => post(t0, t1, t2, t3, t4, t5, t6).runNow()))
    if (pre != null) __obj.updateDynamic("pre")(js.Any.fromFunction7((t0: /* schema */ js.Object, t1: /* jsonPtr */ java.lang.String, t2: /* rootSchema */ js.Object, t3: /* parentJsonPtr */ java.lang.String, t4: /* parentKeyword */ java.lang.String, t5: /* parentSchema */ js.Object, t6: /* keyIndex */ java.lang.String | scala.Double) => pre(t0, t1, t2, t3, t4, t5, t6).runNow()))
    __obj.asInstanceOf[AnonPost]
  }
}

