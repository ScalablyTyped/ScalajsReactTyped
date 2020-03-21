package typingsJapgolly.hexoUtil.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", "CacheStream")
@js.native
class CacheStream () extends Transform {
  def getCache(): Buffer = js.native
}

