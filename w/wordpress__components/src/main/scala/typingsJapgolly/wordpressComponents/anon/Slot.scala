package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot extends StObject {
  
  /**
    * Use Popover.Slot to render the Popover to a specific location on the page.
    *
    * This is useful to allow style cascade to take effect.
    *
    * @example
    *
    * import { render } from 'react';
    * import { Popover } from '@wordpress/components';
    * import Content from './Content';
    *
    * const app = document.getElementById( 'app' );
    * render(
    *   <div>
    *       <Content />
    *       <Popover.Slot />
    *   </div>,
    *   app
    * );
    */
  def Slot(): Element
}
object Slot {
  
  inline def apply(Slot: CallbackTo[Element]): Slot = {
    val __obj = js.Dynamic.literal(Slot = Slot.toJsFn)
    __obj.asInstanceOf[Slot]
  }
  
  extension [Self <: Slot](x: Self) {
    
    inline def setSlot(value: CallbackTo[Element]): Self = StObject.set(x, "Slot", value.toJsFn)
  }
}
