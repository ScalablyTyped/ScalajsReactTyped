package typingsJapgolly.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Struct extends StObject {
  
  /** Unordered map of dynamically typed values. */
  var fields: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value} */ js.Any
  ] = js.undefined
}
object Struct {
  
  inline def apply(): Struct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Struct]
  }
  
  extension [Self <: Struct](x: Self) {
    
    inline def setFields(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.script.gapi.client.script.Value} */ js.Any
    ): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
