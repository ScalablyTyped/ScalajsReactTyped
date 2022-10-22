package typingsJapgolly.solidReact.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.solidReact.mod.ActivityButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dislike {
  
  @JSImport("@solid/react", "Dislike")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Dislike.type): SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.Dislike] = new SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.Dislike](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ActivityButtonProps & HTMLAttributes[HTMLButtonElement]): SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.Dislike] = new SharedBuilder_ActivityButtonPropsHTMLAttributes1960053912[typingsJapgolly.solidReact.mod.Dislike](js.Array(this.component, p.asInstanceOf[js.Any]))
}
