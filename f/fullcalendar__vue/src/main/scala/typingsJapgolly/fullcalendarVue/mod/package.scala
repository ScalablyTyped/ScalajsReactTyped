package typingsJapgolly.fullcalendarVue.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.UIEvent
import typingsJapgolly.fullcalendarCommon.anon.Allow
import typingsJapgolly.fullcalendarCommon.anon.Arialabel
import typingsJapgolly.fullcalendarCommon.anon.ArialabelString
import typingsJapgolly.fullcalendarCommon.anon.Bg
import typingsJapgolly.fullcalendarCommon.anon.Bottom
import typingsJapgolly.fullcalendarCommon.anon.CalendarContextviewApiVie
import typingsJapgolly.fullcalendarCommon.anon.Datanavlink
import typingsJapgolly.fullcalendarCommon.anon.Days
import typingsJapgolly.fullcalendarCommon.anon.DefId
import typingsJapgolly.fullcalendarCommon.anon.ExtraRefined
import typingsJapgolly.fullcalendarCommon.anon.Href
import typingsJapgolly.fullcalendarCommon.anon.HrefUndefined
import typingsJapgolly.fullcalendarCommon.anon.IsFuture
import typingsJapgolly.fullcalendarCommon.anon.IsTimeUnspecified
import typingsJapgolly.fullcalendarCommon.anon.Liquid
import typingsJapgolly.fullcalendarCommon.anon.OnClick
import typingsJapgolly.fullcalendarCommon.anon.OnKeyDown
import typingsJapgolly.fullcalendarCommon.anon.Refined
import typingsJapgolly.fullcalendarCommon.anon.ViewPropsdateProfileDateP
import typingsJapgolly.fullcalendarCommon.mod.BaseOptionsRefined
import typingsJapgolly.fullcalendarCommon.mod.BgEventProps
import typingsJapgolly.fullcalendarCommon.mod.BusinessHoursInput
import typingsJapgolly.fullcalendarCommon.mod.CalendarContext
import typingsJapgolly.fullcalendarCommon.mod.ChunkConfig
import typingsJapgolly.fullcalendarCommon.mod.ChunkContentCallbackArgs
import typingsJapgolly.fullcalendarCommon.mod.ClassNamesGenerator
import typingsJapgolly.fullcalendarCommon.mod.ClassNamesInput
import typingsJapgolly.fullcalendarCommon.mod.ColProps
import typingsJapgolly.fullcalendarCommon.mod.ContentHookProps
import typingsJapgolly.fullcalendarCommon.mod.DateFormatter
import typingsJapgolly.fullcalendarCommon.mod.DateInput
import typingsJapgolly.fullcalendarCommon.mod.DateMarker
import typingsJapgolly.fullcalendarCommon.mod.DateMeta
import typingsJapgolly.fullcalendarCommon.mod.DateProfile
import typingsJapgolly.fullcalendarCommon.mod.DateRange
import typingsJapgolly.fullcalendarCommon.mod.DateSpan
import typingsJapgolly.fullcalendarCommon.mod.Dictionary
import typingsJapgolly.fullcalendarCommon.mod.DragMeta
import typingsJapgolly.fullcalendarCommon.mod.DragMetaInput
import typingsJapgolly.fullcalendarCommon.mod.Duration
import typingsJapgolly.fullcalendarCommon.mod.DurationInput
import typingsJapgolly.fullcalendarCommon.mod.EdgeInfo
import typingsJapgolly.fullcalendarCommon.mod.EqualityFuncs
import typingsJapgolly.fullcalendarCommon.mod.EventContentArg
import typingsJapgolly.fullcalendarCommon.mod.EventDef
import typingsJapgolly.fullcalendarCommon.mod.EventInput
import typingsJapgolly.fullcalendarCommon.mod.EventInstance
import typingsJapgolly.fullcalendarCommon.mod.EventInteractionState
import typingsJapgolly.fullcalendarCommon.mod.EventMutation
import typingsJapgolly.fullcalendarCommon.mod.EventRefined
import typingsJapgolly.fullcalendarCommon.mod.EventRenderRange
import typingsJapgolly.fullcalendarCommon.mod.EventStore
import typingsJapgolly.fullcalendarCommon.mod.EventTuple
import typingsJapgolly.fullcalendarCommon.mod.EventUi
import typingsJapgolly.fullcalendarCommon.mod.EventUiHash
import typingsJapgolly.fullcalendarCommon.mod.EventUiRefined
import typingsJapgolly.fullcalendarCommon.mod.FieldSpecInput
import typingsJapgolly.fullcalendarCommon.mod.FormatDateOptions
import typingsJapgolly.fullcalendarCommon.mod.FormatRangeOptions
import typingsJapgolly.fullcalendarCommon.mod.FormatterInput
import typingsJapgolly.fullcalendarCommon.mod.GenericRefiners
import typingsJapgolly.fullcalendarCommon.mod.InteractionSettings
import typingsJapgolly.fullcalendarCommon.mod.InteractionSettingsStore_
import typingsJapgolly.fullcalendarCommon.mod.LocaleInput
import typingsJapgolly.fullcalendarCommon.mod.MemoiseArrayFunc
import typingsJapgolly.fullcalendarCommon.mod.MemoizeHashFunc
import typingsJapgolly.fullcalendarCommon.mod.NowIndicatorRootProps
import typingsJapgolly.fullcalendarCommon.mod.OpenDateRange
import typingsJapgolly.fullcalendarCommon.mod.OrderSpec
import typingsJapgolly.fullcalendarCommon.mod.PluginDef
import typingsJapgolly.fullcalendarCommon.mod.PluginDefInput
import typingsJapgolly.fullcalendarCommon.mod.Point
import typingsJapgolly.fullcalendarCommon.mod.PointerDragEvent
import typingsJapgolly.fullcalendarCommon.mod.RawOptionsFromRefiners
import typingsJapgolly.fullcalendarCommon.mod.Rect
import typingsJapgolly.fullcalendarCommon.mod.ScrollbarWidths
import typingsJapgolly.fullcalendarCommon.mod.SectionConfig
import typingsJapgolly.fullcalendarCommon.mod.Seg
import typingsJapgolly.fullcalendarCommon.mod.SegEntry
import typingsJapgolly.fullcalendarCommon.mod.SegEntryGroup
import typingsJapgolly.fullcalendarCommon.mod.SegSpan
import typingsJapgolly.fullcalendarCommon.mod.SplittableProps
import typingsJapgolly.fullcalendarCommon.mod.ViewContext
import typingsJapgolly.fullcalendarCommon.mod.WeekNumberRootProps
import typingsJapgolly.fullcalendarVue.fullcalendarVueBooleans.`false`
import typingsJapgolly.fullcalendarVue.mod.^
import typingsJapgolly.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vue.ExtendedVue<Vue, {  renderId :number}, {  getApi :typeof getApi,   buildOptions :typeof buildOptions}, unknown, {  options :CalendarOptions}> */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_vue.ExtendedVue<Vue, {  renderId :number}, {  getApi :typeof getApi,   buildOptions :typeof buildOptions}, unknown, {  options :CalendarOptions}> */ Any]

inline def BgEvent(props: BgEventProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("BgEvent")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ContentHook[HookProps](props: ContentHookProps[HookProps]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ContentHook")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def CustomContentRenderContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context<number> */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("CustomContentRenderContext").asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context<number> */ Any]

inline def NowIndicatorRoot(props: NowIndicatorRootProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("NowIndicatorRoot")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def ViewContextType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context<any> */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("ViewContextType").asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Context<any> */ Any]

inline def WeekNumberRoot(props: WeekNumberRootProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("WeekNumberRoot")(props.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def addDays(m: DateMarker, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addDays")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def addDurations(d0: Duration, d1: Duration): Days = (^.asInstanceOf[js.Dynamic].applyDynamic("addDurations")(d0.asInstanceOf[js.Any], d1.asInstanceOf[js.Any])).asInstanceOf[Days]

inline def addMs(m: DateMarker, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addMs")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def addWeeks(m: DateMarker, n: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("addWeeks")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Date]

inline def allowContextMenu(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowContextMenu")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def allowSelection(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSelection")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def applyMutationToEventStore(
  eventStore: EventStore,
  eventConfigBase: EventUiHash,
  mutation: EventMutation,
  context: CalendarContext
): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMutationToEventStore")(eventStore.asInstanceOf[js.Any], eventConfigBase.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def applyStyle(el: HTMLElement, props: Dictionary): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(el.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def applyStyleProp(el: HTMLElement, name: String, `val`: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyleProp")(el.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def asCleanDays(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asCleanDays")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def asRoughMinutes(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asRoughMinutes")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def asRoughMs(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asRoughMs")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def asRoughSeconds(dur: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asRoughSeconds")(dur.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def binarySearch[Item](a: js.Array[Item], searchVal: Double, getItemVal: js.Function1[/* item */ Item, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(a.asInstanceOf[js.Any], searchVal.asInstanceOf[js.Any], getItemVal.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]

inline def buildClassNameNormalizer[HookProps](): js.Function2[
/* generator */ ClassNamesGenerator[HookProps], 
/* hookProps */ HookProps, 
js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClassNameNormalizer")().asInstanceOf[js.Function2[
/* generator */ ClassNamesGenerator[HookProps], 
/* hookProps */ HookProps, 
js.Array[String]]]

inline def buildEntryKey(entry: SegEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEntryKey")(entry.asInstanceOf[js.Any]).asInstanceOf[String]

inline def buildEventApis(eventStore: EventStore, context: CalendarContext): js.Array[typingsJapgolly.fullcalendarCommon.mod.EventApi] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEventApis")(eventStore.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.fullcalendarCommon.mod.EventApi]]
inline def buildEventApis(eventStore: EventStore, context: CalendarContext, excludeInstance: EventInstance): js.Array[typingsJapgolly.fullcalendarCommon.mod.EventApi] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildEventApis")(eventStore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], excludeInstance.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.fullcalendarCommon.mod.EventApi]]

inline def buildEventRangeKey(eventRange: EventRenderRange): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildEventRangeKey")(eventRange.asInstanceOf[js.Any]).asInstanceOf[String]

inline def buildHashFromArray[Item, ItemRes](
  a: js.Array[Item],
  func: js.Function2[/* item */ Item, /* index */ Double, js.Tuple2[String, ItemRes]]
): StringDictionary[ItemRes] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildHashFromArray")(a.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[ItemRes]]

inline def buildIsoString(marker: DateMarker): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildIsoString")(marker.asInstanceOf[js.Any]).asInstanceOf[String]
inline def buildIsoString(marker: DateMarker, timeZoneOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildIsoString")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildIsoString(marker: DateMarker, timeZoneOffset: Double, stripZeroTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildIsoString")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any], stripZeroTime.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildIsoString(marker: DateMarker, timeZoneOffset: Unit, stripZeroTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildIsoString")(marker.asInstanceOf[js.Any], timeZoneOffset.asInstanceOf[js.Any], stripZeroTime.asInstanceOf[js.Any])).asInstanceOf[String]

inline def buildNavLinkAttrs(context: ViewContext, dateMarker: DateMarker): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNavLinkAttrs")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def buildNavLinkAttrs(context: ViewContext, dateMarker: DateMarker, viewType: String): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNavLinkAttrs")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def buildNavLinkAttrs(context: ViewContext, dateMarker: DateMarker, viewType: String, isTabbable: Boolean): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNavLinkAttrs")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any], isTabbable.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]
inline def buildNavLinkAttrs(context: ViewContext, dateMarker: DateMarker, viewType: Unit, isTabbable: Boolean): Arialabel | Datanavlink | ArialabelString = (^.asInstanceOf[js.Dynamic].applyDynamic("buildNavLinkAttrs")(context.asInstanceOf[js.Any], dateMarker.asInstanceOf[js.Any], viewType.asInstanceOf[js.Any], isTabbable.asInstanceOf[js.Any])).asInstanceOf[Arialabel | Datanavlink | ArialabelString]

inline def buildSegCompareObj(seg: Seg): DefId = ^.asInstanceOf[js.Dynamic].applyDynamic("buildSegCompareObj")(seg.asInstanceOf[js.Any]).asInstanceOf[DefId]

inline def buildSegTimeText(seg: Seg, timeFormat: DateFormatter, context: ViewContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(seg: Seg, timeFormat: DateFormatter, context: ViewContext, defaultDisplayEventTime: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Boolean
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Boolean,
  startOverride: Unit,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Boolean,
  startOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Boolean,
  startOverride: DateMarker,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Unit,
  startOverride: Unit,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Unit,
  startOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Boolean,
  defaultDisplayEventEnd: Unit,
  startOverride: DateMarker,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Boolean
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Boolean,
  startOverride: Unit,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Boolean,
  startOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Boolean,
  startOverride: DateMarker,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Unit,
  startOverride: Unit,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Unit,
  startOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any])).asInstanceOf[String]
inline def buildSegTimeText(
  seg: Seg,
  timeFormat: DateFormatter,
  context: ViewContext,
  defaultDisplayEventTime: Unit,
  defaultDisplayEventEnd: Unit,
  startOverride: DateMarker,
  endOverride: DateMarker
): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildSegTimeText")(seg.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any], context.asInstanceOf[js.Any], defaultDisplayEventTime.asInstanceOf[js.Any], defaultDisplayEventEnd.asInstanceOf[js.Any], startOverride.asInstanceOf[js.Any], endOverride.asInstanceOf[js.Any])).asInstanceOf[String]

inline def collectFromHash[Item](hash: StringDictionary[Item]): js.Array[Item] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any]).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Double, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Double, endIndex: Unit, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Double, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
inline def collectFromHash[Item](hash: StringDictionary[Item], startIndex: Unit, endIndex: Unit, step: Double): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectFromHash")(hash.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]

inline def combineEventUis(uis: js.Array[EventUi]): EventUi = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEventUis")(uis.asInstanceOf[js.Any]).asInstanceOf[EventUi]

inline def compareByFieldSpec[Subject](obj0: Subject, obj1: Subject, fieldSpec: OrderSpec[Subject]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByFieldSpec")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any], fieldSpec.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def compareByFieldSpecs[Subject](obj0: Subject, obj1: Subject, fieldSpecs: js.Array[OrderSpec[Subject]]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareByFieldSpecs")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any], fieldSpecs.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def compareNumbers(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNumbers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def compareObjs(oldProps: Any, newProps: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareObjs")(oldProps.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def compareObjs(oldProps: Any, newProps: Any, equalityFuncs: EqualityFuncs[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareObjs")(oldProps.asInstanceOf[js.Any], newProps.asInstanceOf[js.Any], equalityFuncs.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def computeEarliestSegStart(segs: js.Array[Seg]): DateMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("computeEarliestSegStart")(segs.asInstanceOf[js.Any]).asInstanceOf[DateMarker]

inline def computeEdges(el: HTMLElement): EdgeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("computeEdges")(el.asInstanceOf[js.Any]).asInstanceOf[EdgeInfo]
inline def computeEdges(el: HTMLElement, getPadding: Boolean): EdgeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("computeEdges")(el.asInstanceOf[js.Any], getPadding.asInstanceOf[js.Any])).asInstanceOf[EdgeInfo]

inline def computeFallbackHeaderFormat(datesRepDistinctDays: Boolean, dayCnt: Double): DateFormatter = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFallbackHeaderFormat")(datesRepDistinctDays.asInstanceOf[js.Any], dayCnt.asInstanceOf[js.Any])).asInstanceOf[DateFormatter]

inline def computeHeightAndMargins(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeHeightAndMargins")(el.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def computeInnerRect(el: Any): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerRect")(el.asInstanceOf[js.Any]).asInstanceOf[Bottom]
inline def computeInnerRect(el: Any, goWithinPadding: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerRect")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any])).asInstanceOf[Bottom]
inline def computeInnerRect(el: Any, goWithinPadding: Boolean, doFromWindowViewport: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerRect")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any], doFromWindowViewport.asInstanceOf[js.Any])).asInstanceOf[Bottom]
inline def computeInnerRect(el: Any, goWithinPadding: Unit, doFromWindowViewport: Boolean): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("computeInnerRect")(el.asInstanceOf[js.Any], goWithinPadding.asInstanceOf[js.Any], doFromWindowViewport.asInstanceOf[js.Any])).asInstanceOf[Bottom]

inline def computeRect(el: Any): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRect")(el.asInstanceOf[js.Any]).asInstanceOf[Rect]

inline def computeSegDraggable(seg: Seg, context: ViewContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSegDraggable")(seg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def computeSegEndResizable(seg: Seg, context: ViewContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSegEndResizable")(seg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def computeSegStartResizable(seg: Seg, context: ViewContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSegStartResizable")(seg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def computeShrinkWidth(chunkEls: js.Array[HTMLElement]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeShrinkWidth")(chunkEls.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def computeSmallestCellWidth(cellEl: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSmallestCellWidth")(cellEl.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def computeVisibleDayRange(timedRange: OpenDateRange): OpenDateRange = ^.asInstanceOf[js.Dynamic].applyDynamic("computeVisibleDayRange")(timedRange.asInstanceOf[js.Any]).asInstanceOf[OpenDateRange]
inline def computeVisibleDayRange(timedRange: OpenDateRange, nextDayThreshold: Duration): OpenDateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("computeVisibleDayRange")(timedRange.asInstanceOf[js.Any], nextDayThreshold.asInstanceOf[js.Any])).asInstanceOf[OpenDateRange]

inline def config: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[Any]

inline def constrainPoint(point: Point, rect: Rect): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainPoint")(point.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Point]

inline def createAriaClickAttrs(handler: js.Function1[/* ev */ UIEvent, Unit]): OnClick = ^.asInstanceOf[js.Dynamic].applyDynamic("createAriaClickAttrs")(handler.asInstanceOf[js.Any]).asInstanceOf[OnClick]

inline def createDuration(input: DurationInput): Duration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createDuration")(input.asInstanceOf[js.Any]).asInstanceOf[Duration | Null]
inline def createDuration(input: DurationInput, unit: String): Duration | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createDuration")(input.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Duration | Null]

inline def createEmptyEventStore(): EventStore = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyEventStore")().asInstanceOf[EventStore]

inline def createEventInstance(defId: String, range: DateRange): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventInstance")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def createEventInstance(defId: String, range: DateRange, forcedStartTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventInstance")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def createEventInstance(defId: String, range: DateRange, forcedStartTzo: Double, forcedEndTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventInstance")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any], forcedEndTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]
inline def createEventInstance(defId: String, range: DateRange, forcedStartTzo: Unit, forcedEndTzo: Double): EventInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventInstance")(defId.asInstanceOf[js.Any], range.asInstanceOf[js.Any], forcedStartTzo.asInstanceOf[js.Any], forcedEndTzo.asInstanceOf[js.Any])).asInstanceOf[EventInstance]

inline def createEventUi(refined: EventUiRefined, context: CalendarContext): EventUi = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventUi")(refined.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventUi]

inline def createFormatter(input: FormatterInput): DateFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createFormatter")(input.asInstanceOf[js.Any]).asInstanceOf[DateFormatter]

inline def createPlugin(input: PluginDefInput): PluginDef = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlugin")(input.asInstanceOf[js.Any]).asInstanceOf[PluginDef]

inline def diffDates(date0: DateMarker, date1: DateMarker, dateEnv: typingsJapgolly.fullcalendarCommon.mod.DateEnv): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("diffDates")(date0.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any])).asInstanceOf[Duration]
inline def diffDates(
  date0: DateMarker,
  date1: DateMarker,
  dateEnv: typingsJapgolly.fullcalendarCommon.mod.DateEnv,
  largeUnit: String
): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("diffDates")(date0.asInstanceOf[js.Any], date1.asInstanceOf[js.Any], dateEnv.asInstanceOf[js.Any], largeUnit.asInstanceOf[js.Any])).asInstanceOf[Duration]

inline def diffDayAndTime(m0: DateMarker, m1: DateMarker): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("diffDayAndTime")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Duration]

inline def diffDays(m0: Any, m1: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diffDays")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def diffPoints(point1: Point, point2: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("diffPoints")(point1.asInstanceOf[js.Any], point2.asInstanceOf[js.Any])).asInstanceOf[Point]

inline def diffWeeks(m0: Any, m1: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWeeks")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def diffWholeDays(m0: DateMarker, m1: DateMarker): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWholeDays")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def diffWholeWeeks(m0: DateMarker, m1: DateMarker): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWholeWeeks")(m0.asInstanceOf[js.Any], m1.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def disableCursor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCursor")().asInstanceOf[Unit]

inline def elementClosest(el: HTMLElement, selector: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("elementClosest")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]

inline def elementMatches(el: HTMLElement, selector: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("elementMatches")(el.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]

inline def enableCursor(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableCursor")().asInstanceOf[Unit]

inline def eventTupleToStore(tuple: EventTuple): EventStore = ^.asInstanceOf[js.Dynamic].applyDynamic("eventTupleToStore")(tuple.asInstanceOf[js.Any]).asInstanceOf[EventStore]
inline def eventTupleToStore(tuple: EventTuple, eventStore: EventStore): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("eventTupleToStore")(tuple.asInstanceOf[js.Any], eventStore.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def filterEventStoreDefs(eventStore: EventStore, filterFunc: js.Function1[/* eventDef */ EventDef, Boolean]): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("filterEventStoreDefs")(eventStore.asInstanceOf[js.Any], filterFunc.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def filterHash(hash: Any, func: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("filterHash")(hash.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Object]

inline def findDirectChildren(parent: js.Array[HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectChildren")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
inline def findDirectChildren(parent: js.Array[HTMLElement], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectChildren")(parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def findDirectChildren(parent: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("findDirectChildren")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
inline def findDirectChildren(parent: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findDirectChildren")(parent.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]

inline def findElements(container: js.Array[HTMLElement], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def findElements(container: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
inline def findElements(container: NodeList[HTMLElement & Node], selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(container.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]

inline def flexibleCompare(a: Any, b: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("flexibleCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def formatDate(dateInput: DateInput): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any]).asInstanceOf[String]
inline def formatDate(dateInput: DateInput, options: FormatDateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(dateInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def formatDayString(marker: DateMarker): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatDayString")(marker.asInstanceOf[js.Any]).asInstanceOf[String]

inline def formatIsoTimeString(marker: DateMarker): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatIsoTimeString")(marker.asInstanceOf[js.Any]).asInstanceOf[String]

inline def formatRange(startInput: DateInput, endInput: DateInput, options: FormatRangeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatRange")(startInput.asInstanceOf[js.Any], endInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def getAllowYScrolling(props: Liquid, sectionConfig: SectionConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllowYScrolling")(props.asInstanceOf[js.Any], sectionConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def getCanVGrowWithinCell(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getCanVGrowWithinCell")().asInstanceOf[Boolean]

inline def getClippingParents(el: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClippingParents")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]

inline def getDateMeta(date: DateMarker): DateMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any]).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: Unit, nowDate: Unit, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: Unit, nowDate: DateMarker): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: Unit, nowDate: DateMarker, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: DateRange): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: DateRange, nowDate: Unit, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: DateRange, nowDate: DateMarker): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[DateMeta]
inline def getDateMeta(date: DateMarker, todayRange: DateRange, nowDate: DateMarker, dateProfile: DateProfile): DateMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateMeta")(date.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any])).asInstanceOf[DateMeta]

inline def getDayClassNames(meta: DateMeta, theme: typingsJapgolly.fullcalendarCommon.mod.Theme): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDayClassNames")(meta.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getDefaultEventEnd(allDay: Boolean, marker: DateMarker, context: CalendarContext): DateMarker = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultEventEnd")(allDay.asInstanceOf[js.Any], marker.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DateMarker]

inline def getElRoot(el: HTMLElement): ShadowRoot | Document = ^.asInstanceOf[js.Dynamic].applyDynamic("getElRoot")(el.asInstanceOf[js.Any]).asInstanceOf[ShadowRoot | Document]

inline def getElSeg(el: HTMLElement): Seg | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElSeg")(el.asInstanceOf[js.Any]).asInstanceOf[Seg | Null]

inline def getEntrySpanEnd(entry: SegEntry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntrySpanEnd")(entry.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getEventClassNames(props: EventContentArg): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def getEventTargetViaRoot(ev: Event): EventTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTargetViaRoot")(ev.asInstanceOf[js.Any]).asInstanceOf[EventTarget]

inline def getIsRtlScrollbarOnLeft(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getIsRtlScrollbarOnLeft")().asInstanceOf[Boolean]

inline def getRectCenter(rect: Rect): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("getRectCenter")(rect.asInstanceOf[js.Any]).asInstanceOf[Point]

inline def getRelevantEvents(eventStore: EventStore, instanceId: String): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelevantEvents")(eventStore.asInstanceOf[js.Any], instanceId.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def getScrollGridClassNames(liquid: Boolean, context: ViewContext): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScrollGridClassNames")(liquid.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]

inline def getScrollbarWidths(): ScrollbarWidths = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidths")().asInstanceOf[ScrollbarWidths]

inline def getSectionClassNames(sectionConfig: SectionConfig, wholeTableVGrow: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectionClassNames")(sectionConfig.asInstanceOf[js.Any], wholeTableVGrow.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getSectionHasLiquidHeight(props: Liquid, sectionConfig: SectionConfig): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getSectionHasLiquidHeight")(props.asInstanceOf[js.Any], sectionConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def getSegAnchorAttrs(seg: Seg, context: ViewContext): OnKeyDown | Href | HrefUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("getSegAnchorAttrs")(seg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[OnKeyDown | Href | HrefUndefined]

inline def getSegMeta(seg: Seg, todayRange: DateRange): IsFuture = (^.asInstanceOf[js.Dynamic].applyDynamic("getSegMeta")(seg.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any])).asInstanceOf[IsFuture]
inline def getSegMeta(seg: Seg, todayRange: DateRange, nowDate: DateMarker): IsFuture = (^.asInstanceOf[js.Dynamic].applyDynamic("getSegMeta")(seg.asInstanceOf[js.Any], todayRange.asInstanceOf[js.Any], nowDate.asInstanceOf[js.Any])).asInstanceOf[IsFuture]

inline def getSlotClassNames(meta: DateMeta, theme: typingsJapgolly.fullcalendarCommon.mod.Theme): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlotClassNames")(meta.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getStickyFooterScrollbar(options: BaseOptionsRefined): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStickyFooterScrollbar")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def getStickyHeaderDates(options: BaseOptionsRefined): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getStickyHeaderDates")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def getUnequalProps(obj0: Any, obj1: Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnequalProps")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def getUniqueDomId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueDomId")().asInstanceOf[String]

inline def globalLocales: js.Array[LocaleInput] = ^.asInstanceOf[js.Dynamic].selectDynamic("globalLocales").asInstanceOf[js.Array[LocaleInput]]

inline def globalPlugins: js.Array[PluginDef] = ^.asInstanceOf[js.Dynamic].selectDynamic("globalPlugins").asInstanceOf[js.Array[PluginDef]]

inline def greatestDurationDenominator(dur: Duration): typingsJapgolly.fullcalendarCommon.anon.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("greatestDurationDenominator")(dur.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.Unit]

inline def groupIntersectingEntries(entries: js.Array[SegEntry]): js.Array[SegEntryGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupIntersectingEntries")(entries.asInstanceOf[js.Any]).asInstanceOf[js.Array[SegEntryGroup]]

inline def guid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[String]

inline def hasBgRendering(`def`: EventDef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBgRendering")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def hasShrinkWidth(cols: js.Array[ColProps]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasShrinkWidth")(cols.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def identity[T](raw: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(raw.asInstanceOf[js.Any]).asInstanceOf[T]

inline def install(
  Vue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor */ Any
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(Vue.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def interactionSettingsStore: InteractionSettingsStore_ = ^.asInstanceOf[js.Dynamic].selectDynamic("interactionSettingsStore").asInstanceOf[InteractionSettingsStore_]

inline def interactionSettingsToStore(settings: InteractionSettings): StringDictionary[InteractionSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("interactionSettingsToStore")(settings.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[InteractionSettings]]

inline def intersectRanges(range0: OpenDateRange, range1: OpenDateRange): OpenDateRange = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectRanges")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[OpenDateRange]

inline def intersectRects(rect1: Rect, rect2: Rect): Rect | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectRects")(rect1.asInstanceOf[js.Any], rect2.asInstanceOf[js.Any])).asInstanceOf[Rect | `false`]

inline def intersectSpans(span0: SegSpan, span1: SegSpan): SegSpan | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectSpans")(span0.asInstanceOf[js.Any], span1.asInstanceOf[js.Any])).asInstanceOf[SegSpan | Null]

inline def isArraysEqual(a0: Any, a1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isArraysEqual(a0: Any, a1: Any, equalityFunc: js.Function2[/* v0 */ Any, /* v1 */ Any, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isArraysEqual")(a0.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], equalityFunc.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isColPropsEqual(cols0: js.Array[ColProps], cols1: js.Array[ColProps]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isColPropsEqual")(cols0.asInstanceOf[js.Any], cols1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isDateSelectionValid(dateSelection: DateSpan, dateProfile: DateProfile, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDateSelectionValid")(dateSelection.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isDateSpansEqual(span0: DateSpan, span1: DateSpan): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDateSpansEqual")(span0.asInstanceOf[js.Any], span1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isInt(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isInteractionValid(interaction: EventInteractionState, dateProfile: DateProfile, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInteractionValid")(interaction.asInstanceOf[js.Any], dateProfile.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isMultiDayRange(range: DateRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiDayRange")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPropsEqual(obj0: Any, obj1: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropsEqual")(obj0.asInstanceOf[js.Any], obj1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isPropsValid(state: SplittableProps, context: CalendarContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropsValid")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isPropsValid(state: SplittableProps, context: CalendarContext, dateSpanMeta: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropsValid")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isPropsValid(state: SplittableProps, context: CalendarContext, dateSpanMeta: js.Object, filterConfig: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropsValid")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any], filterConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isPropsValid(state: SplittableProps, context: CalendarContext, dateSpanMeta: Unit, filterConfig: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPropsValid")(state.asInstanceOf[js.Any], context.asInstanceOf[js.Any], dateSpanMeta.asInstanceOf[js.Any], filterConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isValidDate(m: DateMarker): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidDate")(m.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def joinSpans(span0: SegSpan, span1: SegSpan): SegSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("joinSpans")(span0.asInstanceOf[js.Any], span1.asInstanceOf[js.Any])).asInstanceOf[SegSpan]

inline def listenBySelector(
  container: HTMLElement,
  eventType: String,
  selector: String,
  handler: js.Function2[/* ev */ Event, /* matchedTarget */ HTMLElement, Unit]
): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("listenBySelector")(container.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]

inline def mapHash[InputItem, OutputItem](
  hash: StringDictionary[InputItem],
  func: js.Function2[/* input */ InputItem, /* key */ String, OutputItem]
): StringDictionary[OutputItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapHash")(hash.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[OutputItem]]

inline def memoize[Args /* <: js.Array[Any] */, Res](workerFunc: js.Function1[/* args */ Args, Res]): js.Function1[/* args */ Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def memoize[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def memoize[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]
inline def memoize[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* args */ Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Res]]

inline def memoizeArraylike[Args /* <: js.Array[Any] */, Res](workerFunc: js.Function1[/* args */ Args, Res]): MemoiseArrayFunc[Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeArraylike")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def memoizeArraylike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeArraylike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def memoizeArraylike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeArraylike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]
inline def memoizeArraylike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoiseArrayFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeArraylike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoiseArrayFunc[Args, Res]]

inline def memoizeHashlike[Args /* <: js.Array[Any] */, Res](workerFunc: js.Function1[/* args */ Args, Res]): MemoizeHashFunc[Args, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeHashlike")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def memoizeHashlike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeHashlike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def memoizeHashlike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeHashlike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]
inline def memoizeHashlike[Args /* <: js.Array[Any] */, Res](
  workerFunc: js.Function1[/* args */ Args, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): MemoizeHashFunc[Args, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeHashlike")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[MemoizeHashFunc[Args, Res]]

inline def memoizeObjArg[Arg /* <: Dictionary */, Res](workerFunc: js.Function1[/* arg */ Arg, Res]): js.Function1[/* arg */ Arg, Res] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizeObjArg")(workerFunc.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def memoizeObjArg[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeObjArg")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def memoizeObjArg[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: js.Function2[/* res0 */ Res, /* res1 */ Res, Boolean],
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeObjArg")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]
inline def memoizeObjArg[Arg /* <: Dictionary */, Res](
  workerFunc: js.Function1[/* arg */ Arg, Res],
  resEquality: Unit,
  teardownFunc: js.Function1[/* res */ Res, Unit]
): js.Function1[/* arg */ Arg, Res] = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizeObjArg")(workerFunc.asInstanceOf[js.Any], resEquality.asInstanceOf[js.Any], teardownFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* arg */ Arg, Res]]

inline def mergeEventStores(store0: EventStore, store1: EventStore): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeEventStores")(store0.asInstanceOf[js.Any], store1.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def multiplyDuration(d: Duration, n: Double): Days = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyDuration")(d.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Days]

inline def padStart(`val`: Any, len: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(`val`.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]

inline def parseBusinessHours(input: BusinessHoursInput, context: CalendarContext): EventStore = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBusinessHours")(input.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventStore]

inline def parseClassNames(raw: ClassNamesInput): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassNames")(raw.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def parseDragMeta(raw: DragMetaInput): DragMeta = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDragMeta")(raw.asInstanceOf[js.Any]).asInstanceOf[DragMeta]

inline def parseEventDef(
  refined: EventRefined,
  extra: Dictionary,
  sourceId: String,
  allDay: Boolean,
  hasEnd: Boolean,
  context: CalendarContext
): EventDef = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEventDef")(refined.asInstanceOf[js.Any], extra.asInstanceOf[js.Any], sourceId.asInstanceOf[js.Any], allDay.asInstanceOf[js.Any], hasEnd.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventDef]

inline def parseFieldSpecs[Subject](input: FieldSpecInput[Subject]): js.Array[OrderSpec[Subject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFieldSpecs")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[OrderSpec[Subject]]]

inline def parseMarker(str: Any): IsTimeUnspecified = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMarker")(str.asInstanceOf[js.Any]).asInstanceOf[IsTimeUnspecified]

inline def pointInsideRect(point: Point, rect: Rect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("pointInsideRect")(point.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def preventContextMenu(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventContextMenu")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def preventDefault(ev: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(ev.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def preventSelection(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("preventSelection")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def rangeContainsMarker(range: OpenDateRange, date: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeContainsMarker")(range.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def rangeContainsMarker(range: OpenDateRange, date: DateMarker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeContainsMarker")(range.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def rangeContainsRange(outerRange: OpenDateRange, innerRange: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangeContainsRange")(outerRange.asInstanceOf[js.Any], innerRange.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def rangesEqual(range0: OpenDateRange, range1: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangesEqual")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def rangesIntersect(range0: OpenDateRange, range1: OpenDateRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangesIntersect")(range0.asInstanceOf[js.Any], range1.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def refineEventDef(raw: EventInput, context: CalendarContext): Refined = (^.asInstanceOf[js.Dynamic].applyDynamic("refineEventDef")(raw.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Refined]
inline def refineEventDef(raw: EventInput, context: CalendarContext, refiners: Allow): Refined = (^.asInstanceOf[js.Dynamic].applyDynamic("refineEventDef")(raw.asInstanceOf[js.Any], context.asInstanceOf[js.Any], refiners.asInstanceOf[js.Any])).asInstanceOf[Refined]

inline def refineProps[Refiners /* <: GenericRefiners */, Raw /* <: RawOptionsFromRefiners[Refiners] */](input: Raw, refiners: Refiners): ExtraRefined[Refiners] = (^.asInstanceOf[js.Dynamic].applyDynamic("refineProps")(input.asInstanceOf[js.Any], refiners.asInstanceOf[js.Any])).asInstanceOf[ExtraRefined[Refiners]]

inline def removeElement(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeElement")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeExact(array: Any, exactVal: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExact")(array.asInstanceOf[js.Any], exactVal.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def renderChunkContent(
  sectionConfig: SectionConfig,
  chunkConfig: ChunkConfig,
  arg: ChunkContentCallbackArgs,
  isHeader: Boolean
): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderChunkContent")(sectionConfig.asInstanceOf[js.Any], chunkConfig.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], isHeader.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def renderFill(fillType: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFill")(fillType.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def renderMicroColGroup(cols: js.Array[ColProps]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderMicroColGroup")(cols.asInstanceOf[js.Any]).asInstanceOf[Any]
inline def renderMicroColGroup(cols: js.Array[ColProps], shrinkWidth: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderMicroColGroup")(cols.asInstanceOf[js.Any], shrinkWidth.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def renderScrollShim(arg: ChunkContentCallbackArgs): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderScrollShim")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def requestJson(method: String, url: String, params: Dictionary, successCallback: Any, failureCallback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestJson")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], failureCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def sanitizeShrinkWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeShrinkWidth")().asInstanceOf[Double]
inline def sanitizeShrinkWidth(shrinkWidth: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeShrinkWidth")(shrinkWidth.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def setElSeg(el: HTMLElement, seg: Seg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setElSeg")(el.asInstanceOf[js.Any], seg.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setRef[RefType](
  ref: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ref<RefType> */ Any,
  current: RefType
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRef[RefType](ref: Unit, current: RefType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRef")(ref.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def sliceEventStore(eventStore: EventStore, eventUiBases: EventUiHash, framingRange: DateRange): Bg = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceEventStore")(eventStore.asInstanceOf[js.Any], eventUiBases.asInstanceOf[js.Any], framingRange.asInstanceOf[js.Any])).asInstanceOf[Bg]
inline def sliceEventStore(
  eventStore: EventStore,
  eventUiBases: EventUiHash,
  framingRange: DateRange,
  nextDayThreshold: Duration
): Bg = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceEventStore")(eventStore.asInstanceOf[js.Any], eventUiBases.asInstanceOf[js.Any], framingRange.asInstanceOf[js.Any], nextDayThreshold.asInstanceOf[js.Any])).asInstanceOf[Bg]

inline def sliceEvents(props: ViewPropsdateProfileDateP): js.Array[EventRenderRange] = ^.asInstanceOf[js.Dynamic].applyDynamic("sliceEvents")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[EventRenderRange]]
inline def sliceEvents(props: ViewPropsdateProfileDateP, allDay: Boolean): js.Array[EventRenderRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("sliceEvents")(props.asInstanceOf[js.Any], allDay.asInstanceOf[js.Any])).asInstanceOf[js.Array[EventRenderRange]]

inline def sortEventSegs(segs: Any, eventOrderSpecs: js.Array[OrderSpec[typingsJapgolly.fullcalendarCommon.mod.EventApi]]): js.Array[Seg] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortEventSegs")(segs.asInstanceOf[js.Any], eventOrderSpecs.asInstanceOf[js.Any])).asInstanceOf[js.Array[Seg]]

inline def startOfDay(m: DateMarker): DateMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("startOfDay")(m.asInstanceOf[js.Any]).asInstanceOf[DateMarker]

inline def translateRect(rect: Rect, deltaX: Double, deltaY: Double): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("translateRect")(rect.asInstanceOf[js.Any], deltaX.asInstanceOf[js.Any], deltaY.asInstanceOf[js.Any])).asInstanceOf[Rect]

inline def triggerDateSelect(selection: DateSpan, pev: Null, context: CalendarContextviewApiVie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerDateSelect")(selection.asInstanceOf[js.Any], pev.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def triggerDateSelect(selection: DateSpan, pev: PointerDragEvent, context: CalendarContextviewApiVie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerDateSelect")(selection.asInstanceOf[js.Any], pev.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unpromisify(func: Any, success: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisify")(func.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def unpromisify(func: Any, success: Any, failure: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unpromisify")(func.asInstanceOf[js.Any], success.asInstanceOf[js.Any], failure.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

inline def whenTransitionDone(el: HTMLElement, callback: js.Function1[/* ev */ Event, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whenTransitionDone")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def wholeDivideDurations(numerator: Duration, denominator: Duration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("wholeDivideDurations")(numerator.asInstanceOf[js.Any], denominator.asInstanceOf[js.Any])).asInstanceOf[Double]
