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
  * An iterate container iterates over subitems of a given target object and animates them by subsequently executes the contained effects on them. ;  This
  * could be used to animate a target text word by word or letter by letter.
  */
trait XIterateContainer
  extends StObject
     with XTimeContainer {
  
  /** the time interval in percentage of the containers running time before the next iterated content is animated. */
  var IterateInterval: Double
  
  /** the type of iteration, this depends on the target. ;  See documentation of used animation engine for supported iteration types. */
  var IterateType: Double
  
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: Double
  
  /** a target that contains iterable contents, f.e. a paragraph. ;  See documentation of used animation engine for supported targets. */
  var Target: Any
}
object XIterateContainer {
  
  inline def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: Any,
    Decelerate: Double,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    IterateInterval: Double,
    IterateType: Double,
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: Callback,
    appendChild: XAnimationNode => XAnimationNode,
    getParent: CallbackTo[XInterface],
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => Any,
    release: Callback,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Callback
  ): XIterateContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], IterateInterval = IterateInterval.asInstanceOf[js.Any], IterateType = IterateType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], acquire = acquire.toJsFn, appendChild = js.Any.fromFunction1(appendChild), getParent = getParent.toJsFn, insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XIterateContainer]
  }
  
  extension [Self <: XIterateContainer](x: Self) {
    
    inline def setIterateInterval(value: Double): Self = StObject.set(x, "IterateInterval", value.asInstanceOf[js.Any])
    
    inline def setIterateType(value: Double): Self = StObject.set(x, "IterateType", value.asInstanceOf[js.Any])
    
    inline def setSubItem(value: Double): Self = StObject.set(x, "SubItem", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
