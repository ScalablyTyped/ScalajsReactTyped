package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalTypesMod.CompleteNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.NextNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableNotification
import typingsJapgolly.rxjs.distTypesInternalTypesMod.PartialObserver
import typingsJapgolly.rxjs.rxjsStrings.C
import typingsJapgolly.rxjs.rxjsStrings.E
import typingsJapgolly.rxjs.rxjsStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalNotificationMod {
  
  @JSImport("rxjs/internal/Notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/Notification", "Notification")
  @js.native
  open class Notification[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[T] {
    /**
      * Creates a "completion" notification object.
      * @param kind Always `'C'`
      * @deprecated Internal implementation detail. Use {@link Notification#createComplete createComplete} instead.
      */
    def this(kind: C) = this()
    /**
      * Creates a "Next" notification object.
      * @param kind Always `'N'`
      * @param value The value to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createNext createNext} instead.
      */
    def this(kind: N) = this()
    def this(kind: N, value: T) = this()
    /**
      * Creates an "Error" notification object.
      * @param kind Always `'E'`
      * @param value Always `undefined`
      * @param error The error to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createError createError} instead.
      */
    def this(kind: E, value: Unit, error: Any) = this()
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs/internal/Notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Notification", "Notification.completeNotification")
    @js.native
    def completeNotification: Any = js.native
    inline def completeNotification_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createComplete(): typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createError(): typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    inline def createError(err: Any): typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createNext[T](value: T): typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T]]
  }
  
  @JSImport("rxjs/internal/Notification", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.rxjs.distTypesInternalNotificationMod.NotificationKind & String] = js.native
    
    /* "C" */ val COMPLETE: typingsJapgolly.rxjs.distTypesInternalNotificationMod.NotificationKind.COMPLETE & String = js.native
    
    /* "E" */ val ERROR: typingsJapgolly.rxjs.distTypesInternalNotificationMod.NotificationKind.ERROR & String = js.native
    
    /* "N" */ val NEXT: typingsJapgolly.rxjs.distTypesInternalNotificationMod.NotificationKind.NEXT & String = js.native
  }
  
  inline def observeNotification[T](notification: ObservableNotification[T], observer: PartialObserver[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observeNotification")(notification.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
