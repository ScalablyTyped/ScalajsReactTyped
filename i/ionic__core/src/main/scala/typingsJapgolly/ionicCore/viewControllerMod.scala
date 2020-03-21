package typingsJapgolly.ionicCore

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ionicCore.ionicCoreNumbers.`1`
import typingsJapgolly.ionicCore.ionicCoreNumbers.`2`
import typingsJapgolly.ionicCore.ionicCoreNumbers.`3`
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
@js.native
object viewControllerMod extends js.Object {
  @js.native
  class ViewController protected () extends js.Object {
    def this(component: js.Any) = this()
    def this(component: js.Any, params: ComponentProps[Null]) = this()
    var component: js.Any = js.native
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    var element: js.UndefOr[HTMLElement] = js.native
    var nav: js.UndefOr[js.Any] = js.native
    var params: js.UndefOr[ComponentProps[Null]] = js.native
    var state: Double = js.native
    /**
      * DOM WRITE
      */
    def _destroy(): Unit = js.native
    def init(container: HTMLElement): js.Promise[Unit] = js.native
  }
  
  val VIEW_STATE_ATTACHED: `2` = js.native
  val VIEW_STATE_DESTROYED: `3` = js.native
  val VIEW_STATE_NEW: `1` = js.native
  def convertToView(page: js.Any): ViewController | Null = js.native
  def convertToView(page: js.Any, params: ComponentProps[Null]): ViewController | Null = js.native
  def convertToViews(pages: js.Array[_]): js.Array[ViewController] = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: js.UndefOr[scala.Nothing], id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
  def matches(view: ViewController, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = js.native
}

