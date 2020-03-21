package typingsJapgolly.nock.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackContext extends js.Object {
  var isLoaded: Boolean
  var scopes: js.Array[Scope]
  def assertScopesFinished(): Unit
}

object BackContext {
  @scala.inline
  def apply(assertScopesFinished: Callback, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
    val __obj = js.Dynamic.literal(isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("assertScopesFinished")(assertScopesFinished.toJsFn)
    __obj.asInstanceOf[BackContext]
  }
}

