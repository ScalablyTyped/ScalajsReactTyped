package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.AltCallbackFields
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.CallbackFieldsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V3Resource extends StObject {
  
  /** Updates an existing resource. */
  def updateCommentThreads(request: AltCallbackFields): Request[CommentThread] = js.native
  def updateCommentThreads(request: CallbackFieldsKey, body: CommentThread): Request[CommentThread] = js.native
}
