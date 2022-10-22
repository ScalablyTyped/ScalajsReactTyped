package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Link is a Part that connects Nodes.
  * The link relationship is directional, going from Link.fromNode to Link.toNode.
  * A link can connect to a specific port element in a node, as named by the Link.fromPortId
  * and Link.toPortId properties.
  */
@JSGlobal("go.Link")
@js.native
/**
  * Constructs an empty link that does not connect any nodes.
  */
open class Link ()
  extends typingsJapgolly.go.mod.Link
object Link {
  
  @JSGlobal("go.Link")
  @js.native
  val ^ : js.Any = js.native
  
  /**Used as a value for Link.routing: each segment is horizontal or vertical, but the route tries to avoid crossing over nodes.*/
  /* static member */
  @JSGlobal("go.Link.AvoidsNodes")
  @js.native
  def AvoidsNodes: typingsJapgolly.go.mod.EnumValue = js.native
  inline def AvoidsNodes_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AvoidsNodes")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that the link path uses Bezier curve segments.*/
  /* static member */
  @JSGlobal("go.Link.Bezier")
  @js.native
  def Bezier: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Bezier_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Bezier")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should keep the intermediate points of the previous route, just modifying the first and/or last points; if the routing is orthogonal, it will only modify the first two and/or last two points.*/
  /* static member */
  @JSGlobal("go.Link.End")
  @js.native
  def End: typingsJapgolly.go.mod.EnumValue = js.native
  inline def End_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("End")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will be discontinuous where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  /* static member */
  @JSGlobal("go.Link.JumpGap")
  @js.native
  def JumpGap: typingsJapgolly.go.mod.EnumValue = js.native
  inline def JumpGap_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JumpGap")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will veer around where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  /* static member */
  @JSGlobal("go.Link.JumpOver")
  @js.native
  def JumpOver: typingsJapgolly.go.mod.EnumValue = js.native
  inline def JumpOver_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JumpOver")(x.asInstanceOf[js.Any])
  
  /**This is the default value for Link.curve and Link.adjusting, to indicate that the path geometry consists of straight line segments and to indicate that the link route computation does not depend on any previous route points; this can also be used as a value for GraphObject.segmentOrientation to indicate that the object is never rotated along the link route -- its angle is unchanged.*/
  /* static member */
  @JSGlobal("go.Link.None")
  @js.native
  def None: typingsJapgolly.go.mod.EnumValue = js.native
  inline def None_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /**Used as the default value for Link.routing: the route goes fairly straight between ports.*/
  /* static member */
  @JSGlobal("go.Link.Normal")
  @js.native
  def Normal: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Normal_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Normal")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route: the GraphObject's angle is always the same as the angle of the link's route at the segment where the GraphObject is attached; use this orientation for arrow heads.*/
  /* static member */
  @JSGlobal("go.Link.OrientAlong")
  @js.native
  def OrientAlong: typingsJapgolly.go.mod.EnumValue = js.native
  inline def OrientAlong_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientAlong")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject being turned counter-clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSGlobal("go.Link.OrientMinus90")
  @js.native
  def OrientMinus90: typingsJapgolly.go.mod.EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned counter-clockwise to be perpendicular to the route, just like Link.OrientMinus90, but is never upside down: the GraphObject's angle always being 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSGlobal("go.Link.OrientMinus90Upright")
  @js.native
  def OrientMinus90Upright: typingsJapgolly.go.mod.EnumValue = js.native
  inline def OrientMinus90Upright_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientMinus90Upright")(x.asInstanceOf[js.Any])
  
  inline def OrientMinus90_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientMinus90")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always being 180 degrees opposite from the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSGlobal("go.Link.OrientOpposite")
  @js.native
  def OrientOpposite: typingsJapgolly.go.mod.EnumValue = js.native
  inline def OrientOpposite_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientOpposite")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject is turned clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached.*/
  /* static member */
  @JSGlobal("go.Link.OrientPlus90")
  @js.native
  def OrientPlus90: typingsJapgolly.go.mod.EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned clockwise to be perpendicular to the route, just like Link.OrientPlus90, but is never upside down: the GraphObject's angle always being 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSGlobal("go.Link.OrientPlus90Upright")
  @js.native
  def OrientPlus90Upright: typingsJapgolly.go.mod.EnumValue = js.native
  inline def OrientPlus90Upright_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientPlus90Upright")(x.asInstanceOf[js.Any])
  
  inline def OrientPlus90_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientPlus90")(x.asInstanceOf[js.Any])
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route, just like Link.OrientAlong, but is never upside down: the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSGlobal("go.Link.OrientUpright")
  @js.native
  def OrientUpright: typingsJapgolly.go.mod.EnumValue = js.native
  
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached, but never upside down and never angled more than +/- 45 degrees: when the route's angle is within 45 degrees of vertical (90 or 270 degrees), the GraphObject's angle is set to zero; this is typically only used for TextBlocks or Panels that contain text.*/
  /* static member */
  @JSGlobal("go.Link.OrientUpright45")
  @js.native
  def OrientUpright45: typingsJapgolly.go.mod.EnumValue = js.native
  inline def OrientUpright45_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientUpright45")(x.asInstanceOf[js.Any])
  
  inline def OrientUpright_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OrientUpright")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.routing: each segment is horizontal or vertical.*/
  /* static member */
  @JSGlobal("go.Link.Orthogonal")
  @js.native
  def Orthogonal: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Orthogonal_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Orthogonal")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should scale and rotate the intermediate points so that the link's shape looks approximately the same; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  /* static member */
  @JSGlobal("go.Link.Scale")
  @js.native
  def Scale: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Scale_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scale")(x.asInstanceOf[js.Any])
  
  /**Used as a value for Link.adjusting, to indicate that the link route computation should linearly interpolate the intermediate points so that the link's shape looks stretched; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  /* static member */
  @JSGlobal("go.Link.Stretch")
  @js.native
  def Stretch: typingsJapgolly.go.mod.EnumValue = js.native
  inline def Stretch_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stretch")(x.asInstanceOf[js.Any])
}
