package typingsJapgolly.activexLibreoffice.com_.sun.star.animations

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for animation by defining color changes over time. ;  Only color value will be legal values for the following members {@link
  * XAnimate.Values}{@link XAnimate.From}{@link XAnimate.To}{@link XAnimate.By}
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateColor
  */
trait XAnimateColor
  extends StObject
     with XAnimate {
  
  /**
    * defines the color space which is used to perform the interpolation. ;
    * @see AnimationColorSpace
    */
  var ColorInterpolation: Double
  
  /**
    * defines the direction which is used to perform the interpolation inside the color space defined with {@link ColorInterpolation} . ;  Values could be
    * `TRUE` for clockwise and `FALSE` for counterclockwise.
    *
    * This attribute will be ignored for color spaces where this does not make any sense.
    */
  var Direction: Boolean
}
object XAnimateColor {
  
  inline def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: Any,
    By: Any,
    CalcMode: Double,
    ColorInterpolation: Double,
    Decelerate: Double,
    Direction: Boolean,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: Any,
    KeyTimes: SafeArray[Double],
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[Any],
    acquire: Callback,
    getParent: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    setParent: XInterface => Callback
  ): XAnimateColor = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], ColorInterpolation = ColorInterpolation.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XAnimateColor]
  }
  
  extension [Self <: XAnimateColor](x: Self) {
    
    inline def setColorInterpolation(value: Double): Self = StObject.set(x, "ColorInterpolation", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Boolean): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
  }
}
