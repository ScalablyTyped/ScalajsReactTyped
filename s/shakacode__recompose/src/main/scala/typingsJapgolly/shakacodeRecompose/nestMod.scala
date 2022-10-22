package typingsJapgolly.shakacodeRecompose

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#nest
object nestMod {
  
  @JSImport("@shakacode/recompose/nest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Components: (String | ComponentType[Any])*): ComponentClassP[Any & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Components.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ComponentClassP[Any & js.Object]]
}
