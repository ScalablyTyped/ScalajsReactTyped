package typingsJapgolly.kyUniversal

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Request
import org.scalajs.dom.Response
import typingsJapgolly.ky.distributionTypesKyMod.KyInstance
import typingsJapgolly.ky.distributionTypesOptionsMod.NormalizedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod extends Shortcut {
  
  @JSImport("ky-universal/browser", JSImport.Default)
  @js.native
  val default: KyInstance = js.native
  
  @JSImport("ky-universal/browser", "HTTPError")
  @js.native
  open class HTTPError protected ()
    extends typingsJapgolly.ky.mod.HTTPError {
    def this(response: Response, request: Request, options: NormalizedOptions) = this()
  }
  
  @JSImport("ky-universal/browser", "TimeoutError")
  @js.native
  open class TimeoutError protected ()
    extends typingsJapgolly.ky.mod.TimeoutError {
    def this(request: Request) = this()
  }
  
  type _To = KyInstance
  
  /* This means you don't have to write `default`, but can instead just say `browserMod.foo` */
  override def _to: KyInstance = default
}
