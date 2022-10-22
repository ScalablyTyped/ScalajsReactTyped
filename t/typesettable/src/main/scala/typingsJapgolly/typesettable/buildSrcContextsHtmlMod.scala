package typingsJapgolly.typesettable

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.typesettable.anon.Write
import typingsJapgolly.typesettable.buildSrcContextsMod.ITypesetterContext
import typingsJapgolly.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRulerFactory
import typingsJapgolly.typesettable.buildSrcWritersWriterMod.IPen
import typingsJapgolly.typesettable.buildSrcWritersWriterMod.IPenFactory
import typingsJapgolly.typesettable.buildSrcWritersWriterMod.ITransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcContextsHtmlMod {
  
  @JSImport("typesettable/build/src/contexts/html", "HtmlContext")
  @js.native
  open class HtmlContext protected ()
    extends StObject
       with ITypesetterContext[HTMLElement] {
    /**
      * @param element - The CSS font styles applied to `element` will determine the
      * size of text measurements. Also the default text block container.
      * @param className - added to new text blocks
      * @param addTitle - enable title attribute to be added to new text blocks.
      */
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, className: String) = this()
    def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
    def this(element: HTMLElement, className: Unit, addTitle: Boolean) = this()
    
    /* private */ var addTitle: Any = js.native
    
    /* private */ var className: Any = js.native
    
    /* private */ def createHtmlLinePen(textBlock: Any): Any = js.native
    
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform): IPen = js.native
    /* CompleteClass */
    override def createPen(text: String, transform: ITransform, container: HTMLElement): IPen = js.native
    def createPen(text: String, transform: ITransform, element: Element): Write = js.native
    /* CompleteClass */
    @JSName("createPen")
    var createPen_Original: IPenFactory[HTMLElement] = js.native
    
    /* CompleteClass */
    override def createRuler(): IRuler = js.native
    /* CompleteClass */
    @JSName("createRuler")
    var createRuler_Original: IRulerFactory = js.native
    
    /* private */ var element: Any = js.native
    
    def setAddTitle(addTitle: Boolean): Unit = js.native
  }
  
  @JSImport("typesettable/build/src/contexts/html", "HtmlUtils")
  @js.native
  open class HtmlUtils () extends StObject
  /* static members */
  object HtmlUtils {
    
    @JSImport("typesettable/build/src/contexts/html", "HtmlUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Adds the variadic classnames to the Element
      */
    inline def addClasses(element: Element, classNames: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClasses")(scala.List(element.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Appends an HTML element with the specified tag name to the provided element.
      * The variadic classnames are added to the new element.
      *
      * Returns the new element.
      */
    inline def append(element: Element, tagName: String, classNames: String*): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("append")((scala.List(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).`++`(classNames.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[HTMLElement]
    
    /**
      * Creates and returns a new HTMLElement with the attached classnames.
      */
    inline def create(tagName: String, classNames: String*): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(scala.List(tagName.asInstanceOf[js.Any]).`++`(classNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HTMLElement]
    
    /**
      * Returns the width/height of HTMLElement's bounding box
      */
    inline def getDimensions(element: HTMLElement): IDimensions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimensions")(element.asInstanceOf[js.Any]).asInstanceOf[IDimensions]
  }
}
