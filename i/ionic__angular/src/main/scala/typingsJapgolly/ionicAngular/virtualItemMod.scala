package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.ionicAngular.virtualUtilsMod.VirtualContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/virtual-scroll/virtual-item", JSImport.Namespace)
@js.native
object virtualItemMod extends js.Object {
  @js.native
  class VirtualItem protected () extends js.Object {
    def this(templateRef: TemplateRef[VirtualContext], viewContainer: ViewContainerRef) = this()
    var templateRef: TemplateRef[VirtualContext] = js.native
    var viewContainer: ViewContainerRef = js.native
  }
  
}

