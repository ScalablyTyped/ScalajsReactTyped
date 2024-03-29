package typingsJapgolly.reactRange.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRange.libTypesMod.Direction
import typingsJapgolly.reactRange.libTypesMod.IProps
import typingsJapgolly.reactRange.libTypesMod.IRenderMarkParams
import typingsJapgolly.reactRange.libTypesMod.IRenderThumbParams
import typingsJapgolly.reactRange.libTypesMod.IRenderTrackParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Range {
  
  inline def apply(
    allowOverlap: Boolean,
    direction: Direction,
    disabled: Boolean,
    draggableTrack: Boolean,
    max: Double,
    min: Double,
    onChange: js.Array[Double] => Callback,
    renderThumb: IRenderThumbParams => Node,
    renderTrack: IRenderTrackParams => Node,
    rtl: Boolean,
    step: Double,
    values: js.Array[Double]
  ): Builder = {
    val __props = js.Dynamic.literal(allowOverlap = allowOverlap.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggableTrack = draggableTrack.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: js.Array[Double]) => onChange(t0).runNow()), renderThumb = js.Any.fromFunction1(renderThumb), renderTrack = js.Any.fromFunction1(renderTrack), rtl = rtl.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProps]))
  }
  
  @JSImport("react-range", "Range")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRange.mod.Range] {
    
    inline def onFinalChange(value: /* values */ js.Array[Double] => Callback): this.type = set("onFinalChange", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
    
    inline def renderMark(value: /* params */ IRenderMarkParams => Node): this.type = set("renderMark", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
