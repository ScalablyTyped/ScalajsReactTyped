package typingsJapgolly.wegameApi

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.wegameApi.wegameApiStrings.`2d`
import typingsJapgolly.wegameApi.wegameApiStrings.webgl
import typingsJapgolly.wegameApi.wx.types.RenderingContextConfig
import typingsJapgolly.wegameApi.wx.types.ToTempFileParams
import typingsJapgolly.wegameApi.wx.types.ToTempFileSyncParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Canvas extends StObject {
  
  /**
    * 获取画布对象的绘图上下文
    * @param contextType 上下文类型
    * @param contextAttributes webgl 上下文属性，仅当 contextType 为 webgl 时有效
    */
  def getContext(contextType: `2d` | webgl): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  def getContext(contextType: `2d` | webgl, contextAttributes: RenderingContextConfig): CanvasRenderingContext2D | WxWebGLRenderingContext = js.native
  
  /**
    * 画布的高度
    */
  var height: Double = js.native
  
  /**
    * 把画布上的绘制内容以一个 data URI 的格式返回
    */
  def toDataURL(): String = js.native
  
  /**
    * 将当前 Canvas 保存为一个临时文件，并生成相应的临时文件路径。
    */
  def toTempFilePath(p: ToTempFileParams): Unit = js.native
  
  /**
    * toTempFilePath 的同步版本
    */
  def toTempFilePathSync(p: ToTempFileSyncParams): String = js.native
  
  /**
    * 画布的宽度
    */
  var width: Double = js.native
}
