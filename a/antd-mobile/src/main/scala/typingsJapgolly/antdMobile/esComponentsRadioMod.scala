package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialRadioProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapRadioPro
import typingsJapgolly.antdMobile.esComponentsRadioGroupMod.RadioGroupProps
import typingsJapgolly.antdMobile.esComponentsRadioRadioMod.RadioProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsRadioMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/radio/radio.RadioProps> & {  Group :react.react.FC<antd-mobile.antd-mobile/es/components/radio/group.RadioGroupProps>} */
  object default {
    
    inline def apply(props: RadioProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: RadioProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/radio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/radio", "default.Group")
    @js.native
    def Group: FC[RadioGroupProps] = js.native
    inline def Group_=(x: FC[RadioGroupProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialRadioProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialRadioProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/radio", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapRadioPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapRadioPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
