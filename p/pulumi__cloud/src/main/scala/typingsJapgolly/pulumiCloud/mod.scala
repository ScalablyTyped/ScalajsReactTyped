package typingsJapgolly.pulumiCloud

import typingsJapgolly.pulumiCloud.apiMod.API
import typingsJapgolly.pulumiCloud.apiMod.APIConstructor
import typingsJapgolly.pulumiCloud.bucketMod.Bucket
import typingsJapgolly.pulumiCloud.bucketMod.BucketConstructor
import typingsJapgolly.pulumiCloud.httpServerMod.HttpServer
import typingsJapgolly.pulumiCloud.httpServerMod.HttpServerConstructor
import typingsJapgolly.pulumiCloud.httpServerMod.RequestListenerFactory
import typingsJapgolly.pulumiCloud.serviceMod.Container
import typingsJapgolly.pulumiCloud.serviceMod.HostPathVolume
import typingsJapgolly.pulumiCloud.serviceMod.HostPathVolumeConstructor
import typingsJapgolly.pulumiCloud.serviceMod.Service
import typingsJapgolly.pulumiCloud.serviceMod.ServiceArguments
import typingsJapgolly.pulumiCloud.serviceMod.ServiceConstructor
import typingsJapgolly.pulumiCloud.serviceMod.SharedVolume
import typingsJapgolly.pulumiCloud.serviceMod.SharedVolumeConstructor
import typingsJapgolly.pulumiCloud.serviceMod.Task
import typingsJapgolly.pulumiCloud.serviceMod.TaskConstructor
import typingsJapgolly.pulumiCloud.tableMod.PrimaryKeyType
import typingsJapgolly.pulumiCloud.tableMod.Table
import typingsJapgolly.pulumiCloud.tableMod.TableConstructor
import typingsJapgolly.pulumiCloud.timerMod.Action
import typingsJapgolly.pulumiCloud.timerMod.DailySchedule
import typingsJapgolly.pulumiCloud.timerMod.HourlySchedule
import typingsJapgolly.pulumiCloud.timerMod.IntervalRate
import typingsJapgolly.pulumiCloud.topicMod.Topic
import typingsJapgolly.pulumiCloud.topicMod.TopicConstructor
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pulumi/cloud", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/cloud", "API")
  @js.native
  def API: APIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "API")
  @js.native
  open class APICls protected ()
    extends StObject
       with API {
    def this(apiName: String) = this()
  }
  
  inline def API_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Bucket")
  @js.native
  def Bucket: BucketConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Bucket")
  @js.native
  open class BucketCls protected ()
    extends StObject
       with Bucket {
    /**
      * Creates a new Bucket.
      *
      * @param name A unique name for the bucket.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
  }
  
  inline def Bucket_=(x: BucketConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bucket")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HostPathVolume")
  @js.native
  def HostPathVolume: HostPathVolumeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HostPathVolume")
  @js.native
  open class HostPathVolumeCls protected ()
    extends StObject
       with HostPathVolume {
    /**
      * Construct a new Volume with the given unique name.
      */
    def this(path: String) = this()
    
    /* CompleteClass */
    var kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.HostPathVolume = js.native
    
    /* CompleteClass */
    var path: String = js.native
  }
  
  inline def HostPathVolume_=(x: HostPathVolumeConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HostPathVolume")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HttpEndpoint")
  @js.native
  def HttpEndpoint: APIConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HttpEndpoint")
  @js.native
  open class HttpEndpointCls protected ()
    extends StObject
       with API {
    def this(apiName: String) = this()
  }
  
  inline def HttpEndpoint_=(x: APIConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpEndpoint")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "HttpServer")
  @js.native
  def HttpServer: HttpServerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "HttpServer")
  @js.native
  open class HttpServerCls protected ()
    extends StObject
       with HttpServer {
    /**
      * @param createRequestListener Function that, when called, will produce the [[requestListener]]
      * function that will be called for each http request to the server.  The function will be
      * called once when the module is loaded.  As such, it is a suitable place for expensive
      * computation (like setting up a set of routes).  The function returned can then utilize the
      * results of that computation.
      */
    def this(name: String, createRequestListener: RequestListenerFactory) = this()
    def this(name: String, createRequestListener: RequestListenerFactory, opts: ResourceOptions) = this()
    
    /* CompleteClass */
    override val url: Output_[String] = js.native
  }
  
  inline def HttpServer_=(x: HttpServerConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpServer")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Service")
  @js.native
  def Service: ServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Service")
  @js.native
  open class ServiceCls protected ()
    extends StObject
       with Service {
    /**
      * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
      *
      * @param name The unique name of the service.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String, args: ServiceArguments) = this()
    def this(name: String, args: ServiceArguments, opts: ResourceOptions) = this()
  }
  
  inline def Service_=(x: ServiceConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Service")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "SharedVolume")
  @js.native
  def SharedVolume: SharedVolumeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "SharedVolume")
  @js.native
  open class SharedVolumeCls protected ()
    extends StObject
       with SharedVolume {
    /**
      * Construct a new Volume with the given unique name.
      *
      * @param name The unique name of the volume.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, opts: ResourceOptions) = this()
    
    /* CompleteClass */
    var kind: typingsJapgolly.pulumiCloud.pulumiCloudStrings.SharedVolume = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def SharedVolume_=(x: SharedVolumeConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SharedVolume")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Table")
  @js.native
  def Table: TableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Table")
  @js.native
  open class TableCls protected ()
    extends StObject
       with Table {
    /**
      * Creates a new Table.
      *
      * @param name A unique name for the table.
      * @param primaryKey An optional primary key name.
      * @param primaryKeyType An optional primary key type.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String) = this()
    def this(name: String, primaryKey: Input[String]) = this()
    def this(name: String, primaryKey: Unit, primaryKeyType: Input[PrimaryKeyType]) = this()
    def this(name: String, primaryKey: Input[String], primaryKeyType: Input[PrimaryKeyType]) = this()
    def this(name: String, primaryKey: Unit, primaryKeyType: Unit, opts: ResourceOptions) = this()
    def this(name: String, primaryKey: Unit, primaryKeyType: Input[PrimaryKeyType], opts: ResourceOptions) = this()
    def this(name: String, primaryKey: Input[String], primaryKeyType: Unit, opts: ResourceOptions) = this()
    def this(
      name: String,
      primaryKey: Input[String],
      primaryKeyType: Input[PrimaryKeyType],
      opts: ResourceOptions
    ) = this()
  }
  
  inline def Table_=(x: TableConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Table")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Task")
  @js.native
  def Task: TaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Task")
  @js.native
  open class TaskCls protected ()
    extends StObject
       with Task {
    /**
      * Construct a new Task, which is a Container that can be run many times as individual tasks.
      *
      * @param name The unique name of the task.
      * @param container The container specification.
      * @param opts A bag of options that controls how this resource behaves.
      */
    def this(name: String, container: Container) = this()
    def this(name: String, container: Container, opts: ResourceOptions) = this()
  }
  
  inline def Task_=(x: TaskConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Task")(x.asInstanceOf[js.Any])
  
  @JSImport("@pulumi/cloud", "Topic")
  @js.native
  def Topic: TopicConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@pulumi/cloud", "Topic")
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
  
  inline def Topic_=(x: TopicConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Topic")(x.asInstanceOf[js.Any])
  
  object timer {
    
    @JSImport("@pulumi/cloud", "timer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cron(name: String, cronTab: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cron")(name.asInstanceOf[js.Any], cronTab.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cron")(name.asInstanceOf[js.Any], cronTab.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def daily(name: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def daily(name: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def daily(name: String, schedule: DailySchedule, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("daily")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def hourly(name: String, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hourly")(name.asInstanceOf[js.Any], schedule.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def interval(name: String, options: IntervalRate, handler: Action): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
