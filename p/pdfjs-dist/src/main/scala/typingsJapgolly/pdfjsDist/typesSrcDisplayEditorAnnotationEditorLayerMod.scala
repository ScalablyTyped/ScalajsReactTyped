package typingsJapgolly.pdfjsDist

import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayEditorAnnotationEditorLayerMod {
  
  @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer")
  @js.native
  open class AnnotationEditorLayer protected () extends StObject {
    /**
      * @param {AnnotationEditorLayerOptions} options
      */
    def this(options: AnnotationEditorLayerOptions) = this()
    
    /**
      * Add a new editor in the current view.
      * @param {AnnotationEditor} editor
      */
    def add(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add a new editor and make this addition undoable.
      * @param {AnnotationEditor} editor
      */
    def addANewEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add some commands into the CommandManager (undo/redo stuff).
      * @param {Object} params
      */
    def addCommands(params: js.Object): Unit = js.native
    
    def addInkEditorIfNeeded(isCommitting: Any): Unit = js.native
    
    /**
      * Add or rebuild depending if it has been removed or not.
      * @param {AnnotationEditor} editor
      */
    def addOrRebuild(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add an editor in the annotation storage.
      * @param {AnnotationEditor} editor
      */
    def addToAnnotationStorage(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add a new editor and make this addition undoable.
      * @param {AnnotationEditor} editor
      */
    def addUndoableEditor(editor: AnnotationEditor): Unit = js.native
    
    var annotationStorage: typingsJapgolly.pdfjsDist.typesSrcDisplayAnnotationStorageMod.AnnotationStorage = js.native
    
    def attach(editor: Any): Unit = js.native
    
    /**
      * Create a new editor
      * @param {Object} data
      * @returns {AnnotationEditor}
      */
    def deserialize(data: js.Object): AnnotationEditor = js.native
    
    /**
      * Destroy the main editor.
      */
    def destroy(): Unit = js.native
    
    def detach(editor: Any): Unit = js.native
    
    /**
      * Disable editor creation.
      */
    def disable(): Unit = js.native
    
    def disableClick(): Unit = js.native
    
    var div: HTMLDivElement = js.native
    
    /**
      * Dragover callback.
      * @param {DragEvent} event
      */
    def dragover(event: DragEvent): Unit = js.native
    
    /**
      * Drag callback.
      * @param {DragEvent} event
      */
    def drop(event: DragEvent): Unit = js.native
    
    /**
      * Enable pointer events on the main div in order to enable
      * editor creation.
      */
    def enable(): Unit = js.native
    
    def enableClick(): Unit = js.native
    
    /**
      * Get an id for an editor.
      * @returns {string}
      */
    def getNextId(): String = js.native
    
    /**
      * Check if the editor is selected.
      * @param {AnnotationEditor} editor
      */
    def isSelected(editor: AnnotationEditor): Boolean = js.native
    
    def moveEditorInDOM(editor: Any): Unit = js.native
    
    /**
      * Get page dimensions.
      * @returns {Object} dimensions.
      */
    def pageDimensions: js.Object = js.native
    
    var pageIndex: Double = js.native
    
    /**
      * Pointerdown callback.
      * @param {PointerEvent} event
      */
    def pointerdown(event: PointerEvent): Unit = js.native
    
    /**
      * Pointerup callback.
      * @param {PointerEvent} event
      */
    def pointerup(event: PointerEvent): Unit = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * Remove an editor.
      * @param {AnnotationEditor} editor
      */
    def remove(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Render the main editor.
      * @param {Object} parameters
      */
    def render(parameters: js.Object): Unit = js.native
    
    /**
      * Get the scale factor from the viewport.
      * @returns {number}
      */
    def scaleFactor: Double = js.native
    
    /**
      * Set the current editor.
      * @param {AnnotationEditor} editor
      */
    def setActiveEditor(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Set the dimensions of the main div.
      */
    def setDimensions(): Unit = js.native
    
    /**
      * Set the editing state.
      * @param {boolean} isEditing
      */
    def setEditingState(isEditing: Boolean): Unit = js.native
    
    /**
      * Set the last selected editor.
      * @param {AnnotationEditor} editor
      */
    def setSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Add or remove an editor the current selection.
      * @param {AnnotationEditor} editor
      */
    def toggleSelected(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Unselect an editor.
      * @param {AnnotationEditor} editor
      */
    def unselect(editor: AnnotationEditor): Unit = js.native
    
    /**
      * Update the main editor.
      * @param {Object} parameters
      */
    def update(parameters: js.Object): Unit = js.native
    
    /**
      * The mode has changed: it must be updated.
      * @param {number} mode
      */
    def updateMode(): Unit = js.native
    def updateMode(mode: Double): Unit = js.native
    
    /**
      * Update the toolbar if it's required to reflect the tool currently used.
      * @param {number} mode
      */
    def updateToolbar(mode: Double): Unit = js.native
    
    var viewport: Any = js.native
    
    def viewportBaseDimensions: js.Array[Any] = js.native
  }
  /* static members */
  object AnnotationEditorLayer {
    
    @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pdfjs-dist/types/src/display/editor/annotation_editor_layer", "AnnotationEditorLayer._initialized")
    @js.native
    def _initialized: Boolean = js.native
    inline def _initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_initialized")(x.asInstanceOf[js.Any])
  }
  
  type AnnotationEditor = typingsJapgolly.pdfjsDist.typesSrcDisplayEditorEditorMod.AnnotationEditor
  
  trait AnnotationEditorLayerOptions extends StObject {
    
    var accessibilityManager: js.UndefOr[Any] = js.undefined
    
    var annotationStorage: AnnotationStorage
    
    var div: HTMLDivElement
    
    var enabled: Boolean
    
    var l10n: Any
    
    var mode: js.Object
    
    var pageIndex: Double
    
    var uiManager: AnnotationEditorUIManager
  }
  object AnnotationEditorLayerOptions {
    
    inline def apply(
      annotationStorage: AnnotationStorage,
      div: HTMLDivElement,
      enabled: Boolean,
      l10n: Any,
      mode: js.Object,
      pageIndex: Double,
      uiManager: AnnotationEditorUIManager
    ): AnnotationEditorLayerOptions = {
      val __obj = js.Dynamic.literal(annotationStorage = annotationStorage.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], uiManager = uiManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnnotationEditorLayerOptions]
    }
    
    extension [Self <: AnnotationEditorLayerOptions](x: Self) {
      
      inline def setAccessibilityManager(value: Any): Self = StObject.set(x, "accessibilityManager", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityManagerUndefined: Self = StObject.set(x, "accessibilityManager", js.undefined)
      
      inline def setAnnotationStorage(value: AnnotationStorage): Self = StObject.set(x, "annotationStorage", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: HTMLDivElement): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setL10n(value: Any): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
      
      inline def setMode(value: js.Object): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setUiManager(value: AnnotationEditorUIManager): Self = StObject.set(x, "uiManager", value.asInstanceOf[js.Any])
    }
  }
  
  type AnnotationEditorUIManager = typingsJapgolly.pdfjsDist.typesSrcDisplayEditorToolsMod.AnnotationEditorUIManager
  
  type AnnotationStorage = typingsJapgolly.pdfjsDist.typesSrcDisplayAnnotationStorageMod.AnnotationStorage
  
  type IL10n = Any
  
  type TextAccessibilityManager = Any
}
