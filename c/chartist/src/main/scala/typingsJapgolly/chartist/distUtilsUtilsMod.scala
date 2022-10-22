package typingsJapgolly.chartist

import typingsJapgolly.chartist.chartistBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUtilsMod {
  
  @JSImport("chartist/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each[T](
    list: js.Array[T],
    callback: js.Function3[/* item */ T, /* index */ Double, /* itemIndex */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each[T](
    list: js.Array[T],
    callback: js.Function3[/* item */ T, /* index */ Double, /* itemIndex */ Double, Unit],
    reverse: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(list.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getNumberOrUndefined(value: Any): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def getNumberOrUndefined(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOrUndefined")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArrayOfArrays(data: Any): /* is std.Array<std.Array<unknown>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayOfArrays")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<std.Array<unknown>> */ Boolean]
  
  inline def isFalseyButZero(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFalseyButZero")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Double): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[`true`]
  
  inline def safeHasProperty[T, K /* <: String */](target: T, property: K): /* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("safeHasProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[/* is chartist.chartist/dist/utils/types.FilterByKey<T, K> */ Boolean]
}
