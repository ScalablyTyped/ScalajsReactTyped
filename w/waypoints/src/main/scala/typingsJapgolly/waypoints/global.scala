package typingsJapgolly.waypoints

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.waypoints.anon.Adapter
import typingsJapgolly.waypoints.anon.Horizontal
import typingsJapgolly.waypoints.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Waypoint")
  @js.native
  open class Waypoint protected ()
    extends StObject
       with typingsJapgolly.waypoints.Waypoint {
    def this(options: WaypointOptions) = this()
    
    // properties
    /* CompleteClass */
    var adapter: typingsJapgolly.waypoints.WaypointAdapter = js.native
    
    /* CompleteClass */
    var context: typingsJapgolly.waypoints.WaypointContext = js.native
    
    // Instance Methods
    /* CompleteClass */
    override def destroy(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    override def disable(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    /* CompleteClass */
    override def enable(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    var group: typingsJapgolly.waypoints.WaypointGroup = js.native
    
    /* CompleteClass */
    override def next(): typingsJapgolly.waypoints.Waypoint | String = js.native
    
    /* CompleteClass */
    var options: WaypointOptions = js.native
    
    // actually `null` not string
    /* CompleteClass */
    override def previous(): typingsJapgolly.waypoints.Waypoint | String = js.native
    
    /* CompleteClass */
    var triggerPoint: Double = js.native
  }
  object Waypoint {
    
    @JSGlobal("Waypoint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Waypoint.Adapter")
    @js.native
    def Adapter: typingsJapgolly.waypoints.WaypointAdapter = js.native
    inline def Adapter_=(x: typingsJapgolly.waypoints.WaypointAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Adapter")(x.asInstanceOf[js.Any])
    
    // Waypoint.Context
    /* static member */
    object Context {
      
      @JSGlobal("Waypoint.Context")
      @js.native
      val ^ : js.Any = js.native
      
      inline def findByElement(element: HTMLElement): js.UndefOr[typingsJapgolly.waypoints.WaypointContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("findByElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.waypoints.WaypointContext]]
    }
    
    /* static member */
    object adapters {
      
      @JSGlobal("Waypoint.adapters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Waypoint.adapters.push")
      @js.native
      def push: Adapter = js.native
      inline def push_=(x: Adapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
    }
    
    // actually `null` not string
    // Class Methods
    /* static member */
    inline def destroyAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyAll")().asInstanceOf[Unit]
    
    /* static member */
    inline def disableAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableAll")().asInstanceOf[Unit]
    
    /* static member */
    inline def enableAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAll")().asInstanceOf[Unit]
    
    /* static member */
    inline def refreshAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshAll")().asInstanceOf[Unit]
    
    /* static member */
    inline def viewportHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("viewportHeight")().asInstanceOf[Double]
    
    /* static member */
    inline def viewportWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("viewportWidth")().asInstanceOf[Double]
  }
  
  @JSGlobal("WaypointAdapter")
  @js.native
  open class WaypointAdapter protected ()
    extends StObject
       with typingsJapgolly.waypoints.WaypointAdapter {
    def this(element: HTMLElement) = this()
    
    /* CompleteClass */
    override def innerHeight(): Double = js.native
    
    /* CompleteClass */
    override def innerWidth(): Double = js.native
    
    /* CompleteClass */
    override def off(event: String): Unit = js.native
    
    /* CompleteClass */
    override def offset(): Left = js.native
    
    /* CompleteClass */
    override def on(event: String, handler: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def outerHeight(includeMargin: Boolean): Double = js.native
    
    /* CompleteClass */
    override def outerWidth(includeMargin: Boolean): Double = js.native
    
    /* CompleteClass */
    override def scrollLeft(): Double = js.native
    
    /* CompleteClass */
    override def scrollTop(): Double = js.native
  }
  object WaypointAdapter {
    
    @JSGlobal("WaypointAdapter")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def extend(objects: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    /* static member */
    inline def inArray(value: Any, array: js.Array[Any], startIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* static member */
    inline def isEmptyObject(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("WaypointContext")
  @js.native
  open class WaypointContext ()
    extends StObject
       with typingsJapgolly.waypoints.WaypointContext {
    
    /* CompleteClass */
    var adapter: typingsJapgolly.waypoints.WaypointAdapter = js.native
    
    // http://imakewebthings.com/waypoints/api/context/#waypoints-property
    /* CompleteClass */
    override def destroy(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    var element: HTMLElement | Window = js.native
    
    /* CompleteClass */
    override def refresh(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    var waypoints: Horizontal = js.native
  }
  
  @JSGlobal("WaypointGroup")
  @js.native
  open class WaypointGroup ()
    extends StObject
       with typingsJapgolly.waypoints.WaypointGroup {
    
    /* CompleteClass */
    var axis: String = js.native
    
    /* CompleteClass */
    override def first(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    override def last(): typingsJapgolly.waypoints.Waypoint = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var waypoints: js.Array[typingsJapgolly.waypoints.Waypoint] = js.native
  }
}
