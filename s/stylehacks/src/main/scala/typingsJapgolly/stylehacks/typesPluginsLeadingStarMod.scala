package typingsJapgolly.stylehacks

import typingsJapgolly.postcss.mod.AtRule_
import typingsJapgolly.postcss.mod.Declaration
import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsLeadingStarMod {
  
  @JSImport("stylehacks/types/plugins/leadingStar", JSImport.Namespace)
  @js.native
  /** @param {import('postcss').Result=} result */
  open class ^ () extends LeadingStar {
    def this(result: Result) = this()
  }
  
  @js.native
  trait LeadingStar
    extends typingsJapgolly.stylehacks.typesPluginMod.^ {
    
    def detect(node: AtRule_): Unit = js.native
    /**
      * @param {import('postcss').Declaration | import('postcss').AtRule} node
      * @return {void}
      */
    def detect(node: Declaration): Unit = js.native
  }
}
