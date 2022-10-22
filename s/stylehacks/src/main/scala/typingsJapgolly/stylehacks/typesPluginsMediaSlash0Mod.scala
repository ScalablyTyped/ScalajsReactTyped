package typingsJapgolly.stylehacks

import typingsJapgolly.postcss.mod.AtRule_
import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsMediaSlash0Mod {
  
  @JSImport("stylehacks/types/plugins/mediaSlash0", JSImport.Namespace)
  @js.native
  open class ^ protected () extends MediaSlash0 {
    /** @param {import('postcss').Result} result */
    def this(result: Result) = this()
  }
  
  @js.native
  trait MediaSlash0
    extends typingsJapgolly.stylehacks.typesPluginMod.^ {
    
    /**
      * @param {import('postcss').AtRule} rule
      * @return {void}
      */
    def detect(rule: AtRule_): Unit = js.native
  }
}
