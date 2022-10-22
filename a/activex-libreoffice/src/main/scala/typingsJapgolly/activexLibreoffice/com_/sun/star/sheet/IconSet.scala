package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSet
  extends StObject
     with XConditionEntry {
  
  var IconSetEntries: SafeArray[XIconSetEntry]
  
  /** See {@link com.sun.star.sheet.IconSetType} for possible values. */
  var Icons: Double
  
  var Reverse: Boolean
  
  var ShowValue: Boolean
}
object IconSet {
  
  inline def apply(
    IconSetEntries: SafeArray[XIconSetEntry],
    Icons: Double,
    Reverse: Boolean,
    ShowValue: Boolean,
    Type: Double,
    acquire: Callback,
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): IconSet = {
    val __obj = js.Dynamic.literal(IconSetEntries = IconSetEntries.asInstanceOf[js.Any], Icons = Icons.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], ShowValue = ShowValue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[IconSet]
  }
  
  extension [Self <: IconSet](x: Self) {
    
    inline def setIconSetEntries(value: SafeArray[XIconSetEntry]): Self = StObject.set(x, "IconSetEntries", value.asInstanceOf[js.Any])
    
    inline def setIcons(value: Double): Self = StObject.set(x, "Icons", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "Reverse", value.asInstanceOf[js.Any])
    
    inline def setShowValue(value: Boolean): Self = StObject.set(x, "ShowValue", value.asInstanceOf[js.Any])
  }
}
