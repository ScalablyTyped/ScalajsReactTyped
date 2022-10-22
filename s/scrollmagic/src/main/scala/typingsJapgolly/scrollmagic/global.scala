package typingsJapgolly.scrollmagic

import typingsJapgolly.scrollmagic.mod.ControllerConstructorOptions
import typingsJapgolly.scrollmagic.mod.SceneConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ScrollMagic {
    
    @JSGlobal("ScrollMagic.Controller")
    @js.native
    open class Controller ()
      extends typingsJapgolly.scrollmagic.mod.Controller {
      def this(options: ControllerConstructorOptions) = this()
    }
    
    @JSGlobal("ScrollMagic.Scene")
    @js.native
    open class Scene ()
      extends typingsJapgolly.scrollmagic.mod.Scene {
      def this(options: SceneConstructorOptions) = this()
    }
    
    @JSGlobal("ScrollMagic.version")
    @js.native
    val version: String = js.native
  }
}
