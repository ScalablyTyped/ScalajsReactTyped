package typingsJapgolly.slateReact

import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.slateReact.anon.IsLast
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderLeafProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsLeafMod {
  
  @JSImport("slate-react/dist/components/leaf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/components/leaf", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ IsLast, Element]] = js.native
  
  inline def DefaultLeaf(props: RenderLeafProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultLeaf")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
