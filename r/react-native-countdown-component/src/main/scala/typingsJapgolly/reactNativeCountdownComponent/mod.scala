package typingsJapgolly.reactNativeCountdownComponent

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCountdownComponent.anon.D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-countdown-component", JSImport.Default)
  @js.native
  open class default () extends Component[CountDownProps, CountDownState, Any]
  
  type CountDown = japgolly.scalajs.react.facade.React.Component[CountDownProps & js.Object, js.Object]
  
  trait CountDownProps extends StObject {
    
    /**
      *  Digit style
      * @default {backgroundColor: '#FAB913'}
      */
    var digitStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Digit Text style
      * @default {color: #FAB913 '#000'}
      */
    var digitTxtStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Counter id, to determine whether to reset the counter or not
      * @default null
      */
    var id: js.UndefOr[String | Null] = js.undefined
    
    /**
      * What function should be invoked when the timer is changing
      * @default null
      */
    var onChange: js.UndefOr[js.Function1[/* until */ Double, Unit]] = js.undefined
    
    /**
      * What function should be invoked when the time is 0
      * @default null
      */
    var onFinish: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * What function should be invoked when clicking on the timer
      * @default null
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * A boolean to pause and resume the component
      * @default true
      */
    var running: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Separator style
      * @default {color: #FAB913 '#000'}
      */
    var separatorStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Should show separator
      * @default false
      */
    var showSeparator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Size of the countdown component
      * @default 15
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Override the component style
      * @default {}
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Time Label style
      * @default {color: #FAB913 '#000'}
      */
    var timeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Text to show in time label
      * @default {d: 'Days', h: 'Hours', m: 'Minutes', s: 'Seconds'}
      */
    var timeLabels: js.UndefOr[D] = js.undefined
    
    /**
      * What Digits to show
      * @default ['D', 'H', 'M', 'S']
      */
    var timeToShow: js.UndefOr[js.Array[DigitType]] = js.undefined
    
    /**
      * Number of seconds to countdown
      * @default 0
      */
    var until: js.UndefOr[Double] = js.undefined
  }
  object CountDownProps {
    
    inline def apply(): CountDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CountDownProps]
    }
    
    extension [Self <: CountDownProps](x: Self) {
      
      inline def setDigitStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "digitStyle", value.asInstanceOf[js.Any])
      
      inline def setDigitStyleNull: Self = StObject.set(x, "digitStyle", null)
      
      inline def setDigitStyleUndefined: Self = StObject.set(x, "digitStyle", js.undefined)
      
      inline def setDigitTxtStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "digitTxtStyle", value.asInstanceOf[js.Any])
      
      inline def setDigitTxtStyleNull: Self = StObject.set(x, "digitTxtStyle", null)
      
      inline def setDigitTxtStyleUndefined: Self = StObject.set(x, "digitTxtStyle", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnChange(value: /* until */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* until */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFinish(value: Callback): Self = StObject.set(x, "onFinish", value.toJsFn)
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRunning(value: Boolean): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
      
      inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
      
      inline def setSeparatorStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "separatorStyle", value.asInstanceOf[js.Any])
      
      inline def setSeparatorStyleNull: Self = StObject.set(x, "separatorStyle", null)
      
      inline def setSeparatorStyleUndefined: Self = StObject.set(x, "separatorStyle", js.undefined)
      
      inline def setShowSeparator(value: Boolean): Self = StObject.set(x, "showSeparator", value.asInstanceOf[js.Any])
      
      inline def setShowSeparatorUndefined: Self = StObject.set(x, "showSeparator", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTimeLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "timeLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setTimeLabelStyleNull: Self = StObject.set(x, "timeLabelStyle", null)
      
      inline def setTimeLabelStyleUndefined: Self = StObject.set(x, "timeLabelStyle", js.undefined)
      
      inline def setTimeLabels(value: D): Self = StObject.set(x, "timeLabels", value.asInstanceOf[js.Any])
      
      inline def setTimeLabelsUndefined: Self = StObject.set(x, "timeLabels", js.undefined)
      
      inline def setTimeToShow(value: js.Array[DigitType]): Self = StObject.set(x, "timeToShow", value.asInstanceOf[js.Any])
      
      inline def setTimeToShowUndefined: Self = StObject.set(x, "timeToShow", js.undefined)
      
      inline def setTimeToShowVarargs(value: DigitType*): Self = StObject.set(x, "timeToShow", js.Array(value*))
      
      inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
  
  trait CountDownState extends StObject {
    
    var lastUntil: Double | Null
    
    var until: Double
    
    var wentBackgroundAt: Double | Null
  }
  object CountDownState {
    
    inline def apply(until: Double): CountDownState = {
      val __obj = js.Dynamic.literal(until = until.asInstanceOf[js.Any], lastUntil = null, wentBackgroundAt = null)
      __obj.asInstanceOf[CountDownState]
    }
    
    extension [Self <: CountDownState](x: Self) {
      
      inline def setLastUntil(value: Double): Self = StObject.set(x, "lastUntil", value.asInstanceOf[js.Any])
      
      inline def setLastUntilNull: Self = StObject.set(x, "lastUntil", null)
      
      inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setWentBackgroundAt(value: Double): Self = StObject.set(x, "wentBackgroundAt", value.asInstanceOf[js.Any])
      
      inline def setWentBackgroundAtNull: Self = StObject.set(x, "wentBackgroundAt", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.D
    - typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.H
    - typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.M
    - typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.S
  */
  trait DigitType extends StObject
  object DigitType {
    
    inline def D: typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.D = "D".asInstanceOf[typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.D]
    
    inline def H: typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.H = "H".asInstanceOf[typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.H]
    
    inline def M: typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.M = "M".asInstanceOf[typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.M]
    
    inline def S: typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.S = "S".asInstanceOf[typingsJapgolly.reactNativeCountdownComponent.reactNativeCountdownComponentStrings.S]
  }
}
