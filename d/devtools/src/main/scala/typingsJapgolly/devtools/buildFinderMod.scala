package typingsJapgolly.devtools

import typingsJapgolly.devtools.devtoolsStrings.edge
import typingsJapgolly.devtools.devtoolsStrings.firefox
import typingsJapgolly.node.processMod.global.NodeJS.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFinderMod {
  
  @JSImport("devtools/build/finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(browserName: firefox | edge, platform: Platform): js.Function0[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(browserName.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[js.Function0[js.Array[String]]]
}
