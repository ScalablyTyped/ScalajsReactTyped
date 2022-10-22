package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialTabBarProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapTabBarPr
import typingsJapgolly.antdMobile.esComponentsTabBarTabBarMod.TabBarItemProps
import typingsJapgolly.antdMobile.esComponentsTabBarTabBarMod.TabBarProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsTabBarMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/tab-bar/tab-bar.TabBarProps> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/tab-bar/tab-bar.TabBarItemProps>} */
  object default {
    
    inline def apply(props: TabBarProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: TabBarProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/tab-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/tab-bar", "default.Item")
    @js.native
    def Item: FC[TabBarItemProps] = js.native
    inline def Item_=(x: FC[TabBarItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tab-bar", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tab-bar", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTabBarProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTabBarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tab-bar", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tab-bar", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTabBarPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabBarPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
