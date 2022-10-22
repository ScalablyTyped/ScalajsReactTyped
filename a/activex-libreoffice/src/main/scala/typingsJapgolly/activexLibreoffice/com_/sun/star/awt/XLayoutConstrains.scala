package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the layout constraints for a surrounding container. */
trait XLayoutConstrains
  extends StObject
     with XInterface {
  
  /** returns the minimum size for this component. */
  val MinimumSize: Size
  
  /** returns the preferred size for this component. */
  val PreferredSize: Size
  
  /** calculates the adjusted size for a given maximum size. */
  def calcAdjustedSize(aNewSize: Size): Size
  
  /** returns the minimum size for this component. */
  def getMinimumSize(): Size
  
  /** returns the preferred size for this component. */
  def getPreferredSize(): Size
}
object XLayoutConstrains {
  
  inline def apply(
    MinimumSize: Size,
    PreferredSize: Size,
    acquire: Callback,
    calcAdjustedSize: Size => Size,
    getMinimumSize: CallbackTo[Size],
    getPreferredSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback
  ): XLayoutConstrains = {
    val __obj = js.Dynamic.literal(MinimumSize = MinimumSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), getMinimumSize = getMinimumSize.toJsFn, getPreferredSize = getPreferredSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLayoutConstrains]
  }
  
  extension [Self <: XLayoutConstrains](x: Self) {
    
    inline def setCalcAdjustedSize(value: Size => Size): Self = StObject.set(x, "calcAdjustedSize", js.Any.fromFunction1(value))
    
    inline def setGetMinimumSize(value: CallbackTo[Size]): Self = StObject.set(x, "getMinimumSize", value.toJsFn)
    
    inline def setGetPreferredSize(value: CallbackTo[Size]): Self = StObject.set(x, "getPreferredSize", value.toJsFn)
    
    inline def setMinimumSize(value: Size): Self = StObject.set(x, "MinimumSize", value.asInstanceOf[js.Any])
    
    inline def setPreferredSize(value: Size): Self = StObject.set(x, "PreferredSize", value.asInstanceOf[js.Any])
  }
}
