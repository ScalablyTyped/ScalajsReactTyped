package typingsJapgolly.luminoVirtualdom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.Text
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.luminoVirtualdom.anon.Attrs
import typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.element
import typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.text
import typingsJapgolly.luminoVirtualdom.mod.VirtualElement.IRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/virtualdom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object VirtualDOM {
    
    @JSImport("@lumino/virtualdom", "VirtualDOM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def realize(node: VirtualElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("realize")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    /**
      * Create a real DOM element from a virtual element node.
      *
      * @param node - The virtual element node to realize.
      *
      * @returns A new DOM element for the given virtual element node.
      *
      * #### Notes
      * This creates a brand new *real* DOM element with a structure which
      * matches the given virtual DOM node.
      *
      * If virtual diffing is desired, use the `render` function instead.
      */
    inline def realize(node: VirtualText): Text = ^.asInstanceOf[js.Dynamic].applyDynamic("realize")(node.asInstanceOf[js.Any]).asInstanceOf[Text]
    
    inline def render(content: js.Array[VirtualNode], host: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(content.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(content: Null, host: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(content.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Render virtual DOM content into a host element.
      *
      * @param content - The virtual DOM content to render.
      *
      * @param host - The host element for the rendered content.
      *
      * #### Notes
      * This renders the delta from the previous rendering. It assumes that
      * the content of the host element is not manipulated by external code.
      *
      * Providing `null` content will clear the rendering.
      *
      * Externally modifying the provided content or the host element will
      * result in undefined rendering behavior.
      */
    inline def render(content: VirtualNode, host: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(content.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@lumino/virtualdom", "VirtualElement")
  @js.native
  open class VirtualElement protected ()
    extends StObject
       with VirtualNode {
    /**
      * Construct a new virtual element node.
      *
      * @param tag - The element tag name.
      *
      * @param attrs - The element attributes.
      *
      * @param children - The element children.
      *
      * @param renderer - An optional custom renderer for the element.
      */
    def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode]) = this()
    def this(tag: String, attrs: ElementAttrs, children: js.Array[VirtualNode], renderer: IRenderer) = this()
    
    /**
      * The attributes for the element.
      */
    val attrs: ElementAttrs = js.native
    
    /**
      * The children for the element.
      */
    val children: js.Array[VirtualNode] = js.native
    
    /**
      * An optional custom renderer for the element's children. If set, on render
      * this element's DOM node and it's attrs will be created/updated as normal.
      * At that point the DOM node is handed off to the renderer.
      */
    val renderer: js.UndefOr[IRenderer] = js.native
    
    /**
      * The tag name for the element.
      */
    val tag: String = js.native
    
    /**
      * The type of the node.
      *
      * This value can be used as a type guard for discriminating the
      * `VirtualNode` union type.
      */
    val `type`: element = js.native
  }
  object VirtualElement {
    
    /**
      * A type describing a custom element renderer
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Customize how a DOM node is rendered. If .renderer is set on a given
        * instance of VirtualElement, this function will be called every time
        * that VirtualElement is rendered.
        *
        * @param host - The actual DOM node created for a VirtualElement during
        * rendering.
        *
        * On render, host is created and its attrs are set/updated via
        * the standard routines in updateContent. host is then handed off to this
        * function.
        *
        * The render function is free to modify host. The only restriction is
        * is that render should not modify any attributes set by external
        * routines (ie updateContent), as this may cause thrashing when the
        * virtual element is next rendered.
        *
        * @param options - Will be populated with the .attrs and .children fields
        * set on the VirtualElement being rendered.
        */
      def render(host: HTMLElement): Unit = js.native
      def render(host: HTMLElement, options: Attrs): Unit = js.native
      
      /**
        * Optional cleanup function for custom renderers. If the .renderer field
        * of a VirtualELement is set, and if .renderer.unrender is defined, when
        * the element is changed or removed its corresponding DOM element will be
        * passed to this function immediately before it is removed from the DOM.
        *
        * unrender is not required for for simple renderers, such as those
        * implemented using `document.createElement()`. However, for certain
        * rendering techniques explicit cleanup is required in order to avoid
        * resource leaks.
        *
        * For example, if render calls `ReactDOM.render(..., host)`, then
        * there has to also be a corresponding implementation of unrender that
        * calls `ReactDOM.unmountComponentAtNode(host)` in order to prevent
        * a memory leak.
        *
        * @param host - the DOM element to be removed.
        *
        * @param options - Will be populated with the .attrs and .children fields
        * set on the VirtualElement being unrendered.
        */
      var unrender: js.UndefOr[js.Function2[/* host */ HTMLElement, /* options */ js.UndefOr[Attrs], Unit]] = js.native
    }
  }
  
  @JSImport("@lumino/virtualdom", "VirtualElementPass")
  @js.native
  open class VirtualElementPass protected () extends VirtualElement {
    /**
      * DEPRECATED - use VirtualElement with a defined renderer param instead
      *
      * Construct a new virtual element pass thru node.
      *
      * @param tag - the tag of the parent element of this node. Once the parent
      * element is rendered, it will be passed as an argument to
      * renderer.render
      *
      * @param attrs - attributes that will assigned to the
      * parent element
      *
      * @param renderer - an object with render and unrender
      * functions, each of which should take a single argument of type
      * HTMLElement and return nothing. If null, the parent element
      * will be rendered barren without any children.
      */
    def this(tag: String, attrs: ElementAttrs) = this()
    def this(
      tag: String,
      attrs: ElementAttrs,
      renderer: typingsJapgolly.luminoVirtualdom.mod.VirtualElementPass.IRenderer
    ) = this()
  }
  object VirtualElementPass {
    
    /**
      * DEPRECATED - use VirtualElement.IRenderer instead
      *
      * A type describing a custom element renderer
      */
    type IRenderer = typingsJapgolly.luminoVirtualdom.mod.VirtualElement.IRenderer
  }
  
  @JSImport("@lumino/virtualdom", "VirtualText")
  @js.native
  open class VirtualText protected ()
    extends StObject
       with VirtualNode {
    /**
      * Construct a new virtual text node.
      *
      * @param content - The text content for the node.
      */
    def this(content: String) = this()
    
    /**
      * The text content for the node.
      */
    val content: String = js.native
    
    /**
      * The type of the node.
      *
      * This value can be used as a type guard for discriminating the
      * `VirtualNode` union type.
      */
    val `type`: text = js.native
  }
  
  object h {
    
    inline def apply(tag: String, attrs: ElementAttrs, children: Child*): VirtualElement = (^.asInstanceOf[js.Dynamic].apply((scala.List(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
    inline def apply(tag: String, attrs: ElementAttrs, renderer: IRenderer, children: Child*): VirtualElement = (^.asInstanceOf[js.Dynamic].apply((scala.List(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
    inline def apply(tag: String, children: Child*): VirtualElement = ^.asInstanceOf[js.Dynamic].apply(scala.List(tag.asInstanceOf[js.Any]).`++`(children.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VirtualElement]
    inline def apply(tag: String, renderer: IRenderer, children: Child*): VirtualElement = (^.asInstanceOf[js.Dynamic].apply((scala.List(tag.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VirtualElement]
    
    @JSImport("@lumino/virtualdom", "h")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@lumino/virtualdom", "h.a")
    @js.native
    val a: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.abbr")
    @js.native
    val abbr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.address")
    @js.native
    val address: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.area")
    @js.native
    val area: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.article")
    @js.native
    val article: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.aside")
    @js.native
    val aside: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.audio")
    @js.native
    val audio: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.b")
    @js.native
    val b: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.bdi")
    @js.native
    val bdi: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.bdo")
    @js.native
    val bdo: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.blockquote")
    @js.native
    val blockquote: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.br")
    @js.native
    val br: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.button")
    @js.native
    val button: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.canvas")
    @js.native
    val canvas: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.caption")
    @js.native
    val caption: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.cite")
    @js.native
    val cite: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.code")
    @js.native
    val code: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.col")
    @js.native
    val col: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.colgroup")
    @js.native
    val colgroup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.data")
    @js.native
    val data: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.datalist")
    @js.native
    val datalist: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dd")
    @js.native
    val dd: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.del")
    @js.native
    val del: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dfn")
    @js.native
    val dfn: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.div")
    @js.native
    val div: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dl")
    @js.native
    val dl: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.dt")
    @js.native
    val dt: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.em")
    @js.native
    val em: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.embed")
    @js.native
    val embed: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.fieldset")
    @js.native
    val fieldset: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.figcaption")
    @js.native
    val figcaption: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.figure")
    @js.native
    val figure: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.footer")
    @js.native
    val footer: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.form")
    @js.native
    val form: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h1")
    @js.native
    val h1: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h2")
    @js.native
    val h2: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h3")
    @js.native
    val h3: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h4")
    @js.native
    val h4: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h5")
    @js.native
    val h5: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.h6")
    @js.native
    val h6: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.header")
    @js.native
    val header: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.hr")
    @js.native
    val hr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.i")
    @js.native
    val i: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.iframe")
    @js.native
    val iframe: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.img")
    @js.native
    val img: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.input")
    @js.native
    val input: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ins")
    @js.native
    val ins: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.kbd")
    @js.native
    val kbd: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.label")
    @js.native
    val label: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.legend")
    @js.native
    val legend: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.li")
    @js.native
    val li: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.main")
    @js.native
    val main: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.map")
    @js.native
    val map: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.mark")
    @js.native
    val mark: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.meter")
    @js.native
    val meter: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.nav")
    @js.native
    val nav: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.noscript")
    @js.native
    val noscript: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.object")
    @js.native
    val `object`: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ol")
    @js.native
    val ol: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.optgroup")
    @js.native
    val optgroup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.option")
    @js.native
    val option: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.output")
    @js.native
    val output: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.p")
    @js.native
    val p: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.param")
    @js.native
    val param: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.pre")
    @js.native
    val pre: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.progress")
    @js.native
    val progress: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.q")
    @js.native
    val q: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.rp")
    @js.native
    val rp: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.rt")
    @js.native
    val rt: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ruby")
    @js.native
    val ruby: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.s")
    @js.native
    val s: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.samp")
    @js.native
    val samp: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.section")
    @js.native
    val section: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.select")
    @js.native
    val select: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.small")
    @js.native
    val small: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.source")
    @js.native
    val source: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.span")
    @js.native
    val span: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.strong")
    @js.native
    val strong: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.sub")
    @js.native
    val sub: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.summary")
    @js.native
    val summary: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.sup")
    @js.native
    val sup: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.table")
    @js.native
    val table: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tbody")
    @js.native
    val tbody: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.td")
    @js.native
    val td: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.textarea")
    @js.native
    val textarea: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tfoot")
    @js.native
    val tfoot: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.th")
    @js.native
    val th: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.thead")
    @js.native
    val thead: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.time")
    @js.native
    val time: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.title")
    @js.native
    val title: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.tr")
    @js.native
    val tr: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.track")
    @js.native
    val track: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.u")
    @js.native
    val u: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.ul")
    @js.native
    val ul: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.var_")
    @js.native
    val `var`: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.video")
    @js.native
    val video: IFactory = js.native
    
    @JSImport("@lumino/virtualdom", "h.wbr")
    @js.native
    val wbr: IFactory = js.native
    
    /**
      * A type alias for the supported child argument types.
      */
    type Child = String | VirtualNode | Null | (js.Array[String | VirtualNode | Null])
    
    /**
      * A bound factory function for a specific `h()` tag.
      */
    @js.native
    trait IFactory extends StObject {
      
      def apply(attrs: ElementAttrs, children: Child*): VirtualElement = js.native
      def apply(attrs: ElementAttrs, renderer: IRenderer, children: Child*): VirtualElement = js.native
      def apply(children: Child*): VirtualElement = js.native
      def apply(renderer: IRenderer, children: Child*): VirtualElement = js.native
    }
  }
  
  inline def hpass(tag: String): VirtualElementPass = ^.asInstanceOf[js.Dynamic].applyDynamic("hpass")(tag.asInstanceOf[js.Any]).asInstanceOf[VirtualElementPass]
  inline def hpass(tag: String, attrs: ElementAttrs): VirtualElementPass = (^.asInstanceOf[js.Dynamic].applyDynamic("hpass")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[VirtualElementPass]
  inline def hpass(
    tag: String,
    attrs: ElementAttrs,
    renderer: typingsJapgolly.luminoVirtualdom.mod.VirtualElementPass.IRenderer
  ): VirtualElementPass = (^.asInstanceOf[js.Dynamic].applyDynamic("hpass")(tag.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[VirtualElementPass]
  inline def hpass(tag: String, renderer: typingsJapgolly.luminoVirtualdom.mod.VirtualElementPass.IRenderer): VirtualElementPass = (^.asInstanceOf[js.Dynamic].applyDynamic("hpass")(tag.asInstanceOf[js.Any], renderer.asInstanceOf[js.Any])).asInstanceOf[VirtualElementPass]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-activedescendant`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-atomic`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-autocomplete`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-busy`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-checked`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colcount`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colindex`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colspan`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-controls`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-current`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-describedby`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-details`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dialog`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-disabled`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dropeffect`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-errormessage`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-expanded`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-flowto`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-grabbed`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-haspopup`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-hidden`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-invalid`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-keyshortcuts`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-label`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-labelledby`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-level`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-live`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiline`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiselectable`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-orientation`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-owns`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-placeholder`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-posinset`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-pressed`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-readonly`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-relevant`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-required`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-roledescription`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowcount`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowindex`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowspan`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-selected`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-setsize`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-sort`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemax`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemin`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuenow`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuetext`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.role
  */
  trait ARIAAttrNames extends StObject
  object ARIAAttrNames {
    
    inline def `aria-activedescendant`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-activedescendant` = "aria-activedescendant".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-activedescendant`]
    
    inline def `aria-atomic`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-atomic` = "aria-atomic".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-atomic`]
    
    inline def `aria-autocomplete`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-autocomplete` = "aria-autocomplete".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-autocomplete`]
    
    inline def `aria-busy`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-busy` = "aria-busy".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-busy`]
    
    inline def `aria-checked`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-checked` = "aria-checked".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-checked`]
    
    inline def `aria-colcount`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colcount` = "aria-colcount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colcount`]
    
    inline def `aria-colindex`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colindex` = "aria-colindex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colindex`]
    
    inline def `aria-colspan`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colspan` = "aria-colspan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-colspan`]
    
    inline def `aria-controls`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-controls` = "aria-controls".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-controls`]
    
    inline def `aria-current`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-current` = "aria-current".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-current`]
    
    inline def `aria-describedby`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-describedby` = "aria-describedby".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-describedby`]
    
    inline def `aria-details`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-details` = "aria-details".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-details`]
    
    inline def `aria-dialog`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dialog` = "aria-dialog".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dialog`]
    
    inline def `aria-disabled`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-disabled` = "aria-disabled".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-disabled`]
    
    inline def `aria-dropeffect`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dropeffect` = "aria-dropeffect".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-dropeffect`]
    
    inline def `aria-errormessage`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-errormessage` = "aria-errormessage".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-errormessage`]
    
    inline def `aria-expanded`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-expanded` = "aria-expanded".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-expanded`]
    
    inline def `aria-flowto`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-flowto` = "aria-flowto".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-flowto`]
    
    inline def `aria-grabbed`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-grabbed` = "aria-grabbed".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-grabbed`]
    
    inline def `aria-haspopup`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-haspopup` = "aria-haspopup".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-haspopup`]
    
    inline def `aria-hidden`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-hidden` = "aria-hidden".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-hidden`]
    
    inline def `aria-invalid`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-invalid` = "aria-invalid".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-invalid`]
    
    inline def `aria-keyshortcuts`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-keyshortcuts` = "aria-keyshortcuts".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-keyshortcuts`]
    
    inline def `aria-label`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-label` = "aria-label".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-label`]
    
    inline def `aria-labelledby`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-labelledby` = "aria-labelledby".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-labelledby`]
    
    inline def `aria-level`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-level` = "aria-level".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-level`]
    
    inline def `aria-live`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-live` = "aria-live".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-live`]
    
    inline def `aria-multiline`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiline` = "aria-multiline".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiline`]
    
    inline def `aria-multiselectable`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiselectable` = "aria-multiselectable".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-multiselectable`]
    
    inline def `aria-orientation`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-orientation` = "aria-orientation".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-orientation`]
    
    inline def `aria-owns`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-owns` = "aria-owns".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-owns`]
    
    inline def `aria-placeholder`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-placeholder` = "aria-placeholder".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-placeholder`]
    
    inline def `aria-posinset`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-posinset` = "aria-posinset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-posinset`]
    
    inline def `aria-pressed`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-pressed` = "aria-pressed".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-pressed`]
    
    inline def `aria-readonly`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-readonly` = "aria-readonly".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-readonly`]
    
    inline def `aria-relevant`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-relevant` = "aria-relevant".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-relevant`]
    
    inline def `aria-required`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-required` = "aria-required".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-required`]
    
    inline def `aria-roledescription`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-roledescription` = "aria-roledescription".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-roledescription`]
    
    inline def `aria-rowcount`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowcount` = "aria-rowcount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowcount`]
    
    inline def `aria-rowindex`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowindex` = "aria-rowindex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowindex`]
    
    inline def `aria-rowspan`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowspan` = "aria-rowspan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-rowspan`]
    
    inline def `aria-selected`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-selected` = "aria-selected".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-selected`]
    
    inline def `aria-setsize`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-setsize` = "aria-setsize".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-setsize`]
    
    inline def `aria-sort`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-sort` = "aria-sort".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-sort`]
    
    inline def `aria-valuemax`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemax` = "aria-valuemax".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemax`]
    
    inline def `aria-valuemin`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemin` = "aria-valuemin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuemin`]
    
    inline def `aria-valuenow`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuenow` = "aria-valuenow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuenow`]
    
    inline def `aria-valuetext`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuetext` = "aria-valuetext".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`aria-valuetext`]
    
    inline def role: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.role = "role".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.role]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignContent
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignItems
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignSelf
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animation
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDelay
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDirection
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDuration
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationName
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.background
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.baselineShift
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.border
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottom
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImage
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeft
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTop
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.bottom
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxShadow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxSizing
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakAfter
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakBefore
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakInside
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.captionSide
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clear
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clip
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipPath
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipRule
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.color
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnCount
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnFill
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnGap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRule
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnSpan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columns
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.content
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterReset
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssFloat
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssText
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cursor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.direction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.display
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.emptyCells
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enableBackground
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fill
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillRule
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.filter
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flex
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexBasis
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexDirection
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexFlow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexGrow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexShrink
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexWrap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.font
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFamily
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSize
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStretch
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontVariant
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontWeight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.imeMode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.justifyContent
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kerning
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.left
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lightingColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lineHeight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleType
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.margin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginBottom
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginLeft
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginRight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginTop
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marker
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerEnd
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerMid
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerStart
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mask
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxHeight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minHeight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRows
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphens
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.opacity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.order
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.orphans
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outline
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowX
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowY
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.padding
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingRight
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingTop
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspective
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.position
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.quotes
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.resize
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.right
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stroke
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tableLayout
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAnchor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textDecoration
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textIndent
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textJustify
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashida
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textOverflow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textShadow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textTransform
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.top
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.touchAction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transform
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.visibility
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.widows
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordBreak
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordWrap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.writingMode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zIndex
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zoom
  */
  trait CSSPropertyNames extends StObject
  object CSSPropertyNames {
    
    inline def alignContent: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignContent = "alignContent".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignContent]
    
    inline def alignItems: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignItems = "alignItems".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignItems]
    
    inline def alignSelf: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignSelf = "alignSelf".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignSelf]
    
    inline def alignmentBaseline: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline = "alignmentBaseline".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alignmentBaseline]
    
    inline def animation: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animation = "animation".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animation]
    
    inline def animationDelay: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDelay = "animationDelay".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDelay]
    
    inline def animationDirection: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDirection = "animationDirection".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDirection]
    
    inline def animationDuration: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDuration = "animationDuration".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationDuration]
    
    inline def animationFillMode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode = "animationFillMode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationFillMode]
    
    inline def animationIterationCount: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount = "animationIterationCount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationIterationCount]
    
    inline def animationName: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationName = "animationName".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationName]
    
    inline def animationPlayState: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState = "animationPlayState".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationPlayState]
    
    inline def animationTimingFunction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction = "animationTimingFunction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.animationTimingFunction]
    
    inline def backfaceVisibility: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility = "backfaceVisibility".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backfaceVisibility]
    
    inline def background: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.background = "background".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.background]
    
    inline def backgroundAttachment: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment = "backgroundAttachment".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundAttachment]
    
    inline def backgroundClip: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip = "backgroundClip".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundClip]
    
    inline def backgroundColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor = "backgroundColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundColor]
    
    inline def backgroundImage: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage = "backgroundImage".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundImage]
    
    inline def backgroundOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin = "backgroundOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundOrigin]
    
    inline def backgroundPosition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition = "backgroundPosition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPosition]
    
    inline def backgroundPositionX: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX = "backgroundPositionX".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionX]
    
    inline def backgroundPositionY: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY = "backgroundPositionY".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundPositionY]
    
    inline def backgroundRepeat: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat = "backgroundRepeat".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundRepeat]
    
    inline def backgroundSize: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize = "backgroundSize".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.backgroundSize]
    
    inline def baselineShift: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.baselineShift = "baselineShift".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.baselineShift]
    
    inline def border: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.border = "border".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.border]
    
    inline def borderBottom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottom = "borderBottom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottom]
    
    inline def borderBottomColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor = "borderBottomColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomColor]
    
    inline def borderBottomLeftRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius = "borderBottomLeftRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomLeftRadius]
    
    inline def borderBottomRightRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius = "borderBottomRightRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomRightRadius]
    
    inline def borderBottomStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle = "borderBottomStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomStyle]
    
    inline def borderBottomWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth = "borderBottomWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderBottomWidth]
    
    inline def borderCollapse: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse = "borderCollapse".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderCollapse]
    
    inline def borderColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderColor = "borderColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderColor]
    
    inline def borderImage: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImage = "borderImage".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImage]
    
    inline def borderImageOutset: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset = "borderImageOutset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageOutset]
    
    inline def borderImageRepeat: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat = "borderImageRepeat".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageRepeat]
    
    inline def borderImageSlice: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice = "borderImageSlice".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSlice]
    
    inline def borderImageSource: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource = "borderImageSource".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageSource]
    
    inline def borderImageWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth = "borderImageWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderImageWidth]
    
    inline def borderLeft: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeft = "borderLeft".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeft]
    
    inline def borderLeftColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor = "borderLeftColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftColor]
    
    inline def borderLeftStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle = "borderLeftStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftStyle]
    
    inline def borderLeftWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth = "borderLeftWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderLeftWidth]
    
    inline def borderRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRadius = "borderRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRadius]
    
    inline def borderRight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRight = "borderRight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRight]
    
    inline def borderRightColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor = "borderRightColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightColor]
    
    inline def borderRightStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle = "borderRightStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightStyle]
    
    inline def borderRightWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth = "borderRightWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderRightWidth]
    
    inline def borderSpacing: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing = "borderSpacing".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderSpacing]
    
    inline def borderStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderStyle = "borderStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderStyle]
    
    inline def borderTop: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTop = "borderTop".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTop]
    
    inline def borderTopColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor = "borderTopColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopColor]
    
    inline def borderTopLeftRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius = "borderTopLeftRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopLeftRadius]
    
    inline def borderTopRightRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius = "borderTopRightRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopRightRadius]
    
    inline def borderTopStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle = "borderTopStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopStyle]
    
    inline def borderTopWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth = "borderTopWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderTopWidth]
    
    inline def borderWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderWidth = "borderWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.borderWidth]
    
    inline def bottom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.bottom]
    
    inline def boxShadow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxShadow = "boxShadow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxShadow]
    
    inline def boxSizing: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxSizing = "boxSizing".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.boxSizing]
    
    inline def breakAfter: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakAfter = "breakAfter".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakAfter]
    
    inline def breakBefore: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakBefore = "breakBefore".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakBefore]
    
    inline def breakInside: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakInside = "breakInside".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.breakInside]
    
    inline def captionSide: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.captionSide = "captionSide".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.captionSide]
    
    inline def clear: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clear = "clear".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clear]
    
    inline def clip: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clip = "clip".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clip]
    
    inline def clipPath: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipPath = "clipPath".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipPath]
    
    inline def clipRule: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipRule = "clipRule".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.clipRule]
    
    inline def color: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.color = "color".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.color]
    
    inline def colorInterpolationFilters: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters = "colorInterpolationFilters".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colorInterpolationFilters]
    
    inline def columnCount: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnCount = "columnCount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnCount]
    
    inline def columnFill: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnFill = "columnFill".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnFill]
    
    inline def columnGap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnGap = "columnGap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnGap]
    
    inline def columnRule: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRule = "columnRule".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRule]
    
    inline def columnRuleColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor = "columnRuleColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleColor]
    
    inline def columnRuleStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle = "columnRuleStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleStyle]
    
    inline def columnRuleWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth = "columnRuleWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnRuleWidth]
    
    inline def columnSpan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnSpan = "columnSpan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnSpan]
    
    inline def columnWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnWidth = "columnWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columnWidth]
    
    inline def columns: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columns = "columns".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.columns]
    
    inline def content: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.content = "content".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.content]
    
    inline def counterIncrement: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement = "counterIncrement".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterIncrement]
    
    inline def counterReset: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterReset = "counterReset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.counterReset]
    
    inline def cssFloat: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssFloat = "cssFloat".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssFloat]
    
    inline def cssText: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssText = "cssText".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cssText]
    
    inline def cursor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cursor = "cursor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cursor]
    
    inline def direction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.direction = "direction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.direction]
    
    inline def display: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.display = "display".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.display]
    
    inline def dominantBaseline: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline = "dominantBaseline".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dominantBaseline]
    
    inline def emptyCells: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.emptyCells = "emptyCells".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.emptyCells]
    
    inline def enableBackground: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enableBackground = "enableBackground".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enableBackground]
    
    inline def fill: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fill = "fill".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fill]
    
    inline def fillOpacity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity = "fillOpacity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillOpacity]
    
    inline def fillRule: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillRule = "fillRule".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fillRule]
    
    inline def filter: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.filter = "filter".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.filter]
    
    inline def flex: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flex = "flex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flex]
    
    inline def flexBasis: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexBasis = "flexBasis".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexBasis]
    
    inline def flexDirection: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexDirection = "flexDirection".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexDirection]
    
    inline def flexFlow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexFlow = "flexFlow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexFlow]
    
    inline def flexGrow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexGrow = "flexGrow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexGrow]
    
    inline def flexShrink: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexShrink = "flexShrink".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexShrink]
    
    inline def flexWrap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexWrap = "flexWrap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.flexWrap]
    
    inline def floodColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodColor = "floodColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodColor]
    
    inline def floodOpacity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity = "floodOpacity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.floodOpacity]
    
    inline def font: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.font = "font".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.font]
    
    inline def fontFamily: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFamily = "fontFamily".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFamily]
    
    inline def fontFeatureSettings: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings = "fontFeatureSettings".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontFeatureSettings]
    
    inline def fontSize: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSize = "fontSize".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSize]
    
    inline def fontSizeAdjust: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust = "fontSizeAdjust".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontSizeAdjust]
    
    inline def fontStretch: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStretch = "fontStretch".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStretch]
    
    inline def fontStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStyle = "fontStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontStyle]
    
    inline def fontVariant: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontVariant = "fontVariant".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontVariant]
    
    inline def fontWeight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontWeight = "fontWeight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.fontWeight]
    
    inline def glyphOrientationHorizontal: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal = "glyphOrientationHorizontal".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationHorizontal]
    
    inline def glyphOrientationVertical: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical = "glyphOrientationVertical".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.glyphOrientationVertical]
    
    inline def height: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height = "height".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height]
    
    inline def imeMode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.imeMode = "imeMode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.imeMode]
    
    inline def justifyContent: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.justifyContent = "justifyContent".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.justifyContent]
    
    inline def kerning: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kerning = "kerning".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kerning]
    
    inline def left: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.left = "left".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.left]
    
    inline def letterSpacing: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing = "letterSpacing".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.letterSpacing]
    
    inline def lightingColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lightingColor = "lightingColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lightingColor]
    
    inline def lineHeight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lineHeight = "lineHeight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lineHeight]
    
    inline def listStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyle = "listStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyle]
    
    inline def listStyleImage: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage = "listStyleImage".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleImage]
    
    inline def listStylePosition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition = "listStylePosition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStylePosition]
    
    inline def listStyleType: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleType = "listStyleType".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.listStyleType]
    
    inline def margin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.margin = "margin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.margin]
    
    inline def marginBottom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginBottom = "marginBottom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginBottom]
    
    inline def marginLeft: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginLeft = "marginLeft".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginLeft]
    
    inline def marginRight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginRight = "marginRight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginRight]
    
    inline def marginTop: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginTop = "marginTop".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marginTop]
    
    inline def marker: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marker = "marker".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.marker]
    
    inline def markerEnd: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerEnd = "markerEnd".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerEnd]
    
    inline def markerMid: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerMid = "markerMid".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerMid]
    
    inline def markerStart: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerStart = "markerStart".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.markerStart]
    
    inline def mask: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mask = "mask".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mask]
    
    inline def maxHeight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxHeight = "maxHeight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxHeight]
    
    inline def maxWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxWidth = "maxWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxWidth]
    
    inline def minHeight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minHeight = "minHeight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minHeight]
    
    inline def minWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minWidth = "minWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minWidth]
    
    inline def msContentZoomChaining: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining = "msContentZoomChaining".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomChaining]
    
    inline def msContentZoomLimit: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit = "msContentZoomLimit".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimit]
    
    inline def msContentZoomLimitMax: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax = "msContentZoomLimitMax".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMax]
    
    inline def msContentZoomLimitMin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin = "msContentZoomLimitMin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomLimitMin]
    
    inline def msContentZoomSnap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap = "msContentZoomSnap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnap]
    
    inline def msContentZoomSnapPoints: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints = "msContentZoomSnapPoints".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapPoints]
    
    inline def msContentZoomSnapType: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType = "msContentZoomSnapType".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZoomSnapType]
    
    inline def msContentZooming: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming = "msContentZooming".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msContentZooming]
    
    inline def msFlowFrom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom = "msFlowFrom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowFrom]
    
    inline def msFlowInto: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto = "msFlowInto".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFlowInto]
    
    inline def msFontFeatureSettings: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings = "msFontFeatureSettings".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msFontFeatureSettings]
    
    inline def msGridColumn: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn = "msGridColumn".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumn]
    
    inline def msGridColumnAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign = "msGridColumnAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnAlign]
    
    inline def msGridColumnSpan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan = "msGridColumnSpan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumnSpan]
    
    inline def msGridColumns: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns = "msGridColumns".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridColumns]
    
    inline def msGridRow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRow = "msGridRow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRow]
    
    inline def msGridRowAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign = "msGridRowAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowAlign]
    
    inline def msGridRowSpan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan = "msGridRowSpan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRowSpan]
    
    inline def msGridRows: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRows = "msGridRows".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msGridRows]
    
    inline def msHighContrastAdjust: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust = "msHighContrastAdjust".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHighContrastAdjust]
    
    inline def msHyphenateLimitChars: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars = "msHyphenateLimitChars".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitChars]
    
    inline def msHyphenateLimitLines: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines = "msHyphenateLimitLines".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitLines]
    
    inline def msHyphenateLimitZone: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone = "msHyphenateLimitZone".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphenateLimitZone]
    
    inline def msHyphens: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphens = "msHyphens".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msHyphens]
    
    inline def msImeAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign = "msImeAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msImeAlign]
    
    inline def msOverflowStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle = "msOverflowStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msOverflowStyle]
    
    inline def msScrollChaining: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining = "msScrollChaining".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollChaining]
    
    inline def msScrollLimit: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit = "msScrollLimit".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimit]
    
    inline def msScrollLimitXMax: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax = "msScrollLimitXMax".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMax]
    
    inline def msScrollLimitXMin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin = "msScrollLimitXMin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitXMin]
    
    inline def msScrollLimitYMax: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax = "msScrollLimitYMax".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMax]
    
    inline def msScrollLimitYMin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin = "msScrollLimitYMin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollLimitYMin]
    
    inline def msScrollRails: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails = "msScrollRails".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollRails]
    
    inline def msScrollSnapPointsX: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX = "msScrollSnapPointsX".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsX]
    
    inline def msScrollSnapPointsY: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY = "msScrollSnapPointsY".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapPointsY]
    
    inline def msScrollSnapType: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType = "msScrollSnapType".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapType]
    
    inline def msScrollSnapX: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX = "msScrollSnapX".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapX]
    
    inline def msScrollSnapY: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY = "msScrollSnapY".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollSnapY]
    
    inline def msScrollTranslation: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation = "msScrollTranslation".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msScrollTranslation]
    
    inline def msTextCombineHorizontal: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal = "msTextCombineHorizontal".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextCombineHorizontal]
    
    inline def msTextSizeAdjust: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust = "msTextSizeAdjust".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTextSizeAdjust]
    
    inline def msTouchAction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction = "msTouchAction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchAction]
    
    inline def msTouchSelect: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect = "msTouchSelect".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msTouchSelect]
    
    inline def msUserSelect: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect = "msUserSelect".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msUserSelect]
    
    inline def msWrapFlow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow = "msWrapFlow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapFlow]
    
    inline def msWrapMargin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin = "msWrapMargin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapMargin]
    
    inline def msWrapThrough: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough = "msWrapThrough".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.msWrapThrough]
    
    inline def opacity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.opacity = "opacity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.opacity]
    
    inline def order: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.order = "order".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.order]
    
    inline def orphans: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.orphans = "orphans".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.orphans]
    
    inline def outline: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outline = "outline".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outline]
    
    inline def outlineColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineColor = "outlineColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineColor]
    
    inline def outlineStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle = "outlineStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineStyle]
    
    inline def outlineWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth = "outlineWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.outlineWidth]
    
    inline def overflow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflow = "overflow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflow]
    
    inline def overflowX: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowX = "overflowX".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowX]
    
    inline def overflowY: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowY = "overflowY".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.overflowY]
    
    inline def padding: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.padding = "padding".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.padding]
    
    inline def paddingBottom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom = "paddingBottom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingBottom]
    
    inline def paddingLeft: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft = "paddingLeft".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingLeft]
    
    inline def paddingRight: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingRight = "paddingRight".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingRight]
    
    inline def paddingTop: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingTop = "paddingTop".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.paddingTop]
    
    inline def pageBreakAfter: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter = "pageBreakAfter".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakAfter]
    
    inline def pageBreakBefore: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore = "pageBreakBefore".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakBefore]
    
    inline def pageBreakInside: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside = "pageBreakInside".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pageBreakInside]
    
    inline def perspective: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspective = "perspective".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspective]
    
    inline def perspectiveOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin = "perspectiveOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.perspectiveOrigin]
    
    inline def pointerEvents: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents = "pointerEvents".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pointerEvents]
    
    inline def position: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.position = "position".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.position]
    
    inline def quotes: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.quotes = "quotes".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.quotes]
    
    inline def resize: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.resize = "resize".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.resize]
    
    inline def right: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.right = "right".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.right]
    
    inline def rubyAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign = "rubyAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyAlign]
    
    inline def rubyOverhang: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang = "rubyOverhang".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyOverhang]
    
    inline def rubyPosition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition = "rubyPosition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rubyPosition]
    
    inline def stopColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopColor = "stopColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopColor]
    
    inline def stopOpacity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity = "stopOpacity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stopOpacity]
    
    inline def stroke: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stroke = "stroke".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.stroke]
    
    inline def strokeDasharray: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray = "strokeDasharray".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDasharray]
    
    inline def strokeDashoffset: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset = "strokeDashoffset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeDashoffset]
    
    inline def strokeLinecap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap = "strokeLinecap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinecap]
    
    inline def strokeLinejoin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin = "strokeLinejoin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeLinejoin]
    
    inline def strokeMiterlimit: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit = "strokeMiterlimit".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeMiterlimit]
    
    inline def strokeOpacity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity = "strokeOpacity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeOpacity]
    
    inline def strokeWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth = "strokeWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.strokeWidth]
    
    inline def tableLayout: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tableLayout = "tableLayout".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tableLayout]
    
    inline def textAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlign = "textAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlign]
    
    inline def textAlignLast: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast = "textAlignLast".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAlignLast]
    
    inline def textAnchor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAnchor = "textAnchor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textAnchor]
    
    inline def textDecoration: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textDecoration = "textDecoration".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textDecoration]
    
    inline def textIndent: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textIndent = "textIndent".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textIndent]
    
    inline def textJustify: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textJustify = "textJustify".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textJustify]
    
    inline def textKashida: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashida = "textKashida".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashida]
    
    inline def textKashidaSpace: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace = "textKashidaSpace".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textKashidaSpace]
    
    inline def textOverflow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textOverflow = "textOverflow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textOverflow]
    
    inline def textShadow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textShadow = "textShadow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textShadow]
    
    inline def textTransform: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textTransform = "textTransform".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textTransform]
    
    inline def textUnderlinePosition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition = "textUnderlinePosition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.textUnderlinePosition]
    
    inline def top: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.top = "top".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.top]
    
    inline def touchAction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.touchAction = "touchAction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.touchAction]
    
    inline def transform: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transform = "transform".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transform]
    
    inline def transformOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin = "transformOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformOrigin]
    
    inline def transformStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformStyle = "transformStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transformStyle]
    
    inline def transition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transition = "transition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transition]
    
    inline def transitionDelay: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay = "transitionDelay".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDelay]
    
    inline def transitionDuration: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration = "transitionDuration".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionDuration]
    
    inline def transitionProperty: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty = "transitionProperty".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionProperty]
    
    inline def transitionTimingFunction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction = "transitionTimingFunction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.transitionTimingFunction]
    
    inline def unicodeBidi: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi = "unicodeBidi".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.unicodeBidi]
    
    inline def verticalAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign = "verticalAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.verticalAlign]
    
    inline def visibility: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.visibility = "visibility".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.visibility]
    
    inline def webkitAlignContent: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent = "webkitAlignContent".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignContent]
    
    inline def webkitAlignItems: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems = "webkitAlignItems".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignItems]
    
    inline def webkitAlignSelf: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf = "webkitAlignSelf".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAlignSelf]
    
    inline def webkitAnimation: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation = "webkitAnimation".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimation]
    
    inline def webkitAnimationDelay: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay = "webkitAnimationDelay".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDelay]
    
    inline def webkitAnimationDirection: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection = "webkitAnimationDirection".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDirection]
    
    inline def webkitAnimationDuration: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration = "webkitAnimationDuration".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationDuration]
    
    inline def webkitAnimationFillMode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode = "webkitAnimationFillMode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationFillMode]
    
    inline def webkitAnimationIterationCount: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount = "webkitAnimationIterationCount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationIterationCount]
    
    inline def webkitAnimationName: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName = "webkitAnimationName".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationName]
    
    inline def webkitAnimationPlayState: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState = "webkitAnimationPlayState".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationPlayState]
    
    inline def webkitAnimationTimingFunction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction = "webkitAnimationTimingFunction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAnimationTimingFunction]
    
    inline def webkitAppearance: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance = "webkitAppearance".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitAppearance]
    
    inline def webkitBackfaceVisibility: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility = "webkitBackfaceVisibility".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackfaceVisibility]
    
    inline def webkitBackgroundClip: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip = "webkitBackgroundClip".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundClip]
    
    inline def webkitBackgroundOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin = "webkitBackgroundOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundOrigin]
    
    inline def webkitBackgroundSize: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize = "webkitBackgroundSize".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBackgroundSize]
    
    inline def webkitBorderBottomLeftRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius = "webkitBorderBottomLeftRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomLeftRadius]
    
    inline def webkitBorderBottomRightRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius = "webkitBorderBottomRightRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderBottomRightRadius]
    
    inline def webkitBorderImage: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage = "webkitBorderImage".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderImage]
    
    inline def webkitBorderRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius = "webkitBorderRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderRadius]
    
    inline def webkitBorderTopLeftRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius = "webkitBorderTopLeftRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopLeftRadius]
    
    inline def webkitBorderTopRightRadius: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius = "webkitBorderTopRightRadius".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBorderTopRightRadius]
    
    inline def webkitBoxAlign: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign = "webkitBoxAlign".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxAlign]
    
    inline def webkitBoxDirection: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection = "webkitBoxDirection".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxDirection]
    
    inline def webkitBoxFlex: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex = "webkitBoxFlex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxFlex]
    
    inline def webkitBoxOrdinalGroup: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup = "webkitBoxOrdinalGroup".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrdinalGroup]
    
    inline def webkitBoxOrient: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient = "webkitBoxOrient".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxOrient]
    
    inline def webkitBoxPack: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack = "webkitBoxPack".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxPack]
    
    inline def webkitBoxSizing: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing = "webkitBoxSizing".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitBoxSizing]
    
    inline def webkitColumnBreakAfter: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter = "webkitColumnBreakAfter".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakAfter]
    
    inline def webkitColumnBreakBefore: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore = "webkitColumnBreakBefore".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakBefore]
    
    inline def webkitColumnBreakInside: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside = "webkitColumnBreakInside".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnBreakInside]
    
    inline def webkitColumnCount: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount = "webkitColumnCount".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnCount]
    
    inline def webkitColumnGap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap = "webkitColumnGap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnGap]
    
    inline def webkitColumnRule: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule = "webkitColumnRule".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRule]
    
    inline def webkitColumnRuleColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor = "webkitColumnRuleColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleColor]
    
    inline def webkitColumnRuleStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle = "webkitColumnRuleStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleStyle]
    
    inline def webkitColumnRuleWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth = "webkitColumnRuleWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnRuleWidth]
    
    inline def webkitColumnSpan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan = "webkitColumnSpan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnSpan]
    
    inline def webkitColumnWidth: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth = "webkitColumnWidth".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumnWidth]
    
    inline def webkitColumns: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns = "webkitColumns".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitColumns]
    
    inline def webkitFilter: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter = "webkitFilter".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFilter]
    
    inline def webkitFlex: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex = "webkitFlex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlex]
    
    inline def webkitFlexBasis: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis = "webkitFlexBasis".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexBasis]
    
    inline def webkitFlexDirection: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection = "webkitFlexDirection".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexDirection]
    
    inline def webkitFlexFlow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow = "webkitFlexFlow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexFlow]
    
    inline def webkitFlexGrow: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow = "webkitFlexGrow".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexGrow]
    
    inline def webkitFlexShrink: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink = "webkitFlexShrink".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexShrink]
    
    inline def webkitFlexWrap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap = "webkitFlexWrap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitFlexWrap]
    
    inline def webkitJustifyContent: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent = "webkitJustifyContent".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitJustifyContent]
    
    inline def webkitOrder: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder = "webkitOrder".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitOrder]
    
    inline def webkitPerspective: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective = "webkitPerspective".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspective]
    
    inline def webkitPerspectiveOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin = "webkitPerspectiveOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitPerspectiveOrigin]
    
    inline def webkitTapHighlightColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor = "webkitTapHighlightColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTapHighlightColor]
    
    inline def webkitTextFillColor: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor = "webkitTextFillColor".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextFillColor]
    
    inline def webkitTextSizeAdjust: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust = "webkitTextSizeAdjust".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTextSizeAdjust]
    
    inline def webkitTransform: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform = "webkitTransform".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransform]
    
    inline def webkitTransformOrigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin = "webkitTransformOrigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformOrigin]
    
    inline def webkitTransformStyle: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle = "webkitTransformStyle".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransformStyle]
    
    inline def webkitTransition: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition = "webkitTransition".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransition]
    
    inline def webkitTransitionDelay: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay = "webkitTransitionDelay".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDelay]
    
    inline def webkitTransitionDuration: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration = "webkitTransitionDuration".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionDuration]
    
    inline def webkitTransitionProperty: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty = "webkitTransitionProperty".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionProperty]
    
    inline def webkitTransitionTimingFunction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction = "webkitTransitionTimingFunction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitTransitionTimingFunction]
    
    inline def webkitUserModify: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify = "webkitUserModify".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserModify]
    
    inline def webkitUserSelect: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect = "webkitUserSelect".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitUserSelect]
    
    inline def webkitWritingMode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode = "webkitWritingMode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.webkitWritingMode]
    
    inline def whiteSpace: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace = "whiteSpace".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.whiteSpace]
    
    inline def widows: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.widows = "widows".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.widows]
    
    inline def width: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width = "width".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width]
    
    inline def wordBreak: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordBreak = "wordBreak".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordBreak]
    
    inline def wordSpacing: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing = "wordSpacing".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordSpacing]
    
    inline def wordWrap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordWrap = "wordWrap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wordWrap]
    
    inline def writingMode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.writingMode = "writingMode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.writingMode]
    
    inline def zIndex: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zIndex = "zIndex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zIndex]
    
    inline def zoom: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zoom = "zoom".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.zoom]
  }
  
  /* Inlined {readonly [ T in @lumino/virtualdom.@lumino/virtualdom.ARIAAttrNames ]:? string} */
  trait ElementARIAAttrs extends StObject {
    
    val `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    val `aria-atomic`: js.UndefOr[String] = js.undefined
    
    val `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    val `aria-busy`: js.UndefOr[String] = js.undefined
    
    val `aria-checked`: js.UndefOr[String] = js.undefined
    
    val `aria-colcount`: js.UndefOr[String] = js.undefined
    
    val `aria-colindex`: js.UndefOr[String] = js.undefined
    
    val `aria-colspan`: js.UndefOr[String] = js.undefined
    
    val `aria-controls`: js.UndefOr[String] = js.undefined
    
    val `aria-current`: js.UndefOr[String] = js.undefined
    
    val `aria-describedby`: js.UndefOr[String] = js.undefined
    
    val `aria-details`: js.UndefOr[String] = js.undefined
    
    val `aria-dialog`: js.UndefOr[String] = js.undefined
    
    val `aria-disabled`: js.UndefOr[String] = js.undefined
    
    val `aria-dropeffect`: js.UndefOr[String] = js.undefined
    
    val `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    val `aria-expanded`: js.UndefOr[String] = js.undefined
    
    val `aria-flowto`: js.UndefOr[String] = js.undefined
    
    val `aria-grabbed`: js.UndefOr[String] = js.undefined
    
    val `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    val `aria-hidden`: js.UndefOr[String] = js.undefined
    
    val `aria-invalid`: js.UndefOr[String] = js.undefined
    
    val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    val `aria-label`: js.UndefOr[String] = js.undefined
    
    val `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    val `aria-level`: js.UndefOr[String] = js.undefined
    
    val `aria-live`: js.UndefOr[String] = js.undefined
    
    val `aria-multiline`: js.UndefOr[String] = js.undefined
    
    val `aria-multiselectable`: js.UndefOr[String] = js.undefined
    
    val `aria-orientation`: js.UndefOr[String] = js.undefined
    
    val `aria-owns`: js.UndefOr[String] = js.undefined
    
    val `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    val `aria-posinset`: js.UndefOr[String] = js.undefined
    
    val `aria-pressed`: js.UndefOr[String] = js.undefined
    
    val `aria-readonly`: js.UndefOr[String] = js.undefined
    
    val `aria-relevant`: js.UndefOr[String] = js.undefined
    
    val `aria-required`: js.UndefOr[String] = js.undefined
    
    val `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    val `aria-rowcount`: js.UndefOr[String] = js.undefined
    
    val `aria-rowindex`: js.UndefOr[String] = js.undefined
    
    val `aria-rowspan`: js.UndefOr[String] = js.undefined
    
    val `aria-selected`: js.UndefOr[String] = js.undefined
    
    val `aria-setsize`: js.UndefOr[String] = js.undefined
    
    val `aria-sort`: js.UndefOr[String] = js.undefined
    
    val `aria-valuemax`: js.UndefOr[String] = js.undefined
    
    val `aria-valuemin`: js.UndefOr[String] = js.undefined
    
    val `aria-valuenow`: js.UndefOr[String] = js.undefined
    
    val `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    val role: js.UndefOr[String] = js.undefined
  }
  object ElementARIAAttrs {
    
    inline def apply(): ElementARIAAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementARIAAttrs]
    }
    
    extension [Self <: ElementARIAAttrs](x: Self) {
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: String): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: String): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: String): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: String): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: String): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: String): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: String): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-dialog`(value: String): Self = StObject.set(x, "aria-dialog", value.asInstanceOf[js.Any])
      
      inline def `setAria-dialogUndefined`: Self = StObject.set(x, "aria-dialog", js.undefined)
      
      inline def `setAria-disabled`(value: String): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: String): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: String): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: String): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: String): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: String): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: String): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: String): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-multiline`(value: String): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: String): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: String): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: String): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: String): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: String): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(value: String): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: String): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: String): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: String): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: String): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: String): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: String): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: String): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: String): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: String): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: String): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.abbr
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accept
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accesskey
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.action
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alt
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autocomplete
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autofocus
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autoplay
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autosave
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.checked
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cite
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cols
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colspan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.contenteditable
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.controls
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.coords
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.crossorigin
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.data
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.datetime
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.default
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dir
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dirname
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.disabled
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.download
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.draggable
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dropzone
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enctype
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.form
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formaction
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formenctype
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formmethod
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formtarget
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.headers
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hidden
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.high
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.href
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hreflang
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.id
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.inputmode
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.integrity
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.ismap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kind
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.label
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lang
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.list
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.loop
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.low
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.max
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxlength
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.media
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mediagroup
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.method
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.min
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minlength
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.multiple
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.muted
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.name
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.novalidate
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.optimum
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pattern
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.placeholder
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.poster
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.preload
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.readonly
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rel
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.required
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.reversed
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rows
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rowspan
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sandbox
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.scope
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.selected
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.shape
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.size
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sizes
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.span
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.spellcheck
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.src
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcdoc
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srclang
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcset
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.start
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.step
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tabindex
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.target
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.title
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`type`
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.usemap
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.value
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width
    - typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wrap
  */
  trait ElementAttrNames extends StObject
  object ElementAttrNames {
    
    inline def default: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.default = "default".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.default]
    
    inline def abbr: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.abbr = "abbr".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.abbr]
    
    inline def accept: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accept = "accept".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accept]
    
    inline def `accept-charset`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset` = "accept-charset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`accept-charset`]
    
    inline def accesskey: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accesskey = "accesskey".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.accesskey]
    
    inline def action: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.action = "action".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.action]
    
    inline def allowfullscreen: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen = "allowfullscreen".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.allowfullscreen]
    
    inline def alt: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alt = "alt".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.alt]
    
    inline def autocomplete: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autocomplete = "autocomplete".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autocomplete]
    
    inline def autofocus: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autofocus = "autofocus".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autofocus]
    
    inline def autoplay: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autoplay = "autoplay".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autoplay]
    
    inline def autosave: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autosave = "autosave".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.autosave]
    
    inline def checked: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.checked = "checked".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.checked]
    
    inline def cite: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cite = "cite".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cite]
    
    inline def cols: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cols = "cols".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.cols]
    
    inline def colspan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colspan = "colspan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.colspan]
    
    inline def contenteditable: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.contenteditable = "contenteditable".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.contenteditable]
    
    inline def controls: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.controls = "controls".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.controls]
    
    inline def coords: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.coords = "coords".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.coords]
    
    inline def crossorigin: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.crossorigin = "crossorigin".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.crossorigin]
    
    inline def data: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.data = "data".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.data]
    
    inline def datetime: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.datetime]
    
    inline def dir: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dir = "dir".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dir]
    
    inline def dirname: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dirname = "dirname".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dirname]
    
    inline def disabled: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.disabled]
    
    inline def download: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.download = "download".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.download]
    
    inline def draggable: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.draggable = "draggable".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.draggable]
    
    inline def dropzone: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dropzone = "dropzone".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.dropzone]
    
    inline def enctype: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enctype = "enctype".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.enctype]
    
    inline def form: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.form = "form".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.form]
    
    inline def formaction: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formaction = "formaction".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formaction]
    
    inline def formenctype: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formenctype = "formenctype".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formenctype]
    
    inline def formmethod: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formmethod = "formmethod".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formmethod]
    
    inline def formnovalidate: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate = "formnovalidate".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formnovalidate]
    
    inline def formtarget: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formtarget = "formtarget".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.formtarget]
    
    inline def headers: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.headers = "headers".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.headers]
    
    inline def height: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height = "height".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.height]
    
    inline def hidden: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hidden]
    
    inline def high: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.high = "high".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.high]
    
    inline def href: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.href = "href".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.href]
    
    inline def hreflang: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hreflang = "hreflang".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.hreflang]
    
    inline def id: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.id = "id".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.id]
    
    inline def inputmode: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.inputmode = "inputmode".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.inputmode]
    
    inline def integrity: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.integrity = "integrity".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.integrity]
    
    inline def ismap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.ismap = "ismap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.ismap]
    
    inline def kind: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kind = "kind".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.kind]
    
    inline def label: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.label = "label".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.label]
    
    inline def lang: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lang = "lang".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.lang]
    
    inline def list: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.list = "list".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.list]
    
    inline def loop: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.loop = "loop".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.loop]
    
    inline def low: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.low = "low".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.low]
    
    inline def max: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.max = "max".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.max]
    
    inline def maxlength: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxlength = "maxlength".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.maxlength]
    
    inline def media: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.media = "media".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.media]
    
    inline def mediagroup: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mediagroup = "mediagroup".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.mediagroup]
    
    inline def method: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.method = "method".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.method]
    
    inline def min: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.min = "min".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.min]
    
    inline def minlength: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minlength = "minlength".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.minlength]
    
    inline def multiple: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.multiple = "multiple".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.multiple]
    
    inline def muted: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.muted = "muted".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.muted]
    
    inline def name: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.name = "name".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.name]
    
    inline def novalidate: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.novalidate = "novalidate".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.novalidate]
    
    inline def optimum: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.optimum = "optimum".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.optimum]
    
    inline def pattern: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pattern = "pattern".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.pattern]
    
    inline def placeholder: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.placeholder = "placeholder".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.placeholder]
    
    inline def poster: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.poster = "poster".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.poster]
    
    inline def preload: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.preload = "preload".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.preload]
    
    inline def readonly: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.readonly = "readonly".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.readonly]
    
    inline def rel: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rel = "rel".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rel]
    
    inline def required: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.required = "required".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.required]
    
    inline def reversed: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.reversed = "reversed".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.reversed]
    
    inline def rows: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rows = "rows".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rows]
    
    inline def rowspan: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rowspan = "rowspan".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.rowspan]
    
    inline def sandbox: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sandbox = "sandbox".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sandbox]
    
    inline def scope: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.scope = "scope".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.scope]
    
    inline def selected: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.selected = "selected".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.selected]
    
    inline def shape: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.shape = "shape".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.shape]
    
    inline def size: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.size = "size".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.size]
    
    inline def sizes: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sizes = "sizes".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.sizes]
    
    inline def span: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.span = "span".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.span]
    
    inline def spellcheck: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.spellcheck = "spellcheck".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.spellcheck]
    
    inline def src: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.src = "src".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.src]
    
    inline def srcdoc: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcdoc = "srcdoc".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcdoc]
    
    inline def srclang: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srclang = "srclang".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srclang]
    
    inline def srcset: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcset = "srcset".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.srcset]
    
    inline def start: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.start = "start".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.start]
    
    inline def step: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.step = "step".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.step]
    
    inline def tabindex: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tabindex = "tabindex".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.tabindex]
    
    inline def target: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.target = "target".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.target]
    
    inline def title: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.title = "title".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.title]
    
    inline def `type`: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`type` = "type".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.`type`]
    
    inline def typemustmatch: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch = "typemustmatch".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.typemustmatch]
    
    inline def usemap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.usemap = "usemap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.usemap]
    
    inline def value: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.value = "value".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.value]
    
    inline def width: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width = "width".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.width]
    
    inline def wrap: typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wrap = "wrap".asInstanceOf[typingsJapgolly.luminoVirtualdom.luminoVirtualdomStrings.wrap]
  }
  
  /* Inlined @lumino/virtualdom.@lumino/virtualdom.ElementBaseAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementARIAAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementEventAttrs & @lumino/virtualdom.@lumino/virtualdom.ElementSpecialAttrs */
  trait ElementAttrs extends StObject {
    
    val default: js.UndefOr[String] = js.undefined
    
    val abbr: js.UndefOr[String] = js.undefined
    
    val accept: js.UndefOr[String] = js.undefined
    
    val `accept-charset`: js.UndefOr[String] = js.undefined
    
    val accesskey: js.UndefOr[String] = js.undefined
    
    val action: js.UndefOr[String] = js.undefined
    
    val allowfullscreen: js.UndefOr[String] = js.undefined
    
    val alt: js.UndefOr[String] = js.undefined
    
    val `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    val `aria-atomic`: js.UndefOr[String] = js.undefined
    
    val `aria-autocomplete`: js.UndefOr[String] = js.undefined
    
    val `aria-busy`: js.UndefOr[String] = js.undefined
    
    val `aria-checked`: js.UndefOr[String] = js.undefined
    
    val `aria-colcount`: js.UndefOr[String] = js.undefined
    
    val `aria-colindex`: js.UndefOr[String] = js.undefined
    
    val `aria-colspan`: js.UndefOr[String] = js.undefined
    
    val `aria-controls`: js.UndefOr[String] = js.undefined
    
    val `aria-current`: js.UndefOr[String] = js.undefined
    
    val `aria-describedby`: js.UndefOr[String] = js.undefined
    
    val `aria-details`: js.UndefOr[String] = js.undefined
    
    val `aria-dialog`: js.UndefOr[String] = js.undefined
    
    val `aria-disabled`: js.UndefOr[String] = js.undefined
    
    val `aria-dropeffect`: js.UndefOr[String] = js.undefined
    
    val `aria-errormessage`: js.UndefOr[String] = js.undefined
    
    val `aria-expanded`: js.UndefOr[String] = js.undefined
    
    val `aria-flowto`: js.UndefOr[String] = js.undefined
    
    val `aria-grabbed`: js.UndefOr[String] = js.undefined
    
    val `aria-haspopup`: js.UndefOr[String] = js.undefined
    
    val `aria-hidden`: js.UndefOr[String] = js.undefined
    
    val `aria-invalid`: js.UndefOr[String] = js.undefined
    
    val `aria-keyshortcuts`: js.UndefOr[String] = js.undefined
    
    val `aria-label`: js.UndefOr[String] = js.undefined
    
    val `aria-labelledby`: js.UndefOr[String] = js.undefined
    
    val `aria-level`: js.UndefOr[String] = js.undefined
    
    val `aria-live`: js.UndefOr[String] = js.undefined
    
    val `aria-multiline`: js.UndefOr[String] = js.undefined
    
    val `aria-multiselectable`: js.UndefOr[String] = js.undefined
    
    val `aria-orientation`: js.UndefOr[String] = js.undefined
    
    val `aria-owns`: js.UndefOr[String] = js.undefined
    
    val `aria-placeholder`: js.UndefOr[String] = js.undefined
    
    val `aria-posinset`: js.UndefOr[String] = js.undefined
    
    val `aria-pressed`: js.UndefOr[String] = js.undefined
    
    val `aria-readonly`: js.UndefOr[String] = js.undefined
    
    val `aria-relevant`: js.UndefOr[String] = js.undefined
    
    val `aria-required`: js.UndefOr[String] = js.undefined
    
    val `aria-roledescription`: js.UndefOr[String] = js.undefined
    
    val `aria-rowcount`: js.UndefOr[String] = js.undefined
    
    val `aria-rowindex`: js.UndefOr[String] = js.undefined
    
    val `aria-rowspan`: js.UndefOr[String] = js.undefined
    
    val `aria-selected`: js.UndefOr[String] = js.undefined
    
    val `aria-setsize`: js.UndefOr[String] = js.undefined
    
    val `aria-sort`: js.UndefOr[String] = js.undefined
    
    val `aria-valuemax`: js.UndefOr[String] = js.undefined
    
    val `aria-valuemin`: js.UndefOr[String] = js.undefined
    
    val `aria-valuenow`: js.UndefOr[String] = js.undefined
    
    val `aria-valuetext`: js.UndefOr[String] = js.undefined
    
    val autocomplete: js.UndefOr[String] = js.undefined
    
    val autofocus: js.UndefOr[String] = js.undefined
    
    val autoplay: js.UndefOr[String] = js.undefined
    
    val autosave: js.UndefOr[String] = js.undefined
    
    val checked: js.UndefOr[String] = js.undefined
    
    val cite: js.UndefOr[String] = js.undefined
    
    /**
      * The JS-safe name for the HTML `class` attribute.
      */
    val className: js.UndefOr[String] = js.undefined
    
    val cols: js.UndefOr[String] = js.undefined
    
    val colspan: js.UndefOr[String] = js.undefined
    
    val contenteditable: js.UndefOr[String] = js.undefined
    
    val controls: js.UndefOr[String] = js.undefined
    
    val coords: js.UndefOr[String] = js.undefined
    
    val crossorigin: js.UndefOr[String] = js.undefined
    
    val data: js.UndefOr[String] = js.undefined
    
    /**
      * The dataset for the rendered DOM element.
      */
    val dataset: js.UndefOr[ElementDataset] = js.undefined
    
    val datetime: js.UndefOr[String] = js.undefined
    
    val dir: js.UndefOr[String] = js.undefined
    
    val dirname: js.UndefOr[String] = js.undefined
    
    val disabled: js.UndefOr[String] = js.undefined
    
    val download: js.UndefOr[String] = js.undefined
    
    val draggable: js.UndefOr[String] = js.undefined
    
    val dropzone: js.UndefOr[String] = js.undefined
    
    val enctype: js.UndefOr[String] = js.undefined
    
    val form: js.UndefOr[String] = js.undefined
    
    val formaction: js.UndefOr[String] = js.undefined
    
    val formenctype: js.UndefOr[String] = js.undefined
    
    val formmethod: js.UndefOr[String] = js.undefined
    
    val formnovalidate: js.UndefOr[String] = js.undefined
    
    val formtarget: js.UndefOr[String] = js.undefined
    
    val headers: js.UndefOr[String] = js.undefined
    
    val height: js.UndefOr[String] = js.undefined
    
    val hidden: js.UndefOr[String] = js.undefined
    
    val high: js.UndefOr[String] = js.undefined
    
    val href: js.UndefOr[String] = js.undefined
    
    val hreflang: js.UndefOr[String] = js.undefined
    
    /**
      * The JS-safe name for the HTML `for` attribute.
      */
    val htmlFor: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val inputmode: js.UndefOr[String] = js.undefined
    
    val integrity: js.UndefOr[String] = js.undefined
    
    val ismap: js.UndefOr[String] = js.undefined
    
    /**
      * The key id for the virtual element node.
      *
      * If a node is given a key id, the generated DOM node will not be
      * recreated during a rendering update if it only moves among its
      * siblings in the render tree.
      *
      * In general, reordering child nodes will cause the nodes to be
      * completely re-rendered. Keys allow this to be optimized away.
      *
      * If a key is provided, it must be unique among sibling nodes.
      */
    val key: js.UndefOr[String] = js.undefined
    
    val kind: js.UndefOr[String] = js.undefined
    
    val label: js.UndefOr[String] = js.undefined
    
    val lang: js.UndefOr[String] = js.undefined
    
    val list: js.UndefOr[String] = js.undefined
    
    val loop: js.UndefOr[String] = js.undefined
    
    val low: js.UndefOr[String] = js.undefined
    
    val max: js.UndefOr[String] = js.undefined
    
    val maxlength: js.UndefOr[String] = js.undefined
    
    val media: js.UndefOr[String] = js.undefined
    
    val mediagroup: js.UndefOr[String] = js.undefined
    
    val method: js.UndefOr[String] = js.undefined
    
    val min: js.UndefOr[String] = js.undefined
    
    val minlength: js.UndefOr[String] = js.undefined
    
    val multiple: js.UndefOr[String] = js.undefined
    
    val muted: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val novalidate: js.UndefOr[String] = js.undefined
    
    val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]] = js.undefined
    
    val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]] = js.undefined
    
    val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]] = js.undefined
    
    val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]] = js.undefined
    
    val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, Any]] = js.undefined
    
    val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onprogress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, Any]] = js.undefined
    
    val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val optimum: js.UndefOr[String] = js.undefined
    
    val pattern: js.UndefOr[String] = js.undefined
    
    val placeholder: js.UndefOr[String] = js.undefined
    
    val poster: js.UndefOr[String] = js.undefined
    
    val preload: js.UndefOr[String] = js.undefined
    
    val readonly: js.UndefOr[String] = js.undefined
    
    val rel: js.UndefOr[String] = js.undefined
    
    val required: js.UndefOr[String] = js.undefined
    
    val reversed: js.UndefOr[String] = js.undefined
    
    val role: js.UndefOr[String] = js.undefined
    
    val rows: js.UndefOr[String] = js.undefined
    
    val rowspan: js.UndefOr[String] = js.undefined
    
    val sandbox: js.UndefOr[String] = js.undefined
    
    val scope: js.UndefOr[String] = js.undefined
    
    val selected: js.UndefOr[String] = js.undefined
    
    val shape: js.UndefOr[String] = js.undefined
    
    val size: js.UndefOr[String] = js.undefined
    
    val sizes: js.UndefOr[String] = js.undefined
    
    val span: js.UndefOr[String] = js.undefined
    
    val spellcheck: js.UndefOr[String] = js.undefined
    
    val src: js.UndefOr[String] = js.undefined
    
    val srcdoc: js.UndefOr[String] = js.undefined
    
    val srclang: js.UndefOr[String] = js.undefined
    
    val srcset: js.UndefOr[String] = js.undefined
    
    val start: js.UndefOr[String] = js.undefined
    
    val step: js.UndefOr[String] = js.undefined
    
    /**
      * The inline style for the rendered DOM element.
      */
    val style: js.UndefOr[ElementInlineStyle] = js.undefined
    
    val tabindex: js.UndefOr[String] = js.undefined
    
    val target: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
    
    val typemustmatch: js.UndefOr[String] = js.undefined
    
    val usemap: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[String] = js.undefined
    
    val width: js.UndefOr[String] = js.undefined
    
    val wrap: js.UndefOr[String] = js.undefined
  }
  object ElementAttrs {
    
    inline def apply(): ElementAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementAttrs]
    }
    
    extension [Self <: ElementAttrs](x: Self) {
      
      inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
      
      inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
      
      inline def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAllowfullscreen(value: String): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
      
      inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      inline def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      inline def `setAria-atomic`(value: String): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      inline def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      inline def `setAria-autocomplete`(value: String): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      inline def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      inline def `setAria-busy`(value: String): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      inline def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      inline def `setAria-checked`(value: String): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def `setAria-colcount`(value: String): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      inline def `setAria-colindex`(value: String): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      inline def `setAria-colspan`(value: String): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def `setAria-current`(value: String): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      inline def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      inline def `setAria-dialog`(value: String): Self = StObject.set(x, "aria-dialog", value.asInstanceOf[js.Any])
      
      inline def `setAria-dialogUndefined`: Self = StObject.set(x, "aria-dialog", js.undefined)
      
      inline def `setAria-disabled`(value: String): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      inline def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      inline def `setAria-dropeffect`(value: String): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      inline def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      inline def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      inline def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      inline def `setAria-expanded`(value: String): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      inline def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      inline def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      inline def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      inline def `setAria-grabbed`(value: String): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      inline def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      inline def `setAria-haspopup`(value: String): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      inline def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      inline def `setAria-hidden`(value: String): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      inline def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      inline def `setAria-invalid`(value: String): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      inline def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      inline def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      inline def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      inline def `setAria-level`(value: String): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      inline def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      inline def `setAria-live`(value: String): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      inline def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      inline def `setAria-multiline`(value: String): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      inline def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      inline def `setAria-multiselectable`(value: String): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      inline def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      inline def `setAria-orientation`(value: String): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      inline def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      inline def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      inline def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      inline def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      inline def `setAria-posinset`(value: String): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      inline def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      inline def `setAria-pressed`(value: String): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      inline def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      inline def `setAria-readonly`(value: String): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      inline def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      inline def `setAria-relevant`(value: String): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      inline def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      inline def `setAria-required`(value: String): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      inline def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      inline def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      inline def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      inline def `setAria-rowcount`(value: String): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      inline def `setAria-rowindex`(value: String): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      inline def `setAria-rowspan`(value: String): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      inline def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      inline def `setAria-selected`(value: String): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      inline def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      inline def `setAria-setsize`(value: String): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      inline def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      inline def `setAria-sort`(value: String): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      inline def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      inline def `setAria-valuemax`(value: String): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      inline def `setAria-valuemin`(value: String): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      inline def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      inline def `setAria-valuenow`(value: String): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      inline def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      inline def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutofocus(value: String): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: String): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setColspan(value: String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setContenteditable(value: String): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
      
      inline def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
      
      inline def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataset(value: ElementDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropzone(value: String): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      
      inline def setDropzoneUndefined: Self = StObject.set(x, "dropzone", js.undefined)
      
      inline def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
      
      inline def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
      
      inline def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
      
      inline def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
      
      inline def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
      
      inline def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
      
      inline def setFormnovalidate(value: String): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
      
      inline def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
      
      inline def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
      
      inline def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIsmap(value: String): Self = StObject.set(x, "ismap", value.asInstanceOf[js.Any])
      
      inline def setIsmapUndefined: Self = StObject.set(x, "ismap", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMediagroup(value: String): Self = StObject.set(x, "mediagroup", value.asInstanceOf[js.Any])
      
      inline def setMediagroupUndefined: Self = StObject.set(x, "mediagroup", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNovalidate(value: String): Self = StObject.set(x, "novalidate", value.asInstanceOf[js.Any])
      
      inline def setNovalidateUndefined: Self = StObject.set(x, "novalidate", js.undefined)
      
      inline def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      inline def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      inline def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      inline def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      inline def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      inline def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
      
      inline def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      inline def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      inline def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
      
      inline def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      inline def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      inline def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      inline def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      inline def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      inline def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
      
      inline def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      inline def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      inline def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      inline def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      inline def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      inline def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      inline def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      inline def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      inline def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      inline def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      inline def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      inline def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      inline def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      inline def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      inline def setOnloadendUndefined: Self = StObject.set(x, "onloadend", js.undefined)
      
      inline def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      inline def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      inline def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      inline def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      inline def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      inline def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      inline def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, Any]): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      inline def setOnmousewheelUndefined: Self = StObject.set(x, "onmousewheel", js.undefined)
      
      inline def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      inline def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
      
      inline def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      inline def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      inline def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      inline def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      inline def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      inline def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      inline def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      inline def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      inline def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      inline def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      inline def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      inline def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      inline def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      inline def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      inline def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      inline def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      inline def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      inline def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      inline def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      inline def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      inline def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
      
      inline def setOptimum(value: String): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setReadonly(value: String): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReversed(value: String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowspan(value: String): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellcheck(value: String): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
      
      inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
      
      inline def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      inline def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: ElementInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypemustmatch(value: String): Self = StObject.set(x, "typemustmatch", value.asInstanceOf[js.Any])
      
      inline def setTypemustmatchUndefined: Self = StObject.set(x, "typemustmatch", js.undefined)
      
      inline def setUsemap(value: String): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
      
      inline def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined {readonly [ T in @lumino/virtualdom.@lumino/virtualdom.ElementAttrNames ]:? string} */
  trait ElementBaseAttrs extends StObject {
    
    val default: js.UndefOr[String] = js.undefined
    
    val abbr: js.UndefOr[String] = js.undefined
    
    val accept: js.UndefOr[String] = js.undefined
    
    val `accept-charset`: js.UndefOr[String] = js.undefined
    
    val accesskey: js.UndefOr[String] = js.undefined
    
    val action: js.UndefOr[String] = js.undefined
    
    val allowfullscreen: js.UndefOr[String] = js.undefined
    
    val alt: js.UndefOr[String] = js.undefined
    
    val autocomplete: js.UndefOr[String] = js.undefined
    
    val autofocus: js.UndefOr[String] = js.undefined
    
    val autoplay: js.UndefOr[String] = js.undefined
    
    val autosave: js.UndefOr[String] = js.undefined
    
    val checked: js.UndefOr[String] = js.undefined
    
    val cite: js.UndefOr[String] = js.undefined
    
    val cols: js.UndefOr[String] = js.undefined
    
    val colspan: js.UndefOr[String] = js.undefined
    
    val contenteditable: js.UndefOr[String] = js.undefined
    
    val controls: js.UndefOr[String] = js.undefined
    
    val coords: js.UndefOr[String] = js.undefined
    
    val crossorigin: js.UndefOr[String] = js.undefined
    
    val data: js.UndefOr[String] = js.undefined
    
    val datetime: js.UndefOr[String] = js.undefined
    
    val dir: js.UndefOr[String] = js.undefined
    
    val dirname: js.UndefOr[String] = js.undefined
    
    val disabled: js.UndefOr[String] = js.undefined
    
    val download: js.UndefOr[String] = js.undefined
    
    val draggable: js.UndefOr[String] = js.undefined
    
    val dropzone: js.UndefOr[String] = js.undefined
    
    val enctype: js.UndefOr[String] = js.undefined
    
    val form: js.UndefOr[String] = js.undefined
    
    val formaction: js.UndefOr[String] = js.undefined
    
    val formenctype: js.UndefOr[String] = js.undefined
    
    val formmethod: js.UndefOr[String] = js.undefined
    
    val formnovalidate: js.UndefOr[String] = js.undefined
    
    val formtarget: js.UndefOr[String] = js.undefined
    
    val headers: js.UndefOr[String] = js.undefined
    
    val height: js.UndefOr[String] = js.undefined
    
    val hidden: js.UndefOr[String] = js.undefined
    
    val high: js.UndefOr[String] = js.undefined
    
    val href: js.UndefOr[String] = js.undefined
    
    val hreflang: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val inputmode: js.UndefOr[String] = js.undefined
    
    val integrity: js.UndefOr[String] = js.undefined
    
    val ismap: js.UndefOr[String] = js.undefined
    
    val kind: js.UndefOr[String] = js.undefined
    
    val label: js.UndefOr[String] = js.undefined
    
    val lang: js.UndefOr[String] = js.undefined
    
    val list: js.UndefOr[String] = js.undefined
    
    val loop: js.UndefOr[String] = js.undefined
    
    val low: js.UndefOr[String] = js.undefined
    
    val max: js.UndefOr[String] = js.undefined
    
    val maxlength: js.UndefOr[String] = js.undefined
    
    val media: js.UndefOr[String] = js.undefined
    
    val mediagroup: js.UndefOr[String] = js.undefined
    
    val method: js.UndefOr[String] = js.undefined
    
    val min: js.UndefOr[String] = js.undefined
    
    val minlength: js.UndefOr[String] = js.undefined
    
    val multiple: js.UndefOr[String] = js.undefined
    
    val muted: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val novalidate: js.UndefOr[String] = js.undefined
    
    val optimum: js.UndefOr[String] = js.undefined
    
    val pattern: js.UndefOr[String] = js.undefined
    
    val placeholder: js.UndefOr[String] = js.undefined
    
    val poster: js.UndefOr[String] = js.undefined
    
    val preload: js.UndefOr[String] = js.undefined
    
    val readonly: js.UndefOr[String] = js.undefined
    
    val rel: js.UndefOr[String] = js.undefined
    
    val required: js.UndefOr[String] = js.undefined
    
    val reversed: js.UndefOr[String] = js.undefined
    
    val rows: js.UndefOr[String] = js.undefined
    
    val rowspan: js.UndefOr[String] = js.undefined
    
    val sandbox: js.UndefOr[String] = js.undefined
    
    val scope: js.UndefOr[String] = js.undefined
    
    val selected: js.UndefOr[String] = js.undefined
    
    val shape: js.UndefOr[String] = js.undefined
    
    val size: js.UndefOr[String] = js.undefined
    
    val sizes: js.UndefOr[String] = js.undefined
    
    val span: js.UndefOr[String] = js.undefined
    
    val spellcheck: js.UndefOr[String] = js.undefined
    
    val src: js.UndefOr[String] = js.undefined
    
    val srcdoc: js.UndefOr[String] = js.undefined
    
    val srclang: js.UndefOr[String] = js.undefined
    
    val srcset: js.UndefOr[String] = js.undefined
    
    val start: js.UndefOr[String] = js.undefined
    
    val step: js.UndefOr[String] = js.undefined
    
    val tabindex: js.UndefOr[String] = js.undefined
    
    val target: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
    
    val typemustmatch: js.UndefOr[String] = js.undefined
    
    val usemap: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[String] = js.undefined
    
    val width: js.UndefOr[String] = js.undefined
    
    val wrap: js.UndefOr[String] = js.undefined
  }
  object ElementBaseAttrs {
    
    inline def apply(): ElementBaseAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementBaseAttrs]
    }
    
    extension [Self <: ElementBaseAttrs](x: Self) {
      
      inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def `setAccept-charset`(value: String): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
      
      inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAccesskey(value: String): Self = StObject.set(x, "accesskey", value.asInstanceOf[js.Any])
      
      inline def setAccesskeyUndefined: Self = StObject.set(x, "accesskey", js.undefined)
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAllowfullscreen(value: String): Self = StObject.set(x, "allowfullscreen", value.asInstanceOf[js.Any])
      
      inline def setAllowfullscreenUndefined: Self = StObject.set(x, "allowfullscreen", js.undefined)
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setAutofocus(value: String): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      inline def setAutoplay(value: String): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setAutosave(value: String): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
      
      inline def setAutosaveUndefined: Self = StObject.set(x, "autosave", js.undefined)
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      inline def setCols(value: String): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setColspan(value: String): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setColspanUndefined: Self = StObject.set(x, "colspan", js.undefined)
      
      inline def setContenteditable(value: String): Self = StObject.set(x, "contenteditable", value.asInstanceOf[js.Any])
      
      inline def setContenteditableUndefined: Self = StObject.set(x, "contenteditable", js.undefined)
      
      inline def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
      
      inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDatetime(value: String): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      inline def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDropzone(value: String): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      
      inline def setDropzoneUndefined: Self = StObject.set(x, "dropzone", js.undefined)
      
      inline def setEnctype(value: String): Self = StObject.set(x, "enctype", value.asInstanceOf[js.Any])
      
      inline def setEnctypeUndefined: Self = StObject.set(x, "enctype", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setFormaction(value: String): Self = StObject.set(x, "formaction", value.asInstanceOf[js.Any])
      
      inline def setFormactionUndefined: Self = StObject.set(x, "formaction", js.undefined)
      
      inline def setFormenctype(value: String): Self = StObject.set(x, "formenctype", value.asInstanceOf[js.Any])
      
      inline def setFormenctypeUndefined: Self = StObject.set(x, "formenctype", js.undefined)
      
      inline def setFormmethod(value: String): Self = StObject.set(x, "formmethod", value.asInstanceOf[js.Any])
      
      inline def setFormmethodUndefined: Self = StObject.set(x, "formmethod", js.undefined)
      
      inline def setFormnovalidate(value: String): Self = StObject.set(x, "formnovalidate", value.asInstanceOf[js.Any])
      
      inline def setFormnovalidateUndefined: Self = StObject.set(x, "formnovalidate", js.undefined)
      
      inline def setFormtarget(value: String): Self = StObject.set(x, "formtarget", value.asInstanceOf[js.Any])
      
      inline def setFormtargetUndefined: Self = StObject.set(x, "formtarget", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHigh(value: String): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setIsmap(value: String): Self = StObject.set(x, "ismap", value.asInstanceOf[js.Any])
      
      inline def setIsmapUndefined: Self = StObject.set(x, "ismap", js.undefined)
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setLow(value: String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMaxlength(value: String): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setMediagroup(value: String): Self = StObject.set(x, "mediagroup", value.asInstanceOf[js.Any])
      
      inline def setMediagroupUndefined: Self = StObject.set(x, "mediagroup", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setMultiple(value: String): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setMuted(value: String): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNovalidate(value: String): Self = StObject.set(x, "novalidate", value.asInstanceOf[js.Any])
      
      inline def setNovalidateUndefined: Self = StObject.set(x, "novalidate", js.undefined)
      
      inline def setOptimum(value: String): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      inline def setReadonly(value: String): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setReversed(value: String): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowspan(value: String): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
      
      inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
      
      inline def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSpan(value: String): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setSpellcheck(value: String): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
      
      inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSrcdoc(value: String): Self = StObject.set(x, "srcdoc", value.asInstanceOf[js.Any])
      
      inline def setSrcdocUndefined: Self = StObject.set(x, "srcdoc", js.undefined)
      
      inline def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
      
      inline def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
      
      inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
      
      inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypemustmatch(value: String): Self = StObject.set(x, "typemustmatch", value.asInstanceOf[js.Any])
      
      inline def setTypemustmatchUndefined: Self = StObject.set(x, "typemustmatch", js.undefined)
      
      inline def setUsemap(value: String): Self = StObject.set(x, "usemap", value.asInstanceOf[js.Any])
      
      inline def setUsemapUndefined: Self = StObject.set(x, "usemap", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type ElementDataset = StringDictionary[String]
  
  /* Inlined {readonly [ T in keyof @lumino/virtualdom.@lumino/virtualdom.ElementEventMap ]:? (this : std.HTMLElement, event : @lumino/virtualdom.@lumino/virtualdom.ElementEventMap[T]): any} */
  trait ElementEventAttrs extends StObject {
    
    val onabort: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onblur: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]] = js.undefined
    
    val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val oncopy: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oncut: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val ondrag: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondrop: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]] = js.undefined
    
    val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onemptied: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onended: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]] = js.undefined
    
    val onerror: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]] = js.undefined
    
    val onfocus: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]] = js.undefined
    
    val oninput: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]] = js.undefined
    
    val onload: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]] = js.undefined
    
    val onmousewheel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, Any]] = js.undefined
    
    val onpaste: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]] = js.undefined
    
    val onpause: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onplay: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onplaying: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]] = js.undefined
    
    val onprogress: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, Any]] = js.undefined
    
    val onratechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onreset: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onscroll: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onseeked: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onseeking: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onselect: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]] = js.undefined
    
    val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onstalled: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
    
    val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]] = js.undefined
  }
  object ElementEventAttrs {
    
    inline def apply(): ElementEventAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementEventAttrs]
    }
    
    extension [Self <: ElementEventAttrs](x: Self) {
      
      inline def setOnabort(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnauxclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
      
      inline def setOnblur(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
      
      inline def setOncanplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
      
      inline def setOncanplaythrough(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
      
      inline def setOnchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
      
      inline def setOnclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
      
      inline def setOncontextmenu(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
      
      inline def setOncopy(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      inline def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
      
      inline def setOncuechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
      
      inline def setOncut(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      inline def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
      
      inline def setOndblclick(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
      
      inline def setOndrag(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
      
      inline def setOndragend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
      
      inline def setOndragenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
      
      inline def setOndragexit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      inline def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
      
      inline def setOndragleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
      
      inline def setOndragover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
      
      inline def setOndragstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
      
      inline def setOndrop(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ DragEvent, Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
      
      inline def setOndurationchange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
      
      inline def setOnemptied(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
      
      inline def setOnended(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
      
      inline def setOnerror(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ErrorEvent, Any]): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnfocus(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ FocusEvent, Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
      
      inline def setOninput(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
      
      inline def setOninvalid(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
      
      inline def setOnkeydown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
      
      inline def setOnkeypress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
      
      inline def setOnkeyup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ KeyboardEvent, Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
      
      inline def setOnload(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOnloadeddata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
      
      inline def setOnloadedmetadata(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
      
      inline def setOnloadend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      inline def setOnloadendUndefined: Self = StObject.set(x, "onloadend", js.undefined)
      
      inline def setOnloadstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
      
      inline def setOnmousedown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
      
      inline def setOnmouseenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
      
      inline def setOnmouseleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
      
      inline def setOnmousemove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
      
      inline def setOnmouseout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
      
      inline def setOnmouseover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
      
      inline def setOnmouseup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ MouseEvent, Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
      
      inline def setOnmousewheel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ WheelEvent, Any]): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      inline def setOnmousewheelUndefined: Self = StObject.set(x, "onmousewheel", js.undefined)
      
      inline def setOnpaste(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ClipboardEvent, Any]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      inline def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
      
      inline def setOnpause(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      inline def setOnplay(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      inline def setOnplaying(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
      
      inline def setOnpointercancel(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
      
      inline def setOnpointerdown(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
      
      inline def setOnpointerenter(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
      
      inline def setOnpointerleave(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
      
      inline def setOnpointermove(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
      
      inline def setOnpointerout(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
      
      inline def setOnpointerover(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
      
      inline def setOnpointerup(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ PointerEvent, Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
      
      inline def setOnprogress(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ ProgressEvent, Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnratechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
      
      inline def setOnreset(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
      
      inline def setOnscroll(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
      
      inline def setOnseeked(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
      
      inline def setOnseeking(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
      
      inline def setOnselect(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ UIEvent, Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
      
      inline def setOnselectstart(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
      
      inline def setOnstalled(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
      
      inline def setOnsubmit(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
      
      inline def setOnsuspend(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
      
      inline def setOntimeupdate(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
      
      inline def setOnvolumechange(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
      
      inline def setOnwaiting(value: js.ThisFunction1[/* this */ HTMLElement, /* event */ Event, Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
      
      inline def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
    }
  }
  
  trait ElementEventMap extends StObject {
    
    var onabort: UIEvent
    
    var onauxclick: MouseEvent
    
    var onblur: FocusEvent
    
    var oncanplay: Event
    
    var oncanplaythrough: Event
    
    var onchange: Event
    
    var onclick: MouseEvent
    
    var oncontextmenu: PointerEvent
    
    var oncopy: ClipboardEvent
    
    var oncuechange: Event
    
    var oncut: ClipboardEvent
    
    var ondblclick: MouseEvent
    
    var ondrag: DragEvent
    
    var ondragend: DragEvent
    
    var ondragenter: DragEvent
    
    var ondragexit: DragEvent
    
    var ondragleave: DragEvent
    
    var ondragover: DragEvent
    
    var ondragstart: DragEvent
    
    var ondrop: DragEvent
    
    var ondurationchange: Event
    
    var onemptied: Event
    
    var onended: ErrorEvent
    
    var onerror: ErrorEvent
    
    var onfocus: FocusEvent
    
    var oninput: Event
    
    var oninvalid: Event
    
    var onkeydown: KeyboardEvent
    
    var onkeypress: KeyboardEvent
    
    var onkeyup: KeyboardEvent
    
    var onload: Event
    
    var onloadeddata: Event
    
    var onloadedmetadata: Event
    
    var onloadend: Event
    
    var onloadstart: Event
    
    var onmousedown: MouseEvent
    
    var onmouseenter: MouseEvent
    
    var onmouseleave: MouseEvent
    
    var onmousemove: MouseEvent
    
    var onmouseout: MouseEvent
    
    var onmouseover: MouseEvent
    
    var onmouseup: MouseEvent
    
    var onmousewheel: WheelEvent
    
    var onpaste: ClipboardEvent
    
    var onpause: Event
    
    var onplay: Event
    
    var onplaying: Event
    
    var onpointercancel: PointerEvent
    
    var onpointerdown: PointerEvent
    
    var onpointerenter: PointerEvent
    
    var onpointerleave: PointerEvent
    
    var onpointermove: PointerEvent
    
    var onpointerout: PointerEvent
    
    var onpointerover: PointerEvent
    
    var onpointerup: PointerEvent
    
    var onprogress: ProgressEvent
    
    var onratechange: Event
    
    var onreset: Event
    
    var onscroll: UIEvent
    
    var onseeked: Event
    
    var onseeking: Event
    
    var onselect: UIEvent
    
    var onselectstart: Event
    
    var onstalled: Event
    
    var onsubmit: Event
    
    var onsuspend: Event
    
    var ontimeupdate: Event
    
    var onvolumechange: Event
    
    var onwaiting: Event
  }
  object ElementEventMap {
    
    inline def apply(
      onabort: UIEvent,
      onauxclick: MouseEvent,
      onblur: FocusEvent,
      oncanplay: Event,
      oncanplaythrough: Event,
      onchange: Event,
      onclick: MouseEvent,
      oncontextmenu: PointerEvent,
      oncopy: ClipboardEvent,
      oncuechange: Event,
      oncut: ClipboardEvent,
      ondblclick: MouseEvent,
      ondrag: DragEvent,
      ondragend: DragEvent,
      ondragenter: DragEvent,
      ondragexit: DragEvent,
      ondragleave: DragEvent,
      ondragover: DragEvent,
      ondragstart: DragEvent,
      ondrop: DragEvent,
      ondurationchange: Event,
      onemptied: Event,
      onended: ErrorEvent,
      onerror: ErrorEvent,
      onfocus: FocusEvent,
      oninput: Event,
      oninvalid: Event,
      onkeydown: KeyboardEvent,
      onkeypress: KeyboardEvent,
      onkeyup: KeyboardEvent,
      onload: Event,
      onloadeddata: Event,
      onloadedmetadata: Event,
      onloadend: Event,
      onloadstart: Event,
      onmousedown: MouseEvent,
      onmouseenter: MouseEvent,
      onmouseleave: MouseEvent,
      onmousemove: MouseEvent,
      onmouseout: MouseEvent,
      onmouseover: MouseEvent,
      onmouseup: MouseEvent,
      onmousewheel: WheelEvent,
      onpaste: ClipboardEvent,
      onpause: Event,
      onplay: Event,
      onplaying: Event,
      onpointercancel: PointerEvent,
      onpointerdown: PointerEvent,
      onpointerenter: PointerEvent,
      onpointerleave: PointerEvent,
      onpointermove: PointerEvent,
      onpointerout: PointerEvent,
      onpointerover: PointerEvent,
      onpointerup: PointerEvent,
      onprogress: ProgressEvent,
      onratechange: Event,
      onreset: Event,
      onscroll: UIEvent,
      onseeked: Event,
      onseeking: Event,
      onselect: UIEvent,
      onselectstart: Event,
      onstalled: Event,
      onsubmit: Event,
      onsuspend: Event,
      ontimeupdate: Event,
      onvolumechange: Event,
      onwaiting: Event
    ): ElementEventMap = {
      val __obj = js.Dynamic.literal(onabort = onabort.asInstanceOf[js.Any], onauxclick = onauxclick.asInstanceOf[js.Any], onblur = onblur.asInstanceOf[js.Any], oncanplay = oncanplay.asInstanceOf[js.Any], oncanplaythrough = oncanplaythrough.asInstanceOf[js.Any], onchange = onchange.asInstanceOf[js.Any], onclick = onclick.asInstanceOf[js.Any], oncontextmenu = oncontextmenu.asInstanceOf[js.Any], oncopy = oncopy.asInstanceOf[js.Any], oncuechange = oncuechange.asInstanceOf[js.Any], oncut = oncut.asInstanceOf[js.Any], ondblclick = ondblclick.asInstanceOf[js.Any], ondrag = ondrag.asInstanceOf[js.Any], ondragend = ondragend.asInstanceOf[js.Any], ondragenter = ondragenter.asInstanceOf[js.Any], ondragexit = ondragexit.asInstanceOf[js.Any], ondragleave = ondragleave.asInstanceOf[js.Any], ondragover = ondragover.asInstanceOf[js.Any], ondragstart = ondragstart.asInstanceOf[js.Any], ondrop = ondrop.asInstanceOf[js.Any], ondurationchange = ondurationchange.asInstanceOf[js.Any], onemptied = onemptied.asInstanceOf[js.Any], onended = onended.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onfocus = onfocus.asInstanceOf[js.Any], oninput = oninput.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], onkeydown = onkeydown.asInstanceOf[js.Any], onkeypress = onkeypress.asInstanceOf[js.Any], onkeyup = onkeyup.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], onloadeddata = onloadeddata.asInstanceOf[js.Any], onloadedmetadata = onloadedmetadata.asInstanceOf[js.Any], onloadend = onloadend.asInstanceOf[js.Any], onloadstart = onloadstart.asInstanceOf[js.Any], onmousedown = onmousedown.asInstanceOf[js.Any], onmouseenter = onmouseenter.asInstanceOf[js.Any], onmouseleave = onmouseleave.asInstanceOf[js.Any], onmousemove = onmousemove.asInstanceOf[js.Any], onmouseout = onmouseout.asInstanceOf[js.Any], onmouseover = onmouseover.asInstanceOf[js.Any], onmouseup = onmouseup.asInstanceOf[js.Any], onmousewheel = onmousewheel.asInstanceOf[js.Any], onpaste = onpaste.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onplay = onplay.asInstanceOf[js.Any], onplaying = onplaying.asInstanceOf[js.Any], onpointercancel = onpointercancel.asInstanceOf[js.Any], onpointerdown = onpointerdown.asInstanceOf[js.Any], onpointerenter = onpointerenter.asInstanceOf[js.Any], onpointerleave = onpointerleave.asInstanceOf[js.Any], onpointermove = onpointermove.asInstanceOf[js.Any], onpointerout = onpointerout.asInstanceOf[js.Any], onpointerover = onpointerover.asInstanceOf[js.Any], onpointerup = onpointerup.asInstanceOf[js.Any], onprogress = onprogress.asInstanceOf[js.Any], onratechange = onratechange.asInstanceOf[js.Any], onreset = onreset.asInstanceOf[js.Any], onscroll = onscroll.asInstanceOf[js.Any], onseeked = onseeked.asInstanceOf[js.Any], onseeking = onseeking.asInstanceOf[js.Any], onselect = onselect.asInstanceOf[js.Any], onselectstart = onselectstart.asInstanceOf[js.Any], onstalled = onstalled.asInstanceOf[js.Any], onsubmit = onsubmit.asInstanceOf[js.Any], onsuspend = onsuspend.asInstanceOf[js.Any], ontimeupdate = ontimeupdate.asInstanceOf[js.Any], onvolumechange = onvolumechange.asInstanceOf[js.Any], onwaiting = onwaiting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementEventMap]
    }
    
    extension [Self <: ElementEventMap](x: Self) {
      
      inline def setOnabort(value: UIEvent): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
      
      inline def setOnauxclick(value: MouseEvent): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
      
      inline def setOnblur(value: FocusEvent): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
      
      inline def setOncanplay(value: Event): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
      
      inline def setOncanplaythrough(value: Event): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
      
      inline def setOnchange(value: Event): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
      
      inline def setOnclick(value: MouseEvent): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
      
      inline def setOncontextmenu(value: PointerEvent): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
      
      inline def setOncopy(value: ClipboardEvent): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
      
      inline def setOncuechange(value: Event): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
      
      inline def setOncut(value: ClipboardEvent): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
      
      inline def setOndblclick(value: MouseEvent): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
      
      inline def setOndrag(value: DragEvent): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
      
      inline def setOndragend(value: DragEvent): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
      
      inline def setOndragenter(value: DragEvent): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
      
      inline def setOndragexit(value: DragEvent): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
      
      inline def setOndragleave(value: DragEvent): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
      
      inline def setOndragover(value: DragEvent): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
      
      inline def setOndragstart(value: DragEvent): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
      
      inline def setOndrop(value: DragEvent): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
      
      inline def setOndurationchange(value: Event): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
      
      inline def setOnemptied(value: Event): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
      
      inline def setOnended(value: ErrorEvent): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: ErrorEvent): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnfocus(value: FocusEvent): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
      
      inline def setOninput(value: Event): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
      
      inline def setOninvalid(value: Event): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setOnkeydown(value: KeyboardEvent): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
      
      inline def setOnkeypress(value: KeyboardEvent): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
      
      inline def setOnkeyup(value: KeyboardEvent): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
      
      inline def setOnload(value: Event): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
      
      inline def setOnloadeddata(value: Event): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
      
      inline def setOnloadedmetadata(value: Event): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
      
      inline def setOnloadend(value: Event): Self = StObject.set(x, "onloadend", value.asInstanceOf[js.Any])
      
      inline def setOnloadstart(value: Event): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
      
      inline def setOnmousedown(value: MouseEvent): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
      
      inline def setOnmouseenter(value: MouseEvent): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
      
      inline def setOnmouseleave(value: MouseEvent): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
      
      inline def setOnmousemove(value: MouseEvent): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
      
      inline def setOnmouseout(value: MouseEvent): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
      
      inline def setOnmouseover(value: MouseEvent): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
      
      inline def setOnmouseup(value: MouseEvent): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
      
      inline def setOnmousewheel(value: WheelEvent): Self = StObject.set(x, "onmousewheel", value.asInstanceOf[js.Any])
      
      inline def setOnpaste(value: ClipboardEvent): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
      
      inline def setOnpause(value: Event): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnplay(value: Event): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
      
      inline def setOnplaying(value: Event): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
      
      inline def setOnpointercancel(value: PointerEvent): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
      
      inline def setOnpointerdown(value: PointerEvent): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
      
      inline def setOnpointerenter(value: PointerEvent): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
      
      inline def setOnpointerleave(value: PointerEvent): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
      
      inline def setOnpointermove(value: PointerEvent): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
      
      inline def setOnpointerout(value: PointerEvent): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
      
      inline def setOnpointerover(value: PointerEvent): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
      
      inline def setOnpointerup(value: PointerEvent): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
      
      inline def setOnprogress(value: ProgressEvent): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
      
      inline def setOnratechange(value: Event): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
      
      inline def setOnreset(value: Event): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
      
      inline def setOnscroll(value: UIEvent): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
      
      inline def setOnseeked(value: Event): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
      
      inline def setOnseeking(value: Event): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
      
      inline def setOnselect(value: UIEvent): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
      
      inline def setOnselectstart(value: Event): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
      
      inline def setOnstalled(value: Event): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
      
      inline def setOnsubmit(value: Event): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
      
      inline def setOnsuspend(value: Event): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
      
      inline def setOntimeupdate(value: Event): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
      
      inline def setOnvolumechange(value: Event): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
      
      inline def setOnwaiting(value: Event): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {readonly [ T in @lumino/virtualdom.@lumino/virtualdom.CSSPropertyNames ]:? string} */
  trait ElementInlineStyle extends StObject {
    
    val alignContent: js.UndefOr[String] = js.undefined
    
    val alignItems: js.UndefOr[String] = js.undefined
    
    val alignSelf: js.UndefOr[String] = js.undefined
    
    val alignmentBaseline: js.UndefOr[String] = js.undefined
    
    val animation: js.UndefOr[String] = js.undefined
    
    val animationDelay: js.UndefOr[String] = js.undefined
    
    val animationDirection: js.UndefOr[String] = js.undefined
    
    val animationDuration: js.UndefOr[String] = js.undefined
    
    val animationFillMode: js.UndefOr[String] = js.undefined
    
    val animationIterationCount: js.UndefOr[String] = js.undefined
    
    val animationName: js.UndefOr[String] = js.undefined
    
    val animationPlayState: js.UndefOr[String] = js.undefined
    
    val animationTimingFunction: js.UndefOr[String] = js.undefined
    
    val backfaceVisibility: js.UndefOr[String] = js.undefined
    
    val background: js.UndefOr[String] = js.undefined
    
    val backgroundAttachment: js.UndefOr[String] = js.undefined
    
    val backgroundClip: js.UndefOr[String] = js.undefined
    
    val backgroundColor: js.UndefOr[String] = js.undefined
    
    val backgroundImage: js.UndefOr[String] = js.undefined
    
    val backgroundOrigin: js.UndefOr[String] = js.undefined
    
    val backgroundPosition: js.UndefOr[String] = js.undefined
    
    val backgroundPositionX: js.UndefOr[String] = js.undefined
    
    val backgroundPositionY: js.UndefOr[String] = js.undefined
    
    val backgroundRepeat: js.UndefOr[String] = js.undefined
    
    val backgroundSize: js.UndefOr[String] = js.undefined
    
    val baselineShift: js.UndefOr[String] = js.undefined
    
    val border: js.UndefOr[String] = js.undefined
    
    val borderBottom: js.UndefOr[String] = js.undefined
    
    val borderBottomColor: js.UndefOr[String] = js.undefined
    
    val borderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    val borderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    val borderBottomStyle: js.UndefOr[String] = js.undefined
    
    val borderBottomWidth: js.UndefOr[String] = js.undefined
    
    val borderCollapse: js.UndefOr[String] = js.undefined
    
    val borderColor: js.UndefOr[String] = js.undefined
    
    val borderImage: js.UndefOr[String] = js.undefined
    
    val borderImageOutset: js.UndefOr[String] = js.undefined
    
    val borderImageRepeat: js.UndefOr[String] = js.undefined
    
    val borderImageSlice: js.UndefOr[String] = js.undefined
    
    val borderImageSource: js.UndefOr[String] = js.undefined
    
    val borderImageWidth: js.UndefOr[String] = js.undefined
    
    val borderLeft: js.UndefOr[String] = js.undefined
    
    val borderLeftColor: js.UndefOr[String] = js.undefined
    
    val borderLeftStyle: js.UndefOr[String] = js.undefined
    
    val borderLeftWidth: js.UndefOr[String] = js.undefined
    
    val borderRadius: js.UndefOr[String] = js.undefined
    
    val borderRight: js.UndefOr[String] = js.undefined
    
    val borderRightColor: js.UndefOr[String] = js.undefined
    
    val borderRightStyle: js.UndefOr[String] = js.undefined
    
    val borderRightWidth: js.UndefOr[String] = js.undefined
    
    val borderSpacing: js.UndefOr[String] = js.undefined
    
    val borderStyle: js.UndefOr[String] = js.undefined
    
    val borderTop: js.UndefOr[String] = js.undefined
    
    val borderTopColor: js.UndefOr[String] = js.undefined
    
    val borderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    val borderTopRightRadius: js.UndefOr[String] = js.undefined
    
    val borderTopStyle: js.UndefOr[String] = js.undefined
    
    val borderTopWidth: js.UndefOr[String] = js.undefined
    
    val borderWidth: js.UndefOr[String] = js.undefined
    
    val bottom: js.UndefOr[String] = js.undefined
    
    val boxShadow: js.UndefOr[String] = js.undefined
    
    val boxSizing: js.UndefOr[String] = js.undefined
    
    val breakAfter: js.UndefOr[String] = js.undefined
    
    val breakBefore: js.UndefOr[String] = js.undefined
    
    val breakInside: js.UndefOr[String] = js.undefined
    
    val captionSide: js.UndefOr[String] = js.undefined
    
    val clear: js.UndefOr[String] = js.undefined
    
    val clip: js.UndefOr[String] = js.undefined
    
    val clipPath: js.UndefOr[String] = js.undefined
    
    val clipRule: js.UndefOr[String] = js.undefined
    
    val color: js.UndefOr[String] = js.undefined
    
    val colorInterpolationFilters: js.UndefOr[String] = js.undefined
    
    val columnCount: js.UndefOr[String] = js.undefined
    
    val columnFill: js.UndefOr[String] = js.undefined
    
    val columnGap: js.UndefOr[String] = js.undefined
    
    val columnRule: js.UndefOr[String] = js.undefined
    
    val columnRuleColor: js.UndefOr[String] = js.undefined
    
    val columnRuleStyle: js.UndefOr[String] = js.undefined
    
    val columnRuleWidth: js.UndefOr[String] = js.undefined
    
    val columnSpan: js.UndefOr[String] = js.undefined
    
    val columnWidth: js.UndefOr[String] = js.undefined
    
    val columns: js.UndefOr[String] = js.undefined
    
    val content: js.UndefOr[String] = js.undefined
    
    val counterIncrement: js.UndefOr[String] = js.undefined
    
    val counterReset: js.UndefOr[String] = js.undefined
    
    val cssFloat: js.UndefOr[String] = js.undefined
    
    val cssText: js.UndefOr[String] = js.undefined
    
    val cursor: js.UndefOr[String] = js.undefined
    
    val direction: js.UndefOr[String] = js.undefined
    
    val display: js.UndefOr[String] = js.undefined
    
    val dominantBaseline: js.UndefOr[String] = js.undefined
    
    val emptyCells: js.UndefOr[String] = js.undefined
    
    val enableBackground: js.UndefOr[String] = js.undefined
    
    val fill: js.UndefOr[String] = js.undefined
    
    val fillOpacity: js.UndefOr[String] = js.undefined
    
    val fillRule: js.UndefOr[String] = js.undefined
    
    val filter: js.UndefOr[String] = js.undefined
    
    val flex: js.UndefOr[String] = js.undefined
    
    val flexBasis: js.UndefOr[String] = js.undefined
    
    val flexDirection: js.UndefOr[String] = js.undefined
    
    val flexFlow: js.UndefOr[String] = js.undefined
    
    val flexGrow: js.UndefOr[String] = js.undefined
    
    val flexShrink: js.UndefOr[String] = js.undefined
    
    val flexWrap: js.UndefOr[String] = js.undefined
    
    val floodColor: js.UndefOr[String] = js.undefined
    
    val floodOpacity: js.UndefOr[String] = js.undefined
    
    val font: js.UndefOr[String] = js.undefined
    
    val fontFamily: js.UndefOr[String] = js.undefined
    
    val fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    val fontSize: js.UndefOr[String] = js.undefined
    
    val fontSizeAdjust: js.UndefOr[String] = js.undefined
    
    val fontStretch: js.UndefOr[String] = js.undefined
    
    val fontStyle: js.UndefOr[String] = js.undefined
    
    val fontVariant: js.UndefOr[String] = js.undefined
    
    val fontWeight: js.UndefOr[String] = js.undefined
    
    val glyphOrientationHorizontal: js.UndefOr[String] = js.undefined
    
    val glyphOrientationVertical: js.UndefOr[String] = js.undefined
    
    val height: js.UndefOr[String] = js.undefined
    
    val imeMode: js.UndefOr[String] = js.undefined
    
    val justifyContent: js.UndefOr[String] = js.undefined
    
    val kerning: js.UndefOr[String] = js.undefined
    
    val left: js.UndefOr[String] = js.undefined
    
    val letterSpacing: js.UndefOr[String] = js.undefined
    
    val lightingColor: js.UndefOr[String] = js.undefined
    
    val lineHeight: js.UndefOr[String] = js.undefined
    
    val listStyle: js.UndefOr[String] = js.undefined
    
    val listStyleImage: js.UndefOr[String] = js.undefined
    
    val listStylePosition: js.UndefOr[String] = js.undefined
    
    val listStyleType: js.UndefOr[String] = js.undefined
    
    val margin: js.UndefOr[String] = js.undefined
    
    val marginBottom: js.UndefOr[String] = js.undefined
    
    val marginLeft: js.UndefOr[String] = js.undefined
    
    val marginRight: js.UndefOr[String] = js.undefined
    
    val marginTop: js.UndefOr[String] = js.undefined
    
    val marker: js.UndefOr[String] = js.undefined
    
    val markerEnd: js.UndefOr[String] = js.undefined
    
    val markerMid: js.UndefOr[String] = js.undefined
    
    val markerStart: js.UndefOr[String] = js.undefined
    
    val mask: js.UndefOr[String] = js.undefined
    
    val maxHeight: js.UndefOr[String] = js.undefined
    
    val maxWidth: js.UndefOr[String] = js.undefined
    
    val minHeight: js.UndefOr[String] = js.undefined
    
    val minWidth: js.UndefOr[String] = js.undefined
    
    val msContentZoomChaining: js.UndefOr[String] = js.undefined
    
    val msContentZoomLimit: js.UndefOr[String] = js.undefined
    
    val msContentZoomLimitMax: js.UndefOr[String] = js.undefined
    
    val msContentZoomLimitMin: js.UndefOr[String] = js.undefined
    
    val msContentZoomSnap: js.UndefOr[String] = js.undefined
    
    val msContentZoomSnapPoints: js.UndefOr[String] = js.undefined
    
    val msContentZoomSnapType: js.UndefOr[String] = js.undefined
    
    val msContentZooming: js.UndefOr[String] = js.undefined
    
    val msFlowFrom: js.UndefOr[String] = js.undefined
    
    val msFlowInto: js.UndefOr[String] = js.undefined
    
    val msFontFeatureSettings: js.UndefOr[String] = js.undefined
    
    val msGridColumn: js.UndefOr[String] = js.undefined
    
    val msGridColumnAlign: js.UndefOr[String] = js.undefined
    
    val msGridColumnSpan: js.UndefOr[String] = js.undefined
    
    val msGridColumns: js.UndefOr[String] = js.undefined
    
    val msGridRow: js.UndefOr[String] = js.undefined
    
    val msGridRowAlign: js.UndefOr[String] = js.undefined
    
    val msGridRowSpan: js.UndefOr[String] = js.undefined
    
    val msGridRows: js.UndefOr[String] = js.undefined
    
    val msHighContrastAdjust: js.UndefOr[String] = js.undefined
    
    val msHyphenateLimitChars: js.UndefOr[String] = js.undefined
    
    val msHyphenateLimitLines: js.UndefOr[String] = js.undefined
    
    val msHyphenateLimitZone: js.UndefOr[String] = js.undefined
    
    val msHyphens: js.UndefOr[String] = js.undefined
    
    val msImeAlign: js.UndefOr[String] = js.undefined
    
    val msOverflowStyle: js.UndefOr[String] = js.undefined
    
    val msScrollChaining: js.UndefOr[String] = js.undefined
    
    val msScrollLimit: js.UndefOr[String] = js.undefined
    
    val msScrollLimitXMax: js.UndefOr[String] = js.undefined
    
    val msScrollLimitXMin: js.UndefOr[String] = js.undefined
    
    val msScrollLimitYMax: js.UndefOr[String] = js.undefined
    
    val msScrollLimitYMin: js.UndefOr[String] = js.undefined
    
    val msScrollRails: js.UndefOr[String] = js.undefined
    
    val msScrollSnapPointsX: js.UndefOr[String] = js.undefined
    
    val msScrollSnapPointsY: js.UndefOr[String] = js.undefined
    
    val msScrollSnapType: js.UndefOr[String] = js.undefined
    
    val msScrollSnapX: js.UndefOr[String] = js.undefined
    
    val msScrollSnapY: js.UndefOr[String] = js.undefined
    
    val msScrollTranslation: js.UndefOr[String] = js.undefined
    
    val msTextCombineHorizontal: js.UndefOr[String] = js.undefined
    
    val msTextSizeAdjust: js.UndefOr[String] = js.undefined
    
    val msTouchAction: js.UndefOr[String] = js.undefined
    
    val msTouchSelect: js.UndefOr[String] = js.undefined
    
    val msUserSelect: js.UndefOr[String] = js.undefined
    
    val msWrapFlow: js.UndefOr[String] = js.undefined
    
    val msWrapMargin: js.UndefOr[String] = js.undefined
    
    val msWrapThrough: js.UndefOr[String] = js.undefined
    
    val opacity: js.UndefOr[String] = js.undefined
    
    val order: js.UndefOr[String] = js.undefined
    
    val orphans: js.UndefOr[String] = js.undefined
    
    val outline: js.UndefOr[String] = js.undefined
    
    val outlineColor: js.UndefOr[String] = js.undefined
    
    val outlineStyle: js.UndefOr[String] = js.undefined
    
    val outlineWidth: js.UndefOr[String] = js.undefined
    
    val overflow: js.UndefOr[String] = js.undefined
    
    val overflowX: js.UndefOr[String] = js.undefined
    
    val overflowY: js.UndefOr[String] = js.undefined
    
    val padding: js.UndefOr[String] = js.undefined
    
    val paddingBottom: js.UndefOr[String] = js.undefined
    
    val paddingLeft: js.UndefOr[String] = js.undefined
    
    val paddingRight: js.UndefOr[String] = js.undefined
    
    val paddingTop: js.UndefOr[String] = js.undefined
    
    val pageBreakAfter: js.UndefOr[String] = js.undefined
    
    val pageBreakBefore: js.UndefOr[String] = js.undefined
    
    val pageBreakInside: js.UndefOr[String] = js.undefined
    
    val perspective: js.UndefOr[String] = js.undefined
    
    val perspectiveOrigin: js.UndefOr[String] = js.undefined
    
    val pointerEvents: js.UndefOr[String] = js.undefined
    
    val position: js.UndefOr[String] = js.undefined
    
    val quotes: js.UndefOr[String] = js.undefined
    
    val resize: js.UndefOr[String] = js.undefined
    
    val right: js.UndefOr[String] = js.undefined
    
    val rubyAlign: js.UndefOr[String] = js.undefined
    
    val rubyOverhang: js.UndefOr[String] = js.undefined
    
    val rubyPosition: js.UndefOr[String] = js.undefined
    
    val stopColor: js.UndefOr[String] = js.undefined
    
    val stopOpacity: js.UndefOr[String] = js.undefined
    
    val stroke: js.UndefOr[String] = js.undefined
    
    val strokeDasharray: js.UndefOr[String] = js.undefined
    
    val strokeDashoffset: js.UndefOr[String] = js.undefined
    
    val strokeLinecap: js.UndefOr[String] = js.undefined
    
    val strokeLinejoin: js.UndefOr[String] = js.undefined
    
    val strokeMiterlimit: js.UndefOr[String] = js.undefined
    
    val strokeOpacity: js.UndefOr[String] = js.undefined
    
    val strokeWidth: js.UndefOr[String] = js.undefined
    
    val tableLayout: js.UndefOr[String] = js.undefined
    
    val textAlign: js.UndefOr[String] = js.undefined
    
    val textAlignLast: js.UndefOr[String] = js.undefined
    
    val textAnchor: js.UndefOr[String] = js.undefined
    
    val textDecoration: js.UndefOr[String] = js.undefined
    
    val textIndent: js.UndefOr[String] = js.undefined
    
    val textJustify: js.UndefOr[String] = js.undefined
    
    val textKashida: js.UndefOr[String] = js.undefined
    
    val textKashidaSpace: js.UndefOr[String] = js.undefined
    
    val textOverflow: js.UndefOr[String] = js.undefined
    
    val textShadow: js.UndefOr[String] = js.undefined
    
    val textTransform: js.UndefOr[String] = js.undefined
    
    val textUnderlinePosition: js.UndefOr[String] = js.undefined
    
    val top: js.UndefOr[String] = js.undefined
    
    val touchAction: js.UndefOr[String] = js.undefined
    
    val transform: js.UndefOr[String] = js.undefined
    
    val transformOrigin: js.UndefOr[String] = js.undefined
    
    val transformStyle: js.UndefOr[String] = js.undefined
    
    val transition: js.UndefOr[String] = js.undefined
    
    val transitionDelay: js.UndefOr[String] = js.undefined
    
    val transitionDuration: js.UndefOr[String] = js.undefined
    
    val transitionProperty: js.UndefOr[String] = js.undefined
    
    val transitionTimingFunction: js.UndefOr[String] = js.undefined
    
    val unicodeBidi: js.UndefOr[String] = js.undefined
    
    val verticalAlign: js.UndefOr[String] = js.undefined
    
    val visibility: js.UndefOr[String] = js.undefined
    
    val webkitAlignContent: js.UndefOr[String] = js.undefined
    
    val webkitAlignItems: js.UndefOr[String] = js.undefined
    
    val webkitAlignSelf: js.UndefOr[String] = js.undefined
    
    val webkitAnimation: js.UndefOr[String] = js.undefined
    
    val webkitAnimationDelay: js.UndefOr[String] = js.undefined
    
    val webkitAnimationDirection: js.UndefOr[String] = js.undefined
    
    val webkitAnimationDuration: js.UndefOr[String] = js.undefined
    
    val webkitAnimationFillMode: js.UndefOr[String] = js.undefined
    
    val webkitAnimationIterationCount: js.UndefOr[String] = js.undefined
    
    val webkitAnimationName: js.UndefOr[String] = js.undefined
    
    val webkitAnimationPlayState: js.UndefOr[String] = js.undefined
    
    val webkitAnimationTimingFunction: js.UndefOr[String] = js.undefined
    
    val webkitAppearance: js.UndefOr[String] = js.undefined
    
    val webkitBackfaceVisibility: js.UndefOr[String] = js.undefined
    
    val webkitBackgroundClip: js.UndefOr[String] = js.undefined
    
    val webkitBackgroundOrigin: js.UndefOr[String] = js.undefined
    
    val webkitBackgroundSize: js.UndefOr[String] = js.undefined
    
    val webkitBorderBottomLeftRadius: js.UndefOr[String] = js.undefined
    
    val webkitBorderBottomRightRadius: js.UndefOr[String] = js.undefined
    
    val webkitBorderImage: js.UndefOr[String] = js.undefined
    
    val webkitBorderRadius: js.UndefOr[String] = js.undefined
    
    val webkitBorderTopLeftRadius: js.UndefOr[String] = js.undefined
    
    val webkitBorderTopRightRadius: js.UndefOr[String] = js.undefined
    
    val webkitBoxAlign: js.UndefOr[String] = js.undefined
    
    val webkitBoxDirection: js.UndefOr[String] = js.undefined
    
    val webkitBoxFlex: js.UndefOr[String] = js.undefined
    
    val webkitBoxOrdinalGroup: js.UndefOr[String] = js.undefined
    
    val webkitBoxOrient: js.UndefOr[String] = js.undefined
    
    val webkitBoxPack: js.UndefOr[String] = js.undefined
    
    val webkitBoxSizing: js.UndefOr[String] = js.undefined
    
    val webkitColumnBreakAfter: js.UndefOr[String] = js.undefined
    
    val webkitColumnBreakBefore: js.UndefOr[String] = js.undefined
    
    val webkitColumnBreakInside: js.UndefOr[String] = js.undefined
    
    val webkitColumnCount: js.UndefOr[String] = js.undefined
    
    val webkitColumnGap: js.UndefOr[String] = js.undefined
    
    val webkitColumnRule: js.UndefOr[String] = js.undefined
    
    val webkitColumnRuleColor: js.UndefOr[String] = js.undefined
    
    val webkitColumnRuleStyle: js.UndefOr[String] = js.undefined
    
    val webkitColumnRuleWidth: js.UndefOr[String] = js.undefined
    
    val webkitColumnSpan: js.UndefOr[String] = js.undefined
    
    val webkitColumnWidth: js.UndefOr[String] = js.undefined
    
    val webkitColumns: js.UndefOr[String] = js.undefined
    
    val webkitFilter: js.UndefOr[String] = js.undefined
    
    val webkitFlex: js.UndefOr[String] = js.undefined
    
    val webkitFlexBasis: js.UndefOr[String] = js.undefined
    
    val webkitFlexDirection: js.UndefOr[String] = js.undefined
    
    val webkitFlexFlow: js.UndefOr[String] = js.undefined
    
    val webkitFlexGrow: js.UndefOr[String] = js.undefined
    
    val webkitFlexShrink: js.UndefOr[String] = js.undefined
    
    val webkitFlexWrap: js.UndefOr[String] = js.undefined
    
    val webkitJustifyContent: js.UndefOr[String] = js.undefined
    
    val webkitOrder: js.UndefOr[String] = js.undefined
    
    val webkitPerspective: js.UndefOr[String] = js.undefined
    
    val webkitPerspectiveOrigin: js.UndefOr[String] = js.undefined
    
    val webkitTapHighlightColor: js.UndefOr[String] = js.undefined
    
    val webkitTextFillColor: js.UndefOr[String] = js.undefined
    
    val webkitTextSizeAdjust: js.UndefOr[String] = js.undefined
    
    val webkitTransform: js.UndefOr[String] = js.undefined
    
    val webkitTransformOrigin: js.UndefOr[String] = js.undefined
    
    val webkitTransformStyle: js.UndefOr[String] = js.undefined
    
    val webkitTransition: js.UndefOr[String] = js.undefined
    
    val webkitTransitionDelay: js.UndefOr[String] = js.undefined
    
    val webkitTransitionDuration: js.UndefOr[String] = js.undefined
    
    val webkitTransitionProperty: js.UndefOr[String] = js.undefined
    
    val webkitTransitionTimingFunction: js.UndefOr[String] = js.undefined
    
    val webkitUserModify: js.UndefOr[String] = js.undefined
    
    val webkitUserSelect: js.UndefOr[String] = js.undefined
    
    val webkitWritingMode: js.UndefOr[String] = js.undefined
    
    val whiteSpace: js.UndefOr[String] = js.undefined
    
    val widows: js.UndefOr[String] = js.undefined
    
    val width: js.UndefOr[String] = js.undefined
    
    val wordBreak: js.UndefOr[String] = js.undefined
    
    val wordSpacing: js.UndefOr[String] = js.undefined
    
    val wordWrap: js.UndefOr[String] = js.undefined
    
    val writingMode: js.UndefOr[String] = js.undefined
    
    val zIndex: js.UndefOr[String] = js.undefined
    
    val zoom: js.UndefOr[String] = js.undefined
  }
  object ElementInlineStyle {
    
    inline def apply(): ElementInlineStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementInlineStyle]
    }
    
    extension [Self <: ElementInlineStyle](x: Self) {
      
      inline def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: String): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignmentBaseline(value: String): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelay(value: String): Self = StObject.set(x, "animationDelay", value.asInstanceOf[js.Any])
      
      inline def setAnimationDelayUndefined: Self = StObject.set(x, "animationDelay", js.undefined)
      
      inline def setAnimationDirection(value: String): Self = StObject.set(x, "animationDirection", value.asInstanceOf[js.Any])
      
      inline def setAnimationDirectionUndefined: Self = StObject.set(x, "animationDirection", js.undefined)
      
      inline def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setAnimationFillMode(value: String): Self = StObject.set(x, "animationFillMode", value.asInstanceOf[js.Any])
      
      inline def setAnimationFillModeUndefined: Self = StObject.set(x, "animationFillMode", js.undefined)
      
      inline def setAnimationIterationCount(value: String): Self = StObject.set(x, "animationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setAnimationIterationCountUndefined: Self = StObject.set(x, "animationIterationCount", js.undefined)
      
      inline def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
      
      inline def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
      
      inline def setAnimationPlayState(value: String): Self = StObject.set(x, "animationPlayState", value.asInstanceOf[js.Any])
      
      inline def setAnimationPlayStateUndefined: Self = StObject.set(x, "animationPlayState", js.undefined)
      
      inline def setAnimationTimingFunction(value: String): Self = StObject.set(x, "animationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimingFunctionUndefined: Self = StObject.set(x, "animationTimingFunction", js.undefined)
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackfaceVisibility(value: String): Self = StObject.set(x, "backfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setBackfaceVisibilityUndefined: Self = StObject.set(x, "backfaceVisibility", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachment(value: String): Self = StObject.set(x, "backgroundAttachment", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAttachmentUndefined: Self = StObject.set(x, "backgroundAttachment", js.undefined)
      
      inline def setBackgroundClip(value: String): Self = StObject.set(x, "backgroundClip", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipUndefined: Self = StObject.set(x, "backgroundClip", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOrigin(value: String): Self = StObject.set(x, "backgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginUndefined: Self = StObject.set(x, "backgroundOrigin", js.undefined)
      
      inline def setBackgroundPosition(value: String): Self = StObject.set(x, "backgroundPosition", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionUndefined: Self = StObject.set(x, "backgroundPosition", js.undefined)
      
      inline def setBackgroundPositionX(value: String): Self = StObject.set(x, "backgroundPositionX", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionXUndefined: Self = StObject.set(x, "backgroundPositionX", js.undefined)
      
      inline def setBackgroundPositionY(value: String): Self = StObject.set(x, "backgroundPositionY", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPositionYUndefined: Self = StObject.set(x, "backgroundPositionY", js.undefined)
      
      inline def setBackgroundRepeat(value: String): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setBackgroundSize(value: String): Self = StObject.set(x, "backgroundSize", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeUndefined: Self = StObject.set(x, "backgroundSize", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBaselineShift(value: String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderBottom(value: String): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColor(value: String): Self = StObject.set(x, "borderBottomColor", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomColorUndefined: Self = StObject.set(x, "borderBottomColor", js.undefined)
      
      inline def setBorderBottomLeftRadius(value: String): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "borderBottomLeftRadius", js.undefined)
      
      inline def setBorderBottomRightRadius(value: String): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomRightRadiusUndefined: Self = StObject.set(x, "borderBottomRightRadius", js.undefined)
      
      inline def setBorderBottomStyle(value: String): Self = StObject.set(x, "borderBottomStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomStyleUndefined: Self = StObject.set(x, "borderBottomStyle", js.undefined)
      
      inline def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
      
      inline def setBorderBottomWidth(value: String): Self = StObject.set(x, "borderBottomWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderBottomWidthUndefined: Self = StObject.set(x, "borderBottomWidth", js.undefined)
      
      inline def setBorderCollapse(value: String): Self = StObject.set(x, "borderCollapse", value.asInstanceOf[js.Any])
      
      inline def setBorderCollapseUndefined: Self = StObject.set(x, "borderCollapse", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderImage(value: String): Self = StObject.set(x, "borderImage", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutset(value: String): Self = StObject.set(x, "borderImageOutset", value.asInstanceOf[js.Any])
      
      inline def setBorderImageOutsetUndefined: Self = StObject.set(x, "borderImageOutset", js.undefined)
      
      inline def setBorderImageRepeat(value: String): Self = StObject.set(x, "borderImageRepeat", value.asInstanceOf[js.Any])
      
      inline def setBorderImageRepeatUndefined: Self = StObject.set(x, "borderImageRepeat", js.undefined)
      
      inline def setBorderImageSlice(value: String): Self = StObject.set(x, "borderImageSlice", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSliceUndefined: Self = StObject.set(x, "borderImageSlice", js.undefined)
      
      inline def setBorderImageSource(value: String): Self = StObject.set(x, "borderImageSource", value.asInstanceOf[js.Any])
      
      inline def setBorderImageSourceUndefined: Self = StObject.set(x, "borderImageSource", js.undefined)
      
      inline def setBorderImageUndefined: Self = StObject.set(x, "borderImage", js.undefined)
      
      inline def setBorderImageWidth(value: String): Self = StObject.set(x, "borderImageWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderImageWidthUndefined: Self = StObject.set(x, "borderImageWidth", js.undefined)
      
      inline def setBorderLeft(value: String): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColor(value: String): Self = StObject.set(x, "borderLeftColor", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftColorUndefined: Self = StObject.set(x, "borderLeftColor", js.undefined)
      
      inline def setBorderLeftStyle(value: String): Self = StObject.set(x, "borderLeftStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftStyleUndefined: Self = StObject.set(x, "borderLeftStyle", js.undefined)
      
      inline def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
      
      inline def setBorderLeftWidth(value: String): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderLeftWidthUndefined: Self = StObject.set(x, "borderLeftWidth", js.undefined)
      
      inline def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderRight(value: String): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColor(value: String): Self = StObject.set(x, "borderRightColor", value.asInstanceOf[js.Any])
      
      inline def setBorderRightColorUndefined: Self = StObject.set(x, "borderRightColor", js.undefined)
      
      inline def setBorderRightStyle(value: String): Self = StObject.set(x, "borderRightStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderRightStyleUndefined: Self = StObject.set(x, "borderRightStyle", js.undefined)
      
      inline def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
      
      inline def setBorderRightWidth(value: String): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderRightWidthUndefined: Self = StObject.set(x, "borderRightWidth", js.undefined)
      
      inline def setBorderSpacing(value: String): Self = StObject.set(x, "borderSpacing", value.asInstanceOf[js.Any])
      
      inline def setBorderSpacingUndefined: Self = StObject.set(x, "borderSpacing", js.undefined)
      
      inline def setBorderStyle(value: String): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setBorderTop(value: String): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
      
      inline def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
      
      inline def setBorderTopLeftRadius(value: String): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopLeftRadiusUndefined: Self = StObject.set(x, "borderTopLeftRadius", js.undefined)
      
      inline def setBorderTopRightRadius(value: String): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderTopRightRadiusUndefined: Self = StObject.set(x, "borderTopRightRadius", js.undefined)
      
      inline def setBorderTopStyle(value: String): Self = StObject.set(x, "borderTopStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderTopStyleUndefined: Self = StObject.set(x, "borderTopStyle", js.undefined)
      
      inline def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
      
      inline def setBorderTopWidth(value: String): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderWidth(value: String): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      inline def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      inline def setBreakAfter(value: String): Self = StObject.set(x, "breakAfter", value.asInstanceOf[js.Any])
      
      inline def setBreakAfterUndefined: Self = StObject.set(x, "breakAfter", js.undefined)
      
      inline def setBreakBefore(value: String): Self = StObject.set(x, "breakBefore", value.asInstanceOf[js.Any])
      
      inline def setBreakBeforeUndefined: Self = StObject.set(x, "breakBefore", js.undefined)
      
      inline def setBreakInside(value: String): Self = StObject.set(x, "breakInside", value.asInstanceOf[js.Any])
      
      inline def setBreakInsideUndefined: Self = StObject.set(x, "breakInside", js.undefined)
      
      inline def setCaptionSide(value: String): Self = StObject.set(x, "captionSide", value.asInstanceOf[js.Any])
      
      inline def setCaptionSideUndefined: Self = StObject.set(x, "captionSide", js.undefined)
      
      inline def setClear(value: String): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setClip(value: String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFilters(value: String): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColumnCount(value: String): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnFill(value: String): Self = StObject.set(x, "columnFill", value.asInstanceOf[js.Any])
      
      inline def setColumnFillUndefined: Self = StObject.set(x, "columnFill", js.undefined)
      
      inline def setColumnGap(value: String): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      inline def setColumnRule(value: String): Self = StObject.set(x, "columnRule", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColor(value: String): Self = StObject.set(x, "columnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleColorUndefined: Self = StObject.set(x, "columnRuleColor", js.undefined)
      
      inline def setColumnRuleStyle(value: String): Self = StObject.set(x, "columnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleStyleUndefined: Self = StObject.set(x, "columnRuleStyle", js.undefined)
      
      inline def setColumnRuleUndefined: Self = StObject.set(x, "columnRule", js.undefined)
      
      inline def setColumnRuleWidth(value: String): Self = StObject.set(x, "columnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnRuleWidthUndefined: Self = StObject.set(x, "columnRuleWidth", js.undefined)
      
      inline def setColumnSpan(value: String): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
      
      inline def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
      
      inline def setColumnWidth(value: String): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(value: String): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCounterIncrement(value: String): Self = StObject.set(x, "counterIncrement", value.asInstanceOf[js.Any])
      
      inline def setCounterIncrementUndefined: Self = StObject.set(x, "counterIncrement", js.undefined)
      
      inline def setCounterReset(value: String): Self = StObject.set(x, "counterReset", value.asInstanceOf[js.Any])
      
      inline def setCounterResetUndefined: Self = StObject.set(x, "counterReset", js.undefined)
      
      inline def setCssFloat(value: String): Self = StObject.set(x, "cssFloat", value.asInstanceOf[js.Any])
      
      inline def setCssFloatUndefined: Self = StObject.set(x, "cssFloat", js.undefined)
      
      inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
      
      inline def setCssTextUndefined: Self = StObject.set(x, "cssText", js.undefined)
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDominantBaseline(value: String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setEmptyCells(value: String): Self = StObject.set(x, "emptyCells", value.asInstanceOf[js.Any])
      
      inline def setEmptyCellsUndefined: Self = StObject.set(x, "emptyCells", js.undefined)
      
      inline def setEnableBackground(value: String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
      
      inline def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexBasis(value: String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexFlow(value: String): Self = StObject.set(x, "flexFlow", value.asInstanceOf[js.Any])
      
      inline def setFlexFlowUndefined: Self = StObject.set(x, "flexFlow", js.undefined)
      
      inline def setFlexGrow(value: String): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFlexWrap(value: String): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setFloodColor(value: String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodOpacity(value: String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjust(value: String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setGlyphOrientationHorizontal(value: String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
      
      inline def setGlyphOrientationVertical(value: String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImeMode(value: String): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      inline def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      inline def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setKerning(value: String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLightingColor(value: String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setListStyle(value: String): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleImage(value: String): Self = StObject.set(x, "listStyleImage", value.asInstanceOf[js.Any])
      
      inline def setListStyleImageUndefined: Self = StObject.set(x, "listStyleImage", js.undefined)
      
      inline def setListStylePosition(value: String): Self = StObject.set(x, "listStylePosition", value.asInstanceOf[js.Any])
      
      inline def setListStylePositionUndefined: Self = StObject.set(x, "listStylePosition", js.undefined)
      
      inline def setListStyleType(value: String): Self = StObject.set(x, "listStyleType", value.asInstanceOf[js.Any])
      
      inline def setListStyleTypeUndefined: Self = StObject.set(x, "listStyleType", js.undefined)
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: String): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: String): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: String): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: String): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMsContentZoomChaining(value: String): Self = StObject.set(x, "msContentZoomChaining", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomChainingUndefined: Self = StObject.set(x, "msContentZoomChaining", js.undefined)
      
      inline def setMsContentZoomLimit(value: String): Self = StObject.set(x, "msContentZoomLimit", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMax(value: String): Self = StObject.set(x, "msContentZoomLimitMax", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMaxUndefined: Self = StObject.set(x, "msContentZoomLimitMax", js.undefined)
      
      inline def setMsContentZoomLimitMin(value: String): Self = StObject.set(x, "msContentZoomLimitMin", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomLimitMinUndefined: Self = StObject.set(x, "msContentZoomLimitMin", js.undefined)
      
      inline def setMsContentZoomLimitUndefined: Self = StObject.set(x, "msContentZoomLimit", js.undefined)
      
      inline def setMsContentZoomSnap(value: String): Self = StObject.set(x, "msContentZoomSnap", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPoints(value: String): Self = StObject.set(x, "msContentZoomSnapPoints", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapPointsUndefined: Self = StObject.set(x, "msContentZoomSnapPoints", js.undefined)
      
      inline def setMsContentZoomSnapType(value: String): Self = StObject.set(x, "msContentZoomSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomSnapTypeUndefined: Self = StObject.set(x, "msContentZoomSnapType", js.undefined)
      
      inline def setMsContentZoomSnapUndefined: Self = StObject.set(x, "msContentZoomSnap", js.undefined)
      
      inline def setMsContentZooming(value: String): Self = StObject.set(x, "msContentZooming", value.asInstanceOf[js.Any])
      
      inline def setMsContentZoomingUndefined: Self = StObject.set(x, "msContentZooming", js.undefined)
      
      inline def setMsFlowFrom(value: String): Self = StObject.set(x, "msFlowFrom", value.asInstanceOf[js.Any])
      
      inline def setMsFlowFromUndefined: Self = StObject.set(x, "msFlowFrom", js.undefined)
      
      inline def setMsFlowInto(value: String): Self = StObject.set(x, "msFlowInto", value.asInstanceOf[js.Any])
      
      inline def setMsFlowIntoUndefined: Self = StObject.set(x, "msFlowInto", js.undefined)
      
      inline def setMsFontFeatureSettings(value: String): Self = StObject.set(x, "msFontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setMsFontFeatureSettingsUndefined: Self = StObject.set(x, "msFontFeatureSettings", js.undefined)
      
      inline def setMsGridColumn(value: String): Self = StObject.set(x, "msGridColumn", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnAlign(value: String): Self = StObject.set(x, "msGridColumnAlign", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnAlignUndefined: Self = StObject.set(x, "msGridColumnAlign", js.undefined)
      
      inline def setMsGridColumnSpan(value: String): Self = StObject.set(x, "msGridColumnSpan", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnSpanUndefined: Self = StObject.set(x, "msGridColumnSpan", js.undefined)
      
      inline def setMsGridColumnUndefined: Self = StObject.set(x, "msGridColumn", js.undefined)
      
      inline def setMsGridColumns(value: String): Self = StObject.set(x, "msGridColumns", value.asInstanceOf[js.Any])
      
      inline def setMsGridColumnsUndefined: Self = StObject.set(x, "msGridColumns", js.undefined)
      
      inline def setMsGridRow(value: String): Self = StObject.set(x, "msGridRow", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowAlign(value: String): Self = StObject.set(x, "msGridRowAlign", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowAlignUndefined: Self = StObject.set(x, "msGridRowAlign", js.undefined)
      
      inline def setMsGridRowSpan(value: String): Self = StObject.set(x, "msGridRowSpan", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowSpanUndefined: Self = StObject.set(x, "msGridRowSpan", js.undefined)
      
      inline def setMsGridRowUndefined: Self = StObject.set(x, "msGridRow", js.undefined)
      
      inline def setMsGridRows(value: String): Self = StObject.set(x, "msGridRows", value.asInstanceOf[js.Any])
      
      inline def setMsGridRowsUndefined: Self = StObject.set(x, "msGridRows", js.undefined)
      
      inline def setMsHighContrastAdjust(value: String): Self = StObject.set(x, "msHighContrastAdjust", value.asInstanceOf[js.Any])
      
      inline def setMsHighContrastAdjustUndefined: Self = StObject.set(x, "msHighContrastAdjust", js.undefined)
      
      inline def setMsHyphenateLimitChars(value: String): Self = StObject.set(x, "msHyphenateLimitChars", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitCharsUndefined: Self = StObject.set(x, "msHyphenateLimitChars", js.undefined)
      
      inline def setMsHyphenateLimitLines(value: String): Self = StObject.set(x, "msHyphenateLimitLines", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitLinesUndefined: Self = StObject.set(x, "msHyphenateLimitLines", js.undefined)
      
      inline def setMsHyphenateLimitZone(value: String): Self = StObject.set(x, "msHyphenateLimitZone", value.asInstanceOf[js.Any])
      
      inline def setMsHyphenateLimitZoneUndefined: Self = StObject.set(x, "msHyphenateLimitZone", js.undefined)
      
      inline def setMsHyphens(value: String): Self = StObject.set(x, "msHyphens", value.asInstanceOf[js.Any])
      
      inline def setMsHyphensUndefined: Self = StObject.set(x, "msHyphens", js.undefined)
      
      inline def setMsImeAlign(value: String): Self = StObject.set(x, "msImeAlign", value.asInstanceOf[js.Any])
      
      inline def setMsImeAlignUndefined: Self = StObject.set(x, "msImeAlign", js.undefined)
      
      inline def setMsOverflowStyle(value: String): Self = StObject.set(x, "msOverflowStyle", value.asInstanceOf[js.Any])
      
      inline def setMsOverflowStyleUndefined: Self = StObject.set(x, "msOverflowStyle", js.undefined)
      
      inline def setMsScrollChaining(value: String): Self = StObject.set(x, "msScrollChaining", value.asInstanceOf[js.Any])
      
      inline def setMsScrollChainingUndefined: Self = StObject.set(x, "msScrollChaining", js.undefined)
      
      inline def setMsScrollLimit(value: String): Self = StObject.set(x, "msScrollLimit", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitUndefined: Self = StObject.set(x, "msScrollLimit", js.undefined)
      
      inline def setMsScrollLimitXMax(value: String): Self = StObject.set(x, "msScrollLimitXMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMaxUndefined: Self = StObject.set(x, "msScrollLimitXMax", js.undefined)
      
      inline def setMsScrollLimitXMin(value: String): Self = StObject.set(x, "msScrollLimitXMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitXMinUndefined: Self = StObject.set(x, "msScrollLimitXMin", js.undefined)
      
      inline def setMsScrollLimitYMax(value: String): Self = StObject.set(x, "msScrollLimitYMax", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMaxUndefined: Self = StObject.set(x, "msScrollLimitYMax", js.undefined)
      
      inline def setMsScrollLimitYMin(value: String): Self = StObject.set(x, "msScrollLimitYMin", value.asInstanceOf[js.Any])
      
      inline def setMsScrollLimitYMinUndefined: Self = StObject.set(x, "msScrollLimitYMin", js.undefined)
      
      inline def setMsScrollRails(value: String): Self = StObject.set(x, "msScrollRails", value.asInstanceOf[js.Any])
      
      inline def setMsScrollRailsUndefined: Self = StObject.set(x, "msScrollRails", js.undefined)
      
      inline def setMsScrollSnapPointsX(value: String): Self = StObject.set(x, "msScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsXUndefined: Self = StObject.set(x, "msScrollSnapPointsX", js.undefined)
      
      inline def setMsScrollSnapPointsY(value: String): Self = StObject.set(x, "msScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapPointsYUndefined: Self = StObject.set(x, "msScrollSnapPointsY", js.undefined)
      
      inline def setMsScrollSnapType(value: String): Self = StObject.set(x, "msScrollSnapType", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapTypeUndefined: Self = StObject.set(x, "msScrollSnapType", js.undefined)
      
      inline def setMsScrollSnapX(value: String): Self = StObject.set(x, "msScrollSnapX", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapXUndefined: Self = StObject.set(x, "msScrollSnapX", js.undefined)
      
      inline def setMsScrollSnapY(value: String): Self = StObject.set(x, "msScrollSnapY", value.asInstanceOf[js.Any])
      
      inline def setMsScrollSnapYUndefined: Self = StObject.set(x, "msScrollSnapY", js.undefined)
      
      inline def setMsScrollTranslation(value: String): Self = StObject.set(x, "msScrollTranslation", value.asInstanceOf[js.Any])
      
      inline def setMsScrollTranslationUndefined: Self = StObject.set(x, "msScrollTranslation", js.undefined)
      
      inline def setMsTextCombineHorizontal(value: String): Self = StObject.set(x, "msTextCombineHorizontal", value.asInstanceOf[js.Any])
      
      inline def setMsTextCombineHorizontalUndefined: Self = StObject.set(x, "msTextCombineHorizontal", js.undefined)
      
      inline def setMsTextSizeAdjust(value: String): Self = StObject.set(x, "msTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setMsTextSizeAdjustUndefined: Self = StObject.set(x, "msTextSizeAdjust", js.undefined)
      
      inline def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      
      inline def setMsTouchActionUndefined: Self = StObject.set(x, "msTouchAction", js.undefined)
      
      inline def setMsTouchSelect(value: String): Self = StObject.set(x, "msTouchSelect", value.asInstanceOf[js.Any])
      
      inline def setMsTouchSelectUndefined: Self = StObject.set(x, "msTouchSelect", js.undefined)
      
      inline def setMsUserSelect(value: String): Self = StObject.set(x, "msUserSelect", value.asInstanceOf[js.Any])
      
      inline def setMsUserSelectUndefined: Self = StObject.set(x, "msUserSelect", js.undefined)
      
      inline def setMsWrapFlow(value: String): Self = StObject.set(x, "msWrapFlow", value.asInstanceOf[js.Any])
      
      inline def setMsWrapFlowUndefined: Self = StObject.set(x, "msWrapFlow", js.undefined)
      
      inline def setMsWrapMargin(value: String): Self = StObject.set(x, "msWrapMargin", value.asInstanceOf[js.Any])
      
      inline def setMsWrapMarginUndefined: Self = StObject.set(x, "msWrapMargin", js.undefined)
      
      inline def setMsWrapThrough(value: String): Self = StObject.set(x, "msWrapThrough", value.asInstanceOf[js.Any])
      
      inline def setMsWrapThroughUndefined: Self = StObject.set(x, "msWrapThrough", js.undefined)
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrphans(value: String): Self = StObject.set(x, "orphans", value.asInstanceOf[js.Any])
      
      inline def setOrphansUndefined: Self = StObject.set(x, "orphans", js.undefined)
      
      inline def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      inline def setOutlineColor(value: String): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
      
      inline def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
      
      inline def setOutlineStyle(value: String): Self = StObject.set(x, "outlineStyle", value.asInstanceOf[js.Any])
      
      inline def setOutlineStyleUndefined: Self = StObject.set(x, "outlineStyle", js.undefined)
      
      inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      inline def setOutlineWidth(value: String): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
      
      inline def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setOverflowX(value: String): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
      
      inline def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
      
      inline def setOverflowY(value: String): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
      
      inline def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: String): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: String): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPageBreakAfter(value: String): Self = StObject.set(x, "pageBreakAfter", value.asInstanceOf[js.Any])
      
      inline def setPageBreakAfterUndefined: Self = StObject.set(x, "pageBreakAfter", js.undefined)
      
      inline def setPageBreakBefore(value: String): Self = StObject.set(x, "pageBreakBefore", value.asInstanceOf[js.Any])
      
      inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
      
      inline def setPageBreakInside(value: String): Self = StObject.set(x, "pageBreakInside", value.asInstanceOf[js.Any])
      
      inline def setPageBreakInsideUndefined: Self = StObject.set(x, "pageBreakInside", js.undefined)
      
      inline def setPerspective(value: String): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOrigin(value: String): Self = StObject.set(x, "perspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setPerspectiveOriginUndefined: Self = StObject.set(x, "perspectiveOrigin", js.undefined)
      
      inline def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
      
      inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
      
      inline def setResize(value: String): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRubyAlign(value: String): Self = StObject.set(x, "rubyAlign", value.asInstanceOf[js.Any])
      
      inline def setRubyAlignUndefined: Self = StObject.set(x, "rubyAlign", js.undefined)
      
      inline def setRubyOverhang(value: String): Self = StObject.set(x, "rubyOverhang", value.asInstanceOf[js.Any])
      
      inline def setRubyOverhangUndefined: Self = StObject.set(x, "rubyOverhang", js.undefined)
      
      inline def setRubyPosition(value: String): Self = StObject.set(x, "rubyPosition", value.asInstanceOf[js.Any])
      
      inline def setRubyPositionUndefined: Self = StObject.set(x, "rubyPosition", js.undefined)
      
      inline def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopOpacity(value: String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: String): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDashoffset(value: String): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeLinecap(value: String): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinejoin(value: String): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeMiterlimit(value: String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeOpacity(value: String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTableLayout(value: String): Self = StObject.set(x, "tableLayout", value.asInstanceOf[js.Any])
      
      inline def setTableLayoutUndefined: Self = StObject.set(x, "tableLayout", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLast(value: String): Self = StObject.set(x, "textAlignLast", value.asInstanceOf[js.Any])
      
      inline def setTextAlignLastUndefined: Self = StObject.set(x, "textAlignLast", js.undefined)
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextIndent(value: String): Self = StObject.set(x, "textIndent", value.asInstanceOf[js.Any])
      
      inline def setTextIndentUndefined: Self = StObject.set(x, "textIndent", js.undefined)
      
      inline def setTextJustify(value: String): Self = StObject.set(x, "textJustify", value.asInstanceOf[js.Any])
      
      inline def setTextJustifyUndefined: Self = StObject.set(x, "textJustify", js.undefined)
      
      inline def setTextKashida(value: String): Self = StObject.set(x, "textKashida", value.asInstanceOf[js.Any])
      
      inline def setTextKashidaSpace(value: String): Self = StObject.set(x, "textKashidaSpace", value.asInstanceOf[js.Any])
      
      inline def setTextKashidaSpaceUndefined: Self = StObject.set(x, "textKashidaSpace", js.undefined)
      
      inline def setTextKashidaUndefined: Self = StObject.set(x, "textKashida", js.undefined)
      
      inline def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      inline def setTextUnderlinePosition(value: String): Self = StObject.set(x, "textUnderlinePosition", value.asInstanceOf[js.Any])
      
      inline def setTextUnderlinePositionUndefined: Self = StObject.set(x, "textUnderlinePosition", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setTouchAction(value: String): Self = StObject.set(x, "touchAction", value.asInstanceOf[js.Any])
      
      inline def setTouchActionUndefined: Self = StObject.set(x, "touchAction", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setTransformStyle(value: String): Self = StObject.set(x, "transformStyle", value.asInstanceOf[js.Any])
      
      inline def setTransformStyleUndefined: Self = StObject.set(x, "transformStyle", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelay(value: String): Self = StObject.set(x, "transitionDelay", value.asInstanceOf[js.Any])
      
      inline def setTransitionDelayUndefined: Self = StObject.set(x, "transitionDelay", js.undefined)
      
      inline def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setTransitionProperty(value: String): Self = StObject.set(x, "transitionProperty", value.asInstanceOf[js.Any])
      
      inline def setTransitionPropertyUndefined: Self = StObject.set(x, "transitionProperty", js.undefined)
      
      inline def setTransitionTimingFunction(value: String): Self = StObject.set(x, "transitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setTransitionTimingFunctionUndefined: Self = StObject.set(x, "transitionTimingFunction", js.undefined)
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUnicodeBidi(value: String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
      
      inline def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
      
      inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setWebkitAlignContent(value: String): Self = StObject.set(x, "webkitAlignContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignContentUndefined: Self = StObject.set(x, "webkitAlignContent", js.undefined)
      
      inline def setWebkitAlignItems(value: String): Self = StObject.set(x, "webkitAlignItems", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignItemsUndefined: Self = StObject.set(x, "webkitAlignItems", js.undefined)
      
      inline def setWebkitAlignSelf(value: String): Self = StObject.set(x, "webkitAlignSelf", value.asInstanceOf[js.Any])
      
      inline def setWebkitAlignSelfUndefined: Self = StObject.set(x, "webkitAlignSelf", js.undefined)
      
      inline def setWebkitAnimation(value: String): Self = StObject.set(x, "webkitAnimation", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelay(value: String): Self = StObject.set(x, "webkitAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDelayUndefined: Self = StObject.set(x, "webkitAnimationDelay", js.undefined)
      
      inline def setWebkitAnimationDirection(value: String): Self = StObject.set(x, "webkitAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDirectionUndefined: Self = StObject.set(x, "webkitAnimationDirection", js.undefined)
      
      inline def setWebkitAnimationDuration(value: String): Self = StObject.set(x, "webkitAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationDurationUndefined: Self = StObject.set(x, "webkitAnimationDuration", js.undefined)
      
      inline def setWebkitAnimationFillMode(value: String): Self = StObject.set(x, "webkitAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationFillModeUndefined: Self = StObject.set(x, "webkitAnimationFillMode", js.undefined)
      
      inline def setWebkitAnimationIterationCount(value: String): Self = StObject.set(x, "webkitAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationIterationCountUndefined: Self = StObject.set(x, "webkitAnimationIterationCount", js.undefined)
      
      inline def setWebkitAnimationName(value: String): Self = StObject.set(x, "webkitAnimationName", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationNameUndefined: Self = StObject.set(x, "webkitAnimationName", js.undefined)
      
      inline def setWebkitAnimationPlayState(value: String): Self = StObject.set(x, "webkitAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationPlayStateUndefined: Self = StObject.set(x, "webkitAnimationPlayState", js.undefined)
      
      inline def setWebkitAnimationTimingFunction(value: String): Self = StObject.set(x, "webkitAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitAnimationTimingFunctionUndefined: Self = StObject.set(x, "webkitAnimationTimingFunction", js.undefined)
      
      inline def setWebkitAnimationUndefined: Self = StObject.set(x, "webkitAnimation", js.undefined)
      
      inline def setWebkitAppearance(value: String): Self = StObject.set(x, "webkitAppearance", value.asInstanceOf[js.Any])
      
      inline def setWebkitAppearanceUndefined: Self = StObject.set(x, "webkitAppearance", js.undefined)
      
      inline def setWebkitBackfaceVisibility(value: String): Self = StObject.set(x, "webkitBackfaceVisibility", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackfaceVisibilityUndefined: Self = StObject.set(x, "webkitBackfaceVisibility", js.undefined)
      
      inline def setWebkitBackgroundClip(value: String): Self = StObject.set(x, "webkitBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundClipUndefined: Self = StObject.set(x, "webkitBackgroundClip", js.undefined)
      
      inline def setWebkitBackgroundOrigin(value: String): Self = StObject.set(x, "webkitBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundOriginUndefined: Self = StObject.set(x, "webkitBackgroundOrigin", js.undefined)
      
      inline def setWebkitBackgroundSize(value: String): Self = StObject.set(x, "webkitBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setWebkitBackgroundSizeUndefined: Self = StObject.set(x, "webkitBackgroundSize", js.undefined)
      
      inline def setWebkitBorderBottomLeftRadius(value: String): Self = StObject.set(x, "webkitBorderBottomLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomLeftRadius", js.undefined)
      
      inline def setWebkitBorderBottomRightRadius(value: String): Self = StObject.set(x, "webkitBorderBottomRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderBottomRightRadiusUndefined: Self = StObject.set(x, "webkitBorderBottomRightRadius", js.undefined)
      
      inline def setWebkitBorderImage(value: String): Self = StObject.set(x, "webkitBorderImage", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderImageUndefined: Self = StObject.set(x, "webkitBorderImage", js.undefined)
      
      inline def setWebkitBorderRadius(value: String): Self = StObject.set(x, "webkitBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderRadiusUndefined: Self = StObject.set(x, "webkitBorderRadius", js.undefined)
      
      inline def setWebkitBorderTopLeftRadius(value: String): Self = StObject.set(x, "webkitBorderTopLeftRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopLeftRadiusUndefined: Self = StObject.set(x, "webkitBorderTopLeftRadius", js.undefined)
      
      inline def setWebkitBorderTopRightRadius(value: String): Self = StObject.set(x, "webkitBorderTopRightRadius", value.asInstanceOf[js.Any])
      
      inline def setWebkitBorderTopRightRadiusUndefined: Self = StObject.set(x, "webkitBorderTopRightRadius", js.undefined)
      
      inline def setWebkitBoxAlign(value: String): Self = StObject.set(x, "webkitBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "webkitBoxAlign", js.undefined)
      
      inline def setWebkitBoxDirection(value: String): Self = StObject.set(x, "webkitBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "webkitBoxDirection", js.undefined)
      
      inline def setWebkitBoxFlex(value: String): Self = StObject.set(x, "webkitBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "webkitBoxFlex", js.undefined)
      
      inline def setWebkitBoxOrdinalGroup(value: String): Self = StObject.set(x, "webkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "webkitBoxOrdinalGroup", js.undefined)
      
      inline def setWebkitBoxOrient(value: String): Self = StObject.set(x, "webkitBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "webkitBoxOrient", js.undefined)
      
      inline def setWebkitBoxPack(value: String): Self = StObject.set(x, "webkitBoxPack", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "webkitBoxPack", js.undefined)
      
      inline def setWebkitBoxSizing(value: String): Self = StObject.set(x, "webkitBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxSizingUndefined: Self = StObject.set(x, "webkitBoxSizing", js.undefined)
      
      inline def setWebkitColumnBreakAfter(value: String): Self = StObject.set(x, "webkitColumnBreakAfter", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnBreakAfterUndefined: Self = StObject.set(x, "webkitColumnBreakAfter", js.undefined)
      
      inline def setWebkitColumnBreakBefore(value: String): Self = StObject.set(x, "webkitColumnBreakBefore", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnBreakBeforeUndefined: Self = StObject.set(x, "webkitColumnBreakBefore", js.undefined)
      
      inline def setWebkitColumnBreakInside(value: String): Self = StObject.set(x, "webkitColumnBreakInside", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnBreakInsideUndefined: Self = StObject.set(x, "webkitColumnBreakInside", js.undefined)
      
      inline def setWebkitColumnCount(value: String): Self = StObject.set(x, "webkitColumnCount", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnCountUndefined: Self = StObject.set(x, "webkitColumnCount", js.undefined)
      
      inline def setWebkitColumnGap(value: String): Self = StObject.set(x, "webkitColumnGap", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnGapUndefined: Self = StObject.set(x, "webkitColumnGap", js.undefined)
      
      inline def setWebkitColumnRule(value: String): Self = StObject.set(x, "webkitColumnRule", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColor(value: String): Self = StObject.set(x, "webkitColumnRuleColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleColorUndefined: Self = StObject.set(x, "webkitColumnRuleColor", js.undefined)
      
      inline def setWebkitColumnRuleStyle(value: String): Self = StObject.set(x, "webkitColumnRuleStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleStyleUndefined: Self = StObject.set(x, "webkitColumnRuleStyle", js.undefined)
      
      inline def setWebkitColumnRuleUndefined: Self = StObject.set(x, "webkitColumnRule", js.undefined)
      
      inline def setWebkitColumnRuleWidth(value: String): Self = StObject.set(x, "webkitColumnRuleWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnRuleWidthUndefined: Self = StObject.set(x, "webkitColumnRuleWidth", js.undefined)
      
      inline def setWebkitColumnSpan(value: String): Self = StObject.set(x, "webkitColumnSpan", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnSpanUndefined: Self = StObject.set(x, "webkitColumnSpan", js.undefined)
      
      inline def setWebkitColumnWidth(value: String): Self = StObject.set(x, "webkitColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnWidthUndefined: Self = StObject.set(x, "webkitColumnWidth", js.undefined)
      
      inline def setWebkitColumns(value: String): Self = StObject.set(x, "webkitColumns", value.asInstanceOf[js.Any])
      
      inline def setWebkitColumnsUndefined: Self = StObject.set(x, "webkitColumns", js.undefined)
      
      inline def setWebkitFilter(value: String): Self = StObject.set(x, "webkitFilter", value.asInstanceOf[js.Any])
      
      inline def setWebkitFilterUndefined: Self = StObject.set(x, "webkitFilter", js.undefined)
      
      inline def setWebkitFlex(value: String): Self = StObject.set(x, "webkitFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasis(value: String): Self = StObject.set(x, "webkitFlexBasis", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexBasisUndefined: Self = StObject.set(x, "webkitFlexBasis", js.undefined)
      
      inline def setWebkitFlexDirection(value: String): Self = StObject.set(x, "webkitFlexDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexDirectionUndefined: Self = StObject.set(x, "webkitFlexDirection", js.undefined)
      
      inline def setWebkitFlexFlow(value: String): Self = StObject.set(x, "webkitFlexFlow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexFlowUndefined: Self = StObject.set(x, "webkitFlexFlow", js.undefined)
      
      inline def setWebkitFlexGrow(value: String): Self = StObject.set(x, "webkitFlexGrow", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexGrowUndefined: Self = StObject.set(x, "webkitFlexGrow", js.undefined)
      
      inline def setWebkitFlexShrink(value: String): Self = StObject.set(x, "webkitFlexShrink", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexShrinkUndefined: Self = StObject.set(x, "webkitFlexShrink", js.undefined)
      
      inline def setWebkitFlexUndefined: Self = StObject.set(x, "webkitFlex", js.undefined)
      
      inline def setWebkitFlexWrap(value: String): Self = StObject.set(x, "webkitFlexWrap", value.asInstanceOf[js.Any])
      
      inline def setWebkitFlexWrapUndefined: Self = StObject.set(x, "webkitFlexWrap", js.undefined)
      
      inline def setWebkitJustifyContent(value: String): Self = StObject.set(x, "webkitJustifyContent", value.asInstanceOf[js.Any])
      
      inline def setWebkitJustifyContentUndefined: Self = StObject.set(x, "webkitJustifyContent", js.undefined)
      
      inline def setWebkitOrder(value: String): Self = StObject.set(x, "webkitOrder", value.asInstanceOf[js.Any])
      
      inline def setWebkitOrderUndefined: Self = StObject.set(x, "webkitOrder", js.undefined)
      
      inline def setWebkitPerspective(value: String): Self = StObject.set(x, "webkitPerspective", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOrigin(value: String): Self = StObject.set(x, "webkitPerspectiveOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitPerspectiveOriginUndefined: Self = StObject.set(x, "webkitPerspectiveOrigin", js.undefined)
      
      inline def setWebkitPerspectiveUndefined: Self = StObject.set(x, "webkitPerspective", js.undefined)
      
      inline def setWebkitTapHighlightColor(value: String): Self = StObject.set(x, "webkitTapHighlightColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTapHighlightColorUndefined: Self = StObject.set(x, "webkitTapHighlightColor", js.undefined)
      
      inline def setWebkitTextFillColor(value: String): Self = StObject.set(x, "webkitTextFillColor", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextFillColorUndefined: Self = StObject.set(x, "webkitTextFillColor", js.undefined)
      
      inline def setWebkitTextSizeAdjust(value: String): Self = StObject.set(x, "webkitTextSizeAdjust", value.asInstanceOf[js.Any])
      
      inline def setWebkitTextSizeAdjustUndefined: Self = StObject.set(x, "webkitTextSizeAdjust", js.undefined)
      
      inline def setWebkitTransform(value: String): Self = StObject.set(x, "webkitTransform", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOrigin(value: String): Self = StObject.set(x, "webkitTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformOriginUndefined: Self = StObject.set(x, "webkitTransformOrigin", js.undefined)
      
      inline def setWebkitTransformStyle(value: String): Self = StObject.set(x, "webkitTransformStyle", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransformStyleUndefined: Self = StObject.set(x, "webkitTransformStyle", js.undefined)
      
      inline def setWebkitTransformUndefined: Self = StObject.set(x, "webkitTransform", js.undefined)
      
      inline def setWebkitTransition(value: String): Self = StObject.set(x, "webkitTransition", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelay(value: String): Self = StObject.set(x, "webkitTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDelayUndefined: Self = StObject.set(x, "webkitTransitionDelay", js.undefined)
      
      inline def setWebkitTransitionDuration(value: String): Self = StObject.set(x, "webkitTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionDurationUndefined: Self = StObject.set(x, "webkitTransitionDuration", js.undefined)
      
      inline def setWebkitTransitionProperty(value: String): Self = StObject.set(x, "webkitTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionPropertyUndefined: Self = StObject.set(x, "webkitTransitionProperty", js.undefined)
      
      inline def setWebkitTransitionTimingFunction(value: String): Self = StObject.set(x, "webkitTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setWebkitTransitionTimingFunctionUndefined: Self = StObject.set(x, "webkitTransitionTimingFunction", js.undefined)
      
      inline def setWebkitTransitionUndefined: Self = StObject.set(x, "webkitTransition", js.undefined)
      
      inline def setWebkitUserModify(value: String): Self = StObject.set(x, "webkitUserModify", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserModifyUndefined: Self = StObject.set(x, "webkitUserModify", js.undefined)
      
      inline def setWebkitUserSelect(value: String): Self = StObject.set(x, "webkitUserSelect", value.asInstanceOf[js.Any])
      
      inline def setWebkitUserSelectUndefined: Self = StObject.set(x, "webkitUserSelect", js.undefined)
      
      inline def setWebkitWritingMode(value: String): Self = StObject.set(x, "webkitWritingMode", value.asInstanceOf[js.Any])
      
      inline def setWebkitWritingModeUndefined: Self = StObject.set(x, "webkitWritingMode", js.undefined)
      
      inline def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
      
      inline def setWidows(value: String): Self = StObject.set(x, "widows", value.asInstanceOf[js.Any])
      
      inline def setWidowsUndefined: Self = StObject.set(x, "widows", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordBreak(value: String): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
      
      inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
      
      inline def setWordSpacing(value: String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
      
      inline def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
      
      inline def setWordWrap(value: String): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      inline def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
      
      inline def setWritingMode(value: String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
      
      inline def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
      
      inline def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZoom(value: String): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  trait ElementSpecialAttrs extends StObject {
    
    /**
      * The JS-safe name for the HTML `class` attribute.
      */
    val className: js.UndefOr[String] = js.undefined
    
    /**
      * The dataset for the rendered DOM element.
      */
    val dataset: js.UndefOr[ElementDataset] = js.undefined
    
    /**
      * The JS-safe name for the HTML `for` attribute.
      */
    val htmlFor: js.UndefOr[String] = js.undefined
    
    /**
      * The key id for the virtual element node.
      *
      * If a node is given a key id, the generated DOM node will not be
      * recreated during a rendering update if it only moves among its
      * siblings in the render tree.
      *
      * In general, reordering child nodes will cause the nodes to be
      * completely re-rendered. Keys allow this to be optimized away.
      *
      * If a key is provided, it must be unique among sibling nodes.
      */
    val key: js.UndefOr[String] = js.undefined
    
    /**
      * The inline style for the rendered DOM element.
      */
    val style: js.UndefOr[ElementInlineStyle] = js.undefined
  }
  object ElementSpecialAttrs {
    
    inline def apply(): ElementSpecialAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSpecialAttrs]
    }
    
    extension [Self <: ElementSpecialAttrs](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataset(value: ElementDataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
      
      inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
      
      inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setStyle(value: ElementInlineStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.luminoVirtualdom.mod.VirtualElement
    - typingsJapgolly.luminoVirtualdom.mod.VirtualText
  */
  trait VirtualNode extends StObject
}
