package typingsJapgolly.pnpmNpmConf.libTypesMod.types

import typingsJapgolly.pnpmNpmConf.libTypesMod.types.^
import typingsJapgolly.std.Boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@pnpm/npm-conf/lib/types", "types.production")
@js.native
/* standard es5 */
open class production ()
  extends StObject
     with Boolean {
  def this(value: Any) = this()
}
object production {
  
  /* standard es5 */
  inline def apply[T](): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("production")().asInstanceOf[scala.Boolean]
  inline def apply[T](value: T): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("production")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
