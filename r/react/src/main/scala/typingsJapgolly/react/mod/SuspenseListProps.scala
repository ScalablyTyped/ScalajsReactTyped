package typingsJapgolly.react.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps
*/
trait SuspenseListProps extends StObject
object SuspenseListProps {
  
  inline def DirectionalSuspenseListProps(children: Element | js.Iterable[Element], revealOrder: forwards | backwards): typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps]
  }
  
  inline def NonDirectionalSuspenseListProps(children: Element | js.Iterable[Element]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps]
  }
}
