package typingsJapgolly.rxCoreBinding

import typingsJapgolly.rxCore.Rx.IScheduler
import typingsJapgolly.rxCore.Rx.Observer
import typingsJapgolly.rxCoreBinding.Rx.AsyncSubjectStatic
import typingsJapgolly.rxCoreBinding.Rx.BehaviorSubjectStatic
import typingsJapgolly.rxCoreBinding.Rx.ConnectableObservableStatic
import typingsJapgolly.rxCoreBinding.Rx.ISubject
import typingsJapgolly.rxCoreBinding.Rx.ReplaySubjectStatic
import typingsJapgolly.rxCoreBinding.Rx.SubjectStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rx {
    
    @JSGlobal("Rx.AsyncSubject")
    @js.native
    val AsyncSubject: AsyncSubjectStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.AsyncSubject")
    @js.native
    open class AsyncSubjectCls[T] ()
      extends StObject
         with ISubject[T] {
      
      /* CompleteClass */
      override def checked(): Observer[Any] = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
    
    @JSGlobal("Rx.BehaviorSubject")
    @js.native
    val BehaviorSubject: BehaviorSubjectStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.BehaviorSubject")
    @js.native
    open class BehaviorSubjectCls[T] protected ()
      extends StObject
         with typingsJapgolly.rxCoreBinding.Rx.BehaviorSubject[T] {
      def this(initialValue: T) = this()
      
      /* CompleteClass */
      override def checked(): Observer[Any] = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
    
    @JSGlobal("Rx.ConnectableObservable")
    @js.native
    val ConnectableObservable: ConnectableObservableStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.ConnectableObservable")
    @js.native
    open class ConnectableObservableCls[T] ()
      extends StObject
         with typingsJapgolly.rxCoreBinding.Rx.ConnectableObservable[T]
    
    @JSGlobal("Rx.ReplaySubject")
    @js.native
    val ReplaySubject: ReplaySubjectStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.ReplaySubject")
    @js.native
    open class ReplaySubjectCls[T] ()
      extends StObject
         with ISubject[T] {
      def this(bufferSize: Double) = this()
      def this(bufferSize: Double, window: Double) = this()
      def this(bufferSize: Unit, window: Double) = this()
      def this(bufferSize: Double, window: Double, scheduler: IScheduler) = this()
      def this(bufferSize: Double, window: Unit, scheduler: IScheduler) = this()
      def this(bufferSize: Unit, window: Double, scheduler: IScheduler) = this()
      def this(bufferSize: Unit, window: Unit, scheduler: IScheduler) = this()
      
      /* CompleteClass */
      override def checked(): Observer[Any] = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
    
    @JSGlobal("Rx.Subject")
    @js.native
    val Subject: SubjectStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.Subject")
    @js.native
    open class SubjectCls[T] ()
      extends StObject
         with ISubject[T] {
      
      /* CompleteClass */
      override def checked(): Observer[Any] = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
  }
}
