package typingsJapgolly.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsTruncateTruncateEndMod {
  
  @JSImport("autolinker/dist/commonjs/truncate/truncate-end", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def truncateEnd(anchorText: String, truncateLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateEnd")(anchorText.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncateEnd(anchorText: String, truncateLen: Double, ellipsisChars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateEnd")(anchorText.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any], ellipsisChars.asInstanceOf[js.Any])).asInstanceOf[String]
}
