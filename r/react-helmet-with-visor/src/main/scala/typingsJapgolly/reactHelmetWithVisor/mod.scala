package typingsJapgolly.reactHelmetWithVisor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLMetaElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLStyleElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HtmlHTMLAttributes
import typingsJapgolly.react.mod.LinkHTMLAttributes
import typingsJapgolly.react.mod.MetaHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-helmet-with-visor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-helmet-with-visor", JSImport.Default)
  @js.native
  open class default protected () extends Helmet {
    def this(props: HelmetProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HelmetProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-helmet-with-visor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-helmet-with-visor", "default.canUseDOM")
    @js.native
    def canUseDOM: Boolean = js.native
    inline def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
    
    inline def peek(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")().asInstanceOf[HelmetData]
    
    inline def renderStatic(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("renderStatic")().asInstanceOf[HelmetData]
    
    inline def rewind(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("rewind")().asInstanceOf[HelmetData]
  }
  
  @JSImport("react-helmet-with-visor", "Helmet")
  @js.native
  open class Helmet protected ()
    extends Component[HelmetProps, js.Object, Any] {
    def this(props: HelmetProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HelmetProps, context: Any) = this()
  }
  /* static members */
  object Helmet {
    
    @JSImport("react-helmet-with-visor", "Helmet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-helmet-with-visor", "Helmet.canUseDOM")
    @js.native
    def canUseDOM: Boolean = js.native
    inline def canUseDOM_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canUseDOM")(x.asInstanceOf[js.Any])
    
    inline def peek(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")().asInstanceOf[HelmetData]
    
    inline def renderStatic(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("renderStatic")().asInstanceOf[HelmetData]
    
    inline def rewind(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("rewind")().asInstanceOf[HelmetData]
  }
  
  @JSImport("react-helmet-with-visor", "HelmetsOpenedVisor")
  @js.native
  open class HelmetsOpenedVisor protected ()
    extends Component[js.Object, js.Object, Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: Any) = this()
  }
  
  @JSImport("react-helmet-with-visor", "canUseDOM")
  @js.native
  val canUseDOM: Boolean = js.native
  
  inline def peek(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")().asInstanceOf[HelmetData]
  
  inline def renderStatic(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("renderStatic")().asInstanceOf[HelmetData]
  
  inline def rewind(): HelmetData = ^.asInstanceOf[js.Dynamic].applyDynamic("rewind")().asInstanceOf[HelmetData]
  
  type BodyProps = (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) & OtherElementAttributes
  
  trait HelmetData extends StObject {
    
    var base: HelmetDatum
    
    var bodyAttributes: HelmetHTMLBodyDatum
    
    var htmlAttributes: HelmetHTMLElementDatum
    
    var link: HelmetDatum
    
    var meta: HelmetDatum
    
    var noscript: HelmetDatum
    
    var openedVisor: HelmetDatum
    
    var script: HelmetDatum
    
    var style: HelmetDatum
    
    var title: HelmetDatum
    
    var titleAttributes: HelmetDatum
  }
  object HelmetData {
    
    inline def apply(
      base: HelmetDatum,
      bodyAttributes: HelmetHTMLBodyDatum,
      htmlAttributes: HelmetHTMLElementDatum,
      link: HelmetDatum,
      meta: HelmetDatum,
      noscript: HelmetDatum,
      openedVisor: HelmetDatum,
      script: HelmetDatum,
      style: HelmetDatum,
      title: HelmetDatum,
      titleAttributes: HelmetDatum
    ): HelmetData = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], bodyAttributes = bodyAttributes.asInstanceOf[js.Any], htmlAttributes = htmlAttributes.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], openedVisor = openedVisor.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleAttributes = titleAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetData]
    }
    
    extension [Self <: HelmetData](x: Self) {
      
      inline def setBase(value: HelmetDatum): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBodyAttributes(value: HelmetHTMLBodyDatum): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributes(value: HelmetHTMLElementDatum): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setLink(value: HelmetDatum): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: HelmetDatum): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setNoscript(value: HelmetDatum): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setOpenedVisor(value: HelmetDatum): Self = StObject.set(x, "openedVisor", value.asInstanceOf[js.Any])
      
      inline def setScript(value: HelmetDatum): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: HelmetDatum): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: HelmetDatum): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributes(value: HelmetDatum): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelmetDatum extends StObject {
    
    def toComponent(): Element
  }
  object HelmetDatum {
    
    inline def apply(toComponent: CallbackTo[Element]): HelmetDatum = {
      val __obj = js.Dynamic.literal(toComponent = toComponent.toJsFn)
      __obj.asInstanceOf[HelmetDatum]
    }
    
    extension [Self <: HelmetDatum](x: Self) {
      
      inline def setToComponent(value: CallbackTo[Element]): Self = StObject.set(x, "toComponent", value.toJsFn)
    }
  }
  
  trait HelmetHTMLBodyDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLBodyElement]
  }
  object HelmetHTMLBodyDatum {
    
    inline def apply(toComponent: CallbackTo[HTMLAttributes[HTMLBodyElement]]): HelmetHTMLBodyDatum = {
      val __obj = js.Dynamic.literal(toComponent = toComponent.toJsFn)
      __obj.asInstanceOf[HelmetHTMLBodyDatum]
    }
    
    extension [Self <: HelmetHTMLBodyDatum](x: Self) {
      
      inline def setToComponent(value: CallbackTo[HTMLAttributes[HTMLBodyElement]]): Self = StObject.set(x, "toComponent", value.toJsFn)
    }
  }
  
  trait HelmetHTMLElementDatum extends StObject {
    
    def toComponent(): HTMLAttributes[HTMLHtmlElement]
  }
  object HelmetHTMLElementDatum {
    
    inline def apply(toComponent: CallbackTo[HTMLAttributes[HTMLHtmlElement]]): HelmetHTMLElementDatum = {
      val __obj = js.Dynamic.literal(toComponent = toComponent.toJsFn)
      __obj.asInstanceOf[HelmetHTMLElementDatum]
    }
    
    extension [Self <: HelmetHTMLElementDatum](x: Self) {
      
      inline def setToComponent(value: CallbackTo[HTMLAttributes[HTMLHtmlElement]]): Self = StObject.set(x, "toComponent", value.toJsFn)
    }
  }
  
  trait HelmetProps extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var base: js.UndefOr[Any] = js.undefined
    
    var bodyAttributes: js.UndefOr[BodyProps] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultTitle: js.UndefOr[String] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined
    
    var htmlAttributes: js.UndefOr[HtmlProps] = js.undefined
    
    var link: js.UndefOr[js.Array[LinkProps]] = js.undefined
    
    var meta: js.UndefOr[js.Array[MetaProps]] = js.undefined
    
    var noscript: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onChangeClientState: js.UndefOr[
        js.Function3[/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags, Unit]
      ] = js.undefined
    
    var script: js.UndefOr[js.Array[Any]] = js.undefined
    
    var style: js.UndefOr[js.Array[Any]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleAttributes: js.UndefOr[js.Object] = js.undefined
    
    var titleTemplate: js.UndefOr[String] = js.undefined
  }
  object HelmetProps {
    
    inline def apply(): HelmetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelmetProps]
    }
    
    extension [Self <: HelmetProps](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBodyAttributes(value: BodyProps): Self = StObject.set(x, "bodyAttributes", value.asInstanceOf[js.Any])
      
      inline def setBodyAttributesUndefined: Self = StObject.set(x, "bodyAttributes", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultTitle(value: String): Self = StObject.set(x, "defaultTitle", value.asInstanceOf[js.Any])
      
      inline def setDefaultTitleUndefined: Self = StObject.set(x, "defaultTitle", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setEncodeSpecialCharacters(value: Boolean): Self = StObject.set(x, "encodeSpecialCharacters", value.asInstanceOf[js.Any])
      
      inline def setEncodeSpecialCharactersUndefined: Self = StObject.set(x, "encodeSpecialCharacters", js.undefined)
      
      inline def setHtmlAttributes(value: HtmlProps): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setLink(value: js.Array[LinkProps]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setLinkVarargs(value: LinkProps*): Self = StObject.set(x, "link", js.Array(value*))
      
      inline def setMeta(value: js.Array[MetaProps]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMetaVarargs(value: MetaProps*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setNoscript(value: js.Array[Any]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
      
      inline def setNoscriptUndefined: Self = StObject.set(x, "noscript", js.undefined)
      
      inline def setNoscriptVarargs(value: Any*): Self = StObject.set(x, "noscript", js.Array(value*))
      
      inline def setOnChangeClientState(value: (/* newState */ Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Callback): Self = StObject.set(x, "onChangeClientState", js.Any.fromFunction3((t0: /* newState */ Any, t1: /* addedTags */ HelmetTags, t2: /* removedTags */ HelmetTags) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeClientStateUndefined: Self = StObject.set(x, "onChangeClientState", js.undefined)
      
      inline def setScript(value: js.Array[Any]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setScriptVarargs(value: Any*): Self = StObject.set(x, "script", js.Array(value*))
      
      inline def setStyle(value: js.Array[Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: Any*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributes(value: js.Object): Self = StObject.set(x, "titleAttributes", value.asInstanceOf[js.Any])
      
      inline def setTitleAttributesUndefined: Self = StObject.set(x, "titleAttributes", js.undefined)
      
      inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait HelmetTags extends StObject {
    
    var baseTag: js.Array[Any]
    
    var linkTags: js.Array[HTMLLinkElement]
    
    var metaTags: js.Array[HTMLMetaElement]
    
    var noscriptTags: js.Array[Any]
    
    var openedVisorTags: js.Array[Any]
    
    var scriptTags: js.Array[HTMLScriptElement]
    
    var styleTags: js.Array[HTMLStyleElement]
  }
  object HelmetTags {
    
    inline def apply(
      baseTag: js.Array[Any],
      linkTags: js.Array[HTMLLinkElement],
      metaTags: js.Array[HTMLMetaElement],
      noscriptTags: js.Array[Any],
      openedVisorTags: js.Array[Any],
      scriptTags: js.Array[HTMLScriptElement],
      styleTags: js.Array[HTMLStyleElement]
    ): HelmetTags = {
      val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], openedVisorTags = openedVisorTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelmetTags]
    }
    
    extension [Self <: HelmetTags](x: Self) {
      
      inline def setBaseTag(value: js.Array[Any]): Self = StObject.set(x, "baseTag", value.asInstanceOf[js.Any])
      
      inline def setBaseTagVarargs(value: Any*): Self = StObject.set(x, "baseTag", js.Array(value*))
      
      inline def setLinkTags(value: js.Array[HTMLLinkElement]): Self = StObject.set(x, "linkTags", value.asInstanceOf[js.Any])
      
      inline def setLinkTagsVarargs(value: HTMLLinkElement*): Self = StObject.set(x, "linkTags", js.Array(value*))
      
      inline def setMetaTags(value: js.Array[HTMLMetaElement]): Self = StObject.set(x, "metaTags", value.asInstanceOf[js.Any])
      
      inline def setMetaTagsVarargs(value: HTMLMetaElement*): Self = StObject.set(x, "metaTags", js.Array(value*))
      
      inline def setNoscriptTags(value: js.Array[Any]): Self = StObject.set(x, "noscriptTags", value.asInstanceOf[js.Any])
      
      inline def setNoscriptTagsVarargs(value: Any*): Self = StObject.set(x, "noscriptTags", js.Array(value*))
      
      inline def setOpenedVisorTags(value: js.Array[Any]): Self = StObject.set(x, "openedVisorTags", value.asInstanceOf[js.Any])
      
      inline def setOpenedVisorTagsVarargs(value: Any*): Self = StObject.set(x, "openedVisorTags", js.Array(value*))
      
      inline def setScriptTags(value: js.Array[HTMLScriptElement]): Self = StObject.set(x, "scriptTags", value.asInstanceOf[js.Any])
      
      inline def setScriptTagsVarargs(value: HTMLScriptElement*): Self = StObject.set(x, "scriptTags", js.Array(value*))
      
      inline def setStyleTags(value: js.Array[HTMLStyleElement]): Self = StObject.set(x, "styleTags", value.asInstanceOf[js.Any])
      
      inline def setStyleTagsVarargs(value: HTMLStyleElement*): Self = StObject.set(x, "styleTags", js.Array(value*))
    }
  }
  
  type HtmlProps = (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) & OtherElementAttributes
  
  type LinkProps = DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
  
  type MetaProps = DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
  
  type OtherElementAttributes = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
}
