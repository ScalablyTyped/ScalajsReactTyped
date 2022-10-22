package typingsJapgolly.createReactClass

import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def createReactClass[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.Dynamic.global.applyDynamic("createReactClass")(spec.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
}
