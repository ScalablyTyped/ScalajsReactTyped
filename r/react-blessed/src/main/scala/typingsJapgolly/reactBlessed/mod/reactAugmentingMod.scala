package typingsJapgolly.reactBlessed.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// it isn't possible to use the global JSX namespace because some 'blessed'
// elements will collide with ones set in react defs.
// augment react JSX when old JSX transform is used
/* augmented module */
object reactAugmentingMod {
  
  object JSX {
    
    // set IntrinsicElements to 'react-blessed' elements both with and without
    // 'blessed-' prefix
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typingsJapgolly.reactBlessed.mod.BlessedIntrinsicElements because var conflicts: bigtext, box, button, checkbox, element, filemanager, input, layout, line, list, listbar, listtable, loading, log, message, progressbar, prompt, question, radiobutton, radioset, scrollablebox, scrollabletext, table, terminal, text, textarea, textbox. Inlined  */ trait IntrinsicElements
      extends StObject
         with BlessedIntrinsicElementsPrefixed
    object IntrinsicElements {
      
      inline def apply(
        bigtext: DetailedBlessedProps[BigTextElement],
        box: DetailedBlessedProps[BoxElement],
        button: DetailedBlessedProps[ButtonElement],
        checkbox: DetailedBlessedProps[CheckboxElement],
        element: DetailedBlessedProps[Element],
        filemanager: DetailedBlessedProps[FileManagerElement],
        input: DetailedBlessedProps[InputElement],
        layout: DetailedBlessedProps[typingsJapgolly.blessed.mod.Widgets.LayoutElement],
        line: DetailedBlessedProps[LineElement],
        list: DetailedBlessedProps[ListElement],
        listbar: DetailedBlessedProps[ListbarElement],
        listtable: DetailedBlessedProps[ListTableElement],
        loading: DetailedBlessedProps[LoadingElement],
        log: DetailedBlessedProps[LogElement],
        message: DetailedBlessedProps[MessageElement],
        progressbar: DetailedBlessedProps[ProgressBarElement],
        prompt: DetailedBlessedProps[PromptElement],
        question: DetailedBlessedProps[QuestionElement],
        radiobutton: DetailedBlessedProps[RadioButtonElement],
        radioset: DetailedBlessedProps[RadioSetElement],
        scrollablebox: DetailedBlessedProps[ScrollableBoxElement],
        scrollabletext: DetailedBlessedProps[ScrollableTextElement],
        table: DetailedBlessedProps[TableElement],
        terminal: DetailedBlessedProps[typingsJapgolly.blessed.mod.Widgets.TerminalElement],
        text: DetailedBlessedProps[TextElement],
        textarea: DetailedBlessedProps[TextareaElement],
        textbox: DetailedBlessedProps[TextboxElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(bigtext = bigtext.asInstanceOf[js.Any], box = box.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], filemanager = filemanager.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listbar = listbar.asInstanceOf[js.Any], listtable = listtable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progressbar = progressbar.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], radiobutton = radiobutton.asInstanceOf[js.Any], radioset = radioset.asInstanceOf[js.Any], scrollablebox = scrollablebox.asInstanceOf[js.Any], scrollabletext = scrollabletext.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], textbox = textbox.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
    }
  }
}
