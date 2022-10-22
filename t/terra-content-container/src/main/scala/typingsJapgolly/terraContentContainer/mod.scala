package typingsJapgolly.terraContentContainer

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.terraContentContainer.libContentContainerMod.ContentContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("terra-content-container", JSImport.Default)
  @js.native
  val default: FC[ContentContainerProps] = js.native
  
  type _To = FC[ContentContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[ContentContainerProps] = default
}
