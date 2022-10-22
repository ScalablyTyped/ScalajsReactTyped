package typingsJapgolly.amapJsApi.global.AMap

import org.scalajs.dom.HTMLElement
import typingsJapgolly.amapJsApi.AMap.Map.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Map")
@js.native
open class Map protected ()
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.Map {
  /**
    * 构造一个地图对象
    * @param container 地图容器的id或者是DOM元素
    * @param opts 选项
    */
  def this(container: String) = this()
  def this(container: HTMLElement) = this()
  def this(container: String, opts: Options) = this()
  def this(container: HTMLElement, opts: Options) = this()
}
