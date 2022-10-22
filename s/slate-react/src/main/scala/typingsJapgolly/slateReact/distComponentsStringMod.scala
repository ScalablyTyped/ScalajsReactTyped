package typingsJapgolly.slateReact

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.slateReact.anon.IsLineBreak
import typingsJapgolly.slateReact.anon.Leaf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsStringMod {
  
  @JSImport("slate-react/dist/components/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Leaf content strings.
    */
  inline def default(props: Leaf): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ZeroWidthString(props: IsLineBreak): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ZeroWidthString")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
