package typingsJapgolly.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.drivelist.drivelistStrings.SATA
  - typingsJapgolly.drivelist.drivelistStrings.SCSI
  - typingsJapgolly.drivelist.drivelistStrings.ATA
  - typingsJapgolly.drivelist.drivelistStrings.IDE
  - typingsJapgolly.drivelist.drivelistStrings.PCI
  - typingsJapgolly.drivelist.drivelistStrings.UNKNOWN
*/
trait BusType extends js.Object

object BusType {
  @scala.inline
  def ATA: typingsJapgolly.drivelist.drivelistStrings.ATA = this.cast("ATA")
  @scala.inline
  def IDE: typingsJapgolly.drivelist.drivelistStrings.IDE = this.cast("IDE")
  @scala.inline
  def PCI: typingsJapgolly.drivelist.drivelistStrings.PCI = this.cast("PCI")
  @scala.inline
  def SATA: typingsJapgolly.drivelist.drivelistStrings.SATA = this.cast("SATA")
  @scala.inline
  def SCSI: typingsJapgolly.drivelist.drivelistStrings.SCSI = this.cast("SCSI")
  @scala.inline
  def UNKNOWN: typingsJapgolly.drivelist.drivelistStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

