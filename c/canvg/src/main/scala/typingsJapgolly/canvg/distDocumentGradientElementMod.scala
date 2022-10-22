package typingsJapgolly.canvg

import org.scalajs.dom.CanvasGradient
import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distDocumentPathElementMod.PathElement
import typingsJapgolly.canvg.distDocumentStopElementMod.StopElement
import typingsJapgolly.canvg.distPropertyMod.Property
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentGradientElementMod {
  
  /* note: abstract class */ @JSImport("canvg/dist/Document/GradientElement", "GradientElement")
  @js.native
  open class GradientElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    /* protected */ def addParentOpacity(parentOpacityProp: Property[Any], color: String): String = js.native
    
    val attributesToInherit: js.Array[String] = js.native
    
    def createGradient(ctx: RenderingContext2D, element: PathElement, parentOpacityProp: Property[Any]): String | CanvasGradient | CanvasPattern = js.native
    
    def getGradient(ctx: RenderingContext2D, element: PathElement): CanvasGradient | Null = js.native
    
    def getGradientUnits(): String = js.native
    
    /* protected */ def inheritStopContainer(stopsContainer: Element): Unit = js.native
    
    /* protected */ val stops: js.Array[StopElement] = js.native
  }
}
