package typingsJapgolly.pulumiCloud

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topicMod {
  
  trait Topic[T]
    extends StObject
       with Stream[T] {
    
    /**
      * Publish an item to this Topic.
      *
      * @param item The item to publish.
      */
    def publish(item: T): js.Promise[Unit]
  }
  object Topic {
    
    @JSImport("@pulumi/cloud/topic", "Topic")
    @js.native
    val ^ : TopicConstructor = js.native
    
    extension [Self <: Topic[?], T](x: Self & Topic[T]) {
      
      inline def setPublish(value: T => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud/topic", "Topic")
  @js.native
  open class TopicCls[T] protected ()
    extends StObject
       with Topic[T] {
    /**
      * Allocate a new Topic with a given name.
      *
      * @param name The unique name of the Topic.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
    
    /**
      * Publish an item to this Topic.
      *
      * @param item The item to publish.
      */
    /* CompleteClass */
    override def publish(item: T): js.Promise[Unit] = js.native
    
    /**
      * Subscribe to items published to this stream.
      *
      * Each subscription receives all items published to the stream. If a
      * subscription handler returns a failed promise, the subscription handler
      * may be retried some number of times.  If no retry is successful, the item
      * will be sent to the global error handler.  Note that as a result,
      * subscription handlers must ensure they can safely be retried.
      *
      * @param name The name of the subscription.
      * @param handler A callback to handle each item published to the stream.
      */
    /* CompleteClass */
    override def subscribe(name: String, handler: js.Function1[T, js.Promise[Unit]]): Unit = js.native
  }
  
  trait Stream[T] extends StObject {
    
    /**
      * Subscribe to items published to this stream.
      *
      * Each subscription receives all items published to the stream. If a
      * subscription handler returns a failed promise, the subscription handler
      * may be retried some number of times.  If no retry is successful, the item
      * will be sent to the global error handler.  Note that as a result,
      * subscription handlers must ensure they can safely be retried.
      *
      * @param name The name of the subscription.
      * @param handler A callback to handle each item published to the stream.
      */
    def subscribe(name: String, handler: js.Function1[/* item */ T, js.Promise[Unit]]): Unit
  }
  object Stream {
    
    inline def apply[T](subscribe: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Callback): Stream[T] = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2((t0: String, t1: js.Function1[/* item */ T, js.Promise[Unit]]) => (subscribe(t0, t1)).runNow()))
      __obj.asInstanceOf[Stream[T]]
    }
    
    extension [Self <: Stream[?], T](x: Self & Stream[T]) {
      
      inline def setSubscribe(value: (String, js.Function1[/* item */ T, js.Promise[Unit]]) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: String, t1: js.Function1[/* item */ T, js.Promise[Unit]]) => (value(t0, t1)).runNow()))
    }
  }
  
  @js.native
  trait TopicConstructor
    extends StObject
       with /**
    * Allocate a new Topic with a given name.
    *
    * @param name The unique name of the Topic.
    * @param opts A bag of options that controls how this resource behaves.
    */
  Instantiable1[/* name */ String, Topic[js.Object]]
       with Instantiable2[/* name */ String, /* opts */ ResourceOptions, Topic[js.Object]]
}
