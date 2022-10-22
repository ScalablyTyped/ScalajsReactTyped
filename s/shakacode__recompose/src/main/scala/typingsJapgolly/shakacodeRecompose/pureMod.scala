package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#pure
object pureMod {
  
  @JSImport("@shakacode/recompose/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](component: ComponentType[TProps]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
}
