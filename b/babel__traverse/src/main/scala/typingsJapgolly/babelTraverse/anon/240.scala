package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.TSImportType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `240` extends StObject {
  
  var `type`: TSImportType
}
object `240` {
  
  inline def apply(): `240` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[`240`]
  }
  
  extension [Self <: `240`](x: Self) {
    
    inline def setType(value: TSImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
