package typingsJapgolly.antvGBase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvGBase.antvGBaseStrings.`small-caps`
import typingsJapgolly.antvGBase.antvGBaseStrings.a_
import typingsJapgolly.antvGBase.antvGBaseStrings.alphabetic
import typingsJapgolly.antvGBase.antvGBaseStrings.bevel
import typingsJapgolly.antvGBase.antvGBaseStrings.bold
import typingsJapgolly.antvGBase.antvGBaseStrings.bolder
import typingsJapgolly.antvGBase.antvGBaseStrings.bottom
import typingsJapgolly.antvGBase.antvGBaseStrings.butt
import typingsJapgolly.antvGBase.antvGBaseStrings.c_
import typingsJapgolly.antvGBase.antvGBaseStrings.center
import typingsJapgolly.antvGBase.antvGBaseStrings.end
import typingsJapgolly.antvGBase.antvGBaseStrings.h_
import typingsJapgolly.antvGBase.antvGBaseStrings.hanging
import typingsJapgolly.antvGBase.antvGBaseStrings.ideographic
import typingsJapgolly.antvGBase.antvGBaseStrings.italic
import typingsJapgolly.antvGBase.antvGBaseStrings.l_
import typingsJapgolly.antvGBase.antvGBaseStrings.left
import typingsJapgolly.antvGBase.antvGBaseStrings.lighter
import typingsJapgolly.antvGBase.antvGBaseStrings.m_
import typingsJapgolly.antvGBase.antvGBaseStrings.middle
import typingsJapgolly.antvGBase.antvGBaseStrings.miter
import typingsJapgolly.antvGBase.antvGBaseStrings.normal
import typingsJapgolly.antvGBase.antvGBaseStrings.o_
import typingsJapgolly.antvGBase.antvGBaseStrings.oblique
import typingsJapgolly.antvGBase.antvGBaseStrings.q_
import typingsJapgolly.antvGBase.antvGBaseStrings.r_
import typingsJapgolly.antvGBase.antvGBaseStrings.right
import typingsJapgolly.antvGBase.antvGBaseStrings.round
import typingsJapgolly.antvGBase.antvGBaseStrings.s_
import typingsJapgolly.antvGBase.antvGBaseStrings.square
import typingsJapgolly.antvGBase.antvGBaseStrings.start
import typingsJapgolly.antvGBase.antvGBaseStrings.t_
import typingsJapgolly.antvGBase.antvGBaseStrings.top
import typingsJapgolly.antvGBase.antvGBaseStrings.u_
import typingsJapgolly.antvGBase.antvGBaseStrings.v_
import typingsJapgolly.antvGBase.antvGBaseStrings.z_
import typingsJapgolly.antvGBase.libInterfacesMod.ICtor
import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type A = js.Tuple8[
    a_ | typingsJapgolly.antvGBase.antvGBaseStrings.A, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  trait AnimateCfg extends StObject {
    
    /**
      * 动画执行完时的回调函数
      * @type {function}}
      */
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 动画执行的延迟时间
      * @type {function}}
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * 动画执行时间
      * @type {number}
      */
    var duration: Double
    
    /**
      * 动画缓动效果
      * @type {string}}
      */
    var easing: js.UndefOr[String] = js.undefined
    
    /**
      * 动画暂停时的回调函数
      * @type {function}}
      */
    var pauseCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 是否重复执行动画
      * @type {boolean}}
      */
    var repeat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 动画恢复(重新唤醒)时的回调函数
      * @type {function}}
      */
    var resumeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object AnimateCfg {
    
    inline def apply(duration: Double): AnimateCfg = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateCfg]
    }
    
    extension [Self <: AnimateCfg](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setPauseCallback(value: Callback): Self = StObject.set(x, "pauseCallback", value.toJsFn)
      
      inline def setPauseCallbackUndefined: Self = StObject.set(x, "pauseCallback", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setResumeCallback(value: Callback): Self = StObject.set(x, "resumeCallback", value.toJsFn)
      
      inline def setResumeCallbackUndefined: Self = StObject.set(x, "resumeCallback", js.undefined)
    }
  }
  
  trait Animation
    extends StObject
       with AnimateCfg {
    
    var _pauseTime: js.UndefOr[Double] = js.undefined
    
    var _paused: js.UndefOr[Boolean] = js.undefined
    
    var fromAttrs: StringDictionary[Any]
    
    var id: String
    
    var onFrame: js.UndefOr[OnFrame] = js.undefined
    
    var pathFormatted: Boolean
    
    var startTime: Double
    
    var toAttrs: StringDictionary[Any]
  }
  object Animation {
    
    inline def apply(
      duration: Double,
      fromAttrs: StringDictionary[Any],
      id: String,
      pathFormatted: Boolean,
      startTime: Double,
      toAttrs: StringDictionary[Any]
    ): Animation = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], fromAttrs = fromAttrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pathFormatted = pathFormatted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toAttrs = toAttrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setFromAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "fromAttrs", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnFrame(value: /* ratio */ Double => ElementAttrs): Self = StObject.set(x, "onFrame", js.Any.fromFunction1(value))
      
      inline def setOnFrameUndefined: Self = StObject.set(x, "onFrame", js.undefined)
      
      inline def setPathFormatted(value: Boolean): Self = StObject.set(x, "pathFormatted", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setToAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "toAttrs", value.asInstanceOf[js.Any])
      
      inline def set_pauseTime(value: Double): Self = StObject.set(x, "_pauseTime", value.asInstanceOf[js.Any])
      
      inline def set_pauseTimeUndefined: Self = StObject.set(x, "_pauseTime", js.undefined)
      
      inline def set_paused(value: Boolean): Self = StObject.set(x, "_paused", value.asInstanceOf[js.Any])
      
      inline def set_pausedUndefined: Self = StObject.set(x, "_paused", js.undefined)
    }
  }
  
  trait BBox extends StObject {
    
    var height: Double
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object BBox {
    
    inline def apply(
      height: Double,
      maxX: Double,
      maxY: Double,
      minX: Double,
      minY: Double,
      width: Double,
      x: Double,
      y: Double
    ): BBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    extension [Self <: BBox](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type C = js.Tuple7[
    c_ | typingsJapgolly.antvGBase.antvGBaseStrings.C, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  trait CanvasCfg
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * 是否可监听
      * @type {boolean}
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 容器
      * @type {string|HTMLElement}
      */
    var container: String | HTMLElement
    
    /**
      * 画布的 cursor 样式
      * @type {Cursor}
      */
    var cursor: js.UndefOr[Cursor] = js.undefined
    
    /**
      * 画布高度
      * @type {number}
      */
    var height: Double
    
    /**
      * 只读属性，渲染引擎
      * @type {string}
      */
    var renderer: js.UndefOr[Renderer] = js.undefined
    
    /**
      * 画布宽度
      * @type {number}
      */
    var width: Double
  }
  object CanvasCfg {
    
    inline def apply(container: String | HTMLElement, height: Double, width: Double): CanvasCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasCfg]
    }
    
    extension [Self <: CanvasCfg](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGBase.antvGBaseStrings.changeSize
    - typingsJapgolly.antvGBase.antvGBaseStrings.add
    - typingsJapgolly.antvGBase.antvGBaseStrings.sort
    - typingsJapgolly.antvGBase.antvGBaseStrings.clear
    - typingsJapgolly.antvGBase.antvGBaseStrings.attr
    - typingsJapgolly.antvGBase.antvGBaseStrings.show
    - typingsJapgolly.antvGBase.antvGBaseStrings.hide
    - typingsJapgolly.antvGBase.antvGBaseStrings.zIndex
    - typingsJapgolly.antvGBase.antvGBaseStrings.remove
    - typingsJapgolly.antvGBase.antvGBaseStrings.matrix
    - typingsJapgolly.antvGBase.antvGBaseStrings.clip
  */
  trait ChangeType extends StObject
  object ChangeType {
    
    inline def add: typingsJapgolly.antvGBase.antvGBaseStrings.add = "add".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.add]
    
    inline def attr: typingsJapgolly.antvGBase.antvGBaseStrings.attr = "attr".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.attr]
    
    inline def changeSize: typingsJapgolly.antvGBase.antvGBaseStrings.changeSize = "changeSize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.changeSize]
    
    inline def clear: typingsJapgolly.antvGBase.antvGBaseStrings.clear = "clear".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.clear]
    
    inline def clip: typingsJapgolly.antvGBase.antvGBaseStrings.clip = "clip".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.clip]
    
    inline def hide: typingsJapgolly.antvGBase.antvGBaseStrings.hide = "hide".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.hide]
    
    inline def matrix: typingsJapgolly.antvGBase.antvGBaseStrings.matrix = "matrix".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.matrix]
    
    inline def remove: typingsJapgolly.antvGBase.antvGBaseStrings.remove = "remove".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.remove]
    
    inline def show: typingsJapgolly.antvGBase.antvGBaseStrings.show = "show".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.show]
    
    inline def sort: typingsJapgolly.antvGBase.antvGBaseStrings.sort = "sort".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.sort]
    
    inline def zIndex: typingsJapgolly.antvGBase.antvGBaseStrings.zIndex = "zIndex".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.zIndex]
  }
  
  trait ClipCfg extends StObject {
    
    /**
      * 图形的属性
      * @type {ShapeAttrs}
      */
    var attrs: ShapeAttrs
    
    /**
      * 作为 clip 的图形
      * @type {string}
      */
    var `type`: String
  }
  object ClipCfg {
    
    inline def apply(attrs: ShapeAttrs, `type`: String): ClipCfg = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClipCfg]
    }
    
    extension [Self <: ClipCfg](x: Self) {
      
      inline def setAttrs(value: ShapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ColorType = String | Null
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGBase.antvGBaseStrings.auto
    - typingsJapgolly.antvGBase.antvGBaseStrings.default
    - typingsJapgolly.antvGBase.antvGBaseStrings.none
    - typingsJapgolly.antvGBase.antvGBaseStrings.`context-menu`
    - typingsJapgolly.antvGBase.antvGBaseStrings.help
    - typingsJapgolly.antvGBase.antvGBaseStrings.pointer
    - typingsJapgolly.antvGBase.antvGBaseStrings.progress
    - typingsJapgolly.antvGBase.antvGBaseStrings.wait
    - typingsJapgolly.antvGBase.antvGBaseStrings.cell
    - typingsJapgolly.antvGBase.antvGBaseStrings.crosshair
    - typingsJapgolly.antvGBase.antvGBaseStrings.text
    - typingsJapgolly.antvGBase.antvGBaseStrings.`vertical-text`
    - typingsJapgolly.antvGBase.antvGBaseStrings.alias
    - typingsJapgolly.antvGBase.antvGBaseStrings.copy
    - typingsJapgolly.antvGBase.antvGBaseStrings.move
    - typingsJapgolly.antvGBase.antvGBaseStrings.`no-drop`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`not-allowed`
    - typingsJapgolly.antvGBase.antvGBaseStrings.grab
    - typingsJapgolly.antvGBase.antvGBaseStrings.grabbing
    - typingsJapgolly.antvGBase.antvGBaseStrings.`all-scroll`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`col-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`row-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`n-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`e-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`s-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`w-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`ne-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`nw-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`se-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`sw-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`ew-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`ns-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`nesw-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`nwse-resize`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-in`
    - typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-out`
  */
  trait Cursor extends StObject
  object Cursor {
    
    inline def default: typingsJapgolly.antvGBase.antvGBaseStrings.default = "default".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.default]
    
    inline def alias: typingsJapgolly.antvGBase.antvGBaseStrings.alias = "alias".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.alias]
    
    inline def `all-scroll`: typingsJapgolly.antvGBase.antvGBaseStrings.`all-scroll` = "all-scroll".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`all-scroll`]
    
    inline def auto: typingsJapgolly.antvGBase.antvGBaseStrings.auto = "auto".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.auto]
    
    inline def cell: typingsJapgolly.antvGBase.antvGBaseStrings.cell = "cell".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.cell]
    
    inline def `col-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`col-resize` = "col-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`col-resize`]
    
    inline def `context-menu`: typingsJapgolly.antvGBase.antvGBaseStrings.`context-menu` = "context-menu".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`context-menu`]
    
    inline def copy: typingsJapgolly.antvGBase.antvGBaseStrings.copy = "copy".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.copy]
    
    inline def crosshair: typingsJapgolly.antvGBase.antvGBaseStrings.crosshair = "crosshair".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.crosshair]
    
    inline def `e-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`e-resize` = "e-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`e-resize`]
    
    inline def `ew-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`ew-resize` = "ew-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`ew-resize`]
    
    inline def grab: typingsJapgolly.antvGBase.antvGBaseStrings.grab = "grab".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.grab]
    
    inline def grabbing: typingsJapgolly.antvGBase.antvGBaseStrings.grabbing = "grabbing".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.grabbing]
    
    inline def help: typingsJapgolly.antvGBase.antvGBaseStrings.help = "help".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.help]
    
    inline def move: typingsJapgolly.antvGBase.antvGBaseStrings.move = "move".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.move]
    
    inline def `n-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`n-resize` = "n-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`n-resize`]
    
    inline def `ne-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`ne-resize` = "ne-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`ne-resize`]
    
    inline def `nesw-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`nesw-resize` = "nesw-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`nesw-resize`]
    
    inline def `no-drop`: typingsJapgolly.antvGBase.antvGBaseStrings.`no-drop` = "no-drop".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`no-drop`]
    
    inline def none: typingsJapgolly.antvGBase.antvGBaseStrings.none = "none".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.none]
    
    inline def `not-allowed`: typingsJapgolly.antvGBase.antvGBaseStrings.`not-allowed` = "not-allowed".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`not-allowed`]
    
    inline def `ns-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`ns-resize` = "ns-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`ns-resize`]
    
    inline def `nw-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`nw-resize` = "nw-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`nw-resize`]
    
    inline def `nwse-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`nwse-resize` = "nwse-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`nwse-resize`]
    
    inline def pointer: typingsJapgolly.antvGBase.antvGBaseStrings.pointer = "pointer".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.pointer]
    
    inline def progress: typingsJapgolly.antvGBase.antvGBaseStrings.progress = "progress".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.progress]
    
    inline def `row-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`row-resize` = "row-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`row-resize`]
    
    inline def `s-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`s-resize` = "s-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`s-resize`]
    
    inline def `se-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`se-resize` = "se-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`se-resize`]
    
    inline def `sw-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`sw-resize` = "sw-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`sw-resize`]
    
    inline def text: typingsJapgolly.antvGBase.antvGBaseStrings.text = "text".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.text]
    
    inline def `vertical-text`: typingsJapgolly.antvGBase.antvGBaseStrings.`vertical-text` = "vertical-text".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`vertical-text`]
    
    inline def `w-resize`: typingsJapgolly.antvGBase.antvGBaseStrings.`w-resize` = "w-resize".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`w-resize`]
    
    inline def `zoom-in`: typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-in` = "zoom-in".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-in`]
    
    inline def `zoom-out`: typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-out` = "zoom-out".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.`zoom-out`]
  }
  
  type ElementAttrs = StringDictionary[Any]
  
  trait ElementCfg extends StObject {
    
    /**
      * 是否可以拾取
      * @type {Boolean}
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 元素 id,可以为空
      * @type {String}
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * 是否可见
      * @type {Boolean}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 层次索引，决定绘制的先后顺序
      * @type {Number}
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ElementCfg {
    
    inline def apply(): ElementCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementCfg]
    }
    
    extension [Self <: ElementCfg](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type ElementFilterFn = js.Function1[/* IElement */ Any, Boolean]
  
  type GroupCfg = StringDictionary[Any]
  
  type H = js.Tuple2[h_ | typingsJapgolly.antvGBase.antvGBaseStrings.H, Double]
  
  type L = js.Tuple3[l_ | typingsJapgolly.antvGBase.antvGBaseStrings.L, Double, Double]
  
  type LooseObject = StringDictionary[Any]
  
  type M = js.Tuple3[m_ | typingsJapgolly.antvGBase.antvGBaseStrings.M, Double, Double]
  
  type O = js.Tuple3[o_ | typingsJapgolly.antvGBase.antvGBaseStrings.O, Double, Double]
  
  type OnFrame = js.Function1[/* ratio */ Double, ElementAttrs]
  
  type PathCommand = A | C | O | H | L | M | R | Q | S | T | V | U | Z
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Q = js.Tuple5[q_ | typingsJapgolly.antvGBase.antvGBaseStrings.Q, Double, Double, Double, Double]
  
  type R = js.Tuple5[r_ | typingsJapgolly.antvGBase.antvGBaseStrings.R, Double, Double, Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGBase.antvGBaseStrings.canvas
    - typingsJapgolly.antvGBase.antvGBaseStrings.svg
  */
  trait Renderer extends StObject
  object Renderer {
    
    inline def canvas: typingsJapgolly.antvGBase.antvGBaseStrings.canvas = "canvas".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.canvas]
    
    inline def svg: typingsJapgolly.antvGBase.antvGBaseStrings.svg = "svg".asInstanceOf[typingsJapgolly.antvGBase.antvGBaseStrings.svg]
  }
  
  type S = js.Tuple8[
    s_ | typingsJapgolly.antvGBase.antvGBaseStrings.S, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double, 
    Double
  ]
  
  trait ShapeAttrs
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** 填充颜色 */
    var fill: js.UndefOr[ColorType] = js.undefined
    
    /** 填充透明度 */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /** 文本字体 */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** 文本字体大小 */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /** 字体样式 */
    var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
    
    /** 字体变体 */
    var fontVariant: js.UndefOr[normal | `small-caps` | String] = js.undefined
    
    /** 文本粗细 */
    var fontWeight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.undefined
    
    /** 高度 */
    var height: js.UndefOr[Double] = js.undefined
    
    /** 指定如何绘制每一条线段末端 */
    var lineCap: js.UndefOr[butt | round | square] = js.undefined
    
    /**
      * 设置线的虚线样式，可以指定一个数组。一组描述交替绘制线段和间距（坐标空间单位）长度的数字。 如果数组元素的数量是奇数， 数组的元素会被复制并重复。例如， [5, 15, 25] 会变成 [5, 15, 25, 5, 15, 25]。这个属性取决于浏览器是否支持 setLineDash() 函数。
      */
    var lineDash: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    /** 文本行高 */
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    /** 用来设置2个长度不为0的相连部分（线段，圆弧，曲线）如何连接在一起的属性（长度为0的变形部分，其指定的末端和控制点在同一位置，会被忽略） */
    var lineJoin: js.UndefOr[bevel | round | miter] = js.undefined
    
    /** 线宽 */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** 整体透明度 */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Path 路径 */
    var path: js.UndefOr[String | js.Array[js.Object]] = js.undefined
    
    /** 图形坐标点 */
    var points: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    /** 圆半径 */
    var r: js.UndefOr[Double] = js.undefined
    
    /** 阴影模糊效果程度 */
    var shadowBlur: js.UndefOr[Double] = js.undefined
    
    /** 阴影颜色 */
    var shadowColor: js.UndefOr[ColorType] = js.undefined
    
    /** 阴影 x 方向偏移量 */
    var shadowOffsetX: js.UndefOr[Double] = js.undefined
    
    /** 阴影 y 方向偏移量 */
    var shadowOffsetY: js.UndefOr[Double] = js.undefined
    
    /** 描边颜色 */
    var stroke: js.UndefOr[ColorType] = js.undefined
    
    /** 描边透明度 */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
    
    /** 设置文本内容的当前对齐方式 */
    var textAlign: js.UndefOr[start | center | end | left | right] = js.undefined
    
    /** 设置在绘制文本时使用的当前文本基线 */
    var textBaseline: js.UndefOr[top | hanging | middle | alphabetic | ideographic | bottom] = js.undefined
    
    /** 宽度 */
    var width: js.UndefOr[Double] = js.undefined
    
    /** x 坐标 */
    var x: js.UndefOr[Double] = js.undefined
    
    /** y 坐标 */
    var y: js.UndefOr[Double] = js.undefined
  }
  object ShapeAttrs {
    
    inline def apply(): ShapeAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShapeAttrs]
    }
    
    extension [Self <: ShapeAttrs](x: Self) {
      
      inline def setFill(value: ColorType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillNull: Self = StObject.set(x, "fill", null)
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: normal | `small-caps` | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: normal | bold | bolder | lighter | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLineCap(value: butt | round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      inline def setLineDashNull: Self = StObject.set(x, "lineDash", null)
      
      inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineJoin(value: bevel | round | miter): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPath(value: String | js.Array[js.Object]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: js.Object*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPoints(value: js.Array[js.Object]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: js.Object*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      inline def setShadowColor(value: ColorType): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowColorNull: Self = StObject.set(x, "shadowColor", null)
      
      inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      inline def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      inline def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      inline def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      inline def setStroke(value: ColorType): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeNull: Self = StObject.set(x, "stroke", null)
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setTextAlign(value: start | center | end | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextBaseline(value: top | hanging | middle | alphabetic | ideographic | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      inline def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type ShapeBase = StringDictionary[ICtor[IShape]]
  
  trait ShapeCfg
    extends StObject
       with ElementCfg
       with /* key */ StringDictionary[Any] {
    
    /**
      * 图形的属性
      * @type {ShapeAttrs}
      */
    var attrs: ShapeAttrs
  }
  object ShapeCfg {
    
    inline def apply(attrs: ShapeAttrs): ShapeCfg = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShapeCfg]
    }
    
    extension [Self <: ShapeCfg](x: Self) {
      
      inline def setAttrs(value: ShapeAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleBBox extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object SimpleBBox {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): SimpleBBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleBBox]
    }
    
    extension [Self <: SimpleBBox](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type T = js.Tuple3[t_ | typingsJapgolly.antvGBase.antvGBaseStrings.T, Double, Double]
  
  type U = js.Tuple4[u_ | typingsJapgolly.antvGBase.antvGBaseStrings.U, Double, Double, Double]
  
  type V = js.Tuple2[v_ | typingsJapgolly.antvGBase.antvGBaseStrings.V, Double]
  
  type Z = js.Array[z_ | typingsJapgolly.antvGBase.antvGBaseStrings.Z]
}
