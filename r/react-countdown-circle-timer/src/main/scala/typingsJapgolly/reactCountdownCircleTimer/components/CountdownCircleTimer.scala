package typingsJapgolly.reactCountdownCircleTimer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCountdownCircleTimer.anon.`0ColorHex1ColorHexArrayCo`
import typingsJapgolly.reactCountdownCircleTimer.anon.`0number1numberArraynumber`
import typingsJapgolly.reactCountdownCircleTimer.libMod.ColorFormat
import typingsJapgolly.reactCountdownCircleTimer.libMod.OnComplete
import typingsJapgolly.reactCountdownCircleTimer.libMod.TimeProps
import typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.butt
import typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.clockwise
import typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.counterclockwise
import typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.round
import typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountdownCircleTimer {
  
  object MultipleColorsdurationnum {
    
    inline def apply(colors: `0ColorHex1ColorHexArrayCo`, colorsTime: `0number1numberArraynumber`, duration: Double): Builder = {
      val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsTime = colorsTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactCountdownCircleTimer.anon.MultipleColorsdurationnum]))
    }
    
    @JSImport("react-countdown-circle-timer/lib", "CountdownCircleTimer")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def children(value: /* props */ TimeProps => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def initialRemainingTime(value: Double): this.type = set("initialRemainingTime", value.asInstanceOf[js.Any])
      
      inline def isPlaying(value: Boolean): this.type = set("isPlaying", value.asInstanceOf[js.Any])
      
      inline def isSmoothColorTransition(value: Boolean): this.type = set("isSmoothColorTransition", value.asInstanceOf[js.Any])
      
      inline def onComplete(value: /* totalElapsedTime */ Double => OnComplete | Unit): this.type = set("onComplete", js.Any.fromFunction1(value))
      
      inline def onUpdate(value: /* remainingTime */ Double => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* remainingTime */ Double) => value(t0).runNow()))
      
      inline def rotation(value: clockwise | counterclockwise): this.type = set("rotation", value.asInstanceOf[js.Any])
      
      inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def strokeLinecap(value: round | square | butt): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
      
      inline def trailColor(value: ColorFormat): this.type = set("trailColor", value.asInstanceOf[js.Any])
      
      inline def trailStrokeWidth(value: Double): this.type = set("trailStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def updateInterval(value: Double): this.type = set("updateInterval", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactCountdownCircleTimer.anon.MultipleColorsdurationnum): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SingleColordurationnumber {
    
    inline def apply(colors: ColorFormat, duration: Double): Builder = {
      val __props = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactCountdownCircleTimer.anon.SingleColordurationnumber]))
    }
    
    @JSImport("react-countdown-circle-timer/lib", "CountdownCircleTimer")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def children(value: /* props */ TimeProps => Node): this.type = set("children", js.Any.fromFunction1(value))
      
      inline def initialRemainingTime(value: Double): this.type = set("initialRemainingTime", value.asInstanceOf[js.Any])
      
      inline def isPlaying(value: Boolean): this.type = set("isPlaying", value.asInstanceOf[js.Any])
      
      inline def isSmoothColorTransition(value: Boolean): this.type = set("isSmoothColorTransition", value.asInstanceOf[js.Any])
      
      inline def onComplete(value: /* totalElapsedTime */ Double => OnComplete | Unit): this.type = set("onComplete", js.Any.fromFunction1(value))
      
      inline def onUpdate(value: /* remainingTime */ Double => Callback): this.type = set("onUpdate", js.Any.fromFunction1((t0: /* remainingTime */ Double) => value(t0).runNow()))
      
      inline def rotation(value: clockwise | counterclockwise): this.type = set("rotation", value.asInstanceOf[js.Any])
      
      inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
      
      inline def strokeLinecap(value: round | square | butt): this.type = set("strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
      
      inline def trailColor(value: ColorFormat): this.type = set("trailColor", value.asInstanceOf[js.Any])
      
      inline def trailStrokeWidth(value: Double): this.type = set("trailStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def updateInterval(value: Double): this.type = set("updateInterval", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactCountdownCircleTimer.anon.SingleColordurationnumber): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
