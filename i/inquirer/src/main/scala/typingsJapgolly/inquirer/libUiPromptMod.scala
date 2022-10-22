package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.StreamOptions
import typingsJapgolly.inquirer.mod.default.ui.Prompt
import typingsJapgolly.inquirer.mod.inquirer.prompts.PromptCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUiPromptMod {
  
  /**
    * Represents the prompt ui.
    */
  @JSImport("inquirer/lib/ui/prompt", JSImport.Default)
  @js.native
  open class default[T /* <: Answers */] protected () extends Prompt[T] {
    /**
      * Initializes a new instance of the {@link Prompt `Prompt`} class.
      *
      * @param prompts
      * The prompts for the ui.
      *
      * @param options
      * The input- and output-stream of the ui.
      */
    def this(prompts: PromptCollection) = this()
    def this(prompts: PromptCollection, options: StreamOptions) = this()
  }
}
