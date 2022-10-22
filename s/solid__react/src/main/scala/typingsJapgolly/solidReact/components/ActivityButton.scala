package typingsJapgolly.solidReact.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.solidReact.mod.ActivityButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActivityButton {
  
  @JSImport("@solid/react", "ActivityButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ActivityButton.type): SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.ActivityButton] = new SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.ActivityButton](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActivityButtonProps & HTMLAttributes[HTMLButtonElement]): SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.ActivityButton] = new SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.ActivityButton](js.Array(this.component, p.asInstanceOf[js.Any]))
}
