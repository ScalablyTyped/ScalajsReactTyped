package typingsJapgolly.downshift.mod

import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any
  var document: Document_
  var removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
}

object Environment {
  @scala.inline
  def apply(
    addEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.addEventListener */ js.Any,
    document: Document_,
    removeEventListener: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.removeEventListener */ js.Any
  ): Environment = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Environment]
  }
}

