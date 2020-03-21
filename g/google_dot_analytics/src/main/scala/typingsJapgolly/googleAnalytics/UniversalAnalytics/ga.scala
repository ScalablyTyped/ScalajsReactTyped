package typingsJapgolly.googleAnalytics.UniversalAnalytics

import typingsJapgolly.googleAnalytics.AnonEventAction
import typingsJapgolly.googleAnalytics.AnonEventCategory
import typingsJapgolly.googleAnalytics.AnonSocialAction
import typingsJapgolly.googleAnalytics.AnonTimingCategory
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.create
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.event
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.pageview
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.provide
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.remove
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.require
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.send
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.social
import typingsJapgolly.googleAnalytics.googleAnalyticsStrings.timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ga extends js.Object {
  var l: Double = js.native
  var q: js.Array[_] = js.native
  def apply(command: String, fields: js.Any*): Unit = js.native
  def apply(command: String, hitType: HitType, fields: js.Any*): Unit = js.native
  def apply(command: create, trackingId: String): Unit = js.native
  def apply(command: create, trackingId: String, cookieDomain: String): Unit = js.native
  def apply(command: create, trackingId: String, cookieDomain: String, name: String): Unit = js.native
  def apply(
    command: create,
    trackingId: String,
    cookieDomain: String,
    name: String,
    fieldsObject: FieldsObject
  ): Unit = js.native
  def apply(
    command: provide,
    pluginName: String,
    pluginConstructor: js.Function2[/* tracker */ Tracker, /* pluginOptions */ js.UndefOr[js.Object], Unit]
  ): Unit = js.native
  def apply(command: remove): Unit = js.native
  def apply(command: require, pluginName: String): Unit = js.native
  def apply(command: require, pluginName: String, pluginOptions: js.Any): Unit = js.native
  def apply(command: send, fieldsObject: AnonEventCategory): Unit = js.native
  def apply(command: send, fieldsObject: FieldsObject): Unit = js.native
  def apply(command: send, hitType: event, eventCategory: String, eventAction: String): Unit = js.native
  def apply(command: send, hitType: event, eventCategory: String, eventAction: String, eventLabel: String): Unit = js.native
  def apply(
    command: send,
    hitType: event,
    eventCategory: String,
    eventAction: String,
    eventLabel: String,
    eventValue: Double
  ): Unit = js.native
  def apply(
    command: send,
    hitType: event,
    eventCategory: String,
    eventAction: String,
    eventLabel: String,
    eventValue: Double,
    fieldsObject: FieldsObject
  ): Unit = js.native
  def apply(command: send, hitType: event, fieldsObject: AnonEventAction): Unit = js.native
  def apply(command: send, hitType: pageview, page: String): Unit = js.native
  def apply(command: send, hitType: social, fieldsObject: AnonSocialAction): Unit = js.native
  def apply(command: send, hitType: social, socialNetwork: String, socialAction: String, socialTarget: String): Unit = js.native
  def apply(command: send, hitType: timing, fieldsObject: AnonTimingCategory): Unit = js.native
  def apply(command: send, hitType: timing, timingCategory: String, timingVar: String, timingValue: Double): Unit = js.native
  def apply(readyCallback: js.Function1[/* defaultTracker */ js.UndefOr[Tracker], Unit]): Unit = js.native
  def create(trackingId: String): Tracker = js.native
  def create(trackingId: String, cookieDomain: String): Tracker = js.native
  def create(trackingId: String, cookieDomain: String, fieldsObject: FieldsObject): Tracker = js.native
  def create(trackingId: String, cookieDomain: String, name: String): Tracker = js.native
  def create(trackingId: String, cookieDomain: String, name: String, fieldsObject: FieldsObject): Tracker = js.native
  def create(trackingId: String, fieldsObject: FieldsObject): Tracker = js.native
  def getAll(): js.Array[Tracker] = js.native
  def getByName(name: String): Tracker = js.native
  def remove(name: String): Unit = js.native
}

