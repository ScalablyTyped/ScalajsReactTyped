package typingsJapgolly.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanRange extends StObject {
  
  /**
    * Specifies the end of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is one less than the size of the object being queried. If only the End parameter is supplied, it is interpreted to mean scan the last N bytes of the file. For example, &lt;scanrange&gt;&lt;end&gt;50&lt;/end&gt;&lt;/scanrange&gt; means scan the last 50 bytes.
    */
  var End: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.End] = js.undefined
  
  /**
    * Specifies the start of the byte range. This parameter is optional. Valid values: non-negative integers. The default value is 0. If only start is supplied, it means scan from that point to the end of the file. For example, &lt;scanrange&gt;&lt;start&gt;50&lt;/start&gt;&lt;/scanrange&gt; means scan from byte 50 until the end of the file.
    */
  var Start: js.UndefOr[typingsJapgolly.awsSdk.clientsS3Mod.Start] = js.undefined
}
object ScanRange {
  
  inline def apply(): ScanRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRange]
  }
  
  extension [Self <: ScanRange](x: Self) {
    
    inline def setEnd(value: End): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "End", js.undefined)
    
    inline def setStart(value: Start): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
  }
}
