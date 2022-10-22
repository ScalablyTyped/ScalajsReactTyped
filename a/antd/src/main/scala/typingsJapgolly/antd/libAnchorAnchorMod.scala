package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.Window
import typingsJapgolly.antd.anon.ActiveLink
import typingsJapgolly.antd.anon.Href
import typingsJapgolly.antd.libConfigProviderContextMod.ConfigConsumerProps
import typingsJapgolly.memoizeOne.mod.MemoizedFn
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnchorAnchorMod extends Shortcut {
  
  @JSImport("antd/lib/anchor/Anchor", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AnchorProps & RefAttributes[Anchor]] = js.native
  
  @js.native
  trait Anchor extends Component[InternalAnchorProps, AnchorState, ConfigConsumerProps] {
    
    /* private */ var animating: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MAnchor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAnchor(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAnchor(): Unit = js.native
    
    @JSName("context")
    var context_Anchor: ConfigConsumerProps = js.native
    
    def getContainer(): AnchorContainer = js.native
    
    def getCurrentAnchor(): String = js.native
    def getCurrentAnchor(offsetTop: Double): String = js.native
    def getCurrentAnchor(offsetTop: Double, bounds: Double): String = js.native
    def getCurrentAnchor(offsetTop: Unit, bounds: Double): String = js.native
    
    var getMemoizedContextValue: MemoizedFn[
        js.Function2[
          /* link */ String | Null, 
          /* onClickFn */ js.UndefOr[js.Function2[/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href, Unit]], 
          AntAnchor
        ]
      ] = js.native
    
    def handleScroll(): Unit = js.native
    
    def handleScrollTo(link: String): Unit = js.native
    
    /* private */ var inkNode: Any = js.native
    
    /* private */ var links: Any = js.native
    
    /* private */ var prefixCls: Any = js.native
    
    def registerLink(link: String): Unit = js.native
    
    def saveInkNode(node: HTMLSpanElement): Unit = js.native
    
    /* private */ var scrollContainer: Any = js.native
    
    /* private */ var scrollEvent: Any = js.native
    
    def setCurrentActiveLink(link: String): Unit = js.native
    def setCurrentActiveLink(link: String, triggerChange: Boolean): Unit = js.native
    
    @JSName("state")
    var state_Anchor: ActiveLink = js.native
    
    def unregisterLink(link: String): Unit = js.native
    
    def updateInk(): Unit = js.native
    
    /* private */ var wrapperRef: Any = js.native
  }
  
  type AnchorContainer = HTMLElement | Window
  
  trait AnchorDefaultProps
    extends StObject
       with AnchorProps {
    
    @JSName("affix")
    var affix_AnchorDefaultProps: Boolean
    
    @JSName("getContainer")
    def getContainer_MAnchorDefaultProps(): AnchorContainer
    
    @JSName("prefixCls")
    var prefixCls_AnchorDefaultProps: String
    
    @JSName("showInkInFixed")
    var showInkInFixed_AnchorDefaultProps: Boolean
  }
  object AnchorDefaultProps {
    
    inline def apply(
      affix: Boolean,
      getContainer: CallbackTo[AnchorContainer],
      prefixCls: String,
      showInkInFixed: Boolean
    ): AnchorDefaultProps = {
      val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = getContainer.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorDefaultProps]
    }
    
    extension [Self <: AnchorDefaultProps](x: Self) {
      
      inline def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      inline def setGetContainer(value: CallbackTo[AnchorContainer]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnchorProps extends StObject {
    
    var affix: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.undefined
    
    /** Return customize highlight anchor */
    var getCurrentAnchor: js.UndefOr[js.Function1[/* activeLink */ String, String]] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    /** Listening event when scrolling change active link */
    var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.undefined
    
    var onClick: js.UndefOr[js.Function2[/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href, Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showInkInFixed: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
    var targetOffset: js.UndefOr[Double] = js.undefined
  }
  object AnchorProps {
    
    inline def apply(): AnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnchorProps]
    }
    
    extension [Self <: AnchorProps](x: Self) {
      
      inline def setAffix(value: Boolean): Self = StObject.set(x, "affix", value.asInstanceOf[js.Any])
      
      inline def setAffixUndefined: Self = StObject.set(x, "affix", js.undefined)
      
      inline def setBounds(value: Double): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setGetContainer(value: CallbackTo[AnchorContainer]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setGetCurrentAnchor(value: /* activeLink */ String => String): Self = StObject.set(x, "getCurrentAnchor", js.Any.fromFunction1(value))
      
      inline def setGetCurrentAnchorUndefined: Self = StObject.set(x, "getCurrentAnchor", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOnChange(value: /* currentActiveLink */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* currentActiveLink */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLElement], t1: /* link */ Href) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowInkInFixed(value: Boolean): Self = StObject.set(x, "showInkInFixed", value.asInstanceOf[js.Any])
      
      inline def setShowInkInFixedUndefined: Self = StObject.set(x, "showInkInFixed", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOffset(value: Double): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
    }
  }
  
  trait AnchorState extends StObject {
    
    var activeLink: Null | String
  }
  object AnchorState {
    
    inline def apply(): AnchorState = {
      val __obj = js.Dynamic.literal(activeLink = null)
      __obj.asInstanceOf[AnchorState]
    }
    
    extension [Self <: AnchorState](x: Self) {
      
      inline def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
    }
  }
  
  trait AntAnchor extends StObject {
    
    var activeLink: String | Null
    
    var onClick: js.UndefOr[js.Function2[/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href, Unit]] = js.undefined
    
    def registerLink(link: String): Unit
    
    def scrollTo(link: String): Unit
    
    def unregisterLink(link: String): Unit
  }
  object AntAnchor {
    
    inline def apply(registerLink: String => Callback, scrollTo: String => Callback, unregisterLink: String => Callback): AntAnchor = {
      val __obj = js.Dynamic.literal(registerLink = js.Any.fromFunction1((t0: String) => registerLink(t0).runNow()), scrollTo = js.Any.fromFunction1((t0: String) => scrollTo(t0).runNow()), unregisterLink = js.Any.fromFunction1((t0: String) => unregisterLink(t0).runNow()), activeLink = null)
      __obj.asInstanceOf[AntAnchor]
    }
    
    extension [Self <: AntAnchor](x: Self) {
      
      inline def setActiveLink(value: String): Self = StObject.set(x, "activeLink", value.asInstanceOf[js.Any])
      
      inline def setActiveLinkNull: Self = StObject.set(x, "activeLink", null)
      
      inline def setOnClick(value: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Href) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[HTMLElement], t1: /* link */ Href) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRegisterLink(value: String => Callback): Self = StObject.set(x, "registerLink", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setScrollTo(value: String => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUnregisterLink(value: String => Callback): Self = StObject.set(x, "unregisterLink", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type InternalAnchorClass = Anchor
  
  trait InternalAnchorProps
    extends StObject
       with AnchorProps {
    
    var anchorPrefixCls: String
  }
  object InternalAnchorProps {
    
    inline def apply(anchorPrefixCls: String): InternalAnchorProps = {
      val __obj = js.Dynamic.literal(anchorPrefixCls = anchorPrefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalAnchorProps]
    }
    
    extension [Self <: InternalAnchorProps](x: Self) {
      
      inline def setAnchorPrefixCls(value: String): Self = StObject.set(x, "anchorPrefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[AnchorProps & RefAttributes[Anchor]]
  
  /* This means you don't have to write `default`, but can instead just say `libAnchorAnchorMod.foo` */
  override def _to: ForwardRefExoticComponent[AnchorProps & RefAttributes[Anchor]] = default
}
