package typingsJapgolly.next.anon

import typingsJapgolly.next.distClientComponentsReducerMod.FocusAndScrollRef
import typingsJapgolly.next.distClientComponentsReducerMod.PushRef
import typingsJapgolly.next.distServerAppRenderMod.FlightRouterState
import typingsJapgolly.next.distSharedLibAppRouterContextMod.CacheNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<next.next/dist/client/components/reducer.AppRouterState> */
trait ReadonlyAppRouterState extends StObject {
  
  val cache: CacheNode
  
  val canonicalUrl: String
  
  val focusAndScrollRef: FocusAndScrollRef
  
  val prefetchCache: typingsJapgolly.std.Map[String, FlightSegmentPath]
  
  val pushRef: PushRef
  
  val tree: FlightRouterState
}
object ReadonlyAppRouterState {
  
  inline def apply(
    cache: CacheNode,
    canonicalUrl: String,
    focusAndScrollRef: FocusAndScrollRef,
    prefetchCache: typingsJapgolly.std.Map[String, FlightSegmentPath],
    pushRef: PushRef,
    tree: FlightRouterState
  ): ReadonlyAppRouterState = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], canonicalUrl = canonicalUrl.asInstanceOf[js.Any], focusAndScrollRef = focusAndScrollRef.asInstanceOf[js.Any], prefetchCache = prefetchCache.asInstanceOf[js.Any], pushRef = pushRef.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyAppRouterState]
  }
  
  extension [Self <: ReadonlyAppRouterState](x: Self) {
    
    inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setFocusAndScrollRef(value: FocusAndScrollRef): Self = StObject.set(x, "focusAndScrollRef", value.asInstanceOf[js.Any])
    
    inline def setPrefetchCache(value: typingsJapgolly.std.Map[String, FlightSegmentPath]): Self = StObject.set(x, "prefetchCache", value.asInstanceOf[js.Any])
    
    inline def setPushRef(value: PushRef): Self = StObject.set(x, "pushRef", value.asInstanceOf[js.Any])
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
