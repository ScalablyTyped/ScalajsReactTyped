package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialTabsProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapTabsProp
import typingsJapgolly.antdMobile.esComponentsTabsTabsMod.TabProps
import typingsJapgolly.antdMobile.esComponentsTabsTabsMod.TabsProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsTabsMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/tabs/tabs.TabsProps> & {  Tab :react.react.FC<antd-mobile.antd-mobile/es/components/tabs/tabs.TabProps>} */
  object default {
    
    inline def apply(props: TabsProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: TabsProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/tabs", "default.Tab")
    @js.native
    def Tab: FC[TabProps] = js.native
    inline def Tab_=(x: FC[TabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTabsProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTabsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tabs", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTabsProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTabsProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
