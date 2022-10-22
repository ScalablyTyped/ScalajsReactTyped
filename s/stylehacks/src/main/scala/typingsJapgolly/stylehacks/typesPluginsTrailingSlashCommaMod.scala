package typingsJapgolly.stylehacks

import typingsJapgolly.postcss.mod.Result
import typingsJapgolly.postcss.mod.Rule_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsTrailingSlashCommaMod {
  
  @JSImport("stylehacks/types/plugins/trailingSlashComma", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends TrailingSlashComma {
    def this(result: Result) = this()
  }
  
  @js.native
  trait TrailingSlashComma
    extends typingsJapgolly.stylehacks.typesPluginMod.^ {
    
    /**
      * @param {import('postcss').Rule} rule
      * @return {void}
      */
    def detect(rule: Rule_): Unit = js.native
  }
}
