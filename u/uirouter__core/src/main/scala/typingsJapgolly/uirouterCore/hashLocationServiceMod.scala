package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.baseLocationServiceMod.BaseLocationServices
import typingsJapgolly.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/vanilla/hashLocationService", JSImport.Namespace)
@js.native
object hashLocationServiceMod extends js.Object {
  @js.native
  class HashLocationService protected () extends BaseLocationServices {
    def this(router: UIRouter) = this()
  }
  
}

