package typingsJapgolly.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，保存文件或目录的状态信息对象
  * 可通过DirectoryEntry或FileEntry对象的getMetaData方法获取
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
  */
trait PlusIoMetadata extends js.Object {
  /**
    * 包含的子目录数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var directoryCount: js.UndefOr[Double] = js.undefined
  /**
    * 目录的文件数
    * 若自身是文件则其值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var fileCount: js.UndefOr[Double] = js.undefined
  /**
    * 文件或目录的最后修改时间
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var modificationTime: js.UndefOr[js.Date] = js.undefined
  /**
    * 文件的大小
    * 若获取的是目录对象的属性则值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  var size: js.UndefOr[Double] = js.undefined
}

object PlusIoMetadata {
  @scala.inline
  def apply(
    directoryCount: Int | Double = null,
    fileCount: Int | Double = null,
    modificationTime: js.Date = null,
    size: Int | Double = null
  ): PlusIoMetadata = {
    val __obj = js.Dynamic.literal()
    if (directoryCount != null) __obj.updateDynamic("directoryCount")(directoryCount.asInstanceOf[js.Any])
    if (fileCount != null) __obj.updateDynamic("fileCount")(fileCount.asInstanceOf[js.Any])
    if (modificationTime != null) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusIoMetadata]
  }
}

