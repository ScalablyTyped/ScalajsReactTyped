package typingsJapgolly.node.anon

import typingsJapgolly.node.dnsMod.RecordWithTtl
import typingsJapgolly.node.dnsMod.ResolveOptions
import typingsJapgolly.node.dnsMod.ResolveWithTtlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostnameOptions extends StObject {
  
  def apply(hostname: String): js.Promise[js.Array[String]] = js.native
  def apply(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def apply(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
}
