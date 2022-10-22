package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.legacy
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildtypeSource extends StObject {
  
  /**
    * @description The process in which the Page will be built. Possible values are `"legacy"` and `"workflow"`.
    * @enum {string}
    */
  var build_type: js.UndefOr[legacy | workflow] = js.undefined
  
  /** @description The source branch and directory used to publish your Pages site. */
  var source: js.UndefOr[BranchStringPath] = js.undefined
}
object BuildtypeSource {
  
  inline def apply(): BuildtypeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildtypeSource]
  }
  
  extension [Self <: BuildtypeSource](x: Self) {
    
    inline def setBuild_type(value: legacy | workflow): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setBuild_typeUndefined: Self = StObject.set(x, "build_type", js.undefined)
    
    inline def setSource(value: BranchStringPath): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
