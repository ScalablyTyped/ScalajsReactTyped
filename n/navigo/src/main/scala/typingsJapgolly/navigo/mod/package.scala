package typingsJapgolly.navigo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Keys = java.lang.String
  type Params = typingsJapgolly.navigo.mod.State
  type RouteHandler = (js.Function2[
    /* params */ typingsJapgolly.navigo.mod.Params, 
    /* query */ java.lang.String, 
    scala.Unit
  ]) | typingsJapgolly.navigo.AnonAs
  type State = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in navigo.navigo.Keys ]: any}
    */ typingsJapgolly.navigo.navigoStrings.State with js.Any
}
