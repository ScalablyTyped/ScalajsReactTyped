package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetInts.`12`
import typingsJapgolly.grommet.grommetInts.`24`
import typingsJapgolly.grommet.grommetStrings.`type`
import typingsJapgolly.grommet.grommetStrings.analog
import typingsJapgolly.grommet.grommetStrings.backward
import typingsJapgolly.grommet.grommetStrings.digital
import typingsJapgolly.grommet.grommetStrings.forward
import typingsJapgolly.grommet.grommetStrings.hours
import typingsJapgolly.grommet.grommetStrings.huge
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.minutes
import typingsJapgolly.grommet.grommetStrings.onChange
import typingsJapgolly.grommet.grommetStrings.seconds
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsClockMod {
  
  @JSImport("grommet/es6/components/Clock", "Clock")
  @js.native
  val Clock: FC[ClockExtendedProps] = js.native
  
  type ClockExtendedProps = ((Omit[SVGProps[SVGSVGElement], onChange | `type`]) & ClockProps) | ((Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onChange]) & ClockProps)
  
  trait ClockProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hourLimit: js.UndefOr[
        `12` | `24` | typingsJapgolly.grommet.grommetStrings.`12` | typingsJapgolly.grommet.grommetStrings.`24`
      ] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ String, Unit]] = js.undefined
    
    var precision: js.UndefOr[hours | minutes | seconds] = js.undefined
    
    var run: js.UndefOr[Boolean | backward | forward] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | huge | String] = js.undefined
    
    var time: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[analog | digital] = js.undefined
  }
  object ClockProps {
    
    inline def apply(): ClockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClockProps]
    }
    
    extension [Self <: ClockProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHourLimit(
        value: `12` | `24` | typingsJapgolly.grommet.grommetStrings.`12` | typingsJapgolly.grommet.grommetStrings.`24`
      ): Self = StObject.set(x, "hourLimit", value.asInstanceOf[js.Any])
      
      inline def setHourLimitUndefined: Self = StObject.set(x, "hourLimit", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnChange(value: /* time */ String => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* time */ String) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrecision(value: hours | minutes | seconds): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRun(value: Boolean | backward | forward): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | huge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: analog | digital): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
