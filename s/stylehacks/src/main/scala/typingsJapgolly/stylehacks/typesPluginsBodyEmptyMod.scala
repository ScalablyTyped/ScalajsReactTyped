package typingsJapgolly.stylehacks

import typingsJapgolly.postcss.mod.Result
import typingsJapgolly.postcss.mod.Rule_
import typingsJapgolly.postcssSelectorParser.mod.SyncProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsBodyEmptyMod {
  
  @JSImport("stylehacks/types/plugins/bodyEmpty", JSImport.Namespace)
  @js.native
  open class ^ protected () extends BodyEmpty {
    /** @param {import('postcss').Result} result */
    def this(result: Result) = this()
  }
  
  @js.native
  trait BodyEmpty
    extends typingsJapgolly.stylehacks.typesPluginMod.^ {
    
    /**
      * @param {import('postcss').Rule} rule
      * @return {parser.SyncProcessor<void>}
      */
    def analyse(rule: Rule_): SyncProcessor[Unit] = js.native
    
    /**
      * @param {import('postcss').Rule} rule
      * @return {void}
      */
    def detect(rule: Rule_): Unit = js.native
  }
}
