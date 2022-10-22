package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pixiCore.mod.Buffer2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Geometry")
@js.native
/**
  * @param buffers - An array of buffers. optional.
  * @param attributes - Of the geometry, optional structure of the attributes layout
  */
open class Geometry ()
  extends typingsJapgolly.pixiCore.mod.Geometry {
  def this(buffers: js.Array[Buffer2]) = this()
  def this(buffers: js.Array[Buffer2], attributes: StringDictionary[typingsJapgolly.pixiCore.mod.Attribute]) = this()
  def this(buffers: Unit, attributes: StringDictionary[typingsJapgolly.pixiCore.mod.Attribute]) = this()
}
/* static members */
object Geometry {
  
  @JSImport("pixi.js", "Geometry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Merges an array of geometries into a new single one.
    *
    * Geometry attribute styles must match for this operation to work.
    * @param geometries - array of geometries to merge
    * @returns - Shiny new geometry!
    */
  inline def merge(geometries: js.Array[typingsJapgolly.pixiCore.mod.Geometry]): typingsJapgolly.pixiCore.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometries.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.Geometry]
}
