package typingsJapgolly.fluentSequence

import typingsJapgolly.fluentBundle.mod.FluentBundle
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMapAsyncMod {
  
  @JSImport("@fluent/sequence/esm/map_async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapBundleAsync(bundles: AsyncIterable[FluentBundle], ids: String): js.Promise[FluentBundle | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapBundleAsync")(bundles.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FluentBundle | Null]]
  inline def mapBundleAsync(bundles: AsyncIterable[FluentBundle], ids: js.Array[String]): js.Promise[js.Array[FluentBundle | Null]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapBundleAsync")(bundles.asInstanceOf[js.Any], ids.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[FluentBundle | Null]]]
}
