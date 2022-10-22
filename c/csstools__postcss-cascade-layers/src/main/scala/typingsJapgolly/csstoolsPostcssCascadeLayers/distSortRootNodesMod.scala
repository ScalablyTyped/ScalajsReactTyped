package typingsJapgolly.csstoolsPostcssCascadeLayers

import typingsJapgolly.csstoolsPostcssCascadeLayers.distModelMod.Model
import typingsJapgolly.postcss.libNodeMod.ChildNode
import typingsJapgolly.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSortRootNodesMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/sort-root-nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sortRootNodes(root: Container[ChildNode], model: Model): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortRootNodes")(root.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
