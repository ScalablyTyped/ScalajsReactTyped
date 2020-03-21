package typingsJapgolly.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.DomProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined html */ @js.native
trait DomComponent extends Component {
  /**
  		 * Contents of the DOM component.
  		 */
  var html: js.UndefOr[String] = js.native
}

