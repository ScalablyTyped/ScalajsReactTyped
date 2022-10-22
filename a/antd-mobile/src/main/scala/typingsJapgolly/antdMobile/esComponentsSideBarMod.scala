package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialSideBarProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapSideBarP
import typingsJapgolly.antdMobile.esComponentsSideBarSideBarMod.SideBarItemProps
import typingsJapgolly.antdMobile.esComponentsSideBarSideBarMod.SideBarProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSideBarMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/side-bar/side-bar.SideBarProps> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/side-bar/side-bar.SideBarItemProps>} */
  object default {
    
    inline def apply(props: SideBarProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: SideBarProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/side-bar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/side-bar", "default.Item")
    @js.native
    def Item: FC[SideBarItemProps] = js.native
    inline def Item_=(x: FC[SideBarItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/side-bar", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/side-bar", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialSideBarProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialSideBarProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/side-bar", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/side-bar", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapSideBarP] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapSideBarP]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
