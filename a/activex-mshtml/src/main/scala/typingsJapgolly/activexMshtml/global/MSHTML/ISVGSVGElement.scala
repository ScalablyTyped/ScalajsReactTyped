package typingsJapgolly.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.ISVGSVGElement")
@js.native
/* private */ open class ISVGSVGElement ()
  extends StObject
     with typingsJapgolly.activexMshtml.MSHTML.ISVGSVGElement {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.ISVGSVGElement_typekey")
  var MSHTMLDotISVGSVGElement_typekey: typingsJapgolly.activexMshtml.MSHTML.ISVGSVGElement = js.native
  
  /* CompleteClass */
  override def animationsPaused(): Boolean = js.native
  
  /* CompleteClass */
  override def checkEnclosure(
    element: typingsJapgolly.activexMshtml.MSHTML.ISVGElement,
    rect: typingsJapgolly.activexMshtml.MSHTML.SVGRect
  ): Boolean = js.native
  
  /* CompleteClass */
  override def checkIntersection(
    element: typingsJapgolly.activexMshtml.MSHTML.ISVGElement,
    rect: typingsJapgolly.activexMshtml.MSHTML.SVGRect
  ): Boolean = js.native
  
  /* CompleteClass */
  var contentScriptType: String = js.native
  
  /* CompleteClass */
  var contentStyleType: String = js.native
  
  /* CompleteClass */
  override def createSVGAngle(): typingsJapgolly.activexMshtml.MSHTML.SVGAngle = js.native
  
  /* CompleteClass */
  override def createSVGLength(): typingsJapgolly.activexMshtml.MSHTML.SVGLength = js.native
  
  /* CompleteClass */
  override def createSVGMatrix(): typingsJapgolly.activexMshtml.MSHTML.SVGMatrix = js.native
  
  /* CompleteClass */
  override def createSVGNumber(): typingsJapgolly.activexMshtml.MSHTML.SVGNumber = js.native
  
  /* CompleteClass */
  override def createSVGPoint(): typingsJapgolly.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  override def createSVGRect(): typingsJapgolly.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  override def createSVGTransform(): typingsJapgolly.activexMshtml.MSHTML.SVGTransform = js.native
  
  /* CompleteClass */
  override def createSVGTransformFromMatrix(matrix: typingsJapgolly.activexMshtml.MSHTML.SVGMatrix): typingsJapgolly.activexMshtml.MSHTML.SVGTransform = js.native
  
  /* CompleteClass */
  var currentScale: Double = js.native
  
  /* CompleteClass */
  var currentTranslate: typingsJapgolly.activexMshtml.MSHTML.SVGPoint = js.native
  
  /* CompleteClass */
  var currentView: typingsJapgolly.activexMshtml.MSHTML.ISVGViewSpec = js.native
  
  /* CompleteClass */
  override def deselectAll(): Unit = js.native
  
  /* CompleteClass */
  override def forceRedraw(): Unit = js.native
  
  /* CompleteClass */
  override def getCurrentTime(): Double = js.native
  
  /* CompleteClass */
  override def getElementById(elementId: String): typingsJapgolly.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def getEnclosureList(
    rect: typingsJapgolly.activexMshtml.MSHTML.SVGRect,
    referenceElement: typingsJapgolly.activexMshtml.MSHTML.ISVGElement
  ): Any = js.native
  
  /* CompleteClass */
  override def getIntersectionList(
    rect: typingsJapgolly.activexMshtml.MSHTML.SVGRect,
    referenceElement: typingsJapgolly.activexMshtml.MSHTML.ISVGElement
  ): Any = js.native
  
  /* CompleteClass */
  var height: typingsJapgolly.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  override def pauseAnimations(): Unit = js.native
  
  /* CompleteClass */
  var pixelUnitToMillimeterX: Double = js.native
  
  /* CompleteClass */
  var pixelUnitToMillimeterY: Double = js.native
  
  /* CompleteClass */
  var screenPixelToMillimeterX: Double = js.native
  
  /* CompleteClass */
  var screenPixelToMillimeterY: Double = js.native
  
  /* CompleteClass */
  override def setCurrentTime(seconds: Double): Unit = js.native
  
  /* CompleteClass */
  override def suspendRedraw(maxWaitMilliseconds: Double): Double = js.native
  
  /* CompleteClass */
  override def unpauseAnimations(): Unit = js.native
  
  /* CompleteClass */
  override def unsuspendRedraw(suspendHandeID: Double): Unit = js.native
  
  /* CompleteClass */
  override def unsuspendRedrawAll(): Unit = js.native
  
  /* CompleteClass */
  var useCurrentView: Boolean = js.native
  
  /* CompleteClass */
  var viewport: typingsJapgolly.activexMshtml.MSHTML.SVGRect = js.native
  
  /* CompleteClass */
  var width: typingsJapgolly.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  var x: typingsJapgolly.activexMshtml.MSHTML.SVGAnimatedLength = js.native
  
  /* CompleteClass */
  var y: typingsJapgolly.activexMshtml.MSHTML.SVGAnimatedLength = js.native
}
