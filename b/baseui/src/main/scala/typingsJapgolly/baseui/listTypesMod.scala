package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.MouseEvent
import typingsJapgolly.baseui.anon.sizeIconPropssizeIconProp
import typingsJapgolly.baseui.baseuiInts.`1`
import typingsJapgolly.baseui.baseuiInts.`2`
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.SMALL
    - typingsJapgolly.baseui.baseuiStrings.MEDIUM
    - typingsJapgolly.baseui.baseuiStrings.LARGE
  */
  trait ArtworkSizes extends StObject
  object ArtworkSizes {
    
    inline def LARGE: typingsJapgolly.baseui.baseuiStrings.LARGE = "LARGE".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.LARGE]
    
    inline def MEDIUM: typingsJapgolly.baseui.baseuiStrings.MEDIUM = "MEDIUM".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.MEDIUM]
    
    inline def SMALL: typingsJapgolly.baseui.baseuiStrings.SMALL = "SMALL".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.SMALL]
  }
  
  trait HeadingOverrides extends StObject {
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var EndEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var EndEnhancerDescriptionContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var HeadingContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var SubHeadingContainer: js.UndefOr[Override[Any]] = js.undefined
  }
  object HeadingOverrides {
    
    inline def apply(): HeadingOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingOverrides]
    }
    
    extension [Self <: HeadingOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setEndEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "EndEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerContainerUndefined: Self = StObject.set(x, "EndEnhancerContainer", js.undefined)
      
      inline def setEndEnhancerDescriptionContainer(value: Override[Any]): Self = StObject.set(x, "EndEnhancerDescriptionContainer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerDescriptionContainerUndefined: Self = StObject.set(x, "EndEnhancerDescriptionContainer", js.undefined)
      
      inline def setHeadingContainer(value: Override[Any]): Self = StObject.set(x, "HeadingContainer", value.asInstanceOf[js.Any])
      
      inline def setHeadingContainerUndefined: Self = StObject.set(x, "HeadingContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSubHeadingContainer(value: Override[Any]): Self = StObject.set(x, "SubHeadingContainer", value.asInstanceOf[js.Any])
      
      inline def setSubHeadingContainerUndefined: Self = StObject.set(x, "SubHeadingContainer", js.undefined)
    }
  }
  
  trait HeadingProps extends StObject {
    
    var endEnhancer: js.UndefOr[Node | ComponentType[js.Object]] = js.undefined
    
    var endEnhancerDescription: js.UndefOr[Node | ComponentType[js.Object]] = js.undefined
    
    var heading: Node | ComponentType[js.Object]
    
    var maxLines: js.UndefOr[`1` | `2`] = js.undefined
    
    var overrides: js.UndefOr[HeadingOverrides] = js.undefined
    
    var subHeading: js.UndefOr[Node | ComponentType[js.Object]] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal(heading = null)
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setEndEnhancer(value: Node | ComponentType[js.Object]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerDescription(value: Node | ComponentType[js.Object]): Self = StObject.set(x, "endEnhancerDescription", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerDescriptionNull: Self = StObject.set(x, "endEnhancerDescription", null)
      
      inline def setEndEnhancerDescriptionUndefined: Self = StObject.set(x, "endEnhancerDescription", js.undefined)
      
      inline def setEndEnhancerDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endEnhancerDescription", js.Array(value*))
      
      inline def setEndEnhancerDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "endEnhancerDescription", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEndEnhancerNull: Self = StObject.set(x, "endEnhancer", null)
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setEndEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endEnhancer", js.Array(value*))
      
      inline def setEndEnhancerVdomElement(value: VdomElement): Self = StObject.set(x, "endEnhancer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeading(value: Node | ComponentType[js.Object]): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingNull: Self = StObject.set(x, "heading", null)
      
      inline def setHeadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "heading", js.Array(value*))
      
      inline def setHeadingVdomElement(value: VdomElement): Self = StObject.set(x, "heading", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxLines(value: `1` | `2`): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setOverrides(value: HeadingOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSubHeading(value: Node | ComponentType[js.Object]): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
      
      inline def setSubHeadingNull: Self = StObject.set(x, "subHeading", null)
      
      inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
      
      inline def setSubHeadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subHeading", js.Array(value*))
      
      inline def setSubHeadingVdomElement(value: VdomElement): Self = StObject.set(x, "subHeading", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait LabelOverrides extends StObject {
    
    var LabelContent: js.UndefOr[Override[Any]] = js.undefined
    
    var LabelDescription: js.UndefOr[Override[Any]] = js.undefined
    
    var LabelSublistContent: js.UndefOr[Override[Any]] = js.undefined
  }
  object LabelOverrides {
    
    inline def apply(): LabelOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOverrides]
    }
    
    extension [Self <: LabelOverrides](x: Self) {
      
      inline def setLabelContent(value: Override[Any]): Self = StObject.set(x, "LabelContent", value.asInstanceOf[js.Any])
      
      inline def setLabelContentUndefined: Self = StObject.set(x, "LabelContent", js.undefined)
      
      inline def setLabelDescription(value: Override[Any]): Self = StObject.set(x, "LabelDescription", value.asInstanceOf[js.Any])
      
      inline def setLabelDescriptionUndefined: Self = StObject.set(x, "LabelDescription", js.undefined)
      
      inline def setLabelSublistContent(value: Override[Any]): Self = StObject.set(x, "LabelSublistContent", value.asInstanceOf[js.Any])
      
      inline def setLabelSublistContentUndefined: Self = StObject.set(x, "LabelSublistContent", js.undefined)
    }
  }
  
  trait LabelProps extends StObject {
    
    var children: Node
    
    var description: js.UndefOr[Node] = js.undefined
    
    var overrides: js.UndefOr[LabelOverrides] = js.undefined
    
    var sublist: js.UndefOr[Boolean] = js.undefined
  }
  object LabelProps {
    
    inline def apply(): LabelProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[LabelProps]
    }
    
    extension [Self <: LabelProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverrides(value: LabelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSublist(value: Boolean): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
      
      inline def setSublistUndefined: Self = StObject.set(x, "sublist", js.undefined)
    }
  }
  
  trait ListOverrides extends StObject {
    
    var ArtworkContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var EndEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object ListOverrides {
    
    inline def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    extension [Self <: ListOverrides](x: Self) {
      
      inline def setArtworkContainer(value: Override[Any]): Self = StObject.set(x, "ArtworkContainer", value.asInstanceOf[js.Any])
      
      inline def setArtworkContainerUndefined: Self = StObject.set(x, "ArtworkContainer", js.undefined)
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setEndEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "EndEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerContainerUndefined: Self = StObject.set(x, "EndEnhancerContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait ListProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var `aria-selected`: js.UndefOr[Boolean] = js.undefined
    
    var artwork: js.UndefOr[ComponentType[sizeIconPropssizeIconProp]] = js.undefined
    
    var artworkSize: js.UndefOr[ArtworkSizes | Double] = js.undefined
    
    var children: Node
    
    var endEnhancer: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[Shape] = js.undefined
    
    var sublist: js.UndefOr[Boolean] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def setArtwork(value: ComponentType[sizeIconPropssizeIconProp]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkSize(value: ArtworkSizes | Double): Self = StObject.set(x, "artworkSize", value.asInstanceOf[js.Any])
      
      inline def setArtworkSizeUndefined: Self = StObject.set(x, "artworkSize", js.undefined)
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEndEnhancer(value: ComponentType[js.Object]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSublist(value: Boolean): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
      
      inline def setSublistUndefined: Self = StObject.set(x, "sublist", js.undefined)
    }
  }
  
  trait MenuAdapterProps
    extends StObject
       with ListProps {
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isHighlighted")
    var $isHighlighted: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
    
    var item: js.UndefOr[Any] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* a */ MouseEvent, Any]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function1[/* a */ MouseEvent, Any]] = js.undefined
  }
  object MenuAdapterProps {
    
    inline def apply(): MenuAdapterProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MenuAdapterProps]
    }
    
    extension [Self <: MenuAdapterProps](x: Self) {
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
      
      inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
      
      inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOnClick(value: /* a */ MouseEvent => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: /* a */ MouseEvent => Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.DEFAULT
    - typingsJapgolly.baseui.baseuiStrings.ROUND
  */
  trait Shape extends StObject
  object Shape {
    
    inline def DEFAULT: typingsJapgolly.baseui.baseuiStrings.DEFAULT = "DEFAULT".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.DEFAULT]
    
    inline def ROUND: typingsJapgolly.baseui.baseuiStrings.ROUND = "ROUND".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.ROUND]
  }
  
  trait StyledArtworkContainerProps extends StObject {
    
    @JSName("$artworkSize")
    var $artworkSize: ArtworkSizes | Double
    
    @JSName("$sublist")
    var $sublist: js.UndefOr[Boolean] = js.undefined
  }
  object StyledArtworkContainerProps {
    
    inline def apply($artworkSize: ArtworkSizes | Double): StyledArtworkContainerProps = {
      val __obj = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledArtworkContainerProps]
    }
    
    extension [Self <: StyledArtworkContainerProps](x: Self) {
      
      inline def set$artworkSize(value: ArtworkSizes | Double): Self = StObject.set(x, "$artworkSize", value.asInstanceOf[js.Any])
      
      inline def set$sublist(value: Boolean): Self = StObject.set(x, "$sublist", value.asInstanceOf[js.Any])
      
      inline def set$sublistUndefined: Self = StObject.set(x, "$sublist", js.undefined)
    }
  }
  
  trait StyledContentProps extends StObject {
    
    @JSName("$mLeft")
    var $mLeft: Boolean
    
    @JSName("$sublist")
    var $sublist: Boolean
  }
  object StyledContentProps {
    
    inline def apply($mLeft: Boolean, $sublist: Boolean): StyledContentProps = {
      val __obj = js.Dynamic.literal($mLeft = $mLeft.asInstanceOf[js.Any], $sublist = $sublist.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledContentProps]
    }
    
    extension [Self <: StyledContentProps](x: Self) {
      
      inline def set$mLeft(value: Boolean): Self = StObject.set(x, "$mLeft", value.asInstanceOf[js.Any])
      
      inline def set$sublist(value: Boolean): Self = StObject.set(x, "$sublist", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyledHeadingHeadingProps extends StObject {
    
    @JSName("$maxLines")
    var $maxLines: Double
  }
  object StyledHeadingHeadingProps {
    
    inline def apply($maxLines: Double): StyledHeadingHeadingProps = {
      val __obj = js.Dynamic.literal($maxLines = $maxLines.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledHeadingHeadingProps]
    }
    
    extension [Self <: StyledHeadingHeadingProps](x: Self) {
      
      inline def set$maxLines(value: Double): Self = StObject.set(x, "$maxLines", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyledRootProps extends StObject {
    
    @JSName("$shape")
    var $shape: Shape
  }
  object StyledRootProps {
    
    inline def apply($shape: Shape): StyledRootProps = {
      val __obj = js.Dynamic.literal($shape = $shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledRootProps]
    }
    
    extension [Self <: StyledRootProps](x: Self) {
      
      inline def set$shape(value: Shape): Self = StObject.set(x, "$shape", value.asInstanceOf[js.Any])
    }
  }
}
