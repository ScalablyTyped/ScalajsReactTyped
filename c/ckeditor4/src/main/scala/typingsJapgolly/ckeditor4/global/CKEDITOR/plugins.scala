package typingsJapgolly.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.DataTransfer
import org.scalajs.dom.Event
import typingsJapgolly.ckeditor4.CKEDITOR.dom.domObject
import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.dom.elementPath
import typingsJapgolly.ckeditor4.CKEDITOR.dom.node
import typingsJapgolly.ckeditor4.CKEDITOR.dom.range
import typingsJapgolly.ckeditor4.CKEDITOR.fileTools.fileLoader
import typingsJapgolly.ckeditor4.CKEDITOR.pluginDefinition
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.balloontoolbar.contextDefinition
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.embedBase.baseDefinition
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.imagebase.imageWidgetDefinition
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.updateOptions
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.pastefromword.lists.numbering
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.definition
import typingsJapgolly.ckeditor4.anon.Exec
import typingsJapgolly.ckeditor4.anon.Filter
import typingsJapgolly.ckeditor4.anon.Removed
import typingsJapgolly.ckeditor4.anon.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugins {
  
  @JSGlobal("CKEDITOR.plugins")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def add(name: String, definition: pluginDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExternal(name: String, path: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternal")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExternal(name: String, path: String, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternal")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.plugins.autoEmbed")
  @js.native
  open class autoEmbed ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.autoEmbed {
    
    /* CompleteClass */
    override def getWidgetDefinition(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, url: String): definition = js.native
  }
  
  object balloontoolbar {
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.context")
    @js.native
    open class context protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.balloontoolbar.context {
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, options: contextDefinition) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.balloontoolbar.contextManager")
    @js.native
    open class contextManager protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.balloontoolbar.contextManager {
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor) = this()
    }
  }
  
  object clipboard {
    
    @JSGlobal("CKEDITOR.plugins.clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addPasteButton(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, name: String, definition: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPasteButton")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def canClipboardApiBeTrusted(
      dataTransfer: typingsJapgolly.ckeditor4.CKEDITOR.plugins.clipboard.dataTransfer,
      editor: typingsJapgolly.ckeditor4.CKEDITOR.editor
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("canClipboardApiBeTrusted")(dataTransfer.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("CKEDITOR.plugins.clipboard.dataTransfer")
    @js.native
    open class dataTransfer ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.clipboard.dataTransfer {
      def this(nativeDataTransfer: DataTransfer) = this()
      def this(nativeDataTransfer: DataTransfer, editor: typingsJapgolly.ckeditor4.CKEDITOR.editor) = this()
      def this(nativeDataTransfer: Unit, editor: typingsJapgolly.ckeditor4.CKEDITOR.editor) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.clipboard.fallbackDataTransfer")
    @js.native
    open class fallbackDataTransfer protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.clipboard.fallbackDataTransfer {
      def this(dataTransfer: typingsJapgolly.ckeditor4.CKEDITOR.plugins.clipboard.dataTransfer) = this()
    }
    
    inline def getDropTarget(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): domObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getDropTarget")(editor.asInstanceOf[js.Any]).asInstanceOf[domObject]
    
    inline def getRangeAtDropPosition(domEvent: Event, editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): range = (^.asInstanceOf[js.Dynamic].applyDynamic("getRangeAtDropPosition")(domEvent.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[range]
    
    inline def initDragDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")().asInstanceOf[Unit]
    inline def initDragDataTransfer(evt: Unit, editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initDragDataTransfer(evt: typingsJapgolly.ckeditor4.CKEDITOR.dom.event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def initDragDataTransfer(
      evt: typingsJapgolly.ckeditor4.CKEDITOR.dom.event,
      editor: typingsJapgolly.ckeditor4.CKEDITOR.editor
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initDragDataTransfer")(evt.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def initPasteDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")().asInstanceOf[Unit]
    inline def initPasteDataTransfer(evt: Unit, sourceEditor: typingsJapgolly.ckeditor4.CKEDITOR.editor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any], sourceEditor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def initPasteDataTransfer(evt: typingsJapgolly.ckeditor4.CKEDITOR.dom.event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def initPasteDataTransfer(
      evt: typingsJapgolly.ckeditor4.CKEDITOR.dom.event,
      sourceEditor: typingsJapgolly.ckeditor4.CKEDITOR.editor
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initPasteDataTransfer")(evt.asInstanceOf[js.Any], sourceEditor.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomCopyCutSupported")
    @js.native
    val isCustomCopyCutSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isCustomDataTypesSupported")
    @js.native
    val isCustomDataTypesSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.isFileApiSupported")
    @js.native
    val isFileApiSupported: Boolean = js.native
    
    @JSGlobal("CKEDITOR.plugins.clipboard.mainPasteEvent")
    @js.native
    val mainPasteEvent: String = js.native
    
    inline def preventDefaultDropOnElement(element: element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefaultDropOnElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def resetDragDataTransfer(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetDragDataTransfer")().asInstanceOf[Unit]
  }
  
  object cloudservices {
    
    @JSGlobal("CKEDITOR.plugins.cloudservices.cloudServicesLoader")
    @js.native
    open class cloudServicesLoader protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.cloudservices.cloudServicesLoader {
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, fileOrData: String) = this()
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, fileOrData: Blob) = this()
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
      def this(
        editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
        fileOrData: String,
        fileName: String,
        token: String
      ) = this()
      def this(
        editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
        fileOrData: String,
        fileName: Unit,
        token: String
      ) = this()
      def this(
        editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
        fileOrData: Blob,
        fileName: String,
        token: String
      ) = this()
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, fileOrData: Blob, fileName: Unit, token: String) = this()
    }
  }
  
  object condesnippet {
    
    @JSGlobal("CKEDITOR.plugins.condesnippet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.condesnippet.highlighter")
    @js.native
    open class highlighter ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.condesnippet.highlighter {
      
      /* CompleteClass */
      override def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def init(ready: js.Function0[Unit]): Unit = js.native
      
      /* CompleteClass */
      var languages: StringDictionary[String] = js.native
      
      /* CompleteClass */
      override val queue: js.Array[
            js.Function3[
              /* code */ String, 
              /* lang */ String, 
              /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
              Unit
            ]
          ] = js.native
      
      /* CompleteClass */
      override val ready: Boolean = js.native
    }
    
    inline def setHighlighter(highlighter: typingsJapgolly.ckeditor4.CKEDITOR.plugins.condesnippet.highlighter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHighlighter")(highlighter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSGlobal("CKEDITOR.plugins.contextMenu")
  @js.native
  open class contextMenu protected ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.contextMenu {
    def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor) = this()
  }
  
  object copyformatting {
    
    @JSGlobal("CKEDITOR.plugins.copyformatting")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.breakOnElements")
    @js.native
    def breakOnElements: js.Array[String] = js.native
    inline def breakOnElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("breakOnElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.elementsForInlineTransform")
    @js.native
    def elementsForInlineTransform: js.Array[String] = js.native
    inline def elementsForInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elementsForInlineTransform")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributes")
    @js.native
    def excludedAttributes: js.Array[String] = js.native
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.excludedAttributesFromInlineTransform")
    @js.native
    def excludedAttributesFromInlineTransform: js.Array[String] = js.native
    inline def excludedAttributesFromInlineTransform_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributesFromInlineTransform")(x.asInstanceOf[js.Any])
    
    inline def excludedAttributes_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludedAttributes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.inlineBoundary")
    @js.native
    def inlineBoundary: js.Array[String] = js.native
    inline def inlineBoundary_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineBoundary")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.preservedElements")
    @js.native
    def preservedElements: js.Array[String] = js.native
    inline def preservedElements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preservedElements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CKEDITOR.plugins.copyformatting.state")
    @js.native
    open class state protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.copyformatting.state {
      def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor) = this()
    }
  }
  
  object embedBase {
    
    @JSGlobal("CKEDITOR.plugins.embedBase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createWidgetBaseDefinition(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): baseDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("createWidgetBaseDefinition")(editor.asInstanceOf[js.Any]).asInstanceOf[baseDefinition]
  }
  
  inline def get(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFilePath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPath(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object image2 {
    
    @JSGlobal("CKEDITOR.plugins.image2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkHasNaturalRatio(image: element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkHasNaturalRatio")(image.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getLinkAttributesGetter(): js.Function2[
        /* editor */ typingsJapgolly.ckeditor4.CKEDITOR.editor, 
        /* data */ StringDictionary[String], 
        Removed
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributesGetter")().asInstanceOf[js.Function2[
        /* editor */ typingsJapgolly.ckeditor4.CKEDITOR.editor, 
        /* data */ StringDictionary[String], 
        Removed
      ]]
    
    inline def getLinkAttributesParser(): js.Function2[
        /* editor */ typingsJapgolly.ckeditor4.CKEDITOR.editor, 
        /* element */ element, 
        StringDictionary[String]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributesParser")().asInstanceOf[js.Function2[
        /* editor */ typingsJapgolly.ckeditor4.CKEDITOR.editor, 
        /* element */ element, 
        StringDictionary[String]
      ]]
    
    inline def getNatural(image: element): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNatural")(image.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  }
  
  object imagebase {
    
    @JSGlobal("CKEDITOR.plugins.imagebase")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addFeature(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): imageWidgetDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("addFeature")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[imageWidgetDefinition]
    
    inline def addImageWidget(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, name: String, definition: imageWidgetDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addImageWidget")(editor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressBar")
    @js.native
    open class progressBar ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.imagebase.progressBar {
      
      /* CompleteClass */
      override def aborted(): Unit = js.native
      
      /* CompleteClass */
      var bar: element = js.native
      
      /* CompleteClass */
      override def bindLoader(loader: fileLoader): Unit = js.native
      
      /* CompleteClass */
      override def done(): Unit = js.native
      
      /* CompleteClass */
      override def failed(): Unit = js.native
      
      /* CompleteClass */
      override def remove(): Unit = js.native
      
      /* CompleteClass */
      override def updated(progress: Double): Unit = js.native
      
      /* CompleteClass */
      var wrapper: element = js.native
    }
    
    @JSGlobal("CKEDITOR.plugins.imagebase.progressReporter")
    @js.native
    open class progressReporter ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.imagebase.progressReporter {
      def this(wrapperHtml: String) = this()
      
      /* CompleteClass */
      override def aborted(): Unit = js.native
      
      /* CompleteClass */
      override def bindLoader(loader: fileLoader): Unit = js.native
      
      /* CompleteClass */
      override def done(): Unit = js.native
      
      /* CompleteClass */
      override def failed(): Unit = js.native
      
      /* CompleteClass */
      override def remove(): Unit = js.native
      
      /* CompleteClass */
      override def updated(progress: Double): Unit = js.native
      
      /* CompleteClass */
      var wrapper: element = js.native
    }
  }
  
  object indent {
    
    @JSGlobal("CKEDITOR.plugins.indent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.indent.genericDefinition")
    @js.native
    open class genericDefinition ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.indent.genericDefinition
    
    inline def registerCommands(
      editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
      commands: StringDictionary[typingsJapgolly.ckeditor4.CKEDITOR.command]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCommands")(editor.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("CKEDITOR.plugins.indent.specificDefinition")
    @js.native
    open class specificDefinition ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.indent.specificDefinition {
      
      /* CompleteClass */
      var database: StringDictionary[Any] = js.native
      
      /* CompleteClass */
      override val enterBr: Boolean = js.native
      
      /* CompleteClass */
      override def execJob(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, priority: Double): Boolean = js.native
      
      /* CompleteClass */
      override def getContext(node: elementPath): element = js.native
      
      /* CompleteClass */
      override val indentKey: StringDictionary[Any] = js.native
      
      /* CompleteClass */
      override val isIndent: Boolean = js.native
      
      /* CompleteClass */
      override val jobs: StringDictionary[Exec] = js.native
      
      /* CompleteClass */
      override def refreshJob(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, priority: Double): Double = js.native
      
      /* CompleteClass */
      override val relatedGlobal: StringDictionary[Any] = js.native
    }
  }
  
  object indentList {
    
    @JSGlobal("CKEDITOR.plugins.indentList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def firstItemInPath(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def firstItemInPath(query: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def firstItemInPath(query: js.Function1[/* element */ element, Boolean]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def firstItemInPath(query: StringDictionary[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def firstItemInPath(query: element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("firstItemInPath")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object link {
    
    @JSGlobal("CKEDITOR.plugins.link")
    @js.native
    val ^ : js.Any = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.emptyAnchorFix")
    @js.native
    val emptyAnchorFix: Boolean = js.native
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.fakeAnchor")
    @js.native
    val fakeAnchor: Boolean = js.native
    
    inline def getEditorAnchors(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): js.Array[element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorAnchors")(editor.asInstanceOf[js.Any]).asInstanceOf[js.Array[element]]
    
    inline def getLinkAttributes(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, data: StringDictionary[Any]): Set = (^.asInstanceOf[js.Dynamic].applyDynamic("getLinkAttributes")(editor.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Set]
    
    inline def getSelectedLink(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): element | js.Array[element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedLink")(editor.asInstanceOf[js.Any]).asInstanceOf[element | js.Array[element]]
    inline def getSelectedLink(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, returnMultiple: Boolean): element | js.Array[element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedLink")(editor.asInstanceOf[js.Any], returnMultiple.asInstanceOf[js.Any])).asInstanceOf[element | js.Array[element]]
    
    inline def parseLinkAttributes(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, element: element): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLinkAttributes")(editor.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
    
    inline def showDisplayTextForElement(element: element, editor: typingsJapgolly.ckeditor4.CKEDITOR.editor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("showDisplayTextForElement")(element.asInstanceOf[js.Any], editor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    // DEPRECATED 4.3.3
    @JSGlobal("CKEDITOR.plugins.link.synAnchorSelector")
    @js.native
    val synAnchorSelector: Boolean = js.native
    
    inline def tryRestoreFakeAnchor(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, element: element): element = (^.asInstanceOf[js.Dynamic].applyDynamic("tryRestoreFakeAnchor")(editor.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[element]
  }
  
  @JSGlobal("CKEDITOR.plugins.list")
  @js.native
  open class list ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.list {
    
    /* CompleteClass */
    override def arrayToList(listArray: Any, database: Any, paragraphMode: Any, dir: Any): Unit = js.native
    
    /* CompleteClass */
    override def listToArray(listNode: Any, database: Any, baseArray: Any, baseIndentLevel: Any, grandparentNode: Any): Unit = js.native
  }
  
  inline def load(name: String, callback: js.Function1[/* plugins */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def load(
    name: String,
    callback: js.Function1[/* plugins */ js.Array[String], Unit],
    scope: StringDictionary[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("CKEDITOR.plugins.notification")
  @js.native
  open class notification protected ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification {
    def this(
      editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
      options: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.options
    ) = this()
    
    /* CompleteClass */
    override val area: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.area = js.native
    
    /* CompleteClass */
    override val duration: Double = js.native
    
    /* CompleteClass */
    override val editor: typingsJapgolly.ckeditor4.CKEDITOR.editor = js.native
    
    /* CompleteClass */
    override val element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element = js.native
    
    /* CompleteClass */
    override def hide(): Unit = js.native
    
    /* CompleteClass */
    override val id: Double = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    /* CompleteClass */
    override val message: String = js.native
    
    /* CompleteClass */
    override val progress: Double = js.native
    
    /* CompleteClass */
    override def show(): Unit = js.native
    
    /* CompleteClass */
    override val `type`: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.`type` = js.native
    
    /* CompleteClass */
    override def update(options: updateOptions): Unit = js.native
  }
  
  @JSGlobal("CKEDITOR.plugins.notificationAggregator")
  @js.native
  open class notificationAggregator protected ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.notificationAggregator {
    def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, message: String) = this()
    def this(editor: typingsJapgolly.ckeditor4.CKEDITOR.editor, message: String, singularMessage: String) = this()
  }
  object notificationAggregator {
    
    @JSGlobal("CKEDITOR.plugins.notificationAggregator.task")
    @js.native
    open class task ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.notificationAggregator.task {
      def this(weight: Double) = this()
    }
  }
  
  object pastefromword {
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.lists")
    @js.native
    open class lists ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.pastefromword.lists {
      
      /* CompleteClass */
      var numbering: numbering = js.native
    }
    object lists {
      
      @JSGlobal("CKEDITOR.plugins.pastefromword.lists.numbering")
      @js.native
      open class numbering ()
        extends StObject
           with typingsJapgolly.ckeditor4.CKEDITOR.plugins.pastefromword.lists.numbering {
        
        /* CompleteClass */
        override def getStyle(marker: String): String = js.native
        
        /* CompleteClass */
        override def toNumber(marker: String, markerType: String): Double = js.native
      }
    }
    
    @JSGlobal("CKEDITOR.plugins.pastefromword.styles")
    @js.native
    open class styles ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.pastefromword.styles
  }
  
  inline def setLang(pluginName: String, languageCode: String, languageEntries: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLang")(pluginName.asInstanceOf[js.Any], languageCode.asInstanceOf[js.Any], languageEntries.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object tableselection {
    
    @JSGlobal("CKEDITOR.plugins.tableselection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCellsBetween(first: element, last: element): js.Array[element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCellsBetween")(first.asInstanceOf[js.Any], last.asInstanceOf[js.Any])).asInstanceOf[js.Array[element]]
  }
  
  @JSGlobal("CKEDITOR.plugins.widget")
  @js.native
  open class widget protected ()
    extends StObject
       with typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget {
    def this(
      widgetsRepo: typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element,
      widgetDef: typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.definition
    ) = this()
    def this(
      widgetsRepo: typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.repository,
      id: Double,
      element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element,
      widgetDef: typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.definition,
      starupData: Any
    ) = this()
  }
  object widget {
    
    @JSGlobal("CKEDITOR.plugins.widget")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CKEDITOR.plugins.widget.WRAPPER_CLASS_PREFIX")
    @js.native
    val WRAPPER_CLASS_PREFIX: String = js.native
    
    inline def getNestedEditable(guard: element, node: node): element = (^.asInstanceOf[js.Dynamic].applyDynamic("getNestedEditable")(guard.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[element]
    
    inline def isDomDragHandler(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomDragHandler")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDomDragHandlerContainer(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomDragHandlerContainer")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDomNestedEditable(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomNestedEditable")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDomWidget(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidget")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDomWidgetElement(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidgetElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isDomWidgetWrapper(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomWidgetWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isParserWidgetElement(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParserWidgetElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isParserWidgetWrapper(node: node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParserWidgetWrapper")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("CKEDITOR.plugins.widget.nestedEditable")
    @js.native
    open class nestedEditable protected ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.nestedEditable {
      def this(
        editor: typingsJapgolly.ckeditor4.CKEDITOR.editor,
        element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element,
        config: Filter
      ) = this()
    }
    
    @JSGlobal("CKEDITOR.plugins.widget.repository")
    @js.native
    open class repository ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.repository
    
    @JSGlobal("CKEDITOR.plugins.widget.widgetselection")
    @js.native
    open class widgetselection ()
      extends StObject
         with typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.widgetselection {
      
      /* CompleteClass */
      override def addFillers(editable: typingsJapgolly.ckeditor4.CKEDITOR.editable): Boolean = js.native
      
      /* CompleteClass */
      override def removeFillers(editable: typingsJapgolly.ckeditor4.CKEDITOR.editable): Unit = js.native
    }
  }
}
