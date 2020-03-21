package typingsJapgolly.protractor

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.seleniumWebdriver.remoteMod.DriverService.Builder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDriverService extends js.Object {
  /**
    * Creates {@link DriverService} objects that manage a WebDriver server in a
    * child process.
    */
  var Builder: Instantiable1[
    /* exe */ String, 
    typingsJapgolly.seleniumWebdriver.remoteMod.DriverService.Builder
  ]
}

object TypeofDriverService {
  @scala.inline
  def apply(Builder: Instantiable1[/* exe */ String, Builder]): TypeofDriverService = {
    val __obj = js.Dynamic.literal(Builder = Builder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofDriverService]
  }
}

