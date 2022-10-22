package typingsJapgolly.stylehacks

import typingsJapgolly.postcss.mod.Declaration
import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsSlash9Mod {
  
  @JSImport("stylehacks/types/plugins/slash9", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends Slash9 {
    def this(result: Result) = this()
  }
  
  @js.native
  trait Slash9
    extends typingsJapgolly.stylehacks.typesPluginMod.^ {
    
    /**
      * @param {import('postcss').Declaration} decl
      * @return {void}
      */
    def detect(decl: Declaration): Unit = js.native
  }
}
