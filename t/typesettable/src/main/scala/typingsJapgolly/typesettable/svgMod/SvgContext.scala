package typingsJapgolly.typesettable.svgMod

import org.scalajs.dom.raw.Element
import typingsJapgolly.std.SVGElement
import typingsJapgolly.typesettable.AnonWrite
import typingsJapgolly.typesettable.contextsMod.IPenFactoryContext
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import typingsJapgolly.typesettable.writerMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
class SvgContext protected ()
  extends IPenFactoryContext[SVGElement]
     with IRulerFactoryContext {
  def this(element: org.scalajs.dom.raw.SVGElement) = this()
  def this(element: org.scalajs.dom.raw.SVGElement, className: String) = this()
  def this(element: org.scalajs.dom.raw.SVGElement, className: String, addTitleElement: Boolean) = this()
  var addTitleElement: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  def createPen(text: String, transform: ITransform, element: Element): AnonWrite = js.native
  /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
  /* private */ def getTextElements(element: js.Any): js.Any = js.native
  def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
}

/* static members */
@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
object SvgContext extends js.Object {
  var AnchorMap: js.Any = js.native
}

