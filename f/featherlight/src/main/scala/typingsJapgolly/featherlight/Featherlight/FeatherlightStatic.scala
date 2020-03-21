package typingsJapgolly.featherlight.Featherlight

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.featherlight.JQuery
import typingsJapgolly.jquery.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatherlightStatic
  extends Instantiable0[typingsJapgolly.featherlight.Featherlight.Featherlight]
     with Instantiable1[
      (/* config */ Config) | (/* $content */ JQuery) | (/* $content */ String), 
      typingsJapgolly.featherlight.Featherlight.Featherlight
    ]
     with Instantiable2[
      (/* $content */ JQuery) | (/* $content */ String), 
      /* config */ Config, 
      typingsJapgolly.featherlight.Featherlight.Featherlight
    ] {
  var autoBind: Boolean | String = js.native
  var contentFilters: ContentFilters = js.native
  var defaults: Config = js.native
  var functionAttributes: js.Array[String] = js.native
  var id: Double = js.native
  def apply(): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def apply($content: String): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def apply($content: String, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def apply($content: JQuery): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def apply($content: JQuery, config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def apply(config: Config): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def attach($source: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: String): JQuery = js.native
  def attach($source: JQuery, $content: String, config: Config): JQuery = js.native
  def attach($source: JQuery, $content: JQuery): JQuery = js.native
  def attach($source: JQuery, $content: JQuery, config: Config): JQuery = js.native
  def attach($source: JQuery, config: Config): JQuery = js.native
  def close(): JQueryPromise[JQuery] = js.native
  def current(): typingsJapgolly.featherlight.Featherlight.Featherlight = js.native
  def extend(child: js.Any, defaults: js.Any): js.Any = js.native
  def opened(): js.Array[typingsJapgolly.featherlight.Featherlight.Featherlight] = js.native
  def readElementConfig(element: HTMLElement, namespace: String): js.Any = js.native
}

