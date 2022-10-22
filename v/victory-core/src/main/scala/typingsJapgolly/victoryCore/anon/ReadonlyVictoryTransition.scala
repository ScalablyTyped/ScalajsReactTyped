package typingsJapgolly.victoryCore.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<victory-core.victory-core/es/victory-transition/victory-transition.VictoryTransitionProps> */
trait ReadonlyVictoryTransition extends StObject {
  
  val animate: js.UndefOr[Boolean | Any] = js.undefined
  
  val animationWhitelist: js.UndefOr[js.Array[String]] = js.undefined
  
  val children: Element
}
object ReadonlyVictoryTransition {
  
  inline def apply(children: VdomElement): ReadonlyVictoryTransition = {
    val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyVictoryTransition]
  }
  
  extension [Self <: ReadonlyVictoryTransition](x: Self) {
    
    inline def setAnimate(value: Boolean | Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAnimationWhitelist(value: js.Array[String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
    
    inline def setAnimationWhitelistUndefined: Self = StObject.set(x, "animationWhitelist", js.undefined)
    
    inline def setAnimationWhitelistVarargs(value: String*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
    
    inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
  }
}
