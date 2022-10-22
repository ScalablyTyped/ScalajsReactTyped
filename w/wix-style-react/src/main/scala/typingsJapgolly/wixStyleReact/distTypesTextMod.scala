package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsOnClick
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsOnClickTagName
import typingsJapgolly.wixStyleReact.anon.OnClickTagName
import typingsJapgolly.wixStyleReact.anon.TagName
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Text", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextProps> */ Any = js.native
  
  @JSImport("wix-style-react/dist/types/Text", "Text")
  @js.native
  val Text: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextProps> */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkmark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle
  */
  trait ListStyle extends StObject
  object ListStyle {
    
    inline def checkmark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkmark = "checkmark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.checkmark]
    
    inline def circle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.circle]
  }
  
  type TextAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & TagName
  
  type TextAsComponentProps[T] = T & DictadditionalPropsOnClick
  
  type TextAsSpanProps[T] = HTMLAttributes[HTMLSpanElement] & T & OnClickTagName
  
  type TextGenericProps[T] = T & DictadditionalPropsOnClickTagName
  
  type TextProps = TextWithAsProp[TextPropsBase]
  
  /* Inlined wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/common/Ellipsis.EllipsisCommonProps, 'size'> & {  dataHook :string | undefined,   tagName :string | undefined,   className :string | undefined,   size :wix-style-react.wix-style-react/dist/types/Text.TextSize | undefined,   secondary :boolean | undefined,   skin :wix-style-react.wix-style-react/dist/types/Text.TextSkin | undefined,   light :boolean | undefined,   weight :wix-style-react.wix-style-react/dist/types/Text.TextWeight | undefined,   listStyle :wix-style-react.wix-style-react/dist/types/Text.ListStyle | undefined,   tooltipProps :wix-style-react.wix-style-react/dist/types/common.TooltipCommonProps | undefined,   id :string | undefined} */
  trait TextPropsBase extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[ListStyle] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TextSize] = js.undefined
    
    var skin: js.UndefOr[TextSkin] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var weight: js.UndefOr[TextWeight] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TextPropsBase {
    
    inline def apply(): TextPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPropsBase]
    }
    
    extension [Self <: TextPropsBase](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setListStyle(value: ListStyle): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSize(value: TextSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: TextSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      inline def setWeight(value: TextWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TextSize extends StObject
  object TextSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.success
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary
  */
  trait TextSkin extends StObject
  object TextSkin {
    
    inline def disabled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.disabled]
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def premium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def primary: typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.primary]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typingsJapgolly.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.success]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.bold
  */
  trait TextWeight extends StObject
  object TextWeight {
    
    inline def bold: typingsJapgolly.wixStyleReact.wixStyleReactStrings.bold = "bold".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.bold]
    
    inline def normal: typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.normal]
    
    inline def thin: typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin = "thin".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.thin]
  }
  
  type TextWithAsProp[T] = TextAsSpanProps[T] | TextAsAnchorProps[T] | TextGenericProps[T] | TextAsComponentProps[T]
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesTextMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TextProps> */ Any = default
}
