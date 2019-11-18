package typingsJapgolly.atAngularCompiler.srcMlUnderscoreParserTagsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDefinition extends js.Object {
  var canSelfClose: Boolean
  var closedByParent: Boolean
  var contentType: TagContentType
  var ignoreFirstLf: Boolean
  var implicitNamespacePrefix: String | Null
  var isVoid: Boolean
  def isClosedByChild(name: String): Boolean
}

object TagDefinition {
  @scala.inline
  def apply(
    canSelfClose: Boolean,
    closedByParent: Boolean,
    contentType: TagContentType,
    ignoreFirstLf: Boolean,
    isClosedByChild: String => CallbackTo[Boolean],
    isVoid: Boolean,
    implicitNamespacePrefix: String = null
  ): TagDefinition = {
    val __obj = js.Dynamic.literal(canSelfClose = canSelfClose.asInstanceOf[js.Any], closedByParent = closedByParent.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], ignoreFirstLf = ignoreFirstLf.asInstanceOf[js.Any], isVoid = isVoid.asInstanceOf[js.Any])
    __obj.updateDynamic("isClosedByChild")(js.Any.fromFunction1((t0: java.lang.String) => isClosedByChild(t0).runNow()))
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagDefinition]
  }
}

