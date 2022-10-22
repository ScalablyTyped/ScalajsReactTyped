package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.anon.Size
import typingsJapgolly.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bannerTypesMod {
  
  trait ActionContent extends StObject {
    
    var icon: js.UndefOr[js.Function1[/* a */ Size, Node]] = js.undefined
    
    var label: String
    
    def onClick(a: ReactEventFrom[HTMLButtonElement]): Any
    
    var position: js.UndefOr[ActionPosition] = js.undefined
  }
  object ActionContent {
    
    inline def apply(label: String, onClick: ReactEventFrom[HTMLButtonElement] => Any): ActionContent = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ActionContent]
    }
    
    extension [Self <: ActionContent](x: Self) {
      
      inline def setIcon(value: /* a */ Size => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactEventFrom[HTMLButtonElement] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPosition(value: ActionPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.below
    - typingsJapgolly.baseui.baseuiStrings.trailing
  */
  trait ActionPosition extends StObject
  
  trait ArtworkContent extends StObject {
    
    def icon(a: Size): Node
    
    var `type`: js.UndefOr[ArtworkType] = js.undefined
  }
  object ArtworkContent {
    
    inline def apply(icon: Size => Node): ArtworkContent = {
      val __obj = js.Dynamic.literal(icon = js.Any.fromFunction1(icon))
      __obj.asInstanceOf[ArtworkContent]
    }
    
    extension [Self <: ArtworkContent](x: Self) {
      
      inline def setIcon(value: Size => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setType(value: ArtworkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.icon
    - typingsJapgolly.baseui.baseuiStrings.badge
  */
  trait ArtworkType extends StObject
  
  trait BannerOverrides extends StObject {
    
    var BelowContent: js.UndefOr[Override[Any]] = js.undefined
    
    var LeadingContent: js.UndefOr[Override[Any]] = js.undefined
    
    var Message: js.UndefOr[Override[Any]] = js.undefined
    
    var MessageContent: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Title: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingButtonContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingContent: js.UndefOr[Override[Any]] = js.undefined
    
    var TrailingIconButton: js.UndefOr[Override[Any]] = js.undefined
  }
  object BannerOverrides {
    
    inline def apply(): BannerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BannerOverrides]
    }
    
    extension [Self <: BannerOverrides](x: Self) {
      
      inline def setBelowContent(value: Override[Any]): Self = StObject.set(x, "BelowContent", value.asInstanceOf[js.Any])
      
      inline def setBelowContentUndefined: Self = StObject.set(x, "BelowContent", js.undefined)
      
      inline def setLeadingContent(value: Override[Any]): Self = StObject.set(x, "LeadingContent", value.asInstanceOf[js.Any])
      
      inline def setLeadingContentUndefined: Self = StObject.set(x, "LeadingContent", js.undefined)
      
      inline def setMessage(value: Override[Any]): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageContent(value: Override[Any]): Self = StObject.set(x, "MessageContent", value.asInstanceOf[js.Any])
      
      inline def setMessageContentUndefined: Self = StObject.set(x, "MessageContent", js.undefined)
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setTitle(value: Override[Any]): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      inline def setTrailingButtonContainer(value: Override[Any]): Self = StObject.set(x, "TrailingButtonContainer", value.asInstanceOf[js.Any])
      
      inline def setTrailingButtonContainerUndefined: Self = StObject.set(x, "TrailingButtonContainer", js.undefined)
      
      inline def setTrailingContent(value: Override[Any]): Self = StObject.set(x, "TrailingContent", value.asInstanceOf[js.Any])
      
      inline def setTrailingContentUndefined: Self = StObject.set(x, "TrailingContent", js.undefined)
      
      inline def setTrailingIconButton(value: Override[Any]): Self = StObject.set(x, "TrailingIconButton", value.asInstanceOf[js.Any])
      
      inline def setTrailingIconButtonUndefined: Self = StObject.set(x, "TrailingIconButton", js.undefined)
    }
  }
  
  trait BannerProps extends StObject {
    
    var action: js.UndefOr[ActionContent] = js.undefined
    
    var artwork: js.UndefOr[ArtworkContent] = js.undefined
    
    var children: Node
    
    var hierarchy: js.UndefOr[Hierarchy] = js.undefined
    
    var kind: js.UndefOr[Kind] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[BannerOverrides] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object BannerProps {
    
    inline def apply(): BannerProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[BannerProps]
    }
    
    extension [Self <: BannerProps](x: Self) {
      
      inline def setAction(value: ActionContent): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setArtwork(value: ArtworkContent): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setOverrides(value: BannerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.low
    - typingsJapgolly.baseui.baseuiStrings.high
  */
  trait Hierarchy extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.info
    - typingsJapgolly.baseui.baseuiStrings.negative
    - typingsJapgolly.baseui.baseuiStrings.positive
    - typingsJapgolly.baseui.baseuiStrings.warning
  */
  trait Kind extends StObject
}
