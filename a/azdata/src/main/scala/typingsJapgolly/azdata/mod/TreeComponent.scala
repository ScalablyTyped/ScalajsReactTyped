package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.azdata.mod.ComponentProperties because Already inherited
- typingsJapgolly.azdata.mod.TreeProperties because var conflicts: CSSStyles, ariaHidden, ariaLabel, ariaRole, ariaSelected, display, enabled, height, position, width. Inlined withCheckbox */ @js.native
trait TreeComponent[T]
  extends StObject
     with Component {
  
  def registerDataProvider[T](dataProvider: TreeComponentDataProvider[T]): TreeComponentView[T] = js.native
  
  var withCheckbox: js.UndefOr[Boolean] = js.native
}
