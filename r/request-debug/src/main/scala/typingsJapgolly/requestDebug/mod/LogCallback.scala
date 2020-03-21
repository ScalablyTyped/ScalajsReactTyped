package typingsJapgolly.requestDebug.mod

import typingsJapgolly.request.mod.CoreOptions
import typingsJapgolly.request.mod.Request
import typingsJapgolly.request.mod.RequestAPI
import typingsJapgolly.request.mod.RequiredUriUrl
import typingsJapgolly.requestDebug.requestDebugStrings.auth
import typingsJapgolly.requestDebug.requestDebugStrings.redirect
import typingsJapgolly.requestDebug.requestDebugStrings.request
import typingsJapgolly.requestDebug.requestDebugStrings.response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends js.Object {
  def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: redirect, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
}

