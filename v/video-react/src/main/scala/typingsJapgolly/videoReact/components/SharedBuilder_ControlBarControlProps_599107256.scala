package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.videoReact.mod.PlayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ControlBarControlProps_599107256 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def order(value: Double): this.type = set("order", value.asInstanceOf[js.Any])
  
  inline def player(value: /* props */ PlayerProps => Element): this.type = set("player", js.Any.fromFunction1(value))
}
