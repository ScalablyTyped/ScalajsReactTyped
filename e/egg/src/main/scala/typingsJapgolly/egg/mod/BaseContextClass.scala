package typingsJapgolly.egg.mod

import typingsJapgolly.eggLogger.mod.EggLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends typingsJapgolly.eggCore.mod.BaseContextClass[Context, Application, EggAppConfig, IService] {
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}

