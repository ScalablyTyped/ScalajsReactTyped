package typingsJapgolly.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.TreeProperties because var conflicts: CSSStyles, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined withCheckbox */ @js.native
trait TreeComponent[T] extends Component {
  var withCheckbox: js.UndefOr[Boolean] = js.native
  def registerDataProvider[T](dataProvider: TreeComponentDataProvider[T]): TreeComponentView[T] = js.native
}

