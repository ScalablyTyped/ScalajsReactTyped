package typingsJapgolly.reactNativeSensorManager.mod

import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.RippleBackgroundPropType
import typingsJapgolly.reactNative.mod.ThemeAttributeBackgroundPropType
import typingsJapgolly.reactNative.mod.TouchableNativeFeedbackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (args : ...any): react-native.react-native.TouchableMixin */ @JSImport("react-native-sensor-manager", "TouchableNativeFeedback")
@js.native
open class TouchableNativeFeedback protected ()
  extends typingsJapgolly.reactNative.mod.TouchableNativeFeedback {
  def this(props: TouchableNativeFeedbackProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: TouchableNativeFeedbackProps, context: Any) = this()
}
/* static members */
object TouchableNativeFeedback {
  
  @JSImport("react-native-sensor-manager", "TouchableNativeFeedback")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an object that represents ripple drawable with specified color (as a
    * string). If property `borderless` evaluates to true the ripple will
    * render outside of the view bounds (see native actionbar buttons as an
    * example of that behavior). This background type is available on Android
    * API level 21+.
    *
    * @param color The ripple color
    * @param borderless If the ripple can render outside it's bounds
    * @param rippleRadius The radius of ripple effect
    */
  inline def Ripple(color: ColorValue, borderless: Boolean): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
  inline def Ripple(color: ColorValue, borderless: Boolean, rippleRadius: Double): RippleBackgroundPropType = (^.asInstanceOf[js.Dynamic].applyDynamic("Ripple")(color.asInstanceOf[js.Any], borderless.asInstanceOf[js.Any], rippleRadius.asInstanceOf[js.Any])).asInstanceOf[RippleBackgroundPropType]
  
  /**
    * Creates an object that represents android theme's default background for
    * selectable elements (?android:attr/selectableItemBackground).
    *
    * @param rippleRadius The radius of ripple effect
    */
  inline def SelectableBackground(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")().asInstanceOf[ThemeAttributeBackgroundPropType]
  inline def SelectableBackground(rippleRadius: Double): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackground")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[ThemeAttributeBackgroundPropType]
  
  /**
    * Creates an object that represent android theme's default background for borderless
    * selectable elements (?android:attr/selectableItemBackgroundBorderless).
    * Available on android API level 21+.
    *
    * @param rippleRadius The radius of ripple effect
    */
  inline def SelectableBackgroundBorderless(): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")().asInstanceOf[ThemeAttributeBackgroundPropType]
  inline def SelectableBackgroundBorderless(rippleRadius: Double): ThemeAttributeBackgroundPropType = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectableBackgroundBorderless")(rippleRadius.asInstanceOf[js.Any]).asInstanceOf[ThemeAttributeBackgroundPropType]
  
  inline def canUseNativeForeground(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseNativeForeground")().asInstanceOf[Boolean]
}
