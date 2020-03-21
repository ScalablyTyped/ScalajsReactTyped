package typingsJapgolly.openpgp.mod.crypto

import typingsJapgolly.openpgp.mod.Integer
import typingsJapgolly.openpgp.mod.`type`.mpi.MPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "crypto.random")
@js.native
object random extends js.Object {
  /**
    * Buffer for secure random numbers
    */
  def RandomBuffer(): Unit = js.native
  /**
    * Create a secure random MPI that is greater than or equal to min and less than max.
    * @param min Lower bound, included
    * @param max Upper bound, excluded
    * @returns Random MPI
    */
  def getRandomBN(min: MPI, max: MPI): js.Any = js.native
  /**
    * Retrieve secure random byte array of the specified length
    * @param length Length in bytes to generate
    * @returns Random byte array
    */
  def getRandomBytes(length: Integer): scala.scalajs.js.typedarray.Uint8Array = js.native
}

