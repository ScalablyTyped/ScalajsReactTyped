package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdStrings.resourcetimingbufferfull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to performance-related information for the current page. It's part of the High Resolution Time API, but is enhanced by the Performance Timeline API, the Navigation Timing API, the User Timing API, and the Resource Timing API. */
@js.native
trait Performance_ extends EventTarget {
  /** @deprecated */
  val navigation: org.scalajs.dom.raw.PerformanceNavigation = js.native
  var onresourcetimingbufferfull: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  val timeOrigin: Double = js.native
  /** @deprecated */
  val timing: org.scalajs.dom.raw.PerformanceTiming = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def clearMarks(): Unit = js.native
  def clearMarks(markName: java.lang.String): Unit = js.native
  def clearMeasures(): Unit = js.native
  def clearMeasures(measureName: java.lang.String): Unit = js.native
  def clearResourceTimings(): Unit = js.native
  def getEntries(): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): PerformanceEntryList = js.native
  def getEntriesByType(`type`: java.lang.String): PerformanceEntryList = js.native
  def mark(markName: java.lang.String): Unit = js.native
  def measure(measureName: java.lang.String): Unit = js.native
  def measure(measureName: java.lang.String, startMark: java.lang.String): Unit = js.native
  def measure(measureName: java.lang.String, startMark: java.lang.String, endMark: java.lang.String): Unit = js.native
  def now(): Double = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resourcetimingbufferfull(
    `type`: resourcetimingbufferfull,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  def setResourceTimingBufferSize(maxSize: Double): Unit = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("Performance")
@js.native
object Performance_ extends Instantiable0[Performance_]

