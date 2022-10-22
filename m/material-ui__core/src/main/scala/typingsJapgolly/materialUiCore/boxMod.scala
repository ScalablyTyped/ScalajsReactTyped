package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.boxBoxMod.BoxProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod extends Shortcut {
  
  @JSImport("@material-ui/core/Box", JSImport.Default)
  @js.native
  val default: ComponentType[BoxProps] = js.native
  
  type _To = ComponentType[BoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `boxMod.foo` */
  override def _to: ComponentType[BoxProps] = default
}
