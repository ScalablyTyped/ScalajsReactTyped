package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Searchafter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherQueryWatchesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Searchafter] = js.undefined
}
object WatcherQueryWatchesRequest {
  
  inline def apply(): WatcherQueryWatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherQueryWatchesRequest]
  }
  
  extension [Self <: WatcherQueryWatchesRequest](x: Self) {
    
    inline def setBody(value: Searchafter): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
