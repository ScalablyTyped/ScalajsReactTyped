package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.anon.OnDeviceBackButton
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.ascend
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fade
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fall
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.lift
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLAttributesidclassName & OnDeviceBackButton]))
  }
  
  @JSImport("react-onsenui", "Toast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.Toast] {
    
    inline def animation(value: default | ascend | lift | fall | fade | none): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def onDeviceBackButton(value: Callback): this.type = set("onDeviceBackButton", value.toJsFn)
    
    inline def onPostHide(value: Callback): this.type = set("onPostHide", value.toJsFn)
    
    inline def onPostShow(value: Callback): this.type = set("onPostShow", value.toJsFn)
    
    inline def onPreHide(value: Callback): this.type = set("onPreHide", value.toJsFn)
    
    inline def onPreShow(value: Callback): this.type = set("onPreShow", value.toJsFn)
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLAttributesidclassName & OnDeviceBackButton): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
