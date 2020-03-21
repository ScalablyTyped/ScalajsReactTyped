package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.baseLocationServiceMod.BaseLocationServices
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/memoryLocationService", JSImport.Namespace)
@js.native
object memoryLocationServiceMod extends js.Object {
  @js.native
  class MemoryLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
    var _url: String = js.native
  }
  
}

