package typingsJapgolly.mathRandom

import typingsJapgolly.mathRandom.mathRandomBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  
  @JSImport("math-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("math-random", "cryptographic")
  @js.native
  def cryptographic: js.UndefOr[`true`] = js.native
  inline def cryptographic_=(x: js.UndefOr[`true`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cryptographic")(x.asInstanceOf[js.Any])
}
