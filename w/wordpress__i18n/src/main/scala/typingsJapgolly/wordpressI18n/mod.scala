package typingsJapgolly.wordpressI18n

import typingsJapgolly.wordpressHooks.buildTypesCreateHooksMod._Hooks
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.GetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.HasTranslation
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.I18n
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.IsRtl
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.LocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.ResetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.SetLocaleData
import typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/i18n", "__")
  @js.native
  val __ : typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.__ = js.native
  
  inline def createI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")().asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: Unit, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any]).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: String, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  inline def createI18n(initialData: LocaleData, initialDomain: Unit, hooks: _Hooks): I18n = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(initialData.asInstanceOf[js.Any], initialDomain.asInstanceOf[js.Any], hooks.asInstanceOf[js.Any])).asInstanceOf[I18n]
  
  @JSImport("@wordpress/i18n", "defaultI18n")
  @js.native
  val defaultI18n: I18n = js.native
  
  @JSImport("@wordpress/i18n", "getLocaleData")
  @js.native
  val getLocaleData: GetLocaleData = js.native
  
  @JSImport("@wordpress/i18n", "hasTranslation")
  @js.native
  val hasTranslation: HasTranslation = js.native
  
  @JSImport("@wordpress/i18n", "isRTL")
  @js.native
  val isRTL: IsRtl = js.native
  
  @JSImport("@wordpress/i18n", "_n")
  @js.native
  val n: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.n = js.native
  
  @JSImport("@wordpress/i18n", "_nx")
  @js.native
  val nx: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.nx = js.native
  
  @JSImport("@wordpress/i18n", "resetLocaleData")
  @js.native
  val resetLocaleData: ResetLocaleData = js.native
  
  @JSImport("@wordpress/i18n", "setLocaleData")
  @js.native
  val setLocaleData: SetLocaleData = js.native
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("@wordpress/i18n", "subscribe")
  @js.native
  val subscribe: Subscribe = js.native
  
  @JSImport("@wordpress/i18n", "_x")
  @js.native
  val x: typingsJapgolly.wordpressI18n.buildTypesCreateI18nMod.x = js.native
}
