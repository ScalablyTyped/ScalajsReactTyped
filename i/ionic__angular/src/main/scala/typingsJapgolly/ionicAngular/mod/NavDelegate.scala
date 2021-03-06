package typingsJapgolly.ionicAngular.mod

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavDelegate")
@js.native
class NavDelegate protected ()
  extends typingsJapgolly.ionicAngular.distMod.NavDelegate {
  def this(
    ref: ElementRef[_],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typingsJapgolly.ionicAngular.angularDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}

