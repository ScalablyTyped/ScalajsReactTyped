package typingsJapgolly.ionicReact

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.ionicReact.anon.Present
import typingsJapgolly.ionicReact.anon.`11`
import typingsJapgolly.ionicReact.distTypesModelsReactComponentOrElementMod.ReactComponentOrElement
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseOverlayMod {
  
  @JSImport("@ionic/react/dist/types/hooks/useOverlay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOverlay[OptionsType, OverlayType /* <: OverlayBase */](
    displayName: String,
    controller: `11`[OptionsType, OverlayType],
    defineCustomElement: js.Function0[Unit],
    component: ReactComponentOrElement
  ): Present[OptionsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlay")(displayName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Present[OptionsType]]
  inline def useOverlay[OptionsType, OverlayType /* <: OverlayBase */](
    displayName: String,
    controller: `11`[OptionsType, OverlayType],
    defineCustomElement: js.Function0[Unit],
    component: ReactComponentOrElement,
    componentProps: Any
  ): Present[OptionsType] = (^.asInstanceOf[js.Dynamic].applyDynamic("useOverlay")(displayName.asInstanceOf[js.Any], controller.asInstanceOf[js.Any], defineCustomElement.asInstanceOf[js.Any], component.asInstanceOf[js.Any], componentProps.asInstanceOf[js.Any])).asInstanceOf[Present[OptionsType]]
  
  @js.native
  trait OverlayBase
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    
    def present(): js.Promise[Unit] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
