package typingsJapgolly.inquirer

import typingsJapgolly.inquirer.inquirerStrings.down
import typingsJapgolly.inquirer.inquirerStrings.up
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.RawListQuestionOptions
import typingsJapgolly.inquirer.mod.inquirer.prompts.SuccessfulPromptStateData
import typingsJapgolly.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptsRawlistMod {
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @JSImport("inquirer/lib/prompts/rawlist", JSImport.Default)
  @js.native
  open class default[TQuestion /* <: Question */] protected () extends RawListPrompt[TQuestion] {
    /**
      * Initializes a new instance of the {@link RawListPrompt `RawListPrompt<TQuestion>`} class.
      *
      * @param question
      * The question to prompt the user to answer.
      *
      * @param readLine
      * An object for performing read from and write to the console.
      *
      * @param answers
      * The answer-object.
      */
    def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
  }
  
  /**
    * The question for the {@link RawListPrompt `RawListPrompt<TQuestion>`}.
    */
  type Question = RawListQuestionOptions[Answers]
  
  /**
    * Represents a prompt which provides a list to choose an answer from.
    *
    * @template TQuestion
    * The options for the question.
    */
  @js.native
  trait RawListPrompt[TQuestion /* <: Question */]
    extends typingsJapgolly.inquirer.libPromptsBaseMod.default[TQuestion] {
    
    /**
      * Resolves the value of the prompt.
      */
    /* protected */ def done(value: Any): Unit = js.native
    
    /**
      * Gets the value of the specified {@link index `index`}.
      *
      * @param index
      * The index to get the value for.
      *
      * @returns
      * The value of the specified {@link index `index`}.
      */
    /* protected */ def getCurrentValue(index: Double): Any = js.native
    
    /**
      * Handles the `ArrowKey`-event of the prompt.
      *
      * @param type
      * A value indicating whether the up or the down-arrow is being pressed.
      */
    /* protected */ def onArrowKey(`type`: up | down): Unit = js.native
    
    /**
      * Handles the `DownKey`-event of the prompt.
      */
    /* protected */ def onDownKey(): Unit = js.native
    
    /**
      * Handles the `success`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onEnd(eventArgs: SuccessfulPromptStateData[Any]): Unit = js.native
    
    /**
      * Handles the `error`-event of the prompt.
      *
      * @param eventArgs
      * An object which contains event-data.
      */
    /* protected */ def onError(): Unit = js.native
    
    /**
      * Handles the `Keypress`-event of the prompt.
      */
    /* protected */ def onKeypress(): Unit = js.native
    
    /**
      * Handles the `UpdKey`-event of the prompt.
      */
    /* protected */ def onUpKey(): Unit = js.native
    
    /**
      * Gets or sets an object for paginating the content.
      */
    /* protected */ var paginator: typingsJapgolly.inquirer.libUtilsPaginatorMod.default = js.native
    
    /**
      * Gets or sets the default index.
      */
    /* protected */ var rawDefault: Double = js.native
    
    /**
      * Renders the prompt.
      *
      * @param error
      * The error to render.
      */
    /* protected */ def render(): Unit = js.native
    /* protected */ def render(error: String): Unit = js.native
    
    /**
      * The index of the selected choice.
      */
    /* protected */ var selected: Double = js.native
  }
}
