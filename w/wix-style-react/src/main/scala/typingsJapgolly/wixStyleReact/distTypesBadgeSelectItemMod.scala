package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixStyleReact.anon.IdOverrideOptionStyle
import typingsJapgolly.wixStyleReact.anon.Skin
import typingsJapgolly.wixStyleReact.distTypesBadgeMod.BadgeSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBadgeSelectItemMod {
  
  @JSImport("wix-style-react/dist/types/BadgeSelectItem", "badgeSelectItemBuilder")
  @js.native
  val badgeSelectItemBuilder: BadgeSelectItemBuilderFn = js.native
  
  type BadgeSelectItem = BadgeSelectOption
  
  type BadgeSelectItemBuilderFn = js.Function1[/* data */ Skin, IdOverrideOptionStyle]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait BadgeSelectItemSizes extends StObject
  object BadgeSelectItemSizes {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.general
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondaryText
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.backgroundSecondary
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.primaryLightText
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.mainMutedHover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.successMutedHover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dangerMutedHover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
  */
  trait BadgeSelectItemSkin extends StObject
  object BadgeSelectItemSkin {
    
    inline def backgroundSecondary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.backgroundSecondary = "backgroundSecondary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.backgroundSecondary]
    
    inline def danger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger = "danger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.danger]
    
    inline def dangerMutedHover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dangerMutedHover = "dangerMutedHover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dangerMutedHover]
    
    inline def general: typingsJapgolly.wixStyleReact.wixStyleReactStrings.general = "general".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.general]
    
    inline def mainMutedHover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.mainMutedHover = "mainMutedHover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.mainMutedHover]
    
    inline def neutral: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutral]
    
    inline def neutralDanger: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger = "neutralDanger".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralDanger]
    
    inline def neutralLight: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight = "neutralLight".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralLight]
    
    inline def neutralStandard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard = "neutralStandard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralStandard]
    
    inline def neutralSuccess: typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess = "neutralSuccess".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.neutralSuccess]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def primaryLightText: typingsJapgolly.wixStyleReact.wixStyleReactStrings.primaryLightText = "primaryLightText".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.primaryLightText]
    
    inline def secondaryText: typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondaryText = "secondaryText".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.secondaryText]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
    
    inline def successMutedHover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.successMutedHover = "successMutedHover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.successMutedHover]
    
    inline def urgent: typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent = "urgent".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.urgent]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
    
    inline def warningLight: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight = "warningLight".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warningLight]
  }
  
  trait BadgeSelectOption extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[BadgeSelectItemSizes] = js.undefined
    
    var skin: BadgeSkin
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
    
    var text: Node
  }
  object BadgeSelectOption {
    
    inline def apply(id: String, skin: BadgeSkin): BadgeSelectOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any], text = null)
      __obj.asInstanceOf[BadgeSelectOption]
    }
    
    extension [Self <: BadgeSelectOption](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSize(value: BadgeSelectItemSizes): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: BadgeSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
