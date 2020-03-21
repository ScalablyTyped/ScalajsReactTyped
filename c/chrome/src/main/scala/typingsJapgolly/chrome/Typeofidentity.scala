package typingsJapgolly.chrome

import typingsJapgolly.chrome.chrome.identity.AccountInfo
import typingsJapgolly.chrome.chrome.identity.SignInChangeEvent
import typingsJapgolly.chrome.chrome.identity.TokenDetails
import typingsJapgolly.chrome.chrome.identity.TokenInformation
import typingsJapgolly.chrome.chrome.identity.UserInfo
import typingsJapgolly.chrome.chrome.identity.WebAuthFlowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofidentity extends js.Object {
  var onSignInChanged: SignInChangeEvent = js.native
  def getAccounts(callback: js.Function1[/* accounts */ js.Array[AccountInfo], Unit]): Unit = js.native
  def getAuthToken(details: TokenDetails): Unit = js.native
  def getAuthToken(details: TokenDetails, callback: js.Function1[/* token */ String, Unit]): Unit = js.native
  def getProfileUserInfo(callback: js.Function1[/* userInfo */ UserInfo, Unit]): Unit = js.native
  def getRedirectURL(): String = js.native
  def getRedirectURL(path: String): String = js.native
  def launchWebAuthFlow(details: WebAuthFlowOptions, callback: js.Function1[/* responseUrl */ js.UndefOr[String], Unit]): Unit = js.native
  def removeCachedAuthToken(details: TokenInformation): Unit = js.native
  def removeCachedAuthToken(details: TokenInformation, callback: js.Function0[Unit]): Unit = js.native
}

