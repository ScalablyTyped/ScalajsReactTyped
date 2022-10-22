package typingsJapgolly.reactCountdownCircleTimer

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCountdownCircleTimer.anon.ElapsedTime
import typingsJapgolly.reactCountdownCircleTimer.anon.`0ColorHex1ColorHexArrayCo`
import typingsJapgolly.reactCountdownCircleTimer.anon.`0number1numberArraynumber`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-countdown-circle-timer/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CountdownCircleTimer {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-countdown-circle-timer/lib", "CountdownCircleTimer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-countdown-circle-timer/lib", "CountdownCircleTimer.displayName")
    @js.native
    def displayName: typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.CountdownCircleTimer = js.native
    inline def displayName_=(x: typingsJapgolly.reactCountdownCircleTimer.reactCountdownCircleTimerStrings.CountdownCircleTimer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def useCountdown(props: Props): ElapsedTime = ^.asInstanceOf[js.Dynamic].applyDynamic("useCountdown")(props.asInstanceOf[js.Any]).asInstanceOf[ElapsedTime]
  
  type ColorFormat = ColorHex | ColorRGB | ColorRGBA | ColorURL
  
  type ColorHex = /* template literal string: #${string} */ String
  
  type ColorRGB = /* template literal string: rgb(${string}) */ String
  
  type ColorRGBA = /* template literal string: rgba(${string}) */ String
  
  type ColorURL = /* template literal string: url(#${string}) */ String
  
  trait MultipleColors extends StObject {
    
    /** Array of colors in HEX format. At least 2 colors should be provided */
    var colors: `0ColorHex1ColorHexArrayCo`
    
    /** Indicates the time when a color should switch to the next color. The first item should be the duration and the last one should be 0/goal. Example with duration of 10 seconds: [10, 6, 3, 0]  */
    var colorsTime: `0number1numberArraynumber`
  }
  object MultipleColors {
    
    inline def apply(colors: `0ColorHex1ColorHexArrayCo`, colorsTime: `0number1numberArraynumber`): MultipleColors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsTime = colorsTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleColors]
    }
    
    extension [Self <: MultipleColors](x: Self) {
      
      inline def setColors(value: `0ColorHex1ColorHexArrayCo`): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsTime(value: `0number1numberArraynumber`): Self = StObject.set(x, "colorsTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnComplete extends StObject {
    
    /** Delay in seconds before looping again. Default: 0 */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** Set new initial remaining when starting over the animation */
    var newInitialRemainingTime: js.UndefOr[Double] = js.undefined
    
    /** Indicates if the loop should start over. Default: false */
    var shouldRepeat: js.UndefOr[Boolean] = js.undefined
  }
  object OnComplete {
    
    inline def apply(): OnComplete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnComplete]
    }
    
    extension [Self <: OnComplete](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setNewInitialRemainingTime(value: Double): Self = StObject.set(x, "newInitialRemainingTime", value.asInstanceOf[js.Any])
      
      inline def setNewInitialRemainingTimeUndefined: Self = StObject.set(x, "newInitialRemainingTime", js.undefined)
      
      inline def setShouldRepeat(value: Boolean): Self = StObject.set(x, "shouldRepeat", value.asInstanceOf[js.Any])
      
      inline def setShouldRepeatUndefined: Self = StObject.set(x, "shouldRepeat", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactCountdownCircleTimer.anon.SingleColordurationnumber
    - typingsJapgolly.reactCountdownCircleTimer.anon.MultipleColorsdurationnum
  */
  trait Props extends StObject
  object Props {
    
    inline def MultipleColorsdurationnum(colors: `0ColorHex1ColorHexArrayCo`, colorsTime: `0number1numberArraynumber`, duration: Double): typingsJapgolly.reactCountdownCircleTimer.anon.MultipleColorsdurationnum = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsTime = colorsTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactCountdownCircleTimer.anon.MultipleColorsdurationnum]
    }
    
    inline def SingleColordurationnumber(colors: ColorFormat, duration: Double): typingsJapgolly.reactCountdownCircleTimer.anon.SingleColordurationnumber = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.reactCountdownCircleTimer.anon.SingleColordurationnumber]
    }
  }
  
  trait SingleColor extends StObject {
    
    /** Single valid color or url to a gradient */
    var colors: ColorFormat
    
    /** Colors time works only when the colors prop is an array of colors*/
    var colorsTime: js.UndefOr[scala.Nothing] = js.undefined
  }
  object SingleColor {
    
    inline def apply(colors: ColorFormat): SingleColor = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleColor]
    }
    
    extension [Self <: SingleColor](x: Self) {
      
      inline def setColors(value: ColorFormat): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeProps extends StObject {
    
    var color: ColorFormat
    
    var elapsedTime: Double
    
    var remainingTime: Double
  }
  object TimeProps {
    
    inline def apply(color: ColorFormat, elapsedTime: Double, remainingTime: Double): TimeProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], remainingTime = remainingTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeProps]
    }
    
    extension [Self <: TimeProps](x: Self) {
      
      inline def setColor(value: ColorFormat): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setRemainingTime(value: Double): Self = StObject.set(x, "remainingTime", value.asInstanceOf[js.Any])
    }
  }
}
