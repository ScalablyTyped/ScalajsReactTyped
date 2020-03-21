package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.ComponentFactoryResolver
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.ionicAngular.angularDelegateMod.AngularDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/nav-delegate", JSImport.Namespace)
@js.native
object navDelegateMod extends js.Object {
  @js.native
  class NavDelegate protected () extends js.Object {
    def this(
      ref: ElementRef[_],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
  }
  
}

