package typingsJapgolly.slateReact

import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.slateReact.anon.Decorations
import typingsJapgolly.slateReact.distComponentsEditableMod.RenderElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsElementMod {
  
  @JSImport("slate-react/dist/components/element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("slate-react/dist/components/element", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Decorations, Element]] = js.native
  
  inline def DefaultElement(props: RenderElementProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultElement")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
