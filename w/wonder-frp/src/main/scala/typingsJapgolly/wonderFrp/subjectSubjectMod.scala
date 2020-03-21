package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.coreObserverMod.Observer
import typingsJapgolly.wonderFrp.coreStreamMod.Stream
import typingsJapgolly.wonderFrp.disposableIdisposableMod.IDisposable
import typingsJapgolly.wonderFrp.observerIobserverMod.IObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/subject/Subject", JSImport.Namespace)
@js.native
object subjectSubjectMod extends js.Object {
  @js.native
  class Subject () extends IObserver {
    var _observer: js.Any = js.native
    var _source: js.Any = js.native
    var source: Stream = js.native
    /* CompleteClass */
    override def completed(): js.Any = js.native
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /* CompleteClass */
    override def error(error: js.Any): js.Any = js.native
    /* CompleteClass */
    override def next(value: js.Any): js.Any = js.native
    def remove(observer: Observer): Unit = js.native
    def start(): Unit = js.native
    def subscribe(): IDisposable = js.native
    def subscribe(arg1: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function): IDisposable = js.native
    def subscribe(arg1: Observer, onError: js.Function, onCompleted: js.Function): IDisposable = js.native
  }
  
  /* static members */
  @js.native
  object Subject extends js.Object {
    def create(): Subject = js.native
  }
  
}

