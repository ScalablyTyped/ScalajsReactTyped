package typingsJapgolly.typesettable

import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.std.SVGGraphicsElement
import typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.abstractMeasurerMod.IRulerFactory
import typingsJapgolly.typesettable.canvasMod.ICanvasFontStyle
import typingsJapgolly.typesettable.writerMod.IPen
import typingsJapgolly.typesettable.writerMod.IPenFactory
import typingsJapgolly.typesettable.writerMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts", JSImport.Namespace)
@js.native
object contextsMod extends js.Object {
  @js.native
  class CanvasContext protected ()
    extends typingsJapgolly.typesettable.canvasMod.CanvasContext {
    def this(ctx: CanvasRenderingContext2D) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double) = this()
    def this(ctx: CanvasRenderingContext2D, lineHeight: Double, style: ICanvasFontStyle) = this()
  }
  
  @js.native
  class HtmlContext protected ()
    extends typingsJapgolly.typesettable.htmlMod.HtmlContext {
    /**
      * @param element - The CSS font styles applied to `element` will determine the
      * size of text measurements. Also the default text block container.
      * @param className - added to new text blocks
      * @param addTitle - enable title attribute to be added to new text blocks.
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, className: String) = this()
    def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
  }
  
  @js.native
  class HtmlUtils ()
    extends typingsJapgolly.typesettable.htmlMod.HtmlUtils
  
  @js.native
  trait IPenFactoryContext[T] extends js.Object {
    @JSName("createPen")
    var createPen_Original: IPenFactory[T] = js.native
    def createPen(text: String, transform: ITransform): IPen = js.native
    def createPen(text: String, transform: ITransform, container: T): IPen = js.native
  }
  
  @js.native
  trait IRulerFactoryContext extends js.Object {
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
    def createRuler(): IRuler = js.native
  }
  
  @js.native
  trait ITypesetterContext[T]
    extends IPenFactoryContext[T]
       with IRulerFactoryContext
  
  @js.native
  class SvgContext protected ()
    extends typingsJapgolly.typesettable.svgMod.SvgContext {
    def this(element: SVGElement) = this()
    def this(element: SVGElement, className: String) = this()
    def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
  }
  
  @js.native
  class SvgUtils ()
    extends typingsJapgolly.typesettable.svgMod.SvgUtils
  
  /* static members */
  @js.native
  object HtmlUtils extends js.Object {
    /**
      * Adds the variadic classnames to the Element
      */
    def addClasses(element: Element, classNames: String*): Unit = js.native
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    def append(element: Element, tagName: String, classNames: String*): HTMLElement = js.native
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    def create(tagName: String, classNames: String*): HTMLElement = js.native
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    def getDimensions(element: HTMLElement): IDimensions = js.native
  }
  
  /* static members */
  @js.native
  object SvgContext extends js.Object {
    var AnchorMap: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object SvgUtils extends js.Object {
    var SVG_NS: String = js.native
    /**
      * Appends an SVG element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Creates and returns a new SVGElement with the attached classnames.
      */
    def create(tagName: String, classNames: String*): SVGElement = js.native
    /**
      * Returns the width/height of svg element's bounding box
      */
    def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
  }
  
}

