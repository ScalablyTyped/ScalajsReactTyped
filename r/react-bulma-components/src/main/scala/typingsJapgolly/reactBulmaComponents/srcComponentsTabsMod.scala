package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.anon.TabBulmaComponent
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`toggle-rounded`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.boxed
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.center
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.toggle
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsTabsMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/tabs", JSImport.Default)
  @js.native
  val default: (BulmaComponent[TabsProps, div]) & TabBulmaComponent = js.native
  
  trait TabProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var align: js.UndefOr[center | right] = js.undefined
    
    var fullwidth: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var `type`: js.UndefOr[toggle | boxed | `toggle-rounded`] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setAlign(value: center | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setFullwidth(value: Boolean): Self = StObject.set(x, "fullwidth", value.asInstanceOf[js.Any])
      
      inline def setFullwidthUndefined: Self = StObject.set(x, "fullwidth", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: toggle | boxed | `toggle-rounded`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[TabsProps, div]) & TabBulmaComponent
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsTabsMod.foo` */
  override def _to: (BulmaComponent[TabsProps, div]) & TabBulmaComponent = default
}
