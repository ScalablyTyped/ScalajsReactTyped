package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontMgr
  extends StObject
     with EmbindObject[FontMgr] {
  
  /**
    * Return the number of font families loaded in this manager. Useful for debugging.
    */
  def countFamilies(): Double
  
  /**
    * Return the nth family name. Useful for debugging.
    * @param index
    */
  def getFamilyName(index: Double): String
}
object FontMgr {
  
  inline def apply(
    countFamilies: CallbackTo[Double],
    delete: Callback,
    deleteLater: Callback,
    getFamilyName: Double => String,
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean]
  ): FontMgr = {
    val __obj = js.Dynamic.literal(countFamilies = countFamilies.toJsFn, delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, getFamilyName = js.Any.fromFunction1(getFamilyName), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn)
    __obj.asInstanceOf[FontMgr]
  }
  
  extension [Self <: FontMgr](x: Self) {
    
    inline def setCountFamilies(value: CallbackTo[Double]): Self = StObject.set(x, "countFamilies", value.toJsFn)
    
    inline def setGetFamilyName(value: Double => String): Self = StObject.set(x, "getFamilyName", js.Any.fromFunction1(value))
  }
}
