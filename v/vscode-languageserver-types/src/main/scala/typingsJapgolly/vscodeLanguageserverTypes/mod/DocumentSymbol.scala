package typingsJapgolly.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbol extends StObject {
  
  /**
    * Children of this symbol, e.g. properties of a class.
    */
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
  
  /**
    * Indicates if this symbol is deprecated.
    *
    * @deprecated Use tags instead
    */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * More detail for this symbol, e.g the signature of a function.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of this symbol.
    */
  var kind: SymbolKind
  
  /**
    * The name of this symbol. Will be displayed in the user interface and therefore must not be
    * an empty string or a string only consisting of white spaces.
    */
  var name: String
  
  /**
    * The range enclosing this symbol not including leading/trailing whitespace but everything else
    * like comments. This information is typically used to determine if the clients cursor is
    * inside the symbol to reveal in the symbol in the UI.
    */
  var range: Range
  
  /**
    * The range that should be selected and revealed when this symbol is being picked, e.g the name of a function.
    * Must be contained by the `range`.
    */
  var selectionRange: Range
  
  /**
    * Tags for this document symbol.
    *
    * @since 3.16.0
    */
  var tags: js.UndefOr[js.Array[SymbolTag]] = js.undefined
}
object DocumentSymbol {
  
  inline def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range): DocumentSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbol]
  }
  
  @JSImport("vscode-languageserver-types", "DocumentSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new symbol information literal.
    *
    * @param name The name of the symbol.
    * @param detail The detail of the symbol.
    * @param kind The kind of the symbol.
    * @param range The range of the symbol.
    * @param selectionRange The selectionRange of the symbol.
    * @param children Children of the symbol.
    */
  inline def create(name: String, detail: String, kind: SymbolKind, range: Range, selectionRange: Range): DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any])).asInstanceOf[DocumentSymbol]
  inline def create(
    name: String,
    detail: String,
    kind: SymbolKind,
    range: Range,
    selectionRange: Range,
    children: js.Array[DocumentSymbol]
  ): DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DocumentSymbol]
  inline def create(name: String, detail: Unit, kind: SymbolKind, range: Range, selectionRange: Range): DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any])).asInstanceOf[DocumentSymbol]
  inline def create(
    name: String,
    detail: Unit,
    kind: SymbolKind,
    range: Range,
    selectionRange: Range,
    children: js.Array[DocumentSymbol]
  ): DocumentSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], detail.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], range.asInstanceOf[js.Any], selectionRange.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[DocumentSymbol]
  
  /**
    * Checks whether the given literal conforms to the [DocumentSymbol](#DocumentSymbol) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DocumentSymbol */ Boolean]
  
  extension [Self <: DocumentSymbol](x: Self) {
    
    inline def setChildren(value: js.Array[DocumentSymbol]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: DocumentSymbol*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSelectionRange(value: Range): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
