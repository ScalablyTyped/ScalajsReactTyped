package typingsJapgolly.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.intlifyCoreBase.mod.DateTimeFormat
import typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats
import typingsJapgolly.intlifyCoreBase.mod.Locale
import typingsJapgolly.intlifyCoreBase.mod.LocaleMessage
import typingsJapgolly.intlifyCoreBase.mod.LocaleMessageDictionary
import typingsJapgolly.intlifyCoreBase.mod.LocaleMessages
import typingsJapgolly.intlifyCoreBase.mod.LocaleParams
import typingsJapgolly.intlifyCoreBase.mod.NumberFormats
import typingsJapgolly.intlifyCoreBase.mod.Path
import typingsJapgolly.intlifyCoreBase.mod.PickupLocales
import typingsJapgolly.intlifyCoreBase.mod.PluralizationRule
import typingsJapgolly.intlifyCoreBase.mod.RemoveIndexSignature
import typingsJapgolly.intlifyCoreBase.mod.SchemaParams
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.NonNullable
import typingsJapgolly.vueI18n.anon.Datetime
import typingsJapgolly.vueI18n.anon.DatetimeFormats
import typingsJapgolly.vueI18n.anon.Message
import typingsJapgolly.vueI18n.anon.VueI18nstringneverstringC
import typingsJapgolly.vueI18n.mod.^
import typingsJapgolly.vueI18n.vueI18nStrings.`en-US`
import typingsJapgolly.vueRuntimeCore.mod.ComponentInternalInstance
import typingsJapgolly.vueRuntimeCore.mod.InjectionKey
import typingsJapgolly.vueRuntimeCore.mod.ObjectDirective
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def I18nInjectionKey: (InjectionKey[I18n[js.Object, js.Object, js.Object, Locale, Boolean]]) | String = ^.asInstanceOf[js.Dynamic].selectDynamic("I18nInjectionKey").asInstanceOf[(InjectionKey[I18n[js.Object, js.Object, js.Object, Locale, Boolean]]) | String]

inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def castToVueI18n(i18n: I18n[js.Object, js.Object, js.Object, Locale, Boolean]): VueI18nstringneverstringC = ^.asInstanceOf[js.Dynamic].applyDynamic("castToVueI18n")(i18n.asInstanceOf[js.Any]).asInstanceOf[VueI18nstringneverstringC]

inline def createI18n[Legacy /* <: Boolean */, Options /* <: I18nOptions[
Datetime, 
Locale, 
(ComposerOptions[
  Datetime, 
  Locale, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]) | (VueI18nOptions[
  Datetime, 
  Locale, 
  ComposerOptions[
    Datetime, 
    Locale, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ]
])] */, Messages, DateTimeFormats, NumberFormats, OptionLocale](options: Options): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(options.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any]
inline def createI18n[Legacy /* <: Boolean */, Options /* <: I18nOptions[
Datetime, 
Locale, 
(ComposerOptions[
  Datetime, 
  Locale, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]) | (VueI18nOptions[
  Datetime, 
  Locale, 
  ComposerOptions[
    Datetime, 
    Locale, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ]
])] */, Messages, DateTimeFormats, NumberFormats, OptionLocale](options: Options, LegacyVueI18n: Any): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(options.asInstanceOf[js.Any], LegacyVueI18n.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any]

inline def createI18n_SchemaLocalesLegacyOptionsMessagesDateTimeFormatsNumberFormatsOptionLocale[Schema /* <: js.Object */, Locales /* <: String | js.Object */, Legacy /* <: Boolean */, Options /* <: I18nOptions[
SchemaParams[Schema, VueMessageType], 
LocaleParams[Locales, `en-US`], 
(ComposerOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]) | (VueI18nOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  ComposerOptions[
    SchemaParams[Schema, VueMessageType], 
    LocaleParams[Locales, `en-US`], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ]
])] */, Messages, DateTimeFormats, NumberFormats, OptionLocale](options: Options): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(options.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any]
inline def createI18n_SchemaLocalesLegacyOptionsMessagesDateTimeFormatsNumberFormatsOptionLocale[Schema /* <: js.Object */, Locales /* <: String | js.Object */, Legacy /* <: Boolean */, Options /* <: I18nOptions[
SchemaParams[Schema, VueMessageType], 
LocaleParams[Locales, `en-US`], 
(ComposerOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]) | (VueI18nOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  ComposerOptions[
    SchemaParams[Schema, VueMessageType], 
    LocaleParams[Locales, `en-US`], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    LocaleMessages[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
      VueMessageType
    ], 
    typingsJapgolly.intlifyCoreBase.mod.DateTimeFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ], 
    typingsJapgolly.intlifyCoreBase.mod.NumberFormats[
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
    ]
  ]
])] */, Messages, DateTimeFormats, NumberFormats, OptionLocale](options: Options, LegacyVueI18n: Any): /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createI18n")(options.asInstanceOf[js.Any], LegacyVueI18n.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends true ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, true> : / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof options * / any['legacy'] extends false ? vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, false> : vue-i18n.vue-i18n.I18n<Messages, DateTimeFormats, NumberFormats, OptionLocale, Legacy> */ js.Any]

inline def useI18n[Options /* <: UseI18nOptions[
Datetime, 
Locale, 
ComposerOptions[
  Datetime, 
  Locale, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]] */](): Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useI18n")().asInstanceOf[Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any]]
inline def useI18n[Options /* <: UseI18nOptions[
Datetime, 
Locale, 
ComposerOptions[
  Datetime, 
  Locale, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: {  message :vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>>,   datetime :vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}>,   number :vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}>} extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]] */](options: Options): Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useI18n")(options.asInstanceOf[js.Any]).asInstanceOf[Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any]]

inline def useI18n_SchemaLocalesOptions[Schema, Locales, Options /* <: UseI18nOptions[
SchemaParams[Schema, VueMessageType], 
LocaleParams[Locales, `en-US`], 
ComposerOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]] */](): Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useI18n")().asInstanceOf[Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any]]
inline def useI18n_SchemaLocalesOptions[Schema, Locales, Options /* <: UseI18nOptions[
SchemaParams[Schema, VueMessageType], 
LocaleParams[Locales, `en-US`], 
ComposerOptions[
  SchemaParams[Schema, VueMessageType], 
  LocaleParams[Locales, `en-US`], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, vue-i18n.vue-i18n.VueMessageType> extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]] */](options: Options): Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useI18n")(options.asInstanceOf[js.Any]).asInstanceOf[Composer[
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['datetimeFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['numberFormats'] */ js.Any
], 
NonNullable[
  /* import warning: importer.ImportType#apply Failed type conversion: Options['locale'] */ js.Any
], 
PickupLocales[
  NonNullable[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: Options['messages'] */ js.Any
    ]
  ], 
  /* keyof std.NonNullable<std.NonNullable<Options['messages']>> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Options['locale']> extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> : std.NonNullable<Options['locale']> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['messages']>>, keyof std.NonNullable<std.NonNullable<Options['messages']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['datetimeFormats']>>, keyof std.NonNullable<std.NonNullable<Options['datetimeFormats']>>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<std.NonNullable<Options['numberFormats']>>, keyof std.NonNullable<std.NonNullable<Options['numberFormats']>>> */ js.Any]]

inline def vTDirective(i18n: I18n[js.Object, js.Object, js.Object, Locale, Boolean]): TranslationDirective[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("vTDirective")(i18n.asInstanceOf[js.Any]).asInstanceOf[TranslationDirective[HTMLElement]]

type Choice = Double

type ComponentInstanceCreatedListener = js.Function2[
/* target */ VueI18n[
  Any, 
  js.Object, 
  js.Object, 
  Locale, 
  PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends string ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any, 
  Composer[
    Any, 
    js.Object, 
    js.Object, 
    Locale, 
    PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
  ]
], 
/* global */ VueI18n[
  Any, 
  js.Object, 
  js.Object, 
  Locale, 
  PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends string ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any, 
  Composer[
    Any, 
    js.Object, 
    js.Object, 
    Locale, 
    PickupLocales[NonNullable[Any] | js.Object, /* keyof std.NonNullable<any> */ String], 
    /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends @intlify/core-base.@intlify/core-base.Locale ? [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> : @intlify/core-base.@intlify/core-base.Locale | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<any>, keyof std.NonNullable<any>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
  ]
], 
Unit]

type CustomBlocks[Message] = js.Array[CustomBlock[Message]]

type DateTimeFormatResult = String

type DatetimeFormatProps = FormattableProps[Double | js.Date, DateTimeFormatOptions]

type DefineDateTimeFormat = DateTimeFormat

type DefineLocaleMessage = LocaleMessage[VueMessageType]

type DefineNumberFormat = typingsJapgolly.intlifyCoreBase.mod.NumberFormat

type I18nOptions[Schema /* <: Message */, Locales /* <: DatetimeFormats | String */, Options /* <: (ComposerOptions[
Schema, 
Locales, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
LocaleMessages[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  VueMessageType
], 
DateTimeFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
], 
NumberFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
]]) | (VueI18nOptions[
Schema, 
Locales, 
ComposerOptions[
  Schema, 
  Locales, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  LocaleMessages[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
    VueMessageType
  ], 
  DateTimeFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ], 
  NumberFormats[
    /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
  ]
]]) */] = I18nAdditionalOptions & Options

type LocaleMessageObject[Message] = LocaleMessageDictionary[Message, String]

type MissingHandler = js.Function4[
/* locale */ Locale, 
/* key */ Path, 
/* instance */ js.UndefOr[ComponentInternalInstance], 
/* type */ js.UndefOr[String], 
String | Unit]

type NumberFormatProps = FormattableProps[Double, NumberFormatOptions]

type NumberFormatResult = String

type PluralizationRulesMap = StringDictionary[PluralizationRule]

type RemovedIndexResources[T] = RemoveIndexSignature[
/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K]} */ js.Any]

type TranslateResult = String

type TranslationDirective[T] = ObjectDirective[T, Any]

type UseI18nOptions[Schema /* <: Message */, Locales /* <: DatetimeFormats | String */, Options /* <: ComposerOptions[
Schema, 
Locales, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
LocaleMessages[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  message :infer M} ? M : vue-i18n.vue-i18n.DefaultLocaleMessageSchema<@intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineLocaleMessage ]: vue-i18n.vue-i18n.DefineLocaleMessage[K]}>> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  messages :infer M} ? M : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  VueMessageType
], 
DateTimeFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  datetime :infer D} ? D : vue-i18n.vue-i18n.DefaultDateTimeFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineDateTimeFormat ]: vue-i18n.vue-i18n.DefineDateTimeFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  datetimeFormats :infer D} ? D : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
], 
NumberFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: Schema extends {  number :infer N} ? N : vue-i18n.vue-i18n.DefaultNumberFormatSchema</ * Inlined @intlify/core-base.@intlify/core-base.RemoveIndexSignature<{[ K in keyof vue-i18n.vue-i18n.DefineNumberFormat ]: vue-i18n.vue-i18n.DefineNumberFormat[K]}> * /
{}> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: Locales extends {  numberFormats :infer N} ? N : Locales extends string ? Locales : @intlify/core-base.@intlify/core-base.Locale */ js.Any
]] */] = ComposerAdditionalOptions & Options

type VueI18nResolveLocaleMessageTranslation[Locales] = ComposerResolveLocaleMessageTranslation[Locales]

type VueMessageType = String | (VNode[RendererNode, RendererElement, StringDictionary[Any]])
