package typingsJapgolly.highchartsReactOfficial

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.highcharts.mod.AnimationOptionsObject
import typingsJapgolly.highcharts.mod.AnnotationsOptions
import typingsJapgolly.highcharts.mod.Axis
import typingsJapgolly.highcharts.mod.AxisOptions
import typingsJapgolly.highcharts.mod.CSSObject
import typingsJapgolly.highcharts.mod.ChartCallbackFunction
import typingsJapgolly.highcharts.mod.Chart_
import typingsJapgolly.highcharts.mod.Class
import typingsJapgolly.highcharts.mod.ColorAxisOptions
import typingsJapgolly.highcharts.mod.ColorType
import typingsJapgolly.highcharts.mod.Color_
import typingsJapgolly.highcharts.mod.Dictionary
import typingsJapgolly.highcharts.mod.EventCallbackFunction
import typingsJapgolly.highcharts.mod.EventOptionsObject
import typingsJapgolly.highcharts.mod.HTMLAttributes
import typingsJapgolly.highcharts.mod.HTMLDOMElement
import typingsJapgolly.highcharts.mod.LegendOptions
import typingsJapgolly.highcharts.mod.ObjectEachCallbackFunction
import typingsJapgolly.highcharts.mod.OffsetObject
import typingsJapgolly.highcharts.mod.Options
import typingsJapgolly.highcharts.mod.RelativeSize
import typingsJapgolly.highcharts.mod.SVGAttributes
import typingsJapgolly.highcharts.mod.SVGDOMElement
import typingsJapgolly.highcharts.mod.SVGElement
import typingsJapgolly.highcharts.mod.Series
import typingsJapgolly.highcharts.mod.SeriesOptionsType
import typingsJapgolly.highcharts.mod.TimeFormatCallbackFunction
import typingsJapgolly.highcharts.mod.TimeOptions
import typingsJapgolly.highcharts.mod.Time_
import typingsJapgolly.highcharts.mod.TooltipOptions
import typingsJapgolly.highcharts.mod.WrapProceedFunction
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofHighcharts extends js.Object {
  var Annotation: Instantiable2[
    /* chart */ Chart_, 
    /* userOptions */ AnnotationsOptions, 
    typingsJapgolly.highcharts.mod.Annotation
  ] = js.native
  var Axis: Instantiable2[/* chart */ Chart_, /* options */ AxisOptions, typingsJapgolly.highcharts.mod.Axis] = js.native
  var Chart: Instantiable1[/* options */ Options, Chart_] = js.native
  var Color: Instantiable1[/* input */ ColorType, Color_] = js.native
  var ColorAxis: Instantiable2[
    /* chart */ Chart_, 
    /* userOptions */ ColorAxisOptions, 
    typingsJapgolly.highcharts.mod.ColorAxis
  ] = js.native
  var Legend: Instantiable2[
    /* chart */ Chart_, 
    /* options */ LegendOptions, 
    typingsJapgolly.highcharts.mod.Legend
  ] = js.native
  var PlotLineOrBand: Instantiable1[/* axis */ Axis, typingsJapgolly.highcharts.mod.PlotLineOrBand] = js.native
  var Point: Instantiable0[typingsJapgolly.highcharts.mod.Point] = js.native
  var Pointer: Instantiable2[/* chart */ Chart_, /* options */ Options, typingsJapgolly.highcharts.mod.Pointer] = js.native
  var SVGElement: Instantiable0[typingsJapgolly.highcharts.mod.SVGElement] = js.native
  var SVGRenderer: Instantiable3[
    HTMLElement, 
    /* width */ Double, 
    /* height */ Double, 
    typingsJapgolly.highcharts.mod.SVGRenderer
  ] = js.native
  var Series: Instantiable2[/* chart */ Chart_, /* options */ js.Object, typingsJapgolly.highcharts.mod.Series] = js.native
  var Tick: Instantiable2[/* axis */ Axis, /* pos */ Double, typingsJapgolly.highcharts.mod.Tick] = js.native
  var Time: Instantiable1[/* options */ TimeOptions, Time_] = js.native
  var Tooltip: Instantiable2[
    /* chart */ Chart_, 
    /* options */ TooltipOptions, 
    typingsJapgolly.highcharts.mod.Tooltip
  ] = js.native
  var charts: js.Array[js.UndefOr[Chart_]] = js.native
  var dateFormats: Dictionary[TimeFormatCallbackFunction] = js.native
  var defaultOptions: Options = js.native
  var time: Time_ = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def addEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def animObject(): AnimationOptionsObject = js.native
  def animObject(animation: Boolean): AnimationOptionsObject = js.native
  def animObject(animation: AnimationOptionsObject): AnimationOptionsObject = js.native
  def animate(el: HTMLDOMElement, params: CSSObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes): Unit = js.native
  def animate(el: HTMLDOMElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject): Unit = js.native
  def animate(el: SVGElement, params: CSSObject, opt: AnimationOptionsObject): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes): Unit = js.native
  def animate(el: SVGElement, params: SVGAttributes, opt: AnimationOptionsObject): Unit = js.native
  def arrayMax(data: js.Array[_]): Double = js.native
  def arrayMin(data: js.Array[_]): Double = js.native
  def attr(elem: HTMLDOMElement): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: HTMLDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: String, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: HTMLAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: String): js.UndefOr[String | Null] = js.native
  def attr(elem: SVGDOMElement, prop: SVGAttributes, value: Double): js.UndefOr[String | Null] = js.native
  def chart(options: Options): Chart_ = js.native
  def chart(options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def chart(renderTo: String, options: Options): Chart_ = js.native
  def chart(renderTo: String, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def chart(renderTo: HTMLDOMElement, options: Options): Chart_ = js.native
  def chart(renderTo: HTMLDOMElement, options: Options, callback: ChartCallbackFunction): Chart_ = js.native
  def clearTimeout(id: Double): Unit = js.native
  def color(input: ColorType): Color_ = js.native
  def correctFloat(num: Double): Double = js.native
  def correctFloat(num: Double, prec: Double): Double = js.native
  def createElement(tag: String): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLElement): HTMLElement = js.native
  def createElement(tag: String, attribs: HTMLAttributes, styles: CSSObject, parent: HTMLElement, nopad: Boolean): HTMLElement = js.native
  def css(el: HTMLDOMElement, styles: CSSObject): Unit = js.native
  def css(el: SVGDOMElement, styles: CSSObject): Unit = js.native
  def dateFormat(format: String, timestamp: Double): String = js.native
  def dateFormat(format: String, timestamp: Double, capitalize: Boolean): String = js.native
  def defined(obj: js.Any): Boolean = js.native
  def destroyObjectProperties(obj: js.Any): Unit = js.native
  def destroyObjectProperties(obj: js.Any, except: js.Any): Unit = js.native
  def discardElement(element: HTMLElement): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function): Unit = js.native
  def each(arr: js.Array[_], fn: js.Function, ctx: js.Any): Unit = js.native
  def erase(arr: js.Array[_], item: js.Any): Unit = js.native
  def error(code: String): Unit = js.native
  def error(code: String, stop: Boolean): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart_): Unit = js.native
  def error(code: String, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
  def error(code: Double): Unit = js.native
  def error(code: Double, stop: Boolean): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart_): Unit = js.native
  def error(code: Double, stop: Boolean, chart: Chart_, params: Dictionary[String]): Unit = js.native
  def extend[T](a: T, b: js.Object): T = js.native
  def extend[T](a: js.UndefOr[scala.Nothing], b: js.Object): T = js.native
  def extendClass[T](parent: Class[T], members: Dictionary[_]): Class[T] = js.native
  def find[T](arr: js.Array[T], callback: js.Function): js.UndefOr[T] = js.native
  def fireEvent[T](el: T, `type`: String): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event_): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: js.Function): Unit = js.native
  def fireEvent[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def format(str: String, ctx: js.Any): String = js.native
  def format(str: String, ctx: js.Any, time: Time_): String = js.native
  def formatSingle(format: String, `val`: js.Any): String = js.native
  def formatSingle(format: String, `val`: js.Any, time: Time_): String = js.native
  def getMagnitude(num: Double): Double = js.native
  def getOptions(): Options = js.native
  def getStyle(el: HTMLElement, prop: String): Double | String = js.native
  def getStyle(el: HTMLElement, prop: String, toInt: Boolean): Double | String = js.native
  def grep(arr: js.Array[_], callback: js.Function): js.Array[_] = js.native
  def inArray(item: js.Any, arr: js.Array[_]): Double = js.native
  def inArray(item: js.Any, arr: js.Array[_], fromIndex: Double): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isClass(): Boolean = js.native
  def isClass(obj: js.Object): Boolean = js.native
  def isDOMElement(obj: js.Any): Boolean = js.native
  def isNumber(n: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any, strict: Boolean): Boolean = js.native
  def isString(s: js.Any): Boolean = js.native
  def keys(obj: js.Any): js.Array[String] = js.native
  def map(arr: js.Array[_], fn: js.Function): js.Array[_] = js.native
  def merge[T](a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, a: T, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](extend: Boolean, n: js.UndefOr[js.Object]*): T = js.native
  def merge[T](n: js.UndefOr[js.Object]*): T = js.native
  def normalizeTickInterval(interval: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_]): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double): Double = js.native
  def normalizeTickInterval(interval: Double, multiples: js.Array[_], magnitude: Double, allowDecimals: Boolean): Double = js.native
  def normalizeTickInterval(
    interval: Double,
    multiples: js.Array[_],
    magnitude: Double,
    allowDecimals: Boolean,
    hasTickAmount: Boolean
  ): Double = js.native
  def numberFormat(number: Double, decimals: Double): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String): String = js.native
  def numberFormat(number: Double, decimals: Double, decimalPoint: String, thousandsSep: String): String = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T]): Unit = js.native
  def objectEach[T](obj: js.Any, fn: ObjectEachCallbackFunction[T], ctx: T): Unit = js.native
  def offset(el: HTMLElement): OffsetObject = js.native
  def pad(number: Double): String = js.native
  def pad(number: Double, length: Double): String = js.native
  def pad(number: Double, length: Double, padder: String): String = js.native
  def pick[T](items: (js.UndefOr[T | Null])*): T = js.native
  def reduce(arr: js.Array[_], fn: js.Function, initialValue: js.Any): js.Any = js.native
  def relativeLength(value: RelativeSize, base: Double): Double = js.native
  def relativeLength(value: RelativeSize, base: Double, offset: Double): Double = js.native
  def removeEvent[T](el: T): Unit = js.native
  def removeEvent[T](el: T, `type`: String): Unit = js.native
  def removeEvent[T](el: T, `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def removeEvent[T](el: Class[T]): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String): Unit = js.native
  def removeEvent[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): Unit = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_]): Series = js.native
  def seriesType(`type`: String, parent: String, options: Dictionary[_], props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: Dictionary[_],
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType): Series = js.native
  def seriesType(`type`: String, parent: String, options: SeriesOptionsType, props: Dictionary[_]): Series = js.native
  def seriesType(
    `type`: String,
    parent: String,
    options: SeriesOptionsType,
    props: Dictionary[_],
    pointProps: Dictionary[_]
  ): Series = js.native
  def setAnimation(animation: js.UndefOr[scala.Nothing], chart: Chart_): Unit = js.native
  def setAnimation(animation: Boolean, chart: Chart_): Unit = js.native
  def setAnimation(animation: AnimationOptionsObject, chart: Chart_): Unit = js.native
  def setOptions(options: Options): Options = js.native
  def some(arr: js.Array[_], fn: js.Function, ctx: js.Any): Boolean = js.native
  def splat(obj: js.Any): js.Array[_] = js.native
  def stableSort(arr: js.Array[_], sortFunction: js.Function): Unit = js.native
  def stop(el: SVGElement): Unit = js.native
  def stop(el: SVGElement, prop: String): Unit = js.native
  def syncTimeout(fn: js.Function, delay: Double): Double = js.native
  def syncTimeout(fn: js.Function, delay: Double, context: js.Any): Double = js.native
  def uniqueKey(): String = js.native
  def wrap(obj: js.Any, method: String, func: WrapProceedFunction): Unit = js.native
}

