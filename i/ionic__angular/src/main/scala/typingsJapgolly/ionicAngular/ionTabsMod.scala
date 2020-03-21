package typingsJapgolly.ionicAngular

import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typingsJapgolly.ionicAngular.navControllerMod.NavController
import typingsJapgolly.ionicAngular.proxiesMod.IonTabBar
import typingsJapgolly.ionicAngular.stackUtilsMod.StackEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-tabs", JSImport.Namespace)
@js.native
object ionTabsMod extends js.Object {
  @js.native
  class IonTabs protected () extends js.Object {
    def this(navCtrl: NavController) = this()
    var ionTabsDidChange: EventEmitter[AnonTab] = js.native
    var ionTabsWillChange: EventEmitter[AnonTab] = js.native
    var navCtrl: js.Any = js.native
    var outlet: IonRouterOutlet = js.native
    var tabBar: js.UndefOr[IonTabBar] = js.native
    def getSelected(): js.UndefOr[String] = js.native
    /**
      * @internal
      */
    def onPageSelected(detail: StackEvent): Unit = js.native
    def select(tab: String): js.Promise[Boolean] = js.native
  }
  
}

