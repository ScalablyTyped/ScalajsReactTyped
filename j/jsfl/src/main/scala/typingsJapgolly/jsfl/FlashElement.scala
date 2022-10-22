package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.jsfl.FlashSymbolInstance because var conflicts: accName, actionScript, description, forceSimple, shortcut, silent, tabIndex. Inlined backgroundColor, bitmapRenderMode, blendMode, buttonTracking, cacheAsBitmap, colorAlphaAmount, colorAlphaPercent, colorBlueAmount, colorBluePercent, colorGreenAmount, colorGreenPercent, colorMode, colorRedAmount, colorRedPercent, filters, firstFrame, loop, symbolType, useBackgroundColor, visible */ trait FlashElement
  extends StObject
     with FlashInstance
     with FlashBitmapInstance
     with FlashCompiledClipInstance
     with FlashComponentInstance
     with FlashShape {
  
  var backgroundColor: String
  
  var bitmapRenderMode: String
  
  var blendMode: String
  
  var buttonTracking: String
  
  var cacheAsBitmap: Boolean
  
  var colorAlphaAmount: Double
  
  var colorAlphaPercent: Double
  
  var colorBlueAmount: Double
  
  var colorBluePercent: Double
  
  var colorGreenAmount: Double
  
  var colorGreenPercent: Double
  
  var colorMode: String
  
  var colorRedAmount: Double
  
  var colorRedPercent: Double
  
  var depth: Double
  
  /**
    * Read-only property; a string that represents the type of the specified element.
    * The value is one of the following: "shape", "text", "instance", or "shapeObj".
    * A "shapeObj" is created with an extensible tool.
    */
  var elementType: String
  
  var filters: js.Array[FlashFilter]
  
  var firstFrame: Double
  
  def getPersistentData(name: String): Any
  
  def getTransformationPoint(): FlashPoint
  
  def hasPersistentData(name: String): Boolean
  
  var height: Double
  
  var layer: FlashLayer
  
  var left: Double
  
  var locked: Boolean
  
  var loop: String
  
  var matrix: FlashMatrix
  
  var name: String
  
  def removePersistentData(name: String): Unit
  
  var rotation: Double
  
  var scaleX: Double
  
  var scaleY: Double
  
  var selected: Boolean
  
  def setPersistentData(name: String, `type`: String, value: Any): Unit
  
  def setTransformationPoint(transformationPoint: FlashPoint): Unit
  
  var skewX: Double
  
  var skewY: Double
  
  var symbolType: String
  
  var top: Double
  
  var transformX: Double
  
  var transformY: Double
  
  var useBackgroundColor: Boolean
  
  var visible: Boolean
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object FlashElement {
  
  inline def apply(
    accName: String,
    actionScript: String,
    backgroundColor: String,
    beginEdit: Callback,
    bitmapRenderMode: String,
    blendMode: String,
    buttonTracking: String,
    cacheAsBitmap: Boolean,
    closePath: Boolean,
    colorAlphaAmount: Double,
    colorAlphaPercent: Double,
    colorBlueAmount: Double,
    colorBluePercent: Double,
    colorGreenAmount: Double,
    colorGreenPercent: Double,
    colorMode: String,
    colorRedAmount: Double,
    colorRedPercent: Double,
    contours: js.Array[FlashContour],
    deleteEdge: Double => Callback,
    depth: Double,
    description: String,
    edges: js.Array[FlashEdge],
    elementType: String,
    endAngle: Double,
    endEdit: Callback,
    filters: js.Array[FlashFilter],
    firstFrame: Double,
    forceSimple: Boolean,
    getBits: CallbackTo[FlashBitmap],
    getCubicSegmentPoints: Double => js.Array[FlashPoint],
    getPersistentData: String => Any,
    getTransformationPoint: CallbackTo[FlashPoint],
    hPixels: Double,
    hasPersistentData: String => Boolean,
    height: Double,
    innerRadius: Double,
    isDrawingObject: Boolean,
    isGroup: Boolean,
    isOvalObject: Boolean,
    isRectangleObject: Boolean,
    layer: FlashLayer,
    left: Double,
    locked: Boolean,
    loop: String,
    matrix: FlashMatrix,
    members: js.Array[FlashShape],
    name: String,
    numCubicSegments: Double,
    parameters: js.Array[Any],
    removePersistentData: String => Callback,
    rotation: Double,
    scaleX: Double,
    scaleY: Double,
    selected: Boolean,
    setBits: FlashBitmap => Callback,
    setPersistentData: (String, String, Any) => Callback,
    setTransformationPoint: FlashPoint => Callback,
    shortcut: String,
    silent: Boolean,
    skewX: Double,
    skewY: Double,
    startAngle: Double,
    symbolType: String,
    tabIndex: Double,
    top: Double,
    transformX: Double,
    transformY: Double,
    useBackgroundColor: Boolean,
    vPixels: Double,
    vertices: js.Array[FlashVertex],
    visible: Boolean,
    width: Double,
    x: Double,
    y: Double
  ): FlashElement = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], beginEdit = beginEdit.toJsFn, bitmapRenderMode = bitmapRenderMode.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], buttonTracking = buttonTracking.asInstanceOf[js.Any], cacheAsBitmap = cacheAsBitmap.asInstanceOf[js.Any], closePath = closePath.asInstanceOf[js.Any], colorAlphaAmount = colorAlphaAmount.asInstanceOf[js.Any], colorAlphaPercent = colorAlphaPercent.asInstanceOf[js.Any], colorBlueAmount = colorBlueAmount.asInstanceOf[js.Any], colorBluePercent = colorBluePercent.asInstanceOf[js.Any], colorGreenAmount = colorGreenAmount.asInstanceOf[js.Any], colorGreenPercent = colorGreenPercent.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], colorRedAmount = colorRedAmount.asInstanceOf[js.Any], colorRedPercent = colorRedPercent.asInstanceOf[js.Any], contours = contours.asInstanceOf[js.Any], deleteEdge = js.Any.fromFunction1((t0: Double) => deleteEdge(t0).runNow()), depth = depth.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endEdit = endEdit.toJsFn, filters = filters.asInstanceOf[js.Any], firstFrame = firstFrame.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], getBits = getBits.toJsFn, getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), getPersistentData = js.Any.fromFunction1(getPersistentData), getTransformationPoint = getTransformationPoint.toJsFn, hPixels = hPixels.asInstanceOf[js.Any], hasPersistentData = js.Any.fromFunction1(hasPersistentData), height = height.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], isDrawingObject = isDrawingObject.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOvalObject = isOvalObject.asInstanceOf[js.Any], isRectangleObject = isRectangleObject.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numCubicSegments = numCubicSegments.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], removePersistentData = js.Any.fromFunction1((t0: String) => removePersistentData(t0).runNow()), rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], setBits = js.Any.fromFunction1((t0: FlashBitmap) => setBits(t0).runNow()), setPersistentData = js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (setPersistentData(t0, t1, t2)).runNow()), setTransformationPoint = js.Any.fromFunction1((t0: FlashPoint) => setTransformationPoint(t0).runNow()), shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transformX = transformX.asInstanceOf[js.Any], transformY = transformY.asInstanceOf[js.Any], useBackgroundColor = useBackgroundColor.asInstanceOf[js.Any], vPixels = vPixels.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashElement]
  }
  
  extension [Self <: FlashElement](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBitmapRenderMode(value: String): Self = StObject.set(x, "bitmapRenderMode", value.asInstanceOf[js.Any])
    
    inline def setBlendMode(value: String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setButtonTracking(value: String): Self = StObject.set(x, "buttonTracking", value.asInstanceOf[js.Any])
    
    inline def setCacheAsBitmap(value: Boolean): Self = StObject.set(x, "cacheAsBitmap", value.asInstanceOf[js.Any])
    
    inline def setColorAlphaAmount(value: Double): Self = StObject.set(x, "colorAlphaAmount", value.asInstanceOf[js.Any])
    
    inline def setColorAlphaPercent(value: Double): Self = StObject.set(x, "colorAlphaPercent", value.asInstanceOf[js.Any])
    
    inline def setColorBlueAmount(value: Double): Self = StObject.set(x, "colorBlueAmount", value.asInstanceOf[js.Any])
    
    inline def setColorBluePercent(value: Double): Self = StObject.set(x, "colorBluePercent", value.asInstanceOf[js.Any])
    
    inline def setColorGreenAmount(value: Double): Self = StObject.set(x, "colorGreenAmount", value.asInstanceOf[js.Any])
    
    inline def setColorGreenPercent(value: Double): Self = StObject.set(x, "colorGreenPercent", value.asInstanceOf[js.Any])
    
    inline def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setColorRedAmount(value: Double): Self = StObject.set(x, "colorRedAmount", value.asInstanceOf[js.Any])
    
    inline def setColorRedPercent(value: Double): Self = StObject.set(x, "colorRedPercent", value.asInstanceOf[js.Any])
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: js.Array[FlashFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: FlashFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFirstFrame(value: Double): Self = StObject.set(x, "firstFrame", value.asInstanceOf[js.Any])
    
    inline def setGetPersistentData(value: String => Any): Self = StObject.set(x, "getPersistentData", js.Any.fromFunction1(value))
    
    inline def setGetTransformationPoint(value: CallbackTo[FlashPoint]): Self = StObject.set(x, "getTransformationPoint", value.toJsFn)
    
    inline def setHasPersistentData(value: String => Boolean): Self = StObject.set(x, "hasPersistentData", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: FlashLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMatrix(value: FlashMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemovePersistentData(value: String => Callback): Self = StObject.set(x, "removePersistentData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSetPersistentData(value: (String, String, Any) => Callback): Self = StObject.set(x, "setPersistentData", js.Any.fromFunction3((t0: String, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetTransformationPoint(value: FlashPoint => Callback): Self = StObject.set(x, "setTransformationPoint", js.Any.fromFunction1((t0: FlashPoint) => value(t0).runNow()))
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTransformX(value: Double): Self = StObject.set(x, "transformX", value.asInstanceOf[js.Any])
    
    inline def setTransformY(value: Double): Self = StObject.set(x, "transformY", value.asInstanceOf[js.Any])
    
    inline def setUseBackgroundColor(value: Boolean): Self = StObject.set(x, "useBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
