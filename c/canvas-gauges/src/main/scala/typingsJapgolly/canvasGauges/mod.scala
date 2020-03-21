package typingsJapgolly.canvasGauges

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.canvasGauges.CanvasGauges.AnimationRule
import typingsJapgolly.canvasGauges.CanvasGauges.DrawEventCallback
import typingsJapgolly.canvasGauges.CanvasGauges.EndEventCallback
import typingsJapgolly.canvasGauges.CanvasGauges.LinearGaugeOptions
import typingsJapgolly.canvasGauges.CanvasGauges.RadialGaugeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("canvas-gauges", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Animation ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.Animation {
    def this(rule: String) = this()
    def this(rule: AnimationRule) = this()
    def this(rule: String, duration: Double) = this()
    def this(rule: AnimationRule, duration: Double) = this()
    def this(rule: String, duration: Double, draw: DrawEventCallback) = this()
    def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback) = this()
    def this(rule: String, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
    def this(rule: AnimationRule, duration: Double, draw: DrawEventCallback, end: EndEventCallback) = this()
  }
  
  @js.native
  abstract class BaseGauge protected ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge {
    def this(options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions) = this()
  }
  
  @js.native
  class DomObserver protected ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.DomObserver {
    def this(options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions, element: String, `type`: String) = this()
  }
  
  @js.native
  class LinearGauge protected ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge {
    def this(options: LinearGaugeOptions) = this()
  }
  
  @js.native
  class RadialGauge protected ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge {
    def this(options: RadialGaugeOptions) = this()
  }
  
  @js.native
  class SmartCanvas protected ()
    extends typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas {
    def this(element: HTMLCanvasElement) = this()
    def this(element: HTMLCanvasElement, width: Double) = this()
    def this(element: HTMLCanvasElement, width: Double, height: Double) = this()
  }
  
  val GenericOptions: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions = js.native
  /* static members */
  @js.native
  object Animation extends js.Object {
    var rules: typingsJapgolly.canvasGauges.CanvasGauges.rules = js.native
  }
  
  /* static members */
  @js.native
  object BaseGauge extends js.Object {
    val version: Double = js.native
    def ensureValue(value: Double): Double = js.native
    def fromElement(element: HTMLElement): js.Any = js.native
    def initialize(`type`: String, options: typingsJapgolly.canvasGauges.CanvasGauges.GenericOptions): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DomObserver extends js.Object {
    def domReady(handler: js.Function): js.Any = js.native
    def parse(value: js.Any): js.Any = js.native
    def toAttributeName(str: String): String = js.native
    def toDashed(camelCase: String): String = js.native
  }
  
  /* static members */
  @js.native
  object SmartCanvas extends js.Object {
    var collection: js.Array[typingsJapgolly.canvasGauges.CanvasGauges.SmartCanvas] = js.native
    def redraw(): js.Any = js.native
  }
  
}

