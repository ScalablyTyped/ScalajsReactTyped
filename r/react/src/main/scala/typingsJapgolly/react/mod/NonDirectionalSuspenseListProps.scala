package typingsJapgolly.react.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonDirectionalSuspenseListProps
  extends StObject
     with typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: js.UndefOr[
    Exclude[
      typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
      forwards | backwards
    ]
  ] = js.undefined
  
  /**
    * The tail property is invalid when not using the `forwards` or `backwards` reveal orders.
    */
  var tail: js.UndefOr[scala.Nothing] = js.undefined
}
object NonDirectionalSuspenseListProps {
  
  inline def apply(children: Element | js.Iterable[Element]): NonDirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonDirectionalSuspenseListProps]
  }
  
  extension [Self <: NonDirectionalSuspenseListProps](x: Self) {
    
    inline def setRevealOrder(
      value: Exclude[
          typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder, 
          forwards | backwards
        ]
    ): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    inline def setRevealOrderUndefined: Self = StObject.set(x, "revealOrder", js.undefined)
  }
}
