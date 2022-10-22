package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialTreeSelectProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapTreeSele
import typingsJapgolly.antdMobile.esComponentsTreeSelectMultipleMod.MultipleProps
import typingsJapgolly.antdMobile.esComponentsTreeSelectTreeSelectMod.TreeSelectProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsTreeSelectMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/tree-select/tree-select.TreeSelectProps> & {  Multiple :react.react.FC<antd-mobile.antd-mobile/es/components/tree-select/multiple.MultipleProps>} */
  object default {
    
    inline def apply(props: TreeSelectProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: TreeSelectProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/tree-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/tree-select", "default.Multiple")
    @js.native
    def Multiple: FC[MultipleProps] = js.native
    inline def Multiple_=(x: FC[MultipleProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multiple")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tree-select", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tree-select", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialTreeSelectProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialTreeSelectProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tree-select", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/tree-select", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapTreeSele] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapTreeSele]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
