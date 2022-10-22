package typingsJapgolly.parcelEnv

import typingsJapgolly.node.NodeModule
import typingsJapgolly.node.NodeRequire
import typingsJapgolly.parcelEnv.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  inline def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
}
