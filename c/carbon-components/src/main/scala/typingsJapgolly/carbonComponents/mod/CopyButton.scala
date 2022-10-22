package typingsJapgolly.carbonComponents.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.carbonComponents.anon.PartialCopyButtonOptions
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "CopyButton")
@js.native
open class CopyButton protected ()
  extends typingsJapgolly.carbonComponents.globalsJsComponentsMod.CopyButton {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialCopyButtonOptions) = this()
}
object CopyButton {
  
  @JSImport("carbon-components", "CopyButton")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "CopyButton.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
