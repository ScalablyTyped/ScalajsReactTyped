package typingsJapgolly.cswAasJs.authContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default state for AuthContextProvider
  * @type {{auth: undefined, login: (function(): boolean), logout: (function(): boolean)}}
  */
@JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContextDefaultState")
@js.native
object AuthContextDefaultState extends js.Object {
  var auth: Null = js.native
  def login(): Unit = js.native
  def logout(): Unit = js.native
}

