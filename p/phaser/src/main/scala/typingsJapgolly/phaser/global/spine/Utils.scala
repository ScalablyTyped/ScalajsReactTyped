package typingsJapgolly.phaser.global.spine

import typingsJapgolly.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Utils")
@js.native
open class Utils ()
  extends StObject
     with typingsJapgolly.phaser.spine.Utils
object Utils {
  
  @JSGlobal("spine.Utils")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.Utils.SUPPORTS_TYPED_ARRAYS")
  @js.native
  def SUPPORTS_TYPED_ARRAYS: Boolean = js.native
  inline def SUPPORTS_TYPED_ARRAYS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTS_TYPED_ARRAYS")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def arrayCopy[T](
    source: ArrayLike[T],
    sourceStart: Double,
    dest: ArrayLike[T],
    destStart: Double,
    numElements: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayCopy")(source.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], destStart.asInstanceOf[js.Any], numElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def contains[T](array: js.Array[T], element: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def contains[T](array: js.Array[T], element: T, identity: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(array.asInstanceOf[js.Any], element.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def ensureArrayCapacity[T](array: js.Array[T], size: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureArrayCapacity")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def ensureArrayCapacity[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureArrayCapacity")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def newArray[T](size: Double, defaultValue: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("newArray")(size.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def newFloatArray(size: Double): ArrayLike[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("newFloatArray")(size.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[Double]]
  
  /* static member */
  inline def newShortArray(size: Double): ArrayLike[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("newShortArray")(size.asInstanceOf[js.Any]).asInstanceOf[ArrayLike[Double]]
  
  /* static member */
  inline def setArraySize[T](array: js.Array[T], size: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setArraySize")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def setArraySize[T](array: js.Array[T], size: Double, value: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("setArraySize")(array.asInstanceOf[js.Any], size.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /* static member */
  inline def toFloatArray(array: js.Array[Double]): js.Array[Double] | js.typedarray.Float32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toFloatArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double] | js.typedarray.Float32Array]
  
  /* static member */
  inline def toSinglePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toSinglePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def webkit602BugfixHelper(alpha: Double, blend: typingsJapgolly.phaser.spine.MixBlend): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("webkit602BugfixHelper")(alpha.asInstanceOf[js.Any], blend.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
