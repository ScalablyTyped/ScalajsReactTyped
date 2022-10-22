package typingsJapgolly.rcOverflow

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcOverflow.esOverflowMod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRawItemMod extends Shortcut {
  
  @JSImport("rc-overflow/es/RawItem", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RawItemProps & RefAttributes[Any]] = js.native
  
  trait RawItemProps
    extends StObject
       with HTMLAttributes[Any] {
    
    var component: js.UndefOr[ComponentType] = js.undefined
  }
  object RawItemProps {
    
    inline def apply(): RawItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RawItemProps]
    }
    
    extension [Self <: RawItemProps](x: Self) {
      
      inline def setComponent(value: ComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RawItemProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esRawItemMod.foo` */
  override def _to: ForwardRefExoticComponent[RawItemProps & RefAttributes[Any]] = default
}
