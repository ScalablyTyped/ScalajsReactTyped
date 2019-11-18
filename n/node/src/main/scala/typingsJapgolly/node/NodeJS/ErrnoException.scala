package typingsJapgolly.node.NodeJS

import typingsJapgolly.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrnoException extends Error {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var errno: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var syscall: js.UndefOr[java.lang.String] = js.undefined
}

object ErrnoException {
  @scala.inline
  def apply(
    code: java.lang.String = null,
    errno: Int | Double = null,
    path: java.lang.String = null,
    stack: java.lang.String = null,
    syscall: java.lang.String = null
  ): ErrnoException = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (errno != null) __obj.updateDynamic("errno")(errno.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syscall != null) __obj.updateDynamic("syscall")(syscall.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrnoException]
  }
}

