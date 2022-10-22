package typingsJapgolly.emojiMart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Component
import org.scalajs.dom.HTMLElement
import typingsJapgolly.emojiMart.anon.PartialRecordCategoryName
import typingsJapgolly.emojiMart.anon.RecordCategoryNameReactNo
import typingsJapgolly.emojiMart.anon.RecordCategoryNamestring
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.CustomEmoji
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiData
import typingsJapgolly.emojiMart.distEsUtilsEmojiIndexNimbleEmojiIndexMod.EmojiSkin
import typingsJapgolly.emojiMart.emojiMartStrings.auto
import typingsJapgolly.emojiMart.emojiMartStrings.dark
import typingsJapgolly.emojiMart.emojiMartStrings.light
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsUtilsSharedPropsMod {
  
  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.emojiMartStrings.search
    - typingsJapgolly.emojiMart.emojiMartStrings.recent
    - typingsJapgolly.emojiMart.emojiMartStrings.people
    - typingsJapgolly.emojiMart.emojiMartStrings.nature
    - typingsJapgolly.emojiMart.emojiMartStrings.foods
    - typingsJapgolly.emojiMart.emojiMartStrings.activity
    - typingsJapgolly.emojiMart.emojiMartStrings.places
    - typingsJapgolly.emojiMart.emojiMartStrings.objects
    - typingsJapgolly.emojiMart.emojiMartStrings.symbols
    - typingsJapgolly.emojiMart.emojiMartStrings.flags
    - typingsJapgolly.emojiMart.emojiMartStrings.custom
  */
  trait CategoryName extends StObject
  object CategoryName {
    
    inline def activity: typingsJapgolly.emojiMart.emojiMartStrings.activity = "activity".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.activity]
    
    inline def custom: typingsJapgolly.emojiMart.emojiMartStrings.custom = "custom".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.custom]
    
    inline def flags: typingsJapgolly.emojiMart.emojiMartStrings.flags = "flags".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.flags]
    
    inline def foods: typingsJapgolly.emojiMart.emojiMartStrings.foods = "foods".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.foods]
    
    inline def nature: typingsJapgolly.emojiMart.emojiMartStrings.nature = "nature".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.nature]
    
    inline def objects: typingsJapgolly.emojiMart.emojiMartStrings.objects = "objects".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.objects]
    
    inline def people: typingsJapgolly.emojiMart.emojiMartStrings.people = "people".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.people]
    
    inline def places: typingsJapgolly.emojiMart.emojiMartStrings.places = "places".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.places]
    
    inline def recent: typingsJapgolly.emojiMart.emojiMartStrings.recent = "recent".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.recent]
    
    inline def search: typingsJapgolly.emojiMart.emojiMartStrings.search = "search".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.search]
    
    inline def symbols: typingsJapgolly.emojiMart.emojiMartStrings.symbols = "symbols".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.symbols]
  }
  
  trait CustomIcons extends StObject {
    
    var categories: RecordCategoryNameReactNo
  }
  object CustomIcons {
    
    inline def apply(categories: RecordCategoryNameReactNo): CustomIcons = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIcons]
    }
    
    extension [Self <: CustomIcons](x: Self) {
      
      inline def setCategories(value: RecordCategoryNameReactNo): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmojiProps extends StObject {
    
    /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
    var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
    
    var emoji: String | EmojiData
    
    var fallback: js.UndefOr[
        js.Function2[
          /* emoji */ EmojiData, 
          /* props */ this.type, 
          (Component[js.Object, js.Object]) | Element
        ]
      ] = js.undefined
    
    var forceSize: js.UndefOr[Boolean] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
      ] = js.undefined
    
    var onLeave: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
      ] = js.undefined
    
    var onOver: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
      ] = js.undefined
    
    /** defaults to 'apple' */
    var set: js.UndefOr[EmojiSet] = js.undefined
    
    /** defaults to 52 */
    var sheetColumns: js.UndefOr[Double] = js.undefined
    
    /** defaults to 52 */
    var sheetRows: js.UndefOr[Double] = js.undefined
    
    /** defaults to 64 */
    var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
    
    var size: Double
    
    /** defaults to 1 */
    var skin: js.UndefOr[EmojiSkin] = js.undefined
    
    var tooltip: js.UndefOr[Boolean] = js.undefined
  }
  object EmojiProps {
    
    inline def apply(emoji: String | EmojiData, size: Double): EmojiProps = {
      val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmojiProps]
    }
    
    extension [Self <: EmojiProps](x: Self) {
      
      inline def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = StObject.set(x, "backgroundImageFn", js.Any.fromFunction2(value))
      
      inline def setBackgroundImageFnUndefined: Self = StObject.set(x, "backgroundImageFn", js.undefined)
      
      inline def setEmoji(value: String | EmojiData): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: (/* emoji */ EmojiData, EmojiProps) => (Component[js.Object, js.Object]) | Element): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setForceSize(value: Boolean): Self = StObject.set(x, "forceSize", value.asInstanceOf[js.Any])
      
      inline def setForceSizeUndefined: Self = StObject.set(x, "forceSize", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setOnClick(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnLeave(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onLeave", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      inline def setOnOver(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onOver", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnOverUndefined: Self = StObject.set(x, "onOver", js.undefined)
      
      inline def setSet(value: EmojiSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSheetColumns(value: Double): Self = StObject.set(x, "sheetColumns", value.asInstanceOf[js.Any])
      
      inline def setSheetColumnsUndefined: Self = StObject.set(x, "sheetColumns", js.undefined)
      
      inline def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
      
      inline def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
      
      inline def setSheetSize(value: EmojiSheetSize): Self = StObject.set(x, "sheetSize", value.asInstanceOf[js.Any])
      
      inline def setSheetSizeUndefined: Self = StObject.set(x, "sheetSize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.emojiMartStrings.apple
    - typingsJapgolly.emojiMart.emojiMartStrings.google
    - typingsJapgolly.emojiMart.emojiMartStrings.twitter
    - typingsJapgolly.emojiMart.emojiMartStrings.emojione
    - typingsJapgolly.emojiMart.emojiMartStrings.messenger
    - typingsJapgolly.emojiMart.emojiMartStrings.facebook
  */
  trait EmojiSet extends StObject
  object EmojiSet {
    
    inline def apple: typingsJapgolly.emojiMart.emojiMartStrings.apple = "apple".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.apple]
    
    inline def emojione: typingsJapgolly.emojiMart.emojiMartStrings.emojione = "emojione".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.emojione]
    
    inline def facebook: typingsJapgolly.emojiMart.emojiMartStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.facebook]
    
    inline def google: typingsJapgolly.emojiMart.emojiMartStrings.google = "google".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.google]
    
    inline def messenger: typingsJapgolly.emojiMart.emojiMartStrings.messenger = "messenger".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.messenger]
    
    inline def twitter: typingsJapgolly.emojiMart.emojiMartStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.emojiMart.emojiMartStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.emojiMart.emojiMartInts.`16`
    - typingsJapgolly.emojiMart.emojiMartInts.`20`
    - typingsJapgolly.emojiMart.emojiMartInts.`32`
    - typingsJapgolly.emojiMart.emojiMartInts.`64`
  */
  trait EmojiSheetSize extends StObject
  object EmojiSheetSize {
    
    inline def `16`: typingsJapgolly.emojiMart.emojiMartInts.`16` = 16.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`16`]
    
    inline def `20`: typingsJapgolly.emojiMart.emojiMartInts.`20` = 20.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`20`]
    
    inline def `32`: typingsJapgolly.emojiMart.emojiMartInts.`32` = 32.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`32`]
    
    inline def `64`: typingsJapgolly.emojiMart.emojiMartInts.`64` = 64.asInstanceOf[typingsJapgolly.emojiMart.emojiMartInts.`64`]
  }
  
  trait I18n extends StObject {
    
    var categories: RecordCategoryNamestring
    
    var notfound: String
    
    var search: String
    
    var skintext: String
  }
  object I18n {
    
    inline def apply(categories: RecordCategoryNamestring, notfound: String, search: String, skintext: String): I18n = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skintext = skintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n]
    }
    
    extension [Self <: I18n](x: Self) {
      
      inline def setCategories(value: RecordCategoryNamestring): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSkintext(value: String): Self = StObject.set(x, "skintext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n, 'search' | 'notfound'> & {  categories :std.Partial<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n['categories']>}> */
  trait PartialI18n extends StObject {
    
    var categories: js.UndefOr[PartialRecordCategoryName] = js.undefined
    
    var notfound: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
  }
  object PartialI18n {
    
    inline def apply(): PartialI18n = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialI18n]
    }
    
    extension [Self <: PartialI18n](x: Self) {
      
      inline def setCategories(value: PartialRecordCategoryName): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      inline def setNotfoundUndefined: Self = StObject.set(x, "notfound", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  trait PickerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    /** NOTE: custom emoji are copied into a singleton object on every new mount */
    var custom: js.UndefOr[js.Array[CustomEmoji]] = js.undefined
    
    var defaultSkin: js.UndefOr[EmojiSkin] = js.undefined
    
    var emoji: js.UndefOr[String] = js.undefined
    
    var emojiSize: js.UndefOr[Double] = js.undefined
    
    var emojiTooltip: js.UndefOr[Boolean] = js.undefined
    
    var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.undefined
    
    var enableFrequentEmojiSort: js.UndefOr[Boolean] = js.undefined
    
    var exclude: js.UndefOr[js.Array[CategoryName]] = js.undefined
    
    var i18n: js.UndefOr[PartialI18n] = js.undefined
    
    var icons: js.UndefOr[CustomIcons] = js.undefined
    
    var include: js.UndefOr[js.Array[CategoryName]] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var notFound: js.UndefOr[js.Function0[Component[js.Object, js.Object]]] = js.undefined
    
    var notFoundEmoji: js.UndefOr[String] = js.undefined
    
    /** NOTE: default is not preventable */
    var onClick: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
      ] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.undefined
    
    var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.undefined
    
    var perLine: js.UndefOr[Double] = js.undefined
    
    var recent: js.UndefOr[js.Array[String]] = js.undefined
    
    var set: js.UndefOr[EmojiSet] = js.undefined
    
    var sheetSize: js.UndefOr[EmojiSheetSize] = js.undefined
    
    var showPreview: js.UndefOr[Boolean] = js.undefined
    
    var showSkinTones: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[EmojiSkin] = js.undefined
    
    var skinEmoji: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var theme: js.UndefOr[auto | light | dark] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var useButton: js.UndefOr[Boolean] = js.undefined
  }
  object PickerProps {
    
    inline def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    extension [Self <: PickerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = StObject.set(x, "backgroundImageFn", js.Any.fromFunction2(value))
      
      inline def setBackgroundImageFnUndefined: Self = StObject.set(x, "backgroundImageFn", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setCustom(value: js.Array[CustomEmoji]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setCustomVarargs(value: CustomEmoji*): Self = StObject.set(x, "custom", js.Array(value*))
      
      inline def setDefaultSkin(value: EmojiSkin): Self = StObject.set(x, "defaultSkin", value.asInstanceOf[js.Any])
      
      inline def setDefaultSkinUndefined: Self = StObject.set(x, "defaultSkin", js.undefined)
      
      inline def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiSize(value: Double): Self = StObject.set(x, "emojiSize", value.asInstanceOf[js.Any])
      
      inline def setEmojiSizeUndefined: Self = StObject.set(x, "emojiSize", js.undefined)
      
      inline def setEmojiTooltip(value: Boolean): Self = StObject.set(x, "emojiTooltip", value.asInstanceOf[js.Any])
      
      inline def setEmojiTooltipUndefined: Self = StObject.set(x, "emojiTooltip", js.undefined)
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setEmojisToShowFilter(value: /* emoji */ EmojiData => Boolean): Self = StObject.set(x, "emojisToShowFilter", js.Any.fromFunction1(value))
      
      inline def setEmojisToShowFilterUndefined: Self = StObject.set(x, "emojisToShowFilter", js.undefined)
      
      inline def setEnableFrequentEmojiSort(value: Boolean): Self = StObject.set(x, "enableFrequentEmojiSort", value.asInstanceOf[js.Any])
      
      inline def setEnableFrequentEmojiSortUndefined: Self = StObject.set(x, "enableFrequentEmojiSort", js.undefined)
      
      inline def setExclude(value: js.Array[CategoryName]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: CategoryName*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setI18n(value: PartialI18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setIcons(value: CustomIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      inline def setInclude(value: js.Array[CategoryName]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: CategoryName*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setNotFound(value: CallbackTo[Component[js.Object, js.Object]]): Self = StObject.set(x, "notFound", value.toJsFn)
      
      inline def setNotFoundEmoji(value: String): Self = StObject.set(x, "notFoundEmoji", value.asInstanceOf[js.Any])
      
      inline def setNotFoundEmojiUndefined: Self = StObject.set(x, "notFoundEmoji", js.undefined)
      
      inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
      
      inline def setOnClick(value: (/* emoji */ EmojiData, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* emoji */ EmojiData, t1: /* e */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnSelect(value: /* emoji */ EmojiData => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* emoji */ EmojiData) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnSkinChange(value: /* skin */ EmojiSkin => Callback): Self = StObject.set(x, "onSkinChange", js.Any.fromFunction1((t0: /* skin */ EmojiSkin) => value(t0).runNow()))
      
      inline def setOnSkinChangeUndefined: Self = StObject.set(x, "onSkinChange", js.undefined)
      
      inline def setPerLine(value: Double): Self = StObject.set(x, "perLine", value.asInstanceOf[js.Any])
      
      inline def setPerLineUndefined: Self = StObject.set(x, "perLine", js.undefined)
      
      inline def setRecent(value: js.Array[String]): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      inline def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
      
      inline def setRecentVarargs(value: String*): Self = StObject.set(x, "recent", js.Array(value*))
      
      inline def setSet(value: EmojiSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setSheetSize(value: EmojiSheetSize): Self = StObject.set(x, "sheetSize", value.asInstanceOf[js.Any])
      
      inline def setSheetSizeUndefined: Self = StObject.set(x, "sheetSize", js.undefined)
      
      inline def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      inline def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      inline def setShowSkinTones(value: Boolean): Self = StObject.set(x, "showSkinTones", value.asInstanceOf[js.Any])
      
      inline def setShowSkinTonesUndefined: Self = StObject.set(x, "showSkinTones", js.undefined)
      
      inline def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinEmoji(value: String): Self = StObject.set(x, "skinEmoji", value.asInstanceOf[js.Any])
      
      inline def setSkinEmojiUndefined: Self = StObject.set(x, "skinEmoji", js.undefined)
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: auto | light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUseButton(value: Boolean): Self = StObject.set(x, "useButton", value.asInstanceOf[js.Any])
      
      inline def setUseButtonUndefined: Self = StObject.set(x, "useButton", js.undefined)
    }
  }
}
