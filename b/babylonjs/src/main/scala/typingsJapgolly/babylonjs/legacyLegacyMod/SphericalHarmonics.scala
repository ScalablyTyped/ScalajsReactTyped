package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SphericalHarmonics")
@js.native
open class SphericalHarmonics ()
  extends typingsJapgolly.babylonjs.indexMod.SphericalHarmonics
/* static members */
object SphericalHarmonics {
  
  @JSImport("babylonjs/Legacy/legacy", "SphericalHarmonics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  inline def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalHarmonics]
  
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  inline def FromPolynomial(polynomial: typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalPolynomial): typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPolynomial")(polynomial.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.mathsSphericalPolynomialMod.SphericalHarmonics]
}
