package typingsJapgolly.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimestampOptions extends js.Object {
  var method: js.UndefOr[String] = js.undefined
}

object TimestampOptions {
  @scala.inline
  def apply(method: String = null): TimestampOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimestampOptions]
  }
}

