package typingsJapgolly.uniApp

import typingsJapgolly.uniApp.uniAppStrings.`fade-in`
import typingsJapgolly.uniApp.uniAppStrings.`fade-out`
import typingsJapgolly.uniApp.uniAppStrings.`pop-in`
import typingsJapgolly.uniApp.uniAppStrings.`pop-out`
import typingsJapgolly.uniApp.uniAppStrings.`slide-in-bottom`
import typingsJapgolly.uniApp.uniAppStrings.`slide-in-left`
import typingsJapgolly.uniApp.uniAppStrings.`slide-in-right`
import typingsJapgolly.uniApp.uniAppStrings.`slide-in-top`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-bottom`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-left`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-right`
import typingsJapgolly.uniApp.uniAppStrings.`slide-out-top`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-fade-in`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-fade-out`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-in`
import typingsJapgolly.uniApp.uniAppStrings.`zoom-out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubNVue extends StObject {
  
  /**
    * 隐藏原生子窗体
    */
  def hide(): Unit = js.native
  def hide(
    options: `slide-out-right` | `slide-out-left` | `slide-out-top` | `slide-out-bottom` | `fade-out` | `zoom-in` | `zoom-fade-in` | `pop-out`
  ): Unit = js.native
  
  /**
    * 监听消息
    */
  def onMessage(): Unit = js.native
  def onMessage(success: js.Function0[Unit]): Unit = js.native
  
  /**
    * 发送消息
    */
  def postMessage(): Unit = js.native
  
  /**
    * 设置原生子窗体的样式
    */
  def setStyle(): Unit = js.native
  def setStyle(options: SubNVuesSetStyleOptions): Unit = js.native
  
  /**
    * 显示原生子窗体
    */
  def show(): Unit = js.native
  def show(
    options: `slide-in-right` | `slide-in-left` | `slide-in-top` | `slide-in-bottom` | `fade-in` | `zoom-out` | `zoom-fade-out` | `pop-in`
  ): Unit = js.native
}
