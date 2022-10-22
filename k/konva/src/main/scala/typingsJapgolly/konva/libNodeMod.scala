package typingsJapgolly.konva

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AnimationEvent
import org.scalajs.dom.CompositionEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.ImageData
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.ProgressEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalajs.dom.UIEvent
import org.scalajs.dom.WheelEvent
import typingsJapgolly.konva.anon.Callback
import typingsJapgolly.konva.anon.DrawBorder
import typingsJapgolly.konva.anon.Handler
import typingsJapgolly.konva.anon.HeightWidth
import typingsJapgolly.konva.anon.MimeType
import typingsJapgolly.konva.anon.OffsetX
import typingsJapgolly.konva.anon.PixelRatio
import typingsJapgolly.konva.anon.RelativeTo
import typingsJapgolly.konva.anon.Width
import typingsJapgolly.konva.anon.X
import typingsJapgolly.konva.konvaStrings.abort
import typingsJapgolly.konva.konvaStrings.animationcancel
import typingsJapgolly.konva.konvaStrings.animationend
import typingsJapgolly.konva.konvaStrings.animationiteration
import typingsJapgolly.konva.konvaStrings.animationstart
import typingsJapgolly.konva.konvaStrings.auxclick
import typingsJapgolly.konva.konvaStrings.beforeinput
import typingsJapgolly.konva.konvaStrings.blur
import typingsJapgolly.konva.konvaStrings.canplay
import typingsJapgolly.konva.konvaStrings.canplaythrough
import typingsJapgolly.konva.konvaStrings.change
import typingsJapgolly.konva.konvaStrings.click
import typingsJapgolly.konva.konvaStrings.close
import typingsJapgolly.konva.konvaStrings.compositionend
import typingsJapgolly.konva.konvaStrings.compositionstart
import typingsJapgolly.konva.konvaStrings.compositionupdate
import typingsJapgolly.konva.konvaStrings.contextmenu
import typingsJapgolly.konva.konvaStrings.cuechange
import typingsJapgolly.konva.konvaStrings.dblclick
import typingsJapgolly.konva.konvaStrings.drag
import typingsJapgolly.konva.konvaStrings.dragend
import typingsJapgolly.konva.konvaStrings.dragenter
import typingsJapgolly.konva.konvaStrings.dragleave
import typingsJapgolly.konva.konvaStrings.dragover
import typingsJapgolly.konva.konvaStrings.dragstart
import typingsJapgolly.konva.konvaStrings.drop
import typingsJapgolly.konva.konvaStrings.durationchange
import typingsJapgolly.konva.konvaStrings.emptied
import typingsJapgolly.konva.konvaStrings.ended
import typingsJapgolly.konva.konvaStrings.error
import typingsJapgolly.konva.konvaStrings.focus
import typingsJapgolly.konva.konvaStrings.focusin
import typingsJapgolly.konva.konvaStrings.focusout
import typingsJapgolly.konva.konvaStrings.formdata
import typingsJapgolly.konva.konvaStrings.gotpointercapture
import typingsJapgolly.konva.konvaStrings.input
import typingsJapgolly.konva.konvaStrings.invalid
import typingsJapgolly.konva.konvaStrings.keydown
import typingsJapgolly.konva.konvaStrings.keypress
import typingsJapgolly.konva.konvaStrings.keyup
import typingsJapgolly.konva.konvaStrings.load
import typingsJapgolly.konva.konvaStrings.loadeddata
import typingsJapgolly.konva.konvaStrings.loadedmetadata
import typingsJapgolly.konva.konvaStrings.loadstart
import typingsJapgolly.konva.konvaStrings.lostpointercapture
import typingsJapgolly.konva.konvaStrings.mousedown
import typingsJapgolly.konva.konvaStrings.mouseenter
import typingsJapgolly.konva.konvaStrings.mouseleave
import typingsJapgolly.konva.konvaStrings.mousemove
import typingsJapgolly.konva.konvaStrings.mouseout
import typingsJapgolly.konva.konvaStrings.mouseover
import typingsJapgolly.konva.konvaStrings.mouseup
import typingsJapgolly.konva.konvaStrings.pause
import typingsJapgolly.konva.konvaStrings.play
import typingsJapgolly.konva.konvaStrings.playing
import typingsJapgolly.konva.konvaStrings.pointercancel
import typingsJapgolly.konva.konvaStrings.pointerdown
import typingsJapgolly.konva.konvaStrings.pointerenter
import typingsJapgolly.konva.konvaStrings.pointerleave
import typingsJapgolly.konva.konvaStrings.pointermove
import typingsJapgolly.konva.konvaStrings.pointerout
import typingsJapgolly.konva.konvaStrings.pointerover
import typingsJapgolly.konva.konvaStrings.pointerup
import typingsJapgolly.konva.konvaStrings.progress
import typingsJapgolly.konva.konvaStrings.ratechange
import typingsJapgolly.konva.konvaStrings.reset
import typingsJapgolly.konva.konvaStrings.resize
import typingsJapgolly.konva.konvaStrings.scroll
import typingsJapgolly.konva.konvaStrings.securitypolicyviolation
import typingsJapgolly.konva.konvaStrings.seeked
import typingsJapgolly.konva.konvaStrings.seeking
import typingsJapgolly.konva.konvaStrings.select
import typingsJapgolly.konva.konvaStrings.selectionchange
import typingsJapgolly.konva.konvaStrings.selectstart
import typingsJapgolly.konva.konvaStrings.slotchange
import typingsJapgolly.konva.konvaStrings.stalled
import typingsJapgolly.konva.konvaStrings.submit
import typingsJapgolly.konva.konvaStrings.suspend
import typingsJapgolly.konva.konvaStrings.timeupdate
import typingsJapgolly.konva.konvaStrings.toggle
import typingsJapgolly.konva.konvaStrings.touchcancel
import typingsJapgolly.konva.konvaStrings.touchend
import typingsJapgolly.konva.konvaStrings.touchmove
import typingsJapgolly.konva.konvaStrings.touchstart
import typingsJapgolly.konva.konvaStrings.transitioncancel
import typingsJapgolly.konva.konvaStrings.transitionend
import typingsJapgolly.konva.konvaStrings.transitionrun
import typingsJapgolly.konva.konvaStrings.transitionstart
import typingsJapgolly.konva.konvaStrings.volumechange
import typingsJapgolly.konva.konvaStrings.waiting
import typingsJapgolly.konva.konvaStrings.webkitanimationend
import typingsJapgolly.konva.konvaStrings.webkitanimationiteration
import typingsJapgolly.konva.konvaStrings.webkitanimationstart
import typingsJapgolly.konva.konvaStrings.webkittransitionend
import typingsJapgolly.konva.konvaStrings.wheel
import typingsJapgolly.konva.libCanvasMod.Canvas
import typingsJapgolly.konva.libCanvasMod.SceneCanvas
import typingsJapgolly.konva.libContainerMod.Container
import typingsJapgolly.konva.libContextMod.Context
import typingsJapgolly.konva.libLayerMod.Layer
import typingsJapgolly.konva.libShapeMod.Shape
import typingsJapgolly.konva.libShapeMod.ShapeConfig
import typingsJapgolly.konva.libStageMod.Stage
import typingsJapgolly.konva.libTypesMod.GetSet
import typingsJapgolly.konva.libTypesMod.IRect
import typingsJapgolly.konva.libTypesMod.Vector2d
import typingsJapgolly.konva.libUtilMod.Transform
import typingsJapgolly.std.FormDataEvent
import typingsJapgolly.std.GlobalEventHandlersEventMap
import typingsJapgolly.std.InputEvent
import typingsJapgolly.std.Map
import typingsJapgolly.std.SecurityPolicyViolationEvent
import typingsJapgolly.std.SubmitEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodeMod {
  
  /* note: abstract class */ @JSImport("konva/lib/Node", "Node")
  @js.native
  open class Node[Config /* <: NodeConfig */] () extends StObject {
    def this(config: Config) = this()
    
    var _allEventListeners: Null | js.Array[js.Function] = js.native
    
    var _attachedDepsListeners: Map[String, Boolean] = js.native
    
    var _attrsAffectingSize: js.Array[String] = js.native
    
    def _batchTransformChanges(func: Any): Unit = js.native
    
    var _batchingTransformChange: Boolean = js.native
    
    var _cache: Map[String, Any] = js.native
    
    def _calculate(name: String, deps: js.Array[String], getter: js.Function): Any = js.native
    
    def _clearCache(): Unit = js.native
    def _clearCache(attr: String): Unit = js.native
    
    def _clearCaches(): Unit = js.native
    
    def _clearSelfAndDescendantCache(): Unit = js.native
    def _clearSelfAndDescendantCache(attr: String): Unit = js.native
    
    def _clearTransform(): OffsetX = js.native
    
    def _createDragElement(evt: Any): Unit = js.native
    
    def _delegate(event: String, selector: String, handler: js.Function1[/* e */ Event, Unit]): Unit = js.native
    
    def _dragChange(): Unit = js.native
    
    def _dragCleanup(): Unit = js.native
    
    var _dragEventId: Double | Null = js.native
    
    def _drawCachedHitCanvas(context: Context): Unit = js.native
    
    def _drawCachedSceneCanvas(context: Context): Unit = js.native
    
    def _eachAncestorReverse(func: Any, top: Any): Unit = js.native
    
    var _filterUpToDate: Boolean = js.native
    
    def _fire(eventType: Any, evt: Any): Unit = js.native
    
    def _fireAndBubble(eventType: Any, evt: Any): Unit = js.native
    def _fireAndBubble(eventType: Any, evt: Any, compareShape: Any): Unit = js.native
    
    def _fireChangeEvent(attr: Any, oldVal: Any, newVal: Any): Unit = js.native
    
    def _getAbsoluteOpacity(): Double = js.native
    
    def _getAbsoluteTransform(): Transform = js.native
    def _getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
    
    def _getCache(attr: String, privateGetter: js.Function): Any = js.native
    
    def _getCachedSceneCanvas(): Any = js.native
    
    def _getCanvasCache(): Any = js.native
    
    def _getProtoListeners(eventType: Any): Any = js.native
    
    def _getStage(): js.UndefOr[Stage] = js.native
    
    def _getTransform(): Transform = js.native
    
    var _id: Double = js.native
    
    def _isListening(): Boolean = js.native
    def _isListening(relativeTo: Node[NodeConfig]): Boolean = js.native
    
    def _isMatch(selector: String): Any = js.native
    def _isMatch(selector: js.Function): Any = js.native
    
    var _isUnderCache: Boolean = js.native
    
    def _isVisible(): Boolean = js.native
    def _isVisible(relativeTo: Node[NodeConfig]): Boolean = js.native
    
    var _lastPos: Vector2d = js.native
    
    def _listenDrag(): Unit = js.native
    
    var _needClearTransformCache: Boolean = js.native
    
    def _off(`type`: Any): Unit = js.native
    def _off(`type`: Any, name: Any): Unit = js.native
    def _off(`type`: Any, name: Any, callback: Any): Unit = js.native
    def _off(`type`: Any, name: Unit, callback: Any): Unit = js.native
    
    def _remove(): Unit = js.native
    
    def _requestDraw(): Unit = js.native
    
    def _setAttr(key: Any, `val`: Any): Unit = js.native
    
    def _setComponentAttr(key: Any, component: Any, `val`: Any): Unit = js.native
    
    def _setDragPosition(evt: Any, elem: Any): Unit = js.native
    
    def _setTransform(trans: Any): Unit = js.native
    
    var _shouldFireChangeEvents: Boolean = js.native
    
    def _toKonvaCanvas(config: Any): SceneCanvas = js.native
    
    def _transformedRect(rect: IRect, top: Node[NodeConfig]): Width = js.native
    
    def absolutePosition(): Vector2d = js.native
    def absolutePosition(v: Vector2d): this.type = js.native
    @JSName("absolutePosition")
    var absolutePosition_Original: GetSet[Vector2d, this.type] = js.native
    
    def addEventListener(`type`: String, handler: js.Function1[/* e */ Event, Unit]): this.type = js.native
    
    def addName(name: Any): this.type = js.native
    
    def alpha(): Double = js.native
    def alpha(v: Double): this.type = js.native
    @JSName("alpha")
    var alpha_Original: GetSet[Double, this.type] = js.native
    
    var attrs: Any = js.native
    
    def blue(): Double = js.native
    def blue(v: Double): this.type = js.native
    @JSName("blue")
    var blue_Original: GetSet[Double, this.type] = js.native
    
    def blurRadius(): Double = js.native
    def blurRadius(v: Double): this.type = js.native
    @JSName("blurRadius")
    var blurRadius_Original: GetSet[Double, this.type] = js.native
    
    def brightness(): Double = js.native
    def brightness(v: Double): this.type = js.native
    @JSName("brightness")
    var brightness_Original: GetSet[Double, this.type] = js.native
    
    def cache(): this.type = js.native
    def cache(config: DrawBorder): this.type = js.native
    
    var className: String = js.native
    
    def clearCache(): this.type = js.native
    
    def clone(obj: Any): Any = js.native
    
    def contrast(): Double = js.native
    def contrast(v: Double): this.type = js.native
    @JSName("contrast")
    var contrast_Original: GetSet[Double, this.type] = js.native
    
    def destroy(): this.type = js.native
    
    def dispatchEvent(evt: Any): this.type = js.native
    
    def dragBoundFunc(): js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d] = js.native
    def dragBoundFunc(v: js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d]): this.type = js.native
    @JSName("dragBoundFunc")
    var dragBoundFunc_Original: GetSet[
        js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d], 
        this.type
      ] = js.native
    
    def dragDistance(): Double = js.native
    def dragDistance(v: Double): this.type = js.native
    @JSName("dragDistance")
    var dragDistance_Original: GetSet[Double, this.type] = js.native
    
    def draggable(): Boolean = js.native
    def draggable(v: Boolean): this.type = js.native
    @JSName("draggable")
    var draggable_Original: GetSet[Boolean, this.type] = js.native
    
    def draw(): this.type = js.native
    
    def drawHit(): Unit = js.native
    def drawHit(canvas: Unit, top: Node[NodeConfig]): Unit = js.native
    def drawHit(canvas: Canvas): Unit = js.native
    def drawHit(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
    
    def drawScene(): Unit = js.native
    def drawScene(canvas: Unit, top: Node[NodeConfig]): Unit = js.native
    def drawScene(canvas: Canvas): Unit = js.native
    def drawScene(canvas: Canvas, top: Node[NodeConfig]): Unit = js.native
    
    def embossBlend(): Boolean = js.native
    def embossBlend(v: Boolean): this.type = js.native
    @JSName("embossBlend")
    var embossBlend_Original: GetSet[Boolean, this.type] = js.native
    
    def embossDirection(): String = js.native
    def embossDirection(v: String): this.type = js.native
    @JSName("embossDirection")
    var embossDirection_Original: GetSet[String, this.type] = js.native
    
    def embossStrength(): Double = js.native
    def embossStrength(v: Double): this.type = js.native
    @JSName("embossStrength")
    var embossStrength_Original: GetSet[Double, this.type] = js.native
    
    def embossWhiteLevel(): Double = js.native
    def embossWhiteLevel(v: Double): this.type = js.native
    @JSName("embossWhiteLevel")
    var embossWhiteLevel_Original: GetSet[Double, this.type] = js.native
    
    def enhance(): Double = js.native
    def enhance(v: Double): this.type = js.native
    @JSName("enhance")
    var enhance_Original: GetSet[Double, this.type] = js.native
    
    var eventListeners: StringDictionary[js.Array[Handler]] = js.native
    
    def filters(): js.Array[Filter] = js.native
    def filters(v: js.Array[Filter]): this.type = js.native
    @JSName("filters")
    var filters_Original: GetSet[js.Array[Filter], this.type] = js.native
    
    def findAncestor(): Node[NodeConfig] = js.native
    def findAncestor(selector: String): Node[NodeConfig] = js.native
    def findAncestor(selector: String, includeSelf: Boolean): Node[NodeConfig] = js.native
    def findAncestor(selector: String, includeSelf: Boolean, stopNode: Container[Node[NodeConfig]]): Node[NodeConfig] = js.native
    def findAncestor(selector: String, includeSelf: Unit, stopNode: Container[Node[NodeConfig]]): Node[NodeConfig] = js.native
    def findAncestor(selector: Unit, includeSelf: Boolean): Node[NodeConfig] = js.native
    def findAncestor(selector: Unit, includeSelf: Boolean, stopNode: Container[Node[NodeConfig]]): Node[NodeConfig] = js.native
    def findAncestor(selector: Unit, includeSelf: Unit, stopNode: Container[Node[NodeConfig]]): Node[NodeConfig] = js.native
    
    def findAncestors(selector: String): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: String, includeSelf: Boolean): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: String, includeSelf: Boolean, stopNode: Node[NodeConfig]): js.Array[Node[NodeConfig]] = js.native
    def findAncestors(selector: String, includeSelf: Unit, stopNode: Node[NodeConfig]): js.Array[Node[NodeConfig]] = js.native
    
    def fire(eventType: String): this.type = js.native
    def fire(eventType: String, evt: Any): this.type = js.native
    def fire(eventType: String, evt: Any, bubble: Boolean): this.type = js.native
    def fire(eventType: String, evt: Unit, bubble: Boolean): this.type = js.native
    
    def getAbsoluteOpacity(): Any = js.native
    
    def getAbsolutePosition(): X = js.native
    def getAbsolutePosition(top: Node[NodeConfig]): X = js.native
    
    def getAbsoluteRotation(): Double = js.native
    
    def getAbsoluteScale(): X = js.native
    def getAbsoluteScale(top: Node[NodeConfig]): X = js.native
    
    def getAbsoluteTransform(): Transform = js.native
    def getAbsoluteTransform(top: Node[NodeConfig]): Transform = js.native
    
    def getAbsoluteZIndex(): Double = js.native
    
    def getAncestors(): js.Array[Node[NodeConfig]] = js.native
    
    def getAttr(attr: String): Any = js.native
    
    def getAttrs(): Any = js.native
    
    def getClassName(): String = js.native
    
    def getClientRect(): Width = js.native
    def getClientRect(config: RelativeTo): Width = js.native
    
    def getDepth(): Double = js.native
    
    def getDragDistance(): Double = js.native
    
    def getLayer(): Layer | Null = js.native
    
    def getParent(): Container[Node[NodeConfig]] = js.native
    
    def getPosition(): X = js.native
    
    def getRelativePointerPosition(): X = js.native
    
    def getSize(): HeightWidth = js.native
    
    def getStage(): Stage | Null = js.native
    
    def getTransform(): Transform = js.native
    
    def getType(): String = js.native
    
    def getZIndex(): Double = js.native
    
    def globalCompositeOperation(): globalCompositeOperationType = js.native
    def globalCompositeOperation(v: globalCompositeOperationType): this.type = js.native
    @JSName("globalCompositeOperation")
    var globalCompositeOperation_Original: GetSet[globalCompositeOperationType, this.type] = js.native
    
    def green(): Double = js.native
    def green(v: Double): this.type = js.native
    @JSName("green")
    var green_Original: GetSet[Double, this.type] = js.native
    
    def hasChildren(): Boolean = js.native
    
    def hasName(name: Any): Boolean = js.native
    
    def height(): Double = js.native
    def height(v: Double): this.type = js.native
    @JSName("height")
    var height_Original: GetSet[Double, this.type] = js.native
    
    def hide(): this.type = js.native
    
    def hue(): Double = js.native
    def hue(v: Double): this.type = js.native
    @JSName("hue")
    var hue_Original: GetSet[Double, this.type] = js.native
    
    def id(): String = js.native
    def id(v: String): this.type = js.native
    @JSName("id")
    var id_Original: GetSet[String, this.type] = js.native
    
    var index: Double = js.native
    
    def isAncestorOf(node: Node[NodeConfig]): Boolean = js.native
    
    def isCached(): Boolean = js.native
    
    def isClientRectOnScreen(): Boolean = js.native
    def isClientRectOnScreen(margin: X): Boolean = js.native
    
    def isDragging(): Boolean = js.native
    
    def isListening(): Any = js.native
    
    def isVisible(): Any = js.native
    
    def kaleidoscopeAngle(): Double = js.native
    def kaleidoscopeAngle(v: Double): this.type = js.native
    @JSName("kaleidoscopeAngle")
    var kaleidoscopeAngle_Original: GetSet[Double, this.type] = js.native
    
    def kaleidoscopePower(): Double = js.native
    def kaleidoscopePower(v: Double): this.type = js.native
    @JSName("kaleidoscopePower")
    var kaleidoscopePower_Original: GetSet[Double, this.type] = js.native
    
    def levels(): Double = js.native
    def levels(v: Double): this.type = js.native
    @JSName("levels")
    var levels_Original: GetSet[Double, this.type] = js.native
    
    def listening(): Boolean = js.native
    def listening(v: Boolean): this.type = js.native
    @JSName("listening")
    var listening_Original: GetSet[Boolean, this.type] = js.native
    
    def luminance(): Double = js.native
    def luminance(v: Double): this.type = js.native
    @JSName("luminance")
    var luminance_Original: GetSet[Double, this.type] = js.native
    
    def move(change: Vector2d): this.type = js.native
    
    def moveDown(): Boolean = js.native
    
    def moveTo(newContainer: Any): this.type = js.native
    
    def moveToBottom(): Boolean = js.native
    
    def moveToTop(): Boolean = js.native
    
    def moveUp(): Boolean = js.native
    
    def name(): String = js.native
    def name(v: String): this.type = js.native
    @JSName("name")
    var name_Original: GetSet[String, this.type] = js.native
    
    var nodeType: String = js.native
    
    def noise(): Double = js.native
    def noise(v: Double): this.type = js.native
    @JSName("noise")
    var noise_Original: GetSet[Double, this.type] = js.native
    
    def off(): this.type = js.native
    def off(evtStr: String): this.type = js.native
    def off(evtStr: String, callback: js.Function): this.type = js.native
    def off(evtStr: Unit, callback: js.Function): this.type = js.native
    
    def offset(): Vector2d = js.native
    def offset(v: Vector2d): this.type = js.native
    
    def offsetX(): Double = js.native
    def offsetX(v: Double): this.type = js.native
    @JSName("offsetX")
    var offsetX_Original: GetSet[Double, this.type] = js.native
    
    def offsetY(): Double = js.native
    def offsetY(v: Double): this.type = js.native
    @JSName("offsetY")
    var offsetY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("offset")
    var offset_Original: GetSet[Vector2d, this.type] = js.native
    
    @JSName("on")
    def on_abort(evtStr: abort, handler: KonvaEventListener[this.type, UIEvent]): Any = js.native
    @JSName("on")
    def on_animationcancel(evtStr: animationcancel, handler: KonvaEventListener[this.type, AnimationEvent]): Any = js.native
    @JSName("on")
    def on_animationend(evtStr: animationend, handler: KonvaEventListener[this.type, AnimationEvent]): Any = js.native
    @JSName("on")
    def on_animationiteration(evtStr: animationiteration, handler: KonvaEventListener[this.type, AnimationEvent]): Any = js.native
    @JSName("on")
    def on_animationstart(evtStr: animationstart, handler: KonvaEventListener[this.type, AnimationEvent]): Any = js.native
    @JSName("on")
    def on_auxclick(evtStr: auxclick, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_beforeinput(evtStr: beforeinput, handler: KonvaEventListener[this.type, InputEvent]): Any = js.native
    @JSName("on")
    def on_blur(evtStr: blur, handler: KonvaEventListener[this.type, FocusEvent]): Any = js.native
    @JSName("on")
    def on_canplay(evtStr: canplay, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_canplaythrough(evtStr: canplaythrough, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_change(evtStr: change, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_click(evtStr: click, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_close(evtStr: close, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_compositionend(evtStr: compositionend, handler: KonvaEventListener[this.type, CompositionEvent]): Any = js.native
    @JSName("on")
    def on_compositionstart(evtStr: compositionstart, handler: KonvaEventListener[this.type, CompositionEvent]): Any = js.native
    @JSName("on")
    def on_compositionupdate(evtStr: compositionupdate, handler: KonvaEventListener[this.type, CompositionEvent]): Any = js.native
    @JSName("on")
    def on_contextmenu(evtStr: contextmenu, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_cuechange(evtStr: cuechange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_dblclick(evtStr: dblclick, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_drag(evtStr: drag, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_dragend(evtStr: dragend, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_dragenter(evtStr: dragenter, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_dragleave(evtStr: dragleave, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_dragover(evtStr: dragover, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_dragstart(evtStr: dragstart, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_drop(evtStr: drop, handler: KonvaEventListener[this.type, DragEvent]): Any = js.native
    @JSName("on")
    def on_durationchange(evtStr: durationchange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_emptied(evtStr: emptied, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_ended(evtStr: ended, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_error(evtStr: error, handler: KonvaEventListener[this.type, ErrorEvent]): Any = js.native
    @JSName("on")
    def on_focus(evtStr: focus, handler: KonvaEventListener[this.type, FocusEvent]): Any = js.native
    @JSName("on")
    def on_focusin(evtStr: focusin, handler: KonvaEventListener[this.type, FocusEvent]): Any = js.native
    @JSName("on")
    def on_focusout(evtStr: focusout, handler: KonvaEventListener[this.type, FocusEvent]): Any = js.native
    @JSName("on")
    def on_formdata(evtStr: formdata, handler: KonvaEventListener[this.type, FormDataEvent]): Any = js.native
    @JSName("on")
    def on_gotpointercapture(evtStr: gotpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_input(evtStr: input, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_invalid(evtStr: invalid, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_keydown(evtStr: keydown, handler: KonvaEventListener[this.type, KeyboardEvent]): Any = js.native
    @JSName("on")
    def on_keypress(evtStr: keypress, handler: KonvaEventListener[this.type, KeyboardEvent]): Any = js.native
    @JSName("on")
    def on_keyup(evtStr: keyup, handler: KonvaEventListener[this.type, KeyboardEvent]): Any = js.native
    @JSName("on")
    def on_load(evtStr: load, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_loadeddata(evtStr: loadeddata, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_loadedmetadata(evtStr: loadedmetadata, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_loadstart(evtStr: loadstart, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_lostpointercapture(evtStr: lostpointercapture, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_mousedown(evtStr: mousedown, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mouseenter(evtStr: mouseenter, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mouseleave(evtStr: mouseleave, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mousemove(evtStr: mousemove, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mouseout(evtStr: mouseout, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mouseover(evtStr: mouseover, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_mouseup(evtStr: mouseup, handler: KonvaEventListener[this.type, MouseEvent]): Any = js.native
    @JSName("on")
    def on_pause(evtStr: pause, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_play(evtStr: play, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_playing(evtStr: playing, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_pointercancel(evtStr: pointercancel, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerdown(evtStr: pointerdown, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerenter(evtStr: pointerenter, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerleave(evtStr: pointerleave, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointermove(evtStr: pointermove, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerout(evtStr: pointerout, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerover(evtStr: pointerover, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_pointerup(evtStr: pointerup, handler: KonvaEventListener[this.type, PointerEvent]): Any = js.native
    @JSName("on")
    def on_progress(evtStr: progress, handler: KonvaEventListener[this.type, ProgressEvent]): Any = js.native
    @JSName("on")
    def on_ratechange(evtStr: ratechange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_reset(evtStr: reset, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_resize(evtStr: resize, handler: KonvaEventListener[this.type, UIEvent]): Any = js.native
    @JSName("on")
    def on_scroll(evtStr: scroll, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_securitypolicyviolation(
      evtStr: securitypolicyviolation,
      handler: KonvaEventListener[this.type, SecurityPolicyViolationEvent]
    ): Any = js.native
    @JSName("on")
    def on_seeked(evtStr: seeked, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_seeking(evtStr: seeking, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_select(evtStr: select, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_selectionchange(evtStr: selectionchange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_selectstart(evtStr: selectstart, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_slotchange(evtStr: slotchange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_stalled(evtStr: stalled, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_submit(evtStr: submit, handler: KonvaEventListener[this.type, SubmitEvent]): Any = js.native
    @JSName("on")
    def on_suspend(evtStr: suspend, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_timeupdate(evtStr: timeupdate, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_toggle(evtStr: toggle, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_touchcancel(evtStr: touchcancel, handler: KonvaEventListener[this.type, TouchEvent]): Any = js.native
    @JSName("on")
    def on_touchend(evtStr: touchend, handler: KonvaEventListener[this.type, TouchEvent]): Any = js.native
    @JSName("on")
    def on_touchmove(evtStr: touchmove, handler: KonvaEventListener[this.type, TouchEvent]): Any = js.native
    @JSName("on")
    def on_touchstart(evtStr: touchstart, handler: KonvaEventListener[this.type, TouchEvent]): Any = js.native
    @JSName("on")
    def on_transitioncancel(evtStr: transitioncancel, handler: KonvaEventListener[this.type, TransitionEvent]): Any = js.native
    @JSName("on")
    def on_transitionend(evtStr: transitionend, handler: KonvaEventListener[this.type, TransitionEvent]): Any = js.native
    @JSName("on")
    def on_transitionrun(evtStr: transitionrun, handler: KonvaEventListener[this.type, TransitionEvent]): Any = js.native
    @JSName("on")
    def on_transitionstart(evtStr: transitionstart, handler: KonvaEventListener[this.type, TransitionEvent]): Any = js.native
    @JSName("on")
    def on_volumechange(evtStr: volumechange, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_waiting(evtStr: waiting, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_webkitanimationend(evtStr: webkitanimationend, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_webkitanimationiteration(evtStr: webkitanimationiteration, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_webkitanimationstart(evtStr: webkitanimationstart, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_webkittransitionend(evtStr: webkittransitionend, handler: KonvaEventListener[this.type, Event]): Any = js.native
    @JSName("on")
    def on_wheel(evtStr: wheel, handler: KonvaEventListener[this.type, WheelEvent]): Any = js.native
    
    def opacity(): Double = js.native
    def opacity(v: Double): this.type = js.native
    @JSName("opacity")
    var opacity_Original: GetSet[Double, this.type] = js.native
    
    var parent: Container[Node[NodeConfig]] | Null = js.native
    
    def pixelSize(): Double = js.native
    def pixelSize(v: Double): this.type = js.native
    @JSName("pixelSize")
    var pixelSize_Original: GetSet[Double, this.type] = js.native
    
    def position(): Vector2d = js.native
    def position(v: Vector2d): this.type = js.native
    @JSName("position")
    var position_Original: GetSet[Vector2d, this.type] = js.native
    
    def preventDefault(): Boolean = js.native
    def preventDefault(v: Boolean): this.type = js.native
    @JSName("preventDefault")
    var preventDefault_Original: GetSet[Boolean, this.type] = js.native
    
    def red(): Double = js.native
    def red(v: Double): this.type = js.native
    @JSName("red")
    var red_Original: GetSet[Double, this.type] = js.native
    
    def remove(): this.type = js.native
    
    def removeEventListener(`type`: String): this.type = js.native
    
    def removeName(name: Any): this.type = js.native
    
    def rotate(theta: Double): this.type = js.native
    
    def rotation(): Double = js.native
    def rotation(v: Double): this.type = js.native
    @JSName("rotation")
    var rotation_Original: GetSet[Double, this.type] = js.native
    
    def saturation(): Double = js.native
    def saturation(v: Double): this.type = js.native
    @JSName("saturation")
    var saturation_Original: GetSet[Double, this.type] = js.native
    
    def scale(): this.type = js.native
    def scale(v: Vector2d): this.type = js.native
    
    def scaleX(): Double = js.native
    def scaleX(v: Double): this.type = js.native
    @JSName("scaleX")
    var scaleX_Original: GetSet[Double, this.type] = js.native
    
    def scaleY(): Double = js.native
    def scaleY(v: Double): this.type = js.native
    @JSName("scaleY")
    var scaleY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("scale")
    var scale_Original: GetSet[js.UndefOr[Vector2d], this.type] = js.native
    @JSName("scale")
    def scale_Union(): js.UndefOr[Vector2d] = js.native
    
    def setAbsolutePosition(pos: Vector2d): this.type = js.native
    
    def setAttr(attr: Any, `val`: Any): this.type = js.native
    
    def setAttrs(config: Any): this.type = js.native
    
    def setDraggable(draggable: Any): Unit = js.native
    
    def setPosition(pos: Vector2d): this.type = js.native
    
    def setSize(size: Any): this.type = js.native
    
    def setZIndex(zIndex: Any): this.type = js.native
    
    def shouldDrawHit(): Boolean = js.native
    def shouldDrawHit(top: Unit, skipDragCheck: Boolean): Boolean = js.native
    def shouldDrawHit(top: Node[NodeConfig]): Boolean = js.native
    def shouldDrawHit(top: Node[NodeConfig], skipDragCheck: Boolean): Boolean = js.native
    
    def show(): this.type = js.native
    
    def size(): HeightWidth = js.native
    def size(v: HeightWidth): this.type = js.native
    @JSName("size")
    var size_Original: GetSet[HeightWidth, this.type] = js.native
    
    def skew(): Vector2d = js.native
    def skew(v: Vector2d): this.type = js.native
    
    def skewX(): Double = js.native
    def skewX(v: Double): this.type = js.native
    @JSName("skewX")
    var skewX_Original: GetSet[Double, this.type] = js.native
    
    def skewY(): Double = js.native
    def skewY(v: Double): this.type = js.native
    @JSName("skewY")
    var skewY_Original: GetSet[Double, this.type] = js.native
    
    @JSName("skew")
    var skew_Original: GetSet[Vector2d, this.type] = js.native
    
    def startDrag(): Unit = js.native
    def startDrag(evt: Any): Unit = js.native
    def startDrag(evt: Any, bubbleEvent: Boolean): Unit = js.native
    def startDrag(evt: Unit, bubbleEvent: Boolean): Unit = js.native
    
    def stopDrag(): Unit = js.native
    def stopDrag(evt: Any): Unit = js.native
    
    def threshold(): Double = js.native
    def threshold(v: Double): this.type = js.native
    @JSName("threshold")
    var threshold_Original: GetSet[Double, this.type] = js.native
    
    def to(params: AnimTo): Unit = js.native
    
    def toBlob(): js.Promise[Any] = js.native
    def toBlob(config: PixelRatio): js.Promise[Any] = js.native
    
    def toCanvas(): HTMLCanvasElement = js.native
    def toCanvas(config: Any): HTMLCanvasElement = js.native
    
    def toDataURL(): String = js.native
    def toDataURL(config: Callback): String = js.native
    
    def toImage(): js.Promise[Any] = js.native
    def toImage(config: MimeType): js.Promise[Any] = js.native
    
    def toJSON(): String = js.native
    
    def toObject(): Any = js.native
    
    def transformsEnabled(): String = js.native
    def transformsEnabled(v: String): this.type = js.native
    @JSName("transformsEnabled")
    var transformsEnabled_Original: GetSet[String, this.type] = js.native
    
    def value(): Double = js.native
    def value(v: Double): this.type = js.native
    @JSName("value")
    var value_Original: GetSet[Double, this.type] = js.native
    
    def visible(): Boolean = js.native
    def visible(v: Boolean): this.type = js.native
    @JSName("visible")
    var visible_Original: GetSet[Boolean, this.type] = js.native
    
    def width(): Double = js.native
    def width(v: Double): this.type = js.native
    @JSName("width")
    var width_Original: GetSet[Double, this.type] = js.native
    
    def x(): Double = js.native
    def x(v: Double): this.type = js.native
    @JSName("x")
    var x_Original: GetSet[Double, this.type] = js.native
    
    def y(): Double = js.native
    def y(v: Double): this.type = js.native
    @JSName("y")
    var y_Original: GetSet[Double, this.type] = js.native
    
    def zIndex(): Double = js.native
    def zIndex(v: Double): this.type = js.native
    @JSName("zIndex")
    var zIndex_Original: GetSet[Double, this.type] = js.native
  }
  /* static members */
  object Node {
    
    @JSImport("konva/lib/Node", "Node")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _createNode(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def _createNode(obj: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_createNode")(obj.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def create(data: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def create(data: Any, container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(data.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  trait AnimTo
    extends StObject
       with NodeConfig {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var onFinish: js.UndefOr[js.Function] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function] = js.undefined
  }
  object AnimTo {
    
    inline def apply(): AnimTo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimTo]
    }
    
    extension [Self <: AnimTo](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnFinish(value: js.Function): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnUpdate(value: js.Function): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
  
  type Filter = js.ThisFunction1[/* this */ Node[NodeConfig], /* imageData */ ImageData, Unit]
  
  type KonvaEventListener[This, EventType] = js.ThisFunction1[/* this */ This, /* ev */ KonvaEventObject[EventType], Unit]
  
  trait KonvaEventObject[EventType] extends StObject {
    
    var cancelBubble: Boolean
    
    var child: js.UndefOr[Node[NodeConfig]] = js.undefined
    
    var currentTarget: Node[NodeConfig]
    
    var evt: EventType
    
    var target: Shape[ShapeConfig] | Stage
    
    var `type`: String
  }
  object KonvaEventObject {
    
    inline def apply[EventType](
      cancelBubble: Boolean,
      currentTarget: Node[NodeConfig],
      evt: EventType,
      target: Shape[ShapeConfig] | Stage,
      `type`: String
    ): KonvaEventObject[EventType] = {
      val __obj = js.Dynamic.literal(cancelBubble = cancelBubble.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], evt = evt.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KonvaEventObject[EventType]]
    }
    
    extension [Self <: KonvaEventObject[?], EventType](x: Self & KonvaEventObject[EventType]) {
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setChild(value: Node[NodeConfig]): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setCurrentTarget(value: Node[NodeConfig]): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setEvt(value: EventType): Self = StObject.set(x, "evt", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Shape[ShapeConfig] | Stage): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeConfig
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    var dragBoundFunc: js.UndefOr[js.ThisFunction1[/* this */ Node[this.type], /* pos */ Vector2d, Vector2d]] = js.undefined
    
    var dragDistance: js.UndefOr[Double] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var filters: js.UndefOr[js.Array[Filter]] = js.undefined
    
    var globalCompositeOperation: js.UndefOr[globalCompositeOperationType] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var listening: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Vector2d] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var preventDefault: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var rotationDeg: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Vector2d] = js.undefined
    
    var scaleX: js.UndefOr[Double] = js.undefined
    
    var scaleY: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object NodeConfig {
    
    inline def apply(): NodeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeConfig]
    }
    
    extension [Self <: NodeConfig](x: Self) {
      
      inline def setDragBoundFunc(value: js.ThisFunction1[/* this */ Node[NodeConfig], /* pos */ Vector2d, Vector2d]): Self = StObject.set(x, "dragBoundFunc", value.asInstanceOf[js.Any])
      
      inline def setDragBoundFuncUndefined: Self = StObject.set(x, "dragBoundFunc", js.undefined)
      
      inline def setDragDistance(value: Double): Self = StObject.set(x, "dragDistance", value.asInstanceOf[js.Any])
      
      inline def setDragDistanceUndefined: Self = StObject.set(x, "dragDistance", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setFilters(value: js.Array[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setGlobalCompositeOperation(value: globalCompositeOperationType): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
      
      inline def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setListening(value: Boolean): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      inline def setListeningUndefined: Self = StObject.set(x, "listening", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(value: Vector2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationDeg(value: Double): Self = StObject.set(x, "rotationDeg", value.asInstanceOf[js.Any])
      
      inline def setRotationDegUndefined: Self = StObject.set(x, "rotationDeg", js.undefined)
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: Vector2d): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait NodeEventMap
    extends StObject
       with GlobalEventHandlersEventMap
       with /* index */ StringDictionary[Any]
  object NodeEventMap {
    
    inline def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      beforeinput: InputEvent,
      blur: FocusEvent,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      compositionend: CompositionEvent,
      compositionstart: CompositionEvent,
      compositionupdate: CompositionEvent,
      contextmenu: MouseEvent,
      cuechange: Event,
      dblclick: MouseEvent,
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      formdata: FormDataEvent,
      gotpointercapture: PointerEvent,
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      pause: Event,
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent,
      ratechange: Event,
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      slotchange: Event,
      stalled: Event,
      submit: SubmitEvent,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      volumechange: Event,
      waiting: Event,
      webkitanimationend: Event,
      webkitanimationiteration: Event,
      webkitanimationstart: Event,
      webkittransitionend: Event,
      wheel: WheelEvent
    ): NodeEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], beforeinput = beforeinput.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], compositionend = compositionend.asInstanceOf[js.Any], compositionstart = compositionstart.asInstanceOf[js.Any], compositionupdate = compositionupdate.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], formdata = formdata.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], slotchange = slotchange.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], webkitanimationend = webkitanimationend.asInstanceOf[js.Any], webkitanimationiteration = webkitanimationiteration.asInstanceOf[js.Any], webkitanimationstart = webkitanimationstart.asInstanceOf[js.Any], webkittransitionend = webkittransitionend.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeEventMap]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.konva.konvaStrings._empty
    - typingsJapgolly.konva.konvaStrings.`source-over`
    - typingsJapgolly.konva.konvaStrings.`source-in`
    - typingsJapgolly.konva.konvaStrings.`source-out`
    - typingsJapgolly.konva.konvaStrings.`source-atop`
    - typingsJapgolly.konva.konvaStrings.`destination-over`
    - typingsJapgolly.konva.konvaStrings.`destination-in`
    - typingsJapgolly.konva.konvaStrings.`destination-out`
    - typingsJapgolly.konva.konvaStrings.`destination-atop`
    - typingsJapgolly.konva.konvaStrings.lighter
    - typingsJapgolly.konva.konvaStrings.copy
    - typingsJapgolly.konva.konvaStrings.xor
    - typingsJapgolly.konva.konvaStrings.multiply
    - typingsJapgolly.konva.konvaStrings.screen
    - typingsJapgolly.konva.konvaStrings.overlay
    - typingsJapgolly.konva.konvaStrings.darken
    - typingsJapgolly.konva.konvaStrings.lighten
    - typingsJapgolly.konva.konvaStrings.`color-dodge`
    - typingsJapgolly.konva.konvaStrings.`color-burn`
    - typingsJapgolly.konva.konvaStrings.`hard-light`
    - typingsJapgolly.konva.konvaStrings.`soft-light`
    - typingsJapgolly.konva.konvaStrings.difference
    - typingsJapgolly.konva.konvaStrings.exclusion
    - typingsJapgolly.konva.konvaStrings.hue
    - typingsJapgolly.konva.konvaStrings.saturation
    - typingsJapgolly.konva.konvaStrings.color
    - typingsJapgolly.konva.konvaStrings.luminosity
  */
  trait globalCompositeOperationType extends StObject
  object globalCompositeOperationType {
    
    inline def _empty: typingsJapgolly.konva.konvaStrings._empty = "".asInstanceOf[typingsJapgolly.konva.konvaStrings._empty]
    
    inline def color: typingsJapgolly.konva.konvaStrings.color = "color".asInstanceOf[typingsJapgolly.konva.konvaStrings.color]
    
    inline def `color-burn`: typingsJapgolly.konva.konvaStrings.`color-burn` = "color-burn".asInstanceOf[typingsJapgolly.konva.konvaStrings.`color-burn`]
    
    inline def `color-dodge`: typingsJapgolly.konva.konvaStrings.`color-dodge` = "color-dodge".asInstanceOf[typingsJapgolly.konva.konvaStrings.`color-dodge`]
    
    inline def copy: typingsJapgolly.konva.konvaStrings.copy = "copy".asInstanceOf[typingsJapgolly.konva.konvaStrings.copy]
    
    inline def darken: typingsJapgolly.konva.konvaStrings.darken = "darken".asInstanceOf[typingsJapgolly.konva.konvaStrings.darken]
    
    inline def `destination-atop`: typingsJapgolly.konva.konvaStrings.`destination-atop` = "destination-atop".asInstanceOf[typingsJapgolly.konva.konvaStrings.`destination-atop`]
    
    inline def `destination-in`: typingsJapgolly.konva.konvaStrings.`destination-in` = "destination-in".asInstanceOf[typingsJapgolly.konva.konvaStrings.`destination-in`]
    
    inline def `destination-out`: typingsJapgolly.konva.konvaStrings.`destination-out` = "destination-out".asInstanceOf[typingsJapgolly.konva.konvaStrings.`destination-out`]
    
    inline def `destination-over`: typingsJapgolly.konva.konvaStrings.`destination-over` = "destination-over".asInstanceOf[typingsJapgolly.konva.konvaStrings.`destination-over`]
    
    inline def difference: typingsJapgolly.konva.konvaStrings.difference = "difference".asInstanceOf[typingsJapgolly.konva.konvaStrings.difference]
    
    inline def exclusion: typingsJapgolly.konva.konvaStrings.exclusion = "exclusion".asInstanceOf[typingsJapgolly.konva.konvaStrings.exclusion]
    
    inline def `hard-light`: typingsJapgolly.konva.konvaStrings.`hard-light` = "hard-light".asInstanceOf[typingsJapgolly.konva.konvaStrings.`hard-light`]
    
    inline def hue: typingsJapgolly.konva.konvaStrings.hue = "hue".asInstanceOf[typingsJapgolly.konva.konvaStrings.hue]
    
    inline def lighten: typingsJapgolly.konva.konvaStrings.lighten = "lighten".asInstanceOf[typingsJapgolly.konva.konvaStrings.lighten]
    
    inline def lighter: typingsJapgolly.konva.konvaStrings.lighter = "lighter".asInstanceOf[typingsJapgolly.konva.konvaStrings.lighter]
    
    inline def luminosity: typingsJapgolly.konva.konvaStrings.luminosity = "luminosity".asInstanceOf[typingsJapgolly.konva.konvaStrings.luminosity]
    
    inline def multiply: typingsJapgolly.konva.konvaStrings.multiply = "multiply".asInstanceOf[typingsJapgolly.konva.konvaStrings.multiply]
    
    inline def overlay: typingsJapgolly.konva.konvaStrings.overlay = "overlay".asInstanceOf[typingsJapgolly.konva.konvaStrings.overlay]
    
    inline def saturation: typingsJapgolly.konva.konvaStrings.saturation = "saturation".asInstanceOf[typingsJapgolly.konva.konvaStrings.saturation]
    
    inline def screen: typingsJapgolly.konva.konvaStrings.screen = "screen".asInstanceOf[typingsJapgolly.konva.konvaStrings.screen]
    
    inline def `soft-light`: typingsJapgolly.konva.konvaStrings.`soft-light` = "soft-light".asInstanceOf[typingsJapgolly.konva.konvaStrings.`soft-light`]
    
    inline def `source-atop`: typingsJapgolly.konva.konvaStrings.`source-atop` = "source-atop".asInstanceOf[typingsJapgolly.konva.konvaStrings.`source-atop`]
    
    inline def `source-in`: typingsJapgolly.konva.konvaStrings.`source-in` = "source-in".asInstanceOf[typingsJapgolly.konva.konvaStrings.`source-in`]
    
    inline def `source-out`: typingsJapgolly.konva.konvaStrings.`source-out` = "source-out".asInstanceOf[typingsJapgolly.konva.konvaStrings.`source-out`]
    
    inline def `source-over`: typingsJapgolly.konva.konvaStrings.`source-over` = "source-over".asInstanceOf[typingsJapgolly.konva.konvaStrings.`source-over`]
    
    inline def xor: typingsJapgolly.konva.konvaStrings.xor = "xor".asInstanceOf[typingsJapgolly.konva.konvaStrings.xor]
  }
}
