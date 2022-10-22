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
  * Interface for animation by defining motion on a path.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateMotion
  */
trait XAnimateMotion
  extends StObject
     with XAnimate {
  
  /** Specifies the origin of motion for the animation. The values and semantics of this attribute are dependent upon the used animation engine. */
  var Origin: Any
  
  /**
    * Specifies an optional path. ;  If a path is used, the {@link From} , {@link To} and {@link By} members are ignored. The value type of the path depends
    * on the used rendering system. Possible types maybe a svg:d path encoded in a string.
    */
  var Path: Any
}
object XAnimateMotion {
  
  inline def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: Any,
    By: Any,
    CalcMode: Double,
    Decelerate: Double,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: Any,
    KeyTimes: SafeArray[Double],
    Origin: Any,
    Parent: XInterface,
    Path: Any,
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
  ): XAnimateMotion = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XAnimateMotion]
  }
  
  extension [Self <: XAnimateMotion](x: Self) {
    
    inline def setOrigin(value: Any): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Any): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
  }
}
