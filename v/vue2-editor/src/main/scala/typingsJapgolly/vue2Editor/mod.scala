package typingsJapgolly.vue2Editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue2-editor", JSImport.Default)
  @js.native
  val default: VueEditorConstructor = js.native
  
  @JSImport("vue2-editor", "VueEditor")
  @js.native
  val VueEditor: VueEditorConstructor = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait VueEditorConstructor extends StObject {
    
    def data(): VueEditorData
    
    var methods: VueEditorMethods
    
    var props: VueEditorProps
    
    var watch: VueEditorWatch
  }
  object VueEditorConstructor {
    
    inline def apply(
      data: CallbackTo[VueEditorData],
      methods: VueEditorMethods,
      props: VueEditorProps,
      watch: VueEditorWatch
    ): VueEditorConstructor = {
      val __obj = js.Dynamic.literal(data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorConstructor]
    }
    
    extension [Self <: VueEditorConstructor](x: Self) {
      
      inline def setData(value: CallbackTo[VueEditorData]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: VueEditorMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: VueEditorProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: VueEditorWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorData extends StObject {
    
    var quill: Any
  }
  object VueEditorData {
    
    inline def apply(quill: Any): VueEditorData = {
      val __obj = js.Dynamic.literal(quill = quill.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorData]
    }
    
    extension [Self <: VueEditorData](x: Self) {
      
      inline def setQuill(value: Any): Self = StObject.set(x, "quill", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorMethods extends StObject {
    
    def checkForCustomImageHandler(): Unit
    
    def customImageHandler(image: Any, callback: Any): Unit
    
    def emitImageInfo($event: Event): Unit
    
    def handleInitialContent(): Unit
    
    def handleSelectionChange(range: Any, oldRange: Any): Unit
    
    def handleTextChange(): Unit
    
    def initializeEditor(): Unit
    
    def listenForEditorEvent(`type`: Any): Unit
    
    def prepareEditorConfig(editorConfig: Any): Unit
    
    def registerEditorEventListeners(): Unit
    
    def registerPrototypes(): Unit
    
    def setModules(): Unit
    
    def setupCustomImageHandler(): Unit
    
    def setupQuillEditor(): Unit
  }
  object VueEditorMethods {
    
    inline def apply(
      checkForCustomImageHandler: Callback,
      customImageHandler: (Any, Any) => Callback,
      emitImageInfo: Event => Callback,
      handleInitialContent: Callback,
      handleSelectionChange: (Any, Any) => Callback,
      handleTextChange: Callback,
      initializeEditor: Callback,
      listenForEditorEvent: Any => Callback,
      prepareEditorConfig: Any => Callback,
      registerEditorEventListeners: Callback,
      registerPrototypes: Callback,
      setModules: Callback,
      setupCustomImageHandler: Callback,
      setupQuillEditor: Callback
    ): VueEditorMethods = {
      val __obj = js.Dynamic.literal(checkForCustomImageHandler = checkForCustomImageHandler.toJsFn, customImageHandler = js.Any.fromFunction2((t0: Any, t1: Any) => (customImageHandler(t0, t1)).runNow()), emitImageInfo = js.Any.fromFunction1((t0: Event) => emitImageInfo(t0).runNow()), handleInitialContent = handleInitialContent.toJsFn, handleSelectionChange = js.Any.fromFunction2((t0: Any, t1: Any) => (handleSelectionChange(t0, t1)).runNow()), handleTextChange = handleTextChange.toJsFn, initializeEditor = initializeEditor.toJsFn, listenForEditorEvent = js.Any.fromFunction1((t0: Any) => listenForEditorEvent(t0).runNow()), prepareEditorConfig = js.Any.fromFunction1((t0: Any) => prepareEditorConfig(t0).runNow()), registerEditorEventListeners = registerEditorEventListeners.toJsFn, registerPrototypes = registerPrototypes.toJsFn, setModules = setModules.toJsFn, setupCustomImageHandler = setupCustomImageHandler.toJsFn, setupQuillEditor = setupQuillEditor.toJsFn)
      __obj.asInstanceOf[VueEditorMethods]
    }
    
    extension [Self <: VueEditorMethods](x: Self) {
      
      inline def setCheckForCustomImageHandler(value: Callback): Self = StObject.set(x, "checkForCustomImageHandler", value.toJsFn)
      
      inline def setCustomImageHandler(value: (Any, Any) => Callback): Self = StObject.set(x, "customImageHandler", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setEmitImageInfo(value: Event => Callback): Self = StObject.set(x, "emitImageInfo", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setHandleInitialContent(value: Callback): Self = StObject.set(x, "handleInitialContent", value.toJsFn)
      
      inline def setHandleSelectionChange(value: (Any, Any) => Callback): Self = StObject.set(x, "handleSelectionChange", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setHandleTextChange(value: Callback): Self = StObject.set(x, "handleTextChange", value.toJsFn)
      
      inline def setInitializeEditor(value: Callback): Self = StObject.set(x, "initializeEditor", value.toJsFn)
      
      inline def setListenForEditorEvent(value: Any => Callback): Self = StObject.set(x, "listenForEditorEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPrepareEditorConfig(value: Any => Callback): Self = StObject.set(x, "prepareEditorConfig", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRegisterEditorEventListeners(value: Callback): Self = StObject.set(x, "registerEditorEventListeners", value.toJsFn)
      
      inline def setRegisterPrototypes(value: Callback): Self = StObject.set(x, "registerPrototypes", value.toJsFn)
      
      inline def setSetModules(value: Callback): Self = StObject.set(x, "setModules", value.toJsFn)
      
      inline def setSetupCustomImageHandler(value: Callback): Self = StObject.set(x, "setupCustomImageHandler", value.toJsFn)
      
      inline def setSetupQuillEditor(value: Callback): Self = StObject.set(x, "setupQuillEditor", value.toJsFn)
    }
  }
  
  trait VueEditorProps extends StObject {
    
    var disabled: Boolean
    
    var editorOptions: Any
    
    var editorToolbar: js.Array[Any]
    
    var id: String
    
    var placeholder: String
    
    var useCustomImageHandler: Any
    
    var useMarkdownShortcuts: Boolean
    
    var value: String
  }
  object VueEditorProps {
    
    inline def apply(
      disabled: Boolean,
      editorOptions: Any,
      editorToolbar: js.Array[Any],
      id: String,
      placeholder: String,
      useCustomImageHandler: Any,
      useMarkdownShortcuts: Boolean,
      value: String
    ): VueEditorProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], editorToolbar = editorToolbar.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], useCustomImageHandler = useCustomImageHandler.asInstanceOf[js.Any], useMarkdownShortcuts = useMarkdownShortcuts.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[VueEditorProps]
    }
    
    extension [Self <: VueEditorProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorToolbar(value: js.Array[Any]): Self = StObject.set(x, "editorToolbar", value.asInstanceOf[js.Any])
      
      inline def setEditorToolbarVarargs(value: Any*): Self = StObject.set(x, "editorToolbar", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setUseCustomImageHandler(value: Any): Self = StObject.set(x, "useCustomImageHandler", value.asInstanceOf[js.Any])
      
      inline def setUseMarkdownShortcuts(value: Boolean): Self = StObject.set(x, "useMarkdownShortcuts", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VueEditorWatch extends StObject {
    
    def disabled(status: Boolean): Unit
    
    def value(`val`: Any): Unit
  }
  object VueEditorWatch {
    
    inline def apply(disabled: Boolean => Callback, value: Any => Callback): VueEditorWatch = {
      val __obj = js.Dynamic.literal(disabled = js.Any.fromFunction1((t0: Boolean) => disabled(t0).runNow()), value = js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      __obj.asInstanceOf[VueEditorWatch]
    }
    
    extension [Self <: VueEditorWatch](x: Self) {
      
      inline def setDisabled(value: Boolean => Callback): Self = StObject.set(x, "disabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setValue(value: Any => Callback): Self = StObject.set(x, "value", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type _To = VueEditorConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: VueEditorConstructor = default
}
