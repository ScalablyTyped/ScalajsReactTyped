package typingsJapgolly.fundamentalReact

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.anon.Hour
import typingsJapgolly.fundamentalReact.anon.MeridiemAM
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimeTimeMod {
  
  @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TimeProps, js.Object, Any]
  object default {
    
    @JSImport("fundamental-react/lib/Time/Time", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("fundamental-react/lib/Time/Time", "default.displayName")
    @js.native
    def displayName: typingsJapgolly.fundamentalReact.fundamentalReactStrings.Time = js.native
    inline def displayName_=(x: typingsJapgolly.fundamentalReact.fundamentalReactStrings.Time): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Time = japgolly.scalajs.react.facade.React.Component[TimeProps & js.Object, js.Object]
  
  trait TimeBaseProps extends StObject {
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var format12Hours: js.UndefOr[Boolean] = js.undefined
    
    var showHour: js.UndefOr[Boolean] = js.undefined
    
    var showMinute: js.UndefOr[Boolean] = js.undefined
    
    var showSecond: js.UndefOr[Boolean] = js.undefined
    
    var spinners: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Hour] = js.undefined
  }
  object TimeBaseProps {
    
    inline def apply(): TimeBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeBaseProps]
    }
    
    extension [Self <: TimeBaseProps](x: Self) {
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setFormat12Hours(value: Boolean): Self = StObject.set(x, "format12Hours", value.asInstanceOf[js.Any])
      
      inline def setFormat12HoursUndefined: Self = StObject.set(x, "format12Hours", js.undefined)
      
      inline def setShowHour(value: Boolean): Self = StObject.set(x, "showHour", value.asInstanceOf[js.Any])
      
      inline def setShowHourUndefined: Self = StObject.set(x, "showHour", js.undefined)
      
      inline def setShowMinute(value: Boolean): Self = StObject.set(x, "showMinute", value.asInstanceOf[js.Any])
      
      inline def setShowMinuteUndefined: Self = StObject.set(x, "showMinute", js.undefined)
      
      inline def setShowSecond(value: Boolean): Self = StObject.set(x, "showSecond", value.asInstanceOf[js.Any])
      
      inline def setShowSecondUndefined: Self = StObject.set(x, "showSecond", js.undefined)
      
      inline def setSpinners(value: Boolean): Self = StObject.set(x, "spinners", value.asInstanceOf[js.Any])
      
      inline def setSpinnersUndefined: Self = StObject.set(x, "spinners", js.undefined)
      
      inline def setTime(value: Hour): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait TimeProps
    extends StObject
       with TimeBaseProps
       with /* x */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var hoursDownButtonProps: js.UndefOr[Any] = js.undefined
    
    var hoursInputProps: js.UndefOr[Any] = js.undefined
    
    var hoursUpButtonProps: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var localizedText: js.UndefOr[MeridiemAM] = js.undefined
    
    var meridiemDownButtonProps: js.UndefOr[Any] = js.undefined
    
    var meridiemInputProps: js.UndefOr[Any] = js.undefined
    
    var meridiemUpButtonProps: js.UndefOr[Any] = js.undefined
    
    var minutesDownButtonProps: js.UndefOr[Any] = js.undefined
    
    var minutesInputProps: js.UndefOr[Any] = js.undefined
    
    var minutesUpButtonProps: js.UndefOr[Any] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ Hour, Unit]] = js.undefined
    
    var secondsDownButtonProps: js.UndefOr[Any] = js.undefined
    
    var secondsInputProps: js.UndefOr[Any] = js.undefined
    
    var secondsUpButtonProps: js.UndefOr[Any] = js.undefined
  }
  object TimeProps {
    
    inline def apply(): TimeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeProps]
    }
    
    extension [Self <: TimeProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHoursDownButtonProps(value: Any): Self = StObject.set(x, "hoursDownButtonProps", value.asInstanceOf[js.Any])
      
      inline def setHoursDownButtonPropsUndefined: Self = StObject.set(x, "hoursDownButtonProps", js.undefined)
      
      inline def setHoursInputProps(value: Any): Self = StObject.set(x, "hoursInputProps", value.asInstanceOf[js.Any])
      
      inline def setHoursInputPropsUndefined: Self = StObject.set(x, "hoursInputProps", js.undefined)
      
      inline def setHoursUpButtonProps(value: Any): Self = StObject.set(x, "hoursUpButtonProps", value.asInstanceOf[js.Any])
      
      inline def setHoursUpButtonPropsUndefined: Self = StObject.set(x, "hoursUpButtonProps", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocalizedText(value: MeridiemAM): Self = StObject.set(x, "localizedText", value.asInstanceOf[js.Any])
      
      inline def setLocalizedTextUndefined: Self = StObject.set(x, "localizedText", js.undefined)
      
      inline def setMeridiemDownButtonProps(value: Any): Self = StObject.set(x, "meridiemDownButtonProps", value.asInstanceOf[js.Any])
      
      inline def setMeridiemDownButtonPropsUndefined: Self = StObject.set(x, "meridiemDownButtonProps", js.undefined)
      
      inline def setMeridiemInputProps(value: Any): Self = StObject.set(x, "meridiemInputProps", value.asInstanceOf[js.Any])
      
      inline def setMeridiemInputPropsUndefined: Self = StObject.set(x, "meridiemInputProps", js.undefined)
      
      inline def setMeridiemUpButtonProps(value: Any): Self = StObject.set(x, "meridiemUpButtonProps", value.asInstanceOf[js.Any])
      
      inline def setMeridiemUpButtonPropsUndefined: Self = StObject.set(x, "meridiemUpButtonProps", js.undefined)
      
      inline def setMinutesDownButtonProps(value: Any): Self = StObject.set(x, "minutesDownButtonProps", value.asInstanceOf[js.Any])
      
      inline def setMinutesDownButtonPropsUndefined: Self = StObject.set(x, "minutesDownButtonProps", js.undefined)
      
      inline def setMinutesInputProps(value: Any): Self = StObject.set(x, "minutesInputProps", value.asInstanceOf[js.Any])
      
      inline def setMinutesInputPropsUndefined: Self = StObject.set(x, "minutesInputProps", js.undefined)
      
      inline def setMinutesUpButtonProps(value: Any): Self = StObject.set(x, "minutesUpButtonProps", value.asInstanceOf[js.Any])
      
      inline def setMinutesUpButtonPropsUndefined: Self = StObject.set(x, "minutesUpButtonProps", js.undefined)
      
      inline def setOnChange(value: /* time */ Hour => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* time */ Hour) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSecondsDownButtonProps(value: Any): Self = StObject.set(x, "secondsDownButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondsDownButtonPropsUndefined: Self = StObject.set(x, "secondsDownButtonProps", js.undefined)
      
      inline def setSecondsInputProps(value: Any): Self = StObject.set(x, "secondsInputProps", value.asInstanceOf[js.Any])
      
      inline def setSecondsInputPropsUndefined: Self = StObject.set(x, "secondsInputProps", js.undefined)
      
      inline def setSecondsUpButtonProps(value: Any): Self = StObject.set(x, "secondsUpButtonProps", value.asInstanceOf[js.Any])
      
      inline def setSecondsUpButtonPropsUndefined: Self = StObject.set(x, "secondsUpButtonProps", js.undefined)
    }
  }
}
