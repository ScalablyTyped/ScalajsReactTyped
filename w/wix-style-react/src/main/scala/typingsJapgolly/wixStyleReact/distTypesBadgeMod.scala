package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.EventHandler
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeMod {
  
  @JSImport("wix-style-react/dist/types/Badge", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BadgeProps, js.Object, Any]
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeSize ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeSize} */
  object SIZE {
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.medium")
    @js.native
    def medium: BadgeSize = js.native
    inline def medium_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("medium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.small")
    @js.native
    def small: BadgeSize = js.native
    inline def small_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("small")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SIZE.tiny")
    @js.native
    def tiny: BadgeSize = js.native
    inline def tiny_=(x: BadgeSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiny")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeSkin ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeSkin} */
  object SKIN {
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.danger")
    @js.native
    def danger: BadgeSkin = js.native
    inline def danger_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("danger")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.general")
    @js.native
    def general: BadgeSkin = js.native
    inline def general_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("general")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutral")
    @js.native
    def neutral: BadgeSkin = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralDanger")
    @js.native
    def neutralDanger: BadgeSkin = js.native
    inline def neutralDanger_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralDanger")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralLight")
    @js.native
    def neutralLight: BadgeSkin = js.native
    inline def neutralLight_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralLight")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralStandard")
    @js.native
    def neutralStandard: BadgeSkin = js.native
    inline def neutralStandard_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralStandard")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.neutralSuccess")
    @js.native
    def neutralSuccess: BadgeSkin = js.native
    inline def neutralSuccess_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutralSuccess")(x.asInstanceOf[js.Any])
    
    inline def neutral_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("neutral")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.premium")
    @js.native
    def premium: BadgeSkin = js.native
    inline def premium_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("premium")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.standard")
    @js.native
    def standard: BadgeSkin = js.native
    inline def standard_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("standard")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.success")
    @js.native
    def success: BadgeSkin = js.native
    inline def success_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.urgent")
    @js.native
    def urgent: BadgeSkin = js.native
    inline def urgent_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urgent")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.warning")
    @js.native
    def warning: BadgeSkin = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "SKIN.warningLight")
    @js.native
    def warningLight: BadgeSkin = js.native
    inline def warningLight_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warningLight")(x.asInstanceOf[js.Any])
    
    inline def warning_=(x: BadgeSkin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in wix-style-react.wix-style-react/dist/types/Badge.BadgeType ]: wix-style-react.wix-style-react/dist/types/Badge.BadgeType} */
  object TYPE {
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.outlined")
    @js.native
    def outlined: BadgeType = js.native
    inline def outlined_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outlined")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.solid")
    @js.native
    def solid: BadgeType = js.native
    inline def solid_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("solid")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Badge", "TYPE.transparent")
    @js.native
    def transparent: BadgeType = js.native
    inline def transparent_=(x: BadgeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
  }
  
  type Badge = PureComponent[BadgeProps, js.Object, Any]
  
  trait BadgeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var noPadding: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[EventHandler[ReactMouseEventFrom[HTMLElement]]] = js.undefined
    
    var prefixIcon: js.UndefOr[Element] = js.undefined
    
    var size: js.UndefOr[BadgeSize] = js.undefined
    
    var skin: js.UndefOr[BadgeSkin] = js.undefined
    
    var suffixIcon: js.UndefOr[Element] = js.undefined
    
    var `type`: js.UndefOr[BadgeType] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setNoPadding(value: Boolean): Self = StObject.set(x, "noPadding", value.asInstanceOf[js.Any])
      
      inline def setNoPaddingUndefined: Self = StObject.set(x, "noPadding", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixIcon(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSize(value: BadgeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: BadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setSuffixIcon(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setType(value: BadgeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
  */
  trait BadgeSize extends StObject
  object BadgeSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.general
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
  */
  trait BadgeSkin extends StObject
  object BadgeSkin {
    
    inline def danger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def general: typingsJapgolly.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.general]
    
    inline def neutral: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral]
    
    inline def neutralDanger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger = "neutralDanger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger]
    
    inline def neutralLight: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight = "neutralLight".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight]
    
    inline def neutralStandard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def neutralSuccess: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess = "neutralSuccess".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def urgent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
    
    inline def warningLight: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight = "warningLight".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.solid
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.outlined
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent
  */
  trait BadgeType extends StObject
  object BadgeType {
    
    inline def outlined: typingsJapgolly.wixStyleReact.wixStyleReactStrings.outlined = "outlined".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.outlined]
    
    inline def solid: typingsJapgolly.wixStyleReact.wixStyleReactStrings.solid = "solid".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.solid]
    
    inline def transparent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.transparent]
  }
}
