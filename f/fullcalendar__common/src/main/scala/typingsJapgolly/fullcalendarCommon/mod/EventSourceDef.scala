package typingsJapgolly.fullcalendarCommon.mod

import typingsJapgolly.fullcalendarCommon.anon.Context
import typingsJapgolly.fullcalendarCommon.anon.RawEvents
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceDef[Meta] extends StObject {
  
  def fetch(
    arg: Context[Meta],
    success: js.Function1[/* res */ RawEvents, Unit],
    failure: js.Function1[/* error */ EventSourceError, Unit]
  ): Unit | PromiseLike[js.Array[EventInput]]
  @JSName("fetch")
  var fetch_Original: EventSourceFetcher[Meta]
  
  var ignoreRange: js.UndefOr[Boolean] = js.undefined
  
  def parseMeta(refined: EventSourceRefined): Meta | Null
}
object EventSourceDef {
  
  inline def apply[Meta](
    fetch: (/* arg */ Context[Meta], /* success */ js.Function1[/* res */ RawEvents, Unit], /* failure */ js.Function1[/* error */ EventSourceError, Unit]) => Unit | PromiseLike[js.Array[EventInput]],
    parseMeta: EventSourceRefined => Meta | Null
  ): EventSourceDef[Meta] = {
    val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction3(fetch), parseMeta = js.Any.fromFunction1(parseMeta))
    __obj.asInstanceOf[EventSourceDef[Meta]]
  }
  
  extension [Self <: EventSourceDef[?], Meta](x: Self & EventSourceDef[Meta]) {
    
    inline def setFetch(
      value: (/* arg */ Context[Meta], /* success */ js.Function1[/* res */ RawEvents, Unit], /* failure */ js.Function1[/* error */ EventSourceError, Unit]) => Unit | PromiseLike[js.Array[EventInput]]
    ): Self = StObject.set(x, "fetch", js.Any.fromFunction3(value))
    
    inline def setIgnoreRange(value: Boolean): Self = StObject.set(x, "ignoreRange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreRangeUndefined: Self = StObject.set(x, "ignoreRange", js.undefined)
    
    inline def setParseMeta(value: EventSourceRefined => Meta | Null): Self = StObject.set(x, "parseMeta", js.Any.fromFunction1(value))
  }
}
