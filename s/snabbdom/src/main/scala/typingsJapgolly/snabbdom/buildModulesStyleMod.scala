package typingsJapgolly.snabbdom

import typingsJapgolly.snabbdom.anon.Delayed
import typingsJapgolly.snabbdom.buildModulesModuleMod.Module
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildModulesStyleMod {
  
  @JSImport("snabbdom/build/modules/style", "styleModule")
  @js.native
  val styleModule: Module = js.native
  
  type VNodeStyle = (Record[String, String]) & Delayed
}
