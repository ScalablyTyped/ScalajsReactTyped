package typingsJapgolly.novaEditorNode

import typingsJapgolly.novaEditorNode.anon.Args
import typingsJapgolly.novaEditorNode.anon.Cwd
import typingsJapgolly.novaEditorNode.anon.Data
import typingsJapgolly.novaEditorNode.anon.DataProvider
import typingsJapgolly.novaEditorNode.anon.InitializationOptions
import typingsJapgolly.novaEditorNode.anon.`1`
import typingsJapgolly.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /// https://docs.nova.app/api-reference/charset/
  @JSGlobal("Charset")
  @js.native
  open class Charset ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Charset {
    def this(characters: String) = this()
    
    /* CompleteClass */
    override def concat(charsets: typingsJapgolly.novaEditorNode.Charset*): typingsJapgolly.novaEditorNode.Charset = js.native
    
    /* CompleteClass */
    override def intersect(charsets: typingsJapgolly.novaEditorNode.Charset*): typingsJapgolly.novaEditorNode.Charset = js.native
  }
  object Charset {
    
    @JSGlobal("Charset")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Charset.alphanumeric")
    @js.native
    def alphanumeric: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def alphanumeric_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphanumeric")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.digits")
    @js.native
    def digits: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def digits_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("digits")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.letters")
    @js.native
    def letters: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def letters_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letters")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.lower")
    @js.native
    def lower: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def lower_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lower")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.newlines")
    @js.native
    def newlines: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def newlines_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newlines")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.symbols")
    @js.native
    def symbols: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def symbols_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.upper")
    @js.native
    def upper: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def upper_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upper")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Charset.whitespace")
    @js.native
    def whitespace: typingsJapgolly.novaEditorNode.Charset = js.native
    
    /* static member */
    @JSGlobal("Charset.whitespaceAndNewlines")
    @js.native
    def whitespaceAndNewlines: typingsJapgolly.novaEditorNode.Charset = js.native
    inline def whitespaceAndNewlines_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespaceAndNewlines")(x.asInstanceOf[js.Any])
    
    inline def whitespace_=(x: typingsJapgolly.novaEditorNode.Charset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Color")
  @js.native
  open class Color protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Color {
    def this(format: ColorFormat, components: js.Array[Double]) = this()
    
    /* CompleteClass */
    override val components: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def convert(format: ColorFormat): typingsJapgolly.novaEditorNode.Color = js.native
    
    /* CompleteClass */
    override val format: ColorFormat = js.native
  }
  object Color {
    
    @JSGlobal("Color")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def displayP3(red: Double, green: Double, blue: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("displayP3")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def displayP3(red: Double, green: Double, blue: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("displayP3")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def hsb(hue: Double, saturation: Double, brightness: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def hsb(hue: Double, saturation: Double, brightness: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], brightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def hsl(hue: Double, saturation: Double, luminance: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], luminance.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def hsl(hue: Double, saturation: Double, luminance: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], luminance.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /* static member */
    inline def rgb(red: Double, green: Double, blue: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def rgb(red: Double, green: Double, blue: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  /// https://docs.nova.app/api-reference/color/
  @JSGlobal("ColorFormat")
  @js.native
  object ColorFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.novaEditorNode.ColorFormat & String] = js.native
    
    /* "p3" */ val displayP3: typingsJapgolly.novaEditorNode.ColorFormat.displayP3 & String = js.native
    
    /* "hsb" */ val hsb: typingsJapgolly.novaEditorNode.ColorFormat.hsb & String = js.native
    
    /* "hsl" */ val hsl: typingsJapgolly.novaEditorNode.ColorFormat.hsl & String = js.native
    
    /* "rgb" */ val rgb: typingsJapgolly.novaEditorNode.ColorFormat.rgb & String = js.native
  }
  
  /// https://docs.nova.app/api-reference/color-information/
  @JSGlobal("ColorInformation")
  @js.native
  open class ColorInformation protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.ColorInformation {
    def this(range: typingsJapgolly.novaEditorNode.Range, color: typingsJapgolly.novaEditorNode.Color) = this()
    def this(
      range: typingsJapgolly.novaEditorNode.Range,
      color: typingsJapgolly.novaEditorNode.Color,
      kind: String
    ) = this()
    
    /* CompleteClass */
    var color: typingsJapgolly.novaEditorNode.Color = js.native
    
    /* CompleteClass */
    var range: typingsJapgolly.novaEditorNode.Range = js.native
  }
  
  /// https://docs.nova.app/api-reference/color-presentation/
  @JSGlobal("ColorPresentation")
  @js.native
  open class ColorPresentation protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.ColorPresentation {
    def this(label: String) = this()
    def this(label: String, kind: String) = this()
    
    /* CompleteClass */
    var additionalTextEdits: js.Array[typingsJapgolly.novaEditorNode.TextEdit] = js.native
    
    /* CompleteClass */
    var kind: String = js.native
    
    /* CompleteClass */
    var label: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/completion-item/
  @JSGlobal("CompletionItem")
  @js.native
  open class CompletionItem protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.CompletionItem {
    def this(label: String, kind: CompletionItemKind) = this()
    
    /* CompleteClass */
    override val kind: CompletionItemKind = js.native
    
    /* CompleteClass */
    override val label: String = js.native
  }
  
  @JSGlobal("CompletionItemKind")
  @js.native
  object CompletionItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.novaEditorNode.CompletionItemKind & Double] = js.native
    
    /* 18 */ val Argument: typingsJapgolly.novaEditorNode.CompletionItemKind.Argument & Double = js.native
    
    /* 2 */ val Category: typingsJapgolly.novaEditorNode.CompletionItemKind.Category & Double = js.native
    
    /* 1 */ val Class: typingsJapgolly.novaEditorNode.CompletionItemKind.Class & Double = js.native
    
    /* 9 */ val Closure: typingsJapgolly.novaEditorNode.CompletionItemKind.Closure & Double = js.native
    
    /* 19 */ val Color: typingsJapgolly.novaEditorNode.CompletionItemKind.Color & Double = js.native
    
    /* 15 */ val Constant: typingsJapgolly.novaEditorNode.CompletionItemKind.Constant & Double = js.native
    
    /* 10 */ val Constructor: typingsJapgolly.novaEditorNode.CompletionItemKind.Constructor & Double = js.native
    
    /* 11 */ val Destructor: typingsJapgolly.novaEditorNode.CompletionItemKind.Destructor & Double = js.native
    
    /* 4 */ val Enum: typingsJapgolly.novaEditorNode.CompletionItemKind.Enum & Double = js.native
    
    /* 20 */ val EnumMember: typingsJapgolly.novaEditorNode.CompletionItemKind.EnumMember & Double = js.native
    
    /* 22 */ val Expression: typingsJapgolly.novaEditorNode.CompletionItemKind.Expression & Double = js.native
    
    /* 25 */ val File: typingsJapgolly.novaEditorNode.CompletionItemKind.File & Double = js.native
    
    /* 7 */ val Function: typingsJapgolly.novaEditorNode.CompletionItemKind.Function & Double = js.native
    
    /* 12 */ val Getter: typingsJapgolly.novaEditorNode.CompletionItemKind.Getter & Double = js.native
    
    /* 3 */ val Interface: typingsJapgolly.novaEditorNode.CompletionItemKind.Interface & Double = js.native
    
    /* 27 */ val Keyword: typingsJapgolly.novaEditorNode.CompletionItemKind.Keyword & Double = js.native
    
    /* 8 */ val Method: typingsJapgolly.novaEditorNode.CompletionItemKind.Method & Double = js.native
    
    /* 24 */ val Package: typingsJapgolly.novaEditorNode.CompletionItemKind.Package & Double = js.native
    
    /* 17 */ val Property: typingsJapgolly.novaEditorNode.CompletionItemKind.Property & Double = js.native
    
    /* 26 */ val Reference: typingsJapgolly.novaEditorNode.CompletionItemKind.Reference & Double = js.native
    
    /* 13 */ val Setter: typingsJapgolly.novaEditorNode.CompletionItemKind.Setter & Double = js.native
    
    /* 23 */ val Statement: typingsJapgolly.novaEditorNode.CompletionItemKind.Statement & Double = js.native
    
    /* 14 */ val StaticMethod: typingsJapgolly.novaEditorNode.CompletionItemKind.StaticMethod & Double = js.native
    
    /* 21 */ val StaticProperty: typingsJapgolly.novaEditorNode.CompletionItemKind.StaticProperty & Double = js.native
    
    /* 6 */ val Struct: typingsJapgolly.novaEditorNode.CompletionItemKind.Struct & Double = js.native
    
    /* 31 */ val StyleClass: typingsJapgolly.novaEditorNode.CompletionItemKind.StyleClass & Double = js.native
    
    /* 29 */ val StyleDirective: typingsJapgolly.novaEditorNode.CompletionItemKind.StyleDirective & Double = js.native
    
    /* 30 */ val StyleID: typingsJapgolly.novaEditorNode.CompletionItemKind.StyleID & Double = js.native
    
    /* 32 */ val StylePseudoClass: typingsJapgolly.novaEditorNode.CompletionItemKind.StylePseudoClass & Double = js.native
    
    /* 33 */ val StylePseudoElement: typingsJapgolly.novaEditorNode.CompletionItemKind.StylePseudoElement & Double = js.native
    
    /* 28 */ val StyleRuleset: typingsJapgolly.novaEditorNode.CompletionItemKind.StyleRuleset & Double = js.native
    
    /* 34 */ val Tag: typingsJapgolly.novaEditorNode.CompletionItemKind.Tag & Double = js.native
    
    /* 48 */ val TagAnchor: typingsJapgolly.novaEditorNode.CompletionItemKind.TagAnchor & Double = js.native
    
    /* 39 */ val TagBody: typingsJapgolly.novaEditorNode.CompletionItemKind.TagBody & Double = js.native
    
    /* 44 */ val TagContainer: typingsJapgolly.novaEditorNode.CompletionItemKind.TagContainer & Double = js.native
    
    /* 51 */ val TagForm: typingsJapgolly.novaEditorNode.CompletionItemKind.TagForm & Double = js.native
    
    /* 52 */ val TagFormField: typingsJapgolly.novaEditorNode.CompletionItemKind.TagFormField & Double = js.native
    
    /* 53 */ val TagFramework: typingsJapgolly.novaEditorNode.CompletionItemKind.TagFramework & Double = js.native
    
    /* 35 */ val TagHead: typingsJapgolly.novaEditorNode.CompletionItemKind.TagHead & Double = js.native
    
    /* 42 */ val TagHeading: typingsJapgolly.novaEditorNode.CompletionItemKind.TagHeading & Double = js.native
    
    /* 49 */ val TagImage: typingsJapgolly.novaEditorNode.CompletionItemKind.TagImage & Double = js.native
    
    /* 38 */ val TagLink: typingsJapgolly.novaEditorNode.CompletionItemKind.TagLink & Double = js.native
    
    /* 47 */ val TagListItem: typingsJapgolly.novaEditorNode.CompletionItemKind.TagListItem & Double = js.native
    
    /* 50 */ val TagMedia: typingsJapgolly.novaEditorNode.CompletionItemKind.TagMedia & Double = js.native
    
    /* 37 */ val TagMeta: typingsJapgolly.novaEditorNode.CompletionItemKind.TagMeta & Double = js.native
    
    /* 46 */ val TagOrderedList: typingsJapgolly.novaEditorNode.CompletionItemKind.TagOrderedList & Double = js.native
    
    /* 40 */ val TagScript: typingsJapgolly.novaEditorNode.CompletionItemKind.TagScript & Double = js.native
    
    /* 43 */ val TagSection: typingsJapgolly.novaEditorNode.CompletionItemKind.TagSection & Double = js.native
    
    /* 41 */ val TagStyle: typingsJapgolly.novaEditorNode.CompletionItemKind.TagStyle & Double = js.native
    
    /* 36 */ val TagTitle: typingsJapgolly.novaEditorNode.CompletionItemKind.TagTitle & Double = js.native
    
    /* 45 */ val TagUnorderedList: typingsJapgolly.novaEditorNode.CompletionItemKind.TagUnorderedList & Double = js.native
    
    /* 0 */ val Type: typingsJapgolly.novaEditorNode.CompletionItemKind.Type & Double = js.native
    
    /* 5 */ val Union: typingsJapgolly.novaEditorNode.CompletionItemKind.Union & Double = js.native
    
    /* 16 */ val Variable: typingsJapgolly.novaEditorNode.CompletionItemKind.Variable & Double = js.native
  }
  
  @JSGlobal("CompletionReason")
  @js.native
  object CompletionReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.novaEditorNode.CompletionReason & Double] = js.native
    
    /* 1 */ val Character: typingsJapgolly.novaEditorNode.CompletionReason.Character & Double = js.native
    
    /* 0 */ val Invoke: typingsJapgolly.novaEditorNode.CompletionReason.Invoke & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/composite-disposable/
  @JSGlobal("CompositeDisposable")
  @js.native
  open class CompositeDisposable ()
    extends StObject
       with typingsJapgolly.novaEditorNode.CompositeDisposable {
    
    /* CompleteClass */
    override def add(`object`: typingsJapgolly.novaEditorNode.Disposable): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def delete(`object`: typingsJapgolly.novaEditorNode.Disposable): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def remove(`object`: typingsJapgolly.novaEditorNode.Disposable): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/disposable/
  @JSGlobal("Disposable")
  @js.native
  open class Disposable ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Disposable {
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  object Disposable {
    
    @JSGlobal("Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isDisposable(x: Any): /* is nova-editor-node.Disposable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisposable")(x.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.Disposable */ Boolean]
  }
  
  /// https://docs.nova.app/api-reference/emitter/
  @JSGlobal("Emitter")
  @js.native
  open class Emitter ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Emitter {
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  @JSGlobal("FileSystem")
  @js.native
  /* private */ open class FileSystem ()
    extends StObject
       with typingsJapgolly.novaEditorNode.FileSystem
  
  @JSGlobal("InsertTextFormat")
  @js.native
  object InsertTextFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.novaEditorNode.InsertTextFormat & Double] = js.native
    
    /* 0 */ val PlainText: typingsJapgolly.novaEditorNode.InsertTextFormat.PlainText & Double = js.native
    
    /* 1 */ val Snippet: typingsJapgolly.novaEditorNode.InsertTextFormat.Snippet & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue/
  @JSGlobal("Issue")
  @js.native
  open class Issue ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Issue {
    
    /* CompleteClass */
    var code: Double | String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var severity: IssueSeverity = js.native
    
    /* CompleteClass */
    var source: String | Null = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue-collection/
  @JSGlobal("IssueCollection")
  @js.native
  open class IssueCollection ()
    extends StObject
       with typingsJapgolly.novaEditorNode.IssueCollection {
    def this(name: String) = this()
    
    /* CompleteClass */
    override def append(uri: String, issues: js.Array[typingsJapgolly.novaEditorNode.Issue]): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def get(uri: String): js.Array[typingsJapgolly.novaEditorNode.Issue] = js.native
    
    /* CompleteClass */
    override def has(uri: String): Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def remove(uri: String): Unit = js.native
    
    /* CompleteClass */
    override def set(uri: String, issues: js.Array[typingsJapgolly.novaEditorNode.Issue]): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/issue-parser/
  @JSGlobal("IssueParser")
  @js.native
  open class IssueParser ()
    extends StObject
       with typingsJapgolly.novaEditorNode.IssueParser {
    def this(matcherNames: String) = this()
    def this(matcherNames: js.Array[String]) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override val issues: js.Array[typingsJapgolly.novaEditorNode.Issue] = js.native
    
    /* CompleteClass */
    override def pushLine(line: String): Unit = js.native
  }
  
  @JSGlobal("IssueSeverity")
  @js.native
  object IssueSeverity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.novaEditorNode.IssueSeverity & Double] = js.native
    
    /* 0 */ val Error: typingsJapgolly.novaEditorNode.IssueSeverity.Error & Double = js.native
    
    /* 2 */ val Hint: typingsJapgolly.novaEditorNode.IssueSeverity.Hint & Double = js.native
    
    /* 3 */ val Info: typingsJapgolly.novaEditorNode.IssueSeverity.Info & Double = js.native
    
    /* 1 */ val Warning: typingsJapgolly.novaEditorNode.IssueSeverity.Warning & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/language-client/
  @JSGlobal("LanguageClient")
  @js.native
  open class LanguageClient protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.LanguageClient {
    def this(
      identifier: String,
      name: String,
      serverOptions: ServerOptions,
      clientOptions: InitializationOptions
    ) = this()
  }
  
  /// https://docs.nova.app/api-reference/notification-request/
  @JSGlobal("NotificationRequest")
  @js.native
  open class NotificationRequest protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.NotificationRequest {
    def this(identifier: String) = this()
    
    /* CompleteClass */
    override val identifier: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/process/
  // This could be improved to split into automatic pipe and jsonrpc types with
  // the appropriate methods enabled, but because stdio is configured within
  // options it feels like overkill
  @JSGlobal("Process")
  @js.native
  open class Process protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Process {
    def this(command: String) = this()
    def this(command: String, options: Args) = this()
  }
  
  /// https://docs.nova.app/api-reference/range/
  @JSGlobal("Range")
  @js.native
  open class Range protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Range {
    def this(start: Double, end: Double) = this()
    
    /* CompleteClass */
    override def compare(other: typingsJapgolly.novaEditorNode.Range): Double = js.native
    
    /* CompleteClass */
    override def containsIndex(index: Double): Boolean = js.native
    
    /* CompleteClass */
    override def containsRange(other: typingsJapgolly.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    var empty: Boolean = js.native
    
    /* CompleteClass */
    var end: Double = js.native
    
    /* CompleteClass */
    override def intersection(other: typingsJapgolly.novaEditorNode.Range): typingsJapgolly.novaEditorNode.Range = js.native
    
    /* CompleteClass */
    override def intersectsRange(other: typingsJapgolly.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    override def isEqual(other: typingsJapgolly.novaEditorNode.Range): Boolean = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    var start: Double = js.native
    
    /* CompleteClass */
    override def union(other: typingsJapgolly.novaEditorNode.Range): typingsJapgolly.novaEditorNode.Range = js.native
  }
  
  /// https://docs.nova.app/api-reference/scanner/
  @JSGlobal("Scanner")
  @js.native
  open class Scanner protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Scanner {
    def this(string: String) = this()
    
    /* CompleteClass */
    override val atEnd: Boolean = js.native
    
    /* CompleteClass */
    var caseSensitive: Boolean = js.native
    
    /* CompleteClass */
    var location: Double = js.native
    
    /* CompleteClass */
    override def scanChars(charset: typingsJapgolly.novaEditorNode.Charset): String | Null = js.native
    
    /* CompleteClass */
    override def scanFloat(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanHexFloat(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanHexInt(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanInt(): Double | Null = js.native
    
    /* CompleteClass */
    override def scanString(string: String): String | Null = js.native
    
    /* CompleteClass */
    override def scanUpToChars(charset: typingsJapgolly.novaEditorNode.Charset): String | Null = js.native
    
    /* CompleteClass */
    override def scanUpToString(string: String): String | Null = js.native
    
    /* CompleteClass */
    var skipChars: typingsJapgolly.novaEditorNode.Charset = js.native
    
    /* CompleteClass */
    override val string: String = js.native
  }
  
  @JSGlobal("Task")
  @js.native
  open class Task protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.Task {
    def this(name: String) = this()
  }
  object Task {
    
    /* static member */
    @JSGlobal("Task.Build")
    @js.native
    val Build: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Clean")
    @js.native
    val Clean: TaskName = js.native
    
    /* static member */
    @JSGlobal("Task.Run")
    @js.native
    val Run: TaskName = js.native
  }
  
  /// https://docs.nova.app/api-reference/task-command-action/
  @JSGlobal("TaskCommandAction")
  @js.native
  open class TaskCommandAction protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TaskCommandAction {
    def this(command: String) = this()
    def this(command: String, options: `1`) = this()
    
    /* CompleteClass */
    override val args: js.Array[String] = js.native
    
    /* CompleteClass */
    override val command: String = js.native
  }
  
  /// https://docs.nova.app/api-reference/task-process-action/
  @JSGlobal("TaskProcessAction")
  @js.native
  open class TaskProcessAction protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TaskProcessAction {
    def this(command: String) = this()
    def this(command: String, options: Cwd) = this()
  }
  
  /// https://docs.nova.app/api-reference/task-resolvable-action/
  @JSGlobal("TaskResolvableAction")
  @js.native
  open class TaskResolvableAction[T /* <: Transferrable */] ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TaskResolvableAction[T] {
    def this(options: Data[T]) = this()
    
    /* CompleteClass */
    override val data: T = js.native
  }
  
  /// https://docs.nova.app/api-reference/text-edit/
  @JSGlobal("TextEdit")
  @js.native
  open class TextEdit protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TextEdit {
    def this(range: typingsJapgolly.novaEditorNode.Range, newText: String) = this()
    
    /* CompleteClass */
    override val newText: String = js.native
    
    /* CompleteClass */
    override val range: typingsJapgolly.novaEditorNode.Range = js.native
  }
  object TextEdit {
    
    @JSGlobal("TextEdit")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def delete(range: typingsJapgolly.novaEditorNode.Range): typingsJapgolly.novaEditorNode.TextEdit = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(range.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.novaEditorNode.TextEdit]
    
    /* static member */
    inline def insert(position: Double, newText: String): typingsJapgolly.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(position.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.novaEditorNode.TextEdit]
    
    /* static member */
    inline def replace(range: typingsJapgolly.novaEditorNode.Range, newText: String): typingsJapgolly.novaEditorNode.TextEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(range.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.novaEditorNode.TextEdit]
  }
  
  /// https://docs.nova.app/api-reference/text-editor/
  @JSGlobal("TextEditor")
  @js.native
  /* private */ open class TextEditor ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TextEditor
  object TextEditor {
    
    @JSGlobal("TextEditor")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def isTextEditor(`object`: Any): /* is nova-editor-node.TextEditor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextEditor")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is nova-editor-node.TextEditor */ Boolean]
  }
  
  /// https://docs.nova.app/api-reference/tree-item/
  @JSGlobal("TreeItem")
  @js.native
  open class TreeItem protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TreeItem {
    def this(name: String) = this()
    def this(name: String, collapsibleState: TreeItemCollapsibleState) = this()
    
    /* CompleteClass */
    var collapsibleState: TreeItemCollapsibleState = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSGlobal("TreeItemCollapsibleState")
  @js.native
  object TreeItemCollapsibleState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.novaEditorNode.TreeItemCollapsibleState & Double] = js.native
    
    /* 1 */ val Collapsed: typingsJapgolly.novaEditorNode.TreeItemCollapsibleState.Collapsed & Double = js.native
    
    /* 2 */ val Expanded: typingsJapgolly.novaEditorNode.TreeItemCollapsibleState.Expanded & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.novaEditorNode.TreeItemCollapsibleState.None & Double = js.native
  }
  
  /// https://docs.nova.app/api-reference/tree-view/
  @JSGlobal("TreeView")
  @js.native
  open class TreeView[E] protected ()
    extends StObject
       with typingsJapgolly.novaEditorNode.TreeView[E] {
    def this(identifier: String) = this()
    def this(identifier: String, options: DataProvider[E]) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
  }
  
  /// https://docs.nova.app/api-reference/
  inline def atob(data: String): String = js.Dynamic.global.applyDynamic("atob")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def btoa(data: String): String = js.Dynamic.global.applyDynamic("btoa")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
  inline def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
  inline def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("nova")
  @js.native
  val nova: Environment = js.native
  
  inline def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  
  inline def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
  inline def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(arguments.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
}
