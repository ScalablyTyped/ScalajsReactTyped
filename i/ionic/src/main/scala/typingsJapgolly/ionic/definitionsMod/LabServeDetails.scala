package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabServeDetails extends js.Object {
  var address: String
  var port: Double
  var projectType: ProjectType
}

object LabServeDetails {
  @scala.inline
  def apply(address: String, port: Double, projectType: ProjectType): LabServeDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabServeDetails]
  }
}

