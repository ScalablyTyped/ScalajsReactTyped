package typingsJapgolly.atAngularRouter.atAngularRouterMod

import typingsJapgolly.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typingsJapgolly.atAngularCore.atAngularCoreMod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "OutletContext")
@js.native
class OutletContext () extends js.Object {
  var attachRef: ComponentRef[_] | Null = js.native
  var children: ChildrenOutletContexts = js.native
  var outlet: RouterOutlet | Null = js.native
  var resolver: ComponentFactoryResolver | Null = js.native
  var route: ActivatedRoute | Null = js.native
}

