package typingsJapgolly.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilGetImportExportSpecifierInfoMod {
  
  @JSImport("sucrase/dist/types/util/getImportExportSpecifierInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default): ImportExportSpecifierInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any]).asInstanceOf[ImportExportSpecifierInfo]
  inline def default(tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default, index: Double): ImportExportSpecifierInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tokens.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ImportExportSpecifierInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sucrase.anon.EndIndex
    - typingsJapgolly.sucrase.anon.IsType
  */
  trait ImportExportSpecifierInfo extends StObject
  object ImportExportSpecifierInfo {
    
    inline def EndIndex(endIndex: Double, leftName: String, rightName: String): typingsJapgolly.sucrase.anon.EndIndex = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = false, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sucrase.anon.EndIndex]
    }
    
    inline def IsType(endIndex: Double, leftName: Null, rightName: Null): typingsJapgolly.sucrase.anon.IsType = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], isType = true, leftName = leftName.asInstanceOf[js.Any], rightName = rightName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.sucrase.anon.IsType]
    }
  }
}
