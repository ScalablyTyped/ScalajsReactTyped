package typingsJapgolly.canvasGauges

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvasGauges.CanvasGauges.AnimationRule
import typingsJapgolly.canvasGauges.CanvasGauges.DrawEventCallback
import typingsJapgolly.canvasGauges.CanvasGauges.EndEventCallback
import typingsJapgolly.canvasGauges.CanvasGauges.LinearGaugeOptions
import typingsJapgolly.canvasGauges.CanvasGauges.RadialGaugeOptions
import typingsJapgolly.canvasGauges.CanvasGauges.rules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas-gauges", "Animation")
  @js.native
  open class Animation ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.Animation {
    def this(rule: String) = this()
    def this(rule: AnimationRule) = this()
    def this(rule: String, duration: Double) = this()
    def this(rule: Unit, duration: Double) = this()
    def this(rule: AnimationRule, duration: Double) = this()
    def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
    def this(rule: String, duration: Unit, draw: DrawEventCallback) = this()
    def this(rule: Unit, duration: Double, draw: DrawEventCallback) = this()
    def this(rule: Unit, duration: Unit, draw: DrawEventCallback) = this()
    def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
    def this(rule: AnimationRule, duration: Unit, draw: DrawEventCallback) = this()
    def this(rule: String, duration: Double, draw: Unit, end: EndEventCallback) = this()
    def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: String, duration: Unit, draw: Unit, end: EndEventCallback) = this()
    def this(rule: String, duration: Unit, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: Unit, duration: Double, draw: Unit, end: EndEventCallback) = this()
    def this(rule: Unit, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: Unit, duration: Unit, draw: Unit, end: EndEventCallback) = this()
    def this(rule: Unit, duration: Unit, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: AnimationRule, duration: Double, draw: Unit, end: EndEventCallback) = this()
    def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: AnimationRule, duration: Unit, draw: Unit, end: EndEventCallback) = this()
    def this(rule: AnimationRule, duration: Unit, draw: DrawEventCallback, end: EndEventCallback) = this()
  }
  /* static members */
  object Animation {
    
    @JSImport("canvas-gauges", "Animation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvas-gauges", "Animation.rules")
    @js.native
    def rules: typingsJapgolly.canvasGauges.CanvasGauges.rules = js.native
    inline def rules_=(x: rules): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rules")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("canvas-gauges", "BaseGauge")
  @js.native
  open class BaseGauge protected ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge {
    def this(options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions) = this()
  }
  /* static members */
  object BaseGauge {
    
    @JSImport("canvas-gauges", "BaseGauge")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ensureValue(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureValue")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromElement(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def initialize(`type`: String, options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("canvas-gauges", "BaseGauge.version")
    @js.native
    val version: Double = js.native
  }
  
  @JSImport("canvas-gauges", "DomObserver")
  @js.native
  open class DomObserver protected ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.DomObserver {
    def this(options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
  }
  /* static members */
  object DomObserver {
    
    @JSImport("canvas-gauges", "DomObserver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def domReady(handler: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("domReady")(handler.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def parse(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def toAttributeName(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toAttributeName")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toDashed(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDashed")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("canvas-gauges", "GenericOptions")
  @js.native
  val GenericOptions: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions = js.native
  
  @JSImport("canvas-gauges", "LinearGauge")
  @js.native
  open class LinearGauge protected ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge {
    def this(options: LinearGaugeOptions) = this()
  }
  
  @JSImport("canvas-gauges", "RadialGauge")
  @js.native
  open class RadialGauge protected ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge {
    def this(options: RadialGaugeOptions) = this()
  }
  
  @JSImport("canvas-gauges", "SmartCanvas")
  @js.native
  open class SmartCanvas protected ()
    extends StObject
       with typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLCanvasElement, width: Double) = this()
    def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
    def this(element: HTMLCanvasElement, width: Unit, height: Double) = this()
    
    /* CompleteClass */
    override def commit(): typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas = js.native
    
    /* CompleteClass */
    var context: CanvasRenderingContext2D = js.native
    
    /* CompleteClass */
    var contextClone: CanvasRenderingContext2D = js.native
    
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    /* CompleteClass */
    var drawHeight: Double = js.native
    
    /* CompleteClass */
    var drawWidth: Double = js.native
    
    /* CompleteClass */
    var drawX: Double = js.native
    
    /* CompleteClass */
    var drawY: Double = js.native
    
    /* CompleteClass */
    var element: HTMLCanvasElement = js.native
    
    /* CompleteClass */
    var elementClone: HTMLCanvasElement = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    override def init(): Any = js.native
    
    /* CompleteClass */
    var minSide: Double = js.native
    
    /* CompleteClass */
    override def onRedraw(): Any = js.native
    
    /* CompleteClass */
    var pixelRatio: Double = js.native
    
    /* CompleteClass */
    override def redraw(): typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  /* static members */
  object SmartCanvas {
    
    @JSImport("canvas-gauges", "SmartCanvas")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvas-gauges", "SmartCanvas.collection")
    @js.native
    def collection: js.Array[typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas] = js.native
    inline def collection_=(x: js.Array[typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collection")(x.asInstanceOf[js.Any])
    
    inline def redraw(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("redraw")().asInstanceOf[Any]
  }
}
