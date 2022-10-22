package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.esComponentsCollapseCollapseMod.CollapsePanelProps
import typingsJapgolly.antdMobile.esComponentsCollapseCollapseMod.CollapseProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCollapseMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/collapse/collapse.CollapseProps> & {  Panel :react.react.FC<antd-mobile.antd-mobile/es/components/collapse/collapse.CollapsePanelProps>} */
  object default {
    
    inline def apply(props: CollapseProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CollapseProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/collapse", "default.Panel")
    @js.native
    def Panel: FC[CollapsePanelProps] = js.native
    inline def Panel_=(x: FC[CollapsePanelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Panel")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[CollapseProps]] = js.native
    inline def defaultProps_=(x: js.UndefOr[Partial[CollapseProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/collapse", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[CollapseProps]] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMap[CollapseProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
