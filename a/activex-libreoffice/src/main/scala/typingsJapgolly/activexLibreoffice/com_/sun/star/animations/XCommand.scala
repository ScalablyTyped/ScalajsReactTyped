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

/** Execution of the {@link XCommand} animation node causes the slide show component to call back the application to perform the command. */
trait XCommand
  extends StObject
     with XAnimationNode {
  
  /** This identifies the application specific command. See documentation of used application for commands. */
  var Command: Double
  
  /**
    * The application specific parameter for this command. See documentation of used application for supported parameters for different commands and target
    * combinations.
    */
  var Parameter: Any
  
  /** The application specific target. See documentation of used application for supported targets. */
  var Target: Any
}
object XCommand {
  
  inline def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: Any,
    Command: Double,
    Decelerate: Double,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    Parameter: Any,
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    Target: Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: Callback,
    getParent: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    setParent: XInterface => Callback
  ): XCommand = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Command = Command.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Parameter = Parameter.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XCommand]
  }
  
  extension [Self <: XCommand](x: Self) {
    
    inline def setCommand(value: Double): Self = StObject.set(x, "Command", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: Any): Self = StObject.set(x, "Parameter", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
