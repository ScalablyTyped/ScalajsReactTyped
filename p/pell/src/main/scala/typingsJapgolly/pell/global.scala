package typingsJapgolly.pell

import org.scalajs.dom.HTMLElement
import typingsJapgolly.pell.mod.PellElement
import typingsJapgolly.pell.mod.pellConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object pell {
    
    @JSGlobal("pell")
    @js.native
    val ^ : js.Any = js.native
    
    inline def exec(command: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def exec(command: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(command.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def init[T /* <: HTMLElement */](c: pellConfig[T]): T & PellElement = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(c.asInstanceOf[js.Any]).asInstanceOf[T & PellElement]
  }
}
