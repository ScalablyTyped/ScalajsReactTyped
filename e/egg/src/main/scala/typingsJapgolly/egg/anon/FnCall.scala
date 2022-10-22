package typingsJapgolly.egg.anon

import typingsJapgolly.urllib.srcEsmRequestMod.RequestOptions
import typingsJapgolly.urllib.srcEsmRequestMod.RequestURL
import typingsJapgolly.urllib.srcEsmResponseMod.HttpClientResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(url: RequestURL): js.Promise[HttpClientResponse] = js.native
  def apply(url: RequestURL, options: RequestOptions): js.Promise[HttpClientResponse] = js.native
}
