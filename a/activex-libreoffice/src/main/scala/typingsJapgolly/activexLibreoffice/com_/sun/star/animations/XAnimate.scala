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
  * Interface for generic animation.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animate
  */
trait XAnimate
  extends StObject
     with XAnimationNode {
  
  /**
    * Controls whether or not the animation is cumulative.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-accumulate
    */
  var Accumulate: Boolean
  
  /**
    * Controls whether or not the animation is additive.
    * @see AnimationAdditiveMode
    * @see http://www.w3.org/TR/smil20/animation.html#adef-additive
    */
  var Additive: Double
  
  /**
    * Specifies the target attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-attributeName
    */
  var AttributeName: String
  
  /**
    * Specifies a relative offset value for the animation. ;  Must be a legal value of a domain for which addition to the attributeType domain is defined
    * and which yields a value in the attributeType domain. Ignored if the values attribute is specified. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-by
    */
  var By: Any
  
  /**
    * Specifies the interpolation mode for the animation. ;  If the target attribute does not support linear interpolation (e.g. for strings), or if the
    * values attribute has only one value, the CalcMode attribute is ignored and discrete interpolation is used.
    * @see AnimationCalcMode;
    */
  var CalcMode: Double
  
  /**
    * if this string is set, its contents will be parsed as a formula. All values are used as a parameter for this formula and the computed result will be
    * used.
    */
  var Formula: String
  
  /**
    * Specifies the starting value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-from
    */
  var From: Any
  
  var KeyTimes: SafeArray[Double]
  
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: Double
  
  /** This attribute specifies the target element to be animated. ;  See documentation of used animation engine for supported targets. */
  var Target: Any
  
  /** todo: timeFilter="0,0; 0.14,0.36; 0.43,0.73; 0.71,0.91; 1.0,1.0" ? */
  var TimeFilter: SafeArray[TimeFilterPair]
  
  /**
    * Specifies the ending value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-to
    */
  var To: Any
  
  /** @see AnimationValueType */
  var ValueType: Double
  
  /**
    * A sequence of one or more values, each of which must be a legal value for the specified attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-values
    */
  var Values: SafeArray[Any]
}
object XAnimate {
  
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
  ): XAnimate = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XAnimate]
  }
  
  extension [Self <: XAnimate](x: Self) {
    
    inline def setAccumulate(value: Boolean): Self = StObject.set(x, "Accumulate", value.asInstanceOf[js.Any])
    
    inline def setAdditive(value: Double): Self = StObject.set(x, "Additive", value.asInstanceOf[js.Any])
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setBy(value: Any): Self = StObject.set(x, "By", value.asInstanceOf[js.Any])
    
    inline def setCalcMode(value: Double): Self = StObject.set(x, "CalcMode", value.asInstanceOf[js.Any])
    
    inline def setFormula(value: String): Self = StObject.set(x, "Formula", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Any): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setKeyTimes(value: SafeArray[Double]): Self = StObject.set(x, "KeyTimes", value.asInstanceOf[js.Any])
    
    inline def setSubItem(value: Double): Self = StObject.set(x, "SubItem", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTimeFilter(value: SafeArray[TimeFilterPair]): Self = StObject.set(x, "TimeFilter", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Any): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: Double): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SafeArray[Any]): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
