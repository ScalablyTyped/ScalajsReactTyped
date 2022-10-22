package typingsJapgolly.reactNativeCommunitySegmentedControl

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.TargetedEvent
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`100`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`200`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`300`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`400`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`500`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`600`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`700`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`800`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.`900`
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.bold
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.dark
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.light
import typingsJapgolly.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/segmented-control", JSImport.Default)
  @js.native
  open class default () extends SegmentedControl
  
  trait FontStyle extends StObject {
    
    /**
      * Font Color of Segmented Control
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Font Family of the Segmented Control
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * Font Size of Segmented Control
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Font Weight of the Segmented Control
      */
    var fontWeight: js.UndefOr[
        normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
      ] = js.undefined
  }
  object FontStyle {
    
    inline def apply(): FontStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyle]
    }
    
    extension [Self <: FontStyle](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(value: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  trait NativeSegmentedControlIOSChangeEvent
    extends StObject
       with TargetedEvent {
    
    var selectedSegmentIndex: Double
    
    var value: String
  }
  object NativeSegmentedControlIOSChangeEvent {
    
    inline def apply(selectedSegmentIndex: Double, target: Double, value: String): NativeSegmentedControlIOSChangeEvent = {
      val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
    }
    
    extension [Self <: NativeSegmentedControlIOSChangeEvent](x: Self) {
      
      inline def setSelectedSegmentIndex(value: Double): Self = StObject.set(x, "selectedSegmentIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethods */ @js.native
  trait SegmentedControl
    extends Component[SegmentedControlProps, js.Object, Any]
  
  /**
    * Use `SegmentedControl` to render a UISegmentedControl iOS.
    *
    * #### Programmatically changing selected index
    *
    * The selected index can be changed on the fly by assigning the
    * selectIndex prop to a state variable, then changing that variable.
    * Note that the state variable would need to be updated as the user
    * selects a value and changes the index, as shown in the example below.
    *
    * ````
    * <SegmentedControl
    *   values={['One', 'Two']}
    *   selectedIndex={this.state.selectedIndex}
    *   onChange={(event) => {
    *     this.setState({selectedIndex: event.nativeEvent.selectedSegmentIndex});
    *   }}
    * />
    * ````
    */
  type SegmentedControlComponent = japgolly.scalajs.react.facade.React.Component[SegmentedControlProps & js.Object, js.Object]
  
  trait SegmentedControlProps
    extends StObject
       with ViewProps {
    
    /**
      * Active Font style properties of the Segmented Control
      */
    var activeFontStyle: js.UndefOr[FontStyle] = js.undefined
    
    /**
      * (iOS 13+ only)
      * Overrides the control's appearance irrespective of the OS theme
      */
    var appearance: js.UndefOr[dark | light] = js.undefined
    
    /**
      * (iOS 13+ only)
      * Background color of the control.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * If false the user won't be able to interact with the control. Default value is true.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Font style properties of the Segmented Control
      */
    var fontStyle: js.UndefOr[FontStyle] = js.undefined
    
    /**
      * If true, then selecting a segment won't persist visually.
      * The onValueChange callback will still work as expected.
      */
    var momentary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user taps a segment;
      * passes the event as an argument
      */
    var onChange: js.UndefOr[
        js.Function1[/* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent], Unit]
      ] = js.undefined
    
    /**
      * Callback that is called when the user taps a segment; passes the segment's value as an argument
      */
    var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /**
      * The index in props.values of the segment to be (pre)selected.
      */
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Accent color of the control.
      */
    var tintColor: js.UndefOr[String] = js.undefined
    
    /**
      * The labels for the control's segment buttons, in order.
      */
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SegmentedControlProps {
    
    inline def apply(): SegmentedControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    extension [Self <: SegmentedControlProps](x: Self) {
      
      inline def setActiveFontStyle(value: FontStyle): Self = StObject.set(x, "activeFontStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveFontStyleUndefined: Self = StObject.set(x, "activeFontStyle", js.undefined)
      
      inline def setAppearance(value: dark | light): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setMomentary(value: Boolean): Self = StObject.set(x, "momentary", value.asInstanceOf[js.Any])
      
      inline def setMomentaryUndefined: Self = StObject.set(x, "momentary", js.undefined)
      
      inline def setOnChange(value: /* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ String => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
