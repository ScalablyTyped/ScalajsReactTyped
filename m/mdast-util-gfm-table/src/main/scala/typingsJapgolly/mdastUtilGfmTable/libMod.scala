package typingsJapgolly.mdastUtilGfmTable

import typingsJapgolly.mdastUtilFromMarkdown.mod.Extension
import typingsJapgolly.mdastUtilFromMarkdown.mod.Handle
import typingsJapgolly.mdastUtilToMarkdown.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-gfm-table/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mdast-util-gfm-table/lib", "gfmTableFromMarkdown")
  @js.native
  val gfmTableFromMarkdown: FromMarkdownExtension = js.native
  
  inline def gfmTableToMarkdown(): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")().asInstanceOf[ToMarkdownExtension]
  inline def gfmTableToMarkdown(options: Options): ToMarkdownExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("gfmTableToMarkdown")(options.asInstanceOf[js.Any]).asInstanceOf[ToMarkdownExtension]
  
  type AlignType = typingsJapgolly.mdast.mod.AlignType
  
  type FromMarkdownExtension = Extension
  
  type FromMarkdownHandle = Handle
  
  type InlineCode = typingsJapgolly.mdast.mod.InlineCode
  
  type MarkdownTableOptions = typingsJapgolly.markdownTable.mod.MarkdownTableOptions
  
  trait Options extends StObject {
    
    var stringLength: js.UndefOr[js.Function1[/* value */ String, Double]] = js.undefined
    
    var tableCellPadding: js.UndefOr[Boolean] = js.undefined
    
    var tablePipeAlign: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStringLength(value: /* value */ String => Double): Self = StObject.set(x, "stringLength", js.Any.fromFunction1(value))
      
      inline def setStringLengthUndefined: Self = StObject.set(x, "stringLength", js.undefined)
      
      inline def setTableCellPadding(value: Boolean): Self = StObject.set(x, "tableCellPadding", value.asInstanceOf[js.Any])
      
      inline def setTableCellPaddingUndefined: Self = StObject.set(x, "tableCellPadding", js.undefined)
      
      inline def setTablePipeAlign(value: Boolean): Self = StObject.set(x, "tablePipeAlign", value.asInstanceOf[js.Any])
      
      inline def setTablePipeAlignUndefined: Self = StObject.set(x, "tablePipeAlign", js.undefined)
    }
  }
  
  type SafeOptions = typingsJapgolly.mdastUtilToMarkdown.mod.SafeOptions
  
  type Table = typingsJapgolly.mdast.mod.Table
  
  type TableCell = typingsJapgolly.mdast.mod.TableCell
  
  type TableRow = typingsJapgolly.mdast.mod.TableRow
  
  type ToMarkdownContext = Context
  
  type ToMarkdownExtension = typingsJapgolly.mdastUtilToMarkdown.mod.Options
  
  type ToMarkdownHandle = typingsJapgolly.mdastUtilToMarkdown.mod.Handle
}
