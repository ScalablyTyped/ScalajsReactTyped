package typingsJapgolly.antDesignProLayout

import typingsJapgolly.antDesignProLayout.anon.ActionRef
import typingsJapgolly.antDesignProLayout.anon.PartialRouterTypes
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.collapsed
import typingsJapgolly.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.SiderMenuProps
import typingsJapgolly.antDesignProLayout.esContextProLayoutContextMod.ProLayoutProviderProps
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esProLayoutMod {
  
  @JSImport("@ant-design/pro-layout/es/ProLayout", "ProLayout")
  @js.native
  val ProLayout: FC[ProLayoutProps] = js.native
  
  /* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/es/ProLayout.ProLayoutProps[K]} & {  breadcrumb :std.Record<string, @ant-design/pro-layout.@ant-design/pro-layout/es/typings.MenuDataItem>} */
  trait BasicLayoutContext extends StObject {
    
    var breadcrumb: Record[String, MenuDataItem]
    
    var location: js.UndefOr[Any] = js.undefined
  }
  object BasicLayoutContext {
    
    inline def apply(breadcrumb: Record[String, MenuDataItem]): BasicLayoutContext = {
      val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicLayoutContext]
    }
    
    extension [Self <: BasicLayoutContext](x: Self) {
      
      inline def setBreadcrumb(value: Record[String, MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  type GlobalTypes = Omit[
    PartialRouterTypes & SiderMenuProps & HeaderViewProps & ProLayoutProviderProps, 
    collapsed
  ]
  
  trait LayoutBreadcrumbProps extends StObject {
    
    var minLength: js.UndefOr[Double] = js.undefined
  }
  object LayoutBreadcrumbProps {
    
    inline def apply(): LayoutBreadcrumbProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutBreadcrumbProps]
    }
    
    extension [Self <: LayoutBreadcrumbProps](x: Self) {
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    }
  }
  
  type ProLayoutProps = GlobalTypes & ActionRef
}
