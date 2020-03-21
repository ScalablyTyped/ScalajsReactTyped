package typingsJapgolly.vortexWebClient.DDS_

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDS.DataReaderQos")
@js.native
class DataReaderQos protected () extends EntityQos {
  /**
  		 * Creates any of the DDS entities quality of service, including DataReaderQos and DataWriterQos.
  		 *
  		 * @param policies - list of policies for the Qos entity
  		 */
  def this(policies: Policy*) = this()
}

@JSGlobal("DDS.DataReaderQos")
@js.native
object DataReaderQos extends TopLevel[EntityQos]

