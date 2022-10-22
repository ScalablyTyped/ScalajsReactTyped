package typingsJapgolly.inquirerAutocompletePrompt

import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.KeyUnion
import typingsJapgolly.inquirer.mod.Question
import typingsJapgolly.inquirer.mod.QuestionCollection
import typingsJapgolly.inquirerAutocompletePrompt.anon.Key
import typingsJapgolly.inquirerAutocompletePrompt.inquirerAutocompletePromptStrings.autocomplete
import typingsJapgolly.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  @JSImport("inquirer-autocomplete-prompt", JSImport.Default)
  @js.native
  open class default[T /* <: Answers */] protected () extends AutocompletePrompt[T] {
    /**
      * Create new AutocompletePrompt
      *
      * @param questions
      * The questions to prompt
      * @param rl
      * The readline interface
      * @param answers
      * The currently supplied answers
      */
    def this(questions: QuestionCollection[T], rl: Interface, answers: Answers) = this()
  }
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  @js.native
  trait AutocompletePrompt[T /* <: Answers */]
    extends typingsJapgolly.inquirer.libPromptsBaseMod.default[Question[Answers]] {
    
    /**
      * The choices currently available on the prompt
      */
    var currentChoices: typingsJapgolly.inquirer.libObjectsChoicesMod.default[Answers] = js.native
    
    /**
      * Verify selected range is not out of bounds
      */
    def ensureSelectedInRange(): Unit = js.native
    
    /**
      * Flag that is true on first render
      */
    var firstRender: Boolean = js.native
    
    /**
      * Initial value of answer
      */
    var initialValue: Any = js.native
    
    /**
      * When user types
      *
      * @param e
      * Object containing info on the key pressed and the value of the selected option
      */
    def onKeypress(e: Key): Unit = js.native
    
    /**
      * When user presses `enter` key
      *
      * @param line
      * The input on the line.
      */
    def onSubmit(line: String): Unit = js.native
    
    /**
      * When user presses `enter` key and validation has passed.
      *
      * @param line
      * The input on the line.
      */
    def onSubmitAfterValidation(line: String): Unit = js.native
    
    /**
      * Paginator for choices
      */
    var paginator: typingsJapgolly.inquirer.libUtilsPaginatorMod.default = js.native
    
    /**
      * Questions to prompt
      */
    var questions: QuestionCollection[T] = js.native
    
    /**
      * Render the prompt to screen
      */
    def render(): Unit = js.native
    def render(error: String): Unit = js.native
    
    /**
      * Curate list of choices.
      *
      * @param searchTerm
      * The term to search for
      */
    def search(searchTerm: String): js.Promise[Unit] = js.native
    
    /**
      * Currently selected choice index
      */
    var selected: Double = js.native
  }
  /**
    * Provides inquirer prompt options for type `AutocompletePrompt`.
    */
  object AutocompletePrompt {
    
    /**
      * Provides options for a question of type `AutocompletePrompt`.
      *
      * @template T
      * The type of the answers.
      */
    @js.native
    trait AutocompleteQuestionOptions[T /* <: Answers */]
      extends StObject
         with Question[T] {
      
      /**
        *  Is the text shown if the search returns no results. Defaults: No results...
        */
      var emptyText: js.UndefOr[Boolean] = js.native
      
      /**
        * The key to save the answer to the answers-hash.
        */
      @JSName("name")
      var name_AutocompleteQuestionOptions: KeyUnion[T] = js.native
      
      /**
        * The number of elements to show on each page.
        */
      var pageSize: js.UndefOr[Double] = js.native
      
      /**
        * Is the text shown when searching. Defaults: Searching...
        */
      var searchText: js.UndefOr[Boolean] = js.native
      
      /**
        * Function to determine what options to display to user.
        * Called with previous answers object and the current user input each time the user types, it must return a promise.
        */
      def source(answersSoFar: T): js.Promise[js.Array[Any]] = js.native
      def source(answersSoFar: T, input: String): js.Promise[js.Array[Any]] = js.native
      
      /**
        * default false. Setting it to true turns the input into a normal text input.
        */
      var suggestOnly: js.UndefOr[Boolean] = js.native
      
      /**
        * The key to save the answer to the answers-hash.
        */
      @JSName("type")
      var type_AutocompleteQuestionOptions: autocomplete = js.native
    }
  }
}
