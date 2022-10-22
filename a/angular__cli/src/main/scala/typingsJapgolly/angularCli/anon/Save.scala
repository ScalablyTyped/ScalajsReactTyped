package typingsJapgolly.angularCli.anon

import typingsJapgolly.angularCli.srcUtilitiesPackageMetadataMod.NgAddSaveDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Save extends StObject {
  
  var save: js.UndefOr[NgAddSaveDependency] = js.undefined
}
object Save {
  
  inline def apply(): Save = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Save]
  }
  
  extension [Self <: Save](x: Self) {
    
    inline def setSave(value: NgAddSaveDependency): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
