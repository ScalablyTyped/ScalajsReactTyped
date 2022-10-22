package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventList
import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventListArgs
import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.Event
import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.EventArgs
import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatch
import typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatchArgs
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object events {
  
  object v1beta1 {
    
    object Event {
      
      @JSImport("@pulumi/kubernetes", "events.v1beta1.Event")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing Event resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.Event = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.Event]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.Event = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventMod.Event]
      
      /**
        * Returns true if the given object is an instance of Event.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/event.Event */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/event.Event */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "events.v1beta1.Event")
    @js.native
    open class EventCls protected () extends Event {
      /**
        * Create a Event resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EventArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
    }
    
    object EventList {
      
      @JSImport("@pulumi/kubernetes", "events.v1beta1.EventList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing EventList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventList]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventListMod.EventList]
      
      /**
        * Returns true if the given object is an instance of EventList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventList.EventList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventList.EventList */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "events.v1beta1.EventList")
    @js.native
    open class EventListCls protected () extends EventList {
      /**
        * Create a EventList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EventListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EventListArgs, opts: CustomResourceOptions) = this()
    }
    
    object EventPatch {
      
      @JSImport("@pulumi/kubernetes", "events.v1beta1.EventPatch")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing EventPatch resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      inline def get(name: String, id: Input[ID]): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatch]
      inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pulumiKubernetes.eventsV1beta1EventPatchMod.EventPatch]
      
      /**
        * Returns true if the given object is an instance of EventPatch.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      inline def isInstance(obj: Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventPatch.EventPatch */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1beta1/eventPatch.EventPatch */ Boolean]
    }
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@pulumi/kubernetes", "events.v1beta1.EventPatch")
    @js.native
    open class EventPatchCls protected () extends EventPatch {
      /**
        * Create a EventPatch resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: EventPatchArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: EventPatchArgs, opts: CustomResourceOptions) = this()
    }
  }
}
