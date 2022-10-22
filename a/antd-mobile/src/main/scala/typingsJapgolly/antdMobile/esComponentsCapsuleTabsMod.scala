package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialCapsuleTabsProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapCapsuleT
import typingsJapgolly.antdMobile.esComponentsCapsuleTabsCapsuleTabsMod.CapsuleTabProps
import typingsJapgolly.antdMobile.esComponentsCapsuleTabsCapsuleTabsMod.CapsuleTabsProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCapsuleTabsMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/capsule-tabs/capsule-tabs.CapsuleTabsProps> & {  Tab :react.react.FC<antd-mobile.antd-mobile/es/components/capsule-tabs/capsule-tabs.CapsuleTabProps>} */
  object default {
    
    inline def apply(props: CapsuleTabsProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CapsuleTabsProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/capsule-tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/capsule-tabs", "default.Tab")
    @js.native
    def Tab: FC[CapsuleTabProps] = js.native
    inline def Tab_=(x: FC[CapsuleTabProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/capsule-tabs", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/capsule-tabs", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCapsuleTabsProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCapsuleTabsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/capsule-tabs", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/capsule-tabs", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCapsuleT] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCapsuleT]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
