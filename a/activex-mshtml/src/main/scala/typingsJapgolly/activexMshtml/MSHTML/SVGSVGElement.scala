package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGSVGElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGSVGElement_typekey")
  var MSHTMLDotSVGSVGElement_typekey: SVGSVGElement
  
  def animationsPaused(): Boolean
  
  def checkEnclosure(element: ISVGElement, rect: SVGRect): Boolean
  
  def checkIntersection(element: ISVGElement, rect: SVGRect): Boolean
  
  val className: SVGAnimatedString
  
  var contentScriptType: String
  
  var contentStyleType: String
  
  def createSVGAngle(): SVGAngle
  
  def createSVGLength(): SVGLength
  
  def createSVGMatrix(): SVGMatrix
  
  def createSVGNumber(): SVGNumber
  
  def createSVGPoint(): SVGPoint
  
  def createSVGRect(): SVGRect
  
  def createSVGTransform(): SVGTransform
  
  def createSVGTransformFromMatrix(matrix: SVGMatrix): SVGTransform
  
  var currentScale: Double
  
  var currentTranslate: SVGPoint
  
  var currentView: ISVGViewSpec
  
  def deselectAll(): Unit
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def forceRedraw(): Unit
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getCurrentTime(): Double
  
  def getElementById(elementId: String): IHTMLElement
  
  def getEnclosureList(rect: SVGRect, referenceElement: ISVGElement): Any
  
  def getIntersectionList(rect: SVGRect, referenceElement: ISVGElement): Any
  
  def getScreenCTM(): SVGMatrix
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  var height: SVGAnimatedLength
  
  val nearestViewportElement: ISVGElement
  
  var ownerSVGElement: ISVGSVGElement
  
  def pauseAnimations(): Unit
  
  var pixelUnitToMillimeterX: Double
  
  var pixelUnitToMillimeterY: Double
  
  var preserveAspectRatio: SVGAnimatedPreserveAspectRatio
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  var screenPixelToMillimeterX: Double
  
  var screenPixelToMillimeterY: Double
  
  def setCurrentTime(seconds: Double): Unit
  
  def suspendRedraw(maxWaitMilliseconds: Double): Double
  
  val systemLanguage: SVGStringList
  
  def unpauseAnimations(): Unit
  
  def unsuspendRedraw(suspendHandeID: Double): Unit
  
  def unsuspendRedrawAll(): Unit
  
  var useCurrentView: Boolean
  
  val viewBox: SVGAnimatedRect
  
  var viewport: SVGRect
  
  var viewportElement: ISVGElement
  
  var width: SVGAnimatedLength
  
  var x: SVGAnimatedLength
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
  
  var y: SVGAnimatedLength
  
  val zoomAndPan: Double
}
object SVGSVGElement {
  
  inline def apply(
    MSHTMLDotSVGSVGElement_typekey: SVGSVGElement,
    animationsPaused: CallbackTo[Boolean],
    checkEnclosure: (ISVGElement, SVGRect) => Boolean,
    checkIntersection: (ISVGElement, SVGRect) => Boolean,
    className: SVGAnimatedString,
    contentScriptType: String,
    contentStyleType: String,
    createSVGAngle: CallbackTo[SVGAngle],
    createSVGLength: CallbackTo[SVGLength],
    createSVGMatrix: CallbackTo[SVGMatrix],
    createSVGNumber: CallbackTo[SVGNumber],
    createSVGPoint: CallbackTo[SVGPoint],
    createSVGRect: CallbackTo[SVGRect],
    createSVGTransform: CallbackTo[SVGTransform],
    createSVGTransformFromMatrix: SVGMatrix => SVGTransform,
    currentScale: Double,
    currentTranslate: SVGPoint,
    currentView: ISVGViewSpec,
    deselectAll: Callback,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    forceRedraw: Callback,
    getBBox: CallbackTo[SVGRect],
    getCTM: CallbackTo[SVGMatrix],
    getCurrentTime: CallbackTo[Double],
    getElementById: String => IHTMLElement,
    getEnclosureList: (SVGRect, ISVGElement) => Any,
    getIntersectionList: (SVGRect, ISVGElement) => Any,
    getScreenCTM: CallbackTo[SVGMatrix],
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    height: SVGAnimatedLength,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    pauseAnimations: Callback,
    pixelUnitToMillimeterX: Double,
    pixelUnitToMillimeterY: Double,
    preserveAspectRatio: SVGAnimatedPreserveAspectRatio,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    screenPixelToMillimeterX: Double,
    screenPixelToMillimeterY: Double,
    setCurrentTime: Double => Callback,
    suspendRedraw: Double => Double,
    systemLanguage: SVGStringList,
    unpauseAnimations: Callback,
    unsuspendRedraw: Double => Callback,
    unsuspendRedrawAll: Callback,
    useCurrentView: Boolean,
    viewBox: SVGAnimatedRect,
    viewport: SVGRect,
    viewportElement: ISVGElement,
    width: SVGAnimatedLength,
    x: SVGAnimatedLength,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLength,
    zoomAndPan: Double
  ): SVGSVGElement = {
    val __obj = js.Dynamic.literal(animationsPaused = animationsPaused.toJsFn, checkEnclosure = js.Any.fromFunction2(checkEnclosure), checkIntersection = js.Any.fromFunction2(checkIntersection), className = className.asInstanceOf[js.Any], contentScriptType = contentScriptType.asInstanceOf[js.Any], contentStyleType = contentStyleType.asInstanceOf[js.Any], createSVGAngle = createSVGAngle.toJsFn, createSVGLength = createSVGLength.toJsFn, createSVGMatrix = createSVGMatrix.toJsFn, createSVGNumber = createSVGNumber.toJsFn, createSVGPoint = createSVGPoint.toJsFn, createSVGRect = createSVGRect.toJsFn, createSVGTransform = createSVGTransform.toJsFn, createSVGTransformFromMatrix = js.Any.fromFunction1(createSVGTransformFromMatrix), currentScale = currentScale.asInstanceOf[js.Any], currentTranslate = currentTranslate.asInstanceOf[js.Any], currentView = currentView.asInstanceOf[js.Any], deselectAll = deselectAll.toJsFn, externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], forceRedraw = forceRedraw.toJsFn, getBBox = getBBox.toJsFn, getCTM = getCTM.toJsFn, getCurrentTime = getCurrentTime.toJsFn, getElementById = js.Any.fromFunction1(getElementById), getEnclosureList = js.Any.fromFunction2(getEnclosureList), getIntersectionList = js.Any.fromFunction2(getIntersectionList), getScreenCTM = getScreenCTM.toJsFn, getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), height = height.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], pauseAnimations = pauseAnimations.toJsFn, pixelUnitToMillimeterX = pixelUnitToMillimeterX.asInstanceOf[js.Any], pixelUnitToMillimeterY = pixelUnitToMillimeterY.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], screenPixelToMillimeterX = screenPixelToMillimeterX.asInstanceOf[js.Any], screenPixelToMillimeterY = screenPixelToMillimeterY.asInstanceOf[js.Any], setCurrentTime = js.Any.fromFunction1((t0: Double) => setCurrentTime(t0).runNow()), suspendRedraw = js.Any.fromFunction1(suspendRedraw), systemLanguage = systemLanguage.asInstanceOf[js.Any], unpauseAnimations = unpauseAnimations.toJsFn, unsuspendRedraw = js.Any.fromFunction1((t0: Double) => unsuspendRedraw(t0).runNow()), unsuspendRedrawAll = unsuspendRedrawAll.toJsFn, useCurrentView = useCurrentView.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoomAndPan = zoomAndPan.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGSVGElement_typekey")(MSHTMLDotSVGSVGElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGSVGElement]
  }
  
  extension [Self <: SVGSVGElement](x: Self) {
    
    inline def setAnimationsPaused(value: CallbackTo[Boolean]): Self = StObject.set(x, "animationsPaused", value.toJsFn)
    
    inline def setCheckEnclosure(value: (ISVGElement, SVGRect) => Boolean): Self = StObject.set(x, "checkEnclosure", js.Any.fromFunction2(value))
    
    inline def setCheckIntersection(value: (ISVGElement, SVGRect) => Boolean): Self = StObject.set(x, "checkIntersection", js.Any.fromFunction2(value))
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setContentScriptType(value: String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
    
    inline def setContentStyleType(value: String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
    
    inline def setCreateSVGAngle(value: CallbackTo[SVGAngle]): Self = StObject.set(x, "createSVGAngle", value.toJsFn)
    
    inline def setCreateSVGLength(value: CallbackTo[SVGLength]): Self = StObject.set(x, "createSVGLength", value.toJsFn)
    
    inline def setCreateSVGMatrix(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "createSVGMatrix", value.toJsFn)
    
    inline def setCreateSVGNumber(value: CallbackTo[SVGNumber]): Self = StObject.set(x, "createSVGNumber", value.toJsFn)
    
    inline def setCreateSVGPoint(value: CallbackTo[SVGPoint]): Self = StObject.set(x, "createSVGPoint", value.toJsFn)
    
    inline def setCreateSVGRect(value: CallbackTo[SVGRect]): Self = StObject.set(x, "createSVGRect", value.toJsFn)
    
    inline def setCreateSVGTransform(value: CallbackTo[SVGTransform]): Self = StObject.set(x, "createSVGTransform", value.toJsFn)
    
    inline def setCreateSVGTransformFromMatrix(value: SVGMatrix => SVGTransform): Self = StObject.set(x, "createSVGTransformFromMatrix", js.Any.fromFunction1(value))
    
    inline def setCurrentScale(value: Double): Self = StObject.set(x, "currentScale", value.asInstanceOf[js.Any])
    
    inline def setCurrentTranslate(value: SVGPoint): Self = StObject.set(x, "currentTranslate", value.asInstanceOf[js.Any])
    
    inline def setCurrentView(value: ISVGViewSpec): Self = StObject.set(x, "currentView", value.asInstanceOf[js.Any])
    
    inline def setDeselectAll(value: Callback): Self = StObject.set(x, "deselectAll", value.toJsFn)
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setForceRedraw(value: Callback): Self = StObject.set(x, "forceRedraw", value.toJsFn)
    
    inline def setGetBBox(value: CallbackTo[SVGRect]): Self = StObject.set(x, "getBBox", value.toJsFn)
    
    inline def setGetCTM(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "getCTM", value.toJsFn)
    
    inline def setGetCurrentTime(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentTime", value.toJsFn)
    
    inline def setGetElementById(value: String => IHTMLElement): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    inline def setGetEnclosureList(value: (SVGRect, ISVGElement) => Any): Self = StObject.set(x, "getEnclosureList", js.Any.fromFunction2(value))
    
    inline def setGetIntersectionList(value: (SVGRect, ISVGElement) => Any): Self = StObject.set(x, "getIntersectionList", js.Any.fromFunction2(value))
    
    inline def setGetScreenCTM(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "getScreenCTM", value.toJsFn)
    
    inline def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setHeight(value: SVGAnimatedLength): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGSVGElement_typekey(value: SVGSVGElement): Self = StObject.set(x, "MSHTML.SVGSVGElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setPauseAnimations(value: Callback): Self = StObject.set(x, "pauseAnimations", value.toJsFn)
    
    inline def setPixelUnitToMillimeterX(value: Double): Self = StObject.set(x, "pixelUnitToMillimeterX", value.asInstanceOf[js.Any])
    
    inline def setPixelUnitToMillimeterY(value: Double): Self = StObject.set(x, "pixelUnitToMillimeterY", value.asInstanceOf[js.Any])
    
    inline def setPreserveAspectRatio(value: SVGAnimatedPreserveAspectRatio): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setScreenPixelToMillimeterX(value: Double): Self = StObject.set(x, "screenPixelToMillimeterX", value.asInstanceOf[js.Any])
    
    inline def setScreenPixelToMillimeterY(value: Double): Self = StObject.set(x, "screenPixelToMillimeterY", value.asInstanceOf[js.Any])
    
    inline def setSetCurrentTime(value: Double => Callback): Self = StObject.set(x, "setCurrentTime", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSuspendRedraw(value: Double => Double): Self = StObject.set(x, "suspendRedraw", js.Any.fromFunction1(value))
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setUnpauseAnimations(value: Callback): Self = StObject.set(x, "unpauseAnimations", value.toJsFn)
    
    inline def setUnsuspendRedraw(value: Double => Callback): Self = StObject.set(x, "unsuspendRedraw", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUnsuspendRedrawAll(value: Callback): Self = StObject.set(x, "unsuspendRedrawAll", value.toJsFn)
    
    inline def setUseCurrentView(value: Boolean): Self = StObject.set(x, "useCurrentView", value.asInstanceOf[js.Any])
    
    inline def setViewBox(value: SVGAnimatedRect): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: SVGRect): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: SVGAnimatedLength): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: SVGAnimatedLength): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    inline def setY(value: SVGAnimatedLength): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoomAndPan(value: Double): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
  }
}
