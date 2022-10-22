package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.fluid
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Breakpoint
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsContainerMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/container", JSImport.Default)
  @js.native
  val default: BulmaComponent[ContainerProps, div] = js.native
  
  trait ContainerProps extends StObject {
    
    var breakpoint: js.UndefOr[Breakpoint | fluid] = js.undefined
    
    var max: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    extension [Self <: ContainerProps](x: Self) {
      
      inline def setBreakpoint(value: Breakpoint | fluid): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    }
  }
  
  type _To = BulmaComponent[ContainerProps, div]
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsContainerMod.foo` */
  override def _to: BulmaComponent[ContainerProps, div] = default
}
