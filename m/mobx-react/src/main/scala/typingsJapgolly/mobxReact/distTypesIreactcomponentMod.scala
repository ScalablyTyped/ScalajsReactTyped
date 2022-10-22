package typingsJapgolly.mobxReact

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIreactcomponentMod {
  
  type IReactComponent[P] = ClassicComponentClass[P] | (ComponentClassP[P & js.Object]) | FunctionComponent[P] | ForwardRefExoticComponent[P]
}
