package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.AriaLabel_
import typingsJapgolly.baseui.baseuiStrings.dark
import typingsJapgolly.baseui.baseuiStrings.light
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.baseui.messageCardTypesMod.MessageCardOverrides
import typingsJapgolly.baseui.messageCardTypesMod.MessageCardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageCard {
  
  inline def apply(onClick: ReactEventFrom[HTMLButtonElement] => Any): Builder = {
    val __props = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[MessageCardProps]))
  }
  
  @JSImport("baseui/message-card", "MessageCard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def backgroundColorType(value: light | dark): this.type = set("backgroundColorType", value.asInstanceOf[js.Any])
    
    inline def buttonKind(value: secondary | tertiary): this.type = set("buttonKind", value.asInstanceOf[js.Any])
    
    inline def buttonLabel(value: VdomNode): this.type = set("buttonLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def buttonLabelNull: this.type = set("buttonLabel", null)
    
    inline def buttonLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("buttonLabel", js.Array(value*))
    
    inline def buttonLabelVdomElement(value: VdomElement): this.type = set("buttonLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def heading(value: VdomNode): this.type = set("heading", value.rawNode.asInstanceOf[js.Any])
    
    inline def headingNull: this.type = set("heading", null)
    
    inline def headingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("heading", js.Array(value*))
    
    inline def headingVdomElement(value: VdomElement): this.type = set("heading", value.rawElement.asInstanceOf[js.Any])
    
    inline def image(value: AriaLabel_): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def overrides(value: MessageCardOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def paragraph(value: VdomNode): this.type = set("paragraph", value.rawNode.asInstanceOf[js.Any])
    
    inline def paragraphNull: this.type = set("paragraph", null)
    
    inline def paragraphVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("paragraph", js.Array(value*))
    
    inline def paragraphVdomElement(value: VdomElement): this.type = set("paragraph", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: MessageCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
