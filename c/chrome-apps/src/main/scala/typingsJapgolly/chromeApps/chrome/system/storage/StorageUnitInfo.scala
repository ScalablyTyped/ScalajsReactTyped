package typingsJapgolly.chromeApps.chrome.system.storage

import typingsJapgolly.chromeApps.AnonFIXED
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.fixed
import typingsJapgolly.chromeApps.chromeAppsStrings.removable
import typingsJapgolly.chromeApps.chromeAppsStrings.unknown_
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageUnitInfo extends js.Object {
  /** The total amount of the storage space, in bytes. */
  var capacity: integer
  /**
    * The transient ID that uniquely identifies the storage device.
    * This ID will be persistent within the same run of a single application.
    * It will not be a persistent identifier between different runs of an application, or between different applications.
    */
  var id: String
  /** The name of the storage unit. */
  var name: String
  /**
    * The media type of the storage unit.
    * fixed: The storage has fixed media, e.g. hard disk or SSD.
    * removable: The storage is removable, e.g. USB flash drive.
    * unknown: The storage type is unknown.
    * @see enum StorageUnitType
    */
  var `type`: ToStringLiteral[AnonFIXED, String, Exclude[String, fixed | removable | unknown_]]
}

object StorageUnitInfo {
  @scala.inline
  def apply(
    capacity: integer,
    id: String,
    name: String,
    `type`: ToStringLiteral[AnonFIXED, String, Exclude[String, fixed | removable | unknown_]]
  ): StorageUnitInfo = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageUnitInfo]
  }
}

