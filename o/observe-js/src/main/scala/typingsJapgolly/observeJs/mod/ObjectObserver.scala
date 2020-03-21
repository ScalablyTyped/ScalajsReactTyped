package typingsJapgolly.observeJs.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.observeJs.mod.observejs.ObjectObserverInstance
import typingsJapgolly.observeJs.mod.observejs.ObjectObserverStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("observe-js", "ObjectObserver")
@js.native
class ObjectObserver protected () extends ObjectObserverInstance {
  /**
  		 * Constructor
  		 * @param receiver the target for observation
  		 */
  def this(receiver: js.Any) = this()
}

@JSImport("observe-js", "ObjectObserver")
@js.native
object ObjectObserver extends TopLevel[ObjectObserverStatic]

