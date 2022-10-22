package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.ClassNameStyle
import typingsJapgolly.wixStyleReact.distTypesCommonMod.ScrollableContainerCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageMod {
  
  @JSImport("wix-style-react/dist/types/Page", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PageProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Page", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Page", "default.Content")
    @js.native
    def Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<ContentProps> */ Any = js.native
    inline def Content_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<ContentProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.FixedContent")
    @js.native
    def FixedContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<FixedContentProps> */ Any = js.native
    inline def FixedContent_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<FixedContentProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedContent")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.FixedFooter")
    @js.native
    def FixedFooter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<FixedFooterProps> */ Any = js.native
    inline def FixedFooter_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<FixedFooterProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedFooter")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Header")
    @js.native
    def Header: Instantiable0[typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.default] = js.native
    inline def Header_=(x: Instantiable0[typingsJapgolly.wixStyleReact.distTypesPageHeaderMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Sticky")
    @js.native
    def Sticky: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<StickyProps> */ Any = js.native
    inline def Sticky_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<StickyProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sticky")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Page", "default.Tail")
    @js.native
    def Tail: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TailProps> */ Any = js.native
    inline def Tail_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<TailProps> */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tail")(x.asInstanceOf[js.Any])
  }
  
  trait ContentProps extends StObject {
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    var fullScreen: js.UndefOr[Boolean] = js.undefined
  }
  object ContentProps {
    
    inline def apply(): ContentProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    }
  }
  
  trait FixedContentProps extends StObject {
    
    var children: Element
  }
  object FixedContentProps {
    
    inline def apply(children: VdomElement): FixedContentProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedContentProps]
    }
    
    extension [Self <: FixedContentProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait FixedFooterProps extends StObject {
    
    var children: Element
  }
  object FixedFooterProps {
    
    inline def apply(children: VdomElement): FixedFooterProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedFooterProps]
    }
    
    extension [Self <: FixedFooterProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type Page = PureComponent[PageProps, js.Object, Any]
  
  trait PageProps extends StObject {
    
    var backgroundImageUrl: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gradientClassName: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var scrollProps: js.UndefOr[ScrollableContainerCommonProps] = js.undefined
    
    var scrollableContentRef: js.UndefOr[js.Function1[/* ref */ HTMLElement, Unit]] = js.undefined
    
    var sidePadding: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PageProps {
    
    inline def apply(): PageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageProps]
    }
    
    extension [Self <: PageProps](x: Self) {
      
      inline def setBackgroundImageUrl(value: String): Self = StObject.set(x, "backgroundImageUrl", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUrlUndefined: Self = StObject.set(x, "backgroundImageUrl", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setGradientClassName(value: String): Self = StObject.set(x, "gradientClassName", value.asInstanceOf[js.Any])
      
      inline def setGradientClassNameUndefined: Self = StObject.set(x, "gradientClassName", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setScrollProps(value: ScrollableContainerCommonProps): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
      
      inline def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
      
      inline def setScrollableContentRef(value: /* ref */ HTMLElement => Callback): Self = StObject.set(x, "scrollableContentRef", js.Any.fromFunction1((t0: /* ref */ HTMLElement) => value(t0).runNow()))
      
      inline def setScrollableContentRefUndefined: Self = StObject.set(x, "scrollableContentRef", js.undefined)
      
      inline def setSidePadding(value: Double): Self = StObject.set(x, "sidePadding", value.asInstanceOf[js.Any])
      
      inline def setSidePaddingUndefined: Self = StObject.set(x, "sidePadding", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type StickyChildrenRenderFn = js.Function1[/* data */ ClassNameStyle, Element]
  
  trait StickyProps extends StObject {
    
    var children: Element | StickyChildrenRenderFn
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyProps {
    
    inline def apply(children: Element | StickyChildrenRenderFn): StickyProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[StickyProps]
    }
    
    extension [Self <: StickyProps](x: Self) {
      
      inline def setChildren(value: Element | StickyChildrenRenderFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ ClassNameStyle => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TailProps extends StObject {
    
    var children: Element
    
    var minimized: js.UndefOr[Boolean] = js.undefined
  }
  object TailProps {
    
    inline def apply(children: VdomElement): TailProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[TailProps]
    }
    
    extension [Self <: TailProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      inline def setMinimizedUndefined: Self = StObject.set(x, "minimized", js.undefined)
    }
  }
}
