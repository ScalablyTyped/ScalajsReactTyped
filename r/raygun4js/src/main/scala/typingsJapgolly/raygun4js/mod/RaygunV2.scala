package typingsJapgolly.raygun4js.mod

import typingsJapgolly.raygun4js.AnonLevel
import typingsJapgolly.raygun4js.AnonType
import typingsJapgolly.raygun4js.raygun4jsStrings.apiKey
import typingsJapgolly.raygun4js.raygun4jsStrings.attach
import typingsJapgolly.raygun4js.raygun4jsStrings.detach
import typingsJapgolly.raygun4js.raygun4jsStrings.disableAutoBreadcrumbs
import typingsJapgolly.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsClicks
import typingsJapgolly.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsConsole
import typingsJapgolly.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsNavigation
import typingsJapgolly.raygun4js.raygun4jsStrings.disableAutoBreadcrumbsXHR
import typingsJapgolly.raygun4js.raygun4jsStrings.enableAutoBreadcrumbs
import typingsJapgolly.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsClicks
import typingsJapgolly.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsConsole
import typingsJapgolly.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsNavigation
import typingsJapgolly.raygun4js.raygun4jsStrings.enableAutoBreadcrumbsXHR
import typingsJapgolly.raygun4js.raygun4jsStrings.enableCrashReporting
import typingsJapgolly.raygun4js.raygun4jsStrings.enablePulse
import typingsJapgolly.raygun4js.raygun4jsStrings.filterSensitiveData
import typingsJapgolly.raygun4js.raygun4jsStrings.getRaygunInstance
import typingsJapgolly.raygun4js.raygun4jsStrings.groupingKey
import typingsJapgolly.raygun4js.raygun4jsStrings.noConflict
import typingsJapgolly.raygun4js.raygun4jsStrings.onAfterSend
import typingsJapgolly.raygun4js.raygun4jsStrings.onBeforeSend
import typingsJapgolly.raygun4js.raygun4jsStrings.onBeforeXHR
import typingsJapgolly.raygun4js.raygun4jsStrings.options
import typingsJapgolly.raygun4js.raygun4jsStrings.recordBreadcrumb
import typingsJapgolly.raygun4js.raygun4jsStrings.saveIfOffline
import typingsJapgolly.raygun4js.raygun4jsStrings.send
import typingsJapgolly.raygun4js.raygun4jsStrings.setAutoBreadcrumbsXHRIgnoredHosts
import typingsJapgolly.raygun4js.raygun4jsStrings.setBreadcrumbLevel
import typingsJapgolly.raygun4js.raygun4jsStrings.setFilterScope
import typingsJapgolly.raygun4js.raygun4jsStrings.setUser
import typingsJapgolly.raygun4js.raygun4jsStrings.setVersion
import typingsJapgolly.raygun4js.raygun4jsStrings.trackEvent
import typingsJapgolly.raygun4js.raygun4jsStrings.whitelistCrossOriginDomains
import typingsJapgolly.raygun4js.raygun4jsStrings.withCustomData
import typingsJapgolly.raygun4js.raygun4jsStrings.withTags
import typingsJapgolly.std.RegExp
import typingsJapgolly.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaygunV2 extends js.Object {
  def apply(
    key: detach | disableAutoBreadcrumbs | enableAutoBreadcrumbs | disableAutoBreadcrumbsConsole | enableAutoBreadcrumbsConsole | disableAutoBreadcrumbsNavigation | enableAutoBreadcrumbsNavigation | disableAutoBreadcrumbsClicks | enableAutoBreadcrumbsClicks | disableAutoBreadcrumbsXHR | enableAutoBreadcrumbsXHR | setAutoBreadcrumbsXHRIgnoredHosts
  ): Unit = js.native
  def apply(key: apiKey, value: String): Unit = js.native
  def apply(key: attach, value: Boolean): Unit = js.native
  def apply(key: enableCrashReporting, value: Boolean): Unit = js.native
  def apply(key: enablePulse, value: Boolean): Unit = js.native
  def apply(key: filterSensitiveData, values: js.Array[String | RegExp]): Unit = js.native
  def apply(key: getRaygunInstance): RaygunStatic = js.native
  def apply(
    key: groupingKey,
    value: js.Function3[
      /* payload */ RaygunPayload, 
      /* stackTrace */ TracekitStackTrace, 
      /* options */ js.Any, 
      String | Unit
    ]
  ): Unit = js.native
  def apply(key: noConflict, value: Boolean): Unit = js.native
  def apply(key: onAfterSend, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
  def apply(key: onBeforeSend, callback: js.Function1[/* payload */ RaygunPayload, RaygunPayload | Boolean]): Unit = js.native
  def apply(key: onBeforeXHR, callback: js.Function1[/* xhr */ XMLHttpRequest, Unit]): Unit = js.native
  def apply(key: options, value: RaygunOptions): Unit = js.native
  def apply(key: recordBreadcrumb, message: String, metadata: js.Object): Unit = js.native
  def apply(key: recordBreadcrumb, message: AnonLevel, metadata: js.Object): Unit = js.native
  def apply(key: saveIfOffline, value: Boolean): Unit = js.native
  def apply(key: send, value: js.Any): Unit = js.native
  def apply(key: setBreadcrumbLevel, level: BreadcrumbLevel): Unit = js.native
  def apply(key: setFilterScope, value: String): Unit = js.native
  def apply(key: setUser, value: RaygunV2UserDetails): Unit = js.native
  def apply(key: setVersion, value: String): Unit = js.native
  def apply(key: trackEvent, value: AnonType): Unit = js.native
  def apply(key: whitelistCrossOriginDomains, values: js.Array[String]): Unit = js.native
  def apply(key: withCustomData, value: js.Any): Unit = js.native
  def apply(key: withTags, values: js.Array[String]): Unit = js.native
}

