package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSubscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsOperatorSubscriberMod {
  
  @JSImport("rxjs/internal/operators/OperatorSubscriber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/operators/OperatorSubscriber", "OperatorSubscriber")
  @js.native
  open class OperatorSubscriber[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalOperatorsOperatorSubscriberMod.OperatorSubscriber[T] {
    /**
      * Creates an instance of an `OperatorSubscriber`.
      * @param destination The downstream subscriber.
      * @param onNext Handles next values, only called if this subscriber is not stopped or closed. Any
      * error that occurs in this function is caught and sent to the `error` method of this subscriber.
      * @param onError Handles errors from the subscription, any errors that occur in this handler are caught
      * and send to the `destination` error handler.
      * @param onComplete Handles completion notification from the subscription. Any errors that occur in
      * this handler are sent to the `destination` error handler.
      * @param onFinalize Additional finalization logic here. This will only be called on finalization if the
      * subscriber itself is not already closed. This is called after all other finalization logic is executed.
      * @param shouldUnsubscribe An optional check to see if an unsubscribe call should truly unsubscribe.
      * NOTE: This currently **ONLY** exists to support the strange behavior of {@link groupBy}, where unsubscription
      * to the resulting observable does not actually disconnect from the source if there are active subscriptions
      * to any grouped observable. (DO NOT EXPOSE OR USE EXTERNALLY!!!)
      */
    def this(destination: Subscriber[Any]) = this()
    def this(destination: Subscriber[Any], onNext: js.Function1[/* value */ T, Unit]) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit]
    ) = this()
    def this(destination: Subscriber[Any], onNext: Unit, onComplete: js.Function0[Unit]) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: Unit,
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: Unit,
      onFinalize: js.Function0[Unit]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: Unit,
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: js.Function1[/* value */ T, Unit],
      onComplete: Unit,
      onError: Unit,
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: js.Function0[Unit],
      onError: Unit,
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: js.Function1[/* err */ Any, Unit],
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: Unit,
      onFinalize: js.Function0[Unit],
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
    def this(
      destination: Subscriber[Any],
      onNext: Unit,
      onComplete: Unit,
      onError: Unit,
      onFinalize: Unit,
      shouldUnsubscribe: js.Function0[Boolean]
    ) = this()
  }
  
  inline def createOperatorSubscriber[T](destination: Subscriber[Any]): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any]).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](destination: Subscriber[Any], onNext: js.Function1[/* value */ T, Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: js.Function0[Unit],
    onError: js.Function1[/* err */ Any, Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: js.Function0[Unit],
    onError: js.Function1[/* err */ Any, Unit],
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: js.Function0[Unit],
    onError: Unit,
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: Unit,
    onError: js.Function1[/* err */ Any, Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: Unit,
    onError: js.Function1[/* err */ Any, Unit],
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: js.Function1[/* value */ T, Unit],
    onComplete: Unit,
    onError: Unit,
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](destination: Subscriber[Any], onNext: Unit, onComplete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: js.Function0[Unit],
    onError: js.Function1[/* err */ Any, Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: js.Function0[Unit],
    onError: js.Function1[/* err */ Any, Unit],
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: js.Function0[Unit],
    onError: Unit,
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: Unit,
    onError: js.Function1[/* err */ Any, Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: Unit,
    onError: js.Function1[/* err */ Any, Unit],
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  inline def createOperatorSubscriber[T](
    destination: Subscriber[Any],
    onNext: Unit,
    onComplete: Unit,
    onError: Unit,
    onFinalize: js.Function0[Unit]
  ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOperatorSubscriber")(destination.asInstanceOf[js.Any], onNext.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], onFinalize.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
}
