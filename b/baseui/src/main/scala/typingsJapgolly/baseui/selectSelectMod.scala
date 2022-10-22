package typingsJapgolly.baseui

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.baseui.anon.TypeofSelectComponent
import typingsJapgolly.baseui.selectTypesMod.SelectProps
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSelectMod {
  
  @JSImport("baseui/select/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    props: ComponentProps[
      (Instantiable1[/* props */ SelectProps, typingsJapgolly.baseui.selectSelectComponentMod.default]) & TypeofSelectComponent
    ]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
