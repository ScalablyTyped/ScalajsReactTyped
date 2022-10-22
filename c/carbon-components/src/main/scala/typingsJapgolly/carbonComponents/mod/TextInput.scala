package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialTextInputOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "TextInput")
@js.native
open class TextInput protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.TextInput {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialTextInputOptions) = this()
}
/* static members */
object TextInput {
  
  @JSImport("carbon-components", "TextInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components", "TextInput.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
