package typingsJapgolly.roslib

import typingsJapgolly.roslib.anon.ActionName
import typingsJapgolly.roslib.anon.AngularThres
import typingsJapgolly.roslib.anon.Compression
import typingsJapgolly.roslib.anon.GroovyCompatibility
import typingsJapgolly.roslib.anon.Name
import typingsJapgolly.roslib.anon.Orientation
import typingsJapgolly.roslib.anon.Rotation
import typingsJapgolly.roslib.anon.String
import typingsJapgolly.roslib.anon.StringString
import typingsJapgolly.roslib.anon.W
import typingsJapgolly.roslib.anon.X
import typingsJapgolly.roslib.anon.Xml
import typingsJapgolly.roslib.roslibInts.`0`
import typingsJapgolly.roslib.roslibInts.`1`
import typingsJapgolly.roslib.roslibInts.`2`
import typingsJapgolly.roslib.roslibInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ROSLIB {
    
    @JSGlobal("ROSLIB.ActionClient")
    @js.native
    open class ActionClient protected ()
      extends typingsJapgolly.roslib.mod.ActionClient {
      /**
        * An actionlib action client.
        *
        * Emits the following events:
        *  * 'timeout' - if a timeout occurred while sending a goal
        *  * 'status' - the status messages received from the action server
        *  * 'feedback' -  the feedback messages received from the action server
        *  * 'result' - the result returned from the action server
        *
        *  @constructor
        *  @param options - object with following keys:
        *   * ros - the ROSLIB.Ros connection handle
        *   * serverName - the action server name, like /fibonacci
        *   * actionName - the action message name, like 'actionlib_tutorials/FibonacciAction'
        *   * timeout - the timeout length when connecting to the action server
        *   * omitFeedback - the boolean flag to indicate whether to omit the feedback channel or not
        *   * omitStatus - the boolean flag to indicate whether to omit the status channel or not
        *   * omitResult - the boolean flag to indicate whether to omit the result channel or not
        */
      def this(options: ActionName) = this()
    }
    
    @JSGlobal("ROSLIB.Goal")
    @js.native
    open class Goal protected ()
      extends typingsJapgolly.roslib.mod.Goal {
      /**
        * An actionlib goal goal is associated with an action server.
        *
        * Emits the following events:
        *  * 'timeout' - if a timeout occurred while sending a goal
        *
        *  @constructor
        *  @param options with following keys:
        *   * actionClient - the ROSLIB.ActionClient to use with this goal
        *   * goalMessage - The JSON object containing the goal for the action server
        */
      def this(options: typingsJapgolly.roslib.anon.ActionClient) = this()
    }
    
    @JSGlobal("ROSLIB.Message")
    @js.native
    open class Message protected ()
      extends typingsJapgolly.roslib.mod.Message {
      /**
        * Message objects are used for publishing and subscribing to and from topics.
        *
        * @constructor
        * @param values - object matching the fields defined in the .msg definition file
        */
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.Param")
    @js.native
    open class Param protected ()
      extends typingsJapgolly.roslib.mod.Param {
      /**
        * A ROS parameter.
        *
        * @constructor
        * @param options - possible keys include:
        *   * ros - the ROSLIB.Ros connection handle
        *   * name - the param name, like max_vel_x
        */
      def this(options: Name) = this()
    }
    
    @JSGlobal("ROSLIB.Pose")
    @js.native
    /**
      * A Pose in 3D space. Values are copied into this object.
      *
      *  @constructor
      *  @param options - object with following keys:
      *   * position - the Vector3 describing the position
      *   * orientation - the ROSLIB.Quaternion describing the orientation
      */
    open class Pose ()
      extends typingsJapgolly.roslib.mod.Pose {
      def this(options: Orientation) = this()
    }
    
    @JSGlobal("ROSLIB.Quaternion")
    @js.native
    /**
      * A Quaternion.
      *
      * @constructor
      * @param options - object with following keys:
      *   * x - the x value
      *   * y - the y value
      *   * z - the z value
      *   * w - the w value
      */
    open class Quaternion ()
      extends typingsJapgolly.roslib.mod.Quaternion {
      def this(options: W) = this()
    }
    
    @JSGlobal("ROSLIB.Ros")
    @js.native
    open class Ros protected ()
      extends typingsJapgolly.roslib.mod.Ros {
      /**
        * Manages connection to the server and all interactions with ROS.
        *
        * Emits the following events:
        *  * 'error' - there was an error with ROS
        *  * 'connection' - connected to the WebSocket server
        *  * 'close' - disconnected to the WebSocket server
        *  * <topicName> - a message came from rosbridge with the given topic name
        *  * <serviceID> - a service response came from rosbridge with the given ID
        *
        * @constructor
        * @param options - possible keys include:
        *   * url (optional) - (can be specified later with `connect`) the WebSocket URL for rosbridge or the node server url to connect using socket.io (if socket.io exists in the page) <br>
        *   * groovyCompatibility - don't use interfaces that changed after the last groovy release or rosbridge_suite and related tools (defaults to true)
        *   * transportLibrary (optional) - one of 'websocket', 'workersocket' (default), 'socket.io' or RTCPeerConnection instance controlling how the connection is created in `connect`.
        *   * transportOptions (optional) - the options to use use when creating a connection. Currently only used if `transportLibrary` is RTCPeerConnection.
        */
      def this(options: GroovyCompatibility) = this()
    }
    
    @JSGlobal("ROSLIB.Service")
    @js.native
    open class Service[TServiceRequest, TServiceResponse] protected ()
      extends typingsJapgolly.roslib.mod.Service[TServiceRequest, TServiceResponse] {
      /**
        * A ROS service client.
        *
        * @constructor
        * @params options - possible keys include:
        *   * ros - the ROSLIB.Ros connection handle
        *   * name - the service name, like /add_two_ints
        *   * serviceType - the service type, like 'rospy_tutorials/AddTwoInts'
        */
      def this(data: typingsJapgolly.roslib.anon.Ros) = this()
    }
    
    @JSGlobal("ROSLIB.ServiceRequest")
    @js.native
    /**
      * A ServiceRequest is passed into the service call.
      *
      * @constructor
      * @param values - object matching the fields defined in the .srv definition file
      */
    open class ServiceRequest ()
      extends typingsJapgolly.roslib.mod.ServiceRequest {
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.ServiceResponse")
    @js.native
    /**
      * A ServiceResponse is returned from the service call.
      *
      * @constructor
      * @param values - object matching the fields defined in the .srv definition file
      */
    open class ServiceResponse ()
      extends typingsJapgolly.roslib.mod.ServiceResponse {
      def this(values: Any) = this()
    }
    
    @JSGlobal("ROSLIB.TFClient")
    @js.native
    open class TFClient protected ()
      extends typingsJapgolly.roslib.mod.TFClient {
      /**
        * A TF Client that listens to TFs from tf2_web_republisher.
        *
        * @constructor
        * @param options - object with following keys:
        *   * ros - the ROSLIB.Ros connection handle
        *   * fixedFrame - the fixed frame, like /base_link
        *   * angularThres - the angular threshold for the TF republisher
        *   * transThres - the translation threshold for the TF republisher
        *   * rate - the rate for the TF republisher
        *   * updateDelay - the time (in ms) to wait after a new subscription to update the TF republisher's list of TFs
        *   * topicTimeout - the timeout parameter for the TF republisher
        *   * serverName (optional) - the name of the tf2_web_republisher server
        *   * repubServiceName (optional) - the name of the republish_tfs service (non groovy compatibility mode only) default: '/republish_tfs'
        */
      def this(options: AngularThres) = this()
    }
    
    @JSGlobal("ROSLIB.Topic")
    @js.native
    open class Topic[TMessage] protected ()
      extends typingsJapgolly.roslib.mod.Topic[TMessage] {
      /**
        * Publish and/or subscribe to a topic in ROS.
        *
        * Emits the following events:
        *  * 'warning' - if there are any warning during the Topic creation
        *  * 'message' - the message data from rosbridge
        *
        * @constructor
        * @param options - object with following keys:
        *   * ros - the ROSLIB.Ros connection handle
        *   * name - the topic name, like /cmd_vel
        *   * messageType - the message type, like 'std_msgs/String'
        *   * compression - the type of compression to use, like 'png'
        *   * throttle_rate - the rate (in ms in between messages) at which to throttle the topics
        *   * queue_size - the queue created at bridge side for re-publishing webtopics (defaults to 100)
        *   * latch - latch the topic when publishing
        *   * queue_length - the queue length at bridge side used when subscribing (defaults to 0, no queueing).
        */
      def this(options: Compression) = this()
    }
    
    @JSGlobal("ROSLIB.Transform")
    @js.native
    /**
      * A Transform in 3-space. Values are copied into this object.
      *
      * @constructor
      * @param options - object with following keys:
      *   * translation - the Vector3 describing the translation
      *   * rotation - the ROSLIB.Quaternion describing the rotation
      */
    open class Transform ()
      extends typingsJapgolly.roslib.mod.Transform {
      def this(options: Rotation) = this()
    }
    
    @JSGlobal("ROSLIB.URDF_BOX")
    @js.native
    val URDF_BOX: `1` = js.native
    
    @JSGlobal("ROSLIB.URDF_CYLINDER")
    @js.native
    val URDF_CYLINDER: `2` = js.native
    
    @JSGlobal("ROSLIB.URDF_MESH")
    @js.native
    val URDF_MESH: `3` = js.native
    
    @JSGlobal("ROSLIB.URDF_SPHERE")
    @js.native
    val URDF_SPHERE: `0` = js.native
    
    @JSGlobal("ROSLIB.UrdfBox")
    @js.native
    open class UrdfBox protected ()
      extends typingsJapgolly.roslib.mod.UrdfBox {
      /**
        * A Box element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfColor")
    @js.native
    open class UrdfColor protected ()
      extends typingsJapgolly.roslib.mod.UrdfColor {
      /**
        * A Color element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfCylinder")
    @js.native
    open class UrdfCylinder protected ()
      extends typingsJapgolly.roslib.mod.UrdfCylinder {
      /**
        * A Cylinder element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfJoint")
    @js.native
    open class UrdfJoint protected ()
      extends typingsJapgolly.roslib.mod.UrdfJoint {
      /**
        * A Joint element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfLink")
    @js.native
    open class UrdfLink protected ()
      extends typingsJapgolly.roslib.mod.UrdfLink {
      /**
        * A Link element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfMaterial")
    @js.native
    open class UrdfMaterial protected ()
      extends typingsJapgolly.roslib.mod.UrdfMaterial {
      /**
        * A Material element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfMesh")
    @js.native
    open class UrdfMesh protected ()
      extends typingsJapgolly.roslib.mod.UrdfMesh {
      /**
        * A Box element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfModel")
    @js.native
    open class UrdfModel protected ()
      extends typingsJapgolly.roslib.mod.UrdfModel {
      /**
        * A URDF Model can be used to parse a given URDF into the appropriate elements.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        *  * string - the XML element to parse as a string
        */
      def this(options: String) = this()
      def this(options: StringString) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfSphere")
    @js.native
    open class UrdfSphere protected ()
      extends typingsJapgolly.roslib.mod.UrdfSphere {
      /**
        * A Sphere element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.UrdfVisual")
    @js.native
    open class UrdfVisual protected ()
      extends typingsJapgolly.roslib.mod.UrdfVisual {
      /**
        * A Visual element in a URDF.
        *
        * @constructor
        * @param options - object with following keys:
        *  * xml - the XML element to parse
        */
      def this(options: Xml) = this()
    }
    
    @JSGlobal("ROSLIB.Vector3")
    @js.native
    /**
      * A 3D vector.
      *
      * @constructor
      * @param options - object with following keys:
      *   * x - the x value
      *   * y - the y value
      *   * z - the z value
      */
    open class Vector3 ()
      extends typingsJapgolly.roslib.mod.Vector3 {
      def this(options: X) = this()
    }
  }
}
