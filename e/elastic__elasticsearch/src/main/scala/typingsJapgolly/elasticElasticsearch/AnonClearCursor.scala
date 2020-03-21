package typingsJapgolly.elasticElasticsearch

import typingsJapgolly.elasticElasticsearch.mod.ApiMethod
import typingsJapgolly.elasticElasticsearch.mod.callbackFn
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SqlClearCursor
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SqlQuery
import typingsJapgolly.elasticElasticsearch.requestParamsMod.SqlTranslate
import typingsJapgolly.elasticElasticsearch.transportMod.ApiResponse
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestCallback
import typingsJapgolly.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearCursor extends js.Object {
  @JSName("clearCursor")
  var clearCursor_Original: ApiMethod[SqlClearCursor[_], _] = js.native
  @JSName("clear_cursor")
  var clear_cursor_Original: ApiMethod[SqlClearCursor[_], _] = js.native
  @JSName("query")
  var query_Original: ApiMethod[SqlQuery[_], _] = js.native
  @JSName("translate")
  var translate_Original: ApiMethod[SqlTranslate[_], _] = js.native
  // Promise API
  def clearCursor(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clearCursor(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCursor(params: SqlClearCursor[_]): js.Promise[ApiResponse[_, _]] = js.native
  def clearCursor(params: SqlClearCursor[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearCursor(params: SqlClearCursor[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clearCursor(params: SqlClearCursor[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clear_cursor(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clear_cursor(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cursor(params: SqlClearCursor[_]): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cursor(params: SqlClearCursor[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_cursor(params: SqlClearCursor[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clear_cursor(params: SqlClearCursor[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def query(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def query(callback: callbackFn[_]): TransportRequestCallback = js.native
  def query(params: SqlQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def query(params: SqlQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def query(params: SqlQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def query(params: SqlQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def translate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def translate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def translate(params: SqlTranslate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def translate(params: SqlTranslate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def translate(params: SqlTranslate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def translate(params: SqlTranslate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

