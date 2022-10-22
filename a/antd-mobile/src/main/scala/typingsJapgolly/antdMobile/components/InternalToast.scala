package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorAlignmentBaseline
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.center
import typingsJapgolly.antdMobile.antdMobileStrings.fail
import typingsJapgolly.antdMobile.antdMobileStrings.loading
import typingsJapgolly.antdMobile.antdMobileStrings.success
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.esComponentsToastToastMod.ToastProps
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typingsJapgolly.antdMobile.esUtilsWithStopPropagationMod.PropagationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InternalToast {
  
  @JSImport("antd-mobile/es/components/toast/toast", "InternalToast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
    
    inline def getContainerNull: this.type = set("getContainer", null)
    
    inline def icon(value: success | fail | loading | Node): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    
    inline def maskClickable(value: Boolean): this.type = set("maskClickable", value.asInstanceOf[js.Any])
    
    inline def maskStyle(value: CSSPropertiesPartialRecorAlignmentBaseline): this.type = set("maskStyle", value.asInstanceOf[js.Any])
    
    inline def position(value: top | bottom | center): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def stopPropagation(value: js.Array[PropagationEvent]): this.type = set("stopPropagation", value.asInstanceOf[js.Any])
    
    inline def stopPropagationVarargs(value: PropagationEvent*): this.type = set("stopPropagation", js.Array(value*))
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InternalToast.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
