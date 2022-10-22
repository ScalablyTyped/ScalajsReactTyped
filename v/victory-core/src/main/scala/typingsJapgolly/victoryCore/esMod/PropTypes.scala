package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.victoryCore.esTypesPropTypesMod.D3Scale
import typingsJapgolly.victoryCore.esTypesPropTypesMod.ScaleName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PropTypes {
  
  @JSImport("victory-core/es", "PropTypes")
  @js.native
  val ^ : js.Any = js.native
  
  inline def allOfType[T](validators: js.Array[Validator[T]]): Requireable[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allOfType")(validators.asInstanceOf[js.Any]).asInstanceOf[Requireable[js.UndefOr[T]]]
  
  inline def deprecated[T](propType: Validator[T], explanation: String): Validator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(propType.asInstanceOf[js.Any], explanation.asInstanceOf[js.Any])).asInstanceOf[Validator[T]]
  
  @JSImport("victory-core/es", "PropTypes.domain")
  @js.native
  val domain: Requireable[js.UndefOr[js.Tuple2[Double, Double]]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.greaterThanZero")
  @js.native
  val greaterThanZero: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.homogeneousArray")
  @js.native
  val homogeneousArray: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.integer")
  @js.native
  val integer: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.matchDataLength")
  @js.native
  val matchDataLength: Requireable[js.UndefOr[js.Array[Any]]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.nonNegative")
  @js.native
  val nonNegative: Requireable[js.UndefOr[Double]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.regExp")
  @js.native
  val regExp: Requireable[js.UndefOr[js.RegExp]] = js.native
  
  @JSImport("victory-core/es", "PropTypes.scale")
  @js.native
  val scale: Requireable[js.UndefOr[ScaleName | D3Scale[Any]]] = js.native
}
