package typingsJapgolly.firebaseAnalytics.anon

import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentSettings
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.ControlParams
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.CustomParams
import typingsJapgolly.firebaseAnalytics.distEsmSrcPublicTypesMod.EventParams
import typingsJapgolly.firebaseAnalytics.distEsmSrcTypesMod.Gtag
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.config
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.consent
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.default
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.event
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.set
import typingsJapgolly.firebaseAnalytics.firebaseAnalyticsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GtagCore extends StObject {
  
  def gtagCore(command: consent, subCommand: default | update, consentSettings: ConsentSettings): Unit
  @JSName("gtagCore")
  var gtagCore_Original: Gtag
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: ControlParams): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: CustomParams): Unit
  @JSName("gtagCore")
  def gtagCore_config(command: config, targetId: String, config: EventParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: ControlParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: CustomParams): Unit
  @JSName("gtagCore")
  def gtagCore_event(command: event, eventName: String, eventParams: EventParams): Unit
  @JSName("gtagCore")
  def gtagCore_set(command: set, config: CustomParams): Unit
  
  def wrappedGtag(command: consent, subCommand: default | update, consentSettings: ConsentSettings): Unit
  @JSName("wrappedGtag")
  var wrappedGtag_Original: Gtag
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: ControlParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: CustomParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_config(command: config, targetId: String, config: EventParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: ControlParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: CustomParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_event(command: event, eventName: String, eventParams: EventParams): Unit
  @JSName("wrappedGtag")
  def wrappedGtag_set(command: set, config: CustomParams): Unit
}
object GtagCore {
  
  inline def apply(gtagCore: Gtag, wrappedGtag: Gtag): GtagCore = {
    val __obj = js.Dynamic.literal(gtagCore = gtagCore.asInstanceOf[js.Any], wrappedGtag = wrappedGtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GtagCore]
  }
  
  extension [Self <: GtagCore](x: Self) {
    
    inline def setGtagCore(value: Gtag): Self = StObject.set(x, "gtagCore", value.asInstanceOf[js.Any])
    
    inline def setWrappedGtag(value: Gtag): Self = StObject.set(x, "wrappedGtag", value.asInstanceOf[js.Any])
  }
}
