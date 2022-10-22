package typingsJapgolly.csstoolsPostcssCascadeLayers

import typingsJapgolly.csstoolsPostcssCascadeLayers.anon.Options
import typingsJapgolly.csstoolsPostcssCascadeLayers.distModelMod.Model
import typingsJapgolly.postcss.libNodeMod.ChildNode
import typingsJapgolly.postcss.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRecordLayerOrderMod {
  
  @JSImport("@csstools/postcss-cascade-layers/dist/record-layer-order", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recordLayerOrder(root: Container[ChildNode], model: Model, hasResultOptions: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordLayerOrder")(root.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasResultOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
