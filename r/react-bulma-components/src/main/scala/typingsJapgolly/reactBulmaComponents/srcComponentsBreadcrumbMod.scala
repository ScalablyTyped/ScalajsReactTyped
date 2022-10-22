package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.anon.Item
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.arrow
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.bullet
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.center
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.dot
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.succeeds
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsBreadcrumbMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/breadcrumb", JSImport.Default)
  @js.native
  val default: (BulmaComponent[BreadcrumbProps, nav]) & Item = js.native
  
  trait BreadcrumbItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbItemProps {
    
    inline def apply(): BreadcrumbItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbItemProps]
    }
    
    extension [Self <: BreadcrumbItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait BreadcrumbProps extends StObject {
    
    var align: js.UndefOr[right | center] = js.undefined
    
    var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object BreadcrumbProps {
    
    inline def apply(): BreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    extension [Self <: BreadcrumbProps](x: Self) {
      
      inline def setAlign(value: right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setSeparator(value: arrow | bullet | dot | succeeds): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[BreadcrumbProps, nav]) & Item
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsBreadcrumbMod.foo` */
  override def _to: (BulmaComponent[BreadcrumbProps, nav]) & Item = default
}
