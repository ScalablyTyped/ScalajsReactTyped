package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SphericalHarmonics")
@js.native
open class SphericalHarmonics ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics {
  
  /**
    * Adds a light to the spherical harmonics
    * @param direction the direction of the light
    * @param color the color of the light
    * @param deltaSolidAngle the delta solid angle of the light
    */
  /* CompleteClass */
  override def addLight(
    direction: typingsJapgolly.babylonjs.BABYLON.Vector3,
    color: typingsJapgolly.babylonjs.BABYLON.Color3,
    deltaSolidAngle: Double
  ): Unit = js.native
  
  /**
    * Convert from incident radiance (Li) to irradiance (E) by applying convolution with the cosine-weighted hemisphere.
    *
    * ```
    * E_lm = A_l * L_lm
    * ```
    *
    * In spherical harmonics this convolution amounts to scaling factors for each frequency band.
    * This corresponds to equation 5 in "An Efficient Representation for Irradiance Environment Maps", where
    * the scaling factors are given in equation 9.
    */
  /* CompleteClass */
  override def convertIncidentRadianceToIrradiance(): Unit = js.native
  
  /**
    * Convert from irradiance to outgoing radiance for Lambertian BDRF, suitable for efficient shader evaluation.
    *
    * ```
    * L = (1/pi) * E * rho
    * ```
    *
    * This is done by an additional scale by 1/pi, so is a fairly trivial operation but important conceptually.
    */
  /* CompleteClass */
  override def convertIrradianceToLambertianRadiance(): Unit = js.native
  
  /**
    * The l0,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l00: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l1,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l10: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l1,1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l11: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l1,-1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l1_1: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l2,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l20: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l2,1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l21: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l2,2 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l22: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l2,-1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l2_1: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The l2,-2 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  var l2_2: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Integrates the reconstruction coefficients directly in to the SH preventing further
    * required operations at run time.
    *
    * This is simply done by scaling back the SH with Ylm constants parameter.
    * The trigonometric part being applied by the shader at run time.
    */
  /* CompleteClass */
  override def preScaleForRendering(): Unit = js.native
  
  /**
    * Defines whether or not the harmonics have been prescaled for rendering.
    */
  /* CompleteClass */
  var preScaled: Boolean = js.native
  
  /**
    * Scales the spherical harmonics by the given amount
    * @param scale the amount to scale
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): Unit = js.native
  
  /**
    * update the spherical harmonics coefficients from the given array
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics (this)
    */
  /* CompleteClass */
  override def updateFromArray(data: ArrayLike[ArrayLike[Double]]): typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics = js.native
  
  /**
    * update the spherical harmonics coefficients from the given floats array
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics (this)
    */
  /* CompleteClass */
  override def updateFromFloatsArray(data: ArrayLike[Double]): typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics = js.native
}
/* static members */
object SphericalHarmonics {
  
  @JSGlobal("BABYLON.SphericalHarmonics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  inline def FromArray(data: ArrayLike[ArrayLike[Double]]): typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics]
  
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  inline def FromPolynomial(polynomial: typingsJapgolly.babylonjs.BABYLON.SphericalPolynomial): typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPolynomial")(polynomial.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.SphericalHarmonics]
}
