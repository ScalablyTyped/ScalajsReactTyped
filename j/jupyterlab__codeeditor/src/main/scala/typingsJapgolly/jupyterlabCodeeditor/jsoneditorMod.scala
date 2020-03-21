package typingsJapgolly.jupyterlabCodeeditor

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsJapgolly.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/jsoneditor", JSImport.Namespace)
@js.native
object jsoneditorMod extends js.Object {
  @js.native
  class JSONEditor protected () extends Widget {
    /**
      * Construct a new JSON editor.
      */
    def this(options: IOptions) = this()
    var _changeGuard: js.Any = js.native
    var _dataDirty: js.Any = js.native
    /**
      * Handle blur events for the text area.
      */
    var _evtBlur: js.Any = js.native
    /**
      * Handle click events for the buttons.
      */
    var _evtClick: js.Any = js.native
    var _inputDirty: js.Any = js.native
    /**
      * Merge the user content.
      */
    var _mergeContent: js.Any = js.native
    /**
      * Handle a change to the metadata of the source.
      */
    var _onSourceChanged: js.Any = js.native
    /**
      * Handle change events.
      */
    var _onValueChanged: js.Any = js.native
    var _originalValue: js.Any = js.native
    /**
      * Set the value given the owner contents.
      */
    var _setValue: js.Any = js.native
    var _source: js.Any = js.native
    /**
      * The commit button used by the JSON editor.
      */
    val commitButtonNode: HTMLSpanElement = js.native
    /**
      * The code editor used by the editor.
      */
    val editor: IEditor = js.native
    /**
      * The editor host node used by the JSON editor.
      */
    val editorHostNode: HTMLDivElement = js.native
    /**
      * The editor host node used by the JSON editor.
      */
    val headerNode: HTMLDivElement = js.native
    /**
      * Get whether the editor is dirty.
      */
    val isDirty: Boolean = js.native
    /**
      * The code editor model used by the editor.
      */
    val model: IModel = js.native
    /**
      * The revert button used by the JSON editor.
      */
    val revertButtonNode: HTMLSpanElement = js.native
    /**
      * The observable source.
      */
    var source: IObservableJSON | Null = js.native
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event_): Unit = js.native
  }
  
  @js.native
  object JSONEditor extends js.Object {
    /**
      * The options used to initialize a json editor.
      */
    @js.native
    trait IOptions extends js.Object {
      /**
        * The editor factory used by the editor.
        */
      @JSName("editorFactory")
      var editorFactory_Original: Factory = js.native
      /**
        * The editor factory used by the editor.
        */
      def editorFactory(options: typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions): IEditor = js.native
    }
    
  }
  
}

