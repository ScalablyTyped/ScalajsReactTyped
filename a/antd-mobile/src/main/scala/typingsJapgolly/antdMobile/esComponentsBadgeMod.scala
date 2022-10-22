package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialBadgeProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapBadgePro
import typingsJapgolly.antdMobile.esComponentsBadgeBadgeMod.BadgeProps
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsBadgeMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/badge/badge.BadgeProps> & {  dot :react.react.<global>.JSX.Element} */
  object default {
    
    inline def apply(props: BadgeProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: BadgeProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/badge", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/badge", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/badge", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialBadgeProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialBadgeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/badge", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/badge", "default.dot")
    @js.native
    def dot: typingsJapgolly.react.mod.global.JSX.Element = js.native
    inline def dot_=(x: typingsJapgolly.react.mod.global.JSX.Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dot")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/badge", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapBadgePro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapBadgePro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
