package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetRenderPropValueMod {
  
  @JSImport("antd/lib/_util/getRenderPropValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRenderPropValue(): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")().asInstanceOf[Node]
  inline def getRenderPropValue(propValue: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def getRenderPropValue(propValue: RenderFunction): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getRenderPropValue")(propValue.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  type RenderFunction = js.Function0[Node]
}
