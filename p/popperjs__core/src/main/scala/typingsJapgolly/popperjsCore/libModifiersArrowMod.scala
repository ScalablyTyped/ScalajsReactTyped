package typingsJapgolly.popperjsCore

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.popperjsCore.anon.Placement
import typingsJapgolly.popperjsCore.libTypesMod.Modifier
import typingsJapgolly.popperjsCore.libTypesMod.Padding
import typingsJapgolly.popperjsCore.popperjsCoreStrings.arrow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModifiersArrowMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/arrow", JSImport.Default)
  @js.native
  val default: ArrowModifier = js.native
  
  type ArrowModifier = Modifier[arrow, Options]
  
  trait Options extends StObject {
    
    var element: HTMLElement | String | Null
    
    var padding: Padding | (js.Function1[/* arg0 */ Placement, Padding])
  }
  object Options {
    
    inline def apply(padding: Padding | (js.Function1[/* arg0 */ Placement, Padding])): Options = {
      val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], element = null)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setElement(value: HTMLElement | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
      
      inline def setPadding(value: Padding | (js.Function1[/* arg0 */ Placement, Padding])): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingFunction1(value: /* arg0 */ Placement => Padding): Self = StObject.set(x, "padding", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ArrowModifier
  
  /* This means you don't have to write `default`, but can instead just say `libModifiersArrowMod.foo` */
  override def _to: ArrowModifier = default
}
