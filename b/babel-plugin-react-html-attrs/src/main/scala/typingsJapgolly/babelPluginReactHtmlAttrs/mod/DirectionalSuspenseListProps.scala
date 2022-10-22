package typingsJapgolly.babelPluginReactHtmlAttrs.mod

import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.backwards
import typingsJapgolly.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.forwards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalSuspenseListProps
  extends StObject
     with typingsJapgolly.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListCommonProps {
  
  /**
    * Defines the order in which the `SuspenseList` children should be revealed.
    */
  var revealOrder: forwards | backwards
  
  /**
    * Dictates how unloaded items in a SuspenseList is shown.
    *
    * - By default, `SuspenseList` will show all fallbacks in the list.
    * - `collapsed` shows only the next fallback in the list.
    * - `hidden` doesn’t show any unloaded items.
    */
  var tail: js.UndefOr[
    typingsJapgolly.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
  ] = js.undefined
}
object DirectionalSuspenseListProps {
  
  inline def apply(
    children: (ReactElement[Any, String | JSXElementConstructor[Any]]) | (js.Iterable[ReactElement[Any, String | JSXElementConstructor[Any]]]),
    revealOrder: forwards | backwards
  ): DirectionalSuspenseListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionalSuspenseListProps]
  }
  
  extension [Self <: DirectionalSuspenseListProps](x: Self) {
    
    inline def setRevealOrder(value: forwards | backwards): Self = StObject.set(x, "revealOrder", value.asInstanceOf[js.Any])
    
    inline def setTail(
      value: typingsJapgolly.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListTailMode
    ): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setTailUndefined: Self = StObject.set(x, "tail", js.undefined)
  }
}
