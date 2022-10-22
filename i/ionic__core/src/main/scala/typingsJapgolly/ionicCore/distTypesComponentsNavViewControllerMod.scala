package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsNavNavInterfaceMod.NavComponentWithProps
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsNavViewControllerMod {
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_ATTACHED")
  @js.native
  val VIEW_STATE_ATTACHED: /* 2 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_DESTROYED")
  @js.native
  val VIEW_STATE_DESTROYED: /* 3 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_NEW")
  @js.native
  val VIEW_STATE_NEW: /* 1 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "ViewController")
  @js.native
  open class ViewController protected () extends StObject {
    def this(component: Any) = this()
    def this(component: Any, params: ComponentProps[Null]) = this()
    
    /**
      * DOM WRITE
      */
    def _destroy(): Unit = js.native
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
    
    var component: Any = js.native
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    def init(container: HTMLElement): js.Promise[Unit] = js.native
    
    var nav: js.UndefOr[Any] = js.native
    
    var params: js.UndefOr[ComponentProps[Null]] = js.native
    
    var state: Double = js.native
  }
  
  inline def convertToView(page: Any): ViewController | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToView")(page.asInstanceOf[js.Any]).asInstanceOf[ViewController | Null]
  inline def convertToView(page: Any, params: ComponentProps[Null]): ViewController | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToView")(page.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ViewController | Null]
  
  inline def convertToViews(pages: js.Array[NavComponentWithProps[Any]]): js.Array[ViewController] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToViews")(pages.asInstanceOf[js.Any]).asInstanceOf[js.Array[ViewController]]
  
  inline def matches(view: Unit, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: Unit, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: ViewController, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: ViewController, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
}
