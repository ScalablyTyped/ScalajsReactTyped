package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `484` extends StObject {
  
  /** The full path, relative to the repository root, of the dependency manifest file. */
  var name: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['manifest-path'] */ js.Any
  ] = js.undefined
}
object `484` {
  
  inline def apply(): `484` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`484`]
  }
  
  extension [Self <: `484`](x: Self) {
    
    inline def setName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['manifest-path'] */ js.Any
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
