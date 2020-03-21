package typingsJapgolly.rxWamp.mod

import typingsJapgolly.autobahn.mod.Connection
import typingsJapgolly.autobahn.mod.ICallOptions
import typingsJapgolly.autobahn.mod.IConnectionOptions
import typingsJapgolly.autobahn.mod.IPublication
import typingsJapgolly.autobahn.mod.IPublishOptions
import typingsJapgolly.autobahn.mod.IRegisterOptions
import typingsJapgolly.autobahn.mod.IRegistration
import typingsJapgolly.autobahn.mod.ISubscribeOptions
import typingsJapgolly.autobahn.mod.ISubscription
import typingsJapgolly.autobahn.mod.RegisterEndpoint
import typingsJapgolly.autobahn.mod.Session
import typingsJapgolly.rxLite.Rx.IObserver
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableWampStatic extends js.Object {
  def callAsObservable[TResult](session: Session, procedure: String): js.Function2[
    /* args */ js.UndefOr[js.Array[_]], 
    /* kwargs */ js.UndefOr[js.Any], 
    Observable[TResult]
  ] = js.native
  def callAsObservable[TResult](session: Session, procedure: String, options: ICallOptions): js.Function2[
    /* args */ js.UndefOr[js.Array[_]], 
    /* kwargs */ js.UndefOr[js.Any], 
    Observable[TResult]
  ] = js.native
  def fromConnection(options: IConnectionOptions): Observable[Session] = js.native
  def fromConnection(options: IConnectionOptions, keepReconnecting: Boolean): Observable[Session] = js.native
  def fromConnection(
    options: IConnectionOptions,
    keepReconnecting: Boolean,
    factory: js.Function1[/* options */ js.UndefOr[IConnectionOptions], Connection]
  ): Observable[Session] = js.native
  def fromPubSubPattern(session: Session, topic: String, options: ISubscribeOptions): IPubSubSubject = js.native
  def fromPubSubPattern(
    session: Session,
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): IPubSubSubject = js.native
  def publishAsObservable(session: Session, topic: String): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_]): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): Observable[IPublication] = js.native
  def registerAsObservable(
    sessionOrObservable: Session,
    procedure: String,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions
  ): Observable[IRegistration] = js.native
  def registerAsObservable(
    sessionOrObservable: Observable[Session],
    procedure: String,
    endpoint: RegisterEndpoint,
    options: IRegisterOptions
  ): Observable[IRegistration] = js.native
  def subscribeAsObservable(sessionOrObservable: Session, topic: String): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
  def subscribeAsObservable(
    sessionOrObservable: Session,
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
  def subscribeAsObservable(
    sessionOrObservable: Observable[Session],
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): Observable[IWampEvent] = js.native
  def subscriber(sessionOrObservable: Session): Subscriber = js.native
  def subscriber(sessionOrObservable: Observable[_]): Subscriber = js.native
}

