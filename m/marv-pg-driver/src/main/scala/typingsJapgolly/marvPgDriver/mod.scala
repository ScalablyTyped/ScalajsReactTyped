package typingsJapgolly.marvPgDriver

import typingsJapgolly.marv.mod.Driver
import typingsJapgolly.marvPgDriver.anon.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: Connection): Driver = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Driver]
  
  @JSImport("marv-pg-driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
