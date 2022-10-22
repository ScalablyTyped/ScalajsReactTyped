package typingsJapgolly.pnpmNpmConf.libTypesMod.types

import typingsJapgolly.pnpmNpmConf.libTypesMod.types.^
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.fetch-retry-factor")
@js.native
/* standard es5 */
open class fetchRetryFactor ()
  extends StObject
     with Number {
  def this(value: Any) = this()
}
object fetchRetryFactor {
  
  /* standard es5 */
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch-retry-factor")().asInstanceOf[Double]
  inline def apply(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch-retry-factor")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
