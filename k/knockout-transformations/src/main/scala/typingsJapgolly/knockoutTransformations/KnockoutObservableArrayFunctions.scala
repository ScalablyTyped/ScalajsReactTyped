package typingsJapgolly.knockoutTransformations

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knockout.KnockoutObservable
import typingsJapgolly.knockout.KnockoutObservableArray
import typingsJapgolly.knockoutTransformations.KnockoutTransformations.Mapping
import typingsJapgolly.knockoutTransformations.KnockoutTransformations.MappingOption
import typingsJapgolly.knockoutTransformations.KnockoutTransformations.MappingWithDisposeCallbackOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  def filter(predicate: js.Function1[/* value */ T, Boolean]): KnockoutObservableArray[T] = js.native
  def indexBy(indexer: js.Function1[/* value */ T, _ | js.Array[String] | String]): KnockoutObservable[StringDictionary[js.Array[T]]] = js.native
  def map[TResult](mapping: Mapping[T, TResult]): KnockoutObservableArray[TResult] = js.native
  def map[TResult](mapping: MappingOption[T, TResult]): KnockoutObservableArray[TResult] = js.native
  def map[TResult](mapping: MappingWithDisposeCallbackOption[T, TResult]): KnockoutObservableArray[TResult] = js.native
  def sortBy(sorter: js.Function2[/* value */ T, /* descending */ js.Function1[/* sorter */ js.Any, _], _]): KnockoutObservableArray[T] = js.native
  def uniqueIndexBy(indexer: js.Function1[/* value */ T, String]): KnockoutObservable[StringDictionary[T]] = js.native
}

