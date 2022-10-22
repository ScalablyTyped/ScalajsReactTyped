package typingsJapgolly.wordpressI18n

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.GetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.HasTranslation
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.I18n
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.IsRtl
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.ResetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.SetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDefaultI18nMod extends Shortcut {
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", JSImport.Default)
  @js.native
  val default: I18n = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "__")
  @js.native
  val __ : typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.__ = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "getLocaleData")
  @js.native
  val getLocaleData: GetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "hasTranslation")
  @js.native
  val hasTranslation: HasTranslation = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "isRTL")
  @js.native
  val isRTL: IsRtl = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_n")
  @js.native
  val n: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.n = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_nx")
  @js.native
  val nx: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.nx = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "resetLocaleData")
  @js.native
  val resetLocaleData: ResetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "setLocaleData")
  @js.native
  val setLocaleData: SetLocaleData = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "subscribe")
  @js.native
  val subscribe: Subscribe = js.native
  
  @JSImport("@wordpress/i18n/build-types/default-i18n", "_x")
  @js.native
  val x: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.x = js.native
  
  type LocaleData = typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.LocaleData
  
  type SubscribeCallback = typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.SubscribeCallback
  
  type UnsubscribeCallback = typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.UnsubscribeCallback
  
  type _To = I18n
  
  /* This means you don't have to write `default`, but can instead just say `buildTypesDefaultI18nMod.foo` */
  override def _to: I18n = default
}
