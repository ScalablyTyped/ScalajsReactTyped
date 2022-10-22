package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "AccessibilityManager")
@js.native
open class AccessibilityManager protected ()
  extends typingsJapgolly.pixiAccessibility.mod.AccessibilityManager {
  /**
    * @param {PIXI.CanvasRenderer|PIXI.Renderer} renderer - A reference to the current renderer
    */
  def this(renderer: typingsJapgolly.pixiCore.mod.AbstractRenderer) = this()
  def this(renderer: typingsJapgolly.pixiCore.mod.Renderer) = this()
}
/* static members */
object AccessibilityManager {
  
  /** @ignore */
  @JSImport("pixi.js", "AccessibilityManager.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
