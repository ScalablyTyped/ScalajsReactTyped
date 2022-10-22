package typingsJapgolly.sqlFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcFormatterLayoutMod {
  
  @JSImport("sql-formatter/lib/src/formatter/Layout", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Layout {
    def this(indentation: typingsJapgolly.sqlFormatter.libSrcFormatterIndentationMod.default) = this()
    
    /**
      * Appends token strings and whitespace modifications to SQL string.
      */
    /* CompleteClass */
    override def add(items: (WS | String)*): Unit = js.native
    
    /* private */ /* CompleteClass */
    var addIndentation: Any = js.native
    
    /* private */ /* CompleteClass */
    var addNewline: Any = js.native
    
    /**
      * Returns the internal layout data
      */
    /* CompleteClass */
    override def getLayoutItems(): js.Array[LayoutItem] = js.native
    
    /* CompleteClass */
    var indentation: typingsJapgolly.sqlFormatter.libSrcFormatterIndentationMod.default = js.native
    
    /* private */ /* CompleteClass */
    var itemToString: Any = js.native
    
    /* private */ /* CompleteClass */
    var items: Any = js.native
    
    /* private */ /* CompleteClass */
    var trimHorizontalWhitespace: Any = js.native
    
    /* private */ /* CompleteClass */
    var trimWhitespace: Any = js.native
  }
  
  @js.native
  sealed trait WS extends StObject
  @JSImport("sql-formatter/lib/src/formatter/Layout", "WS")
  @js.native
  object WS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WS & Double] = js.native
    
    @js.native
    sealed trait INDENT
      extends StObject
         with WS
    /* 5 */ val INDENT: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.INDENT & Double = js.native
    
    @js.native
    sealed trait MANDATORY_NEWLINE
      extends StObject
         with WS
         with _LayoutItem
    /* 4 */ val MANDATORY_NEWLINE: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.MANDATORY_NEWLINE & Double = js.native
    
    @js.native
    sealed trait NEWLINE
      extends StObject
         with WS
         with _LayoutItem
    /* 3 */ val NEWLINE: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.NEWLINE & Double = js.native
    
    @js.native
    sealed trait NO_NEWLINE
      extends StObject
         with WS
    /* 2 */ val NO_NEWLINE: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.NO_NEWLINE & Double = js.native
    
    @js.native
    sealed trait NO_SPACE
      extends StObject
         with WS
    /* 1 */ val NO_SPACE: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.NO_SPACE & Double = js.native
    
    @js.native
    sealed trait SINGLE_INDENT
      extends StObject
         with WS
         with _LayoutItem
    /* 6 */ val SINGLE_INDENT: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.SINGLE_INDENT & Double = js.native
    
    @js.native
    sealed trait SPACE
      extends StObject
         with WS
         with _LayoutItem
    /* 0 */ val SPACE: typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.SPACE & Double = js.native
  }
  
  trait Layout extends StObject {
    
    /**
      * Appends token strings and whitespace modifications to SQL string.
      */
    def add(items: (WS | String)*): Unit
    
    /* private */ var addIndentation: Any
    
    /* private */ var addNewline: Any
    
    /**
      * Returns the internal layout data
      */
    def getLayoutItems(): js.Array[LayoutItem]
    
    var indentation: typingsJapgolly.sqlFormatter.libSrcFormatterIndentationMod.default
    
    /* private */ var itemToString: Any
    
    /* private */ var items: Any
    
    /* private */ var trimHorizontalWhitespace: Any
    
    /* private */ var trimWhitespace: Any
  }
  object Layout {
    
    inline def apply(
      add: /* repeated */ WS | String => Callback,
      addIndentation: Any,
      addNewline: Any,
      getLayoutItems: CallbackTo[js.Array[LayoutItem]],
      indentation: typingsJapgolly.sqlFormatter.libSrcFormatterIndentationMod.default,
      itemToString: Any,
      items: Any,
      trimHorizontalWhitespace: Any,
      trimWhitespace: Any
    ): Layout = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: /* repeated */ WS | String) => add(t0).runNow()), addIndentation = addIndentation.asInstanceOf[js.Any], addNewline = addNewline.asInstanceOf[js.Any], getLayoutItems = getLayoutItems.toJsFn, indentation = indentation.asInstanceOf[js.Any], itemToString = itemToString.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], trimHorizontalWhitespace = trimHorizontalWhitespace.asInstanceOf[js.Any], trimWhitespace = trimWhitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    extension [Self <: Layout](x: Self) {
      
      inline def setAdd(value: /* repeated */ WS | String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* repeated */ WS | String) => value(t0).runNow()))
      
      inline def setAddIndentation(value: Any): Self = StObject.set(x, "addIndentation", value.asInstanceOf[js.Any])
      
      inline def setAddNewline(value: Any): Self = StObject.set(x, "addNewline", value.asInstanceOf[js.Any])
      
      inline def setGetLayoutItems(value: CallbackTo[js.Array[LayoutItem]]): Self = StObject.set(x, "getLayoutItems", value.toJsFn)
      
      inline def setIndentation(value: typingsJapgolly.sqlFormatter.libSrcFormatterIndentationMod.default): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
      
      inline def setItemToString(value: Any): Self = StObject.set(x, "itemToString", value.asInstanceOf[js.Any])
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setTrimHorizontalWhitespace(value: Any): Self = StObject.set(x, "trimHorizontalWhitespace", value.asInstanceOf[js.Any])
      
      inline def setTrimWhitespace(value: Any): Self = StObject.set(x, "trimWhitespace", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.SPACE
    - typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.SINGLE_INDENT
    - typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.NEWLINE
    - typingsJapgolly.sqlFormatter.libSrcFormatterLayoutMod.WS.MANDATORY_NEWLINE
    - java.lang.String
  */
  type LayoutItem = _LayoutItem | String
  
  trait _LayoutItem extends StObject
}
