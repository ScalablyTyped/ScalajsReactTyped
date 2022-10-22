package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
  def level(subsystem: String, level: String): js.Promise[Any] = js.native
  def level(subsystem: String, level: String, options: AbortOptions & HTTPClientExtraOptions): js.Promise[Any] = js.native
  
  def ls(): js.Promise[Any] = js.native
  def ls(options: AbortOptions & HTTPClientExtraOptions): js.Promise[Any] = js.native
  
  def tail(): AsyncIterable[Any] = js.native
  def tail(options: AbortOptions & HTTPClientExtraOptions): AsyncIterable[Any] = js.native
}
