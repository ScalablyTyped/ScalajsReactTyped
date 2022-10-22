package typingsJapgolly.activexMshtml.MSHTML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTextElement extends StObject {
  
  /* private */ @JSName("MSHTML.SVGTextElement_typekey")
  var MSHTMLDotSVGTextElement_typekey: SVGTextElement
  
  val className: SVGAnimatedString
  
  var dx: SVGAnimatedLengthList
  
  var dy: SVGAnimatedLengthList
  
  val externalResourcesRequired: SVGAnimatedBoolean
  
  val farthestViewportElement: ISVGElement
  
  var focusable: SVGAnimatedEnumeration
  
  def getBBox(): SVGRect
  
  def getCTM(): SVGMatrix
  
  def getCharNumAtPosition(point: SVGPoint): Double
  
  def getComputedTextLength(): Double
  
  def getEndPositionOfChar(charnum: Double): SVGPoint
  
  def getExtentOfChar(charnum: Double): SVGRect
  
  def getNumberOfChars(): Double
  
  def getRotationOfChar(charnum: Double): Double
  
  def getScreenCTM(): SVGMatrix
  
  def getStartPositionOfChar(charnum: Double): SVGPoint
  
  def getSubStringLength(charnum: Double, nchars: Double): Double
  
  def getTransformToElement(pElement: ISVGElement): SVGMatrix
  
  def hasExtension(`extension`: String): Boolean
  
  var lengthAdjust: SVGAnimatedEnumeration
  
  val nearestViewportElement: ISVGElement
  
  var ownerSVGElement: ISVGSVGElement
  
  val requiredExtensions: SVGStringList
  
  val requiredFeatures: SVGStringList
  
  var rotate: SVGAnimatedNumberList
  
  def selectSubString(charnum: Double, nchars: Double): Unit
  
  val systemLanguage: SVGStringList
  
  var textLength: SVGAnimatedLength
  
  val transform: SVGAnimatedTransformList
  
  var viewportElement: ISVGElement
  
  var x: SVGAnimatedLengthList
  
  var xmlbase: String
  
  var xmllang: String
  
  var xmlspace: String
  
  var y: SVGAnimatedLengthList
}
object SVGTextElement {
  
  inline def apply(
    MSHTMLDotSVGTextElement_typekey: SVGTextElement,
    className: SVGAnimatedString,
    dx: SVGAnimatedLengthList,
    dy: SVGAnimatedLengthList,
    externalResourcesRequired: SVGAnimatedBoolean,
    farthestViewportElement: ISVGElement,
    focusable: SVGAnimatedEnumeration,
    getBBox: CallbackTo[SVGRect],
    getCTM: CallbackTo[SVGMatrix],
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: CallbackTo[Double],
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: CallbackTo[Double],
    getRotationOfChar: Double => Double,
    getScreenCTM: CallbackTo[SVGMatrix],
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    getTransformToElement: ISVGElement => SVGMatrix,
    hasExtension: String => Boolean,
    lengthAdjust: SVGAnimatedEnumeration,
    nearestViewportElement: ISVGElement,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    rotate: SVGAnimatedNumberList,
    selectSubString: (Double, Double) => Callback,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    transform: SVGAnimatedTransformList,
    viewportElement: ISVGElement,
    x: SVGAnimatedLengthList,
    xmlbase: String,
    xmllang: String,
    xmlspace: String,
    y: SVGAnimatedLengthList
  ): SVGTextElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], farthestViewportElement = farthestViewportElement.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getBBox = getBBox.toJsFn, getCTM = getCTM.toJsFn, getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = getComputedTextLength.toJsFn, getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = getNumberOfChars.toJsFn, getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getScreenCTM = getScreenCTM.toJsFn, getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), getTransformToElement = js.Any.fromFunction1(getTransformToElement), hasExtension = js.Any.fromFunction1(hasExtension), lengthAdjust = lengthAdjust.asInstanceOf[js.Any], nearestViewportElement = nearestViewportElement.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2((t0: Double, t1: Double) => (selectSubString(t0, t1)).runNow()), systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextElement_typekey")(MSHTMLDotSVGTextElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextElement]
  }
  
  extension [Self <: SVGTextElement](x: Self) {
    
    inline def setClassName(value: SVGAnimatedString): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDx(value: SVGAnimatedLengthList): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDy(value: SVGAnimatedLengthList): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setExternalResourcesRequired(value: SVGAnimatedBoolean): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    inline def setFarthestViewportElement(value: ISVGElement): Self = StObject.set(x, "farthestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setFocusable(value: SVGAnimatedEnumeration): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setGetBBox(value: CallbackTo[SVGRect]): Self = StObject.set(x, "getBBox", value.toJsFn)
    
    inline def setGetCTM(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "getCTM", value.toJsFn)
    
    inline def setGetCharNumAtPosition(value: SVGPoint => Double): Self = StObject.set(x, "getCharNumAtPosition", js.Any.fromFunction1(value))
    
    inline def setGetComputedTextLength(value: CallbackTo[Double]): Self = StObject.set(x, "getComputedTextLength", value.toJsFn)
    
    inline def setGetEndPositionOfChar(value: Double => SVGPoint): Self = StObject.set(x, "getEndPositionOfChar", js.Any.fromFunction1(value))
    
    inline def setGetExtentOfChar(value: Double => SVGRect): Self = StObject.set(x, "getExtentOfChar", js.Any.fromFunction1(value))
    
    inline def setGetNumberOfChars(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfChars", value.toJsFn)
    
    inline def setGetRotationOfChar(value: Double => Double): Self = StObject.set(x, "getRotationOfChar", js.Any.fromFunction1(value))
    
    inline def setGetScreenCTM(value: CallbackTo[SVGMatrix]): Self = StObject.set(x, "getScreenCTM", value.toJsFn)
    
    inline def setGetStartPositionOfChar(value: Double => SVGPoint): Self = StObject.set(x, "getStartPositionOfChar", js.Any.fromFunction1(value))
    
    inline def setGetSubStringLength(value: (Double, Double) => Double): Self = StObject.set(x, "getSubStringLength", js.Any.fromFunction2(value))
    
    inline def setGetTransformToElement(value: ISVGElement => SVGMatrix): Self = StObject.set(x, "getTransformToElement", js.Any.fromFunction1(value))
    
    inline def setHasExtension(value: String => Boolean): Self = StObject.set(x, "hasExtension", js.Any.fromFunction1(value))
    
    inline def setLengthAdjust(value: SVGAnimatedEnumeration): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotSVGTextElement_typekey(value: SVGTextElement): Self = StObject.set(x, "MSHTML.SVGTextElement_typekey", value.asInstanceOf[js.Any])
    
    inline def setNearestViewportElement(value: ISVGElement): Self = StObject.set(x, "nearestViewportElement", value.asInstanceOf[js.Any])
    
    inline def setOwnerSVGElement(value: ISVGSVGElement): Self = StObject.set(x, "ownerSVGElement", value.asInstanceOf[js.Any])
    
    inline def setRequiredExtensions(value: SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeatures(value: SVGStringList): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: SVGAnimatedNumberList): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setSelectSubString(value: (Double, Double) => Callback): Self = StObject.set(x, "selectSubString", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSystemLanguage(value: SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    inline def setTextLength(value: SVGAnimatedLength): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: SVGAnimatedTransformList): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setViewportElement(value: ISVGElement): Self = StObject.set(x, "viewportElement", value.asInstanceOf[js.Any])
    
    inline def setX(value: SVGAnimatedLengthList): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXmlbase(value: String): Self = StObject.set(x, "xmlbase", value.asInstanceOf[js.Any])
    
    inline def setXmllang(value: String): Self = StObject.set(x, "xmllang", value.asInstanceOf[js.Any])
    
    inline def setXmlspace(value: String): Self = StObject.set(x, "xmlspace", value.asInstanceOf[js.Any])
    
    inline def setY(value: SVGAnimatedLengthList): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
