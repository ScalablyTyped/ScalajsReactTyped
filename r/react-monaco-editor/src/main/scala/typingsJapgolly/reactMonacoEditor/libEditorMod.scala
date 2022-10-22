package typingsJapgolly.reactMonacoEditor

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMonacoEditor.libTypesMod.MonacoEditorProps
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEditorMod {
  
  @JSImport("react-monaco-editor/lib/editor", JSImport.Default)
  @js.native
  open class default protected () extends MonacoEditor {
    def this(props: MonacoEditorProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.className")
      @js.native
      def className: Any = js.native
      inline def className_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.defaultValue")
      @js.native
      def defaultValue: String = js.native
      inline def defaultValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.editorDidMount")
      @js.native
      def editorDidMount: js.Function0[Unit] = js.native
      inline def editorDidMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.editorWillMount")
      @js.native
      def editorWillMount: js.Function0[Unit] = js.native
      inline def editorWillMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.editorWillUnmount")
      @js.native
      def editorWillUnmount: js.Function0[Unit] = js.native
      inline def editorWillUnmount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillUnmount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.language")
      @js.native
      def language: String = js.native
      inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      inline def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.theme")
      @js.native
      def theme: Any = js.native
      inline def theme_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.value")
      @js.native
      def value: Any = js.native
      inline def value_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.defaultValue")
      @js.native
      def defaultValue: Requireable[String] = js.native
      inline def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.editorDidMount")
      @js.native
      def editorDidMount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def editorDidMount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.editorWillMount")
      @js.native
      def editorWillMount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def editorWillMount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.editorWillUnmount")
      @js.native
      def editorWillUnmount: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def editorWillUnmount_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillUnmount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.height")
      @js.native
      def height: Requireable[NonNullable[String | Double]] = js.native
      inline def height_=(x: Requireable[NonNullable[String | Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.language")
      @js.native
      def language: Requireable[String] = js.native
      inline def language_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.options")
      @js.native
      def options: Requireable[js.Object] = js.native
      inline def options_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.overrideServices")
      @js.native
      def overrideServices: Requireable[js.Object] = js.native
      inline def overrideServices_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.theme")
      @js.native
      def theme: Requireable[String] = js.native
      inline def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/editor", "default.propTypes.width")
      @js.native
      def width: Requireable[NonNullable[String | Double]] = js.native
      inline def width_=(x: Requireable[NonNullable[String | Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MonacoEditor
    extends Component[MonacoEditorProps, js.Object, Any] {
    
    /* private */ var __prevent_trigger_change_event: Any = js.native
    
    /* private */ var _subscription: Any = js.native
    
    def assignRef(component: HTMLDivElement): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMonacoEditor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMonacoEditor(prevProps: MonacoEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMonacoEditor(): Unit = js.native
    
    /* private */ var containerElement: Any = js.native
    
    def destroyMonaco(): Unit = js.native
    
    var editor: js.UndefOr[IStandaloneCodeEditor] = js.native
    
    def editorDidMount(editor: IStandaloneCodeEditor): Unit = js.native
    
    def editorWillMount(): IStandaloneEditorConstructionOptions = js.native
    
    def editorWillUnmount(editor: IStandaloneCodeEditor): Unit = js.native
    
    def initMonaco(): Unit = js.native
  }
}
