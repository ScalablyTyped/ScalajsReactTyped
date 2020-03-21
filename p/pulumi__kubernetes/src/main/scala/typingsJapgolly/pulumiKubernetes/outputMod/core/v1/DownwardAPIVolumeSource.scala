package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API
  * volumes support ownership management and SELinux relabeling.
  */
trait DownwardAPIVolumeSource extends js.Object {
  /**
    * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Defaults to 0644. Directories within the path are not affected by this setting. This might
    * be in conflict with other options that affect the file mode, like fsGroup, and the result
    * can be other mode bits set.
    */
  val defaultMode: Double
  /**
    * Items is a list of downward API volume file
    */
  val items: js.Array[DownwardAPIVolumeFile]
}

object DownwardAPIVolumeSource {
  @scala.inline
  def apply(defaultMode: Double, items: js.Array[DownwardAPIVolumeFile]): DownwardAPIVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownwardAPIVolumeSource]
  }
}

