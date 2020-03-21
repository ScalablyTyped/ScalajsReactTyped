package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.Services.ICoreServicesHost
import typingsJapgolly.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CoreServicesShim")
@js.native
class CoreServicesShim protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.CoreServicesShim {
  def this(factory: IShimFactory, host: ICoreServicesHost) = this()
}

