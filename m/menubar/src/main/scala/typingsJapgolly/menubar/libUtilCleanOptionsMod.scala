package typingsJapgolly.menubar

import typingsJapgolly.menubar.anon.PartialOptions
import typingsJapgolly.menubar.libTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilCleanOptionsMod {
  
  @JSImport("menubar/lib/util/cleanOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanOptions")().asInstanceOf[Options]
  inline def cleanOptions(opts: PartialOptions): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Options]
}
