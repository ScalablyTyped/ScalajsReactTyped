package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialJumboTabsProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapJumboTab
import typingsJapgolly.antdMobile.esComponentsJumboTabsJumboTabsMod.JumboTabProps
import typingsJapgolly.antdMobile.esComponentsJumboTabsJumboTabsMod.JumboTabsProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsJumboTabsMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/jumbo-tabs/jumbo-tabs.JumboTabsProps> & {  Tab :react.react.FC<antd-mobile.antd-mobile/es/components/jumbo-tabs/jumbo-tabs.JumboTabProps>} */
  object default {
    
    inline def apply(props: JumboTabsProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: JumboTabsProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", "default.Tab")
    @js.native
    def Tab: FC[JumboTabProps] = js.native
    inline def Tab_=(x: FC[JumboTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialJumboTabsProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialJumboTabsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/jumbo-tabs", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapJumboTab] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapJumboTab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
