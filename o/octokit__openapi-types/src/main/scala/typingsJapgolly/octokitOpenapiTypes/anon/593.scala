package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `593` extends StObject {
  
  /** The time frame to display results for. */
  var per: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per'] */ js.Any
  ] = js.undefined
}
object `593` {
  
  inline def apply(): `593` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`593`]
  }
  
  extension [Self <: `593`](x: Self) {
    
    inline def setPer(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per'] */ js.Any
    ): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
