package typingsJapgolly.reactNativeHtmlview.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNode
import typingsJapgolly.reactNativeHtmlview.mod.HTMLViewNodeRenderer
import typingsJapgolly.reactNativeHtmlview.mod.HTMLViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeHtmlview {
  
  inline def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HTMLViewProps]))
  }
  
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def NodeComponent(value: ComponentType[js.Object]): this.type = set("NodeComponent", value.asInstanceOf[js.Any])
    
    inline def RootComponent(value: ComponentType[js.Object]): this.type = set("RootComponent", value.asInstanceOf[js.Any])
    
    inline def TextComponent(value: ComponentType[js.Object]): this.type = set("TextComponent", value.asInstanceOf[js.Any])
    
    inline def addLineBreaks(value: Boolean): this.type = set("addLineBreaks", value.asInstanceOf[js.Any])
    
    inline def bullet(value: String): this.type = set("bullet", value.asInstanceOf[js.Any])
    
    inline def lineBreak(value: String): this.type = set("lineBreak", value.asInstanceOf[js.Any])
    
    inline def nodeComponentProps(value: TextProps): this.type = set("nodeComponentProps", value.asInstanceOf[js.Any])
    
    inline def onLinkLongPress(value: /* url */ String => Callback): this.type = set("onLinkLongPress", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
    
    inline def onLinkPress(value: /* url */ String => Callback): this.type = set("onLinkPress", js.Any.fromFunction1((t0: /* url */ String) => value(t0).runNow()))
    
    inline def paragraphBreak(value: String): this.type = set("paragraphBreak", value.asInstanceOf[js.Any])
    
    inline def renderNode(
      value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ js.Array[HTMLViewNode], /* parent */ HTMLViewNode, /* defaultRenderer */ HTMLViewNodeRenderer) => Node
    ): this.type = set("renderNode", js.Any.fromFunction5(value))
    
    inline def rootComponentProps(value: ViewProps): this.type = set("rootComponentProps", value.asInstanceOf[js.Any])
    
    inline def textComponentProps(value: TextProps): this.type = set("textComponentProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HTMLViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
