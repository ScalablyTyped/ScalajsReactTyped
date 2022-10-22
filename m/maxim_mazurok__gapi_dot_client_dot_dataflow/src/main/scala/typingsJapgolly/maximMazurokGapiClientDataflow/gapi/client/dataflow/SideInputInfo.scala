package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SideInputInfo extends StObject {
  
  /** How to interpret the source element(s) as a side input value. */
  var kind: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /**
    * The source(s) to read element(s) from to get the value of this side input. If more than one source, then the elements are taken from the sources, in the specified order if order
    * matters. At least one source is required.
    */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  
  /** The id of the tag the user code will access this side input by; this should correspond to the tag of some MultiOutputInfo. */
  var tag: js.UndefOr[String] = js.undefined
}
object SideInputInfo {
  
  inline def apply(): SideInputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SideInputInfo]
  }
  
  extension [Self <: SideInputInfo](x: Self) {
    
    inline def setKind(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSources(value: js.Array[Source]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Source*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
