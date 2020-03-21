package typingsJapgolly.prettier

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prettier.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndOfLine extends js.Object {
  var endOfLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
  var ownLine: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
  var remaining: js.UndefOr[
    js.Function5[
      /* commentNode */ js.Any, 
      /* text */ String, 
      /* options */ ParserOptions, 
      /* ast */ js.Any, 
      /* isLastComment */ Boolean, 
      Boolean
    ]
  ] = js.undefined
}

object AnonEndOfLine {
  @scala.inline
  def apply(
    endOfLine: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => CallbackTo[Boolean] = null,
    ownLine: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => CallbackTo[Boolean] = null,
    remaining: (/* commentNode */ js.Any, /* text */ String, /* options */ ParserOptions, /* ast */ js.Any, /* isLastComment */ Boolean) => CallbackTo[Boolean] = null
  ): AnonEndOfLine = {
    val __obj = js.Dynamic.literal()
    if (endOfLine != null) __obj.updateDynamic("endOfLine")(js.Any.fromFunction5((t0: /* commentNode */ js.Any, t1: /* text */ java.lang.String, t2: /* options */ typingsJapgolly.prettier.mod.ParserOptions, t3: /* ast */ js.Any, t4: /* isLastComment */ scala.Boolean) => endOfLine(t0, t1, t2, t3, t4).runNow()))
    if (ownLine != null) __obj.updateDynamic("ownLine")(js.Any.fromFunction5((t0: /* commentNode */ js.Any, t1: /* text */ java.lang.String, t2: /* options */ typingsJapgolly.prettier.mod.ParserOptions, t3: /* ast */ js.Any, t4: /* isLastComment */ scala.Boolean) => ownLine(t0, t1, t2, t3, t4).runNow()))
    if (remaining != null) __obj.updateDynamic("remaining")(js.Any.fromFunction5((t0: /* commentNode */ js.Any, t1: /* text */ java.lang.String, t2: /* options */ typingsJapgolly.prettier.mod.ParserOptions, t3: /* ast */ js.Any, t4: /* isLastComment */ scala.Boolean) => remaining(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[AnonEndOfLine]
  }
}

