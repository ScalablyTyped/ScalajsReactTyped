package typingsJapgolly.slimerjs

import typingsJapgolly.slimerjs.slimerjsStrings.fs
import typingsJapgolly.slimerjs.slimerjsStrings.system
import typingsJapgolly.slimerjs.slimerjsStrings.webpage
import typingsJapgolly.slimerjs.slimerjsStrings.webserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("phantom")
  @js.native
  def phantom: Phantom = js.native
  inline def phantom_=(x: Phantom): Unit = js.Dynamic.global.updateDynamic("phantom")(x.asInstanceOf[js.Any])
  
  inline def require(module: Any): Any = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def require_fs(module: fs): FsModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[FsModule]
  
  inline def require_system(module: system): SystemModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[SystemModule]
  
  inline def require_webpage(module: webpage): WebPageModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[WebPageModule]
  
  inline def require_webserver(module: webserver): WebServerModule = js.Dynamic.global.applyDynamic("require")(module.asInstanceOf[js.Any]).asInstanceOf[WebServerModule]
  
  @JSGlobal("slimer")
  @js.native
  def slimer: Slimer = js.native
  inline def slimer_=(x: Slimer): Unit = js.Dynamic.global.updateDynamic("slimer")(x.asInstanceOf[js.Any])
}
