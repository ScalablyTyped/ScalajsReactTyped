package typingsJapgolly.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// scope 列表
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserInfo
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserLocation
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserLocationBackground
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotaddress
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotinvoiceTitle
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotinvoice
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotwerun
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotrecord
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotwritePhotosAlbum
  - typingsJapgolly.weixinApp.weixinAppStrings.scopeDotcamera
*/
trait Scope extends js.Object

object Scope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def scopeDotaddress: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotaddress = this.cast("scope.address")
  @scala.inline
  def scopeDotcamera: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotcamera = this.cast("scope.camera")
  @scala.inline
  def scopeDotinvoice: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotinvoice = this.cast("scope.invoice")
  @scala.inline
  def scopeDotinvoiceTitle: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotinvoiceTitle = this.cast("scope.invoiceTitle")
  @scala.inline
  def scopeDotrecord: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotrecord = this.cast("scope.record")
  @scala.inline
  def scopeDotuserInfo: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserInfo = this.cast("scope.userInfo")
  @scala.inline
  def scopeDotuserLocation: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserLocation = this.cast("scope.userLocation")
  @scala.inline
  def scopeDotuserLocationBackground: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotuserLocationBackground = this.cast("scope.userLocationBackground")
  @scala.inline
  def scopeDotwerun: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotwerun = this.cast("scope.werun")
  @scala.inline
  def scopeDotwritePhotosAlbum: typingsJapgolly.weixinApp.weixinAppStrings.scopeDotwritePhotosAlbum = this.cast("scope.writePhotosAlbum")
}

