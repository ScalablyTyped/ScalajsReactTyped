package typingsJapgolly.unistUtilInspect

import typingsJapgolly.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-inspect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspect(tree: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspect(tree: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inspectColor(tree: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectColor")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspectColor(tree: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspectColor")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def inspectNoColor(node: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspectNoColor")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def inspectNoColor(node: Any, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspectNoColor")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type InspectOptions = Options
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  trait Options extends StObject {
    
    var showPositions: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setShowPositions(value: Boolean): Self = StObject.set(x, "showPositions", value.asInstanceOf[js.Any])
      
      inline def setShowPositionsUndefined: Self = StObject.set(x, "showPositions", js.undefined)
    }
  }
  
  type Point = typingsJapgolly.unist.mod.Point
  
  type Position = typingsJapgolly.unist.mod.Position
}
