package typingsJapgolly.reactVirtualized.esScrollSyncMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSyncProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Function responsible for rendering 2 or more virtualized components.
    * This function should implement the following signature:
    * ({ onScroll, scrollLeft, scrollTop }) => PropTypes.element
    */
  def children(props: ScrollSyncChildProps): Node
}

object ScrollSyncProps {
  @scala.inline
  def apply(
    children: ScrollSyncChildProps => CallbackTo[Node],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null
  ): ScrollSyncProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esScrollSyncMod.ScrollSyncChildProps) => children(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ScrollSyncProps]
  }
}

