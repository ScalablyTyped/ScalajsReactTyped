package typingsJapgolly.reactSpringWeb

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import typingsJapgolly.reactSpringWeb.reactSpringWebBooleans.`false`
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcApplyAnimatedValuesMod {
  
  @JSImport("@react-spring/web/dist/declarations/src/applyAnimatedValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyAnimatedValues(instance: Instance, props: Lookup[Any]): js.UndefOr[`false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnimatedValues")(instance.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`false`]]
  
  @js.native
  trait Instance
    extends StObject
       with HTMLDivElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    @JSName("style")
    var style_Instance: js.UndefOr[Lookup[Any]] = js.native
  }
}
