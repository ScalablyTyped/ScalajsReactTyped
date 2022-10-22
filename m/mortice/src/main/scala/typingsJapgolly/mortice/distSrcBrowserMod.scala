package typingsJapgolly.mortice

import org.scalajs.dom.EventTarget
import typingsJapgolly.mortice.anon.RequiredMorticeOptions
import typingsJapgolly.mortice.mod.MorticeImplementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserMod {
  
  @JSImport("mortice/dist/src/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: RequiredMorticeOptions): MorticeImplementation | EventTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[MorticeImplementation | EventTarget]
}
