package typingsJapgolly.rxjs.internalCompatibilityMod

import typingsJapgolly.rxjs.internalObservableMod.Observable
import typingsJapgolly.rxjs.typesMod.Observer
import typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "WebSocketSubject")
@js.native
class WebSocketSubject[T] protected ()
  extends typingsJapgolly.rxjs.webSocketSubjectMod.WebSocketSubject[T] {
  def this(urlConfigOrSource: String) = this()
  def this(urlConfigOrSource: Observable[T]) = this()
  def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
  def this(urlConfigOrSource: String, destination: Observer[T]) = this()
  def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
  def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
}

