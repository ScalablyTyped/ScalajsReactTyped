package typingsJapgolly.createReactClass

import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  
  @JSImport("create-react-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
