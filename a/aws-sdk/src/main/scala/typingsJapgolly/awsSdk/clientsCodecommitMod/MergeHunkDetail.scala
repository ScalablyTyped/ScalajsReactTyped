package typingsJapgolly.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeHunkDetail extends StObject {
  
  /**
    * The end position of the hunk in the merge result.
    */
  var endLine: js.UndefOr[LineNumber] = js.undefined
  
  /**
    * The base-64 encoded content of the hunk merged region that might contain a conflict.
    */
  var hunkContent: js.UndefOr[HunkContent] = js.undefined
  
  /**
    * The start position of the hunk in the merge result.
    */
  var startLine: js.UndefOr[LineNumber] = js.undefined
}
object MergeHunkDetail {
  
  inline def apply(): MergeHunkDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeHunkDetail]
  }
  
  extension [Self <: MergeHunkDetail](x: Self) {
    
    inline def setEndLine(value: LineNumber): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
    
    inline def setEndLineUndefined: Self = StObject.set(x, "endLine", js.undefined)
    
    inline def setHunkContent(value: HunkContent): Self = StObject.set(x, "hunkContent", value.asInstanceOf[js.Any])
    
    inline def setHunkContentUndefined: Self = StObject.set(x, "hunkContent", js.undefined)
    
    inline def setStartLine(value: LineNumber): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    inline def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
  }
}
