package typingsJapgolly.xadesjs.buildTypesSrcMod

import org.scalajs.dom.Crypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xadesjs/build/types/src", "Application")
@js.native
open class Application ()
  extends typingsJapgolly.xmldsigjs.mod.Application
/* static members */
object Application {
  
  @JSImport("xadesjs/build/types/src", "Application")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNodePlugin(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodePlugin")().asInstanceOf[Boolean]
  
  /**
    * Sets crypto engine for the current Application
    * @param  {string} name
    * @param  {Crypto} crypto
    * @returns void
    */
  inline def setEngine(name: String, crypto: Crypto): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setEngine")(name.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
