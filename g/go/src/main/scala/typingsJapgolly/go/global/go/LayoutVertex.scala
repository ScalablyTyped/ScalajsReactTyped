package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A vertex represents a node in a LayoutNetwork. It holds layout-specific data for the node. */
@JSGlobal("go.LayoutVertex")
@js.native
/**
  * This constructs a vertex that does not know about any Node.
  */
open class LayoutVertex ()
  extends typingsJapgolly.go.mod.LayoutVertex
object LayoutVertex {
  
  @JSGlobal("go.LayoutVertex")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This static function is used to compare the Part.text values of the .nodes of the argument LayoutVertexes.
    * @param {LayoutVertex} m
    * @param {LayoutVertex} n
    */
  /* static member */
  inline def smartComparer(m: typingsJapgolly.go.mod.LayoutVertex, n: typingsJapgolly.go.mod.LayoutVertex): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("smartComparer")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * This static function is used to compare the Part.text values of the .nodes of the argument LayoutVertexes.
    * @param {LayoutVertex} m
    * @param {LayoutVertex} n
    */
  /* static member */
  inline def standardComparer(m: typingsJapgolly.go.mod.LayoutVertex, n: typingsJapgolly.go.mod.LayoutVertex): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("standardComparer")(m.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
}
