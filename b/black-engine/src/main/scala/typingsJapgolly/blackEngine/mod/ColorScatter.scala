package typingsJapgolly.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "ColorScatter")
@js.native
open class ColorScatter ()
  extends typingsJapgolly.blackEngine.scattersColorScatterMod.ColorScatter {
  def this(startColor: Double) = this()
  def this(startColor: Double, endColor: Double) = this()
  def this(startColor: Unit, endColor: Double) = this()
  def this(startColor: Double, endColor: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(startColor: Double, endColor: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(startColor: Unit, endColor: Double, ease: js.Function1[/* arg0 */ Double, Double]) = this()
  def this(startColor: Unit, endColor: Unit, ease: js.Function1[/* arg0 */ Double, Double]) = this()
}
/* static members */
object ColorScatter {
  
  @JSImport("black-engine", "ColorScatter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObject(values: (Double | typingsJapgolly.blackEngine.scattersColorScatterBaseMod.ColorScatterBase)*): typingsJapgolly.blackEngine.scattersColorScatterBaseMod.ColorScatterBase = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.blackEngine.scattersColorScatterBaseMod.ColorScatterBase]
}
