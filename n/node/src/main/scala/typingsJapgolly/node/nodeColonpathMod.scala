package typingsJapgolly.node

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.pathMod.PlatformPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeColonpathMod extends Shortcut {
  
  @JSImport("node:path", JSImport.Namespace)
  @js.native
  val ^ : PlatformPath = js.native
  
  type _To = PlatformPath
  
  /* This means you don't have to write `^`, but can instead just say `nodeColonpathMod.foo` */
  override def _to: PlatformPath = ^
}
