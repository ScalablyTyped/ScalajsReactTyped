package typingsJapgolly.reactNativeDialog.components

import typingsJapgolly.reactNative.mod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("react-native-dialog", "default.Title")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): SharedBuilder_TextProps1643770914 = new SharedBuilder_TextProps1643770914(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextProps): SharedBuilder_TextProps1643770914 = new SharedBuilder_TextProps1643770914(js.Array(this.component, p.asInstanceOf[js.Any]))
}
