package typingsJapgolly.recompose

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#wrapdisplayname
object wrapDisplayNameMod {
  
  @JSImport("recompose/wrapDisplayName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(component: ComponentType[Any], wrapperName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any], wrapperName.asInstanceOf[js.Any])).asInstanceOf[String]
}
