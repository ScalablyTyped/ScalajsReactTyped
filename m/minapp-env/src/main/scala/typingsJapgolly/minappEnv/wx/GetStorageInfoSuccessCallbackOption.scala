package typingsJapgolly.minappEnv.wx

import typingsJapgolly.minappEnv.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageInfoSuccessCallbackOption extends js.Object {
  /** 当前占用的空间大小, 单位 KB */
  var currentSize: Double
  /** 当前 storage 中所有的 key */
  var keys: Array[String]
  /** 限制的空间大小，单位 KB */
  var limitSize: Double
}

object GetStorageInfoSuccessCallbackOption {
  @scala.inline
  def apply(currentSize: Double, keys: Array[String], limitSize: Double): GetStorageInfoSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStorageInfoSuccessCallbackOption]
  }
}

