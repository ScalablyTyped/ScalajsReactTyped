package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialCascaderViewProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapCascader
import typingsJapgolly.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderOption
import typingsJapgolly.antdMobile.esComponentsCascaderViewCascaderViewMod.CascaderViewProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCascaderViewMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderViewProps> & {  optionSkeleton :std.Array<antd-mobile.antd-mobile/es/components/cascader-view/cascader-view.CascaderOption>} */
  object default {
    
    inline def apply(props: CascaderViewProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CascaderViewProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/cascader-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCascaderViewProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCascaderViewProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.optionSkeleton")
    @js.native
    def optionSkeleton: js.Array[CascaderOption] = js.native
    inline def optionSkeleton_=(x: js.Array[CascaderOption]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionSkeleton")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/cascader-view", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCascader] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCascader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
