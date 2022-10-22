package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialResultPageProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapResultPa
import typingsJapgolly.antdMobile.esComponentsResultPageResultPageCardMod.ResultPageCardProps
import typingsJapgolly.antdMobile.esComponentsResultPageResultPageMod.ResultPageProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsResultPageMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/result-page/result-page.ResultPageProps> & {  Card :react.react.FC<antd-mobile.antd-mobile/es/components/result-page/result-page-card.ResultPageCardProps>} */
  object default {
    
    inline def apply(props: ResultPageProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ResultPageProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/result-page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/result-page", "default.Card")
    @js.native
    def Card: FC[ResultPageCardProps] = js.native
    inline def Card_=(x: FC[ResultPageCardProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Card")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/result-page", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/result-page", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialResultPageProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialResultPageProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/result-page", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/result-page", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapResultPa] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapResultPa]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
