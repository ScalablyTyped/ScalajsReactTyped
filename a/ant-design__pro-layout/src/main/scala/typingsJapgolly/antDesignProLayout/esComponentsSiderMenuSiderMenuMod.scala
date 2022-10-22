package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignProLayout.anon.ActionsRender
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.header
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.onCollapse
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sider
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuBaseMenuMod.BaseMenuProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSiderMenuSiderMenuMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SiderMenu/SiderMenu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/SiderMenu/SiderMenu", "SiderMenu")
  @js.native
  val SiderMenu: FC[SiderMenuProps & PrivateSiderMenuProps] = js.native
  
  inline def renderLogoAndTitle(props: SiderMenuProps): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLogoAndTitle")(props.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def renderLogoAndTitle(props: SiderMenuProps, renderKey: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLogoAndTitle")(props.asInstanceOf[js.Any], renderKey.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  trait PrivateSiderMenuProps extends StObject {
    
    var matchMenuKeys: js.Array[String]
    
    var menuRenderType: js.UndefOr[header | sider] = js.undefined
    
    var originCollapsed: js.UndefOr[Boolean] = js.undefined
  }
  object PrivateSiderMenuProps {
    
    inline def apply(matchMenuKeys: js.Array[String]): PrivateSiderMenuProps = {
      val __obj = js.Dynamic.literal(matchMenuKeys = matchMenuKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateSiderMenuProps]
    }
    
    extension [Self <: PrivateSiderMenuProps](x: Self) {
      
      inline def setMatchMenuKeys(value: js.Array[String]): Self = StObject.set(x, "matchMenuKeys", value.asInstanceOf[js.Any])
      
      inline def setMatchMenuKeysVarargs(value: String*): Self = StObject.set(x, "matchMenuKeys", js.Array(value*))
      
      inline def setMenuRenderType(value: header | sider): Self = StObject.set(x, "menuRenderType", value.asInstanceOf[js.Any])
      
      inline def setMenuRenderTypeUndefined: Self = StObject.set(x, "menuRenderType", js.undefined)
      
      inline def setOriginCollapsed(value: Boolean): Self = StObject.set(x, "originCollapsed", value.asInstanceOf[js.Any])
      
      inline def setOriginCollapsedUndefined: Self = StObject.set(x, "originCollapsed", js.undefined)
    }
  }
  
  type SiderMenuProps = ActionsRender & (Pick[
    BaseMenuProps, 
    Exclude[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 234, starting with typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.className, typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.defaultCollapsed, typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.collapsed */ Any, 
      js.Array[onCollapse]
    ]
  ])
}
