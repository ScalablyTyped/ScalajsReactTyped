package typingsJapgolly.parse5

import japgolly.scalajs.react.Callback
import typingsJapgolly.parse5.distCjsCommonTokenMod.Location
import typingsJapgolly.parse5.distCjsTreeAdaptersInterfaceMod.TreeAdapterTypeMap
import typingsJapgolly.parse5.distCommonErrorCodesMod.ParserError
import typingsJapgolly.parse5.distCommonErrorCodesMod.ParserErrorHandler
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var onParseError: js.UndefOr[ParserErrorHandler | Null] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setOnParseError(value: /* error */ ParserError => Callback): Self = StObject.set(x, "onParseError", js.Any.fromFunction1((t0: /* error */ ParserError) => value(t0).runNow()))
      
      inline def setOnParseErrorNull: Self = StObject.set(x, "onParseError", null)
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    }
  }
  
  trait BeforeElement[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    var beforeElement: (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) | Null
    
    var parent: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
  }
  object BeforeElement {
    
    inline def apply[T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      parent: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): BeforeElement[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], beforeElement = null)
      __obj.asInstanceOf[BeforeElement[T]]
    }
    
    extension [Self <: BeforeElement[?], T /* <: TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & BeforeElement[T]) {
      
      inline def setBeforeElement(value: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any): Self = StObject.set(x, "beforeElement", value.asInstanceOf[js.Any])
      
      inline def setBeforeElementNull: Self = StObject.set(x, "beforeElement", null)
      
      inline def setParent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnParseError extends StObject {
    
    var onParseError: js.UndefOr[typingsJapgolly.parse5.distCjsCommonErrorCodesMod.ParserErrorHandler | Null] = js.undefined
  }
  object OnParseError {
    
    inline def apply(): OnParseError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnParseError]
    }
    
    extension [Self <: OnParseError](x: Self) {
      
      inline def setOnParseError(value: /* error */ typingsJapgolly.parse5.distCjsCommonErrorCodesMod.ParserError => Callback): Self = StObject.set(x, "onParseError", js.Any.fromFunction1((t0: /* error */ typingsJapgolly.parse5.distCjsCommonErrorCodesMod.ParserError) => value(t0).runNow()))
      
      inline def setOnParseErrorNull: Self = StObject.set(x, "onParseError", null)
      
      inline def setOnParseErrorUndefined: Self = StObject.set(x, "onParseError", js.undefined)
    }
  }
  
  trait Parent[T /* <: typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */] extends StObject {
    
    var beforeElement: (/* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any) | Null
    
    var parent: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
  }
  object Parent {
    
    inline def apply[T /* <: typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](
      parent: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
    ): Parent[T] = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], beforeElement = null)
      __obj.asInstanceOf[Parent[T]]
    }
    
    extension [Self <: Parent[?], T /* <: typingsJapgolly.parse5.distTreeAdaptersInterfaceMod.TreeAdapterTypeMap[Any, Any, Any, Any, Any, Any, Any, Any, Any, Any] */](x: Self & Parent[T]) {
      
      inline def setBeforeElement(value: /* import warning: importer.ImportType#apply Failed type conversion: T['element'] */ js.Any): Self = StObject.set(x, "beforeElement", value.asInstanceOf[js.Any])
      
      inline def setBeforeElementNull: Self = StObject.set(x, "beforeElement", null)
      
      inline def setParent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T['parentNode'] */ js.Any
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<parse5.parse5/dist/cjs/common/token.ElementLocation> */
  trait PartialElementLocation extends StObject {
    
    var attrs: js.UndefOr[Record[String, Location]] = js.undefined
    
    var endCol: js.UndefOr[Double] = js.undefined
    
    var endLine: js.UndefOr[Double] = js.undefined
    
    var endOffset: js.UndefOr[Double] = js.undefined
    
    var endTag: js.UndefOr[Location] = js.undefined
    
    var startCol: js.UndefOr[Double] = js.undefined
    
    var startLine: js.UndefOr[Double] = js.undefined
    
    var startOffset: js.UndefOr[Double] = js.undefined
    
    var startTag: js.UndefOr[Location] = js.undefined
  }
  object PartialElementLocation {
    
    inline def apply(): PartialElementLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialElementLocation]
    }
    
    extension [Self <: PartialElementLocation](x: Self) {
      
      inline def setAttrs(value: Record[String, Location]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndColUndefined: Self = StObject.set(x, "endCol", js.undefined)
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setEndTag(value: Location): Self = StObject.set(x, "endTag", value.asInstanceOf[js.Any])
      
      inline def setEndTagUndefined: Self = StObject.set(x, "endTag", js.undefined)
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartColUndefined: Self = StObject.set(x, "startCol", js.undefined)
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStartTag(value: Location): Self = StObject.set(x, "startTag", value.asInstanceOf[js.Any])
      
      inline def setStartTagUndefined: Self = StObject.set(x, "startTag", js.undefined)
    }
  }
  
  /* Inlined std.Partial<parse5.parse5/dist/common/token.ElementLocation> */
  trait PartialElementLocationAttrs extends StObject {
    
    var attrs: js.UndefOr[Record[String, typingsJapgolly.parse5.distCommonTokenMod.Location]] = js.undefined
    
    var endCol: js.UndefOr[Double] = js.undefined
    
    var endLine: js.UndefOr[Double] = js.undefined
    
    var endOffset: js.UndefOr[Double] = js.undefined
    
    var endTag: js.UndefOr[typingsJapgolly.parse5.distCommonTokenMod.Location] = js.undefined
    
    var startCol: js.UndefOr[Double] = js.undefined
    
    var startLine: js.UndefOr[Double] = js.undefined
    
    var startOffset: js.UndefOr[Double] = js.undefined
    
    var startTag: js.UndefOr[typingsJapgolly.parse5.distCommonTokenMod.Location] = js.undefined
  }
  object PartialElementLocationAttrs {
    
    inline def apply(): PartialElementLocationAttrs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialElementLocationAttrs]
    }
    
    extension [Self <: PartialElementLocationAttrs](x: Self) {
      
      inline def setAttrs(value: Record[String, typingsJapgolly.parse5.distCommonTokenMod.Location]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndColUndefined: Self = StObject.set(x, "endCol", js.undefined)
      
      inline def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
      
      inline def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
      
      inline def setEndOffsetUndefined: Self = StObject.set(x, "endOffset", js.undefined)
      
      inline def setEndTag(value: typingsJapgolly.parse5.distCommonTokenMod.Location): Self = StObject.set(x, "endTag", value.asInstanceOf[js.Any])
      
      inline def setEndTagUndefined: Self = StObject.set(x, "endTag", js.undefined)
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartColUndefined: Self = StObject.set(x, "startCol", js.undefined)
      
      inline def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      inline def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
      
      inline def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
      
      inline def setStartTag(value: typingsJapgolly.parse5.distCommonTokenMod.Location): Self = StObject.set(x, "startTag", value.asInstanceOf[js.Any])
      
      inline def setStartTagUndefined: Self = StObject.set(x, "startTag", js.undefined)
    }
  }
}
